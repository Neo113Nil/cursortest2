package com.bytedance.sdk.component.adexpress.Jd;

import android.text.TextUtils;

/* compiled from: RitScreenUtils.java */
/* loaded from: classes.dex */
public class sUS {
    public static boolean pvs(String str) {
        return TextUtils.equals(str, "fullscreen_interstitial_ad") || TextUtils.equals(str, "rewarded_video");
    }

    public static boolean icD(String str) {
        return com.bytedance.sdk.component.adexpress.Jd.icD() && pvs(str);
    }
}
