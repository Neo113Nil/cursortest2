package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import com.bumptech.glide.load.Key;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdlw {
    private final zzdqu zza;
    private final zzdpj zzb;
    private final zzcqv zzc;
    private final zzdks zzd;

    public zzdlw(zzdqu zzdquVar, zzdpj zzdpjVar, zzcqv zzcqvVar, zzdks zzdksVar) {
        this.zza = zzdquVar;
        this.zzb = zzdpjVar;
        this.zzc = zzcqvVar;
        this.zzd = zzdksVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View zza() throws zzchg {
        zzcgv zza = this.zza.zza(com.google.android.gms.ads.internal.client.zzq.zzc(), null, null);
        View view = (View) zza;
        view.setVisibility(8);
        zza.zzad("/sendMessageToSdk", new zzbkd() { // from class: com.google.android.gms.internal.ads.zzdlr
            @Override // com.google.android.gms.internal.ads.zzbkd
            public final void zza(Object obj, Map map) {
                zzdlw.this.zzb((zzcgv) obj, map);
            }
        });
        zza.zzad("/adMuted", new zzbkd() { // from class: com.google.android.gms.internal.ads.zzdls
            @Override // com.google.android.gms.internal.ads.zzbkd
            public final void zza(Object obj, Map map) {
                zzdlw.this.zzc((zzcgv) obj, map);
            }
        });
        this.zzb.zzj(new WeakReference(zza), "/loadHtml", new zzbkd() { // from class: com.google.android.gms.internal.ads.zzdlt
            @Override // com.google.android.gms.internal.ads.zzbkd
            public final void zza(Object obj, final Map map) {
                zzcgv zzcgvVar = (zzcgv) obj;
                zzcii zzN = zzcgvVar.zzN();
                final zzdlw zzdlwVar = zzdlw.this;
                zzN.zzA(new zzcig() { // from class: com.google.android.gms.internal.ads.zzdlq
                    @Override // com.google.android.gms.internal.ads.zzcig
                    public final void zza(boolean z, int i, String str, String str2) {
                        zzdlw.this.zzd(map, z, i, str, str2);
                    }
                });
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    zzcgvVar.loadData(str, "text/html", Key.STRING_CHARSET_NAME);
                } else {
                    zzcgvVar.loadDataWithBaseURL(str2, str, "text/html", Key.STRING_CHARSET_NAME, null);
                }
            }
        });
        this.zzb.zzj(new WeakReference(zza), "/showOverlay", new zzbkd() { // from class: com.google.android.gms.internal.ads.zzdlu
            @Override // com.google.android.gms.internal.ads.zzbkd
            public final void zza(Object obj, Map map) {
                zzdlw.this.zze((zzcgv) obj, map);
            }
        });
        this.zzb.zzj(new WeakReference(zza), "/hideOverlay", new zzbkd() { // from class: com.google.android.gms.internal.ads.zzdlv
            @Override // com.google.android.gms.internal.ads.zzbkd
            public final void zza(Object obj, Map map) {
                zzdlw.this.zzf((zzcgv) obj, map);
            }
        });
        return view;
    }

    final /* synthetic */ void zzb(zzcgv zzcgvVar, Map map) {
        this.zzb.zzg("sendMessageToNativeJs", map);
    }

    final /* synthetic */ void zzc(zzcgv zzcgvVar, Map map) {
        this.zzd.zzg();
    }

    final /* synthetic */ void zzd(Map map, boolean z, int i, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "htmlLoaded");
        hashMap.put(FacebookMediationAdapter.KEY_ID, (String) map.get(FacebookMediationAdapter.KEY_ID));
        this.zzb.zzg("sendMessageToNativeJs", hashMap);
    }

    final /* synthetic */ void zze(zzcgv zzcgvVar, Map map) {
        zzcbn.zzi("Showing native ads overlay.");
        zzcgvVar.zzF().setVisibility(0);
        this.zzc.zze(true);
    }

    final /* synthetic */ void zzf(zzcgv zzcgvVar, Map map) {
        zzcbn.zzi("Hiding native ads overlay.");
        zzcgvVar.zzF().setVisibility(8);
        this.zzc.zze(false);
    }
}
