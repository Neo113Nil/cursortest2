package D4;

import D3.A;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final A f565a;

    /* renamed from: b, reason: collision with root package name */
    public static final A f566b;

    static {
        AtomicInteger atomicInteger = i.f530n;
        f565a = new A(1, false);
        f566b = new A(1, false);
    }

    public static int a(b bVar, V3.g gVar, i iVar) {
        F4.a aVar = F4.a.f742b;
        int b7 = iVar.b();
        int c7 = aVar.c(gVar, iVar);
        int b8 = d.b(c7) + bVar.f512c + c7;
        iVar.f533c[b7] = c7;
        return b8;
    }

    public static int b(b bVar, Object obj, Object obj2, o oVar, i iVar) {
        int b7 = iVar.b();
        int d7 = oVar.d(obj, obj2, iVar);
        int b8 = d.b(d7) + bVar.f512c + d7;
        iVar.f533c[b7] = d7;
        return b8;
    }

    public static int c(b bVar, List list, p pVar, i iVar) {
        if (list.isEmpty()) {
            return 0;
        }
        int i7 = bVar.f512c;
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            Object obj = list.get(i9);
            int b7 = iVar.b();
            int c7 = pVar.c(obj, iVar);
            iVar.f533c[b7] = c7;
            i8 += d.b(c7) + i7 + c7;
        }
        return i8;
    }

    public static int d(b bVar, String str, i iVar) {
        int length;
        int i7;
        int b7;
        if (str == null || str.isEmpty()) {
            return 0;
        }
        if (iVar.f531a) {
            if (iVar.f532b && v.f572d && u.b(v.f570b, str) == 0) {
                byte[] bArr = (byte[]) u.d(v.f569a, str);
                int length2 = str.length();
                int i8 = 0;
                int i9 = 0;
                for (int i10 = 1; i10 <= (bArr.length / 2040) + 1; i10++) {
                    int min = Math.min(i10 * 2040, bArr.length & (-8));
                    long j4 = 0;
                    while (i8 < min) {
                        j4 += (u.c(v.f571c + i8, bArr) & (-9187201950435737472L)) >>> 7;
                        i8 += 8;
                    }
                    if (j4 != 0) {
                        for (int i11 = 0; i11 < 8; i11++) {
                            i9 += (int) (255 & j4);
                            j4 >>>= 8;
                        }
                    }
                }
                while (i8 < bArr.length) {
                    i9 += bArr[i8] >>> 31;
                    i8++;
                }
                length = length2 + i9;
            } else {
                int length3 = str.length();
                int i12 = 0;
                while (i12 < length3 && str.charAt(i12) < 128) {
                    i12++;
                }
                int i13 = length3;
                while (true) {
                    if (i12 >= length3) {
                        break;
                    }
                    char charAt = str.charAt(i12);
                    if (charAt < 2048) {
                        i13 += (127 - charAt) >>> 31;
                        i12++;
                    } else {
                        int length4 = str.length();
                        int i14 = 0;
                        while (i12 < length4) {
                            char charAt2 = str.charAt(i12);
                            if (charAt2 < 2048) {
                                i14 += (127 - charAt2) >>> 31;
                            } else {
                                int i15 = i14 + 2;
                                if (Character.isSurrogate(charAt2)) {
                                    if (Character.codePointAt(str, i12) != charAt2) {
                                        i12++;
                                    }
                                }
                                i14 = i15;
                            }
                            i12++;
                        }
                        i13 += i14;
                    }
                }
                length = i13;
                if (length < length3) {
                    throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (length + 4294967296L));
                }
            }
            int i16 = iVar.f535e;
            int[] iArr = iVar.f533c;
            if (i16 == iArr.length) {
                int[] iArr2 = new int[iArr.length * 2];
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                iVar.f533c = iArr2;
            }
            int[] iArr3 = iVar.f533c;
            int i17 = iVar.f535e;
            iVar.f535e = i17 + 1;
            iArr3[i17] = length;
            if (length == 0) {
                return 0;
            }
            i7 = bVar.f512c;
            b7 = d.b(length);
        } else {
            byte[] f7 = j.f(str);
            iVar.a(f7);
            length = f7.length;
            if (length == 0) {
                return 0;
            }
            i7 = bVar.f512c;
            b7 = d.b(length);
        }
        return b7 + length + i7;
    }
}
