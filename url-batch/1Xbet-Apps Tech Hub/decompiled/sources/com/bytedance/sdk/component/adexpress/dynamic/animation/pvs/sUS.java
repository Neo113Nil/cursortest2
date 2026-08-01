package com.bytedance.sdk.component.adexpress.dynamic.animation.pvs;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CutInAnimation.java */
/* loaded from: classes.dex */
public class sUS extends Jd {
    public sUS(View view, com.bytedance.sdk.component.adexpress.dynamic.vG.pvs pvsVar) {
        super(view, pvsVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.pvs.Jd
    List<ObjectAnimator> pvs() {
        float f = this.vG.getLayoutParams().width;
        this.vG.setTranslationX(f);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.vG, "translationX", f, 0.0f).setDuration((int) (this.icD.Wyp() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.vG, "alpha", 0.0f, 1.0f).setDuration((int) (this.icD.Wyp() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(pvs(duration));
        arrayList.add(pvs(duration2));
        return arrayList;
    }
}
