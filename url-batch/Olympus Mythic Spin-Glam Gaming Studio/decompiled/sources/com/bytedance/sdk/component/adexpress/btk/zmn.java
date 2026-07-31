package com.bytedance.sdk.component.adexpress.btk;

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
import androidx.annotation.UiThread;
import com.bytedance.sdk.component.adexpress.fs.mw;
import com.bytedance.sdk.component.adexpress.fs.rc;
import com.bytedance.sdk.component.adexpress.fs.zg;
import com.bytedance.sdk.component.bvs.nps;
import com.bytedance.sdk.component.utils.rt;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public abstract class zmn implements com.bytedance.sdk.component.adexpress.fs.fb<nps>, rc, com.bytedance.sdk.component.adexpress.zmn {
    protected nps btk;
    private String bvs;
    protected boolean fb;
    protected volatile com.bytedance.sdk.component.adexpress.fs.nps fs;
    private String iv;
    private mw klz;
    private boolean mw;
    private zg rc;
    private int rt;
    private Context zg;
    protected JSONObject zmn;
    protected boolean zn;
    protected int hhw = 8;
    protected AtomicBoolean nps = new AtomicBoolean(false);
    private AtomicBoolean cn = new AtomicBoolean(false);

    protected void hhw() {
    }

    public abstract void iv();

    protected void klz() {
    }

    protected void mw() {
    }

    public abstract void zmn(int i);

    @Override // com.bytedance.sdk.component.adexpress.fs.fb
    public int zn() {
        return 0;
    }

    public zmn(Context context, mw mwVar) {
        this.zn = false;
        this.zg = context;
        this.klz = mwVar;
        this.bvs = mwVar.fb();
        if (com.bytedance.sdk.component.adexpress.fb.fs()) {
            cn();
            return;
        }
        nps zmn = zmn(this.zg, this.bvs);
        this.btk = zmn;
        if (zmn == null) {
            Log.d("WebViewRender", "initWebView: create WebView");
            if (com.bytedance.sdk.component.adexpress.fb.zmn() != null) {
                this.btk = new nps(com.bytedance.sdk.component.adexpress.fb.zmn(), nps.zn.ADS);
                return;
            }
            return;
        }
        this.zn = true;
        Log.d("WebViewRender", "initWebView: reuse WebView");
    }

    private void cn() {
        if (this.zg == null && com.bytedance.sdk.component.adexpress.fb.zmn() != null) {
            this.zg = com.bytedance.sdk.component.adexpress.fb.zmn();
        }
        Context context = this.zg;
        if (context != null) {
            nps zmn = zmn(context, this.bvs);
            this.btk = zmn;
            if (zmn == null) {
                Log.d("WebViewRender", "initWebView: create WebView by act");
                this.btk = new nps(new MutableContextWrapper(this.zg.getApplicationContext()), zmn());
            } else {
                this.zn = true;
                Log.d("WebViewRender", "initWebView: reuse WebView");
            }
        }
    }

    protected nps.zn zmn() {
        return this.klz.nqi() ? nps.zn.ADS_V3 : nps.zn.ADS;
    }

    protected nps zmn(Context context, String str) {
        if (this.klz.nqi()) {
            return btk.zmn().fs(context, str);
        }
        return btk.zmn().zn(context, str);
    }

    protected void fs() {
        if (this.klz.nqi()) {
            btk.zmn().fb(this.btk);
        } else {
            btk.zmn().btk(this.btk);
        }
    }

    public void zmn(String str) {
        this.iv = str;
    }

    public nps fb() {
        return this.btk;
    }

    public void zmn(zg zgVar) {
        this.rc = zgVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.fs.fb
    public void zmn(com.bytedance.sdk.component.adexpress.fs.nps npsVar) {
        String str;
        this.fs = npsVar;
        if (fb() == null || fb().getWebView() == null) {
            com.bytedance.sdk.component.adexpress.fs.nps npsVar2 = this.fs;
            StringBuilder sb = new StringBuilder("SSWebview null is ");
            sb.append(fb() == null);
            sb.append(" or Webview is null");
            npsVar2.zmn(102, sb.toString());
            return;
        }
        if (TextUtils.isEmpty(this.iv)) {
            this.fs.zmn(102, "url is empty");
            return;
        }
        if (!this.klz.am()) {
            if (!this.klz.nqi()) {
                if (!com.bytedance.sdk.component.adexpress.zmn.fs.fs.zmn(this.zmn)) {
                    com.bytedance.sdk.component.adexpress.fs.nps npsVar3 = this.fs;
                    StringBuilder sb2 = new StringBuilder("data null is ");
                    sb2.append(this.zmn == null);
                    npsVar3.zmn(103, sb2.toString());
                    return;
                }
            } else if (zn() == 9 && !com.bytedance.sdk.component.adexpress.zmn.fs.fs.fs(this.zmn)) {
                com.bytedance.sdk.component.adexpress.fs.nps npsVar4 = this.fs;
                StringBuilder sb3 = new StringBuilder("data null is ");
                sb3.append(this.zmn == null);
                npsVar4.zmn(103, sb3.toString());
                return;
            }
        }
        this.klz.btk().zmn(this.zn);
        if (this.zn) {
            try {
                int bjh = this.klz.bjh();
                if (this.klz.nqi() && bjh == 1) {
                    this.klz.zn();
                    str = "javascript:window.SDK_RESET_RENDER();" + ("window.SDK_INJECT_DATA=" + this.klz.zn() + ";") + "window.SDK_TRIGGER_RENDER();";
                } else {
                    str = "javascript:window.SDK_RESET_RENDER();window.SDK_TRIGGER_RENDER();";
                }
                hhw();
                this.btk.cyb();
                this.klz.btk();
                rt.zmn(this.btk.getWebView(), str);
                return;
            } catch (Exception e) {
                btk.zmn().hhw(this.btk);
                this.fs.zmn(102, "load exception is " + e.getMessage());
                return;
            }
        }
        nps fb = fb();
        fb.cyb();
        this.klz.btk();
        fb.a_(this.iv);
    }

    @Override // com.bytedance.sdk.component.adexpress.fs.fb
    /* renamed from: nps, reason: merged with bridge method [inline-methods] */
    public nps btk() {
        return fb();
    }

    public void zg() {
        if (this.nps.get()) {
            return;
        }
        this.nps.set(true);
        iv();
        if (this.btk.getParent() != null) {
            ((ViewGroup) this.btk.getParent()).removeView(this.btk);
        }
        Log.d("WebViewRender", "release: webview success = " + this.fb + "; is click backup close button = " + this.cn.get());
        if (this.fb && !this.cn.get()) {
            Log.d("WebViewRender", "release: recycle webview for pool");
            fs();
        } else {
            Log.d("WebViewRender", "release: direct destroy webview");
            btk.zmn().hhw(this.btk);
        }
    }

    public void bvs() {
        if (fb() == null) {
            return;
        }
        try {
            fb().getWebView().resumeTimers();
        } catch (Exception unused) {
        }
    }

    public void zmn(boolean z) {
        this.mw = z;
    }

    @Override // com.bytedance.sdk.component.adexpress.fs.rc
    public void zmn(final com.bytedance.sdk.component.adexpress.fs.rt rtVar) {
        if (rtVar == null) {
            if (this.fs != null) {
                this.fs.zmn(105, "renderResult is null");
                return;
            }
            return;
        }
        boolean fs = fs(rtVar);
        final float zn = (float) rtVar.zn();
        final float fb = (float) rtVar.fb();
        if (zn() == 0 && (zn <= 0.0f || fb <= 0.0f)) {
            if (this.fs != null) {
                this.fs.zmn(105, "width is " + zn + "height is " + fb);
                return;
            }
            return;
        }
        this.fb = fs;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            zmn(rtVar, zn, fb);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.btk.zmn.1
                @Override // java.lang.Runnable
                public void run() {
                    zmn.this.zmn(rtVar, zn, fb);
                }
            });
        }
    }

    protected boolean fs(com.bytedance.sdk.component.adexpress.fs.rt rtVar) {
        return rtVar.fs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(com.bytedance.sdk.component.adexpress.fs.rt rtVar, float f, float f2) {
        rtVar.iv();
        boolean z = this.fb;
        if (z && !this.mw) {
            zmn(f, f2);
            zmn(this.hhw);
            if (this.fs != null) {
                this.fs.zmn(fb(), rtVar);
                return;
            }
            return;
        }
        if (!z) {
            btk.zmn().hhw(this.btk);
        }
        zmn(rtVar.iv(), rtVar.bvs());
    }

    @Override // com.bytedance.sdk.component.adexpress.fs.rc
    public void zmn(View view, int i, com.bytedance.sdk.component.adexpress.zn znVar) {
        zg zgVar = this.rc;
        if (zgVar != null) {
            zgVar.zmn(view, i, znVar);
        }
    }

    @UiThread
    private void zmn(float f, float f2) {
        this.klz.btk().btk();
        if (zn() == 9 || zn() == 11) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) fb().getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(-1, -1);
            }
            layoutParams.width = -1;
            layoutParams.height = -1;
            fb().setLayoutParams(layoutParams);
            return;
        }
        int zmn = (int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(this.zg, f);
        int zmn2 = (int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(this.zg, f2);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) fb().getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new FrameLayout.LayoutParams(zmn, zmn2);
        }
        layoutParams2.width = zmn;
        layoutParams2.height = zmn2;
        fb().setLayoutParams(layoutParams2);
    }

    private void zmn(int i, String str) {
        if (this.fs != null) {
            this.fs.zmn(i, str);
        }
    }

    private int fs(Activity activity) {
        return activity.hashCode();
    }

    public void rc() {
        klz();
        Activity zmn = com.bytedance.sdk.component.utils.fs.zmn(this.btk);
        if (zmn != null) {
            this.rt = fs(zmn);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.zmn
    public void zmn(Activity activity) {
        if (this.rt == 0 || activity == null || activity.hashCode() != this.rt) {
            return;
        }
        zg();
        mw();
    }

    public void zmn(JSONObject jSONObject) {
        this.zmn = jSONObject;
    }

    public mw rt() {
        return this.klz;
    }

    public void fs(boolean z) {
        this.cn.set(z);
    }
}
