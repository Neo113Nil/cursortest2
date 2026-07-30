package g8;

import a0.m;
import e6.c0;
import e6.d0;
import e6.l;
import f8.a0;
import f8.w;
import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import r6.k;
import r6.r;
import r6.u;
import r6.v;
import z6.o;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f4537a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final int a(char c4) {
        if ('0' <= c4 && c4 < ':') {
            return c4 - '0';
        }
        if ('a' <= c4 && c4 < 'g') {
            return c4 - 'W';
        }
        if ('A' <= c4 && c4 < 'G') {
            return c4 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c4);
    }

    public static final LinkedHashMap b(ArrayList arrayList) {
        String str = w.f3645g;
        w m8 = j4.i.m("/", false);
        d6.j[] jVarArr = {new d6.j(m8, new g(m8))};
        LinkedHashMap linkedHashMap = new LinkedHashMap(d0.h0(1));
        c0.j0(linkedHashMap, jVarArr);
        for (g gVar : l.t0(arrayList, new h(0))) {
            if (((g) linkedHashMap.put(gVar.f4552a, gVar)) == null) {
                while (true) {
                    w wVar = gVar.f4552a;
                    w g9 = wVar.g();
                    if (g9 != null) {
                        g gVar2 = (g) linkedHashMap.get(g9);
                        if (gVar2 != null) {
                            gVar2.f4559h.add(wVar);
                            break;
                        }
                        g gVar3 = new g(g9);
                        linkedHashMap.put(g9, gVar3);
                        gVar3.f4559h.add(wVar);
                        gVar = gVar3;
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public static final String c(int i7) {
        v1.g.b(16);
        String num = Integer.toString(i7, 16);
        k.e(num, "toString(this, checkRadix(radix))");
        return "0x".concat(num);
    }

    public static final g d(a0 a0Var) {
        Long valueOf;
        int k8 = a0Var.k();
        if (k8 != 33639248) {
            throw new IOException("bad zip: expected " + c(33639248) + " but was " + c(k8));
        }
        a0Var.skip(4L);
        short t2 = a0Var.t();
        int i7 = t2 & 65535;
        if ((t2 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + c(i7));
        }
        int t8 = a0Var.t() & 65535;
        short t9 = a0Var.t();
        int i8 = t9 & 65535;
        short t10 = a0Var.t();
        int i9 = t10 & 65535;
        if (i8 == -1) {
            valueOf = null;
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.set(14, 0);
            gregorianCalendar.set(((i9 >> 9) & 127) + 1980, ((i9 >> 5) & 15) - 1, t10 & 31, (i8 >> 11) & 31, (i8 >> 5) & 63, (t9 & 31) << 1);
            valueOf = Long.valueOf(gregorianCalendar.getTime().getTime());
        }
        Long l8 = valueOf;
        a0Var.k();
        u uVar = new u();
        uVar.f7967f = a0Var.k() & 4294967295L;
        u uVar2 = new u();
        uVar2.f7967f = a0Var.k() & 4294967295L;
        int t11 = a0Var.t() & 65535;
        int t12 = a0Var.t() & 65535;
        int t13 = a0Var.t() & 65535;
        a0Var.skip(8L);
        u uVar3 = new u();
        uVar3.f7967f = a0Var.k() & 4294967295L;
        String u8 = a0Var.u(t11);
        if (z6.h.x(u8, (char) 0)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        long j8 = uVar2.f7967f == 4294967295L ? 8 : 0L;
        if (uVar.f7967f == 4294967295L) {
            j8 += 8;
        }
        if (uVar3.f7967f == 4294967295L) {
            j8 += 8;
        }
        r rVar = new r();
        e(a0Var, t12, new i(rVar, j8, uVar2, a0Var, uVar, uVar3));
        if (j8 > 0 && !rVar.f7964f) {
            throw new IOException("bad zip: zip64 extra required but absent");
        }
        String u9 = a0Var.u(t13);
        String str = w.f3645g;
        return new g(j4.i.m("/", false).l(u8), o.o(false, u8, "/"), u9, uVar.f7967f, uVar2.f7967f, t8, l8, uVar3.f7967f);
    }

    public static final void e(a0 a0Var, int i7, q6.e eVar) {
        f8.f fVar = a0Var.f3569g;
        long j8 = i7;
        while (j8 != 0) {
            if (j8 < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int t2 = a0Var.t() & 65535;
            long t8 = a0Var.t() & 65535;
            long j9 = j8 - 4;
            if (j9 < t8) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            a0Var.J(t8);
            long j10 = fVar.f3598g;
            eVar.d(Integer.valueOf(t2), Long.valueOf(t8));
            long j11 = (fVar.f3598g + t8) - j10;
            if (j11 < 0) {
                throw new IOException(m.i("unsupported zip: too many bytes processed for ", t2));
            }
            if (j11 > 0) {
                fVar.skip(j11);
            }
            j8 = j9 - t8;
        }
    }

    public static final f8.l f(a0 a0Var, f8.l lVar) {
        v vVar = new v();
        vVar.f7968f = lVar != null ? lVar.f3622e : null;
        v vVar2 = new v();
        v vVar3 = new v();
        int k8 = a0Var.k();
        if (k8 != 67324752) {
            throw new IOException("bad zip: expected " + c(67324752) + " but was " + c(k8));
        }
        a0Var.skip(2L);
        short t2 = a0Var.t();
        int i7 = t2 & 65535;
        if ((t2 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + c(i7));
        }
        a0Var.skip(18L);
        int t8 = a0Var.t() & 65535;
        a0Var.skip(a0Var.t() & 65535);
        if (lVar == null) {
            a0Var.skip(t8);
            return null;
        }
        e(a0Var, t8, new j(a0Var, vVar, vVar2, vVar3));
        return new f8.l(lVar.f3618a, lVar.f3619b, lVar.f3620c, (Long) vVar3.f7968f, (Long) vVar.f7968f, (Long) vVar2.f7968f);
    }

    public static final int g(f8.d0 d0Var, int i7) {
        int i8;
        int[] iArr = d0Var.f3588k;
        int i9 = i7 + 1;
        int length = d0Var.f3587j.length;
        k.f(iArr, "<this>");
        int i10 = length - 1;
        int i11 = 0;
        while (true) {
            if (i11 <= i10) {
                i8 = (i11 + i10) >>> 1;
                int i12 = iArr[i8];
                if (i12 >= i9) {
                    if (i12 <= i9) {
                        break;
                    }
                    i10 = i8 - 1;
                } else {
                    i11 = i8 + 1;
                }
            } else {
                i8 = (-i11) - 1;
                break;
            }
        }
        return i8 >= 0 ? i8 : ~i8;
    }
}
