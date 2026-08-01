package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import com.google.android.gms.internal.ads.zzasi;
import com.google.android.gms.internal.ads.zzcca;
import com.google.android.gms.internal.ads.zzciq;
import com.google.android.gms.internal.ads.zzciw;
import com.google.android.gms.internal.ads.zzcji;
import com.google.android.gms.internal.ads.zzdtu;
import com.google.android.gms.internal.ads.zzffn;
import com.google.android.gms.internal.ads.zzfla;
import com.google.android.gms.internal.ads.zzgbl;
import com.google.android.gms.internal.ads.zzhdp;
import com.google.android.gms.internal.ads.zzhdx;
import com.google.android.gms.internal.ads.zzhec;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzab implements zzhdp {
    private final zzhec zza;
    private final zzhec zzb;
    private final zzhec zzc;
    private final zzhec zzd;
    private final zzhec zze;
    private final zzhec zzf;
    private final zzhec zzg;
    private final zzhec zzh;
    private final zzhec zzi;

    public zzab(zzhec zzhecVar, zzhec zzhecVar2, zzhec zzhecVar3, zzhec zzhecVar4, zzhec zzhecVar5, zzhec zzhecVar6, zzhec zzhecVar7, zzhec zzhecVar8, zzhec zzhecVar9) {
        this.zza = zzhecVar;
        this.zzb = zzhecVar2;
        this.zzc = zzhecVar3;
        this.zzd = zzhecVar4;
        this.zze = zzhecVar5;
        this.zzf = zzhecVar6;
        this.zzg = zzhecVar7;
        this.zzh = zzhecVar8;
        this.zzi = zzhecVar9;
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzciq zzciqVar = (zzciq) this.zza.zzb();
        Context zza = ((zzciw) this.zzb).zza();
        zzasi zzasiVar = (zzasi) this.zzc.zzb();
        zzffn zzffnVar = (zzffn) this.zzd.zzb();
        zzgbl zzgblVar = zzcca.zza;
        zzhdx.zzb(zzgblVar);
        return new zzaa(zzciqVar, zza, zzasiVar, zzffnVar, zzgblVar, (ScheduledExecutorService) this.zzf.zzb(), (zzdtu) this.zzg.zzb(), (zzfla) this.zzh.zzb(), ((zzcji) this.zzi).zza());
    }
}
