package com.bytedance.sdk.openadsdk.core.widget.zmn;

import android.annotation.SuppressLint;
import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.iqz;
import java.lang.ref.WeakReference;

/* loaded from: classes13.dex */
public class fb {
    private final WeakReference<Context> zmn;
    private boolean fs = true;
    private final boolean zn = true;
    private final boolean fb = true;
    private final boolean btk = false;
    private final boolean hhw = true;
    private boolean nps = true;

    public static fb zmn(Context context) {
        return new fb(context);
    }

    private fb(Context context) {
        this.zmn = new WeakReference<>(context);
    }

    public fb zmn(boolean z) {
        this.nps = z;
        return this;
    }

    public fb fs(boolean z) {
        this.fs = z;
        return this;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void zmn(WebView webView) {
        if (webView == null || this.zmn.get() == null) {
            return;
        }
        fs(webView);
        WebSettings settings = webView.getSettings();
        zmn(settings);
        if (settings == null) {
            return;
        }
        try {
            settings.setJavaScriptEnabled(true);
        } catch (Exception e) {
            iqz.zn("SSWebSettings", e.getMessage());
        }
        try {
            if (this.fs) {
                settings.setSupportZoom(true);
                settings.setBuiltInZoomControls(true);
            } else {
                settings.setSupportZoom(false);
            }
        } catch (Throwable th) {
            iqz.zn("SSWebSettings", th.getMessage());
        }
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setBlockNetworkImage(false);
        settings.setSavePassword(false);
        try {
            if (this.nps) {
                webView.setLayerType(2, null);
            } else {
                webView.setLayerType(0, null);
            }
        } catch (Throwable th2) {
            iqz.zn("SSWebSettings", th2.getMessage());
        }
    }

    public static void fs(WebView webView) {
        if (webView == null) {
            return;
        }
        try {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable th) {
            iqz.zn(th.toString(), new Object[0]);
        }
    }

    private void zmn(WebSettings webSettings) {
        try {
            webSettings.setMediaPlaybackRequiresUserGesture(false);
        } catch (Throwable th) {
            iqz.zn(th.toString(), new Object[0]);
        }
    }

    public static void zmn(com.bytedance.sdk.component.bvs.nps npsVar) {
        if (npsVar == null) {
            return;
        }
        int zmn = com.bytedance.sdk.openadsdk.uqh.btk.zmn("clear_web_cache_new", 0);
        if (zmn == 0) {
            npsVar.zmn(true);
        } else if (zmn == 1) {
            npsVar.zmn(false);
        }
    }
}
