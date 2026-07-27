package kotlin.text;

import A.AbstractC0017m;
import kotlin.jvm.internal.Intrinsics;
import z2.AbstractC1420d;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f7526a;

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f7527b;

    static {
        int[] iArr = new int[256];
        int i2 = 0;
        for (int i4 = 0; i4 < 256; i4++) {
            iArr[i4] = "0123456789abcdef".charAt(i4 & 15) | ("0123456789abcdef".charAt(i4 >> 4) << '\b');
        }
        f7526a = iArr;
        int[] iArr2 = new int[256];
        for (int i5 = 0; i5 < 256; i5++) {
            iArr2[i5] = "0123456789ABCDEF".charAt(i5 & 15) | ("0123456789ABCDEF".charAt(i5 >> 4) << '\b');
        }
        int[] iArr3 = new int[256];
        for (int i6 = 0; i6 < 256; i6++) {
            iArr3[i6] = -1;
        }
        int i7 = 0;
        int i8 = 0;
        while (i7 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i7)] = i8;
            i7++;
            i8++;
        }
        int i9 = 0;
        int i10 = 0;
        while (i9 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i9)] = i10;
            i9++;
            i10++;
        }
        long[] jArr = new long[256];
        for (int i11 = 0; i11 < 256; i11++) {
            jArr[i11] = -1;
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i12)] = i13;
            i12++;
            i13++;
        }
        int i14 = 0;
        while (i2 < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i2)] = i14;
            i2++;
            i14++;
        }
        f7527b = jArr;
    }

    public static final void a(String str, int i2, int i4) {
        int i5 = i4 - i2;
        if (i5 < 1) {
            String substring = str.substring(i2, i4);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            throw new NumberFormatException("Expected at least 1 hexadecimal digits at index " + i2 + ", but was \"" + substring + "\" of length " + i5);
        }
        if (i5 > 16) {
            int i6 = (i5 + i2) - 16;
            while (i2 < i6) {
                if (str.charAt(i2) != '0') {
                    StringBuilder o4 = AbstractC0017m.o(i2, "Expected the hexadecimal digit '0' at index ", ", but was '");
                    o4.append(str.charAt(i2));
                    o4.append("'.\nThe result won't fit the type being parsed.");
                    throw new NumberFormatException(o4.toString());
                }
                i2++;
            }
        }
    }

    public static long b(String str, int i2, int i4) {
        g format = g.f7531d;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        AbstractC1420d.a aVar = AbstractC1420d.f11939d;
        int length = str.length();
        aVar.getClass();
        AbstractC1420d.a.a(i2, i4, length);
        if (format.f7534c.f7530a) {
            a(str, i2, i4);
            return c(str, i2, i4);
        }
        if (i4 - i2 > 0) {
            a(str, i2, i4);
            return c(str, i2, i4);
        }
        String substring = str.substring(i2, i4);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        throw new NumberFormatException("Expected a hexadecimal number with prefix \"\" and suffix \"\", but was " + substring);
    }

    public static final long c(String str, int i2, int i4) {
        long j4 = 0;
        while (i2 < i4) {
            long j5 = j4 << 4;
            char charAt = str.charAt(i2);
            if ((charAt >>> '\b') == 0) {
                long j6 = f7527b[charAt];
                if (j6 >= 0) {
                    j4 = j5 | j6;
                    i2++;
                }
            }
            StringBuilder o4 = AbstractC0017m.o(i2, "Expected a hexadecimal digit at index ", ", but was ");
            o4.append(str.charAt(i2));
            throw new NumberFormatException(o4.toString());
        }
        return j4;
    }
}
