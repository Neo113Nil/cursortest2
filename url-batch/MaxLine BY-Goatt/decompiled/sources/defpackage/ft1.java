package defpackage;

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
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ft1 implements Handler.Callback, ServiceConnection {
    public final Context m;
    public final Handler n;
    public final HashMap o = new HashMap();
    public HashSet p = new HashSet();

    public ft1(Context context) {
        this.m = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.n = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(et1 et1Var) {
        boolean z;
        ArrayDeque arrayDeque = et1Var.d;
        ComponentName componentName = et1Var.a;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Processing component " + componentName + ", " + arrayDeque.size() + " queued tasks");
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (et1Var.b) {
            z = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.m;
            boolean bindService = context.bindService(component, this, 33);
            et1Var.b = bindService;
            if (bindService) {
                et1Var.e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                context.unbindService(this);
            }
            z = et1Var.b;
        }
        if (!z || et1Var.c == null) {
            b(et1Var);
            return;
        }
        while (true) {
            ct1 ct1Var = (ct1) arrayDeque.peek();
            if (ct1Var == null) {
                break;
            }
            try {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Sending task " + ct1Var);
                }
                ct1Var.a(et1Var.c);
                arrayDeque.remove();
            } catch (DeadObjectException unused) {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Remote service has died: " + componentName);
                }
            } catch (RemoteException e) {
                Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e);
            }
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        b(et1Var);
    }

    public final void b(et1 et1Var) {
        ComponentName componentName = et1Var.a;
        ArrayDeque arrayDeque = et1Var.d;
        Handler handler = this.n;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i = et1Var.e;
        int i2 = i + 1;
        et1Var.e = i2;
        if (i2 <= 6) {
            int i3 = (1 << i) * 1000;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Scheduling retry for " + i3 + " ms");
            }
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i3);
            return;
        }
        Log.w("NotifManCompat", "Giving up on delivering " + arrayDeque.size() + " tasks to " + componentName + " after " + et1Var.e + " retries");
        arrayDeque.clear();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i = message.what;
        a01 a01Var = null;
        if (i == 0) {
            ct1 ct1Var = (ct1) message.obj;
            String string = Settings.Secure.getString(this.m.getContentResolver(), "enabled_notification_listeners");
            synchronized (gt1.b) {
                if (string != null) {
                    try {
                        if (!string.equals(gt1.c)) {
                            String[] split = string.split(":", -1);
                            HashSet hashSet2 = new HashSet(split.length);
                            for (String str : split) {
                                ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                                if (unflattenFromString != null) {
                                    hashSet2.add(unflattenFromString.getPackageName());
                                }
                            }
                            gt1.d = hashSet2;
                            gt1.c = string;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                hashSet = gt1.d;
            }
            if (!hashSet.equals(this.p)) {
                this.p = hashSet;
                List<ResolveInfo> queryIntentServices = this.m.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
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
                    if (!this.o.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                        }
                        this.o.put(componentName2, new et1(componentName2));
                    }
                }
                Iterator it2 = this.o.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                        }
                        et1 et1Var = (et1) entry.getValue();
                        if (et1Var.b) {
                            this.m.unbindService(this);
                            et1Var.b = false;
                        }
                        et1Var.c = null;
                        it2.remove();
                    }
                }
            }
            for (et1 et1Var2 : this.o.values()) {
                et1Var2.d.add(ct1Var);
                a(et1Var2);
            }
        } else if (i == 1) {
            dt1 dt1Var = (dt1) message.obj;
            ComponentName componentName3 = dt1Var.a;
            IBinder iBinder = dt1Var.b;
            et1 et1Var3 = (et1) this.o.get(componentName3);
            if (et1Var3 != null) {
                int i2 = zz0.g;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface(a01.e);
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof a01)) {
                        yz0 yz0Var = new yz0();
                        yz0Var.g = iBinder;
                        a01Var = yz0Var;
                    } else {
                        a01Var = (a01) queryLocalInterface;
                    }
                }
                et1Var3.c = a01Var;
                et1Var3.e = 0;
                a(et1Var3);
                return true;
            }
        } else if (i == 2) {
            et1 et1Var4 = (et1) this.o.get((ComponentName) message.obj);
            if (et1Var4 != null) {
                if (et1Var4.b) {
                    this.m.unbindService(this);
                    et1Var4.b = false;
                }
                et1Var4.c = null;
                return true;
            }
        } else {
            if (i != 3) {
                return false;
            }
            et1 et1Var5 = (et1) this.o.get((ComponentName) message.obj);
            if (et1Var5 != null) {
                a(et1Var5);
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
        this.n.obtainMessage(1, new dt1(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.n.obtainMessage(2, componentName).sendToTarget();
    }
}
