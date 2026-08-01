package com.bytedance.sdk.openadsdk.common;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.dyT;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.core.Ju;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.settings.mnm;
import com.bytedance.sdk.openadsdk.utils.ae;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* compiled from: ArbitrageLoadingStyle.java */
/* loaded from: classes2.dex */
public class icD implements dyT.pvs {
    private int IP;
    private final SSWebView Jd;
    private int Mxy;
    private ArbitrageLoadingLayout NB;
    private long Wyp;
    private boolean bNS;
    private final boolean icD;
    private long mnm;
    private final cR pvs;
    private String qh;
    private float so;
    private WebView vG;
    private String sUS = "landingpage";
    private final Handler yiw = new dyT(Ju.icD().getLooper(), this);
    private final AtomicBoolean kj = new AtomicBoolean(false);
    private Pattern Ju = null;

    public icD(cR cRVar, SSWebView sSWebView, String str, boolean z) {
        this.pvs = cRVar;
        this.Jd = sSWebView;
        this.icD = z;
        pvs();
    }

    public void pvs(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.sUS = str;
    }

    private void pvs() {
        SSWebView sSWebView = this.Jd;
        if (sSWebView != null) {
            this.vG = sSWebView.getWebView();
            View arbitrageLoadingView = this.Jd.getArbitrageLoadingView();
            if (arbitrageLoadingView instanceof ArbitrageLoadingLayout) {
                this.NB = (ArbitrageLoadingLayout) arbitrageLoadingView;
            }
        }
        this.Mxy = mnm.Lxj().SJ();
        this.so = mnm.Lxj().ig();
    }

    public void pvs(WebView webView, String str, boolean z) {
        if (z && sUS()) {
            Jd();
        }
    }

    public void pvs(WebView webView, String str) {
        cR cRVar = this.pvs;
        if (cRVar == null || !com.bytedance.sdk.component.widget.icD.pvs(cRVar.Wyp().pvs(), str)) {
            return;
        }
        this.IP++;
        com.bytedance.sdk.component.utils.so.icD().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.icD.1
            @Override // java.lang.Runnable
            public void run() {
                if (icD.this.sUS()) {
                    icD.this.Jd();
                }
            }
        });
    }

    public void pvs(WebView webView, int i) {
        if (this.NB == null || i != 100) {
            return;
        }
        pvs(1);
    }

    public void icD(WebView webView, String str, boolean z) {
        if (!z || this.NB == null) {
            return;
        }
        pvs(1);
    }

    public void vG(WebView webView, String str, boolean z) {
        if (z) {
            this.bNS = true;
        }
    }

    private void icD() {
        Handler handler = this.yiw;
        if (handler != null) {
            handler.sendEmptyMessageDelayed(1, this.Mxy);
        }
    }

    private void vG() {
        Handler handler = this.yiw;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Jd() {
        if (ae.NB()) {
            NB();
        } else {
            com.bytedance.sdk.component.utils.so.icD().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.icD.2
                @Override // java.lang.Runnable
                public void run() {
                    icD.this.NB();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void NB() {
        this.bNS = false;
        if (this.kj.getAndSet(true)) {
            return;
        }
        this.Wyp = SystemClock.elapsedRealtime();
        this.mnm = System.currentTimeMillis();
        WebView webView = this.vG;
        if (webView != null) {
            this.qh = webView.getUrl();
        }
        ArbitrageLoadingLayout arbitrageLoadingLayout = this.NB;
        if (arbitrageLoadingLayout == null) {
            return;
        }
        arbitrageLoadingLayout.setVisibility(0);
        this.NB.pvs(this.pvs, this.sUS, this.icD);
        this.NB.pvs();
        this.NB.setAlpha(this.so);
        this.NB.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.common.icD.3
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        vG();
        icD();
    }

    private void pvs(final int i) {
        com.bytedance.sdk.component.utils.so.icD().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.icD.4
            @Override // java.lang.Runnable
            public void run() {
                if (icD.this.NB != null) {
                    icD.this.kj.set(false);
                    icD.this.NB.pvs(icD.this.pvs, icD.this.sUS, i, icD.this.qh, icD.this.Wyp, icD.this.bNS, icD.this.IP, icD.this.mnm);
                    icD.this.IP = 0;
                }
            }
        });
        vG();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean sUS() {
        return yiw() > 0 && !this.kj.get();
    }

    private int yiw() {
        try {
            return this.vG.copyBackForwardList().getCurrentIndex() + 1;
        } catch (Throwable unused) {
            return 0;
        }
    }

    @Override // com.bytedance.sdk.component.utils.dyT.pvs
    public void pvs(Message message) {
        if (message.what == 1) {
            pvs(0);
        }
    }
}
