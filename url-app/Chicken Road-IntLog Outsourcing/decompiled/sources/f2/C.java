package f2;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* loaded from: classes.dex */
public final class C implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public static final Object f5558f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public static Boolean f5559g;

    /* renamed from: h, reason: collision with root package name */
    public static Boolean f5560h;

    /* renamed from: a, reason: collision with root package name */
    public final Context f5561a;

    /* renamed from: b, reason: collision with root package name */
    public final o f5562b;

    /* renamed from: c, reason: collision with root package name */
    public final PowerManager.WakeLock f5563c;

    /* renamed from: d, reason: collision with root package name */
    public final A f5564d;

    /* renamed from: e, reason: collision with root package name */
    public final long f5565e;

    public C(A a6, Context context, o oVar, long j2) {
        this.f5564d = a6;
        this.f5561a = context;
        this.f5565e = j2;
        this.f5562b = oVar;
        this.f5563c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean booleanValue;
        synchronized (f5558f) {
            try {
                Boolean bool = f5560h;
                Boolean valueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                f5560h = valueOf;
                booleanValue = valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public static boolean b(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (!z && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z;
    }

    public static boolean c(Context context) {
        boolean booleanValue;
        synchronized (f5558f) {
            try {
                Boolean bool = f5559g;
                Boolean valueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                f5559g = valueOf;
                booleanValue = valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public final synchronized boolean d() {
        boolean z;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f5561a.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null) {
                z = activeNetworkInfo.isConnected();
            }
        } catch (Throwable th) {
            throw th;
        }
        return z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        A a6 = this.f5564d;
        Context context = this.f5561a;
        boolean c2 = c(context);
        PowerManager.WakeLock wakeLock = this.f5563c;
        if (c2) {
            wakeLock.acquire(AbstractC0422f.f5600a);
        }
        try {
            try {
                a6.d(true);
            } catch (IOException e3) {
                Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e3.getMessage());
                a6.d(false);
                if (!c(context)) {
                    return;
                }
            }
            if (!this.f5562b.d()) {
                a6.d(false);
                if (c(context)) {
                    try {
                        wakeLock.release();
                        return;
                    } catch (RuntimeException unused) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        return;
                    }
                }
                return;
            }
            if (a(context) && !d()) {
                new B(this, this).a();
                if (c(context)) {
                    try {
                        wakeLock.release();
                        return;
                    } catch (RuntimeException unused2) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        return;
                    }
                }
                return;
            }
            if (a6.e()) {
                a6.d(false);
            } else {
                a6.f(this.f5565e);
            }
            if (!c(context)) {
                return;
            }
            try {
                wakeLock.release();
            } catch (RuntimeException unused3) {
                Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
            }
        } catch (Throwable th) {
            if (c(context)) {
                try {
                    wakeLock.release();
                } catch (RuntimeException unused4) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
            throw th;
        }
    }
}
