package com.bytedance.sdk.openadsdk.component.zmn;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.iv.bvs;
import com.bytedance.sdk.openadsdk.core.iv.iv;
import com.bytedance.sdk.openadsdk.core.model.am;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.zn.zn;
import com.bytedance.sdk.openadsdk.phc.zmn.zmn.fb;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class fs {
    public static zmn zmn(nqi nqiVar, Activity activity, com.bytedance.sdk.openadsdk.component.zg.zmn zmnVar) {
        zmn zmnVar2 = new zmn(activity.getApplicationContext(), nqiVar, "open_ad", 4, zmnVar);
        zmnVar2.fs(activity.findViewById(R.id.content));
        zmn(activity.getApplicationContext(), nqiVar, zmnVar2);
        zmn(zmnVar2, nqiVar);
        return zmnVar2;
    }

    public static iv zmn(nqi nqiVar, Activity activity, final com.bytedance.sdk.openadsdk.component.zg.zmn zmnVar, com.bytedance.sdk.openadsdk.component.bvs.fs fsVar) {
        iv ivVar = new iv(activity, nqiVar, "open_ad", 4) { // from class: com.bytedance.sdk.openadsdk.component.zmn.fs.1
            @Override // com.bytedance.sdk.openadsdk.core.zn.fs, com.bytedance.sdk.openadsdk.core.zn.zn
            public void zmn(View view, float f, float f2, float f3, float f4, SparseArray<zn.zmn> sparseArray, boolean z) {
                HashMap hashMap = new HashMap();
                hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(zmnVar.zn()));
                zmn(hashMap);
                super.zmn(view, f, f2, f3, f4, sparseArray, z);
            }
        };
        ivVar.fs(fsVar);
        zmn(activity.getApplicationContext(), nqiVar, ivVar);
        zmn(ivVar, nqiVar);
        return ivVar;
    }

    public static bvs fs(nqi nqiVar, Activity activity, final com.bytedance.sdk.openadsdk.component.zg.zmn zmnVar, com.bytedance.sdk.openadsdk.component.bvs.fs fsVar) {
        bvs bvsVar = new bvs(activity.getApplicationContext(), nqiVar, "open_ad", 4) { // from class: com.bytedance.sdk.openadsdk.component.zmn.fs.2
            @Override // com.bytedance.sdk.openadsdk.core.zn.zmn, com.bytedance.sdk.openadsdk.core.zn.fs, com.bytedance.sdk.openadsdk.core.zn.zn
            public void zmn(View view, float f, float f2, float f3, float f4, SparseArray<zn.zmn> sparseArray, boolean z) {
                HashMap hashMap = new HashMap();
                hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(zmnVar.zn()));
                zmn(hashMap);
                super.zmn(view, f, f2, f3, f4, sparseArray, z);
            }
        };
        bvsVar.fs(fsVar);
        zmn(activity.getApplicationContext(), nqiVar, bvsVar);
        zmn(bvsVar, nqiVar);
        return bvsVar;
    }

    public static void zmn(com.bytedance.sdk.openadsdk.core.zn.fs fsVar, nqi nqiVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("click_area", Integer.valueOf(nqiVar.tet()));
        hashMap.put("openad_creative_type", nqi.btk(nqiVar) ? "video_normal_ad" : "image_normal_ad");
        hashMap.put("click_scence", Integer.valueOf(am.zn(nqiVar) ? 3 : 1));
        fsVar.zmn(hashMap);
    }

    private static void zmn(Context context, nqi nqiVar, com.bytedance.sdk.openadsdk.core.zn.fs fsVar) {
        if (nqiVar == null || nqiVar.va() != 4) {
            return;
        }
        fsVar.zmn(fb.zmn(context, "open_ad"));
    }
}
