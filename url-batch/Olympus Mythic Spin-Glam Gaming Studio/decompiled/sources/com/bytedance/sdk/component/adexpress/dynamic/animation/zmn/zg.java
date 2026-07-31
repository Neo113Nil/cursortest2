package com.bytedance.sdk.component.adexpress.dynamic.animation.zmn;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class zg extends fb {
    public zg(View view, com.bytedance.sdk.component.adexpress.dynamic.fb.zmn zmnVar) {
        super(view, zmnVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.zmn.fb
    @SuppressLint({"ObjectAnimatorBinding"})
    List<ObjectAnimator> zmn() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.zn, "rippleValue", 0.0f, 1.0f).setDuration((int) (this.fs.iv() * 1000.0d));
        ((ViewGroup) this.zn.getParent()).setClipChildren(false);
        ((ViewGroup) this.zn.getParent().getParent()).setClipChildren(false);
        ((ViewGroup) this.zn.getParent().getParent().getParent()).setClipChildren(false);
        this.zn.setTag(2097610712, this.fs.zg());
        ArrayList arrayList = new ArrayList();
        arrayList.add(zmn(duration));
        return arrayList;
    }
}
