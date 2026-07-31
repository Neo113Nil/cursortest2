package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public class kjb extends hhw implements com.bytedance.sdk.component.adexpress.dynamic.zn {
    private boolean doe;
    boolean fs;
    private int iqz;
    private int phc;
    int zmn;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hhw, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    public kjb(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar) {
        super(context, dynamicRootView, zgVar);
        this.phc = 0;
        setTag(Integer.valueOf(getClickArea()));
        zmn();
        dynamicRootView.setTimeOutListener(this);
        if (dynamicRootView.getRenderRequest() == null || dynamicRootView.getRenderRequest().rp()) {
            return;
        }
        View view = this.cn;
        if (view != null) {
            view.setVisibility(8);
        }
        setVisibility(8);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hhw
    protected FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk
    public void hhw() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        if (this.fs) {
            layoutParams.leftMargin = this.bvs;
        } else {
            layoutParams.leftMargin = this.bvs + this.phc;
        }
        if (this.doe && this.klz != null) {
            layoutParams.leftMargin = ((this.bvs + this.phc) - ((int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(com.bytedance.sdk.component.adexpress.fb.zmn(), this.klz.zn()))) - ((int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(com.bytedance.sdk.component.adexpress.fb.zmn(), this.klz.fb()));
        }
        if (com.bytedance.sdk.component.adexpress.fb.fs()) {
            layoutParams.topMargin = this.iv - ((int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(com.bytedance.sdk.component.adexpress.fb.zmn(), this.klz.fs()));
        } else {
            layoutParams.topMargin = this.iv;
        }
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hhw, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.tf
    public boolean bvs() {
        if (com.bytedance.sdk.component.adexpress.fb.hhw.fs(this.rt.getRenderRequest().fb())) {
            return true;
        }
        super.bvs();
        setPadding((int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(com.bytedance.sdk.component.adexpress.fb.zmn(), this.klz.zn()), (int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(com.bytedance.sdk.component.adexpress.fb.zmn(), this.klz.fs()), (int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(com.bytedance.sdk.component.adexpress.fb.zmn(), this.klz.fb()), (int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(com.bytedance.sdk.component.adexpress.fb.zmn(), this.klz.zmn()));
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hhw, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.doe && this.klz != null) {
            setMeasuredDimension(this.iqz + ((int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(com.bytedance.sdk.component.adexpress.fb.zmn(), this.klz.zn())) + ((int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(com.bytedance.sdk.component.adexpress.fb.zmn(), this.klz.fb())), this.zg);
        } else if (this.fs) {
            setMeasuredDimension(this.nps, this.zg);
        } else {
            setMeasuredDimension(this.zmn, this.zg);
        }
    }

    private void zmn() {
        List<com.bytedance.sdk.component.adexpress.dynamic.fb.zg> rc = this.mw.rc();
        if (rc == null || rc.size() <= 0) {
            return;
        }
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.fb.zg> it = rc.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.bytedance.sdk.component.adexpress.dynamic.fb.zg next = it.next();
            if (TextUtils.equals("skip-with-time-skip-btn", next.iv().fs())) {
                int zmn = (int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(this.rc, next.zg() + (com.bytedance.sdk.component.adexpress.fb.fs() ? next.mw() : 0));
                this.iqz = zmn;
                this.zmn = this.nps - zmn;
            }
        }
        this.phc = this.nps - this.zmn;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.zn
    public void zmn(CharSequence charSequence, boolean z, int i, boolean z2) {
        if (z2 && this.doe != z2) {
            this.doe = z2;
            hhw();
            return;
        }
        if (z && this.fs != z) {
            this.fs = z;
            hhw();
        }
        this.fs = z;
    }
}
