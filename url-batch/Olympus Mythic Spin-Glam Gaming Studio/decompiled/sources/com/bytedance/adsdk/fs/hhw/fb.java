package com.bytedance.adsdk.fs.hhw;

/* loaded from: classes15.dex */
public class fb {
    private int fs;
    private float zmn;

    public void zmn(float f) {
        float f2 = this.zmn + f;
        this.zmn = f2;
        int i = this.fs + 1;
        this.fs = i;
        if (i == Integer.MAX_VALUE) {
            this.zmn = f2 / 2.0f;
            this.fs = i / 2;
        }
    }
}
