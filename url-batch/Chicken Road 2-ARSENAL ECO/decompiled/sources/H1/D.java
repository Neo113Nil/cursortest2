package H1;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class D implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final long f886f;

    /* renamed from: g, reason: collision with root package name */
    public final PowerManager.WakeLock f887g;

    /* renamed from: h, reason: collision with root package name */
    public final FirebaseMessaging f888h;

    public D(FirebaseMessaging firebaseMessaging, long j4) {
        new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new Z0.a("firebase-iid-executor"));
        this.f888h = firebaseMessaging;
        this.f886f = j4;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.f3902b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f887g = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public final boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f888h.f3902b.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final boolean b() {
        try {
            if (this.f888h.a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e4) {
            String message = e4.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e4.getMessage() != null) {
                    throw e4;
                }
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e4.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        PowerManager.WakeLock wakeLock = this.f887g;
        A b7 = A.b();
        FirebaseMessaging firebaseMessaging = this.f888h;
        if (b7.d(firebaseMessaging.f3902b)) {
            wakeLock.acquire();
        }
        try {
            try {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f3909i = true;
                }
                if (!firebaseMessaging.f3908h.d()) {
                    synchronized (firebaseMessaging) {
                        firebaseMessaging.f3909i = false;
                    }
                    if (A.b().d(firebaseMessaging.f3902b)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (A.b().c(firebaseMessaging.f3902b) && !a()) {
                    C c7 = new C();
                    c7.f885b = this;
                    c7.a();
                    if (A.b().d(firebaseMessaging.f3902b)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (b()) {
                    synchronized (firebaseMessaging) {
                        firebaseMessaging.f3909i = false;
                    }
                } else {
                    firebaseMessaging.g(this.f886f);
                }
                if (A.b().d(firebaseMessaging.f3902b)) {
                    wakeLock.release();
                }
            } catch (IOException e4) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e4.getMessage() + ". Won't retry the operation.");
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f3909i = false;
                    if (A.b().d(firebaseMessaging.f3902b)) {
                        wakeLock.release();
                    }
                }
            }
        } catch (Throwable th) {
            if (A.b().d(firebaseMessaging.f3902b)) {
                wakeLock.release();
            }
            throw th;
        }
    }
}
