package com.bytedance.sdk.openadsdk;

/* loaded from: classes5.dex */
public class TTImage {
    private double fb;
    private final int fs;
    private final int zmn;
    private final String zn;

    public TTImage(int i, int i2, String str, double d) {
        this.zmn = i;
        this.fs = i2;
        this.zn = str;
        this.fb = d;
    }

    public TTImage(int i, int i2, String str) {
        this(i, i2, str, 0.0d);
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

    public double getDuration() {
        return this.fb;
    }

    public boolean isValid() {
        String str;
        return this.zmn > 0 && this.fs > 0 && (str = this.zn) != null && str.length() > 0;
    }
}
