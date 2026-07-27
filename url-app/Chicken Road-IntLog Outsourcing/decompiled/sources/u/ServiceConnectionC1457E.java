package u;

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
import c.AbstractBinderC0297b;
import c.C0296a;
import c.InterfaceC0298c;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: u.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC1457E implements Handler.Callback, ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11979a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f11980b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f11981c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public HashSet f11982d = new HashSet();

    public ServiceConnectionC1457E(Context context) {
        this.f11979a = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f11980b = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(C1456D c1456d) {
        boolean z;
        ArrayDeque arrayDeque;
        boolean isLoggable = Log.isLoggable("NotifManCompat", 3);
        ComponentName componentName = c1456d.f11974a;
        if (isLoggable) {
            Log.d("NotifManCompat", "Processing component " + componentName + ", " + c1456d.f11977d.size() + " queued tasks");
        }
        if (c1456d.f11977d.isEmpty()) {
            return;
        }
        if (c1456d.f11975b) {
            z = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.f11979a;
            boolean bindService = context.bindService(component, this, 33);
            c1456d.f11975b = bindService;
            if (bindService) {
                c1456d.f11978e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                context.unbindService(this);
            }
            z = c1456d.f11975b;
        }
        if (!z || c1456d.f11976c == null) {
            b(c1456d);
            return;
        }
        while (true) {
            arrayDeque = c1456d.f11977d;
            C1454B c1454b = (C1454B) arrayDeque.peek();
            if (c1454b == null) {
                break;
            }
            try {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Sending task " + c1454b);
                }
                c1454b.a(c1456d.f11976c);
                arrayDeque.remove();
            } catch (DeadObjectException unused) {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Remote service has died: " + componentName);
                }
            } catch (RemoteException e3) {
                Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e3);
            }
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        b(c1456d);
    }

    public final void b(C1456D c1456d) {
        Handler handler = this.f11980b;
        ComponentName componentName = c1456d.f11974a;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i2 = c1456d.f11978e;
        int i3 = i2 + 1;
        c1456d.f11978e = i3;
        if (i3 <= 6) {
            int i6 = (1 << i2) * AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Scheduling retry for " + i6 + " ms");
            }
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i6);
            return;
        }
        StringBuilder sb = new StringBuilder("Giving up on delivering ");
        ArrayDeque arrayDeque = c1456d.f11977d;
        sb.append(arrayDeque.size());
        sb.append(" tasks to ");
        sb.append(componentName);
        sb.append(" after ");
        sb.append(c1456d.f11978e);
        sb.append(" retries");
        Log.w("NotifManCompat", sb.toString());
        arrayDeque.clear();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i2 = message.what;
        InterfaceC0298c interfaceC0298c = null;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        return false;
                    }
                    C1456D c1456d = (C1456D) this.f11981c.get((ComponentName) message.obj);
                    if (c1456d != null) {
                        a(c1456d);
                    }
                    return true;
                }
                C1456D c1456d2 = (C1456D) this.f11981c.get((ComponentName) message.obj);
                if (c1456d2 != null) {
                    if (c1456d2.f11975b) {
                        this.f11979a.unbindService(this);
                        c1456d2.f11975b = false;
                    }
                    c1456d2.f11976c = null;
                }
                return true;
            }
            C1455C c1455c = (C1455C) message.obj;
            ComponentName componentName = c1455c.f11972a;
            IBinder iBinder = c1455c.f11973b;
            C1456D c1456d3 = (C1456D) this.f11981c.get(componentName);
            if (c1456d3 != null) {
                int i3 = AbstractBinderC0297b.f4863a;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface(InterfaceC0298c.f4864d);
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC0298c)) {
                        C0296a c0296a = new C0296a();
                        c0296a.f4862a = iBinder;
                        interfaceC0298c = c0296a;
                    } else {
                        interfaceC0298c = (InterfaceC0298c) queryLocalInterface;
                    }
                }
                c1456d3.f11976c = interfaceC0298c;
                c1456d3.f11978e = 0;
                a(c1456d3);
            }
            return true;
        }
        C1454B c1454b = (C1454B) message.obj;
        String string = Settings.Secure.getString(this.f11979a.getContentResolver(), "enabled_notification_listeners");
        synchronized (C1458F.f11983c) {
            if (string != null) {
                try {
                    if (!string.equals(C1458F.f11984d)) {
                        String[] split = string.split(StringUtils.PROCESS_POSTFIX_DELIMITER, -1);
                        HashSet hashSet2 = new HashSet(split.length);
                        for (String str : split) {
                            ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                            if (unflattenFromString != null) {
                                hashSet2.add(unflattenFromString.getPackageName());
                            }
                        }
                        C1458F.f11985e = hashSet2;
                        C1458F.f11984d = string;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            hashSet = C1458F.f11985e;
        }
        if (!hashSet.equals(this.f11982d)) {
            this.f11982d = hashSet;
            List<ResolveInfo> queryIntentServices = this.f11979a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet hashSet3 = new HashSet();
            for (ResolveInfo resolveInfo : queryIntentServices) {
                if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName2 = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w("NotifManCompat", "Permission present on component " + componentName2 + ", not adding listener record.");
                    } else {
                        hashSet3.add(componentName2);
                    }
                }
            }
            Iterator it = hashSet3.iterator();
            while (it.hasNext()) {
                ComponentName componentName3 = (ComponentName) it.next();
                if (!this.f11981c.containsKey(componentName3)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Adding listener record for " + componentName3);
                    }
                    this.f11981c.put(componentName3, new C1456D(componentName3));
                }
            }
            Iterator it2 = this.f11981c.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet3.contains(entry.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                    }
                    C1456D c1456d4 = (C1456D) entry.getValue();
                    if (c1456d4.f11975b) {
                        this.f11979a.unbindService(this);
                        c1456d4.f11975b = false;
                    }
                    c1456d4.f11976c = null;
                    it2.remove();
                }
            }
        }
        for (C1456D c1456d5 : this.f11981c.values()) {
            c1456d5.f11977d.add(c1454b);
            a(c1456d5);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Connected to service " + componentName);
        }
        this.f11980b.obtainMessage(1, new C1455C(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.f11980b.obtainMessage(2, componentName).sendToTarget();
    }
}
