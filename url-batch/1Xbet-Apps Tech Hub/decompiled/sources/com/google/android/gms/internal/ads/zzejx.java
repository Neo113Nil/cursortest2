package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzejx implements zzhdp {
    private final zzhec zza;
    private final zzhec zzb;
    private final zzhec zzc;
    private final zzhec zzd;
    private final zzhec zze;
    private final zzhec zzf;
    private final zzhec zzg;
    private final zzhec zzh;
    private final zzhec zzi;
    private final zzhec zzj;
    private final zzhec zzk;
    private final zzhec zzl;

    public zzejx(zzhec zzhecVar, zzhec zzhecVar2, zzhec zzhecVar3, zzhec zzhecVar4, zzhec zzhecVar5, zzhec zzhecVar6, zzhec zzhecVar7, zzhec zzhecVar8, zzhec zzhecVar9, zzhec zzhecVar10, zzhec zzhecVar11, zzhec zzhecVar12) {
        this.zza = zzhecVar;
        this.zzb = zzhecVar2;
        this.zzc = zzhecVar3;
        this.zzd = zzhecVar4;
        this.zze = zzhecVar5;
        this.zzf = zzhecVar6;
        this.zzg = zzhecVar7;
        this.zzh = zzhecVar8;
        this.zzi = zzhecVar9;
        this.zzj = zzhecVar10;
        this.zzk = zzhecVar11;
        this.zzl = zzhecVar12;
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzejw zzb() {
        Context zza = ((zzciw) this.zza).zza();
        zzfiu zzfiuVar = (zzfiu) this.zzb.zzb();
        zzejp zzejpVar = (zzejp) this.zzc.zzb();
        zzcyj zzcyjVar = (zzcyj) this.zzd.zzb();
        zzfkw zzfkwVar = (zzfkw) this.zze.zzb();
        zzfla zzflaVar = (zzfla) this.zzf.zzb();
        zzctu zzctuVar = (zzctu) this.zzg.zzb();
        zzgbl zzgblVar = zzcca.zza;
        zzhdx.zzb(zzgblVar);
        return new zzejw(zza, zzfiuVar, zzejpVar, zzcyjVar, zzfkwVar, zzflaVar, zzctuVar, zzgblVar, (ScheduledExecutorService) this.zzi.zzb(), (zzega) this.zzj.zzb(), (zzfkh) this.zzk.zzb(), ((zzejb) this.zzl).zzb());
    }
}
