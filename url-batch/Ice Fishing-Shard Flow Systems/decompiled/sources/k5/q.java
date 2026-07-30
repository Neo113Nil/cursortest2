package k5;

import h4.v;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import m5.C0691a;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final v f6103a;

    /* renamed from: b, reason: collision with root package name */
    public static final v f6104b;

    static {
        AtomicInteger atomicInteger = g.f6069n;
        f6103a = new v(1);
        f6104b = new v(1);
    }

    public static int a(C0602b c0602b, C4.j jVar, g gVar) {
        C0691a c0691a = C0691a.f6542b;
        int b7 = gVar.b();
        int a7 = c0691a.a(jVar, gVar);
        int b8 = C0603c.b(a7) + c0602b.f6058c + a7;
        gVar.f6072c[b7] = a7;
        return b8;
    }

    public static int b(C0602b c0602b, Object obj, Object obj2, m mVar, g gVar) {
        int b7 = gVar.b();
        int d7 = mVar.d(obj, obj2, gVar);
        int b8 = C0603c.b(d7) + c0602b.f6058c + d7;
        gVar.f6072c[b7] = d7;
        return b8;
    }

    public static int c(C0602b c0602b, List list, n nVar, g gVar) {
        if (list.isEmpty()) {
            return 0;
        }
        int i2 = c0602b.f6058c;
        int i5 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            Object obj = list.get(i7);
            int b7 = gVar.b();
            int a7 = nVar.a(obj, gVar);
            gVar.f6072c[b7] = a7;
            i5 += C0603c.b(a7) + i2 + a7;
        }
        return i5;
    }

    public static int d(C0602b c0602b, String str, g gVar) {
        int length;
        int i2;
        int b7;
        if (str == null || str.isEmpty()) {
            return 0;
        }
        if (gVar.f6070a) {
            if (gVar.f6071b && t.f6110d && s.b(str, t.f6108b) == 0) {
                byte[] bArr = (byte[]) s.d(str, t.f6107a);
                int length2 = str.length();
                int i5 = 0;
                int i7 = 0;
                for (int i8 = 1; i8 <= (bArr.length / 2040) + 1; i8++) {
                    int min = Math.min(i8 * 2040, bArr.length & (-8));
                    long j = 0;
                    while (i5 < min) {
                        j += (s.c(t.f6109c + i5, bArr) & (-9187201950435737472L)) >>> 7;
                        i5 += 8;
                    }
                    if (j != 0) {
                        for (int i9 = 0; i9 < 8; i9++) {
                            i7 += (int) (255 & j);
                            j >>>= 8;
                        }
                    }
                }
                while (i5 < bArr.length) {
                    i7 += bArr[i5] >>> 31;
                    i5++;
                }
                length = length2 + i7;
            } else {
                int length3 = str.length();
                int i10 = 0;
                while (i10 < length3 && str.charAt(i10) < 128) {
                    i10++;
                }
                int i11 = length3;
                while (true) {
                    if (i10 >= length3) {
                        break;
                    }
                    char charAt = str.charAt(i10);
                    if (charAt < 2048) {
                        i11 += (127 - charAt) >>> 31;
                        i10++;
                    } else {
                        int length4 = str.length();
                        int i12 = 0;
                        while (i10 < length4) {
                            char charAt2 = str.charAt(i10);
                            if (charAt2 < 2048) {
                                i12 += (127 - charAt2) >>> 31;
                            } else {
                                int i13 = i12 + 2;
                                if (Character.isSurrogate(charAt2)) {
                                    if (Character.codePointAt(str, i10) != charAt2) {
                                        i10++;
                                    }
                                }
                                i12 = i13;
                            }
                            i10++;
                        }
                        i11 += i12;
                    }
                }
                length = i11;
                if (length < length3) {
                    throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (length + 4294967296L));
                }
            }
            int i14 = gVar.f6074e;
            int[] iArr = gVar.f6072c;
            if (i14 == iArr.length) {
                int[] iArr2 = new int[iArr.length * 2];
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                gVar.f6072c = iArr2;
            }
            int[] iArr3 = gVar.f6072c;
            int i15 = gVar.f6074e;
            gVar.f6074e = i15 + 1;
            iArr3[i15] = length;
            if (length == 0) {
                return 0;
            }
            i2 = c0602b.f6058c;
            b7 = C0603c.b(length);
        } else {
            byte[] f7 = h.f(str);
            gVar.a(f7);
            length = f7.length;
            if (length == 0) {
                return 0;
            }
            i2 = c0602b.f6058c;
            b7 = C0603c.b(length);
        }
        return b7 + length + i2;
    }
}
