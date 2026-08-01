package com.bytedance.sdk.openadsdk.component.pvs;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.core.icD.vG;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.mnm.pvs.NB;
import java.util.HashMap;

/* compiled from: TTAppOpenAdClickListener.java */
/* loaded from: classes2.dex */
public class pvs extends com.bytedance.sdk.openadsdk.core.icD.pvs {
    private final com.bytedance.sdk.openadsdk.component.so.pvs pvs;

    public pvs(Context context, cR cRVar, String str, int i, com.bytedance.sdk.openadsdk.component.so.pvs pvsVar) {
        super(context, cRVar, str, i);
        this.pvs = pvsVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.icD.pvs, com.bytedance.sdk.openadsdk.core.icD.icD, com.bytedance.sdk.openadsdk.core.icD.vG
    public void pvs(View view, float f, float f2, float f3, float f4, SparseArray<vG.pvs> sparseArray, boolean z) {
        if (view.getTag() == "open_ad_click_button_tag") {
            pvs("click_bar");
        } else {
            pvs("click_material");
        }
        HashMap hashMap = new HashMap();
        hashMap.put(TypedValues.TransitionType.S_DURATION, Long.valueOf(this.pvs.icD()));
        pvs(hashMap);
        super.pvs(view, f, f2, f3, f4, sparseArray, z);
        NB.pvs(this.sUS, 9);
    }
}
