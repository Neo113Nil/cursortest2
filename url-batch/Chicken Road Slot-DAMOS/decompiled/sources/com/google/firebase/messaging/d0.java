package com.google.firebase.messaging;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d0 implements Runnable {

    /* renamed from: t, reason: collision with root package name */
    public static final Object f3120t = new Object();

    /* renamed from: u, reason: collision with root package name */
    public static Boolean f3121u;

    /* renamed from: v, reason: collision with root package name */
    public static Boolean f3122v;

    /* renamed from: d, reason: collision with root package name */
    public final Context f3123d;

    /* renamed from: e, reason: collision with root package name */
    public final b1.m f3124e;

    /* renamed from: i, reason: collision with root package name */
    public final PowerManager.WakeLock f3125i;

    /* renamed from: r, reason: collision with root package name */
    public final b0 f3126r;

    /* renamed from: s, reason: collision with root package name */
    public final long f3127s;

    public d0(b0 b0Var, Context context, b1.m mVar, long j) {
        this.f3126r = b0Var;
        this.f3123d = context;
        this.f3127s = j;
        this.f3124e = mVar;
        this.f3125i = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean booleanValue;
        synchronized (f3120t) {
            try {
                Boolean bool = f3122v;
                Boolean valueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                f3122v = valueOf;
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
        boolean z10 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z10 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z10;
    }

    public static boolean c(Context context) {
        boolean booleanValue;
        synchronized (f3120t) {
            try {
                Boolean bool = f3121u;
                Boolean valueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                f3121u = valueOf;
                booleanValue = valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public final synchronized boolean d() {
        boolean z10;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f3123d.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null) {
                z10 = activeNetworkInfo.isConnected();
            }
        } catch (Throwable th) {
            throw th;
        }
        return z10;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        b0 b0Var = this.f3126r;
        Context context = this.f3123d;
        boolean c10 = c(context);
        PowerManager.WakeLock wakeLock = this.f3125i;
        if (c10) {
            wakeLock.acquire(180000L);
        }
        try {
            try {
                try {
                    b0Var.a(true);
                    if (!this.f3124e.f()) {
                        b0Var.a(false);
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
                        if (b0Var.b()) {
                            b0Var.a(false);
                        } else {
                            b0Var.c(this.f3127s);
                        }
                        if (c(context)) {
                            wakeLock.release();
                            return;
                        }
                        return;
                    }
                    new c0(this, this).a();
                    if (c(context)) {
                        try {
                            wakeLock.release();
                        } catch (RuntimeException unused2) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                } catch (RuntimeException unused3) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            } catch (IOException e2) {
                Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e2.getMessage());
                b0Var.a(false);
                if (c(context)) {
                    wakeLock.release();
                }
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
