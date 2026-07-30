package z6;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f10122a;

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f10123b;

    static {
        int[] iArr = new int[256];
        int i7 = 0;
        for (int i8 = 0; i8 < 256; i8++) {
            iArr[i8] = "0123456789abcdef".charAt(i8 & 15) | ("0123456789abcdef".charAt(i8 >> 4) << '\b');
        }
        f10122a = iArr;
        int[] iArr2 = new int[256];
        for (int i9 = 0; i9 < 256; i9++) {
            iArr2[i9] = "0123456789ABCDEF".charAt(i9 & 15) | ("0123456789ABCDEF".charAt(i9 >> 4) << '\b');
        }
        int[] iArr3 = new int[256];
        for (int i10 = 0; i10 < 256; i10++) {
            iArr3[i10] = -1;
        }
        int i11 = 0;
        int i12 = 0;
        while (i11 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i11)] = i12;
            i11++;
            i12++;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i13)] = i14;
            i13++;
            i14++;
        }
        long[] jArr = new long[256];
        for (int i15 = 0; i15 < 256; i15++) {
            jArr[i15] = -1;
        }
        int i16 = 0;
        int i17 = 0;
        while (i16 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i16)] = i17;
            i16++;
            i17++;
        }
        int i18 = 0;
        while (i7 < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i7)] = i18;
            i7++;
            i18++;
        }
        f10123b = jArr;
    }

    public static final void a(int i7, int i8, String str) {
        int i9 = i8 - i7;
        if (i9 < 1) {
            String substring = str.substring(i7, i8);
            r6.k.e(substring, "substring(...)");
            throw new NumberFormatException("Expected at least 1 hexadecimal digits at index " + i7 + ", but was \"" + substring + "\" of length " + i9);
        }
        if (i9 > 16) {
            int i10 = (i9 + i7) - 16;
            while (i7 < i10) {
                if (str.charAt(i7) != '0') {
                    StringBuilder n8 = a0.m.n(i7, "Expected the hexadecimal digit '0' at index ", ", but was '");
                    n8.append(str.charAt(i7));
                    n8.append("'.\nThe result won't fit the type being parsed.");
                    throw new NumberFormatException(n8.toString());
                }
                i7++;
            }
        }
    }

    public static long b(int i7, int i8, String str) {
        f fVar = f.f10127d;
        r6.k.f(fVar, "format");
        j1.c.N(i7, i8, str.length());
        if (fVar.f10130c.f10126a) {
            a(i7, i8, str);
            return c(i7, i8, str);
        }
        if (i8 - i7 > 0) {
            a(i7, i8, str);
            return c(i7, i8, str);
        }
        String substring = str.substring(i7, i8);
        r6.k.e(substring, "substring(...)");
        throw new NumberFormatException("Expected a hexadecimal number with prefix \"\" and suffix \"\", but was ".concat(substring));
    }

    public static final long c(int i7, int i8, String str) {
        long j8 = 0;
        while (i7 < i8) {
            long j9 = j8 << 4;
            char charAt = str.charAt(i7);
            if ((charAt >>> '\b') == 0) {
                long j10 = f10123b[charAt];
                if (j10 >= 0) {
                    j8 = j9 | j10;
                    i7++;
                }
            }
            StringBuilder n8 = a0.m.n(i7, "Expected a hexadecimal digit at index ", ", but was ");
            n8.append(str.charAt(i7));
            throw new NumberFormatException(n8.toString());
        }
        return j8;
    }
}
