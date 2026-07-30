package defpackage;

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

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class dr {
    public static volatile dr TSizfFm2Yiuu;
    public static final Object lS5Rgt96tfkO = new Object();
    public final ConcurrentHashMap PxuCJdSBwIXG;

    public dr(int i) {
        switch (i) {
            case 1:
                this.PxuCJdSBwIXG = new ConcurrentHashMap(16);
                break;
            default:
                this.PxuCJdSBwIXG = new ConcurrentHashMap();
                break;
        }
    }

    public static dr PxuCJdSBwIXG() {
        if (TSizfFm2Yiuu == null) {
            synchronized (lS5Rgt96tfkO) {
                try {
                    if (TSizfFm2Yiuu == null) {
                        TSizfFm2Yiuu = new dr(0);
                    }
                } finally {
                }
            }
        }
        dr drVar = TSizfFm2Yiuu;
        jh0.x50lh2ztY7Y5(drVar);
        return drVar;
    }

    public boolean TSizfFm2Yiuu(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((dv2.PxuCJdSBwIXG(context).PxuCJdSBwIXG.getPackageManager().getApplicationInfo(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (serviceConnection instanceof tx2) {
            if (executor == null) {
                executor = null;
            }
            return (Build.VERSION.SDK_INT < 29 || executor == null) ? context.bindService(intent, serviceConnection, i) : context.bindService(intent, i, executor, serviceConnection);
        }
        ConcurrentHashMap concurrentHashMap = this.PxuCJdSBwIXG;
        ServiceConnection serviceConnection2 = (ServiceConnection) concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        if (executor == null) {
            executor = null;
        }
        try {
            boolean bindService = (Build.VERSION.SDK_INT < 29 || executor == null) ? context.bindService(intent, serviceConnection, i) : context.bindService(intent, i, executor, serviceConnection);
            if (bindService) {
                return bindService;
            }
            return false;
        } finally {
            concurrentHashMap.remove(serviceConnection, serviceConnection);
        }
    }

    public void lS5Rgt96tfkO(Context context, ServiceConnection serviceConnection) {
        if (!(serviceConnection instanceof tx2)) {
            ConcurrentHashMap concurrentHashMap = this.PxuCJdSBwIXG;
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
}
