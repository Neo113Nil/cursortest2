package com.google.firebase.messaging;

import I.C0108d;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* loaded from: classes.dex */
public final class I implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public static final Object f4459n = new Object();

    /* renamed from: o, reason: collision with root package name */
    public static Boolean f4460o;

    /* renamed from: p, reason: collision with root package name */
    public static Boolean f4461p;

    /* renamed from: d, reason: collision with root package name */
    public final Context f4462d;

    /* renamed from: e, reason: collision with root package name */
    public final C0108d f4463e;

    /* renamed from: i, reason: collision with root package name */
    public final PowerManager.WakeLock f4464i;

    /* renamed from: l, reason: collision with root package name */
    public final G f4465l;

    /* renamed from: m, reason: collision with root package name */
    public final long f4466m;

    public I(G g7, Context context, C0108d c0108d, long j) {
        this.f4465l = g7;
        this.f4462d = context;
        this.f4466m = j;
        this.f4463e = c0108d;
        this.f4464i = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean booleanValue;
        synchronized (f4459n) {
            try {
                Boolean bool = f4461p;
                Boolean valueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                f4461p = valueOf;
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
        boolean z7 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z7 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z7;
    }

    public static boolean c(Context context) {
        boolean booleanValue;
        synchronized (f4459n) {
            try {
                Boolean bool = f4460o;
                Boolean valueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                f4460o = valueOf;
                booleanValue = valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public final synchronized boolean d() {
        boolean z7;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f4462d.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null) {
                z7 = activeNetworkInfo.isConnected();
            }
        } catch (Throwable th) {
            throw th;
        }
        return z7;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        G g7 = this.f4465l;
        Context context = this.f4462d;
        boolean c7 = c(context);
        PowerManager.WakeLock wakeLock = this.f4464i;
        if (c7) {
            wakeLock.acquire(AbstractC0317g.f4500a);
        }
        try {
            try {
                try {
                    g7.a(true);
                    if (!this.f4463e.i()) {
                        g7.a(false);
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
                        if (g7.b()) {
                            g7.a(false);
                        } else {
                            g7.c(this.f4466m);
                        }
                        if (c(context)) {
                            wakeLock.release();
                            return;
                        }
                        return;
                    }
                    new H(this, this).a();
                    if (c(context)) {
                        try {
                            wakeLock.release();
                        } catch (RuntimeException unused2) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                } catch (IOException e7) {
                    Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e7.getMessage());
                    g7.a(false);
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
