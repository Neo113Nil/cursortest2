package com.startapp.sdk.internal;

import android.util.Log;
import android.webkit.WebView;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class zj extends ua {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.ads.video.c f8051b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zj(com.startapp.sdk.ads.video.c cVar) {
        super(cVar);
        this.f8051b = cVar;
    }

    @Override // com.startapp.sdk.internal.ua, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        if (webView == null || str == null) {
            return;
        }
        webView.getContext();
        WeakHashMap weakHashMap = si.f7575a;
        Log.println(2, "StartAppSDK", "Post-roll received callback onPageFinished()");
        com.startapp.sdk.ads.video.c cVar = this.f8051b;
        cVar.getClass();
        cVar.f6238K = (AdsCommonMetaData.k().F().b() * 1000) + 200;
    }
}
