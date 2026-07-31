package com.bytedance.sdk.openadsdk.core.iv;

import android.annotation.SuppressLint;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class fb {
    private static int fs;
    private static volatile fb zn;
    private final List<hhw> zmn = new ArrayList();

    public static fb zmn() {
        if (zn == null) {
            synchronized (fb.class) {
                try {
                    if (zn == null) {
                        zn = new fb();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zn;
    }

    @Nullable
    public hhw fs() {
        hhw remove;
        if (zn() > 0 && (remove = this.zmn.remove(0)) != null) {
            return remove;
        }
        return null;
    }

    @UiThread
    public void zmn(hhw hhwVar) {
        if (hhwVar != null) {
            fs(hhwVar);
        }
    }

    public void fs(hhw hhwVar) {
        if (hhwVar != null) {
            if (this.zmn.size() >= fs) {
                hhwVar.cn();
            } else {
                if (this.zmn.contains(hhwVar)) {
                    return;
                }
                zn(hhwVar);
                this.zmn.add(hhwVar);
            }
        }
    }

    public int zn() {
        return this.zmn.size();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void zn(hhw hhwVar) {
        if (hhwVar == null || hhwVar.getWebView() == null) {
            return;
        }
        if (hhwVar.getParent() != null) {
            ((ViewGroup) hhwVar.getParent()).removeView(hhwVar);
        }
        try {
            hhwVar.removeAllViews();
            hhwVar.nps();
            hhwVar.setWebChromeClient(null);
            hhwVar.setWebViewClient(null);
            hhwVar.setDownloadListener(null);
            hhwVar.setDefaultTextEncodingName("UTF-8");
            hhwVar.setAllowFileAccess(false);
            hhwVar.setJavaScriptEnabled(true);
            hhwVar.setCacheMode(-1);
            hhwVar.setDatabaseEnabled(true);
            hhwVar.setSupportZoom(false);
            hhwVar.getWebView().setLayerType(0, null);
            hhwVar.setBackgroundColor(0);
            hhwVar.getWebView().setHorizontalScrollBarEnabled(false);
            hhwVar.getWebView().setHorizontalScrollbarOverlay(false);
            hhwVar.getWebView().setVerticalScrollBarEnabled(false);
            hhwVar.getWebView().setVerticalScrollbarOverlay(false);
            com.bytedance.sdk.openadsdk.core.widget.zmn.fb.zmn(hhwVar);
            hhwVar.mw();
            hhwVar.setMixedContentMode(0);
        } catch (Exception unused) {
        }
    }
}
