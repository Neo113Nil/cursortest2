package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.Jd.yiw;
import com.bytedance.sdk.component.adexpress.dynamic.vG.so;
import com.bytedance.sdk.component.utils.uc;

/* loaded from: classes.dex */
public class DynamicDislikeFeedBack extends DynamicBaseWidgetImp {
    public DynamicDislikeFeedBack(Context context, DynamicRootView dynamicRootView, so soVar) {
        super(context, dynamicRootView, soVar);
        if (com.bytedance.sdk.component.adexpress.Jd.icD()) {
            this.bNS = new ImageView(context);
            ((ImageView) this.bNS).setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.yiw = this.so;
        } else {
            this.bNS = new TextView(context);
        }
        this.bNS.setTag(3);
        addView(this.bNS, getWidgetLayoutParams());
        dynamicRootView.setDislikeView(this.bNS);
        if (dynamicRootView.getRenderRequest() != null) {
            if (dynamicRootView.getRenderRequest().so() && dynamicRootView.getRenderRequest().dyT()) {
                return;
            }
            this.bNS.setVisibility(8);
            setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Jd
    public boolean Mxy() {
        super.Mxy();
        if (com.bytedance.sdk.component.adexpress.Jd.icD()) {
            GradientDrawable gradientDrawable = (GradientDrawable) uc.vG(getContext(), "tt_ad_skip_btn_bg");
            gradientDrawable.setCornerRadius(this.so / 2);
            gradientDrawable.setColor(this.kj.Gp());
            ((ImageView) this.bNS).setBackgroundDrawable(gradientDrawable);
            ((ImageView) this.bNS).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ((ImageView) this.bNS).setImageResource(uc.Jd(getContext(), "tt_reward_full_feedback"));
            return true;
        }
        ((TextView) this.bNS).setText(getText());
        this.bNS.setTextAlignment(this.kj.so());
        ((TextView) this.bNS).setTextColor(this.kj.yiw());
        ((TextView) this.bNS).setTextSize(this.kj.NB());
        this.bNS.setBackground(getBackgroundDrawable());
        if (!this.kj.OT()) {
            ((TextView) this.bNS).setMaxLines(1);
            ((TextView) this.bNS).setGravity(17);
            ((TextView) this.bNS).setEllipsize(TextUtils.TruncateAt.END);
        } else {
            int ny = this.kj.ny();
            if (ny > 0) {
                ((TextView) this.bNS).setLines(ny);
                ((TextView) this.bNS).setEllipsize(TextUtils.TruncateAt.END);
            }
        }
        this.bNS.setPadding((int) yiw.pvs(com.bytedance.sdk.component.adexpress.Jd.pvs(), this.kj.vG()), (int) yiw.pvs(com.bytedance.sdk.component.adexpress.Jd.pvs(), this.kj.icD()), (int) yiw.pvs(com.bytedance.sdk.component.adexpress.Jd.pvs(), this.kj.Jd()), (int) yiw.pvs(com.bytedance.sdk.component.adexpress.Jd.pvs(), this.kj.pvs()));
        ((TextView) this.bNS).setGravity(17);
        return true;
    }

    public String getText() {
        return uc.pvs(com.bytedance.sdk.component.adexpress.Jd.pvs(), "tt_reward_feedback");
    }
}
