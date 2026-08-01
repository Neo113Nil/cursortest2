package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzeso implements zzeuy {
    private final zzfdt zza;

    zzeso(zzfdt zzfdtVar) {
        this.zza = zzfdtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final int zza() {
        return 25;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final ListenableFuture zzb() {
        return zzgbb.zzh(new zzesp(this.zza));
    }
}
