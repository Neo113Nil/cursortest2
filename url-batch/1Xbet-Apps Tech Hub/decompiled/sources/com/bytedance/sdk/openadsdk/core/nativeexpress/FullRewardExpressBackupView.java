package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.utils.Pj;

/* loaded from: classes2.dex */
public class FullRewardExpressBackupView extends BackupView {
    private FrameLayout IP;
    private NativeExpressView Ju;
    private FrameLayout pvs;

    public FullRewardExpressBackupView(Context context) {
        super(context);
        this.icD = context;
    }

    public void pvs(cR cRVar, NativeExpressView nativeExpressView) {
        if (cRVar == null) {
            return;
        }
        setBackgroundColor(-1);
        this.vG = cRVar;
        this.Ju = nativeExpressView;
        if (cRVar.VLm() == 7) {
            this.sUS = "rewarded_video";
        } else {
            this.sUS = "fullscreen_interstitial_ad";
        }
        icD();
        this.Ju.addView(this, new ViewGroup.LayoutParams(-2, -2));
    }

    private void icD() {
        this.yiw = Pj.icD(this.icD, this.Ju.getExpectExpressWidth());
        this.so = Pj.icD(this.icD, this.Ju.getExpectExpressWidth());
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(this.yiw, this.so);
        }
        layoutParams.width = this.yiw;
        layoutParams.height = this.so;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        setLayoutParams(layoutParams);
        this.vG.ae();
        vG();
    }

    private void vG() {
        PAGFrameLayout pAGFrameLayout = new PAGFrameLayout(this.icD);
        this.pvs = pAGFrameLayout;
        addView(pAGFrameLayout, new FrameLayout.LayoutParams(-1, -1));
        PAGFrameLayout pAGFrameLayout2 = new PAGFrameLayout(this.icD);
        this.IP = pAGFrameLayout2;
        this.pvs.addView(pAGFrameLayout2, new FrameLayout.LayoutParams(-1, -1));
        this.IP.removeAllViews();
    }

    public FrameLayout getVideoContainer() {
        return this.IP;
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView
    protected void pvs(View view, int i, com.bytedance.sdk.openadsdk.core.model.IP ip) {
        NativeExpressView nativeExpressView = this.Ju;
        if (nativeExpressView != null) {
            nativeExpressView.pvs(view, i, ip);
        }
    }

    public View getBackupContainerBackgroundView() {
        return this.pvs;
    }
}
