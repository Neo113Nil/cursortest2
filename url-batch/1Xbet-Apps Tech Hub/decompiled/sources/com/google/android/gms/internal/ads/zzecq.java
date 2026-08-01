package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.core.app.NotificationCompat;
import com.facebook.ads.AdSDKNotificationListener;
import com.google.android.gms.ads.MobileAds;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzecq implements zzdcz, com.google.android.gms.ads.internal.client.zza, zzczb, zzcyl {
    private final Context zza;
    private final zzffg zzb;
    private final zzfeh zzc;
    private final zzfdu zzd;
    private final zzeep zze;
    private Boolean zzf;
    private final boolean zzg = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzgQ)).booleanValue();
    private final zzfje zzh;
    private final String zzi;

    public zzecq(Context context, zzffg zzffgVar, zzfeh zzfehVar, zzfdu zzfduVar, zzeep zzeepVar, zzfje zzfjeVar, String str) {
        this.zza = context;
        this.zzb = zzffgVar;
        this.zzc = zzfehVar;
        this.zzd = zzfduVar;
        this.zze = zzeepVar;
        this.zzh = zzfjeVar;
        this.zzi = str;
    }

    private final zzfjd zzd(String str) {
        zzfjd zzb = zzfjd.zzb(str);
        zzb.zzh(this.zzc, null);
        zzb.zzf(this.zzd);
        zzb.zza("request_id", this.zzi);
        if (!this.zzd.zzu.isEmpty()) {
            zzb.zza("ancn", (String) this.zzd.zzu.get(0));
        }
        if (this.zzd.zzaj) {
            zzb.zza("device_connectivity", true != com.google.android.gms.ads.internal.zzt.zzo().zzz(this.zza) ? "offline" : CustomTabsCallback.ONLINE_EXTRAS_KEY);
            zzb.zza("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()));
            zzb.zza("offline_ad", "1");
        }
        return zzb;
    }

    private final void zze(zzfjd zzfjdVar) {
        if (!this.zzd.zzaj) {
            this.zzh.zzb(zzfjdVar);
            return;
        }
        this.zze.zzd(new zzeer(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis(), this.zzc.zzb.zzb.zzb, this.zzh.zza(zzfjdVar), 2));
    }

    private final boolean zzf() {
        String str;
        if (this.zzf == null) {
            synchronized (this) {
                if (this.zzf == null) {
                    String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzbr);
                    com.google.android.gms.ads.internal.zzt.zzp();
                    try {
                        str = com.google.android.gms.ads.internal.util.zzt.zzp(this.zza);
                    } catch (RemoteException unused) {
                        str = null;
                    }
                    boolean z = false;
                    if (str2 != null && str != null) {
                        try {
                            z = Pattern.matches(str2, str);
                        } catch (RuntimeException e) {
                            com.google.android.gms.ads.internal.zzt.zzo().zzw(e, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.zzf = Boolean.valueOf(z);
                }
            }
        }
        return this.zzf.booleanValue();
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (this.zzd.zzaj) {
            zze(zzd("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyl
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.client.zze zzeVar2;
        if (this.zzg) {
            int i = zzeVar.zza;
            String str = zzeVar.zzb;
            if (zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN) && (zzeVar2 = zzeVar.zzd) != null && !zzeVar2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                com.google.android.gms.ads.internal.client.zze zzeVar3 = zzeVar.zzd;
                i = zzeVar3.zza;
                str = zzeVar3.zzb;
            }
            String zza = this.zzb.zza(str);
            zzfjd zzd = zzd("ifts");
            zzd.zza("reason", "adapter");
            if (i >= 0) {
                zzd.zza("arec", String.valueOf(i));
            }
            if (zza != null) {
                zzd.zza("areec", zza);
            }
            this.zzh.zzb(zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyl
    public final void zzb() {
        if (this.zzg) {
            zzfje zzfjeVar = this.zzh;
            zzfjd zzd = zzd("ifts");
            zzd.zza("reason", "blocked");
            zzfjeVar.zzb(zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyl
    public final void zzc(zzdif zzdifVar) {
        if (this.zzg) {
            zzfjd zzd = zzd("ifts");
            zzd.zza("reason", "exception");
            if (!TextUtils.isEmpty(zzdifVar.getMessage())) {
                zzd.zza(NotificationCompat.CATEGORY_MESSAGE, zzdifVar.getMessage());
            }
            this.zzh.zzb(zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzi() {
        if (zzf()) {
            this.zzh.zzb(zzd("adapter_shown"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzj() {
        if (zzf()) {
            this.zzh.zzb(zzd("adapter_impression"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczb
    public final void zzq() {
        if (zzf() || this.zzd.zzaj) {
            zze(zzd(AdSDKNotificationListener.IMPRESSION_EVENT));
        }
    }
}
