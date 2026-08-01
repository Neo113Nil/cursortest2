package com.bytedance.sdk.openadsdk.multipro.Jd;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.sdk.component.icD;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.so;

/* compiled from: TTSaveHelper.java */
/* loaded from: classes2.dex */
public class Jd {
    private static boolean pvs() {
        return mnm.pvs() == null;
    }

    private static String icD(String str) {
        return TextUtils.isEmpty(str) ? "tt_sp" : str;
    }

    public static void pvs(String str, String str2, Boolean bool) {
        if (pvs()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
            pvs.pvs(icD(str), str2, bool);
        } else {
            pvs(icD(str), str2, bool);
        }
    }

    public static void pvs(String str, String str2, Long l) {
        if (pvs()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
            pvs.pvs(icD(str), str2, l);
        } else {
            pvs(icD(str), str2, l);
        }
    }

    public static void pvs(String str, String str2, String str3) {
        if (pvs()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
            pvs.pvs(icD(str), str2, str3);
        } else {
            pvs(icD(str), str2, str3);
        }
    }

    public static void pvs(String str, String str2, Integer num) {
        if (pvs()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
            pvs.pvs(icD(str), str2, num);
        } else {
            pvs(icD(str), str2, num);
        }
    }

    public static int pvs(String str, String str2, int i) {
        if (pvs()) {
            return i;
        }
        if (com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
            return pvs.pvs(icD(str), str2, i);
        }
        return pvs.pvs(mnm.pvs(), icD(str), str2, i);
    }

    public static boolean pvs(String str, String str2, boolean z) {
        if (pvs()) {
            return z;
        }
        if (com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
            return pvs.pvs(icD(str), str2, z);
        }
        return pvs.pvs(mnm.pvs(), icD(str), str2, z);
    }

    public static long pvs(String str, String str2, long j) {
        if (pvs()) {
            return j;
        }
        if (com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
            return pvs.pvs(icD(str), str2, j);
        }
        return pvs.pvs(mnm.pvs(), icD(str), str2, j);
    }

    public static String icD(String str, String str2, String str3) {
        if (pvs()) {
            return str3;
        }
        if (com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
            return pvs.icD(icD(str), str2, str3);
        }
        return pvs.pvs(mnm.pvs(), icD(str), str2, str3);
    }

    public static void pvs(String str, String str2) {
        if (pvs()) {
            return;
        }
        try {
            if (com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
                pvs.icD(icD(str), str2);
            } else {
                icD.icD(mnm.pvs(), icD(str), str2);
            }
        } catch (Throwable unused) {
        }
    }

    public static void pvs(String str) {
        if (pvs()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
            pvs.pvs(icD(str));
        } else {
            icD.icD(mnm.pvs(), icD(str));
        }
    }

    private static <T> void pvs(String str, String str2, T t) {
        String pvs = pvs.pvs(str, str2);
        if (so.NB(pvs)) {
            icD.vG icD = com.bytedance.sdk.component.icD.pvs(mnm.pvs(), icD(pvs)).icD();
            icD.pvs(icD, str2, (Object) t);
            icD.apply();
        } else {
            SharedPreferences pvs2 = icD.pvs(mnm.pvs(), icD(pvs));
            if (pvs2 == null) {
                return;
            }
            SharedPreferences.Editor edit = pvs2.edit();
            icD.pvs(edit, str2, t);
            edit.apply();
        }
    }
}
