package com.bytedance.sdk.component.pvs;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;

/* compiled from: WebViewBridge.java */
/* loaded from: classes.dex */
public class dyT extends pvs {
    static final /* synthetic */ boolean Wyp = true;
    protected WebView Mxy;
    protected String so;

    @Override // com.bytedance.sdk.component.pvs.pvs
    protected Context pvs(Wyp wyp) {
        if (wyp.NB != null) {
            return wyp.NB;
        }
        if (wyp.pvs != null) {
            return wyp.pvs.getContext();
        }
        throw new IllegalStateException("WebView cannot be null!");
    }

    @Override // com.bytedance.sdk.component.pvs.pvs
    protected String pvs() {
        return this.Mxy.getUrl();
    }

    @Override // com.bytedance.sdk.component.pvs.pvs
    protected void icD(Wyp wyp) {
        this.Mxy = wyp.pvs;
        this.so = wyp.vG;
        if (wyp.IP) {
            return;
        }
        vG();
    }

    protected void vG() {
        if (!Wyp && this.Mxy == null) {
            throw new AssertionError();
        }
        this.Mxy.addJavascriptInterface(this, this.so);
    }

    @Override // com.bytedance.sdk.component.pvs.pvs
    @JavascriptInterface
    public void invokeMethod(String str) {
        super.invokeMethod(str);
    }

    @Override // com.bytedance.sdk.component.pvs.pvs
    protected void icD() {
        super.icD();
        Jd();
    }

    protected void Jd() {
        this.Mxy.removeJavascriptInterface(this.so);
    }

    @Override // com.bytedance.sdk.component.pvs.pvs
    protected void pvs(String str, mnm mnmVar) {
        if (mnmVar != null && !TextUtils.isEmpty(mnmVar.so)) {
            String str2 = mnmVar.so;
            pvs(str, String.format("javascript:(function(){   const iframe = document.querySelector(atob('%s'));   if (iframe && iframe.contentWindow) {        iframe.contentWindow.postMessage(%s, atob('%s'));   }})()", Base64.encodeToString(String.format("iframe[src=\"%s\"", str2).getBytes(), 2), str, Base64.encodeToString(str2.getBytes(), 2)));
            return;
        }
        super.pvs(str, mnmVar);
    }

    @Override // com.bytedance.sdk.component.pvs.pvs
    protected void pvs(String str) {
        pvs(str, "javascript:" + this.so + "._handleMessageFromToutiao(" + str + ")");
    }

    private void pvs(String str, final String str2) {
        if (this.sUS || TextUtils.isEmpty(str2)) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.pvs.dyT.1
            @Override // java.lang.Runnable
            public void run() {
                if (dyT.this.sUS) {
                    return;
                }
                try {
                    dyT.this.Mxy.evaluateJavascript(str2, null);
                } catch (Throwable unused) {
                }
            }
        };
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.Jd.post(runnable);
        } else {
            runnable.run();
        }
    }
}
