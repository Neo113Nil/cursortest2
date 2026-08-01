package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.Jd.yiw;
import com.bytedance.sdk.component.adexpress.dynamic.vG.so;
import java.util.List;

/* loaded from: classes.dex */
public class DynamicSkipCountDownContainer extends DynamicBaseWidgetImp implements com.bytedance.sdk.component.adexpress.dynamic.vG {
    private int icD;
    private int pvs;
    private int uc;

    public DynamicSkipCountDownContainer(Context context, DynamicRootView dynamicRootView, so soVar) {
        super(context, dynamicRootView, soVar);
        setTag(Integer.valueOf(getClickArea()));
        dynamicRootView.setTimeOutListener(this);
        pvs();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp
    protected FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Jd
    public boolean Mxy() {
        setBackground(getBackgroundDrawable());
        setPadding((int) yiw.pvs(com.bytedance.sdk.component.adexpress.Jd.pvs(), this.kj.vG()), (int) yiw.pvs(com.bytedance.sdk.component.adexpress.Jd.pvs(), this.kj.icD()), (int) yiw.pvs(com.bytedance.sdk.component.adexpress.Jd.pvs(), this.kj.Jd()), (int) yiw.pvs(com.bytedance.sdk.component.adexpress.Jd.pvs(), this.kj.pvs()));
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget
    public void sUS() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = this.Mxy;
        layoutParams.topMargin = this.Wyp;
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.uc == 0) {
            setMeasuredDimension(this.icD, this.so);
        } else {
            setMeasuredDimension(this.pvs, this.so);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.vG
    public void pvs(CharSequence charSequence, boolean z, int i, boolean z2) {
        this.uc = i;
    }

    private void pvs() {
        List<so> qh = this.Ju.qh();
        if (qh == null || qh.size() <= 0) {
            return;
        }
        for (so soVar : qh) {
            if (soVar.Wyp().pvs() == 21) {
                this.pvs = (int) (this.yiw - yiw.pvs(this.qh, soVar.so()));
            }
            if (soVar.Wyp().pvs() == 20) {
                this.icD = (int) (this.yiw - yiw.pvs(this.qh, soVar.so()));
            }
        }
    }
}
