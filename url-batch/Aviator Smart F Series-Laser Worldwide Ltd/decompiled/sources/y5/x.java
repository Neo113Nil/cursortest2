package y5;

/* loaded from: classes3.dex */
public abstract class x {
    public static final int doubleToUInt(double d8) {
        if (Double.isNaN(d8) || d8 <= uintToDouble(0)) {
            return 0;
        }
        if (d8 >= uintToDouble(-1)) {
            return -1;
        }
        return d8 <= 2.147483647E9d ? p.m1632constructorimpl((int) d8) : p.m1632constructorimpl(p.m1632constructorimpl((int) (d8 - Integer.MAX_VALUE)) + p.m1632constructorimpl(Integer.MAX_VALUE));
    }

    public static final long doubleToULong(double d8) {
        if (Double.isNaN(d8) || d8 <= ulongToDouble(0L)) {
            return 0L;
        }
        if (d8 >= ulongToDouble(-1L)) {
            return -1L;
        }
        return d8 < 9.223372036854776E18d ? r.m1710constructorimpl((long) d8) : r.m1710constructorimpl(r.m1710constructorimpl((long) (d8 - 9.223372036854776E18d)) - Long.MIN_VALUE);
    }

    public static final int uintCompare(int i8, int i9) {
        return kotlin.jvm.internal.s.compare(i8 ^ Integer.MIN_VALUE, i9 ^ Integer.MIN_VALUE);
    }

    /* renamed from: uintDivide-J1ME1BU, reason: not valid java name */
    public static final int m1857uintDivideJ1ME1BU(int i8, int i9) {
        return p.m1632constructorimpl((int) ((i8 & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32) / (i9 & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32)));
    }

    /* renamed from: uintRemainder-J1ME1BU, reason: not valid java name */
    public static final int m1858uintRemainderJ1ME1BU(int i8, int i9) {
        return p.m1632constructorimpl((int) ((i8 & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32) % (i9 & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32)));
    }

    public static final double uintToDouble(int i8) {
        return (Integer.MAX_VALUE & i8) + (((i8 >>> 31) << 30) * 2);
    }

    public static final int ulongCompare(long j8, long j9) {
        return kotlin.jvm.internal.s.compare(j8 ^ Long.MIN_VALUE, j9 ^ Long.MIN_VALUE);
    }

    /* renamed from: ulongDivide-eb3DHEI, reason: not valid java name */
    public static final long m1859ulongDivideeb3DHEI(long j8, long j9) {
        int compare;
        int compare2;
        if (j9 < 0) {
            compare2 = Long.compare(j8 ^ Long.MIN_VALUE, j9 ^ Long.MIN_VALUE);
            return compare2 < 0 ? r.m1710constructorimpl(0L) : r.m1710constructorimpl(1L);
        }
        if (j8 >= 0) {
            return r.m1710constructorimpl(j8 / j9);
        }
        long j10 = ((j8 >>> 1) / j9) << 1;
        compare = Long.compare(r.m1710constructorimpl(j8 - (j10 * j9)) ^ Long.MIN_VALUE, r.m1710constructorimpl(j9) ^ Long.MIN_VALUE);
        return r.m1710constructorimpl(j10 + (compare < 0 ? 0 : 1));
    }

    /* renamed from: ulongRemainder-eb3DHEI, reason: not valid java name */
    public static final long m1860ulongRemaindereb3DHEI(long j8, long j9) {
        int compare;
        int compare2;
        if (j9 < 0) {
            compare2 = Long.compare(j8 ^ Long.MIN_VALUE, j9 ^ Long.MIN_VALUE);
            return compare2 < 0 ? j8 : r.m1710constructorimpl(j8 - j9);
        }
        if (j8 >= 0) {
            return r.m1710constructorimpl(j8 % j9);
        }
        long j10 = j8 - ((((j8 >>> 1) / j9) << 1) * j9);
        compare = Long.compare(r.m1710constructorimpl(j10) ^ Long.MIN_VALUE, r.m1710constructorimpl(j9) ^ Long.MIN_VALUE);
        if (compare < 0) {
            j9 = 0;
        }
        return r.m1710constructorimpl(j10 - j9);
    }

    public static final double ulongToDouble(long j8) {
        return ((j8 >>> 11) * 2048) + (j8 & 2047);
    }

    public static final String ulongToString(long j8) {
        return ulongToString(j8, 10);
    }

    public static final String ulongToString(long j8, int i8) {
        int checkRadix;
        int checkRadix2;
        int checkRadix3;
        if (j8 >= 0) {
            checkRadix3 = kotlin.text.b.checkRadix(i8);
            String l8 = Long.toString(j8, checkRadix3);
            kotlin.jvm.internal.s.checkNotNullExpressionValue(l8, "toString(this, checkRadix(radix))");
            return l8;
        }
        long j9 = i8;
        long j10 = ((j8 >>> 1) / j9) << 1;
        long j11 = j8 - (j10 * j9);
        if (j11 >= j9) {
            j11 -= j9;
            j10++;
        }
        StringBuilder sb = new StringBuilder();
        checkRadix = kotlin.text.b.checkRadix(i8);
        String l9 = Long.toString(j10, checkRadix);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(l9, "toString(this, checkRadix(radix))");
        sb.append(l9);
        checkRadix2 = kotlin.text.b.checkRadix(i8);
        String l10 = Long.toString(j11, checkRadix2);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(l10, "toString(this, checkRadix(radix))");
        sb.append(l10);
        return sb.toString();
    }
}
