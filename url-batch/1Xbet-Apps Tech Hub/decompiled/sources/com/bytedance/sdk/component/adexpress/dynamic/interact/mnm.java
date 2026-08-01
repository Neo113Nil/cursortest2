package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.SlideRightView;

/* compiled from: SlideRightInteract.java */
/* loaded from: classes.dex */
public class mnm implements so {
    private com.bytedance.sdk.component.adexpress.dynamic.vG.yiw Jd;
    private Context icD;
    private SlideRightView pvs;
    private DynamicBaseWidget vG;

    public mnm(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.vG.yiw yiwVar) {
        this.icD = context;
        this.vG = dynamicBaseWidget;
        this.Jd = yiwVar;
        Jd();
    }

    private void Jd() {
        this.pvs = new SlideRightView(this.icD);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, (int) com.bytedance.sdk.component.adexpress.Jd.yiw.pvs(this.icD, 120.0f));
        layoutParams.gravity = 17;
        this.pvs.setLayoutParams(layoutParams);
        this.pvs.setClipChildren(false);
        this.pvs.setGuideText(this.Jd.cnN());
        DynamicBaseWidget dynamicBaseWidget = this.vG;
        if (dynamicBaseWidget != null) {
            this.pvs.setOnClickListener((View.OnClickListener) dynamicBaseWidget.getDynamicClickListener());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.so
    public void pvs() {
        SlideRightView slideRightView = this.pvs;
        if (slideRightView != null) {
            slideRightView.pvs();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.so
    public void icD() {
        SlideRightView slideRightView = this.pvs;
        if (slideRightView != null) {
            slideRightView.icD();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.so
    public ViewGroup vG() {
        return this.pvs;
    }
}
