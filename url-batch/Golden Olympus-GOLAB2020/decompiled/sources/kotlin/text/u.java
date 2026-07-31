package kotlin.text;

import W1.y;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class u {
    public static final byte a(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        W1.r b4 = b(str);
        if (b4 != null) {
            return b4.f();
        }
        StringsKt__StringNumberConversionsKt.l(str);
        throw new W1.f();
    }

    public static final W1.r b(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return c(str, 10);
    }

    public static final W1.r c(String str, int i4) {
        int compare;
        Intrinsics.checkNotNullParameter(str, "<this>");
        W1.t f4 = f(str, i4);
        if (f4 == null) {
            return null;
        }
        int f5 = f4.f();
        compare = Integer.compare(f5 ^ Integer.MIN_VALUE, W1.t.b(KotlinVersion.MAX_COMPONENT_VALUE) ^ Integer.MIN_VALUE);
        if (compare > 0) {
            return null;
        }
        return W1.r.a(W1.r.b((byte) f5));
    }

    public static final int d(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        W1.t e4 = e(str);
        if (e4 != null) {
            return e4.f();
        }
        StringsKt__StringNumberConversionsKt.l(str);
        throw new W1.f();
    }

    public static final W1.t e(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return f(str, 10);
    }

    public static final W1.t f(String str, int i4) {
        int i5;
        int compare;
        int compare2;
        int compare3;
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(i4);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i6 = 0;
        char charAt = str.charAt(0);
        if (Intrinsics.compare((int) charAt, 48) < 0) {
            i5 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        } else {
            i5 = 0;
        }
        int b4 = W1.t.b(i4);
        int i7 = 119304647;
        while (i5 < length) {
            int a4 = CharsKt__CharJVMKt.a(str.charAt(i5), i4);
            if (a4 < 0) {
                return null;
            }
            compare = Integer.compare(i6 ^ Integer.MIN_VALUE, i7 ^ Integer.MIN_VALUE);
            if (compare > 0) {
                if (i7 == 119304647) {
                    i7 = t.a(-1, b4);
                    compare3 = Integer.compare(i6 ^ Integer.MIN_VALUE, i7 ^ Integer.MIN_VALUE);
                    if (compare3 > 0) {
                    }
                }
                return null;
            }
            int b5 = W1.t.b(i6 * b4);
            int b6 = W1.t.b(W1.t.b(a4) + b5);
            compare2 = Integer.compare(b6 ^ Integer.MIN_VALUE, b5 ^ Integer.MIN_VALUE);
            if (compare2 < 0) {
                return null;
            }
            i5++;
            i6 = b6;
        }
        return W1.t.a(i6);
    }

    public static final long g(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        W1.v h4 = h(str);
        if (h4 != null) {
            return h4.f();
        }
        StringsKt__StringNumberConversionsKt.l(str);
        throw new W1.f();
    }

    public static final W1.v h(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return i(str, 10);
    }

    public static final W1.v i(String str, int i4) {
        int compare;
        int compare2;
        int compare3;
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(i4);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i5 = 0;
        char charAt = str.charAt(0);
        if (Intrinsics.compare((int) charAt, 48) < 0) {
            i5 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        }
        long b4 = W1.v.b(i4);
        long j4 = 0;
        long j5 = 512409557603043100L;
        while (i5 < length) {
            if (CharsKt__CharJVMKt.a(str.charAt(i5), i4) < 0) {
                return null;
            }
            compare = Long.compare(j4 ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE);
            if (compare > 0) {
                if (j5 == 512409557603043100L) {
                    j5 = r.a(-1L, b4);
                    compare3 = Long.compare(j4 ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE);
                    if (compare3 > 0) {
                    }
                }
                return null;
            }
            long b5 = W1.v.b(j4 * b4);
            long b6 = W1.v.b(W1.v.b(W1.t.b(r13) & 4294967295L) + b5);
            compare2 = Long.compare(b6 ^ Long.MIN_VALUE, b5 ^ Long.MIN_VALUE);
            if (compare2 < 0) {
                return null;
            }
            i5++;
            j4 = b6;
        }
        return W1.v.a(j4);
    }

    public static final short j(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        y k4 = k(str);
        if (k4 != null) {
            return k4.f();
        }
        StringsKt__StringNumberConversionsKt.l(str);
        throw new W1.f();
    }

    public static final y k(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return l(str, 10);
    }

    public static final y l(String str, int i4) {
        int compare;
        Intrinsics.checkNotNullParameter(str, "<this>");
        W1.t f4 = f(str, i4);
        if (f4 == null) {
            return null;
        }
        int f5 = f4.f();
        compare = Integer.compare(f5 ^ Integer.MIN_VALUE, W1.t.b(65535) ^ Integer.MIN_VALUE);
        if (compare > 0) {
            return null;
        }
        return y.a(y.b((short) f5));
    }
}
