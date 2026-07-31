package com.bytedance.sdk.openadsdk.bvs;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.utils.hgd;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import java.util.Map;

/* loaded from: classes5.dex */
public final class fb extends zmn {
    public static zn zmn;

    public static String zmn(com.bytedance.sdk.component.nps.fs.zn znVar, String str) {
        zn zmn2;
        Map map;
        if (!hgd.zn() || (zmn2 = fs.zmn("net")) == null || (map = (Map) zmn2.zmn(1, str)) == null) {
            return str;
        }
        String str2 = (String) map.get("url");
        if (!TextUtils.isEmpty(str2)) {
            str = str2;
        }
        Map map2 = (Map) map.get(POBCTAOverlayData.KEY_CTA_HEADER);
        if (map2 != null) {
            for (String str3 : map2.keySet()) {
                znVar.fs(str3, (String) map2.get(str3));
            }
        }
        return str;
    }
}
