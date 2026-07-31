package com.bytedance.sdk.component.zmn;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.safedk.android.internal.partials.PangleNetworkBridge;

/* loaded from: classes3.dex */
public class iqz extends zmn {
    static final /* synthetic */ boolean iv = true;
    protected WebView bvs;
    protected String zg;

    @Override // com.bytedance.sdk.component.zmn.zmn
    protected Context zmn(bvs bvsVar) {
        Context context = bvsVar.btk;
        if (context != null) {
            return context;
        }
        WebView webView = bvsVar.zmn;
        if (webView != null) {
            return webView.getContext();
        }
        throw new IllegalStateException("WebView cannot be null!");
    }

    @Override // com.bytedance.sdk.component.zmn.zmn
    protected String zmn() {
        return this.bvs.getUrl();
    }

    @Override // com.bytedance.sdk.component.zmn.zmn
    @SuppressLint({"JavascriptInterface", "AddJavascriptInterface"})
    protected void fs(bvs bvsVar) {
        this.bvs = bvsVar.zmn;
        this.zg = bvsVar.zn;
        if (bvsVar.mw) {
            return;
        }
        zn();
    }

    @SuppressLint({"AddJavascriptInterface"})
    protected void zn() {
        if (!iv && this.bvs == null) {
            throw new AssertionError();
        }
        PangleNetworkBridge.webviewAddJavascriptInterface(this.bvs, this, this.zg);
    }

    @Override // com.bytedance.sdk.component.zmn.zmn
    @JavascriptInterface
    public void invokeMethod(String str) {
        super.invokeMethod(str);
    }

    @Override // com.bytedance.sdk.component.zmn.zmn
    protected void fs() {
        super.fs();
        fb();
    }

    protected void fb() {
        this.bvs.removeJavascriptInterface(this.zg);
    }

    @Override // com.bytedance.sdk.component.zmn.zmn
    protected void zmn(String str, rt rtVar) {
        if (rtVar != null && !TextUtils.isEmpty(rtVar.zg)) {
            String str2 = rtVar.zg;
            zmn(str, String.format("javascript:(function(){   const iframe = document.querySelector(atob('%s'));   if (iframe && iframe.contentWindow) {        iframe.contentWindow.postMessage(%s, atob('%s'));   }})()", Base64.encodeToString(String.format("iframe[src=\"%s\"", str2).getBytes(), 2), str, Base64.encodeToString(str2.getBytes(), 2)));
            return;
        }
        super.zmn(str, rtVar);
    }

    @Override // com.bytedance.sdk.component.zmn.zmn
    protected void zmn(String str) {
        zmn(str, "javascript:" + this.zg + "._handleMessageFromToutiao(" + str + ")");
    }

    private void zmn(String str, final String str2) {
        if (this.hhw || TextUtils.isEmpty(str2)) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.zmn.iqz.1
            @Override // java.lang.Runnable
            public void run() {
                if (iqz.this.hhw) {
                    return;
                }
                try {
                    iqz.this.bvs.evaluateJavascript(str2, null);
                } catch (Throwable unused) {
                }
            }
        };
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.fb.post(runnable);
        } else {
            runnable.run();
        }
    }
}
