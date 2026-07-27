package f2;

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
public final class w implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final long f5646a;

    /* renamed from: b, reason: collision with root package name */
    public final PowerManager.WakeLock f5647b;

    /* renamed from: c, reason: collision with root package name */
    public final FirebaseMessaging f5648c;

    public w(FirebaseMessaging firebaseMessaging, long j2) {
        new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new G0.y("firebase-iid-executor"));
        this.f5648c = firebaseMessaging;
        this.f5646a = j2;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.f5323b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f5647b = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public final boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f5648c.f5323b.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final boolean b() {
        try {
            if (this.f5648c.a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e3) {
            String message = e3.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e3.getMessage() != null) {
                    throw e3;
                }
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e3.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        t c2 = t.c();
        FirebaseMessaging firebaseMessaging = this.f5648c;
        boolean e3 = c2.e(firebaseMessaging.f5323b);
        PowerManager.WakeLock wakeLock = this.f5647b;
        if (e3) {
            wakeLock.acquire();
        }
        try {
            try {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f5330i = true;
                }
            } catch (IOException e6) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e6.getMessage() + ". Won't retry the operation.");
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f5330i = false;
                    if (!t.c().e(firebaseMessaging.f5323b)) {
                        return;
                    }
                }
            }
            if (!firebaseMessaging.f5329h.d()) {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f5330i = false;
                }
                if (t.c().e(firebaseMessaging.f5323b)) {
                    wakeLock.release();
                    return;
                }
                return;
            }
            if (t.c().d(firebaseMessaging.f5323b) && !a()) {
                v vVar = new v();
                vVar.f5645b = this;
                vVar.a();
                if (t.c().e(firebaseMessaging.f5323b)) {
                    wakeLock.release();
                    return;
                }
                return;
            }
            if (b()) {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f5330i = false;
                }
            } else {
                firebaseMessaging.g(this.f5646a);
            }
            if (!t.c().e(firebaseMessaging.f5323b)) {
                return;
            }
            wakeLock.release();
        } catch (Throwable th) {
            if (t.c().e(firebaseMessaging.f5323b)) {
                wakeLock.release();
            }
            throw th;
        }
    }
}
