package com.bytedance.sdk.openadsdk.api.nativeAd;

/* loaded from: classes4.dex */
public class PAGImageItem {
    private float fb;
    private final int fs;
    private final int zmn;
    private final String zn;

    public PAGImageItem(int i, int i2, String str, float f) {
        this.zmn = i;
        this.fs = i2;
        this.zn = str;
        this.fb = f;
    }

    public PAGImageItem(int i, int i2, String str) {
        this(i, i2, str, 0.0f);
    }

    public int getHeight() {
        return this.zmn;
    }

    public int getWidth() {
        return this.fs;
    }

    public String getImageUrl() {
        return this.zn;
    }

    public float getDuration() {
        return this.fb;
    }
}
