package defpackage;

import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class g91 {
    public static final void PxuCJdSBwIXG(int i, List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            TSizfFm2Yiuu(i, size);
        }
    }

    private static final void TSizfFm2Yiuu(int i, int i2) {
        throw new IndexOutOfBoundsException("Index " + i + " is out of bounds. The list has " + i2 + " elements.");
    }

    private static final void Y1f8riQaR6yg(int i) {
        throw new IndexOutOfBoundsException(o0.OPXfSBeufaJ8(i, "fromIndex (", ") is less than 0."));
    }

    private static final void a92UlCVFR9N8(int i, int i2) {
        throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i + ") is greater than toIndex (" + i2 + ").");
    }

    private static final void e9gEMXR7LXtO(int i, int i2) {
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is more than than the list size (" + i2 + ')');
    }

    public static final void lS5Rgt96tfkO(List list, int i, int i2) {
        if (i > i2) {
            a92UlCVFR9N8(i, i2);
        }
        if (i < 0) {
            Y1f8riQaR6yg(i);
        }
        if (i2 > list.size()) {
            e9gEMXR7LXtO(i2, list.size());
        }
    }
}
