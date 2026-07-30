package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.facebook.internal.AnalyticsEvents;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzejv implements zzejw {
    static /* synthetic */ zzekb zzl(String str, String str2, String str3, zzejx zzejxVar, String str4, WebView webView, String str5, String str6, zzejy zzejyVar) {
        zzfsx zza = zzfsx.zza("Google", str2);
        zzfsw zzn = zzn("javascript");
        zzfso zzp = zzp(zzejxVar.toString());
        zzfsw zzfswVar = zzfsw.NONE;
        if (zzn == zzfswVar) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzp == null) {
            String valueOf = String.valueOf(zzejxVar);
            String.valueOf(valueOf);
            String valueOf2 = String.valueOf(valueOf);
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid html session error; Unable to parse creative type: ".concat(valueOf2));
            return null;
        }
        zzfsw zzn2 = zzn(str4);
        if (zzp != zzfso.VIDEO || zzn2 != zzfswVar) {
            zzfsl zza2 = zzfsl.zza(zza, webView, str5, "");
            return new zzekb(zzfsj.zze(zzfsk.zza(zzp, zzo(zzejyVar.toString()), zzn, zzn2, true), zza2), zza2);
        }
        String.valueOf(str4);
        String valueOf3 = String.valueOf(str4);
        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid html session error; Video events owner unknown for video creative: ".concat(valueOf3));
        return null;
    }

    static /* synthetic */ zzekb zzm(String str, String str2, String str3, String str4, zzejx zzejxVar, WebView webView, String str5, String str6, zzejy zzejyVar) {
        zzfsx zza = zzfsx.zza(str, str2);
        zzfsw zzn = zzn("javascript");
        zzfsw zzn2 = zzn(str4);
        zzfso zzp = zzp(zzejxVar.toString());
        zzfsw zzfswVar = zzfsw.NONE;
        if (zzn == zzfswVar) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzp == null) {
            String valueOf = String.valueOf(zzejxVar);
            String.valueOf(valueOf);
            String valueOf2 = String.valueOf(valueOf);
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid js session error; Unable to parse creative type: ".concat(valueOf2));
            return null;
        }
        if (zzp != zzfso.VIDEO || zzn2 != zzfswVar) {
            zzfsl zzb = zzfsl.zzb(zza, webView, str5, "");
            return new zzekb(zzfsj.zze(zzfsk.zza(zzp, zzo(zzejyVar.toString()), zzn, zzn2, true), zzb), zzb);
        }
        String.valueOf(str4);
        String valueOf3 = String.valueOf(str4);
        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid js session error; Video events owner unknown for video creative: ".concat(valueOf3));
        return null;
    }

    private static zzfsw zzn(String str) {
        return AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_NATIVE.equals(str) ? zzfsw.NATIVE : "javascript".equals(str) ? zzfsw.JAVASCRIPT : zzfsw.NONE;
    }

    private static zzfsr zzo(String str) {
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
        return c != 0 ? c != 1 ? c != 2 ? zzfsr.UNSPECIFIED : zzfsr.ONE_PIXEL : zzfsr.DEFINED_BY_JAVASCRIPT : zzfsr.BEGIN_TO_RENDER;
    }

    private static zzfso zzp(String str) {
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
            if (str.equals(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_VIDEO)) {
                c = 2;
            }
            c = 65535;
        }
        if (c == 0) {
            return zzfso.HTML_DISPLAY;
        }
        if (c == 1) {
            return zzfso.NATIVE_DISPLAY;
        }
        if (c != 2) {
            return null;
        }
        return zzfso.VIDEO;
    }

    private static final Object zzq(zzeju zzejuVar) {
        try {
            return zzejuVar.zza();
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "omid exception");
            return null;
        }
    }

    private static final void zzr(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "omid exception");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzejw
    public final boolean zza(final Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgj)).booleanValue()) {
            Boolean bool = (Boolean) zzq(new zzeju() { // from class: com.google.android.gms.internal.ads.zzejt
                @Override // com.google.android.gms.internal.ads.zzeju
                public final /* synthetic */ Object zza() {
                    if (zzfsh.zzb()) {
                        return true;
                    }
                    zzfsh.zza(context);
                    return Boolean.valueOf(zzfsh.zzb());
                }
            });
            return bool != null && bool.booleanValue();
        }
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid flag is disabled");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzejw
    public final String zzb(Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgj)).booleanValue()) {
            return (String) zzq(zzejk.zza);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzejw
    public final zzekb zzc(final String str, final WebView webView, String str2, String str3, final String str4, final zzejy zzejyVar, final zzejx zzejxVar, final String str5) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgj)).booleanValue() || !zzfsh.zzb()) {
            return null;
        }
        final String str6 = "javascript";
        final String str7 = "Google";
        final String str8 = "";
        return (zzekb) zzq(new zzeju(str7, str, str6, zzejxVar, str4, webView, str5, str8, zzejyVar) { // from class: com.google.android.gms.internal.ads.zzejl
            private final /* synthetic */ String zzb;
            private final /* synthetic */ zzejx zzd;
            private final /* synthetic */ String zze;
            private final /* synthetic */ WebView zzf;
            private final /* synthetic */ String zzg;
            private final /* synthetic */ zzejy zzi;
            private final /* synthetic */ String zza = "Google";
            private final /* synthetic */ String zzc = "javascript";
            private final /* synthetic */ String zzh = "";

            {
                this.zzb = str;
                this.zzd = zzejxVar;
                this.zze = str4;
                this.zzf = webView;
                this.zzg = str5;
                this.zzi = zzejyVar;
            }

            @Override // com.google.android.gms.internal.ads.zzeju
            public final /* synthetic */ Object zza() {
                return zzejv.zzl(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzejw
    public final zzekb zzd(final String str, final WebView webView, String str2, String str3, final String str4, final String str5, final zzejy zzejyVar, final zzejx zzejxVar, final String str6) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgj)).booleanValue() || !zzfsh.zzb()) {
            return null;
        }
        final String str7 = "";
        final String str8 = "javascript";
        return (zzekb) zzq(new zzeju(str5, str, str8, str4, zzejxVar, webView, str6, str7, zzejyVar) { // from class: com.google.android.gms.internal.ads.zzejm
            private final /* synthetic */ String zza;
            private final /* synthetic */ String zzb;
            private final /* synthetic */ String zzd;
            private final /* synthetic */ zzejx zze;
            private final /* synthetic */ WebView zzf;
            private final /* synthetic */ String zzg;
            private final /* synthetic */ zzejy zzi;
            private final /* synthetic */ String zzc = "javascript";
            private final /* synthetic */ String zzh = "";

            {
                this.zzd = str4;
                this.zze = zzejxVar;
                this.zzf = webView;
                this.zzg = str6;
                this.zzi = zzejyVar;
            }

            @Override // com.google.android.gms.internal.ads.zzeju
            public final /* synthetic */ Object zza() {
                return zzejv.zzm(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzejw
    public final void zze(final zzfsj zzfsjVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgj)).booleanValue() && zzfsh.zzb()) {
            Objects.requireNonNull(zzfsjVar);
            zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzejj
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzfsj.this.zza();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzejw
    public final void zzf(final zzfsj zzfsjVar) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzejn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgj)).booleanValue() && zzfsh.zzb()) {
                    zzfsj.this.zzc();
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzejw
    public final void zzg(final zzfsj zzfsjVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzejo
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgj)).booleanValue() && zzfsh.zzb()) {
                    zzfsj.this.zzd(view, zzfsq.NOT_VISIBLE, "Ad overlay");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzejw
    public final void zzh(final zzfsj zzfsjVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzejp
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgj)).booleanValue() && zzfsh.zzb()) {
                    zzfsj.this.zzb(view);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzejw
    public final zzfsv zzi(final VersionInfoParcel versionInfoParcel, final WebView webView, boolean z) {
        final boolean z2 = true;
        return (zzfsv) zzq(new zzeju(webView, z2) { // from class: com.google.android.gms.internal.ads.zzejq
            private final /* synthetic */ WebView zzb;

            @Override // com.google.android.gms.internal.ads.zzeju
            public final /* synthetic */ Object zza() {
                VersionInfoParcel versionInfoParcel2 = VersionInfoParcel.this;
                int i = versionInfoParcel2.buddyApkVersion;
                int i2 = versionInfoParcel2.clientJarVersion;
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 1 + String.valueOf(i2).length());
                sb.append(i);
                sb.append(".");
                sb.append(i2);
                return zzfsv.zza(zzfsx.zza("Google", sb.toString()), this.zzb, true);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzejw
    public final void zzj(final zzfsv zzfsvVar, final zzfsu zzfsuVar) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzejr
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzfsv.this.zzb(zzfsuVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzejw
    public final void zzk(final zzfsv zzfsvVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzejs
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzfsv.this.zzd(view, zzfsq.NOT_VISIBLE, "Ad overlay");
            }
        });
    }
}
