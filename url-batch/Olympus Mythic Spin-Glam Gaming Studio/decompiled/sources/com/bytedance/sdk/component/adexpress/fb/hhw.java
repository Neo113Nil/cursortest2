package com.bytedance.sdk.component.adexpress.fb;

import android.text.TextUtils;

/* loaded from: classes9.dex */
public class hhw {
    public static boolean zmn(String str) {
        return TextUtils.equals(str, "fullscreen_interstitial_ad") || TextUtils.equals(str, "rewarded_video");
    }

    public static boolean fs(String str) {
        return com.bytedance.sdk.component.adexpress.fb.fs() && zmn(str);
    }
}
