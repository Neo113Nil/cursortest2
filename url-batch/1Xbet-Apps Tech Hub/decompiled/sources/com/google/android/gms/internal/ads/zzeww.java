package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzeww implements zzhdp {
    private final zzhec zza;
    private final zzhec zzb;
    private final zzhec zzc;
    private final zzhec zzd;
    private final zzhec zze;

    public zzeww(zzhec zzhecVar, zzhec zzhecVar2, zzhec zzhecVar3, zzhec zzhecVar4, zzhec zzhecVar5) {
        this.zza = zzhecVar;
        this.zzb = zzhecVar2;
        this.zzc = zzhecVar3;
        this.zzd = zzhecVar4;
        this.zze = zzhecVar5;
    }

    public static zzewu zza(String str, zzaxs zzaxsVar, zzcaw zzcawVar, ScheduledExecutorService scheduledExecutorService, zzgbl zzgblVar) {
        return new zzewu(str, zzaxsVar, zzcawVar, scheduledExecutorService, zzgblVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    public final /* bridge */ /* synthetic */ Object zzb() {
        String zza = ((zzeya) this.zza).zza();
        zzaxs zzaxsVar = new zzaxs();
        zzcaw zzcawVar = (zzcaw) this.zzc.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzd.zzb();
        zzgbl zzgblVar = zzcca.zza;
        zzhdx.zzb(zzgblVar);
        return new zzewu(zza, zzaxsVar, zzcawVar, scheduledExecutorService, zzgblVar);
    }
}
