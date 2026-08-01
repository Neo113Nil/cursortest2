package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.dynamic.vG.so;
import com.bytedance.sdk.component.utils.uc;

/* loaded from: classes.dex */
public class DynamicLogoUnion extends DynamicBaseWidgetImp {
    public DynamicLogoUnion(Context context, DynamicRootView dynamicRootView, so soVar) {
        super(context, dynamicRootView, soVar);
        this.bNS = new ImageView(context);
        this.bNS.setTag(Integer.valueOf(getClickArea()));
        if (com.bytedance.sdk.component.adexpress.Jd.icD()) {
            this.so = Math.max(dynamicRootView.getLogoUnionHeight(), this.so);
        }
        addView(this.bNS, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Jd
    public boolean Mxy() {
        super.Mxy();
        if (com.bytedance.sdk.component.adexpress.Jd.icD()) {
            ((ImageView) this.bNS).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ((ImageView) this.bNS).setImageResource(uc.Jd(getContext(), "tt_ad_logo_reward_full"));
        } else {
            ((ImageView) this.bNS).setImageResource(uc.Jd(getContext(), "tt_ad_logo"));
        }
        ((ImageView) this.bNS).setColorFilter(this.kj.yiw(), PorterDuff.Mode.SRC_IN);
        return true;
    }
}
