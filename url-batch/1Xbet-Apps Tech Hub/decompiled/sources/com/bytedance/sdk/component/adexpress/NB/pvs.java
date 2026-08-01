package com.bytedance.sdk.component.adexpress.NB;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.icD.IP;
import com.bytedance.sdk.component.adexpress.icD.Ju;
import com.bytedance.sdk.component.adexpress.icD.qh;
import com.bytedance.sdk.component.adexpress.icD.so;
import com.bytedance.sdk.component.adexpress.icD.yiw;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.utils.kj;
import com.bytedance.sdk.component.widget.SSWebView;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: BaseWebViewRender.java */
/* loaded from: classes.dex */
public abstract class pvs implements com.bytedance.sdk.component.adexpress.icD.Jd<SSWebView>, qh, com.bytedance.sdk.component.adexpress.pvs, com.bytedance.sdk.component.adexpress.theme.pvs {
    private boolean IP;
    private Ju Ju;
    private String Mxy;
    protected com.bytedance.sdk.component.adexpress.pvs.vG.icD NB;
    private volatile yiw Wyp;
    private int bNS;
    protected boolean icD;
    private so kj;
    protected JSONObject pvs;
    private boolean qh;
    private String so;
    protected SSWebView vG;
    private Context yiw;
    protected int Jd = 8;
    protected AtomicBoolean sUS = new AtomicBoolean(false);
    private boolean mnm = false;

    protected void Mxy() {
    }

    protected void Wyp() {
    }

    public abstract void icD(int i);

    @Override // com.bytedance.sdk.component.adexpress.icD.Jd
    public int vG() {
        return 0;
    }

    public abstract void yiw();

    public pvs(Context context, Ju ju, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver) {
        this.qh = false;
        this.yiw = context;
        this.Ju = ju;
        this.so = ju.Jd();
        themeStatusBroadcastReceiver.pvs(this);
        if (com.bytedance.sdk.component.adexpress.Jd.icD()) {
            kj();
            return;
        }
        SSWebView Ju = Ju();
        this.vG = Ju;
        if (Ju == null) {
            Log.d("WebViewRender", "initWebView: create WebView");
            if (com.bytedance.sdk.component.adexpress.Jd.pvs() != null) {
                this.vG = new SSWebView(com.bytedance.sdk.component.adexpress.Jd.pvs());
                return;
            }
            return;
        }
        this.qh = true;
        Log.d("WebViewRender", "initWebView: reuse WebView");
    }

    private void kj() {
        if (this.yiw == null && com.bytedance.sdk.component.adexpress.Jd.pvs() != null) {
            this.yiw = com.bytedance.sdk.component.adexpress.Jd.pvs();
        }
        if (this.yiw != null) {
            SSWebView Ju = Ju();
            this.vG = Ju;
            if (Ju == null) {
                Log.d("WebViewRender", "initWebView: create WebView by act");
                this.vG = new SSWebView(new MutableContextWrapper(this.yiw.getApplicationContext()));
            } else {
                this.qh = true;
                Log.d("WebViewRender", "initWebView: reuse WebView");
            }
        }
    }

    private SSWebView Ju() {
        if (this.Ju.ny()) {
            return NB.pvs().pvs(this.yiw, this.so);
        }
        return NB.pvs().icD(this.yiw, this.so);
    }

    private void IP() {
        if (this.Ju.ny()) {
            NB.pvs().icD(this.vG);
        } else {
            NB.pvs().vG(this.vG);
        }
    }

    public void pvs(String str) {
        this.Mxy = str;
    }

    public SSWebView pvs() {
        return this.vG;
    }

    public void pvs(so soVar) {
        this.kj = soVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.icD.Jd
    public void pvs(yiw yiwVar) {
        this.Wyp = yiwVar;
        if (pvs() == null || pvs().getWebView() == null) {
            this.Wyp.pvs(102, "SSWebview null is " + (pvs() == null) + " or Webview is null");
            return;
        }
        if (TextUtils.isEmpty(this.Mxy)) {
            this.Wyp.pvs(102, "url is empty");
            return;
        }
        if (!this.mnm && !com.bytedance.sdk.component.adexpress.pvs.icD.icD.pvs(this.pvs)) {
            this.Wyp.pvs(103, "data null is " + (this.pvs == null));
            return;
        }
        if (this.mnm && !com.bytedance.sdk.component.adexpress.pvs.icD.icD.icD(this.pvs)) {
            this.Wyp.pvs(103, "choice ad data null is " + (this.pvs == null));
            return;
        }
        this.Ju.NB().pvs(this.qh);
        if (this.qh) {
            try {
                this.vG.Ju();
                this.Ju.NB();
                kj.pvs(this.vG.getWebView(), "javascript:window.SDK_RESET_RENDER();window.SDK_TRIGGER_RENDER();");
                return;
            } catch (Exception e) {
                NB.pvs().NB(this.vG);
                this.Wyp.pvs(102, "load exception is " + e.getMessage());
                return;
            }
        }
        SSWebView pvs = pvs();
        pvs.Ju();
        this.Ju.NB();
        pvs.a_(this.Mxy);
    }

    @Override // com.bytedance.sdk.component.adexpress.icD.Jd
    /* renamed from: icD, reason: merged with bridge method [inline-methods] */
    public SSWebView NB() {
        return pvs();
    }

    public void Jd() {
        if (this.sUS.get()) {
            return;
        }
        this.sUS.set(true);
        yiw();
        if (this.vG.getParent() != null) {
            ((ViewGroup) this.vG.getParent()).removeView(this.vG);
        }
        if (this.icD) {
            IP();
        } else {
            NB.pvs().NB(this.vG);
        }
    }

    public void sUS() {
        if (pvs() == null) {
            return;
        }
        try {
            pvs().getWebView().resumeTimers();
        } catch (Exception unused) {
        }
    }

    public void pvs(boolean z) {
        this.IP = z;
    }

    @Override // com.bytedance.sdk.component.adexpress.icD.qh
    public void pvs(final IP ip) {
        if (ip == null) {
            if (this.Wyp != null) {
                this.Wyp.pvs(105, "renderResult is null");
                return;
            }
            return;
        }
        boolean vG = ip.vG();
        final float Jd = (float) ip.Jd();
        final float NB = (float) ip.NB();
        if (Jd <= 0.0f || NB <= 0.0f) {
            if (this.Wyp != null) {
                this.Wyp.pvs(105, "width is " + Jd + "height is " + NB);
            }
        } else {
            this.icD = vG;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                pvs(ip, Jd, NB);
            } else {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.NB.pvs.1
                    @Override // java.lang.Runnable
                    public void run() {
                        pvs.this.pvs(ip, Jd, NB);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(IP ip, float f, float f2) {
        ip.qh();
        boolean z = this.icD;
        if (!z || this.IP) {
            if (!z) {
                NB.pvs().NB(this.vG);
                return;
            } else {
                pvs(ip.qh(), ip.Wyp());
                return;
            }
        }
        pvs(f, f2);
        icD(this.Jd);
        if (this.Wyp != null) {
            this.Wyp.pvs(pvs(), ip);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.icD.qh
    public void pvs(View view, int i, com.bytedance.sdk.component.adexpress.vG vGVar) {
        so soVar = this.kj;
        if (soVar != null) {
            soVar.pvs(view, i, vGVar);
        }
    }

    private void pvs(float f, float f2) {
        this.Ju.NB().NB();
        int pvs = (int) com.bytedance.sdk.component.adexpress.Jd.yiw.pvs(this.yiw, f);
        int pvs2 = (int) com.bytedance.sdk.component.adexpress.Jd.yiw.pvs(this.yiw, f2);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) pvs().getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(pvs, pvs2);
        }
        layoutParams.width = pvs;
        layoutParams.height = pvs2;
        pvs().setLayoutParams(layoutParams);
    }

    private void pvs(int i, String str) {
        if (this.Wyp != null) {
            this.Wyp.pvs(i, str);
        }
    }

    private int icD(Activity activity) {
        return activity.hashCode();
    }

    public void so() {
        Mxy();
        Activity pvs = com.bytedance.sdk.component.utils.icD.pvs(this.vG);
        if (pvs != null) {
            this.bNS = icD(pvs);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.pvs
    public void pvs(Activity activity) {
        if (this.bNS == 0 || activity == null || activity.hashCode() != this.bNS) {
            return;
        }
        Jd();
        Wyp();
    }

    public void pvs(JSONObject jSONObject) {
        this.pvs = jSONObject;
    }

    public Ju qh() {
        return this.Ju;
    }

    public void icD(boolean z) {
        this.mnm = z;
    }
}
