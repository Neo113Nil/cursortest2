package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.view.ViewGroup;
import com.bumptech.glide.load.Key;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BrandBannerWebViewPool.java */
/* loaded from: classes2.dex */
public class vG {
    private static int icD;
    private static volatile vG vG;
    private final List<DspHtmlWebView> pvs = new ArrayList();

    public static vG pvs() {
        if (vG == null) {
            synchronized (vG.class) {
                if (vG == null) {
                    vG = new vG();
                }
            }
        }
        return vG;
    }

    public DspHtmlWebView icD() {
        DspHtmlWebView remove;
        if (vG() > 0 && (remove = this.pvs.remove(0)) != null) {
            return remove;
        }
        return null;
    }

    public void pvs(DspHtmlWebView dspHtmlWebView) {
        if (dspHtmlWebView != null) {
            icD(dspHtmlWebView);
        }
    }

    public void icD(DspHtmlWebView dspHtmlWebView) {
        if (dspHtmlWebView != null) {
            if (this.pvs.size() >= icD) {
                dspHtmlWebView.kj();
            } else {
                if (this.pvs.contains(dspHtmlWebView)) {
                    return;
                }
                vG(dspHtmlWebView);
                this.pvs.add(dspHtmlWebView);
            }
        }
    }

    public int vG() {
        return this.pvs.size();
    }

    public void vG(DspHtmlWebView dspHtmlWebView) {
        if (dspHtmlWebView == null || dspHtmlWebView.getWebView() == null) {
            return;
        }
        if (dspHtmlWebView.getParent() != null) {
            ((ViewGroup) dspHtmlWebView.getParent()).removeView(dspHtmlWebView);
        }
        try {
            dspHtmlWebView.removeAllViews();
            dspHtmlWebView.vG();
            dspHtmlWebView.setWebChromeClient(null);
            dspHtmlWebView.setWebViewClient(null);
            dspHtmlWebView.setDownloadListener(null);
            dspHtmlWebView.setDefaultTextEncodingName(Key.STRING_CHARSET_NAME);
            dspHtmlWebView.setAllowFileAccess(false);
            dspHtmlWebView.setJavaScriptEnabled(true);
            dspHtmlWebView.setAppCacheEnabled(true);
            dspHtmlWebView.setDatabaseEnabled(true);
            dspHtmlWebView.setSupportZoom(false);
            dspHtmlWebView.getWebView().setLayerType(0, null);
            dspHtmlWebView.setBackgroundColor(0);
            dspHtmlWebView.getWebView().setHorizontalScrollBarEnabled(false);
            dspHtmlWebView.getWebView().setHorizontalScrollbarOverlay(false);
            dspHtmlWebView.getWebView().setVerticalScrollBarEnabled(false);
            dspHtmlWebView.getWebView().setVerticalScrollbarOverlay(false);
            dspHtmlWebView.pvs(true);
            dspHtmlWebView.Wyp();
            dspHtmlWebView.setMixedContentMode(0);
        } catch (Exception unused) {
        }
    }
}
