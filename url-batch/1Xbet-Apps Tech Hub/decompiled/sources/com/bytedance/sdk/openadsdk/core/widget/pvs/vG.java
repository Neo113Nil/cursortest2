package com.bytedance.sdk.openadsdk.core.widget.pvs;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.Ju;
import java.lang.ref.WeakReference;

/* compiled from: SSWebSettings.java */
/* loaded from: classes2.dex */
public class vG {
    private final WeakReference<Context> pvs;
    private boolean icD = true;
    private final boolean vG = true;
    private final boolean Jd = true;
    private final boolean NB = false;
    private final boolean sUS = true;
    private boolean yiw = true;

    public static vG pvs(Context context) {
        return new vG(context);
    }

    private vG(Context context) {
        this.pvs = new WeakReference<>(context);
    }

    public vG pvs(boolean z) {
        this.yiw = z;
        return this;
    }

    public vG icD(boolean z) {
        this.icD = z;
        return this;
    }

    public void pvs(WebView webView) {
        if (webView == null || this.pvs.get() == null) {
            return;
        }
        icD(webView);
        WebSettings settings = webView.getSettings();
        pvs(settings);
        if (settings == null) {
            return;
        }
        try {
            settings.setJavaScriptEnabled(true);
        } catch (Exception e) {
            Ju.pvs("SSWebSettings", e.getMessage());
        }
        try {
            if (this.icD) {
                settings.setSupportZoom(true);
                settings.setBuiltInZoomControls(true);
            } else {
                settings.setSupportZoom(false);
            }
        } catch (Throwable th) {
            Ju.pvs("SSWebSettings", th.getMessage());
        }
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setBlockNetworkImage(false);
        settings.setSavePassword(false);
        try {
            if (this.yiw) {
                webView.setLayerType(2, null);
            } else {
                webView.setLayerType(0, null);
            }
        } catch (Throwable th2) {
            Ju.pvs("SSWebSettings", th2.getMessage());
        }
    }

    public static void icD(WebView webView) {
        try {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable th) {
            Ju.icD(th.toString());
        }
    }

    private void pvs(WebSettings webSettings) {
        try {
            webSettings.setMediaPlaybackRequiresUserGesture(false);
        } catch (Throwable th) {
            Ju.icD(th.toString());
        }
    }
}
