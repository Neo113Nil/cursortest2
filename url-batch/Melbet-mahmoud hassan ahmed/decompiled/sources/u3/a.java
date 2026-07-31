package u3;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import r3.e1;
import r3.o;
import w3.c;

/* loaded from: classes.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f22481b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static volatile a f22482c;

    /* renamed from: a, reason: collision with root package name */
    @RecentlyNonNull
    public ConcurrentHashMap<ServiceConnection, ServiceConnection> f22483a = new ConcurrentHashMap<>();

    private a() {
    }

    @RecentlyNonNull
    public static a b() {
        if (f22482c == null) {
            synchronized (f22481b) {
                if (f22482c == null) {
                    f22482c = new a();
                }
            }
        }
        a aVar = f22482c;
        o.i(aVar);
        return aVar;
    }

    @SuppressLint({"UntrackedBindService"})
    private final boolean e(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i7, boolean z6) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((c.a(context).c(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!f(serviceConnection)) {
            return context.bindService(intent, serviceConnection, i7);
        }
        ServiceConnection putIfAbsent = this.f22483a.putIfAbsent(serviceConnection, serviceConnection);
        if (putIfAbsent != null && serviceConnection != putIfAbsent) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        try {
            boolean bindService = context.bindService(intent, serviceConnection, i7);
            if (bindService) {
                return bindService;
            }
            return false;
        } finally {
            this.f22483a.remove(serviceConnection, serviceConnection);
        }
    }

    private static boolean f(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof e1);
    }

    @SuppressLint({"UntrackedBindService"})
    private static void g(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    public boolean a(@RecentlyNonNull Context context, @RecentlyNonNull Intent intent, @RecentlyNonNull ServiceConnection serviceConnection, int i7) {
        return e(context, context.getClass().getName(), intent, serviceConnection, i7, true);
    }

    @SuppressLint({"UntrackedBindService"})
    public void c(@RecentlyNonNull Context context, @RecentlyNonNull ServiceConnection serviceConnection) {
        if (!f(serviceConnection) || !this.f22483a.containsKey(serviceConnection)) {
            g(context, serviceConnection);
            return;
        }
        try {
            g(context, this.f22483a.get(serviceConnection));
        } finally {
            this.f22483a.remove(serviceConnection);
        }
    }

    public final boolean d(@RecentlyNonNull Context context, @RecentlyNonNull String str, @RecentlyNonNull Intent intent, @RecentlyNonNull ServiceConnection serviceConnection, int i7) {
        return e(context, str, intent, serviceConnection, i7, true);
    }
}
