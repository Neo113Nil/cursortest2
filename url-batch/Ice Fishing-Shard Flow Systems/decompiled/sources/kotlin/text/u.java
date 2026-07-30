package kotlin.text;

import R5.A;
import R5.E;
import R5.w;
import R5.x;
import R5.z;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class u {
    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final byte a(String str) {
        R5.t tVar;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        x c7 = c(str);
        if (c7 != null) {
            int i2 = c7.f2439d;
            if (Integer.compare(Integer.MIN_VALUE ^ i2, -2147483393) <= 0) {
                tVar = new R5.t((byte) i2);
                if (tVar == null) {
                    return tVar.f2433d;
                }
                StringsKt__StringNumberConversionsKt.e(str);
                throw null;
            }
        }
        tVar = null;
        if (tVar == null) {
        }
    }

    public static final int b(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        x c7 = c(str);
        if (c7 != null) {
            return c7.f2439d;
        }
        StringsKt__StringNumberConversionsKt.e(str);
        throw null;
    }

    public static final x c(String str) {
        int i2;
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i5 = 0;
        char charAt = str.charAt(0);
        if (Intrinsics.d(charAt, 48) < 0) {
            i2 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        } else {
            i2 = 0;
        }
        w wVar = x.f2438e;
        int i7 = 119304647;
        while (i2 < length) {
            int digit = Character.digit((int) str.charAt(i2), 10);
            if (digit < 0) {
                return null;
            }
            int i8 = i5 ^ Integer.MIN_VALUE;
            if (Integer.compare(i8, i7 ^ Integer.MIN_VALUE) > 0) {
                if (i7 != 119304647) {
                    return null;
                }
                i7 = (int) (((-1) & 4294967295L) / (4294967295L & 10));
                if (Integer.compare(i8, i7 ^ Integer.MIN_VALUE) > 0) {
                    return null;
                }
            }
            int i9 = i5 * 10;
            int i10 = digit + i9;
            if (Integer.compare(i10 ^ Integer.MIN_VALUE, i9 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i2++;
            i5 = i10;
        }
        return new x(i5);
    }

    public static final long d(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        A e7 = e(str);
        if (e7 != null) {
            return e7.f2401d;
        }
        StringsKt__StringNumberConversionsKt.e(str);
        throw null;
    }

    public static final A e(String str) {
        int i2;
        long j;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i5 = 10;
        CharsKt__CharJVMKt.checkRadix(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        char charAt = str.charAt(0);
        int i7 = 1;
        if (Intrinsics.d(charAt, 48) >= 0) {
            i2 = 0;
        } else {
            if (length == 1 || charAt != '+') {
                return null;
            }
            i2 = 1;
        }
        long j7 = 10;
        z zVar = A.f2400e;
        long j8 = 0;
        long j9 = 512409557603043100L;
        while (i2 < length) {
            int digit = Character.digit((int) str.charAt(i2), i5);
            if (digit < 0) {
                return null;
            }
            int i8 = length;
            long j10 = j8 ^ Long.MIN_VALUE;
            int i9 = i2;
            if (Long.compare(j10, j9 ^ Long.MIN_VALUE) <= 0) {
                j = j7;
            } else {
                if (j9 != 512409557603043100L) {
                    return null;
                }
                if (j7 >= 0) {
                    long j11 = (Long.MAX_VALUE / j7) << i7;
                    j = j7;
                    j9 = j11 + ((((-1) - (j11 * j7)) ^ Long.MIN_VALUE) >= (j7 ^ Long.MIN_VALUE) ? i7 : 0);
                } else if (Long.MAX_VALUE < (j7 ^ Long.MIN_VALUE)) {
                    j = j7;
                    j9 = 0;
                } else {
                    j9 = 1;
                    j = j7;
                }
                if (Long.compare(j10, j9 ^ Long.MIN_VALUE) > 0) {
                    return null;
                }
            }
            long j12 = j8 * j;
            w wVar = x.f2438e;
            long j13 = (digit & 4294967295L) + j12;
            if (Long.compare(j13 ^ Long.MIN_VALUE, j12 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i2 = i9 + 1;
            j8 = j13;
            length = i8;
            j7 = j;
            i5 = 10;
            i7 = 1;
        }
        return new A(j8);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final short f(String str) {
        E e7;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        x c7 = c(str);
        if (c7 != null) {
            int i2 = c7.f2439d;
            if (Integer.compare(Integer.MIN_VALUE ^ i2, -2147418113) <= 0) {
                e7 = new E((short) i2);
                if (e7 == null) {
                    return e7.f2405d;
                }
                StringsKt__StringNumberConversionsKt.e(str);
                throw null;
            }
        }
        e7 = null;
        if (e7 == null) {
        }
    }
}
