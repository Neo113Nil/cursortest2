package com.bytedance.sdk.openadsdk.doe;

import com.ironsource.T3;

/* loaded from: classes3.dex */
public enum fb {
    TYPE_2G("2g"),
    TYPE_3G(T3.a),
    TYPE_4G("4g"),
    TYPE_5G("5g"),
    TYPE_WIFI(T3.b),
    TYPE_MOBILE("mobile"),
    TYPE_UNKNOWN("unknown");

    private String zg;

    fb(String str) {
        this.zg = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.zg;
    }
}
