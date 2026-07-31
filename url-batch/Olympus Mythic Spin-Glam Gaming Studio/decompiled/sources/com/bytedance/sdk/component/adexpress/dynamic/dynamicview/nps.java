package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes13.dex */
public class nps extends hhw {
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

    public nps(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar) {
        super(context, dynamicRootView, zgVar);
        com.bytedance.sdk.component.adexpress.dynamic.animation.view.zmn zmnVar = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.zmn(context);
        this.cn = zmnVar;
        zmnVar.setTag(Integer.valueOf(getClickArea()));
        addView(this.cn, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hhw
    protected FrameLayout.LayoutParams getWidgetLayoutParams() {
        if (com.bytedance.sdk.component.adexpress.fb.fs() && "fillButton".equals(this.mw.iv().fs())) {
            ((TextView) this.cn).setEllipsize(TextUtils.TruncateAt.END);
            ((TextView) this.cn).setMaxLines(1);
            FrameLayout.LayoutParams widgetLayoutParams = super.getWidgetLayoutParams();
            widgetLayoutParams.width -= this.klz.kgc() * 2;
            widgetLayoutParams.height -= this.klz.kgc() * 2;
            widgetLayoutParams.topMargin += this.klz.kgc();
            int kgc = widgetLayoutParams.leftMargin + this.klz.kgc();
            widgetLayoutParams.leftMargin = kgc;
            widgetLayoutParams.setMarginStart(kgc);
            widgetLayoutParams.setMarginEnd(widgetLayoutParams.rightMargin);
            return widgetLayoutParams;
        }
        return super.getWidgetLayoutParams();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hhw, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.tf
    public boolean bvs() {
        super.bvs();
        if (TextUtils.equals("download-progress-button", this.mw.iv().fs()) && TextUtils.isEmpty(this.klz.iv())) {
            this.cn.setVisibility(4);
            return true;
        }
        this.cn.setTextAlignment(this.klz.zg());
        ((TextView) this.cn).setText(this.klz.iv());
        ((TextView) this.cn).setTextColor(this.klz.nps());
        ((TextView) this.cn).setTextSize(this.klz.btk());
        ((TextView) this.cn).setGravity(17);
        ((TextView) this.cn).setIncludeFontPadding(false);
        if ("fillButton".equals(this.mw.iv().fs())) {
            this.cn.setPadding(0, 0, 0, 0);
        } else {
            this.cn.setPadding(this.klz.zn(), this.klz.fs(), this.klz.fb(), this.klz.zmn());
        }
        return true;
    }
}
