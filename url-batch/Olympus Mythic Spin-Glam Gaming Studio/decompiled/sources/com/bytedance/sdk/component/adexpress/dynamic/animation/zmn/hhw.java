package com.bytedance.sdk.component.adexpress.dynamic.animation.zmn;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes14.dex */
public class hhw extends fb {
    public hhw(View view, com.bytedance.sdk.component.adexpress.dynamic.fb.zmn zmnVar) {
        super(view, zmnVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.zmn.fb
    List<ObjectAnimator> zmn() {
        float f = this.zn.getLayoutParams().width;
        this.zn.setTranslationX(f);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.zn, "translationX", f, 0.0f).setDuration((int) (this.fs.iv() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.zn, "alpha", 0.0f, 1.0f).setDuration((int) (this.fs.iv() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(zmn(duration));
        arrayList.add(zmn(duration2));
        return arrayList;
    }
}
