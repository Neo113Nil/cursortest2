package com.bytedance.sdk.component.adexpress.dynamic.animation.pvs;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicImageView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: StretchAnimation.java */
/* loaded from: classes.dex */
public class Ju extends Jd {
    public Ju(View view, com.bytedance.sdk.component.adexpress.dynamic.vG.pvs pvsVar) {
        super(view, pvsVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.pvs.Jd
    List<ObjectAnimator> pvs() {
        if ((this.vG instanceof ImageView) && (this.vG.getParent() instanceof DynamicImageView)) {
            this.vG = (View) this.vG.getParent();
            ((ViewGroup) this.vG).setClipChildren(true);
            ((ViewGroup) this.vG.getParent()).setClipChildren(true);
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.vG, "stretchValue", 0.0f, 1.0f).setDuration((int) (this.icD.Wyp() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(pvs(duration));
        return arrayList;
    }
}
