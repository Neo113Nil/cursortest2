package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import java.util.List;

/* loaded from: classes3.dex */
public class doe extends hhw implements com.bytedance.sdk.component.adexpress.dynamic.zn {
    private int fs;
    private int iqz;
    private int zmn;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hhw, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    public doe(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar) {
        super(context, dynamicRootView, zgVar);
        setTag(Integer.valueOf(getClickArea()));
        dynamicRootView.setTimeOutListener(this);
        zmn();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hhw
    protected FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hhw, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.tf
    public boolean bvs() {
        setBackground(getBackgroundDrawable());
        setPadding((int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(com.bytedance.sdk.component.adexpress.fb.zmn(), this.klz.zn()), (int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(com.bytedance.sdk.component.adexpress.fb.zmn(), this.klz.fs()), (int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(com.bytedance.sdk.component.adexpress.fb.zmn(), this.klz.fb()), (int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(com.bytedance.sdk.component.adexpress.fb.zmn(), this.klz.zmn()));
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk
    public void hhw() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int i = this.bvs;
        layoutParams.leftMargin = i;
        layoutParams.topMargin = this.iv;
        layoutParams.setMarginStart(i);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hhw, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.iqz == 0) {
            setMeasuredDimension(this.fs, this.zg);
        } else {
            setMeasuredDimension(this.zmn, this.zg);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.zn
    public void zmn(CharSequence charSequence, boolean z, int i, boolean z2) {
        this.iqz = i;
    }

    private void zmn() {
        List<com.bytedance.sdk.component.adexpress.dynamic.fb.zg> rc = this.mw.rc();
        if (rc == null || rc.size() <= 0) {
            return;
        }
        for (com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar : rc) {
            if (zgVar.iv().zmn() == 21) {
                this.zmn = (int) (this.nps - com.bytedance.sdk.component.adexpress.fb.nps.zmn(this.rc, zgVar.zg()));
            }
            if (zgVar.iv().zmn() == 20) {
                this.fs = (int) (this.nps - com.bytedance.sdk.component.adexpress.fb.nps.zmn(this.rc, zgVar.zg()));
            }
        }
    }
}
