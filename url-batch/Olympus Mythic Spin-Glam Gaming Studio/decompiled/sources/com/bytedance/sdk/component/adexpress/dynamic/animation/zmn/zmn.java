package com.bytedance.sdk.component.adexpress.dynamic.animation.zmn;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public class zmn extends fb {
    public zmn(View view, com.bytedance.sdk.component.adexpress.dynamic.fb.zmn zmnVar) {
        super(view, zmnVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.zmn.fb
    List<ObjectAnimator> zmn() {
        float kgc = this.fs.kgc() / 100.0f;
        float kw = this.fs.kw() / 100.0f;
        if ("reverse".equals(this.fs.cyb()) && this.fs.rt() <= 0.0d) {
            kw = kgc;
            kgc = kw;
        }
        this.zn.setAlpha(kgc);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.zn, "alpha", kgc, kw).setDuration((int) (this.fs.iv() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(zmn(duration));
        return arrayList;
    }
}
