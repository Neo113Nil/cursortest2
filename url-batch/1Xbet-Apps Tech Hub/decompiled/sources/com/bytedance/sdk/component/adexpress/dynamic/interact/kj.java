package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.HandLongPressView;

/* compiled from: LongPressInteract.java */
/* loaded from: classes.dex */
public class kj implements so {
    private HandLongPressView pvs;

    public kj(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.vG.yiw yiwVar) {
        this.pvs = new HandLongPressView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.Jd.yiw.pvs(context, 180.0f), (int) com.bytedance.sdk.component.adexpress.Jd.yiw.pvs(context, 180.0f));
        layoutParams.gravity = 17;
        this.pvs.setLayoutParams(layoutParams);
        this.pvs.setGuideText(yiwVar.cnN());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.so
    public void pvs() {
        this.pvs.pvs();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.so
    public void icD() {
        this.pvs.icD();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.so
    public ViewGroup vG() {
        return this.pvs;
    }
}
