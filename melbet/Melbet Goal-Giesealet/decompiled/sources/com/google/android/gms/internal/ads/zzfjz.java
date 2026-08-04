package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzfjz extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzfkb zza;

    zzfjz(zzfkb zzfkbVar) {
        Objects.requireNonNull(zzfkbVar);
        this.zza = zzfkbVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.zza.zzk(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.zza.zzk(false);
    }
}
