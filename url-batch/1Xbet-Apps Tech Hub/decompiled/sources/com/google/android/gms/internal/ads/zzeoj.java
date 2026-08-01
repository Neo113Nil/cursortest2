package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzeoj implements zzeoc {
    private final zzfeo zza;
    private final zzciq zzb;
    private final Context zzc;
    private final zzenz zzd;
    private final zzfkk zze;
    private zzcug zzf;

    public zzeoj(zzciq zzciqVar, Context context, zzenz zzenzVar, zzfeo zzfeoVar) {
        this.zzb = zzciqVar;
        this.zzc = context;
        this.zzd = zzenzVar;
        this.zza = zzfeoVar;
        this.zze = zzciqVar.zzz();
        zzfeoVar.zzu(zzenzVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzeoc
    public final boolean zza() {
        zzcug zzcugVar = this.zzf;
        return zzcugVar != null && zzcugVar.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzeoc
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzeoa zzeoaVar, zzeob zzeobVar) throws RemoteException {
        zzfkh zzfkhVar;
        com.google.android.gms.ads.internal.zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzt.zzG(this.zzc) && zzlVar.zzs == null) {
            zzcbn.zzg("Failed to load the ad because app ID is missing.");
            this.zzb.zzB().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeoe
                @Override // java.lang.Runnable
                public final void run() {
                    zzeoj.this.zzf();
                }
            });
            return false;
        }
        if (str == null) {
            zzcbn.zzg("Ad unit ID should not be null for NativeAdLoader.");
            this.zzb.zzB().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeof
                @Override // java.lang.Runnable
                public final void run() {
                    zzeoj.this.zzg();
                }
            });
            return false;
        }
        zzffl.zza(this.zzc, zzlVar.zzf);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zziJ)).booleanValue() && zzlVar.zzf) {
            this.zzb.zzk().zzn(true);
        }
        int i = ((zzeod) zzeoaVar).zza;
        zzfeo zzfeoVar = this.zza;
        zzfeoVar.zzE(zzlVar);
        zzfeoVar.zzz(i);
        Context context = this.zzc;
        zzfeq zzG = zzfeoVar.zzG();
        zzfjw zzb = zzfjv.zzb(context, zzfkg.zzf(zzG), 8, zzlVar);
        com.google.android.gms.ads.internal.client.zzcb zzcbVar = zzG.zzn;
        if (zzcbVar != null) {
            this.zzd.zzd().zzm(zzcbVar);
        }
        zzdit zzh = this.zzb.zzh();
        zzcxp zzcxpVar = new zzcxp();
        zzcxpVar.zze(this.zzc);
        zzcxpVar.zzi(zzG);
        zzh.zzf(zzcxpVar.zzj());
        zzddw zzddwVar = new zzddw();
        zzddwVar.zzk(this.zzd.zzd(), this.zzb.zzB());
        zzh.zze(zzddwVar.zzn());
        zzh.zzd(this.zzd.zzc());
        zzh.zzc(new zzcrm(null));
        zzdiu zzg = zzh.zzg();
        if (((Boolean) zzbeo.zzc.zze()).booleanValue()) {
            zzfkh zzf = zzg.zzf();
            zzf.zzh(8);
            zzf.zzb(zzlVar.zzp);
            zzfkhVar = zzf;
        } else {
            zzfkhVar = null;
        }
        this.zzb.zzx().zzc(1);
        zzgbl zzgblVar = zzcca.zza;
        zzhdx.zzb(zzgblVar);
        ScheduledExecutorService zzC = this.zzb.zzC();
        zzcuz zza = zzg.zza();
        zzcug zzcugVar = new zzcug(zzgblVar, zzC, zza.zzi(zza.zzj()));
        this.zzf = zzcugVar;
        zzcugVar.zze(new zzeoi(this, zzeobVar, zzfkhVar, zzb, zzg));
        return true;
    }

    final /* synthetic */ void zzf() {
        this.zzd.zza().zzbG(zzffr.zzd(4, null, null));
    }

    final /* synthetic */ void zzg() {
        this.zzd.zza().zzbG(zzffr.zzd(6, null, null));
    }
}
