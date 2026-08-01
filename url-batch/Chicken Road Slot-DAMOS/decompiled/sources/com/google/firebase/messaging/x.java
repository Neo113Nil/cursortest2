package com.google.firebase.messaging;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class x implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final long f3182d;

    /* renamed from: e, reason: collision with root package name */
    public final PowerManager.WakeLock f3183e;

    /* renamed from: i, reason: collision with root package name */
    public final FirebaseMessaging f3184i;

    /* renamed from: r, reason: collision with root package name */
    public final ThreadPoolExecutor f3185r = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new h7.a("firebase-iid-executor"));

    public x(FirebaseMessaging firebaseMessaging, long j) {
        this.f3184i = firebaseMessaging;
        this.f3182d = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.f3079b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f3183e = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public final boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f3184i.f3079b.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final boolean b() {
        try {
            if (this.f3184i.a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e2) {
            String message = e2.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e2.getMessage() != null) {
                    throw e2;
                }
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e2.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        PowerManager.WakeLock wakeLock = this.f3183e;
        v c10 = v.c();
        FirebaseMessaging firebaseMessaging = this.f3184i;
        if (c10.e(firebaseMessaging.f3079b)) {
            wakeLock.acquire();
        }
        try {
            try {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f3086k = true;
                }
                if (!firebaseMessaging.f3085i.f()) {
                    synchronized (firebaseMessaging) {
                        firebaseMessaging.f3086k = false;
                    }
                    if (v.c().e(firebaseMessaging.f3079b)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (v.c().d(firebaseMessaging.f3079b) && !a()) {
                    b7.g0 g0Var = new b7.g0();
                    g0Var.f1290c = this;
                    g0Var.a();
                    if (v.c().e(firebaseMessaging.f3079b)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (b()) {
                    synchronized (firebaseMessaging) {
                        firebaseMessaging.f3086k = false;
                    }
                } else {
                    firebaseMessaging.g(this.f3182d);
                }
                if (v.c().e(firebaseMessaging.f3079b)) {
                    wakeLock.release();
                }
            } catch (IOException e2) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e2.getMessage() + ". Won't retry the operation.");
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f3086k = false;
                    if (v.c().e(firebaseMessaging.f3079b)) {
                        wakeLock.release();
                    }
                }
            }
        } catch (Throwable th) {
            if (v.c().e(firebaseMessaging.f3079b)) {
                wakeLock.release();
            }
            throw th;
        }
    }
}
