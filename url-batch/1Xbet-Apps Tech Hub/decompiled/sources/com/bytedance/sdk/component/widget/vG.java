package com.bytedance.sdk.component.widget;

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
import com.bytedance.sdk.component.widget.pvs;
import java.util.List;

/* compiled from: WebViewClientProxy.java */
/* loaded from: classes.dex */
public class vG extends WebViewClient {
    private final pvs.InterfaceC0058pvs icD;
    private final WebViewClient pvs;
    private final List<String> vG;

    public vG(pvs.InterfaceC0058pvs interfaceC0058pvs, WebViewClient webViewClient, List<String> list) {
        this.icD = interfaceC0058pvs;
        this.pvs = webViewClient;
        this.vG = list;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return this.pvs.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        pvs.InterfaceC0058pvs interfaceC0058pvs;
        if (icD.pvs(this.vG, webResourceRequest.getUrl().toString()) && (interfaceC0058pvs = this.icD) != null) {
            interfaceC0058pvs.pvs();
        }
        return this.pvs.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        pvs.InterfaceC0058pvs interfaceC0058pvs = this.icD;
        if (interfaceC0058pvs != null) {
            interfaceC0058pvs.pvs();
        }
        return this.pvs.shouldOverrideUrlLoading(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        this.pvs.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        pvs.InterfaceC0058pvs interfaceC0058pvs = this.icD;
        if (interfaceC0058pvs != null) {
            interfaceC0058pvs.pvs(pvs(webView));
        }
        this.pvs.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.pvs.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        this.pvs.onReceivedError(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        this.pvs.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.pvs.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.pvs.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    private int pvs(WebView webView) {
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
