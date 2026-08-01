package com.bytedance.sdk.component.sUS.pvs.pvs.pvs;

import android.text.TextUtils;
import android.util.Base64;

/* compiled from: ParamEncode.java */
/* loaded from: classes.dex */
public class sUS {
    public static String pvs(String str) {
        return TextUtils.isEmpty(str) ? "" : Base64.encodeToString(str.getBytes(), 10);
    }

    public static String icD(String str) {
        return TextUtils.isEmpty(str) ? "" : new String(Base64.decode(str, 10));
    }
}
