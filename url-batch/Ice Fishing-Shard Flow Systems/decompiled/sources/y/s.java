package y;

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
import c.AbstractBinderC0283b;
import c.C0282a;
import c.InterfaceC0284c;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class s implements Handler.Callback, ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8511a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f8512b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f8513c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public HashSet f8514d = new HashSet();

    public s(Context context) {
        this.f8511a = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f8512b = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(r rVar) {
        boolean z7;
        ComponentName componentName = rVar.f8506a;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Processing component " + componentName + ", " + rVar.f8509d.size() + " queued tasks");
        }
        ArrayDeque arrayDeque = rVar.f8509d;
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (rVar.f8507b) {
            z7 = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.f8511a;
            boolean bindService = context.bindService(component, this, 33);
            rVar.f8507b = bindService;
            if (bindService) {
                rVar.f8510e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                context.unbindService(this);
            }
            z7 = rVar.f8507b;
        }
        if (!z7 || rVar.f8508c == null) {
            b(rVar);
            return;
        }
        while (true) {
            p pVar = (p) arrayDeque.peek();
            if (pVar == null) {
                break;
            }
            try {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Sending task " + pVar);
                }
                pVar.a(rVar.f8508c);
                arrayDeque.remove();
            } catch (DeadObjectException unused) {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Remote service has died: " + componentName);
                }
            } catch (RemoteException e7) {
                Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e7);
            }
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        b(rVar);
    }

    public final void b(r rVar) {
        ComponentName componentName = rVar.f8506a;
        ArrayDeque arrayDeque = rVar.f8509d;
        Handler handler = this.f8512b;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i2 = rVar.f8510e;
        int i5 = i2 + 1;
        rVar.f8510e = i5;
        if (i5 <= 6) {
            int i7 = (1 << i2) * 1000;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Scheduling retry for " + i7 + " ms");
            }
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i7);
            return;
        }
        Log.w("NotifManCompat", "Giving up on delivering " + arrayDeque.size() + " tasks to " + componentName + " after " + rVar.f8510e + " retries");
        arrayDeque.clear();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i2 = message.what;
        InterfaceC0284c interfaceC0284c = null;
        if (i2 == 0) {
            p pVar = (p) message.obj;
            String string = Settings.Secure.getString(this.f8511a.getContentResolver(), "enabled_notification_listeners");
            synchronized (t.f8515c) {
                if (string != null) {
                    try {
                        if (!string.equals(t.f8516d)) {
                            String[] split = string.split(":", -1);
                            HashSet hashSet2 = new HashSet(split.length);
                            for (String str : split) {
                                ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                                if (unflattenFromString != null) {
                                    hashSet2.add(unflattenFromString.getPackageName());
                                }
                            }
                            t.f8517e = hashSet2;
                            t.f8516d = string;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                hashSet = t.f8517e;
            }
            if (!hashSet.equals(this.f8514d)) {
                this.f8514d = hashSet;
                List<ResolveInfo> queryIntentServices = this.f8511a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
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
                    if (!this.f8513c.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                        }
                        this.f8513c.put(componentName2, new r(componentName2));
                    }
                }
                Iterator it2 = this.f8513c.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                        }
                        r rVar = (r) entry.getValue();
                        if (rVar.f8507b) {
                            this.f8511a.unbindService(this);
                            rVar.f8507b = false;
                        }
                        rVar.f8508c = null;
                        it2.remove();
                    }
                }
            }
            for (r rVar2 : this.f8513c.values()) {
                rVar2.f8509d.add(pVar);
                a(rVar2);
            }
        } else if (i2 == 1) {
            q qVar = (q) message.obj;
            ComponentName componentName3 = qVar.f8504a;
            IBinder iBinder = qVar.f8505b;
            r rVar3 = (r) this.f8513c.get(componentName3);
            if (rVar3 != null) {
                int i5 = AbstractBinderC0283b.f4164e;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface(InterfaceC0284c.f4165d);
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC0284c)) {
                        C0282a c0282a = new C0282a();
                        c0282a.f4163e = iBinder;
                        interfaceC0284c = c0282a;
                    } else {
                        interfaceC0284c = (InterfaceC0284c) queryLocalInterface;
                    }
                }
                rVar3.f8508c = interfaceC0284c;
                rVar3.f8510e = 0;
                a(rVar3);
                return true;
            }
        } else if (i2 == 2) {
            r rVar4 = (r) this.f8513c.get((ComponentName) message.obj);
            if (rVar4 != null) {
                if (rVar4.f8507b) {
                    this.f8511a.unbindService(this);
                    rVar4.f8507b = false;
                }
                rVar4.f8508c = null;
                return true;
            }
        } else {
            if (i2 != 3) {
                return false;
            }
            r rVar5 = (r) this.f8513c.get((ComponentName) message.obj);
            if (rVar5 != null) {
                a(rVar5);
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
        this.f8512b.obtainMessage(1, new q(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.f8512b.obtainMessage(2, componentName).sendToTarget();
    }
}
