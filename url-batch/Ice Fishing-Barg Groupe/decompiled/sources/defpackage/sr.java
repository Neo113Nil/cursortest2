package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class sr {
    public static final long OPXfSBeufaJ8(int i, int i2, long j) {
        int wdg6QnbFHrFF = rr.wdg6QnbFHrFF(j) + i;
        if (wdg6QnbFHrFF < 0) {
            wdg6QnbFHrFF = 0;
        }
        int rtx2ld2ELZv4 = rr.rtx2ld2ELZv4(j);
        if (rtx2ld2ELZv4 != Integer.MAX_VALUE && (rtx2ld2ELZv4 = rtx2ld2ELZv4 + i) < 0) {
            rtx2ld2ELZv4 = 0;
        }
        int OPXfSBeufaJ8 = rr.OPXfSBeufaJ8(j) + i2;
        if (OPXfSBeufaJ8 < 0) {
            OPXfSBeufaJ8 = 0;
        }
        int RAsUl2FVSrh6 = rr.RAsUl2FVSrh6(j);
        return PxuCJdSBwIXG(wdg6QnbFHrFF, rtx2ld2ELZv4, OPXfSBeufaJ8, (RAsUl2FVSrh6 == Integer.MAX_VALUE || (RAsUl2FVSrh6 = RAsUl2FVSrh6 + i2) >= 0) ? RAsUl2FVSrh6 : 0);
    }

    public static final long PxuCJdSBwIXG(int i, int i2, int i3, int i4) {
        if (!((i3 >= 0) & (i2 >= i) & (i4 >= i3) & (i >= 0))) {
            gp0.PxuCJdSBwIXG("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return rtx2ld2ELZv4(i, i2, i3, i4);
    }

    public static final int RAsUl2FVSrh6(int i, long j) {
        int wdg6QnbFHrFF = rr.wdg6QnbFHrFF(j);
        int rtx2ld2ELZv4 = rr.rtx2ld2ELZv4(j);
        if (i < wdg6QnbFHrFF) {
            i = wdg6QnbFHrFF;
        }
        return i > rtx2ld2ELZv4 ? rtx2ld2ELZv4 : i;
    }

    public static final int TSizfFm2Yiuu(int i) {
        if (i < 8191) {
            return 13;
        }
        if (i < 32767) {
            return 15;
        }
        if (i < 65535) {
            return 16;
        }
        return i < 262143 ? 18 : 255;
    }

    public static final long Y1f8riQaR6yg(long j, long j2) {
        int i = (int) (j2 >> 32);
        int wdg6QnbFHrFF = rr.wdg6QnbFHrFF(j);
        int rtx2ld2ELZv4 = rr.rtx2ld2ELZv4(j);
        if (i < wdg6QnbFHrFF) {
            i = wdg6QnbFHrFF;
        }
        if (i <= rtx2ld2ELZv4) {
            rtx2ld2ELZv4 = i;
        }
        int i2 = (int) (j2 & 4294967295L);
        int OPXfSBeufaJ8 = rr.OPXfSBeufaJ8(j);
        int RAsUl2FVSrh6 = rr.RAsUl2FVSrh6(j);
        if (i2 < OPXfSBeufaJ8) {
            i2 = OPXfSBeufaJ8;
        }
        if (i2 <= RAsUl2FVSrh6) {
            RAsUl2FVSrh6 = i2;
        }
        return (rtx2ld2ELZv4 << 32) | (RAsUl2FVSrh6 & 4294967295L);
    }

    public static final int a92UlCVFR9N8(int i, long j) {
        int OPXfSBeufaJ8 = rr.OPXfSBeufaJ8(j);
        int RAsUl2FVSrh6 = rr.RAsUl2FVSrh6(j);
        if (i < OPXfSBeufaJ8) {
            i = OPXfSBeufaJ8;
        }
        return i > RAsUl2FVSrh6 ? RAsUl2FVSrh6 : i;
    }

    public static final void dgRBjINgWbAK(int i, int i2) {
        throw new IllegalArgumentException("Can't represent a width of " + i + " and height of " + i2 + " in Constraints");
    }

    public static final long e9gEMXR7LXtO(long j, long j2) {
        int wdg6QnbFHrFF = rr.wdg6QnbFHrFF(j);
        int rtx2ld2ELZv4 = rr.rtx2ld2ELZv4(j);
        int OPXfSBeufaJ8 = rr.OPXfSBeufaJ8(j);
        int RAsUl2FVSrh6 = rr.RAsUl2FVSrh6(j);
        int wdg6QnbFHrFF2 = rr.wdg6QnbFHrFF(j2);
        if (wdg6QnbFHrFF2 < wdg6QnbFHrFF) {
            wdg6QnbFHrFF2 = wdg6QnbFHrFF;
        }
        if (wdg6QnbFHrFF2 > rtx2ld2ELZv4) {
            wdg6QnbFHrFF2 = rtx2ld2ELZv4;
        }
        int rtx2ld2ELZv42 = rr.rtx2ld2ELZv4(j2);
        if (rtx2ld2ELZv42 >= wdg6QnbFHrFF) {
            wdg6QnbFHrFF = rtx2ld2ELZv42;
        }
        if (wdg6QnbFHrFF <= rtx2ld2ELZv4) {
            rtx2ld2ELZv4 = wdg6QnbFHrFF;
        }
        int OPXfSBeufaJ82 = rr.OPXfSBeufaJ8(j2);
        if (OPXfSBeufaJ82 < OPXfSBeufaJ8) {
            OPXfSBeufaJ82 = OPXfSBeufaJ8;
        }
        if (OPXfSBeufaJ82 > RAsUl2FVSrh6) {
            OPXfSBeufaJ82 = RAsUl2FVSrh6;
        }
        int RAsUl2FVSrh62 = rr.RAsUl2FVSrh6(j2);
        if (RAsUl2FVSrh62 >= OPXfSBeufaJ8) {
            OPXfSBeufaJ8 = RAsUl2FVSrh62;
        }
        if (OPXfSBeufaJ8 <= RAsUl2FVSrh6) {
            RAsUl2FVSrh6 = OPXfSBeufaJ8;
        }
        return PxuCJdSBwIXG(wdg6QnbFHrFF2, rtx2ld2ELZv4, OPXfSBeufaJ82, RAsUl2FVSrh6);
    }

    public static /* synthetic */ long lS5Rgt96tfkO(int i, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return PxuCJdSBwIXG(i, i2, i3, i4);
    }

    public static final long rtx2ld2ELZv4(int i, int i2, int i3, int i4) {
        int i5 = i4 == Integer.MAX_VALUE ? i3 : i4;
        int TSizfFm2Yiuu = TSizfFm2Yiuu(i5);
        int i6 = i2 == Integer.MAX_VALUE ? i : i2;
        int TSizfFm2Yiuu2 = TSizfFm2Yiuu(i6);
        if (TSizfFm2Yiuu + TSizfFm2Yiuu2 > 31) {
            dgRBjINgWbAK(i6, i5);
        }
        int i7 = i2 + 1;
        int i8 = i4 + 1;
        int i9 = TSizfFm2Yiuu2 - 13;
        return ((i7 & (~(i7 >> 31))) << 33) | ((i9 >> 1) + (i9 & 1)) | (i << 2) | (i3 << (TSizfFm2Yiuu2 + 2)) | ((i8 & (~(i8 >> 31))) << (TSizfFm2Yiuu2 + 33));
    }

    public static /* synthetic */ long wdg6QnbFHrFF(int i, int i2, int i3, long j) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return OPXfSBeufaJ8(i, i2, j);
    }

    public static final Void x50lh2ztY7Y5(int i) {
        throw new IllegalArgumentException(o0.OPXfSBeufaJ8(i, "Can't represent a size of ", " in Constraints"));
    }
}
