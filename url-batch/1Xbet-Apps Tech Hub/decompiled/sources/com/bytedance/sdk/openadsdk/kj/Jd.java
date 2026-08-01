package com.bytedance.sdk.openadsdk.kj;

import androidx.core.os.EnvironmentCompat;

/* compiled from: NetType.java */
/* loaded from: classes2.dex */
public enum Jd {
    TYPE_2G("2g"),
    TYPE_3G("3g"),
    TYPE_4G("4g"),
    TYPE_5G("5g"),
    TYPE_WIFI("wifi"),
    TYPE_MOBILE("mobile"),
    TYPE_UNKNOWN(EnvironmentCompat.MEDIA_UNKNOWN);

    private String so;

    Jd(String str) {
        this.so = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.so;
    }
}
