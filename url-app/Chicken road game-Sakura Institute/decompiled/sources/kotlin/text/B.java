package kotlin.text;

import kotlin.jvm.internal.Intrinsics;
import y2.w;
import y2.y;

/* loaded from: classes.dex */
public abstract class B {
    public static final boolean a(String str) {
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (Intrinsics.e(charAt, 128) >= 0 || Character.isLetter(charAt)) {
                return true;
            }
        }
        return false;
    }

    public static final y2.w b(String str) {
        int i2;
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i4 = 0;
        char charAt = str.charAt(0);
        if (Intrinsics.e(charAt, 48) >= 0) {
            i2 = 0;
        } else {
            if (length == 1 || charAt != '+') {
                return null;
            }
            i2 = 1;
        }
        w.a aVar = y2.w.f11685e;
        int i5 = 119304647;
        while (i2 < length) {
            int digit = Character.digit((int) str.charAt(i2), 10);
            if (digit < 0) {
                return null;
            }
            if (Integer.compareUnsigned(i4, i5) > 0) {
                if (i5 == 119304647) {
                    i5 = Integer.divideUnsigned(-1, 10);
                    if (Integer.compareUnsigned(i4, i5) > 0) {
                    }
                }
                return null;
            }
            int i6 = i4 * 10;
            int i7 = digit + i6;
            if (Integer.compareUnsigned(i7, i6) < 0) {
                return null;
            }
            i2++;
            i4 = i7;
        }
        return new y2.w(i4);
    }

    public static final y2.y c(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char charAt = str.charAt(0);
        if (Intrinsics.e(charAt, 48) < 0) {
            if (length == 1 || charAt != '+') {
                return null;
            }
            i2 = 1;
        }
        long j4 = 10;
        y.a aVar = y2.y.f11688e;
        long j5 = 0;
        long j6 = 512409557603043100L;
        while (i2 < length) {
            int digit = Character.digit((int) str.charAt(i2), 10);
            if (digit < 0) {
                return null;
            }
            if (Long.compareUnsigned(j5, j6) > 0) {
                if (j6 != 512409557603043100L) {
                    return null;
                }
                j6 = Long.divideUnsigned(-1L, j4);
                if (Long.compareUnsigned(j5, j6) > 0) {
                    return null;
                }
            }
            long j7 = j5 * j4;
            w.a aVar2 = y2.w.f11685e;
            long j8 = (digit & 4294967295L) + j7;
            if (Long.compareUnsigned(j8, j7) < 0) {
                return null;
            }
            i2++;
            j5 = j8;
        }
        return new y2.y(j5);
    }
}
