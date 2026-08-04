package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzdmu {
    private final zzfdc zza;
    private final Executor zzb;
    private final zzdpi zzc;
    private final zzdod zzd;
    private final Context zze;
    private final zzdsm zzf;
    private final zzfjv zzg;
    private final zzecn zzh;
    private final zzdsg zzi;
    private final zzdtp zzj;

    public zzdmu(zzfdc zzfdcVar, Executor executor, zzdpi zzdpiVar, Context context, zzdsm zzdsmVar, zzfjv zzfjvVar, zzecn zzecnVar, zzdod zzdodVar, zzdsg zzdsgVar, zzdtp zzdtpVar) {
        this.zza = zzfdcVar;
        this.zzb = executor;
        this.zzc = zzdpiVar;
        this.zze = context;
        this.zzf = zzdsmVar;
        this.zzg = zzfjvVar;
        this.zzh = zzecnVar;
        this.zzd = zzdodVar;
        this.zzi = zzdsgVar;
        this.zzj = zzdtpVar;
    }

    private final void zzh(zzcek zzcekVar, zzbzl zzbzlVar) {
        com.google.android.gms.ads.internal.client.zzga zzgaVar = this.zza.zza;
        if (zzgaVar != null && zzcekVar.zzh() != null) {
            zzcekVar.zzh().zzc(zzgaVar);
        }
        zzbzlVar.zzb();
    }

    private final void zzi(zzcek zzcekVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbxf zzbxfVar) {
        zzdtp zzdtpVar;
        zzj(zzcekVar);
        zzcekVar.zzab("/video", zzbjk.zzl);
        zzcekVar.zzab("/videoMeta", zzbjk.zzm);
        zzcekVar.zzab("/precache", new zzccr());
        zzcekVar.zzab("/delayPageLoaded", zzbjk.zzp);
        zzcekVar.zzab("/instrument", zzbjk.zzn);
        zzcekVar.zzab("/log", zzbjk.zzg);
        zzcekVar.zzab("/click", zzbjk.zzb(null, null));
        if (this.zza.zzb != null) {
            zzcekVar.zzP().zzR(true);
            zzcekVar.zzab("/open", new zzbjy(true != ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoq)).booleanValue() ? null : zzbVar, null, null, null, null, null));
        } else {
            zzcekVar.zzP().zzR(false);
        }
        if (com.google.android.gms.ads.internal.zzt.zzD().zza(zzcekVar.getContext())) {
            Map hashMap = new HashMap();
            if (zzcekVar.zzC() != null) {
                hashMap = zzcekVar.zzC().zzaw;
            }
            zzcekVar.zzab("/logScionEvent", new zzbjr(zzcekVar.getContext(), hashMap));
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoq)).booleanValue()) {
            zzcekVar.zzP().zzi(zzbVar);
            zzcekVar.zzP().zzj(zzbxfVar);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzio)).booleanValue() || (zzdtpVar = this.zzj) == null) {
            return;
        }
        zzcekVar.zzab("/onDeviceStorageEvent", new zzbjt(zzdtpVar));
    }

    private static final void zzj(zzcek zzcekVar) {
        zzcekVar.zzab("/videoClicked", zzbjk.zzh);
        zzcekVar.zzP().zzP(true);
        zzcekVar.zzab("/getNativeAdViewSignals", zzbjk.zzs);
        zzcekVar.zzab("/getNativeClickMeta", zzbjk.zzt);
    }

    public final ListenableFuture zza(final JSONObject jSONObject, final com.google.android.gms.ads.internal.zzb zzbVar, final zzbxf zzbxfVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcy)).booleanValue()) {
            this.zzi.zze().putLong(zzdru.NATIVE_ASSETS_LOADING_VIDEO_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        ListenableFuture zza = zzgot.zza(null);
        zzgob zzgobVar = new zzgob() { // from class: com.google.android.gms.internal.ads.zzdmp
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzdmu.this.zze(zzbVar, zzbxfVar, obj);
            }
        };
        Executor executor = this.zzb;
        return zzgot.zzj(zzgot.zzj(zza, zzgobVar, executor), new zzgob() { // from class: com.google.android.gms.internal.ads.zzdmt
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzdmu.this.zzc(jSONObject, (zzcek) obj);
            }
        }, executor);
    }

    public final ListenableFuture zzb(final String str, final String str2, final zzfcj zzfcjVar, final zzfcm zzfcmVar, final com.google.android.gms.ads.internal.client.zzr zzrVar, final com.google.android.gms.ads.internal.zzb zzbVar, final zzbxf zzbxfVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcy)).booleanValue()) {
            this.zzi.zze().putLong(zzdru.NATIVE_ASSETS_LOADING_VIDEO_COMPOSITION_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        return zzgot.zzj(zzgot.zza(null), new zzgob() { // from class: com.google.android.gms.internal.ads.zzdmo
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzdmu.this.zzd(zzrVar, zzfcjVar, zzfcmVar, zzbVar, zzbxfVar, str, str2, obj);
            }
        }, this.zzb);
    }

    final /* synthetic */ ListenableFuture zzc(JSONObject jSONObject, final zzcek zzcekVar) {
        zzblw zzblwVar = this.zza.zzb;
        final zzbzl zza = zzbzl.zza(zzcekVar);
        if (zzblwVar != null) {
            zzcekVar.zzaf(zzcgt.zze());
        } else {
            zzcekVar.zzaf(zzcgt.zzd());
        }
        zzcekVar.zzP().zzG(new zzcgg() { // from class: com.google.android.gms.internal.ads.zzdms
            @Override // com.google.android.gms.internal.ads.zzcgg
            public final /* synthetic */ void zza(boolean z, int i, String str, String str2) {
                zzdmu.this.zzg(zzcekVar, zza, z, i, str, str2);
            }
        });
        zzcekVar.zzb("google.afma.nativeAds.renderVideo", jSONObject);
        return zza;
    }

    final /* synthetic */ ListenableFuture zzd(com.google.android.gms.ads.internal.client.zzr zzrVar, zzfcj zzfcjVar, zzfcm zzfcmVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbxf zzbxfVar, String str, String str2, Object obj) {
        final zzcek zza = this.zzc.zza(zzrVar, zzfcjVar, zzfcmVar);
        final zzbzl zza2 = zzbzl.zza(zza);
        if (this.zza.zzb != null) {
            zzi(zza, zzbVar, zzbxfVar);
            zza.zzaf(zzcgt.zze());
        } else {
            zzdoa zza3 = this.zzd.zza();
            zzcgi zzP = zza.zzP();
            zzbbz zzbbzVar = zzbci.zzoq;
            zzP.zzZ(zza3, zza3, zza3, zza3, zza3, false, null, !((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).booleanValue() ? new com.google.android.gms.ads.internal.zzb(this.zze, null, null) : zzbVar, null, true != ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).booleanValue() ? null : zzbxfVar, this.zzh, this.zzg, this.zzf, null, zza3, null, null, null, null, this.zzj, null);
            zzj(zza);
        }
        zza.zzP().zzG(new zzcgg() { // from class: com.google.android.gms.internal.ads.zzdmr
            @Override // com.google.android.gms.internal.ads.zzcgg
            public final /* synthetic */ void zza(boolean z, int i, String str3, String str4) {
                zzdmu.this.zzf(zza, zza2, z, i, str3, str4);
            }
        });
        zza.zzau(str, str2, null);
        return zza2;
    }

    final /* synthetic */ ListenableFuture zze(com.google.android.gms.ads.internal.zzb zzbVar, zzbxf zzbxfVar, Object obj) {
        zzcek zza = this.zzc.zza(com.google.android.gms.ads.internal.client.zzr.zzb(), null, null);
        final zzbzl zza2 = zzbzl.zza(zza);
        zzi(zza, zzbVar, zzbxfVar);
        zza.zzP().zzH(new zzcgh() { // from class: com.google.android.gms.internal.ads.zzdmq
            @Override // com.google.android.gms.internal.ads.zzcgh
            public final /* synthetic */ void zza() {
                zzbzl.this.zzb();
            }
        });
        zza.loadUrl((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzej));
        return zza2;
    }

    final /* synthetic */ void zzf(zzcek zzcekVar, zzbzl zzbzlVar, boolean z, int i, String str, String str2) {
        if (z) {
            com.google.android.gms.ads.internal.client.zzga zzgaVar = this.zza.zza;
            if (zzgaVar != null && zzcekVar.zzh() != null) {
                zzcekVar.zzh().zzc(zzgaVar);
            }
            zzbzlVar.zzb();
            return;
        }
        int length = String.valueOf(i).length();
        StringBuilder sb = new StringBuilder(length + 63 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb.append("Html video Web View failed to load. Error code: ");
        sb.append(i);
        sb.append(", Description: ");
        sb.append(str);
        sb.append(", Failing URL: ");
        sb.append(str2);
        zzbzlVar.zzd(new zzeho(1, sb.toString()));
    }

    final /* synthetic */ void zzg(zzcek zzcekVar, zzbzl zzbzlVar, boolean z, int i, String str, String str2) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzer)).booleanValue()) {
            zzh(zzcekVar, zzbzlVar);
            return;
        }
        if (z) {
            zzh(zzcekVar, zzbzlVar);
            return;
        }
        int length = String.valueOf(i).length();
        StringBuilder sb = new StringBuilder(length + 64 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb.append("Native Video WebView failed to load. Error code: ");
        sb.append(i);
        sb.append(", Description: ");
        sb.append(str);
        sb.append(", Failing URL: ");
        sb.append(str2);
        zzbzlVar.zzd(new zzeho(1, sb.toString()));
    }
}
