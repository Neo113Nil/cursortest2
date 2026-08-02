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

/* loaded from: classes.dex */
public class ua extends qk {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wa f7694a;

    public ua(wa waVar) {
        this.f7694a = waVar;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        if (webView == null || str == null) {
            return;
        }
        webView.getContext();
        WeakHashMap weakHashMap = si.f7575a;
        Log.println(2, "StartAppSDK", "Interstitial received callback onPageFinished()");
        if (this.f7694a.f7833x == null) {
            long uptimeMillis = SystemClock.uptimeMillis();
            wa waVar = this.f7694a;
            long max = Math.max(0L, waVar.m() - (uptimeMillis - waVar.f7832w));
            MraidMetadata K2 = MetaData.E().K();
            x0 x0Var = this.f7694a.f7824E;
            x0Var.getClass();
            boolean z = (x0Var instanceof uc) && K2 != null && si.a(K2.a());
            wa waVar2 = this.f7694a;
            wa waVar3 = this.f7694a;
            waVar2.f7833x = new xf(waVar3.f7658a, waVar3.f7669l, waVar3.f7665h, waVar3.n(), max, z, this.f7694a.f7829J);
            this.f7694a.p();
        }
        this.f7694a.f7824E.a(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (!zc.a(str)) {
            return super.shouldInterceptRequest(webView, str);
        }
        wa waVar = this.f7694a;
        x0 x0Var = waVar.f7824E;
        x0Var.getClass();
        if (!(x0Var instanceof uc)) {
            uc ucVar = new uc(waVar);
            waVar.f7824E = ucVar;
            if (waVar.f7825F) {
                ucVar.g();
            }
            if (waVar.f7826G) {
                waVar.f7824E.f();
            }
        }
        wa waVar2 = this.f7694a;
        waVar2.getClass();
        new Handler(Looper.getMainLooper()).post(new ra(waVar2));
        return ((zc) com.startapp.sdk.components.a.a(webView.getContext()).f6559T.a()).b();
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (webView == null || str == null) {
            return true;
        }
        return this.f7694a.f7824E.b(webView, str);
    }
}
