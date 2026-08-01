package com.bytedance.sdk.component.yiw.Jd;

import android.content.Context;
import com.bytedance.sdk.component.yiw.vG.so;
import java.util.LinkedHashMap;

/* compiled from: MultiProcessFileUtils.java */
/* loaded from: classes.dex */
public class Jd {
    public static void pvs(Context context, int i, String str, int i2) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (i == 1) {
                linkedHashMap.put(pvs(i2), str);
            }
            if (so.pvs().pvs(i2).Jd() != null) {
                so.pvs().pvs(i2).Jd().pvs(context, linkedHashMap);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String pvs(Context context, int i, int i2) {
        String pvs;
        if (i == 1) {
            if (so.pvs().pvs(i2).Jd() != null) {
                pvs = so.pvs().pvs(i2).Jd().pvs(context, pvs(i2), "");
                return !(pvs instanceof String) ? String.valueOf(pvs) : "";
            }
        }
        pvs = "";
        if (!(pvs instanceof String)) {
        }
    }

    private static String pvs(int i) {
        return "tnc_config".concat(String.valueOf(i));
    }
}
