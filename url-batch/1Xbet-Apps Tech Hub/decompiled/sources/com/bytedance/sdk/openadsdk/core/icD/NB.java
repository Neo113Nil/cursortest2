package com.bytedance.sdk.openadsdk.core.icD;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.icD.vG;
import com.bytedance.sdk.openadsdk.core.model.cR;

/* compiled from: RewardBarClickListener.java */
/* loaded from: classes2.dex */
public abstract class NB extends pvs {
    protected abstract void pvs(View view, float f, float f2, float f3, float f4, SparseArray<vG.pvs> sparseArray, int i, int i2, int i3, boolean z);

    public NB(Context context, cR cRVar, String str, int i) {
        super(context, cRVar, str, i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.icD.pvs, com.bytedance.sdk.openadsdk.core.icD.icD, com.bytedance.sdk.openadsdk.core.icD.vG
    public void pvs(View view, float f, float f2, float f3, float f4, SparseArray<vG.pvs> sparseArray, boolean z) {
        if (pvs(view, z)) {
            pvs(view, f, f2, f3, f4, sparseArray, this.ae, this.CvL, this.Gp, z);
        }
        super.pvs(view, f, f2, f3, f4, sparseArray, z);
    }
}
