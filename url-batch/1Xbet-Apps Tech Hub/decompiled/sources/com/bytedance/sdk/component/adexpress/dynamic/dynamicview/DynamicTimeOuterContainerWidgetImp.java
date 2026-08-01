package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.Jd.sUS;
import com.bytedance.sdk.component.adexpress.Jd.yiw;
import com.bytedance.sdk.component.adexpress.dynamic.vG.so;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class DynamicTimeOuterContainerWidgetImp extends DynamicBaseWidgetImp implements com.bytedance.sdk.component.adexpress.dynamic.vG {
    private boolean OT;
    boolean icD;
    int pvs;
    private int rCZ;
    private int uc;

    public DynamicTimeOuterContainerWidgetImp(Context context, DynamicRootView dynamicRootView, so soVar) {
        super(context, dynamicRootView, soVar);
        this.rCZ = 0;
        setTag(Integer.valueOf(getClickArea()));
        pvs();
        dynamicRootView.setTimeOutListener(this);
        if (dynamicRootView.getRenderRequest() == null || dynamicRootView.getRenderRequest().dyT()) {
            return;
        }
        if (this.bNS != null) {
            this.bNS.setVisibility(8);
        }
        setVisibility(8);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp
    protected FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget
    public void sUS() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        if (this.icD) {
            layoutParams.leftMargin = this.Mxy;
        } else {
            layoutParams.leftMargin = this.Mxy + this.rCZ;
        }
        if (this.OT && this.kj != null) {
            layoutParams.leftMargin = ((this.Mxy + this.rCZ) - ((int) yiw.pvs(com.bytedance.sdk.component.adexpress.Jd.pvs(), this.kj.vG()))) - ((int) yiw.pvs(com.bytedance.sdk.component.adexpress.Jd.pvs(), this.kj.Jd()));
        }
        if (com.bytedance.sdk.component.adexpress.Jd.icD()) {
            layoutParams.topMargin = this.Wyp - ((int) yiw.pvs(com.bytedance.sdk.component.adexpress.Jd.pvs(), this.kj.icD()));
        } else {
            layoutParams.topMargin = this.Wyp;
        }
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Jd
    public boolean Mxy() {
        if (sUS.icD(this.IP.getRenderRequest().Jd())) {
            return true;
        }
        super.Mxy();
        setPadding((int) yiw.pvs(com.bytedance.sdk.component.adexpress.Jd.pvs(), this.kj.vG()), (int) yiw.pvs(com.bytedance.sdk.component.adexpress.Jd.pvs(), this.kj.icD()), (int) yiw.pvs(com.bytedance.sdk.component.adexpress.Jd.pvs(), this.kj.Jd()), (int) yiw.pvs(com.bytedance.sdk.component.adexpress.Jd.pvs(), this.kj.pvs()));
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.OT && this.kj != null) {
            setMeasuredDimension(this.uc + ((int) yiw.pvs(com.bytedance.sdk.component.adexpress.Jd.pvs(), this.kj.vG())) + ((int) yiw.pvs(com.bytedance.sdk.component.adexpress.Jd.pvs(), this.kj.Jd())), this.so);
        } else if (this.icD) {
            setMeasuredDimension(this.yiw, this.so);
        } else {
            setMeasuredDimension(this.pvs, this.so);
        }
    }

    private void pvs() {
        List<so> qh = this.Ju.qh();
        if (qh == null || qh.size() <= 0) {
            return;
        }
        Iterator<so> it = qh.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            so next = it.next();
            if (TextUtils.equals("skip-with-time-skip-btn", next.Wyp().icD())) {
                this.uc = (int) yiw.pvs(this.qh, next.so() + (com.bytedance.sdk.component.adexpress.Jd.icD() ? next.Ju() : 0));
                this.pvs = this.yiw - this.uc;
            }
        }
        this.rCZ = this.yiw - this.pvs;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.vG
    public void pvs(CharSequence charSequence, boolean z, int i, boolean z2) {
        if (z2 && this.OT != z2) {
            this.OT = z2;
            sUS();
            return;
        }
        if (z && this.icD != z) {
            this.icD = z;
            sUS();
        }
        this.icD = z;
    }
}
