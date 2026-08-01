package com.bytedance.sdk.component.adexpress.dynamic.animation.pvs;

import android.animation.ObjectAnimator;
import android.view.View;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AlphaAnimation.java */
/* loaded from: classes.dex */
public class pvs extends Jd {
    public pvs(View view, com.bytedance.sdk.component.adexpress.dynamic.vG.pvs pvsVar) {
        super(view, pvsVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.pvs.Jd
    List<ObjectAnimator> pvs() {
        float cR = this.icD.cR() / 100.0f;
        float zM = this.icD.zM() / 100.0f;
        if ("reverse".equals(this.icD.mnm()) && this.icD.IP() <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            zM = cR;
            cR = zM;
        }
        this.vG.setAlpha(cR);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.vG, "alpha", cR, zM).setDuration((int) (this.icD.Wyp() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(pvs(duration));
        return arrayList;
    }
}
