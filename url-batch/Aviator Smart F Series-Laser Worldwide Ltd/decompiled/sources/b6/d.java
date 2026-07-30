package b6;

import y5.i;
import y5.l;
import y5.p;
import y5.r;

/* loaded from: classes4.dex */
public abstract class d {
    /* renamed from: differenceModulo-WZ9TVnA, reason: not valid java name */
    private static final int m82differenceModuloWZ9TVnA(int i8, int i9, int i10) {
        int compare;
        int a8 = i.a(i8, i10);
        int a9 = i.a(i9, i10);
        compare = Integer.compare(a8 ^ Integer.MIN_VALUE, a9 ^ Integer.MIN_VALUE);
        int m1632constructorimpl = p.m1632constructorimpl(a8 - a9);
        return compare >= 0 ? m1632constructorimpl : p.m1632constructorimpl(m1632constructorimpl + i10);
    }

    /* renamed from: differenceModulo-sambcqE, reason: not valid java name */
    private static final long m83differenceModulosambcqE(long j8, long j9, long j10) {
        int compare;
        long a8 = l.a(j8, j10);
        long a9 = l.a(j9, j10);
        compare = Long.compare(a8 ^ Long.MIN_VALUE, a9 ^ Long.MIN_VALUE);
        long m1710constructorimpl = r.m1710constructorimpl(a8 - a9);
        return compare >= 0 ? m1710constructorimpl : r.m1710constructorimpl(m1710constructorimpl + j10);
    }

    /* renamed from: getProgressionLastElement-7ftBX0g, reason: not valid java name */
    public static final long m84getProgressionLastElement7ftBX0g(long j8, long j9, long j10) {
        int compare;
        int compare2;
        if (j10 > 0) {
            compare2 = Long.compare(j8 ^ Long.MIN_VALUE, j9 ^ Long.MIN_VALUE);
            return compare2 >= 0 ? j9 : r.m1710constructorimpl(j9 - m83differenceModulosambcqE(j9, j8, r.m1710constructorimpl(j10)));
        }
        if (j10 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        }
        compare = Long.compare(j8 ^ Long.MIN_VALUE, j9 ^ Long.MIN_VALUE);
        return compare <= 0 ? j9 : r.m1710constructorimpl(j9 + m83differenceModulosambcqE(j8, j9, r.m1710constructorimpl(-j10)));
    }

    /* renamed from: getProgressionLastElement-Nkh28Cs, reason: not valid java name */
    public static final int m85getProgressionLastElementNkh28Cs(int i8, int i9, int i10) {
        int compare;
        int compare2;
        if (i10 > 0) {
            compare2 = Integer.compare(i8 ^ Integer.MIN_VALUE, i9 ^ Integer.MIN_VALUE);
            return compare2 >= 0 ? i9 : p.m1632constructorimpl(i9 - m82differenceModuloWZ9TVnA(i9, i8, p.m1632constructorimpl(i10)));
        }
        if (i10 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        }
        compare = Integer.compare(i8 ^ Integer.MIN_VALUE, i9 ^ Integer.MIN_VALUE);
        return compare <= 0 ? i9 : p.m1632constructorimpl(i9 + m82differenceModuloWZ9TVnA(i8, i9, p.m1632constructorimpl(-i10)));
    }
}
