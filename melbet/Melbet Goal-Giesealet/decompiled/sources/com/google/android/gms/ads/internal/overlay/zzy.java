package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbzh;
import com.google.android.gms.internal.ads.zzcek;
import com.google.android.gms.internal.ads.zzgeq;
import com.google.android.gms.internal.ads.zzger;
import com.google.android.gms.internal.ads.zzges;
import com.google.android.gms.internal.ads.zzget;
import com.google.android.gms.internal.ads.zzgfm;
import com.google.android.gms.internal.ads.zzgfo;
import com.google.android.gms.internal.ads.zzgfp;
import com.google.android.gms.internal.ads.zzgfq;
import com.google.android.gms.internal.ads.zzgfr;
import com.google.android.gms.internal.ads.zzgge;
import io.invertase.googlemobileads.ReactNativeGoogleMobileAdsEvent;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzy {
    private zzgfp zzf;
    private zzcek zzc = null;
    private boolean zze = false;
    private String zza = null;
    private zzges zzd = null;
    private String zzb = null;

    private final void zzl() {
        if (this.zzf == null) {
            this.zzf = new zzw(this);
        }
    }

    private final zzgfr zzm() {
        zzgfq zzc = zzgfr.zzc();
        if (!((Boolean) zzbd.zzc().zzd(zzbci.zzmn)).booleanValue() || TextUtils.isEmpty(this.zzb)) {
            String str = this.zza;
            if (str != null) {
                zzc.zza(str);
            } else {
                zzg("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzc.zzb(this.zzb);
        }
        return zzc.zzc();
    }

    public final synchronized void zza(zzcek zzcekVar, Context context) {
        this.zzc = zzcekVar;
        if (!zzb(context)) {
            zzg("Unable to bind", "on_play_store_bind");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("action", "fetch_completed");
        zzi("on_play_store_bind", hashMap);
    }

    public final synchronized boolean zzb(Context context) {
        if (!zzgge.zza(context)) {
            return false;
        }
        try {
            this.zzd = zzget.zza(context);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Error connecting LMD Overlay service");
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "LastMileDeliveryOverlay.bindLastMileDeliveryService");
        }
        if (this.zzd == null) {
            this.zze = false;
            return false;
        }
        zzl();
        this.zze = true;
        return true;
    }

    public final void zzc(zzcek zzcekVar, zzgfm zzgfmVar) {
        if (zzcekVar == null) {
            zzg("adWebview missing", "onLMDShow");
            return;
        }
        this.zzc = zzcekVar;
        if (!this.zze && !zzb(zzcekVar.getContext())) {
            zzg("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((Boolean) zzbd.zzc().zzd(zzbci.zzmn)).booleanValue()) {
            this.zzb = zzgfmVar.zzb();
        }
        zzl();
        zzges zzgesVar = this.zzd;
        if (zzgesVar != null) {
            zzgesVar.zza(zzgfmVar, this.zzf);
        }
    }

    public final void zzd() {
        zzges zzgesVar;
        if (!this.zze || (zzgesVar = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
        } else {
            zzgesVar.zzd(zzm(), this.zzf);
            zzh("onLMDOverlayExpand");
        }
    }

    public final void zze() {
        zzges zzgesVar;
        if (!this.zze || (zzgesVar = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
        } else {
            zzgesVar.zzc(zzm(), this.zzf);
            zzh("onLMDOverlayCollapse");
        }
    }

    public final void zzf() {
        zzges zzgesVar;
        if (!this.zze || (zzgesVar = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
            return;
        }
        zzgeq zzc = zzger.zzc();
        if (!((Boolean) zzbd.zzc().zzd(zzbci.zzmn)).booleanValue() || TextUtils.isEmpty(this.zzb)) {
            String str = this.zza;
            if (str != null) {
                zzc.zza(str);
            } else {
                zzg("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzc.zzb(this.zzb);
        }
        zzgesVar.zzb(zzc.zzc(), this.zzf);
    }

    final void zzg(String str, String str2) {
        com.google.android.gms.ads.internal.util.zze.zza(str);
        if (this.zzc != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("message", str);
            hashMap.put("action", str2);
            zzi("onError", hashMap);
        }
    }

    final void zzh(String str) {
        zzi(str, new HashMap());
    }

    final void zzi(final String str, final Map map) {
        zzbzh.zzf.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzx
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzy.this.zzk(str, map);
            }
        });
    }

    final void zzj(zzgfo zzgfoVar) {
        if (!TextUtils.isEmpty(zzgfoVar.zzb())) {
            if (!((Boolean) zzbd.zzc().zzd(zzbci.zzmn)).booleanValue()) {
                this.zza = zzgfoVar.zzb();
            }
        }
        switch (zzgfoVar.zza()) {
            case 8152:
                zzh("onLMDOverlayOpened");
                break;
            case 8153:
                zzh("onLMDOverlayClicked");
                break;
            case 8155:
                zzh("onLMDOverlayClose");
                break;
            case 8157:
                this.zza = null;
                this.zzb = null;
                this.zze = false;
                break;
            case 8160:
            case 8161:
            case 8162:
                HashMap hashMap = new HashMap();
                hashMap.put(ReactNativeGoogleMobileAdsEvent.GOOGLE_MOBILE_ADS_EVENT_ERROR, String.valueOf(zzgfoVar.zza()));
                zzi("onLMDOverlayFailedToOpen", hashMap);
                break;
        }
    }

    final /* synthetic */ void zzk(String str, Map map) {
        zzcek zzcekVar = this.zzc;
        if (zzcekVar != null) {
            zzcekVar.zze(str, map);
        }
    }
}
