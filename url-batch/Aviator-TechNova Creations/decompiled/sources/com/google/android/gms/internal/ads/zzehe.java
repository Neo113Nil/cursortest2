package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzehe {
    private final zzbzn zza;

    zzehe(zzbzn zzbznVar) {
        this.zza = zzbznVar;
    }

    public final void zza() {
        ListenableFuture zza = this.zza.zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziL)).booleanValue()) {
            zzcel.zzb(zza, "persistFlags");
        } else {
            zzcel.zza(zza, "persistFlags");
        }
    }
}
