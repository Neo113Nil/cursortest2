package com.bytedance.sdk.component.adexpress.dynamic.animation.zmn;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public class rc extends fb {
    public rc(View view, com.bytedance.sdk.component.adexpress.dynamic.fb.zmn zmnVar) {
        super(view, zmnVar);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
            if (viewGroup2 == null || !(viewGroup2 instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk)) {
                return;
            }
            viewGroup2.setClipChildren(false);
            viewGroup2.setClipToPadding(false);
            ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
            if (viewGroup3 == null || !(viewGroup3 instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk)) {
                return;
            }
            viewGroup3.setClipChildren(false);
            viewGroup3.setClipToPadding(false);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.zmn.fb
    List<ObjectAnimator> zmn() {
        float f;
        float rc = (float) this.fs.rc();
        float klz = (float) this.fs.klz();
        String cyb = this.fs.cyb();
        float f2 = 1.0f;
        if ("reverse".equals(cyb) || "alternate-reverse".equals(cyb)) {
            f = 1.0f;
        } else {
            f = klz;
            klz = 1.0f;
            f2 = rc;
            rc = 1.0f;
        }
        this.zn.setTag(2097610710, this.fs.fs());
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.zn, "scaleX", rc, f2).setDuration((int) (this.fs.iv() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.zn, "scaleY", klz, f).setDuration((int) (this.fs.iv() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(zmn(duration));
        arrayList.add(zmn(duration2));
        return arrayList;
    }
}
