package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;

/* loaded from: classes.dex */
public final class jb {

    /* renamed from: a, reason: collision with root package name */
    private NetworkCapabilities f7062a;

    jb(ConnectivityManager connectivityManager) {
        if (connectivityManager == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        try {
            connectivityManager.registerDefaultNetworkCallback(new ib(this));
        } catch (RuntimeException unused) {
            synchronized (jb.class) {
                this.f7062a = null;
            }
        }
    }

    public static jb c(Context context) {
        if (context != null) {
            return new jb((ConnectivityManager) context.getSystemService("connectivity"));
        }
        return null;
    }

    public final long a() {
        synchronized (jb.class) {
            NetworkCapabilities networkCapabilities = this.f7062a;
            if (networkCapabilities != null) {
                if (networkCapabilities.hasTransport(4)) {
                    return 2L;
                }
                if (this.f7062a.hasTransport(1)) {
                    return 1L;
                }
                if (this.f7062a.hasTransport(0)) {
                    return 0L;
                }
            }
            return -1L;
        }
    }

    public final NetworkCapabilities b() {
        return this.f7062a;
    }
}
