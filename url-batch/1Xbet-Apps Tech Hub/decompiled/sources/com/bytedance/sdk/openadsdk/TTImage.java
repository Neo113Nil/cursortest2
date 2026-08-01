package com.bytedance.sdk.openadsdk;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* loaded from: classes2.dex */
public class TTImage {
    private double Jd;
    private final int icD;
    private final int pvs;
    private final String vG;

    public TTImage(int i, int i2, String str, double d) {
        this.pvs = i;
        this.icD = i2;
        this.vG = str;
        this.Jd = d;
    }

    public TTImage(int i, int i2, String str) {
        this(i, i2, str, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
    }

    public int getHeight() {
        return this.pvs;
    }

    public int getWidth() {
        return this.icD;
    }

    public String getImageUrl() {
        return this.vG;
    }

    public double getDuration() {
        return this.Jd;
    }

    public boolean isValid() {
        String str;
        return this.pvs > 0 && this.icD > 0 && (str = this.vG) != null && str.length() > 0;
    }
}
