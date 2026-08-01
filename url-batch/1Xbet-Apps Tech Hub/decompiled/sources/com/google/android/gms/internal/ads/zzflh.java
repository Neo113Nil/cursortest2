package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzflh {
    private final zzflp zza;
    private final WebView zzb;
    private final List zzc = new ArrayList();
    private final Map zzd = new HashMap();
    private final String zze = "";
    private final String zzf;
    private final zzfli zzg;

    private zzflh(zzflp zzflpVar, WebView webView, String str, List list, String str2, String str3, zzfli zzfliVar) {
        this.zza = zzflpVar;
        this.zzb = webView;
        this.zzg = zzfliVar;
        this.zzf = str2;
    }

    public static zzflh zzb(zzflp zzflpVar, WebView webView, String str, String str2) {
        return new zzflh(zzflpVar, webView, null, null, str, "", zzfli.HTML);
    }

    public static zzflh zzc(zzflp zzflpVar, WebView webView, String str, String str2) {
        return new zzflh(zzflpVar, webView, null, null, str, "", zzfli.JAVASCRIPT);
    }

    public final WebView zza() {
        return this.zzb;
    }

    public final zzfli zzd() {
        return this.zzg;
    }

    public final zzflp zze() {
        return this.zza;
    }

    public final String zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zze;
    }

    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    public final Map zzi() {
        return Collections.unmodifiableMap(this.zzd);
    }
}
