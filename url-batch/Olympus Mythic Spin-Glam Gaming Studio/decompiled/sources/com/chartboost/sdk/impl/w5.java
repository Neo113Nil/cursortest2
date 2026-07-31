package com.chartboost.sdk.impl;

import android.app.Activity;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.impl.si;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* loaded from: classes6.dex */
public class w5 extends WebViewClient {
    public final x5 a;
    public final p7 b;
    public final oa c;
    public final sg d;

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.h.c, view, url);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Logger.d("Chartboost|SafeDK: Execution> Lcom/chartboost/sdk/impl/w5;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V");
        BrandSafetyUtils.onWebViewPageStarted(com.safedk.android.utils.h.c, webView, str);
        safedk_w5_onPageStarted_c77f0f3f04a7b4e313dbec5b304b20e1(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        Logger.d("Chartboost|SafeDK: Execution> Lcom/chartboost/sdk/impl/w5;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
        BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.c, webView, i, str, str2);
        safedk_w5_onReceivedError_eb952fa6f91d244232e2e122804ce6d6(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Logger.d("Chartboost|SafeDK: Execution> Lcom/chartboost/sdk/impl/w5;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V");
        BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.c, webView, webResourceRequest, webResourceError);
        safedk_w5_onReceivedError_d828c6fa47e561ba792fb22de74ef105(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
        return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.h.c, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("Chartboost|SafeDK: Execution> Lcom/chartboost/sdk/impl/w5;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
        boolean safedk_w5_shouldOverrideUrlLoading_0e79e5eff8f6b79cc1d52a4963d38100 = safedk_w5_shouldOverrideUrlLoading_0e79e5eff8f6b79cc1d52a4963d38100(webView, webResourceRequest);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.c, webView, webResourceRequest, safedk_w5_shouldOverrideUrlLoading_0e79e5eff8f6b79cc1d52a4963d38100);
        return safedk_w5_shouldOverrideUrlLoading_0e79e5eff8f6b79cc1d52a4963d38100;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("Chartboost|SafeDK: Execution> Lcom/chartboost/sdk/impl/w5;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean safedk_w5_shouldOverrideUrlLoading_e35fb60c0dfea65039a458ce6ab3f119 = safedk_w5_shouldOverrideUrlLoading_e35fb60c0dfea65039a458ce6ab3f119(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.c, webView, str, safedk_w5_shouldOverrideUrlLoading_e35fb60c0dfea65039a458ce6ab3f119);
        return safedk_w5_shouldOverrideUrlLoading_e35fb60c0dfea65039a458ce6ab3f119;
    }

    public w5(x5 x5Var, p7 p7Var, oa oaVar, sg sgVar) {
        this.a = x5Var;
        this.b = p7Var;
        this.c = oaVar;
        this.d = sgVar;
    }

    public void safedk_w5_onPageStarted_c77f0f3f04a7b4e313dbec5b304b20e1(WebView p0, String p1, Bitmap p2) {
        PackageInfo currentWebViewPackage;
        super.onPageStarted(p0, p1, p2);
        if (Build.VERSION.SDK_INT >= 26) {
            currentWebViewPackage = WebView.getCurrentWebViewPackage();
            if (currentWebViewPackage != null) {
                xb.a("WebView version: " + currentWebViewPackage.versionName, null);
            } else {
                a("Device was not set up correctly.");
            }
        }
        this.a.b();
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        x5 x5Var = this.a;
        if (x5Var != null) {
            x5Var.c();
        }
    }

    public void safedk_w5_onReceivedError_eb952fa6f91d244232e2e122804ce6d6(WebView p0, int p1, String p2, String p3) {
        a("Error loading " + p3 + ": " + p2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        p7 p7Var = this.b;
        if (Chartboost.isSdkStarted() && p7Var != null) {
            try {
                p7Var.mo3222track(l7.a(si.i.i, sslError.toString()));
            } catch (Exception e) {
                xb.b("Failed to track SSL error: " + sslError, e);
            }
        } else {
            xb.b("SDK is not initialized. Cannot track SSL error: " + sslError, null);
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error loading ");
        sb.append(webResourceRequest.getUrl().toString());
        sb.append(": ");
        sb.append(webResourceResponse == null ? "unknown error" : webResourceResponse.getReasonPhrase());
        xb.a(sb.toString(), null);
    }

    public boolean safedk_w5_shouldOverrideUrlLoading_0e79e5eff8f6b79cc1d52a4963d38100(WebView p0, WebResourceRequest p1) {
        if (!this.d.A) {
            return false;
        }
        this.c.b(new o3(p1.getUrl().toString(), Boolean.FALSE));
        return true;
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean didCrash;
        String str;
        didCrash = renderProcessGoneDetail.didCrash();
        if (didCrash) {
            str = "Webview crashed: " + renderProcessGoneDetail;
        } else {
            str = "Webview killed, likely due to low memory";
        }
        a(str);
        if (webView == null || !(webView.getContext() instanceof Activity)) {
            return true;
        }
        ((Activity) webView.getContext()).finish();
        return true;
    }

    public final void a(String str) {
        x5 x5Var = this.a;
        if (x5Var != null) {
            x5Var.a(str);
        }
    }

    public void safedk_w5_onReceivedError_d828c6fa47e561ba792fb22de74ef105(WebView p0, WebResourceRequest p1, WebResourceError p2) {
        if (p1.isForMainFrame()) {
            a("Error loading " + p1.getUrl().toString() + ": " + ((Object) p2.getDescription()));
        }
    }

    public boolean safedk_w5_shouldOverrideUrlLoading_e35fb60c0dfea65039a458ce6ab3f119(WebView p0, String p1) {
        if (!this.d.A) {
            return false;
        }
        this.c.b(new o3(p1, Boolean.FALSE));
        return true;
    }
}
