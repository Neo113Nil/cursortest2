package defpackage;

import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jjf {
    public static final /* synthetic */ int a = 0;
    private static volatile int b = 100;

    static double a(byte[] bArr, int i) {
        return Double.longBitsToDouble(t(bArr, i));
    }

    static float b(byte[] bArr, int i) {
        return Float.intBitsToFloat(d(bArr, i));
    }

    static int c(byte[] bArr, int i, jje jjeVar) {
        int f = f(bArr, i, bArr.length, jjeVar);
        int i2 = jjeVar.a;
        if (i2 == 0) {
            jjeVar.c = jjq.d;
            return f;
        }
        jjeVar.c = jjq.s(bArr, f, i2);
        return f + i2;
    }

    static int d(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    static int e(jlz jlzVar, byte[] bArr, int i, int i2, int i3, jje jjeVar) {
        Object e = jlzVar.e();
        int q = q(e, jlzVar, bArr, i, i2, i3, jjeVar);
        jlzVar.g(e);
        jjeVar.c = e;
        return q;
    }

    static int f(byte[] bArr, int i, int i2, jje jjeVar) {
        int m = m(bArr, i, jjeVar);
        int i3 = jjeVar.a;
        if (i3 < 0) {
            throw new jld("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i3 <= i2 - m) {
            return m;
        }
        throw new jld("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int g(jlz jlzVar, byte[] bArr, int i, int i2, jje jjeVar) {
        Object e = jlzVar.e();
        int r = r(e, jlzVar, bArr, i, i2, jjeVar);
        jlzVar.g(e);
        jjeVar.c = e;
        return r;
    }

    static int h(jlz jlzVar, int i, byte[] bArr, int i2, int i3, jkx jkxVar, jje jjeVar) {
        int g = g(jlzVar, bArr, i2, i3, jjeVar);
        jkxVar.add(jjeVar.c);
        while (g < i3) {
            int m = m(bArr, g, jjeVar);
            if (i != jjeVar.a) {
                break;
            }
            g = g(jlzVar, bArr, m, i3, jjeVar);
            jkxVar.add(jjeVar.c);
        }
        return g;
    }

    static int i(byte[] bArr, int i, jkx jkxVar, jje jjeVar) {
        jkq jkqVar = (jkq) jkxVar;
        int f = f(bArr, i, bArr.length, jjeVar);
        int i2 = jjeVar.a + f;
        while (f < i2) {
            f = m(bArr, f, jjeVar);
            jkqVar.g(jjeVar.a);
        }
        if (f == i2) {
            return f;
        }
        throw new jld("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int j(byte[] bArr, int i, jje jjeVar) {
        int f = f(bArr, i, bArr.length, jjeVar);
        int i2 = jjeVar.a;
        if (i2 == 0) {
            jjeVar.c = "";
            return f;
        }
        jjeVar.c = new String(bArr, f, i2, StandardCharsets.UTF_8);
        return f + i2;
    }

    static int k(byte[] bArr, int i, jje jjeVar) {
        int f = f(bArr, i, bArr.length, jjeVar);
        int i2 = jjeVar.a;
        if (i2 == 0) {
            jjeVar.c = "";
            return f;
        }
        jjeVar.c = img.b(bArr, f, i2);
        return f + i2;
    }

    static int l(int i, byte[] bArr, int i2, int i3, jmk jmkVar, jje jjeVar) {
        if ((i >>> 3) == 0) {
            throw new jld("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int p = p(bArr, i2, jjeVar);
            jmkVar.e(i, Long.valueOf(jjeVar.b));
            return p;
        }
        if (i4 == 1) {
            jmkVar.e(i, Long.valueOf(t(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int f = f(bArr, i2, bArr.length, jjeVar);
            int i5 = jjeVar.a;
            if (i5 == 0) {
                jmkVar.e(i, jjq.d);
            } else {
                jmkVar.e(i, jjq.s(bArr, f, i5));
            }
            return f + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new jld("Protocol message contained an invalid tag (zero).");
            }
            jmkVar.e(i, Integer.valueOf(d(bArr, i2)));
            return i2 + 4;
        }
        jmk jmkVar2 = new jmk();
        int i6 = (i & (-8)) | 4;
        int i7 = jjeVar.e + 1;
        jjeVar.e = i7;
        u(i7);
        int i8 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int m = m(bArr, i2, jjeVar);
            int i9 = jjeVar.a;
            if (i9 == i6) {
                i8 = i9;
                i2 = m;
                break;
            }
            i2 = l(i9, bArr, m, i3, jmkVar2, jjeVar);
            i8 = i9;
        }
        jjeVar.e--;
        if (i2 > i3 || i8 != i6) {
            throw new jld("Failed to parse the message.");
        }
        jmkVar.e(i, jmkVar2);
        return i2;
    }

    static int m(byte[] bArr, int i, jje jjeVar) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        if (b2 < 0) {
            return n(b2, bArr, i2, jjeVar);
        }
        jjeVar.a = b2;
        return i2;
    }

    static int n(int i, byte[] bArr, int i2, jje jjeVar) {
        byte b2 = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b2 >= 0) {
            jjeVar.a = i4 | (b2 << 7);
            return i3;
        }
        int i5 = i4 | ((b2 & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b3 = bArr[i3];
        if (b3 >= 0) {
            jjeVar.a = i5 | (b3 << 14);
            return i6;
        }
        int i7 = i5 | ((b3 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b4 = bArr[i6];
        if (b4 >= 0) {
            jjeVar.a = i7 | (b4 << 21);
            return i8;
        }
        int i9 = i7 | ((b4 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b5 = bArr[i8];
        if (b5 >= 0) {
            jjeVar.a = i9 | (b5 << 28);
            return i10;
        }
        int i11 = i9 | ((b5 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                jjeVar.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static int o(int i, byte[] bArr, int i2, int i3, jkx jkxVar, jje jjeVar) {
        jkq jkqVar = (jkq) jkxVar;
        int m = m(bArr, i2, jjeVar);
        jkqVar.g(jjeVar.a);
        while (m < i3) {
            int m2 = m(bArr, m, jjeVar);
            if (i != jjeVar.a) {
                break;
            }
            m = m(bArr, m2, jjeVar);
            jkqVar.g(jjeVar.a);
        }
        return m;
    }

    static int p(byte[] bArr, int i, jje jjeVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            jjeVar.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | ((b2 & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & Byte.MAX_VALUE) << i4;
            b2 = bArr[i3];
            i3 = i5;
        }
        jjeVar.b = j2;
        return i3;
    }

    static int q(Object obj, jlz jlzVar, byte[] bArr, int i, int i2, int i3, jje jjeVar) {
        int i4 = jjeVar.e + 1;
        jjeVar.e = i4;
        u(i4);
        int c = ((jlo) jlzVar).c(obj, bArr, i, i2, i3, jjeVar);
        jjeVar.e--;
        jjeVar.c = obj;
        return c;
    }

    static int r(Object obj, jlz jlzVar, byte[] bArr, int i, int i2, jje jjeVar) {
        int f = f(bArr, i, i2, jjeVar);
        int i3 = jjeVar.a;
        int i4 = jjeVar.e + 1;
        jjeVar.e = i4;
        u(i4);
        int i5 = i3 + f;
        jlzVar.j(obj, bArr, f, i5, jjeVar);
        jjeVar.e--;
        jjeVar.c = obj;
        return i5;
    }

    static int s(int i, byte[] bArr, int i2, int i3, jje jjeVar) {
        if ((i >>> 3) == 0) {
            throw new jld("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return p(bArr, i2, jjeVar);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return f(bArr, i2, bArr.length, jjeVar) + jjeVar.a;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw new jld("Protocol message contained an invalid tag (zero).");
        }
        int i5 = (i & (-8)) | 4;
        int i6 = jjeVar.e + 1;
        jjeVar.e = i6;
        u(i6);
        int i7 = 0;
        while (i2 < i3) {
            i2 = m(bArr, i2, jjeVar);
            i7 = jjeVar.a;
            if (i7 == i5) {
                break;
            }
            i2 = s(i7, bArr, i2, i3, jjeVar);
        }
        jjeVar.e--;
        if (i2 > i3 || i7 != i5) {
            throw new jld("Failed to parse the message.");
        }
        return i2;
    }

    static long t(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    private static void u(int i) {
        if (i >= b) {
            throw new jld("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
