package com.bytedance.sdk.component.adexpress.dynamic.animation.zmn;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class nps extends fb {
    public nps(View view, com.bytedance.sdk.component.adexpress.dynamic.fb.zmn zmnVar) {
        super(view, zmnVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.zmn.fb
    @SuppressLint({"ObjectAnimatorBinding"})
    List<ObjectAnimator> zmn() {
        this.zn.setTag(2097610709, Integer.valueOf(this.fs.zn()));
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.zn, "marqueeValue", 0.0f, 1.0f).setDuration((int) (this.fs.iv() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(zmn(duration));
        return arrayList;
    }
}
