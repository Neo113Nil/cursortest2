package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import com.bytedance.sdk.component.adexpress.Jd.yiw;
import com.bytedance.sdk.component.adexpress.dynamic.vG.so;
import com.bytedance.sdk.component.adexpress.widget.DislikeView;

/* loaded from: classes.dex */
public class DynamicDislike extends DynamicBaseWidgetImp {
    public DynamicDislike(Context context, DynamicRootView dynamicRootView, so soVar) {
        super(context, dynamicRootView, soVar);
        this.bNS = new DislikeView(context);
        this.bNS.setTag(3);
        addView(this.bNS, getWidgetLayoutParams());
        dynamicRootView.setDislikeView(this.bNS);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Jd
    public boolean Mxy() {
        super.Mxy();
        int pvs = (int) yiw.pvs(this.qh, this.kj.vA());
        if (!(this.bNS instanceof DislikeView)) {
            return true;
        }
        ((DislikeView) this.bNS).setRadius((int) yiw.pvs(this.qh, this.kj.bNS()));
        ((DislikeView) this.bNS).setStrokeWidth(pvs);
        ((DislikeView) this.bNS).setStrokeColor(this.kj.mnm());
        ((DislikeView) this.bNS).setBgColor(this.kj.Gp());
        ((DislikeView) this.bNS).setDislikeColor(this.kj.yiw());
        ((DislikeView) this.bNS).setDislikeWidth((int) yiw.pvs(this.qh, 1.0f));
        return true;
    }
}
