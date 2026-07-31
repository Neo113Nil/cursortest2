package com.bytedance.sdk.component.bvs;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebBackForwardList;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.sdk.component.bvs.zmn;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.util.List;

/* loaded from: classes3.dex */
public class zg extends WebViewClient {
    private final zmn.InterfaceC0128zmn fs;
    private final WebViewClient zmn;
    private final List<String> zn;

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded(h.u, view, url);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/component/bvs/zg;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V");
        BrandSafetyUtils.onWebViewPageStarted(h.u, webView, str);
        safedk_zg_onPageStarted_9727ea8d91bce48d77a72839c1ab7977(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/component/bvs/zg;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
        BrandSafetyUtils.onWebViewReceivedError(h.u, webView, i, str, str2);
        safedk_zg_onReceivedError_82568c154bbd618d9f6d3e4dfe51b483(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/component/bvs/zg;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V");
        BrandSafetyUtils.onWebViewReceivedError(h.u, webView, webResourceRequest, webResourceError);
        safedk_zg_onReceivedError_80ce287d16dbde702268c6ece66c3dfc(webView, webResourceRequest, webResourceError);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/component/bvs/zg;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponseWithHeaders(h.u, webView, webResourceRequest, safedk_zg_shouldInterceptRequest_96dc19748761ffccdf56958adc26a638(webView, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/component/bvs/zg;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponse(h.u, webView, str, safedk_zg_shouldInterceptRequest_e1151ef7f8dcd131c66d507e887c7491(webView, str));
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/component/bvs/zg;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean safedk_zg_shouldOverrideUrlLoading_e75934e0a15f3c7804a13e8f0920972a = safedk_zg_shouldOverrideUrlLoading_e75934e0a15f3c7804a13e8f0920972a(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(h.u, webView, str, safedk_zg_shouldOverrideUrlLoading_e75934e0a15f3c7804a13e8f0920972a);
        return safedk_zg_shouldOverrideUrlLoading_e75934e0a15f3c7804a13e8f0920972a;
    }

    public zg(zmn.InterfaceC0128zmn interfaceC0128zmn, WebViewClient webViewClient, List<String> list) {
        this.fs = interfaceC0128zmn;
        this.zmn = webViewClient;
        this.zn = list;
    }

    public WebResourceResponse safedk_zg_shouldInterceptRequest_e1151ef7f8dcd131c66d507e887c7491(WebView p0, String p1) {
        return this.zmn.shouldInterceptRequest(p0, p1);
    }

    public WebResourceResponse safedk_zg_shouldInterceptRequest_96dc19748761ffccdf56958adc26a638(WebView p0, WebResourceRequest p1) {
        zmn.InterfaceC0128zmn interfaceC0128zmn;
        if (fs.zmn(this.zn, p1.getUrl().toString()) && (interfaceC0128zmn = this.fs) != null) {
            interfaceC0128zmn.zmn();
        }
        return this.zmn.shouldInterceptRequest(p0, p1);
    }

    public boolean safedk_zg_shouldOverrideUrlLoading_e75934e0a15f3c7804a13e8f0920972a(WebView p0, String p1) {
        zmn.InterfaceC0128zmn interfaceC0128zmn = this.fs;
        if (interfaceC0128zmn != null) {
            interfaceC0128zmn.zmn();
        }
        return this.zmn.shouldOverrideUrlLoading(p0, p1);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        this.zmn.onPageFinished(webView, str);
    }

    public void safedk_zg_onPageStarted_9727ea8d91bce48d77a72839c1ab7977(WebView p0, String p1, Bitmap p2) {
        zmn.InterfaceC0128zmn interfaceC0128zmn = this.fs;
        if (interfaceC0128zmn != null) {
            interfaceC0128zmn.zmn(zmn(p0));
        }
        this.zmn.onPageStarted(p0, p1, p2);
    }

    public void safedk_zg_onReceivedError_80ce287d16dbde702268c6ece66c3dfc(WebView p0, WebResourceRequest p1, WebResourceError p2) {
        this.zmn.onReceivedError(p0, p1, p2);
    }

    public void safedk_zg_onReceivedError_82568c154bbd618d9f6d3e4dfe51b483(WebView p0, int p1, String p2, String p3) {
        this.zmn.onReceivedError(p0, p1, p2, p3);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        this.zmn.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.zmn.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean onRenderProcessGone;
        if (Build.VERSION.SDK_INT >= 26) {
            onRenderProcessGone = this.zmn.onRenderProcessGone(webView, renderProcessGoneDetail);
            return onRenderProcessGone;
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    private int zmn(WebView webView) {
        try {
            WebBackForwardList copyBackForwardList = webView.copyBackForwardList();
            if (copyBackForwardList != null) {
                return copyBackForwardList.getCurrentIndex() + 1;
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }
}
