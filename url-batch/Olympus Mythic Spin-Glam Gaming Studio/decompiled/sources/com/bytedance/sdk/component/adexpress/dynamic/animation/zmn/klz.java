package com.bytedance.sdk.component.adexpress.dynamic.animation.zmn;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class klz extends fb {
    public klz(View view, com.bytedance.sdk.component.adexpress.dynamic.fb.zmn zmnVar) {
        super(view, zmnVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.zmn.fb
    @SuppressLint({"ObjectAnimatorBinding"})
    List<ObjectAnimator> zmn() {
        int i;
        int i2;
        this.zn.setTag(2097610711, Integer.valueOf(this.fs.fb()));
        View view = this.zn;
        if (view == null || !com.bytedance.sdk.component.adexpress.fb.fs.zmn(view.getContext())) {
            i = 0;
            i2 = 1;
        } else {
            i2 = 0;
            i = 1;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.zn, "shineValue", i, i2).setDuration((int) (this.fs.iv() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(zmn(duration));
        return arrayList;
    }
}
