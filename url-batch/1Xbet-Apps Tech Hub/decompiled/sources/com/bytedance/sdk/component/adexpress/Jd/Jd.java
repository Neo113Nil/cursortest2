package com.bytedance.sdk.component.adexpress.Jd;

import android.text.TextUtils;

/* compiled from: GlobalAdTypeUtils.java */
/* loaded from: classes.dex */
public class Jd {
    public static boolean pvs(String str) {
        if (com.bytedance.sdk.component.adexpress.Jd.icD()) {
            return TextUtils.equals(str, "embeded_ad") || TextUtils.equals(str, "banner_ad");
        }
        return false;
    }
}
