package com.bytedance.sdk.openadsdk.api.nativeAd;

/* loaded from: classes2.dex */
public class PAGImageItem {
    private float Jd;
    private final int icD;
    private final int pvs;
    private final String vG;

    public PAGImageItem(int i, int i2, String str, float f) {
        this.pvs = i;
        this.icD = i2;
        this.vG = str;
        this.Jd = f;
    }

    public PAGImageItem(int i, int i2, String str) {
        this(i, i2, str, 0.0f);
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

    public float getDuration() {
        return this.Jd;
    }
}
