package com.bytedance.sdk.component.adexpress.dynamic.icD;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.vG.yiw;

/* compiled from: DynamicInteractHelper.java */
/* loaded from: classes.dex */
public class pvs {
    public static int pvs(yiw yiwVar) {
        if (yiwVar == null) {
            return 0;
        }
        String gSd = yiwVar.gSd();
        String ZhG = yiwVar.ZhG();
        if (TextUtils.isEmpty(ZhG) || TextUtils.isEmpty(gSd) || !ZhG.equals("creative")) {
            return 0;
        }
        if (gSd.equals("shake")) {
            return 2;
        }
        if (gSd.equals("twist")) {
            return 3;
        }
        return gSd.equals("slide") ? 1 : 0;
    }
}
