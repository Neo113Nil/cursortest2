package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdof {
    private final zzfeq zza;
    private final Executor zzb;
    private final zzdqu zzc;
    private final zzdpp zzd;
    private final Context zze;
    private final zzdtp zzf;
    private final zzfje zzg;
    private final zzfla zzh;
    private final zzeep zzi;

    public zzdof(zzfeq zzfeqVar, Executor executor, zzdqu zzdquVar, Context context, zzdtp zzdtpVar, zzfje zzfjeVar, zzfla zzflaVar, zzeep zzeepVar, zzdpp zzdppVar) {
        this.zza = zzfeqVar;
        this.zzb = executor;
        this.zzc = zzdquVar;
        this.zze = context;
        this.zzf = zzdtpVar;
        this.zzg = zzfjeVar;
        this.zzh = zzflaVar;
        this.zzi = zzeepVar;
        this.zzd = zzdppVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzh(zzcgv zzcgvVar) {
        zzi(zzcgvVar);
        zzcgvVar.zzad("/video", zzbkc.zzl);
        zzcgvVar.zzad("/videoMeta", zzbkc.zzm);
        zzcgvVar.zzad("/precache", new zzcfi());
        zzcgvVar.zzad("/delayPageLoaded", zzbkc.zzp);
        zzcgvVar.zzad("/instrument", zzbkc.zzn);
        zzcgvVar.zzad("/log", zzbkc.zzg);
        zzcgvVar.zzad("/click", new zzbjb(null, 0 == true ? 1 : 0));
        if (this.zza.zzb != null) {
            zzcgvVar.zzN().zzD(true);
            zzcgvVar.zzad("/open", new zzbko(null, null, null, null, null, null));
        } else {
            zzcgvVar.zzN().zzD(false);
        }
        if (com.google.android.gms.ads.internal.zzt.zzn().zzu(zzcgvVar.getContext())) {
            zzcgvVar.zzad("/logScionEvent", new zzbki(zzcgvVar.getContext()));
        }
    }

    private static final void zzi(zzcgv zzcgvVar) {
        zzcgvVar.zzad("/videoClicked", zzbkc.zzh);
        zzcgvVar.zzN().zzF(true);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzdD)).booleanValue()) {
            zzcgvVar.zzad("/getNativeAdViewSignals", zzbkc.zzs);
        }
        zzcgvVar.zzad("/getNativeClickMeta", zzbkc.zzt);
    }

    public final ListenableFuture zza(final JSONObject jSONObject) {
        return zzgbb.zzn(zzgbb.zzn(zzgbb.zzh(null), new zzgai() { // from class: com.google.android.gms.internal.ads.zzdnw
            @Override // com.google.android.gms.internal.ads.zzgai
            public final ListenableFuture zza(Object obj) {
                return zzdof.this.zze(obj);
            }
        }, this.zzb), new zzgai() { // from class: com.google.android.gms.internal.ads.zzdnv
            @Override // com.google.android.gms.internal.ads.zzgai
            public final ListenableFuture zza(Object obj) {
                return zzdof.this.zzc(jSONObject, (zzcgv) obj);
            }
        }, this.zzb);
    }

    public final ListenableFuture zzb(final String str, final String str2, final zzfdu zzfduVar, final zzfdy zzfdyVar, final com.google.android.gms.ads.internal.client.zzq zzqVar) {
        return zzgbb.zzn(zzgbb.zzh(null), new zzgai() { // from class: com.google.android.gms.internal.ads.zzdnu
            @Override // com.google.android.gms.internal.ads.zzgai
            public final ListenableFuture zza(Object obj) {
                return zzdof.this.zzd(zzqVar, zzfduVar, zzfdyVar, str, str2, obj);
            }
        }, this.zzb);
    }

    final /* synthetic */ ListenableFuture zzc(JSONObject jSONObject, final zzcgv zzcgvVar) throws Exception {
        final zzcce zza = zzcce.zza(zzcgvVar);
        if (this.zza.zzb != null) {
            zzcgvVar.zzag(zzcik.zzd());
        } else {
            zzcgvVar.zzag(zzcik.zze());
        }
        zzcgvVar.zzN().zzA(new zzcig() { // from class: com.google.android.gms.internal.ads.zzdnx
            @Override // com.google.android.gms.internal.ads.zzcig
            public final void zza(boolean z, int i, String str, String str2) {
                zzdof.this.zzf(zzcgvVar, zza, z, i, str, str2);
            }
        });
        zzcgvVar.zzl("google.afma.nativeAds.renderVideo", jSONObject);
        return zza;
    }

    final /* synthetic */ ListenableFuture zzd(com.google.android.gms.ads.internal.client.zzq zzqVar, zzfdu zzfduVar, zzfdy zzfdyVar, String str, String str2, Object obj) throws Exception {
        final zzcgv zza = this.zzc.zza(zzqVar, zzfduVar, zzfdyVar);
        final zzcce zza2 = zzcce.zza(zza);
        if (this.zza.zzb != null) {
            zzh(zza);
            zza.zzag(zzcik.zzd());
        } else {
            zzdpm zzb = this.zzd.zzb();
            zza.zzN().zzM(zzb, zzb, zzb, zzb, zzb, false, null, new com.google.android.gms.ads.internal.zzb(this.zze, null, null), null, null, this.zzi, this.zzh, this.zzf, this.zzg, null, zzb, null, null, null);
            zzi(zza);
        }
        zza.zzN().zzA(new zzcig() { // from class: com.google.android.gms.internal.ads.zzdny
            @Override // com.google.android.gms.internal.ads.zzcig
            public final void zza(boolean z, int i, String str3, String str4) {
                zzdof.this.zzg(zza, zza2, z, i, str3, str4);
            }
        });
        zza.zzab(str, str2, null);
        return zza2;
    }

    final /* synthetic */ ListenableFuture zze(Object obj) throws Exception {
        zzcgv zza = this.zzc.zza(com.google.android.gms.ads.internal.client.zzq.zzc(), null, null);
        final zzcce zza2 = zzcce.zza(zza);
        zzh(zza);
        zza.zzN().zzG(new zzcih() { // from class: com.google.android.gms.internal.ads.zzdnz
            @Override // com.google.android.gms.internal.ads.zzcih
            public final void zza() {
                zzcce.this.zzb();
            }
        });
        zza.loadUrl((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzdC));
        return zza2;
    }

    final /* synthetic */ void zzf(zzcgv zzcgvVar, zzcce zzcceVar, boolean z, int i, String str, String str2) {
        if (this.zza.zza != null && zzcgvVar.zzq() != null) {
            zzcgvVar.zzq().zzs(this.zza.zza);
        }
        zzcceVar.zzb();
    }

    final /* synthetic */ void zzg(zzcgv zzcgvVar, zzcce zzcceVar, boolean z, int i, String str, String str2) {
        if (z) {
            if (this.zza.zza != null && zzcgvVar.zzq() != null) {
                zzcgvVar.zzq().zzs(this.zza.zza);
            }
            zzcceVar.zzb();
            return;
        }
        zzcceVar.zzd(new zzejt(1, "Html video Web View failed to load. Error code: " + i + ", Description: " + str + ", Failing URL: " + str2));
    }
}
