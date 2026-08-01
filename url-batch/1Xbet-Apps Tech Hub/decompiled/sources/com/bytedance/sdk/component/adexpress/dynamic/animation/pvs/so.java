package com.bytedance.sdk.component.adexpress.dynamic.animation.pvs;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* compiled from: RippleAnimation.java */
/* loaded from: classes.dex */
public class so extends Jd {
    public so(View view, com.bytedance.sdk.component.adexpress.dynamic.vG.pvs pvsVar) {
        super(view, pvsVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.pvs.Jd
    List<ObjectAnimator> pvs() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.vG, "rippleValue", 0.0f, 1.0f).setDuration((int) (this.icD.Wyp() * 1000.0d));
        ((ViewGroup) this.vG.getParent()).setClipChildren(false);
        ((ViewGroup) this.vG.getParent().getParent()).setClipChildren(false);
        ((ViewGroup) this.vG.getParent().getParent().getParent()).setClipChildren(false);
        this.vG.setTag(2097610712, this.icD.so());
        ArrayList arrayList = new ArrayList();
        arrayList.add(pvs(duration));
        return arrayList;
    }
}
