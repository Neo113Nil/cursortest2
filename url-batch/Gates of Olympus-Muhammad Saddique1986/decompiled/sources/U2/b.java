package U2;

import A.k;
import A1.i;
import S1.B;
import S1.l;
import T2.C;
import T2.C0231f;
import T2.v;
import T2.z;
import e2.InterfaceC0426e;
import f2.j;
import f2.q;
import f2.t;
import f2.u;
import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import n.r;
import n2.AbstractC0730j;
import n2.AbstractC0737q;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f4516a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final int a(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' <= c2 && c2 < 'G') {
            return c2 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c2);
    }

    public static final LinkedHashMap b(ArrayList arrayList) {
        String str = v.f4446e;
        v l3 = i.l("/", false);
        R1.i[] iVarArr = {new R1.i(l3, new f(l3))};
        LinkedHashMap linkedHashMap = new LinkedHashMap(B.J(1));
        B.K(linkedHashMap, iVarArr);
        for (f fVar : l.W0(arrayList, new K1.d(1))) {
            if (((f) linkedHashMap.put(fVar.f4528a, fVar)) == null) {
                while (true) {
                    v vVar = fVar.f4528a;
                    v c2 = vVar.c();
                    if (c2 != null) {
                        f fVar2 = (f) linkedHashMap.get(c2);
                        if (fVar2 != null) {
                            fVar2.f4533f.add(vVar);
                            break;
                        }
                        f fVar3 = new f(c2);
                        linkedHashMap.put(c2, fVar3);
                        fVar3.f4533f.add(vVar);
                        fVar = fVar3;
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public static final String c(int i3) {
        r.i(16);
        String num = Integer.toString(i3, 16);
        j.e(num, "toString(this, checkRadix(radix))");
        return "0x".concat(num);
    }

    public static final f d(z zVar) {
        Long valueOf;
        int i3;
        long j3;
        int l3 = zVar.l();
        if (l3 != 33639248) {
            throw new IOException("bad zip: expected " + c(33639248) + " but was " + c(l3));
        }
        zVar.x(4L);
        short r3 = zVar.r();
        int i4 = r3 & 65535;
        if ((r3 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + c(i4));
        }
        int r4 = zVar.r() & 65535;
        short r5 = zVar.r();
        int i5 = r5 & 65535;
        short r6 = zVar.r();
        int i6 = r6 & 65535;
        if (i5 == -1) {
            valueOf = null;
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.set(14, 0);
            gregorianCalendar.set(((i6 >> 9) & 127) + 1980, ((i6 >> 5) & 15) - 1, r6 & 31, (i5 >> 11) & 31, (i5 >> 5) & 63, (r5 & 31) << 1);
            valueOf = Long.valueOf(gregorianCalendar.getTime().getTime());
        }
        Long l4 = valueOf;
        zVar.l();
        t tVar = new t();
        tVar.f5831d = zVar.l() & 4294967295L;
        t tVar2 = new t();
        tVar2.f5831d = zVar.l() & 4294967295L;
        int r7 = zVar.r() & 65535;
        int r8 = zVar.r() & 65535;
        int r9 = zVar.r() & 65535;
        zVar.x(8L);
        t tVar3 = new t();
        tVar3.f5831d = zVar.l() & 4294967295L;
        String s3 = zVar.s(r7);
        if (AbstractC0730j.B(s3, (char) 0)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        if (tVar2.f5831d == 4294967295L) {
            j3 = 8;
            i3 = r4;
        } else {
            i3 = r4;
            j3 = 0;
        }
        if (tVar.f5831d == 4294967295L) {
            j3 += 8;
        }
        if (tVar3.f5831d == 4294967295L) {
            j3 += 8;
        }
        long j4 = j3;
        q qVar = new q();
        e(zVar, r8, new g(qVar, j4, tVar2, zVar, tVar, tVar3));
        if (j4 > 0 && !qVar.f5828d) {
            throw new IOException("bad zip: zip64 extra required but absent");
        }
        String s4 = zVar.s(r9);
        String str = v.f4446e;
        return new f(i.l("/", false).e(s3), AbstractC0737q.r(s3, "/", false), s4, tVar.f5831d, tVar2.f5831d, i3, l4, tVar3.f5831d);
    }

    public static final void e(z zVar, int i3, InterfaceC0426e interfaceC0426e) {
        long j3 = i3;
        while (j3 != 0) {
            if (j3 < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int r3 = zVar.r() & 65535;
            long r4 = zVar.r() & 65535;
            long j4 = j3 - 4;
            if (j4 < r4) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            zVar.w(r4);
            C0231f c0231f = zVar.f4454e;
            long j5 = c0231f.f4409e;
            interfaceC0426e.h(Integer.valueOf(r3), Long.valueOf(r4));
            long j6 = (c0231f.f4409e + r4) - j5;
            if (j6 < 0) {
                throw new IOException(k.h("unsupported zip: too many bytes processed for ", r3));
            }
            if (j6 > 0) {
                c0231f.v(j6);
            }
            j3 = j4 - r4;
        }
    }

    public static final T2.l f(z zVar, T2.l lVar) {
        u uVar = new u();
        uVar.f5832d = lVar != null ? lVar.f4424e : null;
        u uVar2 = new u();
        u uVar3 = new u();
        int l3 = zVar.l();
        if (l3 != 67324752) {
            throw new IOException("bad zip: expected " + c(67324752) + " but was " + c(l3));
        }
        zVar.x(2L);
        short r3 = zVar.r();
        int i3 = r3 & 65535;
        if ((r3 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + c(i3));
        }
        zVar.x(18L);
        int r4 = zVar.r() & 65535;
        zVar.x(zVar.r() & 65535);
        if (lVar == null) {
            zVar.x(r4);
            return null;
        }
        e(zVar, r4, new h(zVar, uVar, uVar2, uVar3));
        return new T2.l(lVar.f4420a, lVar.f4421b, lVar.f4422c, (Long) uVar3.f5832d, (Long) uVar.f5832d, (Long) uVar2.f5832d);
    }

    public static final int g(C c2, int i3) {
        int i4;
        j.f(c2, "<this>");
        int i5 = i3 + 1;
        int length = c2.f4382h.length;
        int[] iArr = c2.f4383i;
        j.f(iArr, "<this>");
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
