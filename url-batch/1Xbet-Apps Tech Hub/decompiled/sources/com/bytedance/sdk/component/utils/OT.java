package com.bytedance.sdk.component.utils;

import android.os.Build;
import android.text.TextUtils;

/* compiled from: TTAppInfoUtils.java */
/* loaded from: classes.dex */
public class OT {
    private static volatile String pvs;

    public static String pvs() {
        if (!TextUtils.isEmpty(pvs)) {
            return pvs;
        }
        String str = Build.MODEL;
        pvs = str;
        return str;
    }
}
