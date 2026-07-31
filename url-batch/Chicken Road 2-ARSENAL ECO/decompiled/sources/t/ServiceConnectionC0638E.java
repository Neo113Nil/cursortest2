package t;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import c.C0267a;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: t.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC0638E implements Handler.Callback, ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5892a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f5893b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f5894c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public HashSet f5895d = new HashSet();

    public ServiceConnectionC0638E(Context context) {
        this.f5892a = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f5893b = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(C0637D c0637d) {
        boolean z5;
        ComponentName componentName = c0637d.f5887a;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Processing component " + componentName + ", " + c0637d.f5890d.size() + " queued tasks");
        }
        ArrayDeque arrayDeque = c0637d.f5890d;
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (c0637d.f5888b) {
            z5 = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.f5892a;
            boolean bindService = context.bindService(component, this, 33);
            c0637d.f5888b = bindService;
            if (bindService) {
                c0637d.f5891e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                context.unbindService(this);
            }
            z5 = c0637d.f5888b;
        }
        if (!z5 || c0637d.f5889c == null) {
            b(c0637d);
            return;
        }
        while (true) {
            C0635B c0635b = (C0635B) arrayDeque.peek();
            if (c0635b == null) {
                break;
            }
            try {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Sending task " + c0635b);
                }
                c0635b.a(c0637d.f5889c);
                arrayDeque.remove();
            } catch (DeadObjectException unused) {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Remote service has died: " + componentName);
                }
            } catch (RemoteException e4) {
                Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e4);
            }
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        b(c0637d);
    }

    public final void b(C0637D c0637d) {
        ComponentName componentName = c0637d.f5887a;
        ArrayDeque arrayDeque = c0637d.f5890d;
        Handler handler = this.f5893b;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i7 = c0637d.f5891e;
        int i8 = i7 + 1;
        c0637d.f5891e = i8;
        if (i8 <= 6) {
            int i9 = (1 << i7) * 1000;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Scheduling retry for " + i9 + " ms");
            }
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i9);
            return;
        }
        Log.w("NotifManCompat", "Giving up on delivering " + arrayDeque.size() + " tasks to " + componentName + " after " + c0637d.f5891e + " retries");
        arrayDeque.clear();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i7 = message.what;
        c.c cVar = null;
        if (i7 == 0) {
            C0635B c0635b = (C0635B) message.obj;
            String string = Settings.Secure.getString(this.f5892a.getContentResolver(), "enabled_notification_listeners");
            synchronized (C0639F.f5896c) {
                if (string != null) {
                    try {
                        if (!string.equals(C0639F.f5897d)) {
                            String[] split = string.split(":", -1);
                            HashSet hashSet2 = new HashSet(split.length);
                            for (String str : split) {
                                ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                                if (unflattenFromString != null) {
                                    hashSet2.add(unflattenFromString.getPackageName());
                                }
                            }
                            C0639F.f5898e = hashSet2;
                            C0639F.f5897d = string;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                hashSet = C0639F.f5898e;
            }
            if (!hashSet.equals(this.f5895d)) {
                this.f5895d = hashSet;
                List<ResolveInfo> queryIntentServices = this.f5892a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet hashSet3 = new HashSet();
                for (ResolveInfo resolveInfo : queryIntentServices) {
                    if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                        } else {
                            hashSet3.add(componentName);
                        }
                    }
                }
                Iterator it = hashSet3.iterator();
                while (it.hasNext()) {
                    ComponentName componentName2 = (ComponentName) it.next();
                    if (!this.f5894c.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                        }
                        this.f5894c.put(componentName2, new C0637D(componentName2));
                    }
                }
                Iterator it2 = this.f5894c.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                        }
                        C0637D c0637d = (C0637D) entry.getValue();
                        if (c0637d.f5888b) {
                            this.f5892a.unbindService(this);
                            c0637d.f5888b = false;
                        }
                        c0637d.f5889c = null;
                        it2.remove();
                    }
                }
            }
            for (C0637D c0637d2 : this.f5894c.values()) {
                c0637d2.f5890d.add(c0635b);
                a(c0637d2);
            }
        } else if (i7 == 1) {
            C0636C c0636c = (C0636C) message.obj;
            ComponentName componentName3 = c0636c.f5885a;
            IBinder iBinder = c0636c.f5886b;
            C0637D c0637d3 = (C0637D) this.f5894c.get(componentName3);
            if (c0637d3 != null) {
                int i8 = c.b.f3748d;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface(c.c.f3749c);
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof c.c)) {
                        C0267a c0267a = new C0267a();
                        c0267a.f3747d = iBinder;
                        cVar = c0267a;
                    } else {
                        cVar = (c.c) queryLocalInterface;
                    }
                }
                c0637d3.f5889c = cVar;
                c0637d3.f5891e = 0;
                a(c0637d3);
                return true;
            }
        } else if (i7 == 2) {
            C0637D c0637d4 = (C0637D) this.f5894c.get((ComponentName) message.obj);
            if (c0637d4 != null) {
                if (c0637d4.f5888b) {
                    this.f5892a.unbindService(this);
                    c0637d4.f5888b = false;
                }
                c0637d4.f5889c = null;
                return true;
            }
        } else {
            if (i7 != 3) {
                return false;
            }
            C0637D c0637d5 = (C0637D) this.f5894c.get((ComponentName) message.obj);
            if (c0637d5 != null) {
                a(c0637d5);
                return true;
            }
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Connected to service " + componentName);
        }
        this.f5893b.obtainMessage(1, new C0636C(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.f5893b.obtainMessage(2, componentName).sendToTarget();
    }
}
