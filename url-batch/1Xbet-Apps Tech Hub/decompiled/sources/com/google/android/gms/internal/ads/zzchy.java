package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.File;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public class zzchy extends zzchc {
    public zzchy(zzcgv zzcgvVar, zzayp zzaypVar, boolean z, zzefa zzefaVar) {
        super(zzcgvVar, zzaypVar, z, new zzbsr(zzcgvVar, zzcgvVar.zzE(), new zzbcm(zzcgvVar.getContext())), null, zzefaVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final WebResourceResponse zzN(WebView webView, String str, Map map) {
        String str2;
        if (!(webView instanceof zzcgv)) {
            zzcbn.zzj("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        zzcgv zzcgvVar = (zzcgv) webView;
        zzbyo zzbyoVar = this.zza;
        if (zzbyoVar != null) {
            zzbyoVar.zzd(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.zzc(str, map);
        }
        if (zzcgvVar.zzN() != null) {
            zzcgvVar.zzN().zzE();
        }
        if (zzcgvVar.zzO().zzi()) {
            str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzO);
        } else if (zzcgvVar.zzaA()) {
            str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzN);
        } else {
            str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzM);
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        return com.google.android.gms.ads.internal.util.zzt.zzw(zzcgvVar.getContext(), zzcgvVar.zzn().zza, str2);
    }
}
