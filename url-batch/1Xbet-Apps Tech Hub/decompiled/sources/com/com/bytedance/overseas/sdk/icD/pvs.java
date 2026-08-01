package com.com.bytedance.overseas.sdk.icD;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.vG;

/* compiled from: AdvertisingIdHelper.java */
/* loaded from: classes2.dex */
public class pvs {
    private static volatile pvs icD;
    private String pvs = "";

    public static pvs pvs() {
        if (icD == null) {
            synchronized (pvs.class) {
                if (icD == null) {
                    icD = new pvs();
                }
            }
        }
        return icD;
    }

    private pvs() {
    }

    public String icD() {
        if (!mnm.Jd().ae("gaid")) {
            return "";
        }
        if (!TextUtils.isEmpty(this.pvs)) {
            return this.pvs;
        }
        String icD2 = vG.pvs(mnm.pvs()).icD("gaid", "");
        this.pvs = icD2;
        return icD2;
    }

    public static void pvs(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        vG.pvs(mnm.pvs()).pvs("gaid", str);
    }

    public void icD(String str) {
        this.pvs = str;
    }
}
