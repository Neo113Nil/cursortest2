package kotlin.random;

import j6.b0;
import j6.y;
import kotlin.jvm.internal.s;
import y5.o;
import y5.p;
import y5.r;

/* loaded from: classes4.dex */
public abstract class e {
    /* renamed from: checkUIntRangeBounds-J1ME1BU, reason: not valid java name */
    public static final void m1190checkUIntRangeBoundsJ1ME1BU(int i8, int i9) {
        int compare;
        compare = Integer.compare(i9 ^ Integer.MIN_VALUE, i8 ^ Integer.MIN_VALUE);
        if (compare <= 0) {
            throw new IllegalArgumentException(d.boundsErrorMessage(p.m1626boximpl(i8), p.m1626boximpl(i9)).toString());
        }
    }

    /* renamed from: checkULongRangeBounds-eb3DHEI, reason: not valid java name */
    public static final void m1191checkULongRangeBoundseb3DHEI(long j8, long j9) {
        int compare;
        compare = Long.compare(j9 ^ Long.MIN_VALUE, j8 ^ Long.MIN_VALUE);
        if (compare <= 0) {
            throw new IllegalArgumentException(d.boundsErrorMessage(r.m1704boximpl(j8), r.m1704boximpl(j9)).toString());
        }
    }

    public static final byte[] nextUBytes(Random random, int i8) {
        s.checkNotNullParameter(random, "<this>");
        return o.m1609constructorimpl(random.nextBytes(i8));
    }

    /* renamed from: nextUBytes-EVgfTAA, reason: not valid java name */
    public static final byte[] m1192nextUBytesEVgfTAA(Random nextUBytes, byte[] array) {
        s.checkNotNullParameter(nextUBytes, "$this$nextUBytes");
        s.checkNotNullParameter(array, "array");
        nextUBytes.nextBytes(array);
        return array;
    }

    /* renamed from: nextUBytes-Wvrt4B4, reason: not valid java name */
    public static final byte[] m1193nextUBytesWvrt4B4(Random nextUBytes, byte[] array, int i8, int i9) {
        s.checkNotNullParameter(nextUBytes, "$this$nextUBytes");
        s.checkNotNullParameter(array, "array");
        nextUBytes.nextBytes(array, i8, i9);
        return array;
    }

    /* renamed from: nextUBytes-Wvrt4B4$default, reason: not valid java name */
    public static /* synthetic */ byte[] m1194nextUBytesWvrt4B4$default(Random random, byte[] bArr, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = o.m1615getSizeimpl(bArr);
        }
        return m1193nextUBytesWvrt4B4(random, bArr, i8, i9);
    }

    public static final int nextUInt(Random random) {
        s.checkNotNullParameter(random, "<this>");
        return p.m1632constructorimpl(random.nextInt());
    }

    /* renamed from: nextUInt-a8DCA5k, reason: not valid java name */
    public static final int m1195nextUInta8DCA5k(Random nextUInt, int i8, int i9) {
        s.checkNotNullParameter(nextUInt, "$this$nextUInt");
        m1190checkUIntRangeBoundsJ1ME1BU(i8, i9);
        return p.m1632constructorimpl(nextUInt.nextInt(i8 ^ Integer.MIN_VALUE, i9 ^ Integer.MIN_VALUE) ^ Integer.MIN_VALUE);
    }

    /* renamed from: nextUInt-qCasIEU, reason: not valid java name */
    public static final int m1196nextUIntqCasIEU(Random nextUInt, int i8) {
        s.checkNotNullParameter(nextUInt, "$this$nextUInt");
        return m1195nextUInta8DCA5k(nextUInt, 0, i8);
    }

    public static final long nextULong(Random random) {
        s.checkNotNullParameter(random, "<this>");
        return r.m1710constructorimpl(random.nextLong());
    }

    /* renamed from: nextULong-V1Xi4fY, reason: not valid java name */
    public static final long m1197nextULongV1Xi4fY(Random nextULong, long j8) {
        s.checkNotNullParameter(nextULong, "$this$nextULong");
        return m1198nextULongjmpaWc(nextULong, 0L, j8);
    }

    /* renamed from: nextULong-jmpaW-c, reason: not valid java name */
    public static final long m1198nextULongjmpaWc(Random nextULong, long j8, long j9) {
        s.checkNotNullParameter(nextULong, "$this$nextULong");
        m1191checkULongRangeBoundseb3DHEI(j8, j9);
        return r.m1710constructorimpl(nextULong.nextLong(j8 ^ Long.MIN_VALUE, j9 ^ Long.MIN_VALUE) ^ Long.MIN_VALUE);
    }

    public static final int nextUInt(Random random, y range) {
        int compare;
        int compare2;
        s.checkNotNullParameter(random, "<this>");
        s.checkNotNullParameter(range, "range");
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + range);
        }
        compare = Integer.compare(range.m204getLastpVg5ArA() ^ Integer.MIN_VALUE, (-1) ^ Integer.MIN_VALUE);
        if (compare < 0) {
            return m1195nextUInta8DCA5k(random, range.m203getFirstpVg5ArA(), p.m1632constructorimpl(range.m204getLastpVg5ArA() + 1));
        }
        compare2 = Integer.compare(range.m203getFirstpVg5ArA() ^ Integer.MIN_VALUE, 0 ^ Integer.MIN_VALUE);
        return compare2 > 0 ? p.m1632constructorimpl(m1195nextUInta8DCA5k(random, p.m1632constructorimpl(range.m203getFirstpVg5ArA() - 1), range.m204getLastpVg5ArA()) + 1) : nextUInt(random);
    }

    public static final long nextULong(Random random, b0 range) {
        int compare;
        int compare2;
        s.checkNotNullParameter(random, "<this>");
        s.checkNotNullParameter(range, "range");
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + range);
        }
        compare = Long.compare(range.m213getLastsVKNKU() ^ Long.MIN_VALUE, (-1) ^ Long.MIN_VALUE);
        if (compare < 0) {
            return m1198nextULongjmpaWc(random, range.m212getFirstsVKNKU(), r.m1710constructorimpl(range.m213getLastsVKNKU() + r.m1710constructorimpl(1 & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32)));
        }
        compare2 = Long.compare(range.m212getFirstsVKNKU() ^ Long.MIN_VALUE, 0 ^ Long.MIN_VALUE);
        if (compare2 <= 0) {
            return nextULong(random);
        }
        long m212getFirstsVKNKU = range.m212getFirstsVKNKU();
        long j8 = 1 & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32;
        return r.m1710constructorimpl(m1198nextULongjmpaWc(random, r.m1710constructorimpl(m212getFirstsVKNKU - r.m1710constructorimpl(j8)), range.m213getLastsVKNKU()) + r.m1710constructorimpl(j8));
    }
}
