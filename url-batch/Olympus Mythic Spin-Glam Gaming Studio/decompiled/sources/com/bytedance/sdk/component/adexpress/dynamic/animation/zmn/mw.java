package com.bytedance.sdk.component.adexpress.dynamic.animation.zmn;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes13.dex */
public class mw extends fb {
    public mw(View view, com.bytedance.sdk.component.adexpress.dynamic.fb.zmn zmnVar) {
        super(view, zmnVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.zmn.fb
    List<ObjectAnimator> zmn() {
        View view = this.zn;
        if ((view instanceof ImageView) && (view.getParent() instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rc)) {
            View view2 = (View) this.zn.getParent();
            this.zn = view2;
            ((ViewGroup) view2).setClipChildren(true);
            ((ViewGroup) this.zn.getParent()).setClipChildren(true);
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.zn, "stretchValue", 0.0f, 1.0f).setDuration((int) (this.fs.iv() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(zmn(duration));
        return arrayList;
    }
}
