package com.iab.omid.library.ironsrc.devicevolume;

/* loaded from: classes.dex */
public class a {
    public float a(int i4, int i5) {
        if (i5 <= 0 || i4 <= 0) {
            return 0.0f;
        }
        float f4 = i4 / i5;
        if (f4 > 1.0f) {
            return 1.0f;
        }
        return f4;
    }
}
