package com.facebook.ads.internal.n;

import com.cmplay.policy.gdpr.DimenUtils;

/* loaded from: classes.dex */
public enum i {
    HEIGHT_100(-1, 100),
    HEIGHT_120(-1, DimenUtils.DENSITY_LOW),
    HEIGHT_300(-1, 300),
    HEIGHT_400(-1, 400);

    private final int e;
    private final int f;

    i(int i, int i2) {
        this.e = i;
        this.f = i2;
    }

    public int a() {
        return this.e;
    }

    public int b() {
        return this.f;
    }

    public int c() {
        int i = this.f;
        if (i == 100) {
            return 1;
        }
        if (i == 120) {
            return 2;
        }
        if (i != 300) {
            return i != 400 ? -1 : 4;
        }
        return 3;
    }
}
