package h2;

import H2.AbstractC0080b;

/* renamed from: h2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0442d {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f5069a;

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f5070b;

    static {
        int[] iArr = new int[256];
        int i3 = 0;
        for (int i4 = 0; i4 < 256; i4++) {
            iArr[i4] = "0123456789abcdef".charAt(i4 & 15) | ("0123456789abcdef".charAt(i4 >> 4) << '\b');
        }
        f5069a = iArr;
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
        while (i3 < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i3)] = i14;
            i3++;
            i14++;
        }
        f5070b = jArr;
    }

    public static final void a(int i3, int i4, String str) {
        int i5 = i4 - i3;
        if (i5 < 1) {
            String substring = str.substring(i3, i4);
            Z1.i.e(substring, "substring(...)");
            throw new NumberFormatException("Expected at least 1 hexadecimal digits at index " + i3 + ", but was \"" + substring + "\" of length " + i5);
        }
        if (i5 > 16) {
            int i6 = (i5 + i3) - 16;
            while (i3 < i6) {
                if (str.charAt(i3) != '0') {
                    StringBuilder l3 = AbstractC0080b.l("Expected the hexadecimal digit '0' at index ", i3, ", but was '");
                    l3.append(str.charAt(i3));
                    l3.append("'.\nThe result won't fit the type being parsed.");
                    throw new NumberFormatException(l3.toString());
                }
                i3++;
            }
        }
    }

    public static long b(int i3, int i4, String str) {
        C0445g c0445g = C0445g.f5074d;
        Z1.i.f(c0445g, "format");
        I2.d.o(i3, i4, str.length());
        if (c0445g.f5077c.f5073a) {
            a(i3, i4, str);
            return c(i3, i4, str);
        }
        if (i4 - i3 > 0) {
            a(i3, i4, str);
            return c(i3, i4, str);
        }
        String substring = str.substring(i3, i4);
        Z1.i.e(substring, "substring(...)");
        throw new NumberFormatException("Expected a hexadecimal number with prefix \"\" and suffix \"\", but was ".concat(substring));
    }

    public static final long c(int i3, int i4, String str) {
        long j3 = 0;
        while (i3 < i4) {
            long j4 = j3 << 4;
            char charAt = str.charAt(i3);
            if ((charAt >>> '\b') == 0) {
                long j5 = f5070b[charAt];
                if (j5 >= 0) {
                    j3 = j4 | j5;
                    i3++;
                }
            }
            StringBuilder l3 = AbstractC0080b.l("Expected a hexadecimal digit at index ", i3, ", but was ");
            l3.append(str.charAt(i3));
            throw new NumberFormatException(l3.toString());
        }
        return j3;
    }
}
