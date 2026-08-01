package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzehq implements zzhdp {
    private final zzhec zza;
    private final zzhec zzb;
    private final zzhec zzc;
    private final zzhec zzd;
    private final zzhec zze;

    public zzehq(zzhec zzhecVar, zzhec zzhecVar2, zzhec zzhecVar3, zzhec zzhecVar4, zzhec zzhecVar5) {
        this.zza = zzhecVar;
        this.zzb = zzhecVar2;
        this.zzc = zzhecVar3;
        this.zzd = zzhecVar4;
        this.zze = zzhecVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzehp zzb() {
        zzcsm zzcsmVar = (zzcsm) this.zza.zzb();
        zzegw zzb = ((zzegx) this.zzb).zzb();
        zzcyj zzcyjVar = (zzcyj) this.zzc.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzd.zzb();
        zzgbl zzgblVar = zzcca.zza;
        zzhdx.zzb(zzgblVar);
        return new zzehp(zzcsmVar, zzb, zzcyjVar, scheduledExecutorService, zzgblVar);
    }
}
