package n;

import F.C0087c;
import F.C0097h;
import I.AbstractC0168p0;
import I.C0143d;
import I.C0159l;
import I.C0167p;
import I.C0173s0;
import I.InterfaceC0142c0;
import a0.C0238c;
import a0.C0239d;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.util.Log;
import e2.InterfaceC0422a;
import e2.InterfaceC0426e;
import h2.AbstractC0508a;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import k2.C0571c;
import k2.C0572d;
import n2.AbstractC0730j;
import n2.AbstractC0737q;
import o2.AbstractC0747b;
import o2.C0746a;
import o2.EnumC0748c;
import q.C0810f;
import r0.InterfaceC0919p;
import s0.C0962h;
import t1.C1013A;
import t1.C1020H;
import t1.InterfaceC1018F;
import u0.O0;
import z.C1256t;

/* loaded from: classes.dex */
public abstract class t0 {
    public static final void a(Q.a aVar, C0167p c0167p, int i3) {
        int i4;
        c0167p.S(674185128);
        int i5 = 6;
        if ((i3 & 6) == 0) {
            i4 = (c0167p.h(aVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i4 & 3) == 2 && c0167p.x()) {
            c0167p.L();
        } else {
            AbstractC0168p0 abstractC0168p0 = R.m.f4036a;
            R.k kVar = (R.k) c0167p.k(abstractC0168p0);
            Object[] objArr = {kVar};
            t.H h3 = t.H.f8441e;
            t.G g3 = new t.G(kVar, 1);
            C1256t c1256t = R.o.f4037a;
            C1256t c1256t2 = new C1256t(h3, i5, g3);
            boolean h4 = c0167p.h(kVar);
            Object G3 = c0167p.G();
            if (h4 || G3 == C0159l.f2829a) {
                G3 = new A.h(29, kVar);
                c0167p.a0(G3);
            }
            Object obj = (t.I) O2.d.c0(objArr, c1256t2, (InterfaceC0422a) G3, c0167p, 0, 4);
            C0143d.a(abstractC0168p0.a(obj), Q.f.b(1863926504, new C0087c(obj, 11, aVar), c0167p), c0167p, 56);
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new C0097h(aVar, i3, 1);
        }
    }

    public static final C1013A b(Context context) {
        f2.j.f(context, "context");
        C1013A c1013a = new C1013A(context);
        C1020H c1020h = c1013a.f8827v;
        c1020h.a(new u1.g(c1020h));
        c1013a.f8827v.a(new u1.i());
        c1013a.f8827v.a(new u1.p());
        return c1013a;
    }

    public static final long c(x.Q q3, C0239d c0239d, C0239d c0239d2, int i3) {
        long n3 = n(q3, c0239d, i3);
        if (C0.J.b(n3)) {
            return C0.J.f567b;
        }
        long n4 = n(q3, c0239d2, i3);
        if (C0.J.b(n4)) {
            return C0.J.f567b;
        }
        int i4 = (int) (n3 >> 32);
        int i5 = (int) (n4 & 4294967295L);
        return O2.l.J(Math.min(i4, i4), Math.max(i5, i5));
    }

    public static final boolean d(C0.H h3, int i3) {
        int e3 = h3.e(i3);
        if (i3 == h3.h(e3) || i3 == h3.d(e3, false)) {
            if (h3.i(i3) == h3.a(i3)) {
                return false;
            }
        } else if (h3.a(i3) == h3.a(i3 - 1)) {
            return false;
        }
        return true;
    }

    public static final long e(String str) {
        EnumC0748c enumC0748c;
        long i3;
        char charAt;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        int i4 = C0746a.f7442g;
        char charAt2 = str.charAt(0);
        int i5 = (charAt2 == '+' || charAt2 == '-') ? 1 : 0;
        boolean z3 = i5 > 0 && str.length() > 0 && r.j(str.charAt(0), '-', false);
        if (length <= i5) {
            throw new IllegalArgumentException("No components");
        }
        if (str.charAt(i5) != 'P') {
            throw new IllegalArgumentException();
        }
        int i6 = i5 + 1;
        if (i6 == length) {
            throw new IllegalArgumentException();
        }
        EnumC0748c enumC0748c2 = null;
        long j3 = 0;
        boolean z4 = false;
        while (i6 < length) {
            if (str.charAt(i6) != 'T') {
                int i7 = i6;
                while (i7 < str.length() && (('0' <= (charAt = str.charAt(i7)) && charAt < ':') || AbstractC0730j.B("+-.", charAt))) {
                    i7++;
                }
                String substring = str.substring(i6, i7);
                f2.j.e(substring, "substring(...)");
                if (substring.length() == 0) {
                    throw new IllegalArgumentException();
                }
                int length2 = substring.length() + i6;
                if (length2 < 0 || length2 >= str.length()) {
                    throw new IllegalArgumentException("Missing unit for value ".concat(substring));
                }
                char charAt3 = str.charAt(length2);
                int i8 = length2 + 1;
                if (z4) {
                    if (charAt3 == 'H') {
                        enumC0748c = EnumC0748c.HOURS;
                    } else if (charAt3 == 'M') {
                        enumC0748c = EnumC0748c.MINUTES;
                    } else {
                        if (charAt3 != 'S') {
                            throw new IllegalArgumentException("Invalid duration ISO time unit: " + charAt3);
                        }
                        enumC0748c = EnumC0748c.SECONDS;
                    }
                } else {
                    if (charAt3 != 'D') {
                        throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + charAt3);
                    }
                    enumC0748c = EnumC0748c.DAYS;
                }
                if (enumC0748c2 != null && enumC0748c2.compareTo(enumC0748c) <= 0) {
                    throw new IllegalArgumentException("Unexpected order of duration components");
                }
                int H3 = AbstractC0730j.H(substring, '.', 0, false, 6);
                if (enumC0748c != EnumC0748c.SECONDS || H3 <= 0) {
                    j3 = C0746a.d(j3, u(r(substring), enumC0748c));
                } else {
                    String substring2 = substring.substring(0, H3);
                    f2.j.e(substring2, "substring(...)");
                    long d3 = C0746a.d(j3, u(r(substring2), enumC0748c));
                    String substring3 = substring.substring(H3);
                    f2.j.e(substring3, "substring(...)");
                    double parseDouble = Double.parseDouble(substring3);
                    double h3 = z0.h(parseDouble, enumC0748c, EnumC0748c.NANOSECONDS);
                    if (Double.isNaN(h3)) {
                        throw new IllegalArgumentException("Duration value cannot be NaN.");
                    }
                    long R2 = AbstractC0508a.R(h3);
                    if (-4611686018426999999L > R2 || R2 >= 4611686018427000000L) {
                        i3 = i(AbstractC0508a.R(z0.h(parseDouble, enumC0748c, EnumC0748c.MILLISECONDS)));
                    } else {
                        i3 = R2 << 1;
                        int i9 = C0746a.f7442g;
                        int i10 = AbstractC0747b.f7444a;
                    }
                    j3 = C0746a.d(d3, i3);
                }
                enumC0748c2 = enumC0748c;
                i6 = i8;
            } else {
                if (z4 || (i6 = i6 + 1) == length) {
                    throw new IllegalArgumentException();
                }
                z4 = true;
            }
        }
        if (!z3) {
            return j3;
        }
        long j4 = ((-(j3 >> 1)) << 1) + (((int) j3) & 1);
        int i11 = AbstractC0747b.f7444a;
        return j4;
    }

    public static final InterfaceC0142c0 f(q.j jVar, C0167p c0167p, int i3) {
        Object G3 = c0167p.G();
        I.W w2 = C0159l.f2829a;
        if (G3 == w2) {
            G3 = C0143d.K(Boolean.FALSE, I.W.f2783i);
            c0167p.a0(G3);
        }
        InterfaceC0142c0 interfaceC0142c0 = (InterfaceC0142c0) G3;
        boolean z3 = (((i3 & 14) ^ 6) > 4 && c0167p.f(jVar)) || (i3 & 6) == 4;
        Object G4 = c0167p.G();
        if (z3 || G4 == w2) {
            G4 = new C0810f(jVar, interfaceC0142c0, null);
            c0167p.a0(G4);
        }
        C0143d.e(c0167p, (InterfaceC0426e) G4, jVar);
        return interfaceC0142c0;
    }

    public static final long h(long j3) {
        long j4 = (j3 << 1) + 1;
        int i3 = C0746a.f7442g;
        int i4 = AbstractC0747b.f7444a;
        return j4;
    }

    public static final long i(long j3) {
        if (-4611686018426L > j3 || j3 >= 4611686018427L) {
            return h(O2.d.z(j3, -4611686018427387903L, 4611686018427387903L));
        }
        long j4 = (j3 * 1000000) << 1;
        int i3 = C0746a.f7442g;
        int i4 = AbstractC0747b.f7444a;
        return j4;
    }

    public static final int k(Cursor cursor, String str) {
        String str2;
        f2.j.f(cursor, "c");
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex < 0) {
            columnIndex = cursor.getColumnIndex("`" + str + '`');
            if (columnIndex < 0) {
                int i3 = -1;
                if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
                    String[] columnNames = cursor.getColumnNames();
                    f2.j.e(columnNames, "columnNames");
                    String concat = ".".concat(str);
                    String str3 = "." + str + '`';
                    int length = columnNames.length;
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < length) {
                        String str4 = columnNames[i4];
                        int i6 = i5 + 1;
                        if (str4.length() >= str.length() + 2 && (AbstractC0737q.r(str4, concat, false) || (str4.charAt(0) == '`' && AbstractC0737q.r(str4, str3, false)))) {
                            i3 = i5;
                            break;
                        }
                        i4++;
                        i5 = i6;
                    }
                }
                columnIndex = i3;
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames2 = cursor.getColumnNames();
            f2.j.e(columnNames2, "c.columnNames");
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) "");
            int i7 = 0;
            for (String str5 : columnNames2) {
                i7++;
                if (i7 > 1) {
                    sb.append((CharSequence) ", ");
                }
                T.h(sb, str5, null);
            }
            sb.append((CharSequence) "");
            str2 = sb.toString();
            f2.j.e(str2, "toString(...)");
        } catch (Exception e3) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e3);
            str2 = "unknown";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + str2);
    }

    public static final int l(C0.o oVar, long j3, O0 o02) {
        float c2 = o02 != null ? o02.c() : 0.0f;
        int c3 = oVar.c(C0238c.e(j3));
        if (C0238c.e(j3) < oVar.d(c3) - c2 || C0238c.e(j3) > oVar.b(c3) + c2 || C0238c.d(j3) < (-c2) || C0238c.d(j3) > oVar.f621d + c2) {
            return -1;
        }
        return c3;
    }

    public static String m(Class cls) {
        LinkedHashMap linkedHashMap = C1020H.f8853b;
        String str = (String) linkedHashMap.get(cls);
        if (str == null) {
            InterfaceC1018F interfaceC1018F = (InterfaceC1018F) cls.getAnnotation(InterfaceC1018F.class);
            str = interfaceC1018F != null ? interfaceC1018F.value() : null;
            if (str == null || str.length() <= 0) {
                throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()).toString());
            }
            linkedHashMap.put(cls, str);
        }
        f2.j.c(str);
        return str;
    }

    public static final long n(x.Q q3, C0239d c0239d, int i3) {
        x.p0 d3 = q3.d();
        C0.o oVar = d3 != null ? d3.f10230a.f558b : null;
        InterfaceC0919p c2 = q3.c();
        return (oVar == null || c2 == null) ? C0.J.f567b : oVar.f(c0239d.h(c2.n(0L)), i3, C0.F.f546b);
    }

    public static final boolean o(int i3) {
        int type = Character.getType(i3);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final boolean p(int i3) {
        return Character.isWhitespace(i3) || i3 == 160;
    }

    public static final boolean q(int i3) {
        int type;
        return (!p(i3) || (type = Character.getType(i3)) == 14 || type == 13 || i3 == 10) ? false : true;
    }

    public static final long r(String str) {
        int length = str.length();
        int i3 = (length <= 0 || !AbstractC0730j.B("+-", str.charAt(0))) ? 0 : 1;
        if (length - i3 > 16) {
            Iterable c0572d = new C0572d(i3, AbstractC0730j.F(str), 1);
            if (!(c0572d instanceof Collection) || !((Collection) c0572d).isEmpty()) {
                Iterator it = c0572d.iterator();
                while (((C0571c) it).f6424f) {
                    char charAt = str.charAt(((S1.A) it).a());
                    if ('0' <= charAt && charAt < ':') {
                    }
                }
            }
            return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
        if (AbstractC0737q.z(str, "+")) {
            str = AbstractC0730j.D(str, 1);
        }
        return Long.parseLong(str);
    }

    public static final y0 t(C0167p c0167p) {
        Object[] objArr = new Object[0];
        C1256t c1256t = y0.f7241i;
        boolean d3 = c0167p.d(0);
        Object G3 = c0167p.G();
        if (d3 || G3 == C0159l.f2829a) {
            G3 = new s0(0);
            c0167p.a0(G3);
        }
        return (y0) O2.d.c0(objArr, c1256t, (InterfaceC0422a) G3, c0167p, 0, 4);
    }

    public static final long u(long j3, EnumC0748c enumC0748c) {
        f2.j.f(enumC0748c, "unit");
        EnumC0748c enumC0748c2 = EnumC0748c.NANOSECONDS;
        f2.j.f(enumC0748c2, "sourceUnit");
        TimeUnit timeUnit = enumC0748c.f7452d;
        TimeUnit timeUnit2 = enumC0748c2.f7452d;
        long convert = timeUnit.convert(4611686018426999999L, timeUnit2);
        if ((-convert) > j3 || j3 > convert) {
            EnumC0748c enumC0748c3 = EnumC0748c.MILLISECONDS;
            f2.j.f(enumC0748c3, "targetUnit");
            return h(O2.d.z(enumC0748c3.f7452d.convert(j3, timeUnit), -4611686018427387903L, 4611686018427387903L));
        }
        long convert2 = timeUnit2.convert(j3, timeUnit) << 1;
        int i3 = C0746a.f7442g;
        int i4 = AbstractC0747b.f7444a;
        return convert2;
    }

    public static final R1.r v(String str) {
        int i3;
        int i4;
        r.i(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i5 = 0;
        char charAt = str.charAt(0);
        if (f2.j.g(charAt, 48) < 0) {
            i3 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        } else {
            i3 = 0;
        }
        int i6 = 119304647;
        int i7 = 119304647;
        while (i3 < length) {
            int digit = Character.digit((int) str.charAt(i3), 10);
            if (digit < 0) {
                return null;
            }
            int i8 = i5 ^ Integer.MIN_VALUE;
            if (Integer.compare(i8, i7 ^ Integer.MIN_VALUE) > 0) {
                if (i7 == i6) {
                    i4 = i3;
                    i7 = (int) (((-1) & 4294967295L) / (10 & 4294967295L));
                    if (Integer.compare(i8, i7 ^ Integer.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            i4 = i3;
            int i9 = i5 * 10;
            int i10 = i9 + digit;
            if (Integer.compare(i10 ^ Integer.MIN_VALUE, i9 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i3 = i4 + 1;
            i5 = i10;
            i6 = 119304647;
        }
        return new R1.r(i5);
    }

    public static U.q w(U.q qVar, y0 y0Var) {
        return U.a.b(qVar, new androidx.compose.foundation.e(y0Var, false, null, true));
    }

    public abstract boolean g(C0962h c0962h);

    public abstract Object j(C0962h c0962h);

    public abstract void s();
}
