package com.bytedance.sdk.component.adexpress.dynamic.animation.pvs;

import android.animation.ObjectAnimator;
import android.view.View;
import androidx.constraintlayout.motion.widget.Key;
import java.util.ArrayList;
import java.util.List;

/* compiled from: RotationAnimation.java */
/* loaded from: classes.dex */
public class Mxy extends Jd {
    public Mxy(View view, com.bytedance.sdk.component.adexpress.dynamic.vG.pvs pvsVar) {
        super(view, pvsVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.pvs.Jd
    List<ObjectAnimator> pvs() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.vG, Key.ROTATION, 0.0f, 360.0f).setDuration((int) (this.icD.Wyp() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(pvs(duration));
        return arrayList;
    }
}
