package com.bytedance.sdk.component.adexpress.dynamic.animation.pvs;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ShineAnimation.java */
/* loaded from: classes.dex */
public class kj extends Jd {
    public kj(View view, com.bytedance.sdk.component.adexpress.dynamic.vG.pvs pvsVar) {
        super(view, pvsVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.pvs.Jd
    List<ObjectAnimator> pvs() {
        int i;
        int i2;
        this.vG.setTag(2097610711, Integer.valueOf(this.icD.Jd()));
        if (this.vG == null || !com.bytedance.sdk.component.adexpress.Jd.icD.pvs(this.vG.getContext())) {
            i = 0;
            i2 = 1;
        } else {
            i2 = 0;
            i = 1;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.vG, "shineValue", i, i2).setDuration((int) (this.icD.Wyp() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(pvs(duration));
        return arrayList;
    }
}
