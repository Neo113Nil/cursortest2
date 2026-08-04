package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzcig extends zzevr {
    final zzhqg zza;
    final zzhqg zzb;
    final zzhqg zzc;
    final zzhqg zzd;
    final zzhqg zze;
    final zzhqg zzf;
    final zzhqg zzg;
    final zzhqg zzh;
    final zzhqg zzi;
    final zzhqg zzj;
    final zzhqg zzk;
    final zzhqg zzl;
    final zzhqg zzm;
    final zzhqg zzn;
    final zzhqg zzo;
    final zzhqg zzp;
    final zzhqg zzq;
    final zzhqg zzr;
    final zzhqg zzs;
    final zzhqg zzt;
    final zzhqg zzu;
    final zzhqg zzv;
    final zzhqg zzw;
    final zzhqg zzx;
    private final zzewu zzy;
    private final zzcih zzz;

    zzcig(zzcih zzcihVar, zzewu zzewuVar) {
        this.zzz = zzcihVar;
        this.zzy = zzewuVar;
        this.zza = zzhpw.zza(zzfic.zza(zzcihVar.zzB));
        zzeww zzc = zzeww.zzc(zzewuVar);
        this.zzb = zzc;
        zzewx zzc2 = zzewx.zzc(zzewuVar);
        this.zzc = zzc2;
        zzewy zzc3 = zzewy.zzc(zzewuVar);
        this.zzd = zzc3;
        zzckr zzckrVar = zzckq.zza;
        zzhqg zzhqgVar = zzcihVar.zzf;
        zzhqg zzhqgVar2 = zzcihVar.zzc;
        this.zze = zzevq.zza(zzckrVar, zzhqgVar, zzhqgVar2, zzfgc.zza(), zzc, zzc2, zzc3);
        this.zzf = zzewe.zza(zzckk.zza, zzfgc.zza(), zzhqgVar);
        zzewv zzc4 = zzewv.zzc(zzewuVar);
        this.zzg = zzc4;
        this.zzh = zzewm.zza(zzckm.zza, zzfgc.zza(), zzc4);
        this.zzi = zzewt.zza(zzcko.zza, zzhqgVar2, zzhqgVar);
        this.zzj = zzexl.zza(zzfgc.zza());
        zzexa zzc5 = zzexa.zzc(zzewuVar);
        this.zzk = zzc5;
        zzexb zzc6 = zzexb.zzc(zzewuVar);
        this.zzl = zzc6;
        zzhqg zzhqgVar3 = zzcihVar.zzau;
        this.zzm = zzexh.zza(zzhqgVar3, zzc3, zzcks.zza, zzfgc.zza(), zzc4, zzhqgVar2, zzc5, zzc6);
        this.zzn = zzewa.zza(zzc4, zzcki.zza, zzhqgVar3, zzhqgVar2, zzfgc.zza());
        zzewz zzc7 = zzewz.zzc(zzewuVar);
        this.zzo = zzc7;
        zzhqg zza = zzhpw.zza(zzdrg.zza());
        this.zzp = zza;
        zzhqg zza2 = zzhpw.zza(zzdre.zza());
        this.zzq = zza2;
        zzhqg zza3 = zzhpw.zza(zzdri.zza());
        this.zzr = zza3;
        zzhqg zza4 = zzhpw.zza(zzdrk.zza());
        this.zzs = zza4;
        zzhqa zzc8 = zzhqb.zzc(4);
        zzc8.zzb(zzfhb.GMS_SIGNALS, zza);
        zzc8.zzb(zzfhb.BUILD_URL, zza2);
        zzc8.zzb(zzfhb.HTTP, zza3);
        zzc8.zzb(zzfhb.PRE_PROCESS, zza4);
        zzhqb zzc9 = zzc8.zzc();
        this.zzt = zzc9;
        zzhqg zza5 = zzhpw.zza(zzdrl.zza(zzc7, zzcihVar.zzf, zzfgc.zza(), zzc9));
        this.zzu = zza5;
        zzhqi zza6 = zzhqj.zza(0, 1);
        zza6.zzb(zza5);
        zzhqj zzc10 = zza6.zzc();
        this.zzv = zzc10;
        zzfhk zzc11 = zzfhk.zzc(zzc10);
        this.zzw = zzc11;
        this.zzx = zzhpw.zza(zzfhj.zza(zzfgc.zza(), zzcihVar.zzc, zzc11));
    }

    final zzewo zza() {
        zzewu zzewuVar = this.zzy;
        zzbbs zza = zzckg.zza();
        zzgpd zzc = zzfgc.zzc();
        List zzd = zzewuVar.zzd();
        zzhqf.zzb(zzd);
        return new zzewo(zza, zzc, zzd);
    }

    final zzevu zzb() {
        zzewu zzewuVar = this.zzy;
        return new zzevu(zzckr.zza(), zzfgc.zzc(), zzewuVar.zzb(), zzewuVar.zzc(), zzewuVar.zzf());
    }

    @Override // com.google.android.gms.internal.ads.zzevr
    public final zzeus zzc() {
        zzewu zzewuVar = this.zzy;
        zzcih zzcihVar = this.zzz;
        Context zzd = zzchd.zzd(zzcihVar.zzG());
        zzgpd zzc = zzfgc.zzc();
        zzewk zzewkVar = new zzewk(zzckn.zza(), zzfgc.zzc(), zzewv.zzd(zzewuVar));
        zzhqg zzhqgVar = zzcihVar.zzc;
        return new zzeus(zzd, zzc, zzgke.zzm(new zzetb(zzewkVar, 0L, (ScheduledExecutorService) zzhqgVar.zzb()), new zzetb(new zzewr(zzckp.zza(), (ScheduledExecutorService) zzhqgVar.zzb(), zzchd.zzd(zzcihVar.zzG())), ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzeH)).longValue(), (ScheduledExecutorService) zzhqgVar.zzb()), new zzetb(zzevq.zzc(zzckr.zza(), zzchd.zzd(zzcihVar.zzG()), (ScheduledExecutorService) zzhqgVar.zzb(), zzfgc.zzc(), zzewuVar.zzf(), zzewx.zzd(zzewuVar), zzewy.zzd(zzewuVar)), 0L, (ScheduledExecutorService) zzhqgVar.zzb()), new zzetb(new zzexj(zzfgc.zzc()), 0L, (ScheduledExecutorService) zzhqgVar.zzb()), new zzewc(zzckl.zza(), zzfgc.zzc(), zzchd.zzd(zzcihVar.zzG())), zza(), zzb(), (zzeup) zzcihVar.zzby.zzb(), zzewa.zzc(zzewv.zzd(zzewuVar), zzckj.zza(), (zzbyv) zzcihVar.zzau.zzb(), (ScheduledExecutorService) zzhqgVar.zzb(), zzfgc.zzc())), (zzfib) this.zza.zzb(), (zzdsm) zzcihVar.zzl.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzevr
    public final zzeus zzd() {
        zzhqg zzhqgVar = this.zza;
        zzhqg zzhqgVar2 = this.zzn;
        zzhqg zzhqgVar3 = this.zzm;
        zzhqg zzhqgVar4 = this.zzj;
        zzhqg zzhqgVar5 = this.zzi;
        zzhqg zzhqgVar6 = this.zzh;
        zzhqg zzhqgVar7 = this.zzf;
        zzhqg zzhqgVar8 = this.zze;
        zzcih zzcihVar = this.zzz;
        return zzexc.zza(zzchd.zzd(zzcihVar.zzG()), zzckn.zza(), zzckt.zza(), zzcihVar.zzby.zzb(), zzb(), zza(), zzhpw.zzc(zzhqgVar8), zzhpw.zzc(zzhqgVar7), zzhpw.zzc(zzhqgVar6), zzhpw.zzc(zzhqgVar5), zzhpw.zzc(zzhqgVar4), zzhpw.zzc(zzhqgVar3), zzhpw.zzc(zzhqgVar2), zzfgc.zzc(), (zzfib) zzhqgVar.zzb(), (zzdsm) zzcihVar.zzl.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzevr
    public final zzfhh zze() {
        return (zzfhh) this.zzx.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzevr
    public final zzfib zzf() {
        return (zzfib) this.zza.zzb();
    }
}
