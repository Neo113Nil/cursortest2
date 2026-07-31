package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes5.dex */
public class mw extends hhw {
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

    public mw(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar) {
        super(context, dynamicRootView, zgVar);
        TextView textView = new TextView(context);
        this.cn = textView;
        textView.setTag(Integer.valueOf(getClickArea()));
        addView(this.cn, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hhw, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.tf
    public boolean bvs() {
        com.bytedance.sdk.component.adexpress.fs.mw renderRequest;
        super.bvs();
        this.cn.setTextAlignment(this.klz.zg());
        ((TextView) this.cn).setTextColor(this.klz.nps());
        ((TextView) this.cn).setTextSize(this.klz.btk());
        if (com.bytedance.sdk.component.adexpress.fb.fs()) {
            int i = 0;
            ((TextView) this.cn).setIncludeFontPadding(false);
            ((TextView) this.cn).setTextSize(Math.min(((com.bytedance.sdk.component.adexpress.fb.nps.fs(com.bytedance.sdk.component.adexpress.fb.zmn(), this.zg) - this.klz.fs()) - this.klz.zmn()) - 0.5f, this.klz.btk()));
            DynamicRootView dynamicRootView = this.rt;
            if (dynamicRootView != null && (renderRequest = dynamicRootView.getRenderRequest()) != null) {
                String zak = renderRequest.zak();
                if (!TextUtils.isEmpty(zak)) {
                    ((TextView) this.cn).setText(zak);
                    ((TextView) this.cn).setVisibility(i);
                    return true;
                }
            }
            i = 8;
            ((TextView) this.cn).setVisibility(i);
            return true;
        }
        if (zmn()) {
            if (com.bytedance.sdk.component.adexpress.dynamic.btk.rc.fs()) {
                ((TextView) this.cn).setText(com.bytedance.sdk.component.adexpress.dynamic.btk.rc.zmn());
                return true;
            }
            ((TextView) this.cn).setText(com.bytedance.sdk.component.adexpress.dynamic.btk.rc.zmn(this.klz.fs));
            return true;
        }
        ((TextView) this.cn).setText(com.bytedance.sdk.component.utils.doe.fs(getContext(), "tt_logo_cn"));
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk
    public void hhw() {
        com.bytedance.sdk.component.adexpress.fs.mw renderRequest = this.rt.getRenderRequest();
        if (renderRequest != null && TextUtils.isEmpty(renderRequest.kjb())) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.nps, this.zg);
            layoutParams.gravity = 17;
            setLayoutParams(layoutParams);
            return;
        }
        super.hhw();
    }

    private boolean zmn() {
        if (com.bytedance.sdk.component.adexpress.fb.fs()) {
            return false;
        }
        return (!TextUtils.isEmpty(this.klz.fs) && this.klz.fs.contains("adx:")) || com.bytedance.sdk.component.adexpress.dynamic.btk.rc.fs();
    }
}
