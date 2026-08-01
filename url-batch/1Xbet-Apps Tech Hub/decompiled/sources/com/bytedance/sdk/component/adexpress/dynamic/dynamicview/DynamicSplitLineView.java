package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.vG.so;

/* loaded from: classes.dex */
public class DynamicSplitLineView extends DynamicBaseWidgetImp {
    public DynamicSplitLineView(Context context, DynamicRootView dynamicRootView, so soVar) {
        super(context, dynamicRootView, soVar);
        this.bNS = new View(context);
        addView(this.bNS, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Jd
    public boolean Mxy() {
        super.Mxy();
        this.bNS.setBackgroundColor(this.kj.Gp());
        return true;
    }
}
