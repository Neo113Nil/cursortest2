package com.bytedance.sdk.openadsdk.core.widget.pvs;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.bytedance.sdk.openadsdk.core.CvL;
import com.bytedance.sdk.openadsdk.core.Ju;
import com.bytedance.sdk.openadsdk.icD.qh;
import com.bytedance.sdk.openadsdk.utils.bNS;

/* compiled from: TTWebChromeClient.java */
/* loaded from: classes2.dex */
public class Jd extends WebChromeClient {
    private static final String pvs = WebChromeClient.class.getSimpleName();
    private com.bytedance.sdk.openadsdk.common.icD Jd;
    private final CvL icD;
    private qh vG;

    public Jd(CvL cvL, qh qhVar, com.bytedance.sdk.openadsdk.common.icD icd) {
        this(cvL, qhVar);
        this.Jd = icd;
    }

    public Jd(CvL cvL, qh qhVar) {
        this.icD = cvL;
        this.vG = qhVar;
    }

    @Override // android.webkit.WebChromeClient
    public void onConsoleMessage(String str, int i, String str2) {
        if (!TextUtils.isEmpty(str)) {
            pvs(str);
        }
        super.onConsoleMessage(str, i, str2);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage == null || TextUtils.isEmpty(consoleMessage.message()) || !pvs(consoleMessage.message())) {
            return super.onConsoleMessage(consoleMessage);
        }
        return true;
    }

    private boolean pvs(final String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (str.regionMatches(true, 0, "bytedance:", 0, 10)) {
                Ju.vG().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.widget.pvs.Jd.1
                    @Override // java.lang.Runnable
                    public void run() {
                        bNS.pvs(Uri.parse(str), Jd.this.icD);
                    }
                });
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        qh qhVar = this.vG;
        if (qhVar != null) {
            qhVar.pvs(webView, i);
        }
        com.bytedance.sdk.openadsdk.common.icD icd = this.Jd;
        if (icd != null) {
            icd.pvs(webView, i);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        super.onShowCustomView(view, customViewCallback);
    }
}
