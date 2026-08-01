package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* compiled from: TempSPUtils.java */
/* loaded from: classes2.dex */
public class CvL {
    private static final Map<String, CvL> pvs = new HashMap();
    private SharedPreferences icD;

    public static CvL pvs(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            str = "tt_ad_sdk_sp";
        }
        Map<String, CvL> map = pvs;
        CvL cvL = map.get(str);
        if (cvL != null) {
            return cvL;
        }
        CvL cvL2 = new CvL(str, context);
        map.put(str, cvL2);
        return cvL2;
    }

    private CvL(String str, Context context) {
        if (context != null) {
            this.icD = context.getSharedPreferences(str, 0);
        }
    }

    public String pvs(String str, String str2) {
        try {
            return this.icD.getString(str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    public void pvs(String str) {
        try {
            this.icD.edit().remove(str).apply();
        } catch (Throwable unused) {
        }
    }
}
