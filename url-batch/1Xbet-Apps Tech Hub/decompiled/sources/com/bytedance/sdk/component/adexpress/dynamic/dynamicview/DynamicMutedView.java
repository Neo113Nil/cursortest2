package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.Jd.sUS;
import com.bytedance.sdk.component.adexpress.dynamic.vG.so;
import com.bytedance.sdk.component.utils.uc;

/* loaded from: classes.dex */
public class DynamicMutedView extends DynamicBaseWidgetImp implements com.bytedance.sdk.component.adexpress.dynamic.icD {
    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget
    public boolean NB() {
        return true;
    }

    public DynamicMutedView(Context context, DynamicRootView dynamicRootView, so soVar) {
        super(context, dynamicRootView, soVar);
        this.bNS = new ImageView(context);
        this.bNS.setTag(5);
        addView(this.bNS, getWidgetLayoutParams());
        dynamicRootView.setMuteListener(this);
        if (dynamicRootView.getRenderRequest() == null || dynamicRootView.getRenderRequest().dyT()) {
            return;
        }
        this.bNS.setVisibility(8);
        setVisibility(8);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Jd
    public boolean Mxy() {
        super.Mxy();
        if (sUS.icD(this.IP.getRenderRequest().Jd())) {
            ((ImageView) this.bNS).setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            ((ImageView) this.bNS).setScaleType(ImageView.ScaleType.CENTER);
        }
        setSoundMute(this.IP.icD);
        GradientDrawable gradientDrawable = (GradientDrawable) uc.vG(getContext(), "tt_ad_skip_btn_bg");
        gradientDrawable.setCornerRadius(this.so / 2);
        gradientDrawable.setColor(this.kj.Gp());
        ((ImageView) this.bNS).setBackgroundDrawable(gradientDrawable);
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.icD
    public void setSoundMute(boolean z) {
        int Jd;
        if (sUS.icD(this.IP.getRenderRequest().Jd())) {
            if (z) {
                Jd = uc.Jd(getContext(), "tt_reward_full_mute");
            } else {
                Jd = uc.Jd(getContext(), "tt_reward_full_unmute");
            }
        } else if (z) {
            Jd = uc.Jd(getContext(), "tt_mute");
        } else {
            Jd = uc.Jd(getContext(), "tt_unmute");
        }
        ((ImageView) this.bNS).setImageResource(Jd);
        if (((ImageView) this.bNS).getDrawable() != null) {
            ((ImageView) this.bNS).getDrawable().setAutoMirrored(true);
        }
    }
}
