package com.bytedance.sdk.component.adexpress.dynamic.vG;

import java.util.Arrays;

/* compiled from: DynamicPoint.java */
/* loaded from: classes.dex */
public class Mxy {
    public float icD;
    public float pvs;

    public Mxy(float f, float f2) {
        this.pvs = f;
        this.icD = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Mxy mxy = (Mxy) obj;
            if (Float.compare(mxy.pvs, this.pvs) == 0 && Float.compare(mxy.icD, this.icD) == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.pvs), Float.valueOf(this.icD)});
    }
}
