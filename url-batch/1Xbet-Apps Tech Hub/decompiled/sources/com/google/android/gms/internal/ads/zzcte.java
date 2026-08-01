package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.collection.ArrayMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcte implements zzczv, zzczb {
    private final Context zza;
    private final zzcgv zzb;
    private final zzfdu zzc;
    private final zzcbt zzd;
    private zzflf zze;
    private boolean zzf;

    public zzcte(Context context, zzcgv zzcgvVar, zzfdu zzfduVar, zzcbt zzcbtVar) {
        this.zza = context;
        this.zzb = zzcgvVar;
        this.zzc = zzfduVar;
        this.zzd = zzcbtVar;
    }

    private final synchronized void zza() {
        zzefq zzefqVar;
        zzefp zzefpVar;
        if (this.zzc.zzU && this.zzb != null) {
            if (com.google.android.gms.ads.internal.zzt.zzA().zzj(this.zza)) {
                zzcbt zzcbtVar = this.zzd;
                String str = zzcbtVar.zzb + "." + zzcbtVar.zzc;
                zzfet zzfetVar = this.zzc.zzW;
                String zza = zzfetVar.zza();
                if (zzfetVar.zzb() == 1) {
                    zzefpVar = zzefp.VIDEO;
                    zzefqVar = zzefq.DEFINED_BY_JAVASCRIPT;
                } else {
                    zzfdu zzfduVar = this.zzc;
                    zzefp zzefpVar2 = zzefp.HTML_DISPLAY;
                    zzefqVar = zzfduVar.zzf == 1 ? zzefq.ONE_PIXEL : zzefq.BEGIN_TO_RENDER;
                    zzefpVar = zzefpVar2;
                }
                zzflf zza2 = com.google.android.gms.ads.internal.zzt.zzA().zza(str, this.zzb.zzG(), "", "javascript", zza, zzefqVar, zzefpVar, this.zzc.zzam);
                this.zze = zza2;
                Object obj = this.zzb;
                if (zza2 != null) {
                    com.google.android.gms.ads.internal.zzt.zzA().zzh(this.zze, (View) obj);
                    this.zzb.zzap(this.zze);
                    com.google.android.gms.ads.internal.zzt.zzA().zzi(this.zze);
                    this.zzf = true;
                    this.zzb.zzd("onSdkLoaded", new ArrayMap());
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczb
    public final synchronized void zzq() {
        zzcgv zzcgvVar;
        if (!this.zzf) {
            zza();
        }
        if (!this.zzc.zzU || this.zze == null || (zzcgvVar = this.zzb) == null) {
            return;
        }
        zzcgvVar.zzd("onSdkImpression", new ArrayMap());
    }

    @Override // com.google.android.gms.internal.ads.zzczv
    public final synchronized void zzr() {
        if (this.zzf) {
            return;
        }
        zza();
    }
}
