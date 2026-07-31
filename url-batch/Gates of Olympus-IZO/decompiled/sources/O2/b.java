package O2;

import B0.C0006c;
import H2.AbstractC0080b;
import L1.j;
import M1.B;
import M1.l;
import N2.C;
import N2.C0150f;
import N2.v;
import N2.z;
import Z1.i;
import Z1.p;
import Z1.s;
import Z1.t;
import e2.AbstractC0381e;
import h2.AbstractC0447i;
import h2.AbstractC0454p;
import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f2991a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final int a(char c3) {
        if ('0' <= c3 && c3 < ':') {
            return c3 - '0';
        }
        if ('a' <= c3 && c3 < 'g') {
            return c3 - 'W';
        }
        if ('A' <= c3 && c3 < 'G') {
            return c3 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c3);
    }

    public static final LinkedHashMap b(ArrayList arrayList) {
        String str = v.f2966e;
        v l3 = F0.a.l("/", false);
        j[] jVarArr = {new j(l3, new f(l3))};
        LinkedHashMap linkedHashMap = new LinkedHashMap(B.I(1));
        B.K(linkedHashMap, jVarArr);
        for (f fVar : l.y0(arrayList, new C0006c(1))) {
            if (((f) linkedHashMap.put(fVar.f3003a, fVar)) == null) {
                while (true) {
                    v vVar = fVar.f3003a;
                    v c3 = vVar.c();
                    if (c3 != null) {
                        f fVar2 = (f) linkedHashMap.get(c3);
                        if (fVar2 != null) {
                            fVar2.f3008f.add(vVar);
                            break;
                        }
                        f fVar3 = new f(c3);
                        linkedHashMap.put(c3, fVar3);
                        fVar3.f3008f.add(vVar);
                        fVar = fVar3;
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public static final String c(int i3) {
        AbstractC0381e.m(16);
        String num = Integer.toString(i3, 16);
        i.e(num, "toString(this, checkRadix(radix))");
        return "0x".concat(num);
    }

    public static final f d(z zVar) {
        Long valueOf;
        int i3;
        long j3;
        int k3 = zVar.k();
        if (k3 != 33639248) {
            throw new IOException("bad zip: expected " + c(33639248) + " but was " + c(k3));
        }
        zVar.D(4L);
        short p = zVar.p();
        int i4 = p & 65535;
        if ((p & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + c(i4));
        }
        int p3 = zVar.p() & 65535;
        short p4 = zVar.p();
        int i5 = p4 & 65535;
        short p5 = zVar.p();
        int i6 = p5 & 65535;
        if (i5 == -1) {
            valueOf = null;
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.set(14, 0);
            gregorianCalendar.set(((i6 >> 9) & 127) + 1980, ((i6 >> 5) & 15) - 1, p5 & 31, (i5 >> 11) & 31, (i5 >> 5) & 63, (p4 & 31) << 1);
            valueOf = Long.valueOf(gregorianCalendar.getTime().getTime());
        }
        Long l3 = valueOf;
        zVar.k();
        s sVar = new s();
        sVar.f3479d = zVar.k() & 4294967295L;
        s sVar2 = new s();
        sVar2.f3479d = zVar.k() & 4294967295L;
        int p6 = zVar.p() & 65535;
        int p7 = zVar.p() & 65535;
        int p8 = zVar.p() & 65535;
        zVar.D(8L);
        s sVar3 = new s();
        sVar3.f3479d = zVar.k() & 4294967295L;
        String r3 = zVar.r(p6);
        if (AbstractC0447i.k0(r3, (char) 0)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        if (sVar2.f3479d == 4294967295L) {
            j3 = 8;
            i3 = p3;
        } else {
            i3 = p3;
            j3 = 0;
        }
        if (sVar.f3479d == 4294967295L) {
            j3 += 8;
        }
        if (sVar3.f3479d == 4294967295L) {
            j3 += 8;
        }
        long j4 = j3;
        p pVar = new p();
        e(zVar, p7, new g(pVar, j4, sVar2, zVar, sVar, sVar3));
        if (j4 > 0 && !pVar.f3476d) {
            throw new IOException("bad zip: zip64 extra required but absent");
        }
        String r4 = zVar.r(p8);
        String str = v.f2966e;
        return new f(F0.a.l("/", false).e(r3), AbstractC0454p.c0(r3, "/", false), r4, sVar.f3479d, sVar2.f3479d, i3, l3, sVar3.f3479d);
    }

    public static final void e(z zVar, int i3, Y1.e eVar) {
        long j3 = i3;
        while (j3 != 0) {
            if (j3 < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int p = zVar.p() & 65535;
            long p3 = zVar.p() & 65535;
            long j4 = j3 - 4;
            if (j4 < p3) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            zVar.z(p3);
            C0150f c0150f = zVar.f2974e;
            long j5 = c0150f.f2929e;
            eVar.g(Integer.valueOf(p), Long.valueOf(p3));
            long j6 = (c0150f.f2929e + p3) - j5;
            if (j6 < 0) {
                throw new IOException(AbstractC0080b.h("unsupported zip: too many bytes processed for ", p));
            }
            if (j6 > 0) {
                c0150f.x(j6);
            }
            j3 = j4 - p3;
        }
    }

    public static final N2.l f(z zVar, N2.l lVar) {
        t tVar = new t();
        tVar.f3480d = lVar != null ? lVar.f2944e : null;
        t tVar2 = new t();
        t tVar3 = new t();
        int k3 = zVar.k();
        if (k3 != 67324752) {
            throw new IOException("bad zip: expected " + c(67324752) + " but was " + c(k3));
        }
        zVar.D(2L);
        short p = zVar.p();
        int i3 = p & 65535;
        if ((p & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + c(i3));
        }
        zVar.D(18L);
        int p3 = zVar.p() & 65535;
        zVar.D(zVar.p() & 65535);
        if (lVar == null) {
            zVar.D(p3);
            return null;
        }
        e(zVar, p3, new h(zVar, tVar, tVar2, tVar3));
        return new N2.l(lVar.f2940a, lVar.f2941b, lVar.f2942c, (Long) tVar3.f3480d, (Long) tVar.f3480d, (Long) tVar2.f3480d);
    }

    public static final int g(C c3, int i3) {
        int i4;
        i.f(c3, "<this>");
        int i5 = i3 + 1;
        int length = c3.f2902h.length;
        int[] iArr = c3.f2903i;
        i.f(iArr, "<this>");
        int i6 = length - 1;
        int i7 = 0;
        while (true) {
            if (i7 <= i6) {
                i4 = (i7 + i6) >>> 1;
                int i8 = iArr[i4];
                if (i8 >= i5) {
                    if (i8 <= i5) {
                        break;
                    }
                    i6 = i4 - 1;
                } else {
                    i7 = i4 + 1;
                }
            } else {
                i4 = (-i7) - 1;
                break;
            }
        }
        return i4 >= 0 ? i4 : ~i4;
    }
}
