package com.bytedance.adsdk.fs.nps;

import io.bidmachine.iab.vast.tags.VastAttributes;

/* loaded from: classes11.dex */
public class zn {
    private float fs;
    private float zmn;

    public zn(float f, float f2) {
        this.zmn = f;
        this.fs = f2;
    }

    public zn() {
        this(1.0f, 1.0f);
    }

    public float zmn() {
        return this.zmn;
    }

    public float fs() {
        return this.fs;
    }

    public void zmn(float f, float f2) {
        this.zmn = f;
        this.fs = f2;
    }

    public boolean fs(float f, float f2) {
        return this.zmn == f && this.fs == f2;
    }

    public String toString() {
        return zmn() + VastAttributes.HORIZONTAL_POSITION + fs();
    }
}
