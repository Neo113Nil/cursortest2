package com.bytedance.sdk.openadsdk.component.reward.pvs;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.component.reward.top.TopProxyLayout;
import com.bytedance.sdk.openadsdk.utils.Pj;

/* compiled from: RewardFullTopProxyManager.java */
/* loaded from: classes2.dex */
public class qh {
    private final pvs Jd;
    private boolean NB = false;
    com.bytedance.sdk.component.adexpress.dynamic.Jd icD;
    TopProxyLayout pvs;
    private boolean sUS;
    private final Activity vG;

    public qh(pvs pvsVar) {
        this.vG = pvsVar.od;
        this.Jd = pvsVar;
    }

    public void pvs() {
        if (this.NB) {
            return;
        }
        this.NB = true;
        if (this.Jd.tQ != null) {
            this.pvs = this.Jd.tQ;
            this.sUS = true;
        } else {
            this.pvs = (TopProxyLayout) this.Jd.qD.findViewById(com.bytedance.sdk.openadsdk.utils.kj.xyK);
        }
        TopProxyLayout topProxyLayout = this.pvs;
        if (topProxyLayout != null) {
            topProxyLayout.pvs(this.Jd.icD);
            if (this.Jd.icD.SJ()) {
                pvs(false);
            } else {
                pvs(this.Jd.icD.yhq());
            }
        }
    }

    public void pvs(boolean z) {
        TopProxyLayout topProxyLayout;
        if (this.sUS || (topProxyLayout = this.pvs) == null) {
            return;
        }
        topProxyLayout.setShowDislike(z);
    }

    public void icD(boolean z) {
        TopProxyLayout topProxyLayout = this.pvs;
        if (topProxyLayout != null) {
            topProxyLayout.setSoundMute(z);
        }
        com.bytedance.sdk.component.adexpress.dynamic.Jd jd = this.icD;
        if (jd != null) {
            jd.setSoundMute(z);
        }
    }

    public void vG(boolean z) {
        TopProxyLayout topProxyLayout;
        if (this.sUS || (topProxyLayout = this.pvs) == null) {
            return;
        }
        topProxyLayout.setShowSound(z);
    }

    public void Jd(boolean z) {
        TopProxyLayout topProxyLayout;
        if (this.sUS || (topProxyLayout = this.pvs) == null) {
            return;
        }
        topProxyLayout.setShowSkip(z);
    }

    public void pvs(String str, CharSequence charSequence) {
        TopProxyLayout topProxyLayout;
        if (this.sUS || (topProxyLayout = this.pvs) == null) {
            return;
        }
        topProxyLayout.pvs(String.valueOf(str), charSequence);
    }

    public void pvs(CharSequence charSequence) {
        TopProxyLayout topProxyLayout;
        if (this.sUS || (topProxyLayout = this.pvs) == null) {
            return;
        }
        topProxyLayout.setSkipText(charSequence);
    }

    public void icD() {
        TopProxyLayout topProxyLayout;
        if (this.sUS || (topProxyLayout = this.pvs) == null) {
            return;
        }
        topProxyLayout.Jd();
    }

    public void NB(boolean z) {
        TopProxyLayout topProxyLayout;
        if (this.sUS || (topProxyLayout = this.pvs) == null) {
            return;
        }
        topProxyLayout.setSkipEnable(z);
    }

    public void vG() {
        TopProxyLayout topProxyLayout;
        if (this.sUS || (topProxyLayout = this.pvs) == null) {
            return;
        }
        topProxyLayout.NB();
    }

    public void Jd() {
        TopProxyLayout topProxyLayout = this.pvs;
        if (topProxyLayout != null) {
            topProxyLayout.pvs();
        }
    }

    public void NB() {
        TopProxyLayout topProxyLayout = this.pvs;
        if (topProxyLayout != null) {
            topProxyLayout.icD();
        }
    }

    public void sUS() {
        TopProxyLayout topProxyLayout;
        if (this.sUS || (topProxyLayout = this.pvs) == null) {
            return;
        }
        topProxyLayout.vG();
    }

    public void pvs(com.bytedance.sdk.openadsdk.component.reward.top.icD icd) {
        TopProxyLayout topProxyLayout = this.pvs;
        if (topProxyLayout != null) {
            topProxyLayout.setListener(icd);
        }
    }

    public void pvs(com.bytedance.sdk.component.adexpress.dynamic.Jd jd) {
        this.icD = jd;
    }

    public void pvs(int i) {
        TopProxyLayout topProxyLayout = this.pvs;
        if (topProxyLayout == null || !(topProxyLayout.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        ((ViewGroup.MarginLayoutParams) this.pvs.getLayoutParams()).topMargin = i - Pj.icD(this.vG, 20.0f);
    }

    public void icD(int i) {
        View findViewById;
        TopProxyLayout topProxyLayout = this.pvs;
        if (topProxyLayout == null || topProxyLayout.getITopLayout() == null || i == 0 || (findViewById = this.pvs.getITopLayout().findViewById(520093713)) == null || !(findViewById.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || findViewById.getWidth() <= 0 || findViewById.getVisibility() != 0) {
            return;
        }
        int[] iArr = new int[2];
        findViewById.getLocationOnScreen(iArr);
        int width = i - (iArr[0] + findViewById.getWidth());
        if (width < Pj.icD(this.vG, 16.0f)) {
            ((ViewGroup.MarginLayoutParams) findViewById.getLayoutParams()).rightMargin += Pj.icD(this.vG, 16.0f) - width;
            findViewById.requestLayout();
        }
    }
}
