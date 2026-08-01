package com.bytedance.sdk.component.adexpress.dynamic.animation.pvs;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: TranslateAnimation.java */
/* loaded from: classes.dex */
public class bNS extends Jd {
    public bNS(View view, com.bytedance.sdk.component.adexpress.dynamic.vG.pvs pvsVar) {
        super(view, pvsVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.pvs.Jd
    List<ObjectAnimator> pvs() {
        float f;
        float pvs = com.bytedance.sdk.component.adexpress.Jd.yiw.pvs(com.bytedance.sdk.component.adexpress.Jd.pvs(), this.icD.sUS());
        float pvs2 = com.bytedance.sdk.component.adexpress.Jd.yiw.pvs(com.bytedance.sdk.component.adexpress.Jd.pvs(), this.icD.yiw());
        float f2 = 0.0f;
        if ("reverse".equals(this.icD.mnm())) {
            f = pvs2;
            pvs2 = 0.0f;
            f2 = pvs;
            pvs = 0.0f;
        } else {
            f = 0.0f;
        }
        if (com.bytedance.sdk.component.adexpress.Jd.icD.pvs(this.vG.getContext())) {
            pvs = -pvs;
            f2 = -f2;
        }
        this.vG.setTranslationX(pvs);
        this.vG.setTranslationY(pvs2);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.vG, "translationX", pvs, f2).setDuration((int) (this.icD.Wyp() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.vG, "translationY", pvs2, f).setDuration((int) (this.icD.Wyp() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(pvs(duration));
        arrayList.add(pvs(duration2));
        return arrayList;
    }
}
