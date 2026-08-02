package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.MobileAds;
import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzdrp implements zzdbl, com.google.android.gms.ads.internal.client.zza, zzcxk, zzcwu {
    private final Context zza;
    private final zzffy zzb;
    private final zzdsk zzc;
    private final zzfex zzd;
    private final zzfel zze;
    private final zzedh zzf;
    private final String zzg;
    private Boolean zzh;
    private final boolean zzi = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzgg)).booleanValue();

    public zzdrp(Context context, zzffy zzffyVar, zzdsk zzdskVar, zzfex zzfexVar, zzfel zzfelVar, zzedh zzedhVar, String str) {
        this.zza = context;
        this.zzb = zzffyVar;
        this.zzc = zzdskVar;
        this.zzd = zzfexVar;
        this.zze = zzfelVar;
        this.zzf = zzedhVar;
        this.zzg = str;
    }

    private final zzdsj zzd(String str) {
        zzdsj zza = this.zzc.zza();
        zza.zzd(this.zzd.zzb.zzb);
        zza.zzc(this.zze);
        zza.zzb("action", str);
        zza.zzb("ad_format", this.zzg.toUpperCase(Locale.ROOT));
        if (!this.zze.zzt.isEmpty()) {
            zza.zzb("ancn", (String) this.zze.zzt.get(0));
        }
        if (this.zze.zzai) {
            zza.zzb("device_connectivity", true != com.google.android.gms.ads.internal.zzu.zzo().zzA(this.zza) ? "offline" : CustomTabsCallback.ONLINE_EXTRAS_KEY);
            zza.zzb("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis()));
            zza.zzb("offline_ad", "1");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzgo)).booleanValue()) {
            boolean z = com.google.android.gms.ads.nonagon.signalgeneration.zzq.zzf(this.zzd.zza.zza) != 1;
            zza.zzb("scar", String.valueOf(z));
            if (z) {
                com.google.android.gms.ads.internal.client.zzl zzlVar = this.zzd.zza.zza.zzd;
                zza.zzb("ragent", zzlVar.zzp);
                zza.zzb("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzq.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzq.zzc(zzlVar)));
            }
        }
        return zza;
    }

    private final void zze(zzdsj zzdsjVar) {
        if (!this.zze.zzai) {
            zzdsjVar.zzf();
            return;
        }
        this.zzf.zzd(new zzedj(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis(), this.zzd.zzb.zzb.zzb, zzdsjVar.zze(), 2));
    }

    private final boolean zzf() {
        String str;
        if (this.zzh == null) {
            synchronized (this) {
                if (this.zzh == null) {
                    String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzbj);
                    com.google.android.gms.ads.internal.zzu.zzp();
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
                            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.zzh = Boolean.valueOf(z);
                }
            }
        }
        return this.zzh.booleanValue();
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (this.zze.zzai) {
            zze(zzd("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwu
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.client.zze zzeVar2;
        if (this.zzi) {
            zzdsj zzd = zzd("ifts");
            zzd.zzb("reason", "adapter");
            int i = zzeVar.zza;
            String str = zzeVar.zzb;
            if (zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN) && (zzeVar2 = zzeVar.zzd) != null && !zzeVar2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                com.google.android.gms.ads.internal.client.zze zzeVar3 = zzeVar.zzd;
                i = zzeVar3.zza;
                str = zzeVar3.zzb;
            }
            if (i >= 0) {
                zzd.zzb("arec", String.valueOf(i));
            }
            String zza = this.zzb.zza(str);
            if (zza != null) {
                zzd.zzb("areec", zza);
            }
            zzd.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwu
    public final void zzb() {
        if (this.zzi) {
            zzdsj zzd = zzd("ifts");
            zzd.zzb("reason", "blocked");
            zzd.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwu
    public final void zzc(zzdgw zzdgwVar) {
        if (this.zzi) {
            zzdsj zzd = zzd("ifts");
            zzd.zzb("reason", "exception");
            if (!TextUtils.isEmpty(zzdgwVar.getMessage())) {
                zzd.zzb(NotificationCompat.CATEGORY_MESSAGE, zzdgwVar.getMessage());
            }
            zzd.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbl
    public final void zzi() {
        if (zzf()) {
            zzd("adapter_shown").zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbl
    public final void zzj() {
        if (zzf()) {
            zzd("adapter_impression").zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxk
    public final void zzr() {
        if (zzf() || this.zze.zzai) {
            zze(zzd("impression"));
        }
    }
}
