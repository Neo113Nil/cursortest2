package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdpj {
    private final zzdow zza;
    private final com.google.android.gms.ads.internal.zza zzb;
    private final zzchh zzc;
    private final Context zzd;
    private final zzdtp zze;
    private final zzfje zzf;
    private final Executor zzg;
    private final zzasi zzh;
    private final zzcbt zzi;
    private final zzbks zzj;
    private final zzeep zzk;
    private final zzfla zzl;
    private final zzefa zzm;
    private ListenableFuture zzn;

    zzdpj(zzdpg zzdpgVar) {
        Context context;
        Executor executor;
        zzasi zzasiVar;
        zzcbt zzcbtVar;
        com.google.android.gms.ads.internal.zza zzaVar;
        zzchh zzchhVar;
        zzeep zzeepVar;
        zzfla zzflaVar;
        zzdtp zzdtpVar;
        zzfje zzfjeVar;
        zzefa zzefaVar;
        context = zzdpgVar.zzc;
        this.zzd = context;
        executor = zzdpgVar.zzg;
        this.zzg = executor;
        zzasiVar = zzdpgVar.zzh;
        this.zzh = zzasiVar;
        zzcbtVar = zzdpgVar.zzi;
        this.zzi = zzcbtVar;
        zzaVar = zzdpgVar.zza;
        this.zzb = zzaVar;
        this.zza = new zzdow();
        zzchhVar = zzdpgVar.zzb;
        this.zzc = zzchhVar;
        this.zzj = new zzbks();
        zzeepVar = zzdpgVar.zzf;
        this.zzk = zzeepVar;
        zzflaVar = zzdpgVar.zzj;
        this.zzl = zzflaVar;
        zzdtpVar = zzdpgVar.zzd;
        this.zze = zzdtpVar;
        zzfjeVar = zzdpgVar.zze;
        this.zzf = zzfjeVar;
        zzefaVar = zzdpgVar.zzk;
        this.zzm = zzefaVar;
    }

    final /* synthetic */ zzcgv zza(zzcgv zzcgvVar) {
        zzcgvVar.zzad("/result", this.zzj);
        zzcii zzN = zzcgvVar.zzN();
        com.google.android.gms.ads.internal.zzb zzbVar = new com.google.android.gms.ads.internal.zzb(this.zzd, null, null);
        zzeep zzeepVar = this.zzk;
        zzfla zzflaVar = this.zzl;
        zzdtp zzdtpVar = this.zze;
        zzfje zzfjeVar = this.zzf;
        zzdow zzdowVar = this.zza;
        zzN.zzM(null, zzdowVar, zzdowVar, zzdowVar, zzdowVar, false, null, zzbVar, null, null, zzeepVar, zzflaVar, zzdtpVar, zzfjeVar, null, null, null, null, null);
        return zzcgvVar;
    }

    final /* synthetic */ ListenableFuture zzc(String str, JSONObject jSONObject, zzcgv zzcgvVar) throws Exception {
        return this.zzj.zzb(zzcgvVar, str, jSONObject);
    }

    public final synchronized ListenableFuture zzd(final String str, final JSONObject jSONObject) {
        ListenableFuture listenableFuture = this.zzn;
        if (listenableFuture == null) {
            return zzgbb.zzh(null);
        }
        return zzgbb.zzn(listenableFuture, new zzgai() { // from class: com.google.android.gms.internal.ads.zzdox
            @Override // com.google.android.gms.internal.ads.zzgai
            public final ListenableFuture zza(Object obj) {
                return zzdpj.this.zzc(str, jSONObject, (zzcgv) obj);
            }
        }, this.zzg);
    }

    public final synchronized void zze(zzfdu zzfduVar, zzfdy zzfdyVar) {
        ListenableFuture listenableFuture = this.zzn;
        if (listenableFuture == null) {
            return;
        }
        zzgbb.zzr(listenableFuture, new zzdpd(this, zzfduVar, zzfdyVar), this.zzg);
    }

    public final synchronized void zzf() {
        ListenableFuture listenableFuture = this.zzn;
        if (listenableFuture == null) {
            return;
        }
        zzgbb.zzr(listenableFuture, new zzdoz(this), this.zzg);
        this.zzn = null;
    }

    public final synchronized void zzg(String str, Map map) {
        ListenableFuture listenableFuture = this.zzn;
        if (listenableFuture == null) {
            return;
        }
        zzgbb.zzr(listenableFuture, new zzdpc(this, "sendMessageToNativeJs", map), this.zzg);
    }

    public final synchronized void zzh() {
        final String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzdB);
        final Context context = this.zzd;
        final zzasi zzasiVar = this.zzh;
        final zzcbt zzcbtVar = this.zzi;
        final com.google.android.gms.ads.internal.zza zzaVar = this.zzb;
        final zzefa zzefaVar = this.zzm;
        ListenableFuture zzm = zzgbb.zzm(zzgbb.zzk(new zzgah() { // from class: com.google.android.gms.internal.ads.zzchf
            @Override // com.google.android.gms.internal.ads.zzgah
            public final ListenableFuture zza() {
                com.google.android.gms.ads.internal.zzt.zzz();
                Context context2 = context;
                zzcik zza = zzcik.zza();
                zzasi zzasiVar2 = zzasiVar;
                com.google.android.gms.ads.internal.zza zzaVar2 = zzaVar;
                zzcgv zza2 = zzchh.zza(context2, zza, "", false, false, zzasiVar2, null, zzcbtVar, null, null, zzaVar2, zzayp.zza(), null, null, zzefaVar);
                final zzcce zza3 = zzcce.zza(zza2);
                zza2.zzN().zzA(new zzcig() { // from class: com.google.android.gms.internal.ads.zzchd
                    @Override // com.google.android.gms.internal.ads.zzcig
                    public final void zza(boolean z, int i, String str2, String str3) {
                        zzcce.this.zzb();
                    }
                });
                zza2.loadUrl(str);
                return zza3;
            }
        }, zzcca.zze), new zzftn() { // from class: com.google.android.gms.internal.ads.zzdoy
            @Override // com.google.android.gms.internal.ads.zzftn
            public final Object apply(Object obj) {
                zzcgv zzcgvVar = (zzcgv) obj;
                zzdpj.this.zza(zzcgvVar);
                return zzcgvVar;
            }
        }, this.zzg);
        this.zzn = zzm;
        zzccd.zza(zzm, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void zzi(String str, zzbkd zzbkdVar) {
        ListenableFuture listenableFuture = this.zzn;
        if (listenableFuture == null) {
            return;
        }
        zzgbb.zzr(listenableFuture, new zzdpa(this, str, zzbkdVar), this.zzg);
    }

    public final void zzj(WeakReference weakReference, String str, zzbkd zzbkdVar) {
        zzi(str, new zzdpi(this, weakReference, str, zzbkdVar, null));
    }

    public final synchronized void zzk(String str, zzbkd zzbkdVar) {
        ListenableFuture listenableFuture = this.zzn;
        if (listenableFuture == null) {
            return;
        }
        zzgbb.zzr(listenableFuture, new zzdpb(this, str, zzbkdVar), this.zzg);
    }
}
