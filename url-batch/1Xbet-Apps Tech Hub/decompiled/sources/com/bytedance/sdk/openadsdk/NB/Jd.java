package com.bytedance.sdk.openadsdk.NB;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.utils.Gp;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.Map;

/* compiled from: NetHook.java */
/* loaded from: classes2.dex */
public final class Jd extends pvs {
    public static vG pvs;

    public static String pvs(com.bytedance.sdk.component.yiw.icD.vG vGVar, String str) {
        vG pvs2;
        Map map;
        if (!Gp.vG() || (pvs2 = icD.pvs("net")) == null || (map = (Map) pvs2.pvs(1, str)) == null) {
            return str;
        }
        String str2 = (String) map.get(ImagesContract.URL);
        if (!TextUtils.isEmpty(str2)) {
            str = str2;
        }
        Map map2 = (Map) map.get("header");
        if (map2 != null) {
            for (String str3 : map2.keySet()) {
                vGVar.icD(str3, (String) map2.get(str3));
            }
        }
        return str;
    }
}
