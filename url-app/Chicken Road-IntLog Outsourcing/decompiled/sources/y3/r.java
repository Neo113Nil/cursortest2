package y3;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final K4.i f12431a;

    /* renamed from: b, reason: collision with root package name */
    public static final K4.i f12432b;

    static {
        AtomicInteger atomicInteger = g.f12395n;
        f12431a = new K4.i(2, false);
        f12432b = new K4.i(2, false);
    }

    public static int a(C1568b c1568b, Q2.g gVar, g gVar2) {
        A3.a aVar = A3.a.f39b;
        int b6 = gVar2.b();
        int a6 = aVar.a(gVar, gVar2);
        int b7 = C1569c.b(a6) + c1568b.f12384c + a6;
        gVar2.f12398c[b6] = a6;
        return b7;
    }

    public static int b(C1568b c1568b, Object obj, Object obj2, n nVar, g gVar) {
        int b6 = gVar.b();
        int d6 = nVar.d(obj, obj2, gVar);
        int b7 = C1569c.b(d6) + c1568b.f12384c + d6;
        gVar.f12398c[b6] = d6;
        return b7;
    }

    public static int c(C1568b c1568b, List list, o oVar, g gVar) {
        if (list.isEmpty()) {
            return 0;
        }
        int i2 = c1568b.f12384c;
        int i3 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            Object obj = list.get(i6);
            int b6 = gVar.b();
            int a6 = oVar.a(obj, gVar);
            gVar.f12398c[b6] = a6;
            i3 += C1569c.b(a6) + i2 + a6;
        }
        return i3;
    }

    public static int d(C1568b c1568b, String str, g gVar) {
        int i2;
        if (str == null || str.isEmpty()) {
            return 0;
        }
        if (!gVar.f12396a) {
            byte[] f3 = h.f(str);
            gVar.a(f3);
            int length = f3.length;
            if (length == 0) {
                return 0;
            }
            return C1569c.b(length) + length + c1568b.f12384c;
        }
        if (gVar.f12397b && u.f12438d && t.b(u.f12436b, str) == 0) {
            byte[] bArr = (byte[]) t.d(u.f12435a, str);
            int length2 = str.length();
            int i3 = 0;
            int i6 = 0;
            for (int i7 = 1; i7 <= (bArr.length / 2040) + 1; i7++) {
                int min = Math.min(i7 * 2040, bArr.length & (-8));
                long j2 = 0;
                while (i3 < min) {
                    j2 += (t.c(u.f12437c + i3, bArr) & (-9187201950435737472L)) >>> 7;
                    i3 += 8;
                }
                if (j2 != 0) {
                    for (int i8 = 0; i8 < 8; i8++) {
                        i6 += (int) (255 & j2);
                        j2 >>>= 8;
                    }
                }
            }
            while (i3 < bArr.length) {
                i6 += bArr[i3] >>> 31;
                i3++;
            }
            i2 = length2 + i6;
        } else {
            int length3 = str.length();
            int i9 = 0;
            while (i9 < length3 && str.charAt(i9) < 128) {
                i9++;
            }
            int i10 = length3;
            while (true) {
                if (i9 >= length3) {
                    break;
                }
                char charAt = str.charAt(i9);
                if (charAt < 2048) {
                    i10 += (127 - charAt) >>> 31;
                    i9++;
                } else {
                    int length4 = str.length();
                    int i11 = 0;
                    while (i9 < length4) {
                        char charAt2 = str.charAt(i9);
                        if (charAt2 < 2048) {
                            i11 += (127 - charAt2) >>> 31;
                        } else {
                            int i12 = i11 + 2;
                            if (Character.isSurrogate(charAt2)) {
                                if (Character.codePointAt(str, i9) != charAt2) {
                                    i9++;
                                }
                            }
                            i11 = i12;
                        }
                        i9++;
                    }
                    i10 += i11;
                }
            }
            i2 = i10;
            if (i2 < length3) {
                throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i2 + 4294967296L));
            }
        }
        int i13 = gVar.f12400e;
        int[] iArr = gVar.f12398c;
        if (i13 == iArr.length) {
            int[] iArr2 = new int[iArr.length * 2];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            gVar.f12398c = iArr2;
        }
        int[] iArr3 = gVar.f12398c;
        int i14 = gVar.f12400e;
        gVar.f12400e = i14 + 1;
        iArr3[i14] = i2;
        if (i2 == 0) {
            return 0;
        }
        return C1569c.b(i2) + i2 + c1568b.f12384c;
    }
}
