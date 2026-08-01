package com.bytedance.sdk.openadsdk.component.pvs;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.component.view.PAGAppOpenAdExpressView;
import com.bytedance.sdk.openadsdk.core.icD.vG;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.model.rCZ;
import com.bytedance.sdk.openadsdk.core.nativeexpress.sUS;
import com.bytedance.sdk.openadsdk.core.nativeexpress.yiw;
import com.com.bytedance.overseas.sdk.pvs.Jd;
import java.util.HashMap;

/* compiled from: TTAppOpenAdClickManager.java */
/* loaded from: classes2.dex */
public class icD {
    public static pvs pvs(cR cRVar, Activity activity, com.bytedance.sdk.openadsdk.component.so.pvs pvsVar) {
        pvs pvsVar2 = new pvs(activity.getApplicationContext(), cRVar, "open_ad", 4, pvsVar);
        pvsVar2.pvs(activity.findViewById(R.id.content));
        pvsVar2.icD(activity.findViewById(520093713));
        pvs(activity.getApplicationContext(), cRVar, pvsVar2);
        pvs(pvsVar2, cRVar);
        return pvsVar2;
    }

    public static yiw pvs(cR cRVar, Activity activity, final com.bytedance.sdk.openadsdk.component.so.pvs pvsVar, PAGAppOpenAdExpressView pAGAppOpenAdExpressView) {
        yiw yiwVar = new yiw(activity, cRVar, "open_ad", 4) { // from class: com.bytedance.sdk.openadsdk.component.pvs.icD.1
            @Override // com.bytedance.sdk.openadsdk.core.icD.icD, com.bytedance.sdk.openadsdk.core.icD.vG
            public void pvs(View view, float f, float f2, float f3, float f4, SparseArray<vG.pvs> sparseArray, boolean z) {
                HashMap hashMap = new HashMap();
                hashMap.put(TypedValues.TransitionType.S_DURATION, Long.valueOf(pvsVar.icD()));
                pvs(hashMap);
                super.pvs(view, f, f2, f3, f4, sparseArray, z);
            }
        };
        yiwVar.pvs(pAGAppOpenAdExpressView);
        pvs(activity.getApplicationContext(), cRVar, yiwVar);
        pvs(yiwVar, cRVar);
        return yiwVar;
    }

    public static sUS icD(cR cRVar, Activity activity, final com.bytedance.sdk.openadsdk.component.so.pvs pvsVar, PAGAppOpenAdExpressView pAGAppOpenAdExpressView) {
        sUS sus = new sUS(activity.getApplicationContext(), cRVar, "open_ad", 4) { // from class: com.bytedance.sdk.openadsdk.component.pvs.icD.2
            @Override // com.bytedance.sdk.openadsdk.core.icD.pvs, com.bytedance.sdk.openadsdk.core.icD.icD, com.bytedance.sdk.openadsdk.core.icD.vG
            public void pvs(View view, float f, float f2, float f3, float f4, SparseArray<vG.pvs> sparseArray, boolean z) {
                HashMap hashMap = new HashMap();
                hashMap.put(TypedValues.TransitionType.S_DURATION, Long.valueOf(pvsVar.icD()));
                pvs(hashMap);
                super.pvs(view, f, f2, f3, f4, sparseArray, z);
            }
        };
        sus.pvs((View) pAGAppOpenAdExpressView);
        pvs(activity.getApplicationContext(), cRVar, sus);
        pvs(sus, cRVar);
        return sus;
    }

    public static void pvs(com.bytedance.sdk.openadsdk.core.icD.icD icd, cR cRVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("click_area", Integer.valueOf(cRVar.kj()));
        hashMap.put("openad_creative_type", cR.NB(cRVar) ? "video_normal_ad" : "image_normal_ad");
        hashMap.put("click_scence", Integer.valueOf(rCZ.qh(cRVar) ? 3 : 1));
        icd.pvs(hashMap);
    }

    private static void pvs(Context context, cR cRVar, com.bytedance.sdk.openadsdk.core.icD.icD icd) {
        if (cRVar == null || cRVar.jhZ() != 4) {
            return;
        }
        icd.pvs(Jd.pvs(context, cRVar, "open_ad"));
    }
}
