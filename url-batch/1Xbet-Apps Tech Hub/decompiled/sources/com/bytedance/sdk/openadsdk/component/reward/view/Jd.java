package com.bytedance.sdk.openadsdk.component.reward.view;

import android.graphics.Color;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.kj;

/* compiled from: RewardFullNativeVideoLayout.java */
/* loaded from: classes2.dex */
public class Jd extends NB {
    @Override // com.bytedance.sdk.openadsdk.component.reward.view.NB
    protected boolean pvs() {
        return false;
    }

    public Jd(com.bytedance.sdk.openadsdk.component.reward.pvs.pvs pvsVar) {
        super(pvsVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.view.NB
    public void pvs(int i, int i2) {
        super.pvs(i, i2);
        if (cR.NB(this.Jd) && this.Jd.Gp() == 3 && this.Jd.ae() == 0) {
            try {
                FrameLayout frameLayout = (FrameLayout) this.vG.qD.findViewById(kj.Wyp);
                frameLayout.setBackgroundColor(Color.parseColor("#000000"));
                if (this.Jd.rcB() == 1) {
                    int icD = Pj.icD(mnm.pvs(), 90.0f);
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                    layoutParams.bottomMargin = icD;
                    frameLayout.setLayoutParams(layoutParams);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
