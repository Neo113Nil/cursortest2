package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.dynamic.vG.so;
import com.bytedance.sdk.component.utils.uc;

/* loaded from: classes.dex */
public class DynamicTimeOuterRewardFullSkip extends DynamicBaseWidgetImp implements com.bytedance.sdk.component.adexpress.dynamic.vG {
    private boolean pvs;

    public DynamicTimeOuterRewardFullSkip(Context context, DynamicRootView dynamicRootView, so soVar) {
        super(context, dynamicRootView, soVar);
        if (dynamicRootView.getRenderRequest() != null) {
            this.pvs = dynamicRootView.getRenderRequest().Ju();
        }
        this.yiw = this.so;
        this.bNS = new ImageView(context);
        this.bNS.setTag(Integer.valueOf(getClickArea()));
        addView(this.bNS, getWidgetLayoutParams());
        dynamicRootView.setTimeOutListener(this);
        if (dynamicRootView.getRenderRequest() == null || dynamicRootView.getRenderRequest().dyT()) {
            return;
        }
        this.bNS.setVisibility(8);
        setVisibility(8);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Jd
    public boolean Mxy() {
        super.Mxy();
        ((ImageView) this.bNS).setScaleType(ImageView.ScaleType.CENTER_CROP);
        GradientDrawable gradientDrawable = (GradientDrawable) uc.vG(getContext(), "tt_ad_skip_btn_bg");
        gradientDrawable.setCornerRadius(this.so / 2);
        gradientDrawable.setColor(this.kj.Gp());
        ((ImageView) this.bNS).setBackgroundDrawable(gradientDrawable);
        ((ImageView) this.bNS).setImageResource(this.pvs ? uc.Jd(getContext(), "tt_close_move_details_normal") : uc.Jd(getContext(), "tt_skip_btn_wrapper"));
        setVisibility(8);
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.vG
    public void pvs(CharSequence charSequence, boolean z, int i, boolean z2) {
        int i2 = 0;
        if (!z && !z2) {
            i2 = 8;
        }
        setVisibility(i2);
    }
}
