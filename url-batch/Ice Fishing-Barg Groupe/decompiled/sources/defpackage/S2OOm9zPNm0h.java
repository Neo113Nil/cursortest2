package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class S2OOm9zPNm0h {
    public static void PxuCJdSBwIXG(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(o0.rtx2ld2ELZv4(i, i2, "index: ", ", size: "));
        }
    }

    public static void TSizfFm2Yiuu(int i, int i2, int i3) {
        if (i >= 0 && i2 <= i3) {
            if (i <= i2) {
                return;
            }
            u9.XL4ISE6Oc65B(o0.rtx2ld2ELZv4(i, i2, "fromIndex: ", " > toIndex: "));
        } else {
            throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
        }
    }

    public static int Y1f8riQaR6yg(int i, int i2) {
        int i3 = i + (i >> 1);
        if (i3 - i2 < 0) {
            i3 = i2;
        }
        return i3 - 2147483639 > 0 ? i2 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i3;
    }

    public static void lS5Rgt96tfkO(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(o0.rtx2ld2ELZv4(i, i2, "index: ", ", size: "));
        }
    }
}
