package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzasm {
    private NetworkCapabilities zza;

    zzasm(ConnectivityManager connectivityManager) {
        if (connectivityManager != null) {
            try {
                connectivityManager.registerDefaultNetworkCallback(new zzasl(this));
            } catch (RuntimeException unused) {
                synchronized (zzasm.class) {
                    this.zza = null;
                }
            }
        }
    }

    public static zzasm zzc(Context context) {
        if (context != null) {
            return new zzasm((ConnectivityManager) context.getSystemService("connectivity"));
        }
        return null;
    }

    public final long zza() {
        synchronized (zzasm.class) {
            NetworkCapabilities networkCapabilities = this.zza;
            if (networkCapabilities != null) {
                if (networkCapabilities.hasTransport(4)) {
                    return 2L;
                }
                if (this.zza.hasTransport(1)) {
                    return 1L;
                }
                if (this.zza.hasTransport(0)) {
                    return 0L;
                }
            }
            return -1L;
        }
    }

    public final NetworkCapabilities zzb() {
        return this.zza;
    }
}
