package com.bytedance.sdk.component.adexpress.dynamic.animation.pvs;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ScaleAnimation.java */
/* loaded from: classes.dex */
public class qh extends Jd {
    public qh(View view, com.bytedance.sdk.component.adexpress.dynamic.vG.pvs pvsVar) {
        super(view, pvsVar);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
            if (viewGroup2 == null || !(viewGroup2 instanceof DynamicBaseWidget)) {
                return;
            }
            viewGroup2.setClipChildren(false);
            viewGroup2.setClipToPadding(false);
            ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
            if (viewGroup3 == null || !(viewGroup3 instanceof DynamicBaseWidget)) {
                return;
            }
            viewGroup3.setClipChildren(false);
            viewGroup3.setClipToPadding(false);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.pvs.Jd
    List<ObjectAnimator> pvs() {
        float f;
        float qh = (float) this.icD.qh();
        float kj = (float) this.icD.kj();
        String mnm = this.icD.mnm();
        float f2 = 1.0f;
        if ("reverse".equals(mnm) || "alternate-reverse".equals(mnm)) {
            f = 1.0f;
        } else {
            f = kj;
            kj = 1.0f;
            f2 = qh;
            qh = 1.0f;
        }
        this.vG.setTag(2097610710, this.icD.icD());
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.vG, "scaleX", qh, f2).setDuration((int) (this.icD.Wyp() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.vG, "scaleY", kj, f).setDuration((int) (this.icD.Wyp() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(pvs(duration));
        arrayList.add(pvs(duration2));
        return arrayList;
    }
}
