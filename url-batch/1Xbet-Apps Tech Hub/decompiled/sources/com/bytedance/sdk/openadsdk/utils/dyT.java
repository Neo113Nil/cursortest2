package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: TTClientBiddingUtil.java */
/* loaded from: classes2.dex */
public class dyT {
    public static void pvs(com.bytedance.sdk.openadsdk.core.model.cR cRVar, Double d) {
        if (cRVar == null || cRVar.Wby() == null) {
            return;
        }
        Map<String, Object> Wby = cRVar.Wby();
        try {
            Object obj = cRVar.Wby().get("sdk_bidding_type");
            if (obj != null && Integer.parseInt(obj.toString()) == 2) {
                String str = (String) Wby.get("nurl");
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if (d != null) {
                    str = str.replace("${AUCTION_BID_TO_WIN}", String.valueOf(d));
                }
                com.bytedance.sdk.openadsdk.core.mnm.vG().pvs(str);
            }
        } catch (Throwable unused) {
            com.bytedance.sdk.component.utils.Ju.icD("report Win error");
        }
    }

    public static void pvs(com.bytedance.sdk.openadsdk.core.model.cR cRVar, Double d, String str, String str2) {
        if (cRVar == null || cRVar.Wby() == null) {
            return;
        }
        Map<String, Object> Wby = cRVar.Wby();
        try {
            Object obj = cRVar.Wby().get("sdk_bidding_type");
            if (obj != null && Integer.parseInt(obj.toString()) == 2) {
                String str3 = (String) Wby.get("lurl");
                if (TextUtils.isEmpty(str3)) {
                    return;
                }
                if (d != null) {
                    str3 = str3.replace("${AUCTION_PRICE}", String.valueOf(d));
                }
                if (str != null) {
                    str3 = str3.replace("${AUCTION_LOSS}", str);
                }
                if (str2 != null) {
                    str3 = str3.replace("${AUCTION_WINNER}", str2);
                }
                com.bytedance.sdk.openadsdk.core.mnm.vG().pvs(str3);
            }
        } catch (Throwable unused) {
            com.bytedance.sdk.component.utils.Ju.icD("report Loss error");
        }
    }
}
