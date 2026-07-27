package A3;

import A.AbstractC0017m;
import M2.A;
import M2.D;
import M2.E;
import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.u;
import kotlin.text.y;
import z2.C1403G;
import z2.C1412P;
import z3.C;
import z3.C1448f;
import z3.l;
import z3.v;
import z3.z;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f843a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

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
        String str = v.f12037e;
        v i2 = E1.i.i("/", false);
        LinkedHashMap f4 = C1412P.f(new Pair(i2, new h(i2)));
        for (h hVar : C1403G.D(arrayList, new i(0))) {
            if (((h) f4.put(hVar.f858a, hVar)) == null) {
                while (true) {
                    v vVar = hVar.f858a;
                    v e4 = vVar.e();
                    if (e4 != null) {
                        h hVar2 = (h) f4.get(e4);
                        if (hVar2 != null) {
                            hVar2.f863f.add(vVar);
                            break;
                        }
                        h hVar3 = new h(e4);
                        f4.put(e4, hVar3);
                        hVar3.f863f.add(vVar);
                        hVar = hVar3;
                    }
                }
            }
        }
        return f4;
    }

    public static final String c(int i2) {
        StringBuilder sb = new StringBuilder("0x");
        String num = Integer.toString(i2, CharsKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(num, "toString(this, checkRadix(radix))");
        sb.append(num);
        return sb.toString();
    }

    public static final h d(z zVar) {
        Long valueOf;
        int i2;
        long j4;
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        int i4 = zVar.i();
        if (i4 != 33639248) {
            throw new IOException("bad zip: expected " + c(33639248) + " but was " + c(i4));
        }
        zVar.u(4L);
        short n2 = zVar.n();
        int i5 = n2 & 65535;
        if ((n2 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + c(i5));
        }
        int n4 = zVar.n() & 65535;
        short n5 = zVar.n();
        int i6 = n5 & 65535;
        short n6 = zVar.n();
        int i7 = n6 & 65535;
        if (i6 == -1) {
            valueOf = null;
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.set(14, 0);
            gregorianCalendar.set(((i7 >> 9) & 127) + 1980, ((i7 >> 5) & 15) - 1, n6 & 31, (i6 >> 11) & 31, (i6 >> 5) & 63, (n5 & 31) << 1);
            valueOf = Long.valueOf(gregorianCalendar.getTime().getTime());
        }
        Long l4 = valueOf;
        zVar.i();
        D d4 = new D();
        d4.f3579d = zVar.i() & 4294967295L;
        D d5 = new D();
        d5.f3579d = zVar.i() & 4294967295L;
        int n7 = zVar.n() & 65535;
        int n8 = zVar.n() & 65535;
        int n9 = zVar.n() & 65535;
        zVar.u(8L);
        D d6 = new D();
        d6.f3579d = zVar.i() & 4294967295L;
        String p4 = zVar.p(n7);
        if (y.o(p4, (char) 0)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        if (d5.f3579d == 4294967295L) {
            j4 = 8;
            i2 = n4;
        } else {
            i2 = n4;
            j4 = 0;
        }
        if (d4.f3579d == 4294967295L) {
            j4 += 8;
        }
        if (d6.f3579d == 4294967295L) {
            j4 += 8;
        }
        long j5 = j4;
        A a4 = new A();
        e(zVar, n8, new j(a4, j5, d5, zVar, d4, d6));
        if (j5 > 0 && !a4.f3576d) {
            throw new IOException("bad zip: zip64 extra required but absent");
        }
        String p5 = zVar.p(n9);
        String str = v.f12037e;
        return new h(E1.i.i("/", false).j(p4), u.h(false, p4, "/"), p5, d4.f3579d, d5.f3579d, i2, l4, d6.f3579d);
    }

    public static final void e(z zVar, int i2, Function2 function2) {
        long j4 = i2;
        while (j4 != 0) {
            if (j4 < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int n2 = zVar.n() & 65535;
            long n4 = zVar.n() & 65535;
            long j5 = j4 - 4;
            if (j5 < n4) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            zVar.t(n4);
            C1448f c1448f = zVar.f12045e;
            long j6 = c1448f.f11999e;
            function2.h(Integer.valueOf(n2), Long.valueOf(n4));
            long j7 = (c1448f.f11999e + n4) - j6;
            if (j7 < 0) {
                throw new IOException(AbstractC0017m.g(n2, "unsupported zip: too many bytes processed for "));
            }
            if (j7 > 0) {
                c1448f.s(j7);
            }
            j4 = j5 - n4;
        }
    }

    public static final l f(z zVar, l lVar) {
        E e4 = new E();
        e4.f3580d = lVar != null ? lVar.f12014e : null;
        E e5 = new E();
        E e6 = new E();
        int i2 = zVar.i();
        if (i2 != 67324752) {
            throw new IOException("bad zip: expected " + c(67324752) + " but was " + c(i2));
        }
        zVar.u(2L);
        short n2 = zVar.n();
        int i4 = n2 & 65535;
        if ((n2 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + c(i4));
        }
        zVar.u(18L);
        int n4 = zVar.n() & 65535;
        zVar.u(zVar.n() & 65535);
        if (lVar == null) {
            zVar.u(n4);
            return null;
        }
        e(zVar, n4, new k(zVar, e4, e5, e6));
        return new l(lVar.f12010a, lVar.f12011b, lVar.f12012c, (Long) e6.f3580d, (Long) e4.f3580d, (Long) e5.f3580d);
    }

    public static final int g(C c4, int i2) {
        int i4;
        Intrinsics.checkNotNullParameter(c4, "<this>");
        int[] iArr = c4.f11973l;
        int i5 = i2 + 1;
        int length = c4.f11972k.length;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
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
