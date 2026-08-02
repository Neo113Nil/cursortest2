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
    public final /* synthetic */ wa f4553a;

    public ua(wa waVar) {
        this.f4553a = waVar;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        if (webView == null || str == null) {
            return;
        }
        webView.getContext();
        WeakHashMap weakHashMap = si.f4438a;
        Log.println(2, "StartAppSDK", "Interstitial received callback onPageFinished()");
        if (this.f4553a.f4688x == null) {
            long uptimeMillis = SystemClock.uptimeMillis();
            wa waVar = this.f4553a;
            long max = Math.max(0L, waVar.m() - (uptimeMillis - waVar.f4687w));
            MraidMetadata K2 = MetaData.E().K();
            x0 x0Var = this.f4553a.f4679E;
            x0Var.getClass();
            boolean z = (x0Var instanceof uc) && K2 != null && si.a(K2.a());
            wa waVar2 = this.f4553a;
            wa waVar3 = this.f4553a;
            waVar2.f4688x = new xf(waVar3.f4518a, waVar3.f4528l, waVar3.f4524h, waVar3.n(), max, z, this.f4553a.f4684J);
            this.f4553a.p();
        }
        this.f4553a.f4679E.a(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (!zc.a(str)) {
            return super.shouldInterceptRequest(webView, str);
        }
        wa waVar = this.f4553a;
        x0 x0Var = waVar.f4679E;
        x0Var.getClass();
        if (!(x0Var instanceof uc)) {
            uc ucVar = new uc(waVar);
            waVar.f4679E = ucVar;
            if (waVar.f4680F) {
                ucVar.g();
            }
            if (waVar.f4681G) {
                waVar.f4679E.f();
            }
        }
        wa waVar2 = this.f4553a;
        waVar2.getClass();
        new Handler(Looper.getMainLooper()).post(new ra(waVar2));
        return ((zc) com.startapp.sdk.components.a.a(webView.getContext()).f3461T.a()).b();
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (webView == null || str == null) {
            return true;
        }
        return this.f4553a.f4679E.b(webView, str);
    }
}
