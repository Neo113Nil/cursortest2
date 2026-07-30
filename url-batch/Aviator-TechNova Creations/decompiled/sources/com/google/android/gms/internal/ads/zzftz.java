package com.google.android.gms.internal.ads;

import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzftz extends WebViewClient {
    final /* synthetic */ zzfub zza;

    zzftz(zzfub zzfubVar) {
        Objects.requireNonNull(zzfubVar);
        this.zza = zzfubVar;
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
        zzfub zzfubVar = this.zza;
        if (zzfubVar.zzd() == webView) {
            Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
            zzfubVar.zzc(null);
        }
        webView.destroy();
        return true;
    }
}
