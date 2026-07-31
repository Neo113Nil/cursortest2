package com.startapp.sdk.internal;

import android.util.Log;
import android.webkit.WebView;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import java.util.WeakHashMap;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class gj extends ba {
    public final /* synthetic */ com.startapp.sdk.ads.video.a b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj(com.startapp.sdk.ads.video.a aVar) {
        super(aVar);
        this.b = aVar;
    }

    @Override // com.startapp.sdk.internal.ba, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        if (webView == null || str == null) {
            return;
        }
        webView.getContext();
        WeakHashMap weakHashMap = zh.f528a;
        Log.println(2, "StartAppSDK", "Post-roll received callback onPageFinished()");
        this.b.K = (AdsCommonMetaData.k().F().b() * 1000) + 200;
    }
}
