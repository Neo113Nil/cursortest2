package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzeei implements zzeej {
    static /* synthetic */ zzeeo zzc(String str, String str2, String str3, zzeek zzeekVar, String str4, WebView webView, String str5, String str6, zzeel zzeelVar) {
        zzfmd zza = zzfmd.zza("Google", str2);
        zzfmc zzp = zzp("javascript");
        zzflv zzn = zzn(zzeekVar.toString());
        if (zzp == zzfmc.NONE) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzn == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid html session error; Unable to parse creative type: ".concat(String.valueOf(String.valueOf(zzeekVar))));
            return null;
        }
        zzfmc zzp2 = zzp(str4);
        if (zzn == zzflv.VIDEO && zzp2 == zzfmc.NONE) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid html session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
            return null;
        }
        zzfls zzb = zzfls.zzb(zza, webView, str5, "");
        return new zzeeo(zzflq.zza(zzflr.zza(zzn, zzo(zzeelVar.toString()), zzp, zzp2, true), zzb), zzb);
    }

    static /* synthetic */ zzeeo zzd(String str, String str2, String str3, String str4, zzeek zzeekVar, WebView webView, String str5, String str6, zzeel zzeelVar) {
        zzfmd zza = zzfmd.zza(str, str2);
        zzfmc zzp = zzp("javascript");
        zzfmc zzp2 = zzp(str4);
        zzflv zzn = zzn(zzeekVar.toString());
        if (zzp == zzfmc.NONE) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzn == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid js session error; Unable to parse creative type: ".concat(String.valueOf(String.valueOf(zzeekVar))));
            return null;
        }
        if (zzn == zzflv.VIDEO && zzp2 == zzfmc.NONE) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid js session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
            return null;
        }
        zzfls zzc = zzfls.zzc(zza, webView, str5, "");
        return new zzeeo(zzflq.zza(zzflr.zza(zzn, zzo(zzeelVar.toString()), zzp, zzp2, true), zzc), zzc);
    }

    private static zzflv zzn(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == -382745961) {
            if (str.equals("htmlDisplay")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 112202875) {
            if (hashCode == 714893483 && str.equals("nativeDisplay")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals("video")) {
                c = 2;
            }
            c = 65535;
        }
        if (c == 0) {
            return zzflv.HTML_DISPLAY;
        }
        if (c == 1) {
            return zzflv.NATIVE_DISPLAY;
        }
        if (c != 2) {
            return null;
        }
        return zzflv.VIDEO;
    }

    private static zzfly zzo(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == -1104128070) {
            if (str.equals("beginToRender")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 1318088141) {
            if (hashCode == 1988248512 && str.equals("onePixel")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (str.equals("definedByJavascript")) {
                c = 1;
            }
            c = 65535;
        }
        return c != 0 ? c != 1 ? c != 2 ? zzfly.UNSPECIFIED : zzfly.ONE_PIXEL : zzfly.DEFINED_BY_JAVASCRIPT : zzfly.BEGIN_TO_RENDER;
    }

    private static zzfmc zzp(String str) {
        return "native".equals(str) ? zzfmc.NATIVE : "javascript".equals(str) ? zzfmc.JAVASCRIPT : zzfmc.NONE;
    }

    private static final Object zzq(zzeeh zzeehVar) {
        try {
            return zzeehVar.zza();
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.zzu.zzo().zzv(e, "omid exception");
            return null;
        }
    }

    private static final void zzr(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.zzu.zzo().zzv(e, "omid exception");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeej
    public final zzeeo zza(final String str, final WebView webView, String str2, String str3, final String str4, final zzeel zzeelVar, final zzeek zzeekVar, final String str5) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzez)).booleanValue() || !zzflo.zzb()) {
            return null;
        }
        final String str6 = "javascript";
        final String str7 = "Google";
        final String str8 = "";
        return (zzeeo) zzq(new zzeeh(str7, str, str6, zzeekVar, str4, webView, str5, str8, zzeelVar) { // from class: com.google.android.gms.internal.ads.zzedx
            public final /* synthetic */ String zzb;
            public final /* synthetic */ zzeek zzd;
            public final /* synthetic */ String zze;
            public final /* synthetic */ WebView zzf;
            public final /* synthetic */ String zzg;
            public final /* synthetic */ zzeel zzi;
            public final /* synthetic */ String zza = "Google";
            public final /* synthetic */ String zzc = "javascript";
            public final /* synthetic */ String zzh = "";

            {
                this.zzb = str;
                this.zzd = zzeekVar;
                this.zze = str4;
                this.zzf = webView;
                this.zzg = str5;
                this.zzi = zzeelVar;
            }

            @Override // com.google.android.gms.internal.ads.zzeeh
            public final Object zza() {
                return zzeei.zzc(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeej
    public final zzeeo zzb(final String str, final WebView webView, String str2, String str3, final String str4, final String str5, final zzeel zzeelVar, final zzeek zzeekVar, final String str6) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzez)).booleanValue() || !zzflo.zzb()) {
            return null;
        }
        final String str7 = "";
        final String str8 = "javascript";
        return (zzeeo) zzq(new zzeeh(str5, str, str8, str4, zzeekVar, webView, str6, str7, zzeelVar) { // from class: com.google.android.gms.internal.ads.zzeea
            public final /* synthetic */ String zza;
            public final /* synthetic */ String zzb;
            public final /* synthetic */ String zzd;
            public final /* synthetic */ zzeek zze;
            public final /* synthetic */ WebView zzf;
            public final /* synthetic */ String zzg;
            public final /* synthetic */ zzeel zzi;
            public final /* synthetic */ String zzc = "javascript";
            public final /* synthetic */ String zzh = "";

            {
                this.zzd = str4;
                this.zze = zzeekVar;
                this.zzf = webView;
                this.zzg = str6;
                this.zzi = zzeelVar;
            }

            @Override // com.google.android.gms.internal.ads.zzeeh
            public final Object zza() {
                return zzeei.zzd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeej
    public final zzfmb zze(final VersionInfoParcel versionInfoParcel, final WebView webView, boolean z) {
        final boolean z2 = true;
        return (zzfmb) zzq(new zzeeh(webView, z2) { // from class: com.google.android.gms.internal.ads.zzeef
            public final /* synthetic */ WebView zzb;

            @Override // com.google.android.gms.internal.ads.zzeeh
            public final Object zza() {
                VersionInfoParcel versionInfoParcel2 = VersionInfoParcel.this;
                return zzfmb.zza(zzfmd.zza("Google", versionInfoParcel2.buddyApkVersion + "." + versionInfoParcel2.clientJarVersion), this.zzb, true);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeej
    public final String zzf(Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzez)).booleanValue()) {
            return (String) zzq(new zzeeh() { // from class: com.google.android.gms.internal.ads.zzeed
                @Override // com.google.android.gms.internal.ads.zzeeh
                public final Object zza() {
                    return "a.1.4.10-google_20240110";
                }
            });
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzeej
    public final void zzg(final zzflq zzflqVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzedw
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzez)).booleanValue() && zzflo.zzb()) {
                    zzflq.this.zzb(view, zzflx.NOT_VISIBLE, "Ad overlay");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeej
    public final void zzh(final zzfmb zzfmbVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeec
            @Override // java.lang.Runnable
            public final void run() {
                zzfmb.this.zze(view, zzflx.NOT_VISIBLE, "Ad overlay");
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeej
    public final void zzi(final zzflq zzflqVar) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeeg
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzez)).booleanValue() && zzflo.zzb()) {
                    zzflq.this.zzc();
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeej
    public final void zzj(final zzflq zzflqVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzedy
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzez)).booleanValue() && zzflo.zzb()) {
                    zzflq.this.zzd(view);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeej
    public final void zzk(final zzflq zzflqVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzez)).booleanValue() && zzflo.zzb()) {
            Objects.requireNonNull(zzflqVar);
            zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzedz
                @Override // java.lang.Runnable
                public final void run() {
                    zzflq.this.zze();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeej
    public final boolean zzl(final Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzez)).booleanValue()) {
            Boolean bool = (Boolean) zzq(new zzeeh() { // from class: com.google.android.gms.internal.ads.zzeeb
                @Override // com.google.android.gms.internal.ads.zzeeh
                public final Object zza() {
                    if (zzflo.zzb()) {
                        return true;
                    }
                    zzflo.zza(context);
                    return Boolean.valueOf(zzflo.zzb());
                }
            });
            return bool != null && bool.booleanValue();
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid flag is disabled");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzeej
    public final void zzm(final zzfmb zzfmbVar, final zzcey zzceyVar) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeee
            @Override // java.lang.Runnable
            public final void run() {
                zzfmb.this.zzf(zzceyVar);
            }
        });
    }
}
