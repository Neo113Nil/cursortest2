package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfbx implements zzeoc {
    private final Context zza;
    private final Executor zzb;
    private final zzciq zzc;
    private final zzenm zzd;
    private final zzfcx zze;
    private zzbea zzf;
    private final zzfkk zzg;
    private final zzfeo zzh;
    private ListenableFuture zzi;

    public zzfbx(Context context, Executor executor, zzciq zzciqVar, zzenm zzenmVar, zzfcx zzfcxVar, zzfeo zzfeoVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzciqVar;
        this.zzd = zzenmVar;
        this.zzh = zzfeoVar;
        this.zze = zzfcxVar;
        this.zzg = zzciqVar.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzeoc
    public final boolean zza() {
        ListenableFuture listenableFuture = this.zzi;
        return (listenableFuture == null || listenableFuture.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzeoc
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzeoa zzeoaVar, zzeob zzeobVar) {
        zzdhy zzh;
        zzfkh zzfkhVar;
        if (str == null) {
            zzcbn.zzg("Ad unit ID should not be null for interstitial ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfbr
                @Override // java.lang.Runnable
                public final void run() {
                    zzfbx.this.zzh();
                }
            });
            return false;
        }
        if (zza()) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zziJ)).booleanValue() && zzlVar.zzf) {
            this.zzc.zzk().zzn(true);
        }
        com.google.android.gms.ads.internal.client.zzq zzqVar = ((zzfbq) zzeoaVar).zza;
        zzfeo zzfeoVar = this.zzh;
        zzfeoVar.zzs(str);
        zzfeoVar.zzr(zzqVar);
        zzfeoVar.zzE(zzlVar);
        Context context = this.zza;
        zzfeq zzG = zzfeoVar.zzG();
        zzfjw zzb = zzfjv.zzb(context, zzfkg.zzf(zzG), 4, zzlVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzia)).booleanValue()) {
            zzdhx zzg = this.zzc.zzg();
            zzcxp zzcxpVar = new zzcxp();
            zzcxpVar.zze(this.zza);
            zzcxpVar.zzi(zzG);
            zzg.zze(zzcxpVar.zzj());
            zzddw zzddwVar = new zzddw();
            zzddwVar.zzj(this.zzd, this.zzb);
            zzddwVar.zzk(this.zzd, this.zzb);
            zzg.zzd(zzddwVar.zzn());
            zzg.zzc(new zzelv(this.zzf));
            zzh = zzg.zzh();
        } else {
            zzddw zzddwVar2 = new zzddw();
            zzfcx zzfcxVar = this.zze;
            if (zzfcxVar != null) {
                zzddwVar2.zze(zzfcxVar, this.zzb);
                zzddwVar2.zzf(this.zze, this.zzb);
                zzddwVar2.zzb(this.zze, this.zzb);
            }
            zzdhx zzg2 = this.zzc.zzg();
            zzcxp zzcxpVar2 = new zzcxp();
            zzcxpVar2.zze(this.zza);
            zzcxpVar2.zzi(zzG);
            zzg2.zze(zzcxpVar2.zzj());
            zzddwVar2.zzj(this.zzd, this.zzb);
            zzddwVar2.zze(this.zzd, this.zzb);
            zzddwVar2.zzf(this.zzd, this.zzb);
            zzddwVar2.zzb(this.zzd, this.zzb);
            zzddwVar2.zza(this.zzd, this.zzb);
            zzddwVar2.zzl(this.zzd, this.zzb);
            zzddwVar2.zzk(this.zzd, this.zzb);
            zzddwVar2.zzi(this.zzd, this.zzb);
            zzddwVar2.zzc(this.zzd, this.zzb);
            zzg2.zzd(zzddwVar2.zzn());
            zzg2.zzc(new zzelv(this.zzf));
            zzh = zzg2.zzh();
        }
        zzdhy zzdhyVar = zzh;
        if (((Boolean) zzbeo.zzc.zze()).booleanValue()) {
            zzfkh zzf = zzdhyVar.zzf();
            zzf.zzh(4);
            zzf.zzb(zzlVar.zzp);
            zzfkhVar = zzf;
        } else {
            zzfkhVar = null;
        }
        zzcuz zza = zzdhyVar.zza();
        ListenableFuture zzi = zza.zzi(zza.zzj());
        this.zzi = zzi;
        zzgbb.zzr(zzi, new zzfbw(this, zzeobVar, zzfkhVar, zzb, zzdhyVar), this.zzb);
        return true;
    }

    final /* synthetic */ void zzh() {
        this.zzd.zzbG(zzffr.zzd(6, null, null));
    }

    public final void zzi(zzbea zzbeaVar) {
        this.zzf = zzbeaVar;
    }
}
