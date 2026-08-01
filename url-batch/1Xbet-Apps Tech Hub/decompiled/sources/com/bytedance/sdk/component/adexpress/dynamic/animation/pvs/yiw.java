package com.bytedance.sdk.component.adexpress.dynamic.animation.pvs;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MarqueeAnimation.java */
/* loaded from: classes.dex */
public class yiw extends Jd {
    public yiw(View view, com.bytedance.sdk.component.adexpress.dynamic.vG.pvs pvsVar) {
        super(view, pvsVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.pvs.Jd
    List<ObjectAnimator> pvs() {
        this.vG.setTag(2097610709, Integer.valueOf(this.icD.vG()));
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.vG, "marqueeValue", 0.0f, 1.0f).setDuration((int) (this.icD.Wyp() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(pvs(duration));
        return arrayList;
    }
}
