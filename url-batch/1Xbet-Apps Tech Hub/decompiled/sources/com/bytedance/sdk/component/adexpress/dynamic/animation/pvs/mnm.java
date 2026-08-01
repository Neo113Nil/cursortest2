package com.bytedance.sdk.component.adexpress.dynamic.animation.pvs;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WaggleAnimation.java */
/* loaded from: classes.dex */
public class mnm extends Jd {
    public mnm(View view, com.bytedance.sdk.component.adexpress.dynamic.vG.pvs pvsVar) {
        super(view, pvsVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.pvs.Jd
    List<ObjectAnimator> pvs() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.vG, "translationX", 0.0f, com.bytedance.sdk.component.adexpress.Jd.yiw.pvs(com.bytedance.sdk.component.adexpress.Jd.pvs(), 20.0f), 0.0f, -com.bytedance.sdk.component.adexpress.Jd.yiw.pvs(com.bytedance.sdk.component.adexpress.Jd.pvs(), 20.0f), 0.0f).setDuration((int) (this.icD.Wyp() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(pvs(duration));
        return arrayList;
    }
}
