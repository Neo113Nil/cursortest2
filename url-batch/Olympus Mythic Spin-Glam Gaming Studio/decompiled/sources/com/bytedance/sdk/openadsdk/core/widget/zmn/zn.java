package com.bytedance.sdk.openadsdk.core.widget.zmn;

import android.content.MutableContextWrapper;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.MessageQueue;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.sdk.component.bvs.nps;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.fkt;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.utils.iqz;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes14.dex */
public class zn implements fs {
    private final boolean btk;
    private final MessageQueue fb;
    private com.bytedance.sdk.component.bvs.nps fs;
    fkt zmn;
    private final AtomicInteger zn;

    public zn(int i, boolean z, MessageQueue messageQueue) {
        this.zn = new AtomicInteger(i);
        this.btk = z;
        this.fb = messageQueue;
    }

    public void fs() {
        if (this.zn.get() <= 0) {
            return;
        }
        Objects.toString(this.zn);
        String fb = com.bytedance.sdk.component.adexpress.zmn.fs.fs.fb(null);
        if (this.btk) {
            String fb2 = com.bytedance.sdk.component.adexpress.zmn.fs.fs.fb("v3");
            if (fb != null && fb.equals(fb2)) {
                return;
            } else {
                fb = fb2;
            }
        }
        if (TextUtils.isEmpty(fb)) {
            return;
        }
        try {
            com.bytedance.sdk.component.bvs.nps npsVar = new com.bytedance.sdk.component.bvs.nps(new MutableContextWrapper(kgc.zmn()), this.btk ? nps.zn.ADS_V3 : nps.zn.ADS);
            this.fs = npsVar;
            if (npsVar.getWebView() == null) {
                return;
            }
            this.fs.setWebViewClient(new WebViewClient() { // from class: com.bytedance.sdk.openadsdk.core.widget.zmn.zn.1
                @Override // android.webkit.WebViewClient
                public void onLoadResource(WebView view, String url) {
                    super.onLoadResource(view, url);
                    CreativeInfoManager.onResourceLoaded(h.u, view, url);
                }

                @Override // android.webkit.WebViewClient
                public void onPageStarted(WebView view, String url, Bitmap favicon) {
                    super.onPageStarted(view, url, favicon);
                    BrandSafetyUtils.onWebViewPageStarted(h.u, view, url);
                }

                @Override // android.webkit.WebViewClient
                public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                    super.onReceivedError(view, errorCode, description, failingUrl);
                    BrandSafetyUtils.onWebViewReceivedError(h.u, view, errorCode, description, failingUrl);
                }

                @Override // android.webkit.WebViewClient
                public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                    return true;
                }

                @Override // android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
                    return CreativeInfoManager.onWebViewResponseWithHeaders(h.u, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
                }

                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView view, String url) {
                    boolean shouldOverrideUrlLoading = super.shouldOverrideUrlLoading(view, url);
                    BrandSafetyUtils.onShouldOverrideUrlLoading(h.u, view, url, shouldOverrideUrlLoading);
                    return shouldOverrideUrlLoading;
                }
            });
            zmn(this.fs);
            Uri build = Uri.parse(fb).buildUpon().appendQueryParameter("isPreLoad", "1").build();
            fkt fktVar = new fkt(this.fs.getContext());
            this.zmn = fktVar;
            fktVar.fs(this.fs).zmn(this).zmn(this.fs);
            com.bytedance.sdk.component.adexpress.btk.btk.zmn().zmn(this.fs, this.zmn);
            this.fs.a_(build.toString());
        } catch (Exception unused) {
        }
    }

    private void zmn(com.bytedance.sdk.component.bvs.nps npsVar) {
        if (npsVar == null || npsVar.getWebView() == null) {
            return;
        }
        try {
            fb.zmn(kgc.zmn()).zmn(false).zmn(npsVar.getWebView());
            npsVar.setVerticalScrollBarEnabled(false);
            npsVar.setHorizontalScrollBarEnabled(false);
            fb.zmn(npsVar);
            npsVar.mw();
            npsVar.setUserAgentString(iqz.zmn(npsVar.getWebView(), BuildConfig.VERSION_CODE));
            npsVar.setMixedContentMode(0);
            npsVar.setJavaScriptEnabled(true);
            npsVar.setJavaScriptCanOpenWindowsAutomatically(true);
            npsVar.setDomStorageEnabled(true);
            npsVar.setDatabaseEnabled(true);
            npsVar.setCacheMode(-1);
            npsVar.setAllowFileAccess(false);
            npsVar.setSupportZoom(true);
            npsVar.setBuiltInZoomControls(true);
            npsVar.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
            npsVar.setUseWideViewPort(true);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.iqz.zn("WebViewPool", th.toString());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.fs
    public void zmn() {
        MessageQueue messageQueue;
        if (this.btk) {
            com.bytedance.sdk.component.adexpress.btk.btk.zmn().fb(this.fs);
        } else {
            com.bytedance.sdk.component.adexpress.btk.btk.zmn().btk(this.fs);
        }
        try {
            this.zn.get();
            this.zn.decrementAndGet();
            if (this.zn.get() <= 0 || (messageQueue = this.fb) == null) {
                return;
            }
            messageQueue.addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.bytedance.sdk.openadsdk.core.widget.zmn.zn.2
                @Override // android.os.MessageQueue.IdleHandler
                public boolean queueIdle() {
                    new zn(zn.this.zn.get(), zn.this.btk, zn.this.fb).fs();
                    return false;
                }
            });
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
