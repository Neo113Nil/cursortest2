package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzeks implements zzefv {
    private final Context zza;
    private final zzdqu zzb;
    private final zzdqd zzc;
    private final zzfeq zzd;
    private final Executor zze;
    private final zzcbt zzf;
    private final zzbkf zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zziI)).booleanValue();
    private final zzefa zzi;

    public zzeks(Context context, zzcbt zzcbtVar, zzfeq zzfeqVar, Executor executor, zzdqd zzdqdVar, zzdqu zzdquVar, zzbkf zzbkfVar, zzefa zzefaVar) {
        this.zza = context;
        this.zzd = zzfeqVar;
        this.zzc = zzdqdVar;
        this.zze = executor;
        this.zzf = zzcbtVar;
        this.zzb = zzdquVar;
        this.zzg = zzbkfVar;
        this.zzi = zzefaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefv
    public final ListenableFuture zza(final zzfeh zzfehVar, final zzfdu zzfduVar) {
        final zzdqy zzdqyVar = new zzdqy();
        ListenableFuture zzn = zzgbb.zzn(zzgbb.zzh(null), new zzgai() { // from class: com.google.android.gms.internal.ads.zzekl
            @Override // com.google.android.gms.internal.ads.zzgai
            public final ListenableFuture zza(Object obj) {
                return zzeks.this.zzc(zzfduVar, zzfehVar, zzdqyVar, obj);
            }
        }, this.zze);
        zzn.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzekm
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
        final zzcgv zza = this.zzb.zza(this.zzd.zze, zzfduVar, zzfehVar.zzb.zzb);
        zza.zzZ(zzfduVar.zzX);
        zzdqyVar.zza(this.zza, (View) zza);
        zzccf zzccfVar = new zzccf();
        final zzdpz zze = this.zzc.zze(new zzcuh(zzfehVar, zzfduVar, null), new zzdqa(new zzekr(this.zza, this.zzb, this.zzd, this.zzf, zzfduVar, zzccfVar, zza, this.zzg, this.zzh, this.zzi), zza));
        zzccfVar.zzc(zze);
        zzbku.zzb(zza, zze.zzg());
        zze.zzc().zzo(new zzczb() { // from class: com.google.android.gms.internal.ads.zzekn
            @Override // com.google.android.gms.internal.ads.zzczb
            public final void zzq() {
                zzcgv zzcgvVar = zzcgv.this;
                if (zzcgvVar.zzN() != null) {
                    zzcgvVar.zzN().zzq();
                }
            }
        }, zzcca.zzf);
        zze.zzl().zzi(zza, true, this.zzh ? this.zzg : null);
        zze.zzl();
        zzfea zzfeaVar = zzfduVar.zzt;
        return zzgbb.zzm(zzdqt.zzj(zza, zzfeaVar.zzb, zzfeaVar.zza), new zzftn() { // from class: com.google.android.gms.internal.ads.zzeko
            @Override // com.google.android.gms.internal.ads.zzftn
            public final Object apply(Object obj2) {
                zzcgv zzcgvVar = zza;
                if (zzfduVar.zzN) {
                    zzcgvVar.zzae();
                }
                zzdpz zzdpzVar = zze;
                zzcgvVar.zzY();
                zzcgvVar.onPause();
                return zzdpzVar.zzk();
            }
        }, this.zze);
    }
}
