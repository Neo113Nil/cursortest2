package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfaf implements zzgax {
    final /* synthetic */ zzeob zza;
    final /* synthetic */ zzfkh zzb;
    final /* synthetic */ zzfjw zzc;
    final /* synthetic */ zzcsm zzd;
    final /* synthetic */ zzfag zze;

    zzfaf(zzfag zzfagVar, zzeob zzeobVar, zzfkh zzfkhVar, zzfjw zzfjwVar, zzcsm zzcsmVar) {
        this.zze = zzfagVar;
        this.zza = zzeobVar;
        this.zzb = zzfkhVar;
        this.zzc = zzfjwVar;
        this.zzd = zzcsmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final void zza(Throwable th) {
        zzdaw zzdawVar;
        zzddd zzdddVar;
        zzfkk zzfkkVar;
        zzfkh zzfkhVar;
        Executor executor;
        final com.google.android.gms.ads.internal.client.zze zza = this.zzd.zzd().zza(th);
        synchronized (this.zze) {
            this.zze.zzl = null;
            this.zzd.zzf().zzbG(zza);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzhY)).booleanValue()) {
                executor = this.zze.zzb;
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfad
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzenm zzenmVar;
                        zzenmVar = zzfaf.this.zze.zzd;
                        zzenmVar.zzbG(zza);
                    }
                });
            }
            zzfag zzfagVar = this.zze;
            zzdawVar = zzfagVar.zzh;
            zzdddVar = zzfagVar.zzj;
            zzdawVar.zzd(zzdddVar.zzc());
            zzffl.zzb(zza.zza, th, "BannerAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbeo.zzc.zze()).booleanValue() || (zzfkhVar = this.zzb) == null) {
                zzfkkVar = this.zze.zzi;
                zzfjw zzfjwVar = this.zzc;
                zzfjwVar.zza(zza);
                zzfjwVar.zzg(th);
                zzfjwVar.zzf(false);
                zzfkkVar.zzb(zzfjwVar.zzl());
            } else {
                zzfkhVar.zzc(zza);
                zzfjw zzfjwVar2 = this.zzc;
                zzfjwVar2.zzg(th);
                zzfjwVar2.zzf(false);
                zzfkhVar.zza(zzfjwVar2);
                zzfkhVar.zzg();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        zzdaw zzdawVar;
        zzfkk zzfkkVar;
        zzfkh zzfkhVar;
        Executor executor;
        final zzenm zzenmVar;
        zzenm zzenmVar2;
        zzenq zzenqVar;
        zzcrp zzcrpVar = (zzcrp) obj;
        synchronized (this.zze) {
            this.zze.zzl = null;
            viewGroup = this.zze.zzf;
            viewGroup.removeAllViews();
            if (zzcrpVar.zzc() != null) {
                ViewParent parent = zzcrpVar.zzc().getParent();
                if (parent instanceof ViewGroup) {
                    zzcbn.zzj("Banner view provided from " + (zzcrpVar.zzl() != null ? zzcrpVar.zzl().zzg() : "") + " already has a parent view. Removing its old parent.");
                    ((ViewGroup) parent).removeView(zzcrpVar.zzc());
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzhY)).booleanValue()) {
                zzdcm zzn = zzcrpVar.zzn();
                zzenmVar2 = this.zze.zzd;
                zzn.zza(zzenmVar2);
                zzenqVar = this.zze.zze;
                zzn.zzc(zzenqVar);
            }
            viewGroup2 = this.zze.zzf;
            viewGroup2.addView(zzcrpVar.zzc());
            this.zza.zzb(zzcrpVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzhY)).booleanValue()) {
                zzfag zzfagVar = this.zze;
                executor = zzfagVar.zzb;
                zzenmVar = zzfagVar.zzd;
                zzenmVar.getClass();
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfae
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzenm.this.zzr();
                    }
                });
            }
            zzdawVar = this.zze.zzh;
            zzdawVar.zzd(zzcrpVar.zza());
            if (!((Boolean) zzbeo.zzc.zze()).booleanValue() || (zzfkhVar = this.zzb) == null) {
                zzfkkVar = this.zze.zzi;
                zzfjw zzfjwVar = this.zzc;
                zzfjwVar.zzb(zzcrpVar.zzp().zzb);
                zzfjwVar.zzd(zzcrpVar.zzl().zzg());
                zzfjwVar.zzf(true);
                zzfkkVar.zzb(zzfjwVar.zzl());
            } else {
                zzfkhVar.zzf(zzcrpVar.zzp().zzb);
                zzfkhVar.zze(zzcrpVar.zzl().zzg());
                zzfjw zzfjwVar2 = this.zzc;
                zzfjwVar2.zzf(true);
                zzfkhVar.zza(zzfjwVar2);
                zzfkhVar.zzg();
            }
        }
    }
}
