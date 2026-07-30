package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsCallback;
import com.facebook.ads.AdSDKNotificationListener;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.ads.MobileAds;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzdxd implements zzdgh, com.google.android.gms.ads.internal.client.zza, zzdbz, zzdbj, zzdea {
    private final Context zzc;
    private final zzfkd zzd;
    private final zzdxz zze;
    private final zzfjc zzf;
    private final zzfir zzg;
    private final zzeiu zzh;
    private final String zzi;
    private Boolean zzk;
    private long zzj = -1;
    final AtomicBoolean zza = new AtomicBoolean(false);
    final AtomicBoolean zzb = new AtomicBoolean(false);
    private final boolean zzl = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhK)).booleanValue();

    public zzdxd(Context context, zzfkd zzfkdVar, zzdxz zzdxzVar, zzfjc zzfjcVar, zzfir zzfirVar, zzeiu zzeiuVar, String str) {
        this.zzc = context;
        this.zzd = zzfkdVar;
        this.zze = zzdxzVar;
        this.zzf = zzfjcVar;
        this.zzg = zzfirVar;
        this.zzh = zzeiuVar;
        this.zzi = str;
    }

    private final boolean zzf() {
        String str;
        if (this.zzk == null) {
            synchronized (this) {
                if (this.zzk == null) {
                    String str2 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbZ);
                    com.google.android.gms.ads.internal.zzt.zzc();
                    try {
                        str = com.google.android.gms.ads.internal.util.zzs.zzt(this.zzc);
                    } catch (RemoteException unused) {
                        str = null;
                    }
                    boolean z = false;
                    if (str2 != null && str != null) {
                        try {
                            z = Pattern.matches(str2, str);
                        } catch (RuntimeException e) {
                            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.zzk = Boolean.valueOf(z);
                }
            }
        }
        return this.zzk.booleanValue();
    }

    private final zzdxy zzg(String str) {
        zzfjc zzfjcVar = this.zzf;
        zzfjb zzfjbVar = zzfjcVar.zzb;
        zzdxy zza = this.zze.zza();
        zza.zza(zzfjbVar.zzb);
        zzfir zzfirVar = this.zzg;
        zza.zzb(zzfirVar);
        zza.zzc("action", str);
        zza.zzc(FirebaseAnalytics.Param.AD_FORMAT, this.zzi.toUpperCase(Locale.ROOT));
        List list = zzfirVar.zzt;
        if (!list.isEmpty()) {
            zza.zzc("ancn", (String) list.get(0));
        }
        if (zzfirVar.zzb()) {
            zza.zzc("device_connectivity", true != com.google.android.gms.ads.internal.zzt.zzh().zzs(this.zzc) ? "offline" : CustomTabsCallback.ONLINE_EXTRAS_KEY);
            zza.zzc("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()));
            zza.zzc("offline_ad", AppEventsConstants.EVENT_PARAM_VALUE_YES);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhR)).booleanValue()) {
            boolean zza2 = com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zza(zzfjcVar);
            zza.zzc("scar", String.valueOf(zza2));
            if (zza2) {
                com.google.android.gms.ads.internal.client.zzm zzmVar = zzfjcVar.zza.zza.zzd;
                zza.zzc("ragent", zzmVar.zzp);
                zza.zzc("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzc(zzmVar)));
            }
        }
        return zza;
    }

    private final void zzi(zzdxy zzdxyVar) {
        if (!this.zzg.zzb()) {
            zzdxyVar.zzd();
            return;
        }
        this.zzh.zze(new zzeiw(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis(), this.zzf.zzb.zzb.zzb, zzdxyVar.zzg(), 2));
    }

    private final boolean zzj() {
        int i = this.zzg.zzb;
        return i == 2 || i == 5 || i == 6 || i == 7;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (this.zzg.zzb()) {
            zzi(zzg("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbj
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.client.zze zzeVar2;
        if (this.zzl) {
            zzdxy zzg = zzg("ifts");
            zzg.zzc("reason", "adapter");
            int i = zzeVar.zza;
            String str = zzeVar.zzb;
            if (zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN) && (zzeVar2 = zzeVar.zzd) != null && !zzeVar2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                com.google.android.gms.ads.internal.client.zze zzeVar3 = zzeVar.zzd;
                i = zzeVar3.zza;
                str = zzeVar3.zzb;
            }
            if (i >= 0) {
                zzg.zzc("arec", String.valueOf(i));
            }
            String zza = this.zzd.zza(str);
            if (zza != null) {
                zzg.zzc("areec", zza);
            }
            zzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbj
    public final void zzd(zzdmb zzdmbVar) {
        if (this.zzl) {
            zzdxy zzg = zzg("ifts");
            zzg.zzc("reason", "exception");
            if (!TextUtils.isEmpty(zzdmbVar.getMessage())) {
                zzg.zzc("msg", zzdmbVar.getMessage());
            }
            zzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgh
    public final void zzdG() {
        if (zzf()) {
            zzdxy zzg = zzg("adapter_impression");
            zzg.zzc("imp_type", String.valueOf(this.zzg.zze));
            boolean z = this.zzb.get();
            String str = AppEventsConstants.EVENT_PARAM_VALUE_YES;
            if (z) {
                zzg.zzc("po", AppEventsConstants.EVENT_PARAM_VALUE_YES);
                zzg.zzc("pil", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zzj));
            } else {
                zzg.zzc("po", AppEventsConstants.EVENT_PARAM_VALUE_NO);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoZ)).booleanValue() && zzj()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                zzg.zzc("foreground", true != com.google.android.gms.ads.internal.util.zzs.zzL(this.zzc) ? AppEventsConstants.EVENT_PARAM_VALUE_YES : AppEventsConstants.EVENT_PARAM_VALUE_NO);
                zzg.zzc("fg_show", true != this.zza.get() ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpa)).booleanValue() && zzj()) {
                if (true != com.google.android.gms.ads.internal.zzt.zzg().zzf()) {
                    str = AppEventsConstants.EVENT_PARAM_VALUE_NO;
                }
                zzg.zzc("fg_al", str);
            }
            zzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgh
    public final void zzdH() {
        if (zzf()) {
            zzg("adapter_shown").zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbz
    public final void zzdr() {
        if (zzf() || this.zzg.zzb()) {
            zzdxy zzg = zzg(AdSDKNotificationListener.IMPRESSION_EVENT);
            zzg.zzc("imp_type", String.valueOf(this.zzg.zze));
            if (this.zzj > 0) {
                zzg.zzc("p_imp_l", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zzj));
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoZ)).booleanValue() && zzj()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                boolean zzL = com.google.android.gms.ads.internal.util.zzs.zzL(this.zzc);
                String str = AppEventsConstants.EVENT_PARAM_VALUE_YES;
                zzg.zzc("foreground", true != zzL ? AppEventsConstants.EVENT_PARAM_VALUE_YES : AppEventsConstants.EVENT_PARAM_VALUE_NO);
                if (true != this.zza.get()) {
                    str = AppEventsConstants.EVENT_PARAM_VALUE_NO;
                }
                zzg.zzc("fg_show", str);
            }
            zzi(zzg);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbj
    public final void zze() {
        if (this.zzl) {
            zzdxy zzg = zzg("ifts");
            zzg.zzc("reason", "blocked");
            zzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdea
    public final void zzk() {
        if (zzf()) {
            this.zzb.set(true);
            this.zzj = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            zzdxy zzg = zzg("presentation");
            boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoZ)).booleanValue();
            String str = AppEventsConstants.EVENT_PARAM_VALUE_NO;
            if (booleanValue && zzj()) {
                AtomicBoolean atomicBoolean = this.zza;
                com.google.android.gms.ads.internal.zzt.zzc();
                atomicBoolean.set(!com.google.android.gms.ads.internal.util.zzs.zzL(this.zzc));
                zzg.zzc("foreground", true != atomicBoolean.get() ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpa)).booleanValue() && zzj()) {
                if (true == com.google.android.gms.ads.internal.zzt.zzg().zzf()) {
                    str = AppEventsConstants.EVENT_PARAM_VALUE_YES;
                }
                zzg.zzc("fg_al", str);
            }
            zzg.zzd();
        }
    }
}
