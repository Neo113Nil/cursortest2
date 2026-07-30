package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class rr {
    public static final qr Companion = new qr();
    public final long PxuCJdSBwIXG;

    public /* synthetic */ rr(long j) {
        this.PxuCJdSBwIXG = j;
    }

    public static final int OPXfSBeufaJ8(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return ((int) (j >> (i2 + 15))) & ((1 << (18 - i2)) - 1);
    }

    public static long PxuCJdSBwIXG(long j, int i, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i = wdg6QnbFHrFF(j);
        }
        if ((i5 & 2) != 0) {
            i2 = rtx2ld2ELZv4(j);
        }
        if ((i5 & 4) != 0) {
            i3 = OPXfSBeufaJ8(j);
        }
        if ((i5 & 8) != 0) {
            i4 = RAsUl2FVSrh6(j);
        }
        if (i2 < i || i4 < i3 || i < 0 || i3 < 0) {
            gp0.PxuCJdSBwIXG("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return sr.rtx2ld2ELZv4(i, i2, i3, i4);
    }

    public static final int RAsUl2FVSrh6(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i3 = ((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1);
        if (i3 == 0) {
            return Integer.MAX_VALUE;
        }
        return i3 - 1;
    }

    public static final boolean TSizfFm2Yiuu(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return (((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1)) != 0;
    }

    public static final boolean Y1f8riQaR6yg(long j) {
        int i = (int) (3 & j);
        return (((int) (j >> 33)) & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1)) != 0;
    }

    public static final boolean a92UlCVFR9N8(long j) {
        int i = (int) (3 & j);
        int i2 = (1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1;
        int i3 = ((int) (j >> 2)) & i2;
        int i4 = ((int) (j >> 33)) & i2;
        return i3 == (i4 == 0 ? Integer.MAX_VALUE : i4 - 1);
    }

    public static String dgRBjINgWbAK(long j) {
        int rtx2ld2ELZv4 = rtx2ld2ELZv4(j);
        String valueOf = rtx2ld2ELZv4 == Integer.MAX_VALUE ? "Infinity" : String.valueOf(rtx2ld2ELZv4);
        int RAsUl2FVSrh6 = RAsUl2FVSrh6(j);
        String valueOf2 = RAsUl2FVSrh6 != Integer.MAX_VALUE ? String.valueOf(RAsUl2FVSrh6) : "Infinity";
        StringBuilder sb = new StringBuilder("Constraints(minWidth = ");
        sb.append(wdg6QnbFHrFF(j));
        sb.append(", maxWidth = ");
        sb.append(valueOf);
        sb.append(", minHeight = ");
        sb.append(OPXfSBeufaJ8(j));
        sb.append(", maxHeight = ");
        return o0.QrzZRwfaDlRX(sb, valueOf2, ')');
    }

    public static final boolean e9gEMXR7LXtO(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i3 = (1 << (18 - i2)) - 1;
        int i4 = ((int) (j >> (i2 + 15))) & i3;
        int i5 = ((int) (j >> (i2 + 46))) & i3;
        return i4 == (i5 == 0 ? Integer.MAX_VALUE : i5 - 1);
    }

    public static final boolean lS5Rgt96tfkO(long j, long j2) {
        return j == j2;
    }

    public static final int rtx2ld2ELZv4(long j) {
        int i = (int) (3 & j);
        int i2 = (int) (j >> 33);
        int i3 = i2 & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1);
        if (i3 == 0) {
            return Integer.MAX_VALUE;
        }
        return i3 - 1;
    }

    public static final int wdg6QnbFHrFF(long j) {
        int i = (int) (3 & j);
        return ((int) (j >> 2)) & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rr) {
            return this.PxuCJdSBwIXG == ((rr) obj).PxuCJdSBwIXG;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.PxuCJdSBwIXG);
    }

    public final String toString() {
        return dgRBjINgWbAK(this.PxuCJdSBwIXG);
    }
}
