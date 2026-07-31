package l6;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class l extends k {
    public static Integer f(String str) {
        kotlin.jvm.internal.i.d(str, "<this>");
        return g(str, 10);
    }

    public static final Integer g(String str, int i7) {
        boolean z6;
        int i8;
        kotlin.jvm.internal.i.d(str, "<this>");
        a.a(i7);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i9 = 0;
        char charAt = str.charAt(0);
        int i10 = -2147483647;
        int i11 = 1;
        if (kotlin.jvm.internal.i.e(charAt, 48) >= 0) {
            z6 = false;
            i11 = 0;
        } else {
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                i10 = Integer.MIN_VALUE;
                z6 = true;
            } else {
                if (charAt != '+') {
                    return null;
                }
                z6 = false;
            }
        }
        int i12 = -59652323;
        while (i11 < length) {
            int b7 = a.b(str.charAt(i11), i7);
            if (b7 < 0) {
                return null;
            }
            if ((i9 < i12 && (i12 != -59652323 || i9 < (i12 = i10 / i7))) || (i8 = i9 * i7) < i10 + b7) {
                return null;
            }
            i9 = i8 - b7;
            i11++;
        }
        return z6 ? Integer.valueOf(i9) : Integer.valueOf(-i9);
    }

    public static Long h(String str) {
        kotlin.jvm.internal.i.d(str, "<this>");
        return i(str, 10);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Long i(String str, int i7) {
        kotlin.jvm.internal.i.d(str, "<this>");
        a.a(i7);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i8 = 0;
        char charAt = str.charAt(0);
        long j7 = -9223372036854775807L;
        boolean z6 = true;
        if (kotlin.jvm.internal.i.e(charAt, 48) < 0) {
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                j7 = Long.MIN_VALUE;
                i8 = 1;
                long j8 = -256204778801521550L;
                long j9 = 0;
                long j10 = -256204778801521550L;
                while (i8 < length) {
                    int b7 = a.b(str.charAt(i8), i7);
                    if (b7 < 0) {
                        return null;
                    }
                    if (j9 < j10) {
                        if (j10 == j8) {
                            j10 = j7 / i7;
                            if (j9 < j10) {
                            }
                        }
                        return null;
                    }
                    long j11 = j9 * i7;
                    long j12 = b7;
                    if (j11 < j7 + j12) {
                        return null;
                    }
                    j9 = j11 - j12;
                    i8++;
                    j8 = -256204778801521550L;
                }
                return !z6 ? Long.valueOf(j9) : Long.valueOf(-j9);
            }
            if (charAt != '+') {
                return null;
            }
            i8 = 1;
        }
        z6 = false;
        long j82 = -256204778801521550L;
        long j92 = 0;
        long j102 = -256204778801521550L;
        while (i8 < length) {
        }
        if (!z6) {
        }
    }
}
