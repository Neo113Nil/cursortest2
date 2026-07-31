package com.bytedance.sdk.openadsdk.component.reward.view;

import android.graphics.Color;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.utils.olo;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;

/* loaded from: classes15.dex */
public class iv extends rc {
    @Override // com.bytedance.sdk.openadsdk.component.reward.view.rc
    protected boolean zmn() {
        return false;
    }

    public iv(com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar) {
        super(fsVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.view.rc
    public void zmn(int i, int i2) {
        super.zmn(i, i2);
        if (nqi.btk(this.fb) && this.fb.nlz() == 3 && this.fb.es() == 0) {
            try {
                FrameLayout frameLayout = (FrameLayout) this.zn.hgd.findViewById(olo.klz);
                frameLayout.setBackgroundColor(Color.parseColor(POBCTAOverlayData.DEFAULT_CTA_TEXT_COLOR));
                if (this.fb.ol() == 1) {
                    int fs = jy.fs(kgc.zmn(), 90.0f);
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                    layoutParams.bottomMargin = fs;
                    frameLayout.setLayoutParams(layoutParams);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
