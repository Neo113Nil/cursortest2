package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzegw implements zzefv {
    private final zzcsm zza;
    private final Context zzb;
    private final zzdqu zzc;
    private final zzfeq zzd;
    private final Executor zze;
    private final zzftn zzf;

    public zzegw(zzcsm zzcsmVar, Context context, Executor executor, zzdqu zzdquVar, zzfeq zzfeqVar, zzftn zzftnVar) {
        this.zzb = context;
        this.zza = zzcsmVar;
        this.zze = executor;
        this.zzc = zzdquVar;
        this.zzd = zzfeqVar;
        this.zzf = zzftnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefv
    public final ListenableFuture zza(final zzfeh zzfehVar, final zzfdu zzfduVar) {
        return zzgbb.zzn(zzgbb.zzh(null), new zzgai() { // from class: com.google.android.gms.internal.ads.zzegv
            @Override // com.google.android.gms.internal.ads.zzgai
            public final ListenableFuture zza(Object obj) {
                return zzegw.this.zzc(zzfehVar, zzfduVar, obj);
            }
        }, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzefv
    public final boolean zzb(zzfeh zzfehVar, zzfdu zzfduVar) {
        zzfea zzfeaVar = zzfduVar.zzt;
        return (zzfeaVar == null || zzfeaVar.zza == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ ListenableFuture zzc(zzfeh zzfehVar, zzfdu zzfduVar, Object obj) throws Exception {
        View zzdqxVar;
        com.google.android.gms.ads.internal.client.zzq zza = zzfeu.zza(this.zzb, zzfduVar.zzv);
        final zzcgv zza2 = this.zzc.zza(zza, zzfduVar, zzfehVar.zzb.zzb);
        zza2.zzZ(zzfduVar.zzX);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzhH)).booleanValue() && zzfduVar.zzah) {
            zzdqxVar = zzctd.zza(this.zzb, (View) zza2, zzfduVar);
        } else {
            zzdqxVar = new zzdqx(this.zzb, (View) zza2, (com.google.android.gms.ads.internal.util.zzau) this.zzf.apply(zzfduVar));
        }
        final zzcrq zza3 = this.zza.zza(new zzcuh(zzfehVar, zzfduVar, null), new zzcrw(zzdqxVar, zza2, new zzctp() { // from class: com.google.android.gms.internal.ads.zzegq
            @Override // com.google.android.gms.internal.ads.zzctp
            public final com.google.android.gms.ads.internal.client.zzdq zza() {
                return zzcgv.this.zzq();
            }
        }, zzfeu.zzb(zza)));
        zza3.zzh().zzi(zza2, false, null);
        zza3.zzc().zzo(new zzczb() { // from class: com.google.android.gms.internal.ads.zzegr
            @Override // com.google.android.gms.internal.ads.zzczb
            public final void zzq() {
                zzcgv zzcgvVar = zzcgv.this;
                if (zzcgvVar.zzN() != null) {
                    zzcgvVar.zzN().zzq();
                }
            }
        }, zzcca.zzf);
        zza3.zzh();
        zzfea zzfeaVar = zzfduVar.zzt;
        ListenableFuture zzj = zzdqt.zzj(zza2, zzfeaVar.zzb, zzfeaVar.zza);
        if (zzfduVar.zzN) {
            zzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzegs
                @Override // java.lang.Runnable
                public final void run() {
                    zzcgv.this.zzae();
                }
            }, this.zze);
        }
        zzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzegt
            @Override // java.lang.Runnable
            public final void run() {
                zzegw.this.zzd(zza2);
            }
        }, this.zze);
        return zzgbb.zzm(zzj, new zzftn() { // from class: com.google.android.gms.internal.ads.zzegu
            @Override // com.google.android.gms.internal.ads.zzftn
            public final Object apply(Object obj2) {
                return zzcrq.this.zza();
            }
        }, zzcca.zzf);
    }

    final /* synthetic */ void zzd(zzcgv zzcgvVar) {
        zzcgvVar.zzY();
        zzchr zzq = zzcgvVar.zzq();
        com.google.android.gms.ads.internal.client.zzfl zzflVar = this.zzd.zza;
        if (zzflVar == null || zzq == null) {
            return;
        }
        zzq.zzs(zzflVar);
    }
}
