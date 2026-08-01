package com.bytedance.sdk.openadsdk.core.widget.pvs;

import android.content.MutableContextWrapper;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.CvL;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.utils.bNS;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PreLoadWebView.java */
/* loaded from: classes2.dex */
public class icD implements pvs {
    private SSWebView icD;
    CvL pvs;
    private AtomicInteger vG = null;
    private boolean Jd = false;

    public void pvs(boolean z) {
        this.Jd = z;
        if (z) {
            this.vG = new AtomicInteger(mnm.Jd().Cwg());
        } else {
            this.vG = new AtomicInteger(mnm.Jd().rW());
        }
    }

    public void icD() {
        AtomicInteger atomicInteger = this.vG;
        if (atomicInteger == null || atomicInteger.get() > 0) {
            try {
                Object[] objArr = new Object[4];
                Integer.valueOf(this.vG.get());
                Boolean.valueOf(this.Jd);
            } catch (Exception unused) {
            }
            String Jd = com.bytedance.sdk.component.adexpress.pvs.icD.icD.Jd(null);
            if (this.Jd) {
                String Jd2 = com.bytedance.sdk.component.adexpress.pvs.icD.icD.Jd("v3");
                if (Jd != null && Jd.equals(Jd2)) {
                    return;
                } else {
                    Jd = Jd2;
                }
            }
            if (TextUtils.isEmpty(Jd)) {
                return;
            }
            try {
                SSWebView sSWebView = new SSWebView(new MutableContextWrapper(mnm.pvs()));
                this.icD = sSWebView;
                if (sSWebView.getWebView() == null) {
                    return;
                }
                this.icD.setWebViewClient(new WebViewClient() { // from class: com.bytedance.sdk.openadsdk.core.widget.pvs.icD.1
                    @Override // android.webkit.WebViewClient
                    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                        return true;
                    }
                });
                pvs(this.icD);
                Uri build = Uri.parse(Jd).buildUpon().appendQueryParameter("isPreLoad", "1").build();
                CvL cvL = new CvL(this.icD.getContext());
                this.pvs = cvL;
                cvL.icD(this.icD).pvs(this).pvs(this.icD);
                com.bytedance.sdk.component.adexpress.NB.NB.pvs().pvs(this.icD, this.pvs);
                this.icD.a_(build.toString());
            } catch (Exception unused2) {
            }
        }
    }

    private void pvs(SSWebView sSWebView) {
        if (sSWebView == null || sSWebView.getWebView() == null) {
            return;
        }
        try {
            vG.pvs(mnm.pvs()).pvs(false).pvs(sSWebView.getWebView());
            sSWebView.setVerticalScrollBarEnabled(false);
            sSWebView.setHorizontalScrollBarEnabled(false);
            sSWebView.pvs(true);
            sSWebView.Wyp();
            sSWebView.setUserAgentString(bNS.pvs(sSWebView.getWebView(), BuildConfig.VERSION_CODE));
            sSWebView.setMixedContentMode(0);
            sSWebView.setJavaScriptEnabled(true);
            sSWebView.setJavaScriptCanOpenWindowsAutomatically(true);
            sSWebView.setDomStorageEnabled(true);
            sSWebView.setDatabaseEnabled(true);
            sSWebView.setAppCacheEnabled(true);
            sSWebView.setAllowFileAccess(false);
            sSWebView.setSupportZoom(true);
            sSWebView.setBuiltInZoomControls(true);
            sSWebView.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
            sSWebView.setUseWideViewPort(true);
        } catch (Exception e) {
            Ju.pvs("WebViewPool", e.toString());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.pvs.pvs
    public void pvs() {
        if (this.Jd) {
            com.bytedance.sdk.component.adexpress.NB.NB.pvs().icD(this.icD);
        } else {
            com.bytedance.sdk.component.adexpress.NB.NB.pvs().vG(this.icD);
        }
        AtomicInteger atomicInteger = this.vG;
        if (atomicInteger != null) {
            Object[] objArr = new Object[4];
            Integer.valueOf(atomicInteger.get());
            Boolean.valueOf(this.Jd);
            this.vG.decrementAndGet();
            if (this.vG.get() > 0) {
                icD();
            }
        }
    }
}
