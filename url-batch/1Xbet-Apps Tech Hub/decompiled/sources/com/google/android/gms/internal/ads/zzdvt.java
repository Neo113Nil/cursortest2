package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdvt implements zzhdp {
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

    public zzdvt(zzhec zzhecVar, zzhec zzhecVar2, zzhec zzhecVar3, zzhec zzhecVar4, zzhec zzhecVar5, zzhec zzhecVar6, zzhec zzhecVar7, zzhec zzhecVar8, zzhec zzhecVar9, zzhec zzhecVar10) {
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
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    public final /* bridge */ /* synthetic */ Object zzb() {
        Executor executor = (Executor) this.zza.zzb();
        Context zza = ((zzciw) this.zzb).zza();
        WeakReference zza2 = ((zzcix) this.zzc).zza();
        zzgbl zzgblVar = zzcca.zza;
        zzhdx.zzb(zzgblVar);
        return new zzdvs(executor, zza, zza2, zzgblVar, (zzdrk) this.zze.zzb(), (ScheduledExecutorService) this.zzf.zzb(), (zzdtz) this.zzg.zzb(), ((zzcji) this.zzh).zza(), ((zzdfe) this.zzi).zzb(), (zzfkk) this.zzj.zzb());
    }
}
