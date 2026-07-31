package com.bytedance.sdk.component.adexpress.dynamic.animation.zmn;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes13.dex */
public class cn extends fb {
    public cn(View view, com.bytedance.sdk.component.adexpress.dynamic.fb.zmn zmnVar) {
        super(view, zmnVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.zmn.fb
    List<ObjectAnimator> zmn() {
        float f;
        float zmn = com.bytedance.sdk.component.adexpress.fb.nps.zmn(com.bytedance.sdk.component.adexpress.fb.zmn(), this.fs.hhw());
        float zmn2 = com.bytedance.sdk.component.adexpress.fb.nps.zmn(com.bytedance.sdk.component.adexpress.fb.zmn(), this.fs.nps());
        float f2 = 0.0f;
        if ("reverse".equals(this.fs.cyb())) {
            f = zmn2;
            zmn2 = 0.0f;
            f2 = zmn;
            zmn = 0.0f;
        } else {
            f = 0.0f;
        }
        if (com.bytedance.sdk.component.adexpress.fb.fs.zmn(this.zn.getContext())) {
            zmn = -zmn;
            f2 = -f2;
        }
        this.zn.setTranslationX(zmn);
        this.zn.setTranslationY(zmn2);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.zn, "translationX", zmn, f2).setDuration((int) (this.fs.iv() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.zn, "translationY", zmn2, f).setDuration((int) (this.fs.iv() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(zmn(duration));
        arrayList.add(zmn(duration2));
        return arrayList;
    }
}
