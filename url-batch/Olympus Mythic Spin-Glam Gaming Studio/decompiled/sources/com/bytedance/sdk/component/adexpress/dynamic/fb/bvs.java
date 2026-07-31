package com.bytedance.sdk.component.adexpress.dynamic.fb;

import java.util.Arrays;

/* loaded from: classes6.dex */
public class bvs {
    public float fs;
    public float zmn;

    public bvs(float f, float f2) {
        this.zmn = f;
        this.fs = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            bvs bvsVar = (bvs) obj;
            if (Float.compare(bvsVar.zmn, this.zmn) == 0 && Float.compare(bvsVar.fs, this.fs) == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.zmn), Float.valueOf(this.fs)});
    }
}
