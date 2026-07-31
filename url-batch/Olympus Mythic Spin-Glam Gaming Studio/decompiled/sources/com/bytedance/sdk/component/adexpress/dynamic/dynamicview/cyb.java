package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes5.dex */
public class cyb extends hhw implements com.bytedance.sdk.component.adexpress.dynamic.fs {
    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk
    public boolean btk() {
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hhw, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hhw, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public cyb(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar) {
        super(context, dynamicRootView, zgVar);
        ImageView imageView = new ImageView(context);
        this.cn = imageView;
        imageView.setTag(5);
        addView(this.cn, getWidgetLayoutParams());
        dynamicRootView.setMuteListener(this);
        if (dynamicRootView.getRenderRequest() == null || dynamicRootView.getRenderRequest().rp()) {
            return;
        }
        this.cn.setVisibility(8);
        setVisibility(8);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hhw, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.tf
    public boolean bvs() {
        super.bvs();
        if (com.bytedance.sdk.component.adexpress.fb.fs()) {
            ((ImageView) this.cn).setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            ((ImageView) this.cn).setScaleType(ImageView.ScaleType.CENTER);
        }
        setSoundMute(this.rt.mIsMute);
        if (com.bytedance.sdk.component.adexpress.fb.fs()) {
            Drawable zmn = com.bytedance.sdk.component.adexpress.fb.zn.zmn(getContext(), this.klz);
            if (zmn == null) {
                return true;
            }
            ((ImageView) this.cn).setBackground(zmn);
            return true;
        }
        ((ImageView) this.cn).setBackgroundDrawable(com.bytedance.sdk.component.adexpress.fb.zg.zmn(0, Integer.valueOf(this.klz.zak()), new int[]{this.zg / 2}, null, null, null));
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.fs
    public void setSoundMute(boolean z) {
        int fb;
        if (z) {
            fb = com.bytedance.sdk.component.utils.doe.fb(getContext(), "tt_reward_full_mute");
        } else {
            fb = com.bytedance.sdk.component.utils.doe.fb(getContext(), "tt_reward_full_unmute");
        }
        ((ImageView) this.cn).setImageResource(fb);
        if (((ImageView) this.cn).getDrawable() != null) {
            ((ImageView) this.cn).getDrawable().setAutoMirrored(true);
        }
    }
}
