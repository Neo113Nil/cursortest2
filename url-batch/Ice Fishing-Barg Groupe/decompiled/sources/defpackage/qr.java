package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class qr {
    public static long PxuCJdSBwIXG(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int min = Math.min(i3, 262142);
        int min2 = i4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i4, 262142);
        int i6 = min2 == Integer.MAX_VALUE ? min : min2;
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i5 = 65534;
            } else if (i6 < 65535) {
                i5 = 32766;
            } else {
                if (i6 >= 262143) {
                    sr.x50lh2ztY7Y5(i6);
                    u9.Y1f8riQaR6yg();
                    return 0L;
                }
                i5 = 8190;
            }
        }
        return sr.PxuCJdSBwIXG(Math.min(i5, i), i2 != Integer.MAX_VALUE ? Math.min(i5, i2) : Integer.MAX_VALUE, min, min2);
    }

    public static long TSizfFm2Yiuu(int i, int i2) {
        if (!((i2 >= 0) & (i >= 0))) {
            gp0.PxuCJdSBwIXG("width and height must be >= 0");
        }
        return sr.rtx2ld2ELZv4(i, i, i2, i2);
    }

    public static long lS5Rgt96tfkO(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int min = Math.min(i, 262142);
        int min2 = i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i2, 262142);
        int i6 = min2 == Integer.MAX_VALUE ? min : min2;
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i5 = 65534;
            } else if (i6 < 65535) {
                i5 = 32766;
            } else {
                if (i6 >= 262143) {
                    sr.x50lh2ztY7Y5(i6);
                    u9.Y1f8riQaR6yg();
                    return 0L;
                }
                i5 = 8190;
            }
        }
        return sr.PxuCJdSBwIXG(min, min2, Math.min(i5, i3), i4 != Integer.MAX_VALUE ? Math.min(i5, i4) : Integer.MAX_VALUE);
    }
}
