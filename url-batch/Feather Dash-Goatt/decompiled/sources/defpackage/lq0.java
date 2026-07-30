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

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class lq0 implements Handler.Callback, ServiceConnection {
    public final Context a;
    public final Handler b;
    public final HashMap c = new HashMap();
    public HashSet d = new HashSet();

    public lq0(Context context) {
        this.a = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.b = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(kq0 kq0Var) {
        boolean z;
        ArrayDeque arrayDeque = kq0Var.d;
        ComponentName componentName = kq0Var.a;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Processing component " + componentName + ", " + arrayDeque.size() + " queued tasks");
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (kq0Var.b) {
            z = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.a;
            boolean bindService = context.bindService(component, this, 33);
            kq0Var.b = bindService;
            if (bindService) {
                kq0Var.e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                context.unbindService(this);
            }
            z = kq0Var.b;
        }
        if (!z || kq0Var.c == null) {
            b(kq0Var);
            return;
        }
        while (true) {
            iq0 iq0Var = (iq0) arrayDeque.peek();
            if (iq0Var == null) {
                break;
            }
            try {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Sending task " + iq0Var);
                }
                iq0Var.a(kq0Var.c);
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
        b(kq0Var);
    }

    public final void b(kq0 kq0Var) {
        ComponentName componentName = kq0Var.a;
        ArrayDeque arrayDeque = kq0Var.d;
        Handler handler = this.b;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i = kq0Var.e;
        int i2 = i + 1;
        kq0Var.e = i2;
        if (i2 <= 6) {
            int i3 = (1 << i) * 1000;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Scheduling retry for " + i3 + " ms");
            }
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i3);
            return;
        }
        Log.w("NotifManCompat", "Giving up on delivering " + arrayDeque.size() + " tasks to " + componentName + " after " + kq0Var.e + " retries");
        arrayDeque.clear();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i = message.what;
        z60 z60Var = null;
        if (i == 0) {
            iq0 iq0Var = (iq0) message.obj;
            String string = Settings.Secure.getString(this.a.getContentResolver(), "enabled_notification_listeners");
            synchronized (mq0.c) {
                if (string != null) {
                    try {
                        if (!string.equals(mq0.d)) {
                            String[] split = string.split(":", -1);
                            HashSet hashSet2 = new HashSet(split.length);
                            for (String str : split) {
                                ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                                if (unflattenFromString != null) {
                                    hashSet2.add(unflattenFromString.getPackageName());
                                }
                            }
                            mq0.e = hashSet2;
                            mq0.d = string;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                hashSet = mq0.e;
            }
            if (!hashSet.equals(this.d)) {
                this.d = hashSet;
                List<ResolveInfo> queryIntentServices = this.a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
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
                    if (!this.c.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                        }
                        this.c.put(componentName2, new kq0(componentName2));
                    }
                }
                Iterator it2 = this.c.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                        }
                        kq0 kq0Var = (kq0) entry.getValue();
                        if (kq0Var.b) {
                            this.a.unbindService(this);
                            kq0Var.b = false;
                        }
                        kq0Var.c = null;
                        it2.remove();
                    }
                }
            }
            for (kq0 kq0Var2 : this.c.values()) {
                kq0Var2.d.add(iq0Var);
                a(kq0Var2);
            }
        } else if (i == 1) {
            jq0 jq0Var = (jq0) message.obj;
            ComponentName componentName3 = jq0Var.a;
            IBinder iBinder = jq0Var.b;
            kq0 kq0Var3 = (kq0) this.c.get(componentName3);
            if (kq0Var3 != null) {
                int i2 = y60.b;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface(z60.a);
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof z60)) {
                        x60 x60Var = new x60();
                        x60Var.b = iBinder;
                        z60Var = x60Var;
                    } else {
                        z60Var = (z60) queryLocalInterface;
                    }
                }
                kq0Var3.c = z60Var;
                kq0Var3.e = 0;
                a(kq0Var3);
                return true;
            }
        } else if (i == 2) {
            kq0 kq0Var4 = (kq0) this.c.get((ComponentName) message.obj);
            if (kq0Var4 != null) {
                if (kq0Var4.b) {
                    this.a.unbindService(this);
                    kq0Var4.b = false;
                }
                kq0Var4.c = null;
                return true;
            }
        } else {
            if (i != 3) {
                return false;
            }
            kq0 kq0Var5 = (kq0) this.c.get((ComponentName) message.obj);
            if (kq0Var5 != null) {
                a(kq0Var5);
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
        this.b.obtainMessage(1, new jq0(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.b.obtainMessage(2, componentName).sendToTarget();
    }
}
