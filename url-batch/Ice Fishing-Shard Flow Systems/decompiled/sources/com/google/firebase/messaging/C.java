package com.google.firebase.messaging;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import y1.ThreadFactoryC1023a;

/* loaded from: classes.dex */
public final class C implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final long f4418d;

    /* renamed from: e, reason: collision with root package name */
    public final PowerManager.WakeLock f4419e;

    /* renamed from: i, reason: collision with root package name */
    public final FirebaseMessaging f4420i;

    /* renamed from: l, reason: collision with root package name */
    public final ThreadPoolExecutor f4421l = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC1023a("firebase-iid-executor"));

    public C(FirebaseMessaging firebaseMessaging, long j) {
        this.f4420i = firebaseMessaging;
        this.f4418d = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.f4439b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f4419e = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public final boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f4420i.f4439b.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final boolean b() {
        try {
            if (this.f4420i.a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e7) {
            String message = e7.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e7.getMessage() != null) {
                    throw e7;
                }
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e7.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        PowerManager.WakeLock wakeLock = this.f4419e;
        z a7 = z.a();
        FirebaseMessaging firebaseMessaging = this.f4420i;
        if (a7.d(firebaseMessaging.f4439b)) {
            wakeLock.acquire();
        }
        try {
            try {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f4447k = true;
                }
                if (!firebaseMessaging.f4446i.i()) {
                    synchronized (firebaseMessaging) {
                        firebaseMessaging.f4447k = false;
                    }
                    if (z.a().d(firebaseMessaging.f4439b)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (z.a().c(firebaseMessaging.f4439b) && !a()) {
                    B b7 = new B();
                    b7.f4417c = this;
                    b7.a();
                    if (z.a().d(firebaseMessaging.f4439b)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (b()) {
                    synchronized (firebaseMessaging) {
                        firebaseMessaging.f4447k = false;
                    }
                } else {
                    firebaseMessaging.g(this.f4418d);
                }
                if (z.a().d(firebaseMessaging.f4439b)) {
                    wakeLock.release();
                }
            } catch (IOException e7) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e7.getMessage() + ". Won't retry the operation.");
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f4447k = false;
                    if (z.a().d(firebaseMessaging.f4439b)) {
                        wakeLock.release();
                    }
                }
            }
        } catch (Throwable th) {
            if (z.a().d(firebaseMessaging.f4439b)) {
                wakeLock.release();
            }
            throw th;
        }
    }
}
