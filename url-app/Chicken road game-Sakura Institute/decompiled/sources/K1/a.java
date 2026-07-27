package K1;

import H1.o;
import H1.w;
import M1.c;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f3452b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static volatile a f3453c;

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f3454a = new ConcurrentHashMap();

    public static a a() {
        if (f3453c == null) {
            synchronized (f3452b) {
                try {
                    if (f3453c == null) {
                        f3453c = new a();
                    }
                } finally {
                }
            }
        }
        a aVar = f3453c;
        o.d(aVar);
        return aVar;
    }

    public final void b(Context context, ServiceConnection serviceConnection) {
        if (!(serviceConnection instanceof w)) {
            ConcurrentHashMap concurrentHashMap = this.f3454a;
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

    public final boolean c(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i2, Executor executor) {
        boolean bindService;
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((c.a(context).f3573a.getPackageManager().getApplicationInfo(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (serviceConnection instanceof w) {
            if (executor == null) {
                executor = null;
            }
            if (Build.VERSION.SDK_INT < 29 || executor == null) {
                return context.bindService(intent, serviceConnection, i2);
            }
            bindService = context.bindService(intent, i2, executor, serviceConnection);
            return bindService;
        }
        ConcurrentHashMap concurrentHashMap = this.f3454a;
        ServiceConnection serviceConnection2 = (ServiceConnection) concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        if (executor == null) {
            executor = null;
        }
        try {
            boolean bindService2 = (Build.VERSION.SDK_INT < 29 || executor == null) ? context.bindService(intent, serviceConnection, i2) : context.bindService(intent, i2, executor, serviceConnection);
            if (bindService2) {
                return bindService2;
            }
            return false;
        } finally {
            concurrentHashMap.remove(serviceConnection, serviceConnection);
        }
    }
}
