package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzcke extends zzewl {
    private final zzexs zza;
    private final zzckm zzb;
    private final zzcke zzc = this;
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

    /* synthetic */ zzcke(zzckm zzckmVar, zzexs zzexsVar, zzckd zzckdVar) {
        zzhec zzhecVar;
        zzhec zzhecVar2;
        zzhec zzhecVar3;
        this.zzb = zzckmVar;
        this.zza = zzexsVar;
        zzexu zzexuVar = new zzexu(zzexsVar);
        this.zzd = zzexuVar;
        zzhec zzc = zzhdo.zzc(zzdso.zza());
        this.zze = zzc;
        zzhec zzc2 = zzhdo.zzc(zzdsm.zza());
        this.zzf = zzc2;
        zzhec zzc3 = zzhdo.zzc(zzdsq.zza());
        this.zzg = zzc3;
        zzhec zzc4 = zzhdo.zzc(zzdss.zza());
        this.zzh = zzc4;
        zzhds zzc5 = zzhdt.zzc(4);
        zzc5.zzb(zzfio.GMS_SIGNALS, zzc);
        zzc5.zzb(zzfio.BUILD_URL, zzc2);
        zzc5.zzb(zzfio.HTTP, zzc3);
        zzc5.zzb(zzfio.PRE_PROCESS, zzc4);
        zzhdt zzc6 = zzc5.zzc();
        this.zzi = zzc6;
        zzhecVar = zzckmVar.zzg;
        zzhec zzc7 = zzhdo.zzc(new zzdst(zzexuVar, zzhecVar, zzfhp.zza(), zzc6));
        this.zzj = zzc7;
        zzhdz zza = zzhea.zza(0, 1);
        zza.zza(zzc7);
        zzhea zzc8 = zza.zzc();
        this.zzk = zzc8;
        zzfix zzfixVar = new zzfix(zzc8);
        this.zzl = zzfixVar;
        zzfhp zza2 = zzfhp.zza();
        zzhecVar2 = zzckmVar.zzm;
        this.zzm = zzhdo.zzc(new zzfiw(zza2, zzhecVar2, zzfixVar));
        zzhecVar3 = zzckmVar.zzG;
        this.zzn = zzhdo.zzc(new zzfki(zzhecVar3));
    }

    @Override // com.google.android.gms.internal.ads.zzewl
    public final zzevb zza() {
        zzcit zzcitVar;
        zzhec zzhecVar;
        zzhec zzhecVar2;
        zzcitVar = this.zzb.zza;
        Context zza = zzcitVar.zza();
        zzhdx.zzb(zza);
        zzcak zzcakVar = new zzcak();
        zzgbl zzgblVar = zzcca.zza;
        zzhdx.zzb(zzgblVar);
        zzexm zzexmVar = new zzexm(zzcakVar, zzgblVar, zzext.zza(this.zza));
        zzgbl zzgblVar2 = zzcca.zza;
        zzhdx.zzb(zzgblVar2);
        zzhecVar = this.zzb.zzm;
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) zzhecVar.zzb();
        zzfkh zzfkhVar = (zzfkh) this.zzn.zzb();
        zzhecVar2 = this.zzb.zzZ;
        zzdtp zzdtpVar = (zzdtp) zzhecVar2.zzb();
        HashSet hashSet = new HashSet();
        hashSet.add(new zzetg(zzexmVar, 0L, scheduledExecutorService));
        return new zzevb(zza, zzgblVar2, hashSet, zzfkhVar, zzdtpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzewl
    public final zzfiu zzb() {
        return (zzfiu) this.zzm.zzb();
    }
}
