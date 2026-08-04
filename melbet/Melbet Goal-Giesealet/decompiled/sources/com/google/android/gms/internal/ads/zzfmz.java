package com.google.android.gms.internal.ads;

import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzfmz extends WebViewClient {
    final /* synthetic */ zzfnb zza;

    zzfmz(zzfnb zzfnbVar) {
        Objects.requireNonNull(zzfnbVar);
        this.zza = zzfnbVar;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        String obj = renderProcessGoneDetail.toString();
        String valueOf = String.valueOf(webView);
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 36 + String.valueOf(valueOf).length());
        sb.append("WebView renderer gone: ");
        sb.append(obj);
        sb.append("for WebView: ");
        sb.append(valueOf);
        Log.w("NativeBridge", sb.toString());
        zzfnb zzfnbVar = this.zza;
        if (zzfnbVar.zzd() == webView) {
            Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
            zzfnbVar.zzc(null);
        }
        webView.destroy();
        return true;
    }
}
