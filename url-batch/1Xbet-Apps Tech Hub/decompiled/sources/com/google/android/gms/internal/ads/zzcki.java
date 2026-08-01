package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzcki extends zzewn {
    private final zzewb zza;
    private final zzckm zzb;
    private final zzcki zzc = this;
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

    /* synthetic */ zzcki(zzckm zzckmVar, zzewb zzewbVar, zzckh zzckhVar) {
        zzhec zzhecVar;
        zzhec zzhecVar2;
        zzhec zzhecVar3;
        this.zzb = zzckmVar;
        this.zza = zzewbVar;
        zzhecVar = zzckmVar.zzG;
        this.zzd = zzhdo.zzc(new zzfki(zzhecVar));
        zzewj zzewjVar = new zzewj(zzewbVar);
        this.zze = zzewjVar;
        zzhec zzc = zzhdo.zzc(zzdso.zza());
        this.zzf = zzc;
        zzhec zzc2 = zzhdo.zzc(zzdsm.zza());
        this.zzg = zzc2;
        zzhec zzc3 = zzhdo.zzc(zzdsq.zza());
        this.zzh = zzc3;
        zzhec zzc4 = zzhdo.zzc(zzdss.zza());
        this.zzi = zzc4;
        zzhds zzc5 = zzhdt.zzc(4);
        zzc5.zzb(zzfio.GMS_SIGNALS, zzc);
        zzc5.zzb(zzfio.BUILD_URL, zzc2);
        zzc5.zzb(zzfio.HTTP, zzc3);
        zzc5.zzb(zzfio.PRE_PROCESS, zzc4);
        zzhdt zzc6 = zzc5.zzc();
        this.zzj = zzc6;
        zzhecVar2 = zzckmVar.zzg;
        zzhec zzc7 = zzhdo.zzc(new zzdst(zzewjVar, zzhecVar2, zzfhp.zza(), zzc6));
        this.zzk = zzc7;
        zzhdz zza = zzhea.zza(0, 1);
        zza.zza(zzc7);
        zzhea zzc8 = zza.zzc();
        this.zzl = zzc8;
        zzfix zzfixVar = new zzfix(zzc8);
        this.zzm = zzfixVar;
        zzfhp zza2 = zzfhp.zza();
        zzhecVar3 = zzckmVar.zzm;
        this.zzn = zzhdo.zzc(new zzfiw(zza2, zzhecVar3, zzfixVar));
    }

    @Override // com.google.android.gms.internal.ads.zzewn
    public final zzevb zza() {
        zzcit zzcitVar;
        zzhec zzhecVar;
        zzhec zzhecVar2;
        zzcit zzcitVar2;
        zzhec zzhecVar3;
        zzcit zzcitVar3;
        zzhec zzhecVar4;
        zzhec zzhecVar5;
        zzhec zzhecVar6;
        zzcit zzcitVar4;
        zzcit zzcitVar5;
        zzcit zzcitVar6;
        zzhec zzhecVar7;
        zzhec zzhecVar8;
        zzhec zzhecVar9;
        zzhec zzhecVar10;
        zzhec zzhecVar11;
        zzhec zzhecVar12;
        zzcitVar = this.zzb.zza;
        Context zza = zzcitVar.zza();
        zzhdx.zzb(zza);
        zzgbl zzgblVar = zzcca.zza;
        zzhdx.zzb(zzgblVar);
        zzcak zzcakVar = new zzcak();
        zzgbl zzgblVar2 = zzcca.zza;
        zzhdx.zzb(zzgblVar2);
        zzexm zzexmVar = new zzexm(zzcakVar, zzgblVar2, zzewc.zza(this.zza));
        zzesy zza2 = zzeta.zza();
        zzhecVar = this.zzb.zzm;
        zzeuy zza3 = zzeyi.zza(zzexmVar, zza2, (ScheduledExecutorService) zzhecVar.zzb(), 0);
        zzbtt zzbttVar = new zzbtt();
        zzhecVar2 = this.zzb.zzm;
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) zzhecVar2.zzb();
        zzcitVar2 = this.zzb.zza;
        Context zza4 = zzcitVar2.zza();
        zzhdx.zzb(zza4);
        zzexw zzexwVar = new zzexw(zzbttVar, scheduledExecutorService, zza4);
        zzhecVar3 = this.zzb.zzm;
        zzeuy zzb = zzeyi.zzb(zzexwVar, (ScheduledExecutorService) zzhecVar3.zzb());
        zzcan zzcanVar = new zzcan();
        zzcitVar3 = this.zzb.zza;
        Context zza5 = zzcitVar3.zza();
        zzhdx.zzb(zza5);
        zzhecVar4 = this.zzb.zzm;
        ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) zzhecVar4.zzb();
        zzgbl zzgblVar3 = zzcca.zza;
        zzhdx.zzb(zzgblVar3);
        zzewb zzewbVar = this.zza;
        zzevt zza6 = zzevv.zza(zzcanVar, zza5, scheduledExecutorService2, zzgblVar3, zzewd.zza(zzewbVar), zzewf.zza(zzewbVar), zzewg.zza(zzewbVar));
        zzhecVar5 = this.zzb.zzm;
        zzeuy zza7 = zzeyj.zza(zza6, (ScheduledExecutorService) zzhecVar5.zzb());
        zzgbl zzgblVar4 = zzcca.zza;
        zzhdx.zzb(zzgblVar4);
        zzeyr zzeyrVar = new zzeyr(zzgblVar4);
        zzhecVar6 = this.zzb.zzm;
        zzeuy zzc = zzeyi.zzc(zzeyrVar, (ScheduledExecutorService) zzhecVar6.zzb());
        zzeyg zzeygVar = zzeyg.zza;
        zzcitVar4 = this.zzb.zza;
        Context zza8 = zzcitVar4.zza();
        zzhdx.zzb(zza8);
        String zza9 = zzewc.zza(this.zza);
        zzgbl zzgblVar5 = zzcca.zza;
        zzhdx.zzb(zzgblVar5);
        zzewp zzewpVar = new zzewp(null, zza8, zza9, zzgblVar5);
        zzaye zzayeVar = new zzaye();
        zzgbl zzgblVar6 = zzcca.zza;
        zzhdx.zzb(zzgblVar6);
        zzcitVar5 = this.zzb.zza;
        Context zza10 = zzcitVar5.zza();
        zzhdx.zzb(zza10);
        zzbcn zzbcnVar = new zzbcn();
        zzgbl zzgblVar7 = zzcca.zza;
        zzhdx.zzb(zzgblVar7);
        zzcan zzcanVar2 = new zzcan();
        zzgbl zzgblVar8 = zzcca.zza;
        zzhdx.zzb(zzgblVar8);
        zzewb zzewbVar2 = this.zza;
        zzcan zzcanVar3 = new zzcan();
        zzewb zzewbVar3 = this.zza;
        zzckm zzckmVar = this.zzb;
        int zza11 = zzewd.zza(zzewbVar3);
        zzcitVar6 = zzckmVar.zza;
        Context zza12 = zzcitVar6.zza();
        zzhdx.zzb(zza12);
        zzhecVar7 = this.zzb.zzah;
        zzcaw zzcawVar = (zzcaw) zzhecVar7.zzb();
        zzhecVar8 = this.zzb.zzm;
        ScheduledExecutorService scheduledExecutorService3 = (ScheduledExecutorService) zzhecVar8.zzb();
        zzgbl zzgblVar9 = zzcca.zza;
        zzhdx.zzb(zzgblVar9);
        zzhecVar9 = this.zzb.zzaK;
        String zza13 = zzewc.zza(this.zza);
        zzaxs zzaxsVar = new zzaxs();
        zzhecVar10 = this.zzb.zzah;
        zzcaw zzcawVar2 = (zzcaw) zzhecVar10.zzb();
        zzhecVar11 = this.zzb.zzm;
        ScheduledExecutorService scheduledExecutorService4 = (ScheduledExecutorService) zzhecVar11.zzb();
        zzgbl zzgblVar10 = zzcca.zza;
        zzhdx.zzb(zzgblVar10);
        zzfwz zzp = zzfwz.zzp(zza3, zzb, zza7, zzc, zzeygVar, zzewpVar, new zzexe(zzayeVar, zzgblVar6, zza10), new zzexq(zzbcnVar, zzgblVar7, zzewe.zza(this.zza)), new zzevz(zzcanVar2, zzgblVar8, zzewh.zza(zzewbVar2), zzewi.zza(zzewbVar2), zzewd.zza(zzewbVar2)), new zzexa(zzcanVar3, zza11, zza12, zzcawVar, scheduledExecutorService3, zzgblVar9, zzewc.zza(this.zza)), (zzeuy) zzhecVar9.zzb(), zzeww.zza(zza13, zzaxsVar, zzcawVar2, scheduledExecutorService4, zzgblVar10));
        zzfkh zzfkhVar = (zzfkh) this.zzd.zzb();
        zzhecVar12 = this.zzb.zzZ;
        return new zzevb(zza, zzgblVar, zzp, zzfkhVar, (zzdtp) zzhecVar12.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzewn
    public final zzfiu zzb() {
        return (zzfiu) this.zzn.zzb();
    }
}
