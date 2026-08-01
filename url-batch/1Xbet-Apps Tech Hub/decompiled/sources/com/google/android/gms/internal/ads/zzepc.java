package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzepc implements zzhdp {
    private final zzhec zza;
    private final zzhec zzb;

    public zzepc(zzhec zzhecVar, zzhec zzhecVar2) {
        this.zza = zzhecVar;
        this.zzb = zzhecVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    public final /* bridge */ /* synthetic */ Object zzb() {
        ListenableFuture listenableFuture = (ListenableFuture) this.zza.zzb();
        zzgbl zzgblVar = zzcca.zza;
        zzhdx.zzb(zzgblVar);
        return new zzepb(listenableFuture, zzgblVar);
    }
}
