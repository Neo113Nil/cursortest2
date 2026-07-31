package com.startapp.sdk.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MraidMetadata;
import java.util.WeakHashMap;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public class ba extends tj {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ da f182a;

    public ba(da daVar) {
        this.f182a = daVar;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        if (webView == null || str == null) {
            return;
        }
        webView.getContext();
        WeakHashMap weakHashMap = zh.f528a;
        Log.println(2, "StartAppSDK", "Interstitial received callback onPageFinished()");
        if (this.f182a.x == null) {
            long uptimeMillis = SystemClock.uptimeMillis();
            da daVar = this.f182a;
            long max = Math.max(0L, daVar.m() - (uptimeMillis - daVar.w));
            MraidMetadata G = MetaData.A().G();
            u0 u0Var = this.f182a.E;
            u0Var.getClass();
            boolean z = (u0Var instanceof cc) && G != null && zh.a(G.a());
            da daVar2 = this.f182a;
            da daVar3 = this.f182a;
            daVar2.x = new ff(daVar3.f248a, daVar3.l, daVar3.h, daVar3.n(), max, z, this.f182a.J);
            this.f182a.p();
        }
        this.f182a.E.a(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (!hc.a(str)) {
            return super.shouldInterceptRequest(webView, str);
        }
        da daVar = this.f182a;
        u0 u0Var = daVar.E;
        u0Var.getClass();
        if (!(u0Var instanceof cc)) {
            cc ccVar = new cc(daVar);
            daVar.E = ccVar;
            if (daVar.F) {
                ccVar.g();
            }
            if (daVar.G) {
                daVar.E.f();
            }
        }
        new Handler(Looper.getMainLooper()).post(new y9(this.f182a));
        return ((hc) com.startapp.sdk.components.a.a(webView.getContext()).R.a()).b();
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (webView == null || str == null) {
            return true;
        }
        return this.f182a.E.b(webView, str);
    }
}
