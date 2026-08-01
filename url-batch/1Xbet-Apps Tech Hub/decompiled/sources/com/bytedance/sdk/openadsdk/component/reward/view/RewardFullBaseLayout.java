package com.bytedance.sdk.openadsdk.component.reward.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;

/* loaded from: classes2.dex */
public class RewardFullBaseLayout extends PAGFrameLayout {
    private final com.bytedance.sdk.openadsdk.component.reward.pvs.pvs pvs;

    public RewardFullBaseLayout(com.bytedance.sdk.openadsdk.component.reward.pvs.pvs pvsVar) {
        super(pvsVar.jhZ);
        this.pvs = pvsVar;
    }

    public void pvs(com.bytedance.sdk.openadsdk.component.reward.icD.icD icd) {
        RFEndCardBackUpLayout so;
        icd.pvs(this);
        if (this.pvs.pvs != 1 && (so = icd.so()) != null) {
            addView(so, new FrameLayout.LayoutParams(-1, -1));
        }
        pvs(icd.Mxy(), this);
        pvs(icd.Wyp(), this);
    }

    private void pvs(View view, ViewGroup viewGroup) {
        if (view != null) {
            viewGroup.addView(view, new FrameLayout.LayoutParams(-1, -1));
        }
    }
}
