package com.aiming.mdt.a;

import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.mopub.common.Constants;
import java.util.Map;

/* renamed from: com.aiming.mdt.a.ʻʼʽʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class C0023 extends WebViewClient {

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private /* synthetic */ Map f7;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private /* synthetic */ RunnableC0149 f8;

    C0023(RunnableC0149 runnableC0149, Map map) {
        this.f8 = runnableC0149;
        this.f7 = map;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (!"market".equals(scheme) && !Constants.INTENT_SCHEME.equals(scheme)) {
            webView.loadUrl(str, this.f7);
            return true;
        }
        String encodedQuery = parse.getEncodedQuery();
        StringBuilder sb = new StringBuilder("https://play.google.com/store/apps/details?");
        sb.append(encodedQuery);
        webView.loadUrl(sb.toString());
        return true;
    }
}
