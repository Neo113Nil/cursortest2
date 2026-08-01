package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfmo extends zzfmk {
    private WebView zza;
    private Long zzb = null;
    private final Map zzc;

    public zzfmo(Map map, String str) {
        this.zzc = map;
    }

    @Override // com.google.android.gms.internal.ads.zzfmk
    public final void zzc() {
        super.zzc();
        new Handler().postDelayed(new zzfmn(this), Math.max(4000 - (this.zzb == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.zzb.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfmk
    public final void zzg(zzflj zzfljVar, zzflh zzflhVar) {
        JSONObject jSONObject = new JSONObject();
        Map zzi = zzflhVar.zzi();
        Iterator it = zzi.keySet().iterator();
        if (it.hasNext()) {
            throw null;
        }
        zzh(zzfljVar, zzflhVar, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzfmk
    public final void zzk() {
        WebView webView = new WebView(zzfmb.zzb().zza());
        this.zza = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.zza.getSettings().setAllowContentAccess(false);
        this.zza.getSettings().setAllowFileAccess(false);
        this.zza.setWebViewClient(new zzfmm(this));
        zzj(this.zza);
        zzfmd.zzi(this.zza, null);
        Iterator it = this.zzc.keySet().iterator();
        if (!it.hasNext()) {
            this.zzb = Long.valueOf(System.nanoTime());
        } else {
            throw null;
        }
    }
}
