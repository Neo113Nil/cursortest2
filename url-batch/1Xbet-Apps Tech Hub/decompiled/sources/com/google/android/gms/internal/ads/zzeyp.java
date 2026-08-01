package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzeyp implements zzhdp {
    private final zzhec zza;
    private final zzhec zzb;
    private final zzhec zzc;
    private final zzhec zzd;
    private final zzhec zze;
    private final zzhec zzf;
    private final zzhec zzg;

    public zzeyp(zzhec zzhecVar, zzhec zzhecVar2, zzhec zzhecVar3, zzhec zzhecVar4, zzhec zzhecVar5, zzhec zzhecVar6, zzhec zzhecVar7) {
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
        zzcaw zzcawVar = (zzcaw) this.zza.zzb();
        boolean booleanValue = ((zzeyd) this.zzb).zzb().booleanValue();
        boolean booleanValue2 = ((zzeye) this.zzc).zzb().booleanValue();
        zzcal zzcalVar = new zzcal();
        zzgbl zzgblVar = zzcca.zza;
        zzhdx.zzb(zzgblVar);
        return new zzeyn(zzcawVar, booleanValue, booleanValue2, zzcalVar, zzgblVar, ((zzeya) this.zzf).zza(), (ScheduledExecutorService) this.zzg.zzb());
    }
}
