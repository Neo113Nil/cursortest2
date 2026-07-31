package H1;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* loaded from: classes.dex */
public final class J implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public static final Object f912k = new Object();

    /* renamed from: l, reason: collision with root package name */
    public static Boolean f913l;

    /* renamed from: m, reason: collision with root package name */
    public static Boolean f914m;

    /* renamed from: f, reason: collision with root package name */
    public final Context f915f;

    /* renamed from: g, reason: collision with root package name */
    public final v f916g;

    /* renamed from: h, reason: collision with root package name */
    public final PowerManager.WakeLock f917h;

    /* renamed from: i, reason: collision with root package name */
    public final H f918i;

    /* renamed from: j, reason: collision with root package name */
    public final long f919j;

    public J(H h7, Context context, v vVar, long j4) {
        this.f918i = h7;
        this.f915f = context;
        this.f919j = j4;
        this.f916g = vVar;
        this.f917h = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean booleanValue;
        synchronized (f912k) {
            try {
                Boolean bool = f914m;
                Boolean valueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                f914m = valueOf;
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
        boolean z5 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z5 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z5;
    }

    public static boolean c(Context context) {
        boolean booleanValue;
        synchronized (f912k) {
            try {
                Boolean bool = f913l;
                Boolean valueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                f913l = valueOf;
                booleanValue = valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public final synchronized boolean d() {
        boolean z5;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f915f.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null) {
                z5 = activeNetworkInfo.isConnected();
            }
        } catch (Throwable th) {
            throw th;
        }
        return z5;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        H h7 = this.f918i;
        Context context = this.f915f;
        boolean c7 = c(context);
        PowerManager.WakeLock wakeLock = this.f917h;
        if (c7) {
            wakeLock.acquire(AbstractC0132f.f954a);
        }
        try {
            try {
                try {
                    h7.d(true);
                    if (!this.f916g.d()) {
                        h7.d(false);
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
                    if (!a(context) || d()) {
                        if (h7.e()) {
                            h7.d(false);
                        } else {
                            h7.f(this.f919j);
                        }
                        if (c(context)) {
                            wakeLock.release();
                            return;
                        }
                        return;
                    }
                    new I(this, this).a();
                    if (c(context)) {
                        try {
                            wakeLock.release();
                        } catch (RuntimeException unused2) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                } catch (IOException e4) {
                    Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e4.getMessage());
                    h7.d(false);
                    if (c(context)) {
                        wakeLock.release();
                    }
                }
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
