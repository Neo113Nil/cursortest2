package kotlin.text;

import com.google.android.exoplayer2.C;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class s extends r {
    public static final Void numberFormatError(String input) {
        kotlin.jvm.internal.s.checkNotNullParameter(input, "input");
        throw new NumberFormatException("Invalid number format: '" + input + '\'');
    }

    public static final Byte toByteOrNull(String str) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        return toByteOrNull(str, 10);
    }

    public static Integer toIntOrNull(String str) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        return toIntOrNull(str, 10);
    }

    public static Long toLongOrNull(String str) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        return toLongOrNull(str, 10);
    }

    public static final Short toShortOrNull(String str) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        return toShortOrNull(str, 10);
    }

    public static final Byte toByteOrNull(String str, int i8) {
        int intValue;
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        Integer intOrNull = toIntOrNull(str, i8);
        if (intOrNull == null || (intValue = intOrNull.intValue()) < -128 || intValue > 127) {
            return null;
        }
        return Byte.valueOf((byte) intValue);
    }

    public static final Integer toIntOrNull(String str, int i8) {
        boolean z7;
        int i9;
        int i10;
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        b.checkRadix(i8);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char charAt = str.charAt(0);
        int compare = kotlin.jvm.internal.s.compare((int) charAt, 48);
        int i12 = C.RATE_UNSET_INT;
        if (compare < 0) {
            i9 = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                i12 = Integer.MIN_VALUE;
                z7 = true;
            } else {
                if (charAt != '+') {
                    return null;
                }
                z7 = false;
            }
        } else {
            z7 = false;
            i9 = 0;
        }
        int i13 = -59652323;
        while (i9 < length) {
            int digitOf = b.digitOf(str.charAt(i9), i8);
            if (digitOf < 0) {
                return null;
            }
            if ((i11 < i13 && (i13 != -59652323 || i11 < (i13 = i12 / i8))) || (i10 = i11 * i8) < i12 + digitOf) {
                return null;
            }
            i11 = i10 - digitOf;
            i9++;
        }
        return z7 ? Integer.valueOf(i11) : Integer.valueOf(-i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Long toLongOrNull(String str, int i8) {
        boolean z7;
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        b.checkRadix(i8);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i9 = 0;
        char charAt = str.charAt(0);
        int compare = kotlin.jvm.internal.s.compare((int) charAt, 48);
        long j8 = C.TIME_UNSET;
        if (compare < 0) {
            z7 = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                j8 = Long.MIN_VALUE;
                i9 = 1;
                long j9 = -256204778801521550L;
                long j10 = 0;
                long j11 = -256204778801521550L;
                while (i9 < length) {
                    int digitOf = b.digitOf(str.charAt(i9), i8);
                    if (digitOf < 0) {
                        return null;
                    }
                    if (j10 < j11) {
                        if (j11 == j9) {
                            j11 = j8 / i8;
                            if (j10 < j11) {
                            }
                        }
                        return null;
                    }
                    long j12 = j10 * i8;
                    long j13 = digitOf;
                    if (j12 < j8 + j13) {
                        return null;
                    }
                    j10 = j12 - j13;
                    i9++;
                    j9 = -256204778801521550L;
                }
                return !z7 ? Long.valueOf(j10) : Long.valueOf(-j10);
            }
            if (charAt != '+') {
                return null;
            }
            i9 = 1;
        }
        z7 = false;
        long j92 = -256204778801521550L;
        long j102 = 0;
        long j112 = -256204778801521550L;
        while (i9 < length) {
        }
        if (!z7) {
        }
    }

    public static final Short toShortOrNull(String str, int i8) {
        int intValue;
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        Integer intOrNull = toIntOrNull(str, i8);
        if (intOrNull == null || (intValue = intOrNull.intValue()) < -32768 || intValue > 32767) {
            return null;
        }
        return Short.valueOf((short) intValue);
    }
}
