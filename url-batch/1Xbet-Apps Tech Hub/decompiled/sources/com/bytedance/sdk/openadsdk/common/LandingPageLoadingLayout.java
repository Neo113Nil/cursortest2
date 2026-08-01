package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.model.bNS;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.model.vA;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.Pj;

/* loaded from: classes2.dex */
public class LandingPageLoadingLayout extends PAGFrameLayout {
    private long Jd;
    private Runnable NB;
    View icD;
    protected yiw pvs;
    private Runnable sUS;
    private int vG;

    public LandingPageLoadingLayout(Context context) {
        super(context);
        this.Jd = 10L;
        vG();
    }

    private void vG() {
        setBackgroundColor(-1);
        this.icD = new PAGLogoView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, Pj.icD(getContext(), 14.0f));
        this.icD.setVisibility(8);
        this.icD.setId(520093739);
        layoutParams.gravity = 8388691;
        layoutParams.leftMargin = Pj.icD(getContext(), 16.0f);
        layoutParams.bottomMargin = Pj.icD(getContext(), 16.0f);
        addView(this.icD, layoutParams);
        setVisibility(8);
    }

    public void pvs(cR cRVar, String str) {
        pvs(cRVar, str, false);
    }

    public void pvs(final cR cRVar, final String str, boolean z) {
        String str2;
        String[] strArr;
        bNS bns;
        vA vAVar;
        int i;
        bNS bns2 = null;
        if (cRVar != null) {
            vA Mxy = cRVar.Mxy();
            if (Mxy != null) {
                this.Jd = Mxy.pvs();
            }
            String BiC = cRVar.BiC();
            String[] Irm = cRVar.Irm();
            i = cRVar.VVr();
            if (cRVar.ea() != null && !TextUtils.isEmpty(cRVar.ea().pvs())) {
                bns2 = cRVar.ea();
            }
            bns = bns2;
            vAVar = Mxy;
            str2 = BiC;
            strArr = Irm;
        } else {
            str2 = null;
            strArr = null;
            bns = null;
            vAVar = null;
            i = 0;
        }
        if (i == 1) {
            this.pvs = new sUS(getContext(), str2, strArr, bns, vAVar);
        } else {
            this.pvs = new NB(getContext(), str2, strArr, bns, vAVar);
        }
        View NB = this.pvs.NB();
        if (NB.getParent() instanceof ViewGroup) {
            ((ViewGroup) NB.getParent()).removeView(NB);
        }
        addView(NB);
        View view = this.icD;
        if (view != null) {
            if (z) {
                view.setVisibility(0);
            }
            this.icD.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.LandingPageLoadingLayout.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    TTWebsiteActivity.pvs(LandingPageLoadingLayout.this.getContext(), cRVar, str);
                }
            });
        }
    }

    public void pvs() {
        post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.LandingPageLoadingLayout.2
            @Override // java.lang.Runnable
            public void run() {
                if (LandingPageLoadingLayout.this.pvs != null) {
                    LandingPageLoadingLayout.this.setVisibility(0);
                    LandingPageLoadingLayout.this.pvs.icD();
                }
            }
        });
        if (this.NB == null) {
            this.NB = new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.LandingPageLoadingLayout.3
                @Override // java.lang.Runnable
                public void run() {
                    LandingPageLoadingLayout.this.icD();
                }
            };
        }
        postDelayed(this.NB, this.Jd * 1000);
    }

    public void pvs(int i) {
        if (i == 100 || i - this.vG >= 7) {
            this.vG = i;
            if (com.bykv.vk.openvk.component.video.pvs.vG.pvs.icD()) {
                icD(this.vG);
                return;
            }
            if (this.sUS == null) {
                this.sUS = new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.LandingPageLoadingLayout.4
                    @Override // java.lang.Runnable
                    public void run() {
                        LandingPageLoadingLayout landingPageLoadingLayout = LandingPageLoadingLayout.this;
                        landingPageLoadingLayout.icD(landingPageLoadingLayout.vG);
                    }
                };
            }
            post(this.sUS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void icD(int i) {
        yiw yiwVar = this.pvs;
        if (yiwVar != null) {
            yiwVar.pvs(i);
        }
        if (i == 100) {
            icD();
        }
    }

    public void icD() {
        this.vG = 0;
        yiw yiwVar = this.pvs;
        if (yiwVar != null) {
            removeView(yiwVar.NB);
            this.pvs.Jd();
        }
        setVisibility(8);
        this.pvs = null;
        Runnable runnable = this.NB;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        Runnable runnable2 = this.sUS;
        if (runnable2 != null) {
            removeCallbacks(runnable2);
        }
        this.sUS = null;
        this.NB = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.NB;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.NB = null;
        }
    }
}
