package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ironsource.C4834q2;
import java.util.Map;

/* loaded from: classes5.dex */
public class ev {
    public static void zmn(com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, Double d) {
        if (nqiVar == null || nqiVar.hr() == null) {
            return;
        }
        Map<String, Object> hr = nqiVar.hr();
        try {
            Object obj = nqiVar.hr().get(TTAdConstant.SDK_BIDDING_TYPE);
            if (obj != null && Integer.parseInt(obj.toString()) == 2) {
                String str = (String) hr.get(C4834q2.A);
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if (d != null) {
                    str = str.replace("${AUCTION_BID_TO_WIN}", String.valueOf(d));
                }
                com.bytedance.sdk.openadsdk.core.kgc.zn().zmn(str);
            }
        } catch (Throwable unused) {
            com.bytedance.sdk.component.utils.iqz.zn("report Win error", new Object[0]);
        }
    }

    public static void zmn(com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, Double d, String str, String str2) {
        if (nqiVar == null || nqiVar.hr() == null) {
            return;
        }
        Map<String, Object> hr = nqiVar.hr();
        try {
            Object obj = nqiVar.hr().get(TTAdConstant.SDK_BIDDING_TYPE);
            if (obj != null && Integer.parseInt(obj.toString()) == 2) {
                String str3 = (String) hr.get(C4834q2.z);
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
                com.bytedance.sdk.openadsdk.core.kgc.zn().zmn(str3);
            }
        } catch (Throwable unused) {
            com.bytedance.sdk.component.utils.iqz.zn("report Loss error", new Object[0]);
        }
    }
}
