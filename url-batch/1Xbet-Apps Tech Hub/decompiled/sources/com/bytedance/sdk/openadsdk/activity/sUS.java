package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.bytedance.sdk.component.so.so;
import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.activity.icD;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.utils.ae;

/* compiled from: Scene.java */
/* loaded from: classes2.dex */
public abstract class sUS {
    public int Mxy;
    public boolean Wyp;
    protected com.bytedance.sdk.openadsdk.Mxy.NB kj = new com.bytedance.sdk.openadsdk.Mxy.NB() { // from class: com.bytedance.sdk.openadsdk.activity.sUS.1
        @Override // com.bytedance.sdk.openadsdk.Mxy.NB
        public void pvs() {
            sUS.this.IP();
        }
    };
    private final icD pvs;
    protected IListenerManager qh;
    protected final cR so;

    public void IP() {
    }

    public void Jd(Activity activity) {
    }

    public void NB(Activity activity) {
    }

    protected abstract boolean a_();

    public void bNS() {
    }

    public abstract String b_();

    public void icD(Activity activity) {
    }

    public abstract View pvs();

    public void pvs(Activity activity) {
    }

    public void pvs(Activity activity, Bundle bundle) {
    }

    public void pvs(Activity activity, icD.Jd jd) {
    }

    public void pvs(sUS sus, sUS sus2, icD.Jd jd) {
    }

    protected abstract String uc();

    public void vA() {
    }

    public void vG(Activity activity) {
    }

    public abstract boolean zM();

    public sUS(icD icd, cR cRVar, int i) {
        this.pvs = icd;
        this.so = cRVar;
        this.Mxy = i;
    }

    protected void pvs(boolean z, boolean z2, boolean z3, int i) {
        this.pvs.pvs(this, z, z2, z3, i);
    }

    public icD ny() {
        return this.pvs;
    }

    public Activity ZhG() {
        return this.pvs.vG();
    }

    protected void dyT() {
        this.pvs.pvs(this);
    }

    protected void pvs(String str) {
        if (a_()) {
            pvs(str, false, 0, "", 0, "");
        } else {
            icD(str);
        }
    }

    private void pvs(final String str, final boolean z, final int i, final String str2, final int i2, final String str3) {
        ae.vG(new so("Reward_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.sUS.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    sUS.this.vG(0).executeRewardVideoCallback(sUS.this.uc(), str, z, i, str2, i2, str3);
                } catch (Throwable th) {
                    Ju.pvs("Scene", "rewarded_video", "executeRewardVideoCallback execute throw Exception : ", th);
                }
            }
        }, 5);
    }

    private void icD(final String str) {
        ae.vG(new so("FullScreen_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.sUS.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    sUS.this.vG(1).executeFullVideoCallback(sUS.this.uc(), str);
                } catch (Throwable th) {
                    Ju.pvs("Scene", "fullscreen_interstitial_ad", "executeFullVideoCallback execute throw Exception : ", th);
                }
            }
        }, 5);
    }

    protected final IListenerManager vG(int i) {
        if (this.qh == null) {
            this.qh = com.bytedance.sdk.openadsdk.multipro.aidl.pvs.pvs.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.pvs.pvs().pvs(i));
        }
        return this.qh;
    }

    public void dX() {
        if (com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
            pvs("onAdClose");
        } else {
            this.pvs.qh();
        }
    }

    protected void CvL() {
        if (this.pvs.bNS()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
            pvs("onAdShow");
        } else {
            this.pvs.kj();
        }
        this.pvs.mnm();
    }

    protected final void Gp() {
        if (com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
            pvs("onAdVideoBarClick");
        } else {
            this.pvs.Wyp();
        }
    }

    protected final void pvs(boolean z, int i, String str, int i2, String str2) {
        if (this.pvs.Ju()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
            pvs("onRewardVerify", z, i, str, i2, str2);
        } else {
            this.pvs.pvs(this, z, i, str, i2, str2);
        }
        this.pvs.IP();
    }
}
