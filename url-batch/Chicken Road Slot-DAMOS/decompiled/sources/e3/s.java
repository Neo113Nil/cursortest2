package e3;

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

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class s implements Handler.Callback, ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3842a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f3843b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f3844c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public HashSet f3845d = new HashSet();

    public s(Context context) {
        this.f3842a = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f3843b = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(r rVar) {
        boolean z10;
        ArrayDeque arrayDeque = rVar.f3840d;
        ComponentName componentName = rVar.f3837a;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Processing component " + componentName + ", " + arrayDeque.size() + " queued tasks");
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (rVar.f3838b) {
            z10 = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.f3842a;
            boolean bindService = context.bindService(component, this, 33);
            rVar.f3838b = bindService;
            if (bindService) {
                rVar.f3841e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                context.unbindService(this);
            }
            z10 = rVar.f3838b;
        }
        if (!z10 || rVar.f3839c == null) {
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
                pVar.a(rVar.f3839c);
                arrayDeque.remove();
            } catch (DeadObjectException unused) {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Remote service has died: " + componentName);
                }
            } catch (RemoteException e2) {
                Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e2);
            }
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        b(rVar);
    }

    public final void b(r rVar) {
        ComponentName componentName = rVar.f3837a;
        ArrayDeque arrayDeque = rVar.f3840d;
        Handler handler = this.f3843b;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i3 = rVar.f3841e;
        int i10 = i3 + 1;
        rVar.f3841e = i10;
        if (i10 <= 6) {
            int i11 = (1 << i3) * 1000;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Scheduling retry for " + i11 + " ms");
            }
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i11);
            return;
        }
        Log.w("NotifManCompat", "Giving up on delivering " + arrayDeque.size() + " tasks to " + componentName + " after " + rVar.f3841e + " retries");
        arrayDeque.clear();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i3 = message.what;
        c.c cVar = null;
        if (i3 == 0) {
            p pVar = (p) message.obj;
            String string = Settings.Secure.getString(this.f3842a.getContentResolver(), "enabled_notification_listeners");
            synchronized (t.f3846c) {
                if (string != null) {
                    try {
                        if (!string.equals(t.f3847d)) {
                            String[] split = string.split(":", -1);
                            HashSet hashSet2 = new HashSet(split.length);
                            for (String str : split) {
                                ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                                if (unflattenFromString != null) {
                                    hashSet2.add(unflattenFromString.getPackageName());
                                }
                            }
                            t.f3848e = hashSet2;
                            t.f3847d = string;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                hashSet = t.f3848e;
            }
            if (!hashSet.equals(this.f3845d)) {
                this.f3845d = hashSet;
                List<ResolveInfo> queryIntentServices = this.f3842a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
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
                    if (!this.f3844c.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                        }
                        this.f3844c.put(componentName2, new r(componentName2));
                    }
                }
                Iterator it2 = this.f3844c.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                        }
                        r rVar = (r) entry.getValue();
                        if (rVar.f3838b) {
                            this.f3842a.unbindService(this);
                            rVar.f3838b = false;
                        }
                        rVar.f3839c = null;
                        it2.remove();
                    }
                }
            }
            for (r rVar2 : this.f3844c.values()) {
                rVar2.f3840d.add(pVar);
                a(rVar2);
            }
        } else if (i3 == 1) {
            q qVar = (q) message.obj;
            ComponentName componentName3 = qVar.f3835a;
            IBinder iBinder = qVar.f3836b;
            r rVar3 = (r) this.f3844c.get(componentName3);
            if (rVar3 != null) {
                int i10 = c.b.f1474d;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface(c.c.f1475a);
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof c.c)) {
                        c.a aVar = new c.a();
                        aVar.f1473d = iBinder;
                        cVar = aVar;
                    } else {
                        cVar = (c.c) queryLocalInterface;
                    }
                }
                rVar3.f3839c = cVar;
                rVar3.f3841e = 0;
                a(rVar3);
                return true;
            }
        } else if (i3 == 2) {
            r rVar4 = (r) this.f3844c.get((ComponentName) message.obj);
            if (rVar4 != null) {
                if (rVar4.f3838b) {
                    this.f3842a.unbindService(this);
                    rVar4.f3838b = false;
                }
                rVar4.f3839c = null;
                return true;
            }
        } else {
            if (i3 != 3) {
                return false;
            }
            r rVar5 = (r) this.f3844c.get((ComponentName) message.obj);
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
        this.f3843b.obtainMessage(1, new q(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.f3843b.obtainMessage(2, componentName).sendToTarget();
    }
}
