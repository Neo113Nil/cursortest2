package defpackage;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class c72 {
    public static final int PxuCJdSBwIXG(ArrayList arrayList, int i, int i2) {
        int e9gEMXR7LXtO = e9gEMXR7LXtO(arrayList, i, i2);
        return e9gEMXR7LXtO >= 0 ? e9gEMXR7LXtO : -(e9gEMXR7LXtO + 1);
    }

    public static final void TSizfFm2Yiuu(int[] iArr, int i, int i2) {
        if (i2 >= 0) {
        }
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }

    public static final a72 Y1f8riQaR6yg(a72 a72Var) {
        if (!(a72Var instanceof a72)) {
            a72Var = null;
        }
        if (a72Var != null) {
            return a72Var;
        }
        mp.lS5Rgt96tfkO("Inconsistent composition");
        u9.Y1f8riQaR6yg();
        return null;
    }

    public static final void a92UlCVFR9N8() {
        throw new ConcurrentModificationException();
    }

    public static final int e9gEMXR7LXtO(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = ((nf0) arrayList.get(i4)).PxuCJdSBwIXG;
            if (i5 < 0) {
                i5 += i2;
            }
            int gPXPFXrUH4XX = cs0.gPXPFXrUH4XX(i5, i);
            if (gPXPFXrUH4XX < 0) {
                i3 = i4 + 1;
            } else {
                if (gPXPFXrUH4XX <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final int lS5Rgt96tfkO(int[] iArr, int i) {
        int i2 = i * 5;
        return Integer.bitCount(iArr[i2 + 1] >> 28) + iArr[i2 + 4];
    }
}
