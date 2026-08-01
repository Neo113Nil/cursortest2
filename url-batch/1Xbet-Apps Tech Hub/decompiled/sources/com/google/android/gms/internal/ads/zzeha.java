package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzeha implements zzegb {
    private final Context zza;
    private final zzcsm zzb;
    private final Executor zzc;

    public zzeha(Context context, zzcsm zzcsmVar, Executor executor) {
        this.zza = context;
        this.zzb = zzcsmVar;
        this.zzc = executor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzegb
    public final /* bridge */ /* synthetic */ Object zza(zzfeh zzfehVar, final zzfdu zzfduVar, zzefy zzefyVar) throws zzfev, zzejt {
        final View zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzhH)).booleanValue() && zzfduVar.zzah) {
            zzbqa zzc = ((zzffm) zzefyVar.zzb).zzc();
            if (zzc == null) {
                zzcbn.zzg("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new zzfev(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
            try {
                zza = (View) ObjectWrapper.unwrap(zzc.zze());
                boolean zzf = zzc.zzf();
                if (zza == null) {
                    throw new zzfev(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                }
                if (zzf) {
                    try {
                        zza = (View) zzgbb.zzn(zzgbb.zzh(null), new zzgai() { // from class: com.google.android.gms.internal.ads.zzegy
                            @Override // com.google.android.gms.internal.ads.zzgai
                            public final ListenableFuture zza(Object obj) {
                                return zzeha.this.zzc(zza, zzfduVar, obj);
                            }
                        }, zzcca.zze).get();
                    } catch (InterruptedException | ExecutionException e) {
                        throw new zzfev(e);
                    }
                }
            } catch (RemoteException e2) {
                throw new zzfev(e2);
            }
        } else {
            zza = ((zzffm) zzefyVar.zzb).zza();
        }
        zzcsm zzcsmVar = this.zzb;
        zzcuh zzcuhVar = new zzcuh(zzfehVar, zzfduVar, zzefyVar.zza);
        final zzffm zzffmVar = (zzffm) zzefyVar.zzb;
        zzcrq zza2 = zzcsmVar.zza(zzcuhVar, new zzcrw(zza, null, new zzctp() { // from class: com.google.android.gms.internal.ads.zzegz
            @Override // com.google.android.gms.internal.ads.zzctp
            public final com.google.android.gms.ads.internal.client.zzdq zza() {
                return zzffm.this.zzb();
            }
        }, (zzfdv) zzfduVar.zzv.get(0)));
        zza2.zzg().zza(zza);
        zza2.zzd().zzo(new zzcpf((zzffm) zzefyVar.zzb), this.zzc);
        ((zzehr) zzefyVar.zzc).zzc(zza2.zzj());
        return zza2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzegb
    public final void zzb(zzfeh zzfehVar, zzfdu zzfduVar, zzefy zzefyVar) throws zzfev {
        com.google.android.gms.ads.internal.client.zzq zzqVar;
        com.google.android.gms.ads.internal.client.zzq zzqVar2 = zzfehVar.zza.zza.zze;
        if (zzqVar2.zzn) {
            zzqVar = new com.google.android.gms.ads.internal.client.zzq(this.zza, com.google.android.gms.ads.zzb.zzd(zzqVar2.zze, zzqVar2.zzb));
        } else {
            zzqVar = (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzhH)).booleanValue() && zzfduVar.zzah) ? new com.google.android.gms.ads.internal.client.zzq(this.zza, com.google.android.gms.ads.zzb.zze(zzqVar2.zze, zzqVar2.zzb)) : zzfeu.zza(this.zza, zzfduVar.zzv);
        }
        com.google.android.gms.ads.internal.client.zzq zzqVar3 = zzqVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzhH)).booleanValue() && zzfduVar.zzah) {
            Object obj = zzefyVar.zzb;
            ((zzffm) obj).zzn(this.zza, zzqVar3, zzfehVar.zza.zza.zzd, zzfduVar.zzw.toString(), com.google.android.gms.ads.internal.util.zzbw.zzl(zzfduVar.zzt), (zzbpx) zzefyVar.zzc);
            return;
        }
        Object obj2 = zzefyVar.zzb;
        ((zzffm) obj2).zzm(this.zza, zzqVar3, zzfehVar.zza.zza.zzd, zzfduVar.zzw.toString(), com.google.android.gms.ads.internal.util.zzbw.zzl(zzfduVar.zzt), (zzbpx) zzefyVar.zzc);
    }

    final /* synthetic */ ListenableFuture zzc(View view, zzfdu zzfduVar, Object obj) throws Exception {
        return zzgbb.zzh(zzctd.zza(this.zza, view, zzfduVar));
    }
}
