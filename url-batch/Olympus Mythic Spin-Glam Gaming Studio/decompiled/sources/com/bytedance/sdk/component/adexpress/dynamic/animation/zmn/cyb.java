package com.bytedance.sdk.component.adexpress.dynamic.animation.zmn;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes14.dex */
public class cyb extends fb {
    public cyb(View view, com.bytedance.sdk.component.adexpress.dynamic.fb.zmn zmnVar) {
        super(view, zmnVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.zmn.fb
    List<ObjectAnimator> zmn() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.zn, "translationX", 0.0f, com.bytedance.sdk.component.adexpress.fb.nps.zmn(com.bytedance.sdk.component.adexpress.fb.zmn(), 20.0f), 0.0f, -com.bytedance.sdk.component.adexpress.fb.nps.zmn(com.bytedance.sdk.component.adexpress.fb.zmn(), 20.0f), 0.0f).setDuration((int) (this.fs.iv() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(zmn(duration));
        return arrayList;
    }
}
