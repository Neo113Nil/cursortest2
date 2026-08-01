package f7;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import c7.c0;
import c7.m0;
import i7.b;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f4111b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static volatile a f4112c;

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f4113a = new ConcurrentHashMap();

    public static a b() {
        if (f4112c == null) {
            synchronized (f4111b) {
                try {
                    if (f4112c == null) {
                        f4112c = new a();
                    }
                } finally {
                }
            }
        }
        a aVar = f4112c;
        c0.g(aVar);
        return aVar;
    }

    public final boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i3) {
        return d(context, context.getClass().getName(), intent, serviceConnection, i3, null);
    }

    public final void c(Context context, ServiceConnection serviceConnection) {
        if (!(serviceConnection instanceof m0)) {
            ConcurrentHashMap concurrentHashMap = this.f4113a;
            if (concurrentHashMap.containsKey(serviceConnection)) {
                try {
                    try {
                        context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                    } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
                    }
                    return;
                } finally {
                    concurrentHashMap.remove(serviceConnection);
                }
            }
        }
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
        }
    }

    public final boolean d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i3, Executor executor) {
        boolean bindService;
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((b.a(context).d(0, packageName).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (serviceConnection instanceof m0) {
            if (executor == null) {
                executor = null;
            }
            if (Build.VERSION.SDK_INT < 29 || executor == null) {
                return context.bindService(intent, serviceConnection, i3);
            }
            bindService = context.bindService(intent, i3, executor, serviceConnection);
            return bindService;
        }
        ConcurrentHashMap concurrentHashMap = this.f4113a;
        ServiceConnection serviceConnection2 = (ServiceConnection) concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        if (executor == null) {
            executor = null;
        }
        try {
            boolean bindService2 = (Build.VERSION.SDK_INT < 29 || executor == null) ? context.bindService(intent, serviceConnection, i3) : context.bindService(intent, i3, executor, serviceConnection);
            if (bindService2) {
                return bindService2;
            }
            return false;
        } finally {
            concurrentHashMap.remove(serviceConnection, serviceConnection);
        }
    }
}
