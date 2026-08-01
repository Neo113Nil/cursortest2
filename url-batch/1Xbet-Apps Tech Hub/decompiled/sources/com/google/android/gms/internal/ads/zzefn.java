package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzefn implements zzefo {
    static /* synthetic */ zzflf zzc(String str, String str2, String str3, zzefp zzefpVar, String str4, WebView webView, String str5, String str6, zzefq zzefqVar) {
        zzflp zza = zzflp.zza("Google", str2);
        zzflo zzm = zzm("javascript");
        zzflk zzk = zzk(zzefpVar.toString());
        if (zzm == zzflo.NONE) {
            zzcbn.zzj("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzk == null) {
            zzcbn.zzj("Omid html session error; Unable to parse creative type: ".concat(String.valueOf(String.valueOf(zzefpVar))));
            return null;
        }
        zzflo zzm2 = zzm(str4);
        if (zzk == zzflk.VIDEO && zzm2 == zzflo.NONE) {
            zzcbn.zzj("Omid html session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
            return null;
        }
        return zzflf.zza(zzflg.zza(zzk, zzl(zzefqVar.toString()), zzm, zzm2, true), zzflh.zzb(zza, webView, str5, ""));
    }

    static /* synthetic */ zzflf zzd(String str, String str2, String str3, String str4, zzefp zzefpVar, WebView webView, String str5, String str6, zzefq zzefqVar) {
        zzflp zza = zzflp.zza(str, str2);
        zzflo zzm = zzm("javascript");
        zzflo zzm2 = zzm(str4);
        zzflk zzk = zzk(zzefpVar.toString());
        if (zzm == zzflo.NONE) {
            zzcbn.zzj("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzk == null) {
            zzcbn.zzj("Omid js session error; Unable to parse creative type: ".concat(String.valueOf(String.valueOf(zzefpVar))));
            return null;
        }
        if (zzk == zzflk.VIDEO && zzm2 == zzflo.NONE) {
            zzcbn.zzj("Omid js session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
            return null;
        }
        return zzflf.zza(zzflg.zza(zzk, zzl(zzefqVar.toString()), zzm, zzm2, true), zzflh.zzc(zza, webView, str5, ""));
    }

    private static zzflk zzk(String str) {
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
            return zzflk.HTML_DISPLAY;
        }
        if (c == 1) {
            return zzflk.NATIVE_DISPLAY;
        }
        if (c != 2) {
            return null;
        }
        return zzflk.VIDEO;
    }

    private static zzfln zzl(String str) {
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
        return c != 0 ? c != 1 ? c != 2 ? zzfln.UNSPECIFIED : zzfln.ONE_PIXEL : zzfln.DEFINED_BY_JAVASCRIPT : zzfln.BEGIN_TO_RENDER;
    }

    private static zzflo zzm(String str) {
        return "native".equals(str) ? zzflo.NATIVE : "javascript".equals(str) ? zzflo.JAVASCRIPT : zzflo.NONE;
    }

    private static final Object zzn(zzefm zzefmVar) {
        try {
            return zzefmVar.zza();
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzv(e, "omid exception");
            return null;
        }
    }

    private static final void zzo(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzv(e, "omid exception");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzefo
    public final zzflf zza(final String str, final WebView webView, String str2, String str3, final String str4, final zzefq zzefqVar, final zzefp zzefpVar, final String str5) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzeT)).booleanValue() || !zzfld.zzb()) {
            return null;
        }
        final String str6 = "";
        final String str7 = "javascript";
        final String str8 = "Google";
        return (zzflf) zzn(new zzefm(str8, str, str7, zzefpVar, str4, webView, str5, str6, zzefqVar) { // from class: com.google.android.gms.internal.ads.zzefj
            public final /* synthetic */ String zzb;
            public final /* synthetic */ zzefp zzd;
            public final /* synthetic */ String zze;
            public final /* synthetic */ WebView zzf;
            public final /* synthetic */ String zzg;
            public final /* synthetic */ zzefq zzi;
            public final /* synthetic */ String zza = "Google";
            public final /* synthetic */ String zzc = "javascript";
            public final /* synthetic */ String zzh = "";

            {
                this.zzb = str;
                this.zzd = zzefpVar;
                this.zze = str4;
                this.zzf = webView;
                this.zzg = str5;
                this.zzi = zzefqVar;
            }

            @Override // com.google.android.gms.internal.ads.zzefm
            public final Object zza() {
                return zzefn.zzc(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzefo
    public final zzflf zzb(final String str, final WebView webView, String str2, String str3, final String str4, final String str5, final zzefq zzefqVar, final zzefp zzefpVar, final String str6) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzeT)).booleanValue() || !zzfld.zzb()) {
            return null;
        }
        final String str7 = "";
        final String str8 = "javascript";
        return (zzflf) zzn(new zzefm(str5, str, str8, str4, zzefpVar, webView, str6, str7, zzefqVar) { // from class: com.google.android.gms.internal.ads.zzefg
            public final /* synthetic */ String zza;
            public final /* synthetic */ String zzb;
            public final /* synthetic */ String zzd;
            public final /* synthetic */ zzefp zze;
            public final /* synthetic */ WebView zzf;
            public final /* synthetic */ String zzg;
            public final /* synthetic */ zzefq zzi;
            public final /* synthetic */ String zzc = "javascript";
            public final /* synthetic */ String zzh = "";

            {
                this.zzd = str4;
                this.zze = zzefpVar;
                this.zzf = webView;
                this.zzg = str6;
                this.zzi = zzefqVar;
            }

            @Override // com.google.android.gms.internal.ads.zzefm
            public final Object zza() {
                return zzefn.zzd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzefo
    public final String zze(Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzeT)).booleanValue()) {
            return (String) zzn(new zzefm() { // from class: com.google.android.gms.internal.ads.zzefk
                @Override // com.google.android.gms.internal.ads.zzefm
                public final Object zza() {
                    return "a.1.4.8-google_20230803";
                }
            });
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzefo
    public final void zzf(final zzflf zzflfVar, final View view) {
        zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzefe
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzeT)).booleanValue() && zzfld.zzb()) {
                    zzflf.this.zzb(view, zzflm.NOT_VISIBLE, "Ad overlay");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzefo
    public final void zzg(final zzflf zzflfVar) {
        zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzefl
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzeT)).booleanValue() && zzfld.zzb()) {
                    zzflf.this.zzc();
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzefo
    public final void zzh(final zzflf zzflfVar, final View view) {
        zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeff
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzeT)).booleanValue() && zzfld.zzb()) {
                    zzflf.this.zzd(view);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzefo
    public final void zzi(final zzflf zzflfVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzeT)).booleanValue() && zzfld.zzb()) {
            zzflfVar.getClass();
            zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzefh
                @Override // java.lang.Runnable
                public final void run() {
                    zzflf.this.zze();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzefo
    public final boolean zzj(final Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzeT)).booleanValue()) {
            Boolean bool = (Boolean) zzn(new zzefm() { // from class: com.google.android.gms.internal.ads.zzefi
                @Override // com.google.android.gms.internal.ads.zzefm
                public final Object zza() {
                    if (zzfld.zzb()) {
                        return true;
                    }
                    zzfld.zza(context);
                    return Boolean.valueOf(zzfld.zzb());
                }
            });
            return bool != null && bool.booleanValue();
        }
        zzcbn.zzj("Omid flag is disabled");
        return false;
    }
}
