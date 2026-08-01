package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzegg implements zzefv {
    private final zzcrd zza;
    private final Context zzb;
    private final zzdqu zzc;
    private final zzfeq zzd;
    private final Executor zze;
    private final zzcbt zzf;
    private final zzbkf zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zziI)).booleanValue();
    private final zzefa zzi;

    public zzegg(zzcrd zzcrdVar, Context context, Executor executor, zzdqu zzdquVar, zzfeq zzfeqVar, zzcbt zzcbtVar, zzbkf zzbkfVar, zzefa zzefaVar) {
        this.zzb = context;
        this.zza = zzcrdVar;
        this.zze = executor;
        this.zzc = zzdquVar;
        this.zzd = zzfeqVar;
        this.zzf = zzcbtVar;
        this.zzg = zzbkfVar;
        this.zzi = zzefaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefv
    public final ListenableFuture zza(final zzfeh zzfehVar, final zzfdu zzfduVar) {
        final zzdqy zzdqyVar = new zzdqy();
        ListenableFuture zzn = zzgbb.zzn(zzgbb.zzh(null), new zzgai() { // from class: com.google.android.gms.internal.ads.zzegc
            @Override // com.google.android.gms.internal.ads.zzgai
            public final ListenableFuture zza(Object obj) {
                return zzegg.this.zzc(zzfduVar, zzfehVar, zzdqyVar, obj);
            }
        }, this.zze);
        zzn.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzegd
            @Override // java.lang.Runnable
            public final void run() {
                zzdqy.this.zzb();
            }
        }, this.zze);
        return zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzefv
    public final boolean zzb(zzfeh zzfehVar, zzfdu zzfduVar) {
        zzfea zzfeaVar = zzfduVar.zzt;
        return (zzfeaVar == null || zzfeaVar.zza == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ ListenableFuture zzc(final zzfdu zzfduVar, zzfeh zzfehVar, zzdqy zzdqyVar, Object obj) throws Exception {
        final zzcgv zza = this.zzc.zza(this.zzd.zze, zzfduVar, zzfehVar.zzb.zzb);
        zza.zzZ(zzfduVar.zzX);
        zzdqyVar.zza(this.zzb, (View) zza);
        zzccf zzccfVar = new zzccf();
        final zzcra zza2 = this.zza.zza(new zzcuh(zzfehVar, zzfduVar, null), new zzdhb(new zzegi(this.zzf, zzccfVar, zzfduVar, zza, this.zzd, this.zzh, this.zzg, this.zzi), zza), new zzcrb(zzfduVar.zzab));
        zza2.zzh().zzi(zza, false, this.zzh ? this.zzg : null);
        zzccfVar.zzc(zza2);
        zza2.zzc().zzo(new zzczb() { // from class: com.google.android.gms.internal.ads.zzege
            @Override // com.google.android.gms.internal.ads.zzczb
            public final void zzq() {
                zzcgv zzcgvVar = zzcgv.this;
                if (zzcgvVar.zzN() != null) {
                    zzcgvVar.zzN().zzq();
                }
            }
        }, zzcca.zzf);
        zza2.zzh();
        zzfea zzfeaVar = zzfduVar.zzt;
        return zzgbb.zzm(zzdqt.zzj(zza, zzfeaVar.zzb, zzfeaVar.zza), new zzftn() { // from class: com.google.android.gms.internal.ads.zzegf
            @Override // com.google.android.gms.internal.ads.zzftn
            public final Object apply(Object obj2) {
                zzcgv zzcgvVar = zza;
                if (zzfduVar.zzN) {
                    zzcgvVar.zzae();
                }
                zzcra zzcraVar = zza2;
                zzcgvVar.zzY();
                zzcgvVar.onPause();
                return zzcraVar.zza();
            }
        }, this.zze);
    }
}
