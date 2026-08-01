package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzexc implements zzhdp {
    private final zzhec zza;
    private final zzhec zzb;
    private final zzhec zzc;
    private final zzhec zzd;
    private final zzhec zze;
    private final zzhec zzf;
    private final zzhec zzg;

    public zzexc(zzhec zzhecVar, zzhec zzhecVar2, zzhec zzhecVar3, zzhec zzhecVar4, zzhec zzhecVar5, zzhec zzhecVar6, zzhec zzhecVar7) {
        this.zza = zzhecVar;
        this.zzb = zzhecVar2;
        this.zzc = zzhecVar3;
        this.zzd = zzhecVar4;
        this.zze = zzhecVar5;
        this.zzf = zzhecVar6;
        this.zzg = zzhecVar7;
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcan zzcanVar = new zzcan();
        int intValue = ((zzeyb) this.zzb).zzb().intValue();
        Context zza = ((zzciw) this.zzc).zza();
        zzcaw zzcawVar = (zzcaw) this.zzd.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zze.zzb();
        zzgbl zzgblVar = zzcca.zza;
        zzhdx.zzb(zzgblVar);
        return new zzexa(zzcanVar, intValue, zza, zzcawVar, scheduledExecutorService, zzgblVar, ((zzeya) this.zzg).zza());
    }
}
