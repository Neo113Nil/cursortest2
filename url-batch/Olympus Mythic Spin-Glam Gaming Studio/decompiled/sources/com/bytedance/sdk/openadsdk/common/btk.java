package com.bytedance.sdk.openadsdk.common;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.kjb;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.utils.nu;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class btk implements kjb.zmn {
    private fb btk;
    private int bvs;
    private long cn;
    private boolean cyb;
    private final com.bytedance.sdk.component.bvs.nps fb;
    private final boolean fs;
    private String iqz;
    private long iv;
    private int kw;
    private int mw;
    private boolean rt;
    private float zg;
    private final nqi zmn;
    private WebView zn;
    private String hhw = "landingpage";
    private final Handler nps = new kjb(com.bytedance.sdk.openadsdk.core.cn.fs().getLooper(), this);
    private final AtomicBoolean rc = new AtomicBoolean(false);
    private Pattern klz = null;
    private long kgc = -1;
    private final List<Integer> olo = new ArrayList();

    public btk(nqi nqiVar, com.bytedance.sdk.component.bvs.nps npsVar, String str, boolean z) {
        this.zmn = nqiVar;
        this.fb = npsVar;
        this.fs = z;
        fs();
    }

    public void zmn(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.hhw = str;
    }

    private void fs() {
        com.bytedance.sdk.component.bvs.nps npsVar = this.fb;
        if (npsVar != null) {
            this.zn = npsVar.getWebView();
            View arbitrageLoadingView = this.fb.getArbitrageLoadingView();
            if (arbitrageLoadingView instanceof fb) {
                this.btk = (fb) arbitrageLoadingView;
            }
        }
        this.bvs = com.bytedance.sdk.openadsdk.core.settings.rc.fs().uqh();
        this.zg = com.bytedance.sdk.openadsdk.core.settings.rc.fs().bjh();
    }

    public void zmn(WebView webView, String str, boolean z) {
        if (z && hhw()) {
            zmn();
        }
    }

    public void zmn(WebView webView, String str) {
        nqi nqiVar = this.zmn;
        if (nqiVar == null || !com.bytedance.sdk.component.bvs.fs.zmn(nqiVar.bjh().zn(), str)) {
            return;
        }
        this.mw++;
        com.bytedance.sdk.component.utils.bvs.fs().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.btk.1
            @Override // java.lang.Runnable
            public void run() {
                if (btk.this.hhw()) {
                    btk.this.zmn();
                }
            }
        });
    }

    public void zmn(WebView webView, int i) {
        fb fbVar = this.btk;
        if (fbVar != null) {
            fbVar.zmn(i);
        }
        if (this.cyb) {
            if (zmn(i, 30)) {
                zmn(30, webView);
            }
            if (zmn(i, 50)) {
                zmn(50, webView);
            }
            if (zmn(i, 70)) {
                zmn(70, webView);
            }
        }
        if (this.btk == null || i != 100) {
            return;
        }
        zmn(1);
    }

    public void fs(WebView webView, String str, boolean z) {
        if (!z || this.btk == null) {
            return;
        }
        zmn(1);
    }

    public void zn(WebView webView, String str, boolean z) {
        this.olo.clear();
        this.cyb = z;
        if (z) {
            this.rt = true;
        }
        this.kw = nps();
    }

    private void zn() {
        Handler handler = this.nps;
        if (handler != null) {
            handler.sendEmptyMessageDelayed(1, this.bvs);
        }
    }

    private void fb() {
        Handler handler = this.nps;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void zmn() {
        if (nu.hhw()) {
            btk();
        } else {
            com.bytedance.sdk.component.utils.bvs.fs().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.btk.2
                @Override // java.lang.Runnable
                public void run() {
                    btk.this.btk();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ClickableViewAccessibility"})
    public void btk() {
        this.rt = false;
        if (this.rc.getAndSet(true)) {
            return;
        }
        this.iv = SystemClock.elapsedRealtime();
        this.cn = System.currentTimeMillis();
        zg();
        if (this.btk == null) {
            return;
        }
        WebView webView = this.zn;
        if (webView != null) {
            this.iqz = webView.getUrl();
        }
        this.btk.setVisibility(0);
        this.btk.zmn(this.zmn);
        this.btk.zmn();
        this.btk.setAlpha(this.zg);
        this.btk.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.common.btk.3
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/common/btk$3;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                CreativeInfoManager.onViewTouched(h.u, view, motionEvent);
                return safedk_btk$3_onTouch_65efcd60851eec9f46d07083c8baf993(view, motionEvent);
            }

            public boolean safedk_btk$3_onTouch_65efcd60851eec9f46d07083c8baf993(View p0, MotionEvent p1) {
                return true;
            }
        });
        fb();
        zn();
    }

    private void zmn(final int i) {
        WebView webView = this.zn;
        if (webView != null && i == 1) {
            String url = webView.getUrl();
            if (TextUtils.isEmpty(url) || url.equals(this.iqz)) {
                return;
            }
        }
        com.bytedance.sdk.component.utils.bvs.fs().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.btk.4
            @Override // java.lang.Runnable
            public void run() {
                if (btk.this.btk != null) {
                    btk.this.rc.set(false);
                    btk.this.btk.zmn(btk.this.zmn, btk.this.hhw, i, btk.this.iqz, btk.this.iv, btk.this.rt, btk.this.mw, btk.this.cn);
                    btk.this.mw = 0;
                }
            }
        });
        fb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hhw() {
        return nps() > 0 && !this.rc.get();
    }

    private int nps() {
        try {
            return this.zn.copyBackForwardList().getCurrentIndex() + 1;
        } catch (Throwable unused) {
            return 0;
        }
    }

    @Override // com.bytedance.sdk.component.utils.kjb.zmn
    public void zmn(Message message) {
        if (message.what == 1) {
            zmn(0);
        }
    }

    public void zmn(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.kgc = SystemClock.elapsedRealtime();
        }
    }

    private boolean zmn(int i, int i2) {
        if (i < i2 || this.olo.contains(Integer.valueOf(i2)) || this.kw < 2) {
            return false;
        }
        this.olo.add(Integer.valueOf(i2));
        return true;
    }

    private void zmn(int i, WebView webView) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("load_progress", i);
            jSONObject.put("progress_timestamp", System.currentTimeMillis());
            jSONObject.put("arbi_current_url", webView.getUrl());
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.fb.zn.fs(this.zmn, this.hhw, jSONObject);
    }

    private void zg() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("loading_show_interval", SystemClock.elapsedRealtime() - this.kgc);
            jSONObject.put("loading_show_timestamp", this.cn);
            WebView webView = this.zn;
            jSONObject.put("arbi_current_url", webView != null ? webView.getUrl() : "");
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.fb.zn.zmn(this.zmn, this.hhw, jSONObject);
    }
}
