package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcqb implements zzhdp {
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
    private final zzhec zzm;
    private final zzhec zzn;
    private final zzhec zzo;

    public zzcqb(zzhec zzhecVar, zzhec zzhecVar2, zzhec zzhecVar3, zzhec zzhecVar4, zzhec zzhecVar5, zzhec zzhecVar6, zzhec zzhecVar7, zzhec zzhecVar8, zzhec zzhecVar9, zzhec zzhecVar10, zzhec zzhecVar11, zzhec zzhecVar12, zzhec zzhecVar13, zzhec zzhecVar14, zzhec zzhecVar15) {
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
        this.zzm = zzhecVar13;
        this.zzn = zzhecVar14;
        this.zzo = zzhecVar15;
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    public final /* synthetic */ Object zzb() {
        Context zza = ((zzciw) this.zza).zza();
        zzgbl zzgblVar = zzcca.zza;
        zzhdx.zzb(zzgblVar);
        return new zzcqa(zza, zzgblVar, (Executor) this.zzc.zzb(), (ScheduledExecutorService) this.zzd.zzb(), ((zzcul) this.zze).zza(), ((zzcui) this.zzf).zza(), (zzfkw) this.zzg.zzb(), (zzffa) this.zzh.zzb(), (View) this.zzi.zzb(), (zzcgv) this.zzj.zzb(), (zzasi) this.zzk.zzb(), (zzbee) this.zzl.zzb(), new zzbeg(), (zzfkh) this.zzn.zzb(), ((zzcxv) this.zzo).zza());
    }
}
