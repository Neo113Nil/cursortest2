package com.bytedance.sdk.component.adexpress.fb;

import android.text.TextUtils;

/* loaded from: classes5.dex */
public class btk {
    public static boolean zmn(String str) {
        if (com.bytedance.sdk.component.adexpress.fb.fs()) {
            return TextUtils.equals(str, "embeded_ad") || TextUtils.equals(str, "banner_ad");
        }
        return false;
    }
}
