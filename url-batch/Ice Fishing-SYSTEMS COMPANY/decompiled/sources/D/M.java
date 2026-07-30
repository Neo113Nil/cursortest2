package D;

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
import c.C0536a;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class M implements Handler.Callback, ServiceConnection {

    /* renamed from: n, reason: collision with root package name */
    public final Context f506n;

    /* renamed from: u, reason: collision with root package name */
    public final Handler f507u;

    /* renamed from: v, reason: collision with root package name */
    public final HashMap f508v = new HashMap();

    /* renamed from: w, reason: collision with root package name */
    public HashSet f509w = new HashSet();

    public M(Context context) {
        this.f506n = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f507u = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(L l9) {
        boolean z8;
        ArrayDeque arrayDeque;
        boolean isLoggable = Log.isLoggable("NotifManCompat", 3);
        ComponentName componentName = l9.f501a;
        if (isLoggable) {
            Log.d("NotifManCompat", "Processing component " + componentName + ", " + l9.f504d.size() + " queued tasks");
        }
        if (l9.f504d.isEmpty()) {
            return;
        }
        if (l9.f502b) {
            z8 = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.f506n;
            boolean bindService = context.bindService(component, this, 33);
            l9.f502b = bindService;
            if (bindService) {
                l9.f505e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                context.unbindService(this);
            }
            z8 = l9.f502b;
        }
        if (!z8 || l9.f503c == null) {
            b(l9);
            return;
        }
        while (true) {
            arrayDeque = l9.f504d;
            J j9 = (J) arrayDeque.peek();
            if (j9 == null) {
                break;
            }
            try {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Sending task " + j9);
                }
                j9.a(l9.f503c);
                arrayDeque.remove();
            } catch (DeadObjectException unused) {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Remote service has died: " + componentName);
                }
            } catch (RemoteException e6) {
                Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e6);
            }
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        b(l9);
    }

    public final void b(L l9) {
        Handler handler = this.f507u;
        ComponentName componentName = l9.f501a;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i = l9.f505e;
        int i4 = i + 1;
        l9.f505e = i4;
        if (i4 <= 6) {
            int i9 = (1 << i) * 1000;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Scheduling retry for " + i9 + " ms");
            }
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i9);
            return;
        }
        StringBuilder sb = new StringBuilder("Giving up on delivering ");
        ArrayDeque arrayDeque = l9.f504d;
        sb.append(arrayDeque.size());
        sb.append(" tasks to ");
        sb.append(componentName);
        sb.append(" after ");
        sb.append(l9.f505e);
        sb.append(" retries");
        Log.w("NotifManCompat", sb.toString());
        arrayDeque.clear();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i = message.what;
        c.c cVar = null;
        if (i == 0) {
            J j9 = (J) message.obj;
            String string = Settings.Secure.getString(this.f506n.getContentResolver(), "enabled_notification_listeners");
            synchronized (N.f510c) {
                if (string != null) {
                    try {
                        if (!string.equals(N.f511d)) {
                            String[] split = string.split(":", -1);
                            HashSet hashSet2 = new HashSet(split.length);
                            for (String str : split) {
                                ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                                if (unflattenFromString != null) {
                                    hashSet2.add(unflattenFromString.getPackageName());
                                }
                            }
                            N.f512e = hashSet2;
                            N.f511d = string;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                hashSet = N.f512e;
            }
            if (!hashSet.equals(this.f509w)) {
                this.f509w = hashSet;
                List<ResolveInfo> queryIntentServices = this.f506n.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
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
                    if (!this.f508v.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                        }
                        this.f508v.put(componentName2, new L(componentName2));
                    }
                }
                Iterator it2 = this.f508v.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                        }
                        L l9 = (L) entry.getValue();
                        if (l9.f502b) {
                            this.f506n.unbindService(this);
                            l9.f502b = false;
                        }
                        l9.f503c = null;
                        it2.remove();
                    }
                }
            }
            for (L l10 : this.f508v.values()) {
                l10.f504d.add(j9);
                a(l10);
            }
        } else if (i == 1) {
            K k6 = (K) message.obj;
            ComponentName componentName3 = k6.f499a;
            IBinder iBinder = k6.f500b;
            L l11 = (L) this.f508v.get(componentName3);
            if (l11 != null) {
                int i4 = c.b.f5632n;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface(c.c.f5633k0);
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof c.c)) {
                        C0536a c0536a = new C0536a();
                        c0536a.f5631n = iBinder;
                        cVar = c0536a;
                    } else {
                        cVar = (c.c) queryLocalInterface;
                    }
                }
                l11.f503c = cVar;
                l11.f505e = 0;
                a(l11);
                return true;
            }
        } else if (i == 2) {
            L l12 = (L) this.f508v.get((ComponentName) message.obj);
            if (l12 != null) {
                if (l12.f502b) {
                    this.f506n.unbindService(this);
                    l12.f502b = false;
                }
                l12.f503c = null;
                return true;
            }
        } else {
            if (i != 3) {
                return false;
            }
            L l13 = (L) this.f508v.get((ComponentName) message.obj);
            if (l13 != null) {
                a(l13);
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
        this.f507u.obtainMessage(1, new K(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.f507u.obtainMessage(2, componentName).sendToTarget();
    }
}
