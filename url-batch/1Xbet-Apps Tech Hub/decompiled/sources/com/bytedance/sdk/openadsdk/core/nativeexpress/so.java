package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.sdk.component.adexpress.Jd.so;
import com.bytedance.sdk.openadsdk.core.CvL;
import com.bytedance.sdk.openadsdk.core.model.cR;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ExpressClient.java */
/* loaded from: classes2.dex */
public class so extends com.bytedance.sdk.openadsdk.core.widget.pvs.NB {
    private final cR icD;
    public ArrayList<Integer> pvs;

    public so(Context context, CvL cvL, cR cRVar, com.bytedance.sdk.openadsdk.icD.qh qhVar) {
        super(context, cvL, cRVar.neB(), qhVar, false);
        this.pvs = new ArrayList<>();
        this.icD = cRVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.pvs.NB, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        try {
            return shouldInterceptRequest(webView, webResourceRequest.getUrl().toString());
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.Ju.pvs("ExpressClient", "shouldInterceptRequest error1", th);
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
    }

    public int pvs() {
        Iterator<Integer> it = this.pvs.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            if (next.intValue() == 3 || next.intValue() == 2 || next.intValue() == -1) {
                return next.intValue();
            }
        }
        return TextUtils.isEmpty(vG()) ? -1 : 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.pvs.NB, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            com.bytedance.sdk.component.adexpress.pvs.icD.pvs pvs = pvs(webView, str);
            pvs(currentTimeMillis, System.currentTimeMillis(), str, (pvs == null || pvs.pvs() == null) ? 2 : 1);
            if (pvs != null && pvs.icD() != 5) {
                pvs.icD();
                this.pvs.add(Integer.valueOf(pvs.icD()));
            }
            if (pvs != null && pvs.pvs() != null) {
                return pvs.pvs();
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.Ju.pvs("ExpressClient", "shouldInterceptRequest error2", th);
        }
        return super.shouldInterceptRequest(webView, str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.pvs.NB, android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        this.yiw = false;
        super.onPageFinished(webView, str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.pvs.NB, android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.so = false;
        super.onPageStarted(webView, str, bitmap);
    }

    private com.bytedance.sdk.component.adexpress.pvs.icD.pvs pvs(WebView webView, String str) {
        com.bytedance.sdk.openadsdk.core.model.bNS bns = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        so.pvs pvs = com.bytedance.sdk.component.adexpress.Jd.so.pvs(str);
        if (pvs != so.pvs.IMAGE) {
            Iterator<com.bytedance.sdk.openadsdk.core.model.bNS> it = this.icD.BSi().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.bytedance.sdk.openadsdk.core.model.bNS next = it.next();
                if (!TextUtils.isEmpty(next.pvs()) && !TextUtils.isEmpty(str)) {
                    String pvs2 = next.pvs();
                    if (pvs2.startsWith("https")) {
                        pvs2 = pvs2.replaceFirst("https", "http");
                    }
                    if ((str.startsWith("https") ? str.replaceFirst("https", "http") : str).equals(pvs2)) {
                        bns = next;
                        break;
                    }
                }
            }
        }
        if (pvs == so.pvs.IMAGE || bns != null) {
            com.bytedance.sdk.component.adexpress.pvs.icD.pvs pvsVar = new com.bytedance.sdk.component.adexpress.pvs.icD.pvs();
            pvsVar.pvs(5);
            pvsVar.pvs(pvs(str, com.bytedance.sdk.openadsdk.core.nativeexpress.pvs.icD.pvs(this.icD, str)));
            return pvsVar;
        }
        return com.bytedance.sdk.component.adexpress.pvs.icD.icD.pvs(str, pvs, "", vG());
    }

    private String vG() {
        cR cRVar = this.icD;
        if (cRVar == null || cRVar.gSd() == null) {
            return null;
        }
        return this.icD.gSd().kj();
    }

    private WebResourceResponse pvs(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            InputStream pvs = com.bytedance.sdk.openadsdk.sUS.Jd.pvs(str, str2);
            if (pvs != null) {
                return new WebResourceResponse(so.pvs.IMAGE.pvs(), "utf-8", pvs);
            }
            return null;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.Ju.pvs("ExpressClient", "get image WebResourceResponse error", th);
            return null;
        }
    }

    private void pvs(long j, long j2, String str, int i) {
        if (this.sUS == null || this.sUS.icD() == null) {
            return;
        }
        so.pvs pvs = com.bytedance.sdk.component.adexpress.Jd.so.pvs(str);
        if (pvs == so.pvs.HTML) {
            this.sUS.icD().pvs(str, j, j2, i);
        } else if (pvs == so.pvs.JS) {
            this.sUS.icD().icD(str, j, j2, i);
        }
    }
}
