package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jma {
    public static final jmj a = new jmj();

    @Deprecated
    static int a(int i, jll jllVar, jlz jlzVar) {
        int numberOfLeadingZeros = (352 - (Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6;
        return numberOfLeadingZeros + numberOfLeadingZeros + ((jja) jllVar).c(jlzVar);
    }

    static int b(jja jjaVar, jlz jlzVar) {
        int c = jjaVar.c(jlzVar);
        return ((352 - (Integer.numberOfLeadingZeros(c) * 9)) >>> 6) + c;
    }

    static int c(int i, Object obj, jlz jlzVar) {
        return ((352 - (Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6) + b((jja) obj, jlzVar);
    }

    static int d(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof jkq)) {
            int i2 = 0;
            while (i < size) {
                int intValue = ((Integer) list.get(i)).intValue();
                i2 += (352 - (Integer.numberOfLeadingZeros((intValue + intValue) ^ (intValue >> 31)) * 9)) >>> 6;
                i++;
            }
            return i2;
        }
        jkq jkqVar = (jkq) list;
        int i3 = 0;
        while (i < size) {
            int e = jkqVar.e(i);
            i3 += (352 - (Integer.numberOfLeadingZeros((e + e) ^ (e >> 31)) * 9)) >>> 6;
            i++;
        }
        return i3;
    }

    static int e(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof jlh)) {
            int i2 = 0;
            while (i < size) {
                long longValue = ((Long) list.get(i)).longValue();
                i2 += (640 - (Long.numberOfLeadingZeros((longValue + longValue) ^ (longValue >> 63)) * 9)) >>> 6;
                i++;
            }
            return i2;
        }
        jlh jlhVar = (jlh) list;
        int i3 = 0;
        while (i < size) {
            long f = jlhVar.f(i);
            i3 += (640 - (Long.numberOfLeadingZeros((f + f) ^ (f >> 63)) * 9)) >>> 6;
            i++;
        }
        return i3;
    }

    static int f(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof jkq)) {
            int i2 = 0;
            while (i < size) {
                i2 += (352 - (Integer.numberOfLeadingZeros(((Integer) list.get(i)).intValue()) * 9)) >>> 6;
                i++;
            }
            return i2;
        }
        jkq jkqVar = (jkq) list;
        int i3 = 0;
        while (i < size) {
            i3 += (352 - (Integer.numberOfLeadingZeros(jkqVar.e(i)) * 9)) >>> 6;
            i++;
        }
        return i3;
    }

    static Object g(Object obj, int i, List list, jks jksVar, Object obj2, jmj jmjVar) {
        if (jksVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (!jksVar.a(intValue)) {
                    obj2 = o(obj, i, intValue, obj2);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) list.get(i3);
            int intValue2 = num.intValue();
            if (jksVar.a(intValue2)) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                obj2 = o(obj, i, intValue2, obj2);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return obj2;
    }

    static boolean h(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int i(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (((352 - (Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6) + 4);
    }

    static int j(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (((352 - (Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6) + 8);
    }

    public static /* synthetic */ int k(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof jkq)) {
            int i2 = 0;
            while (i < size) {
                i2 += jjz.I(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        jkq jkqVar = (jkq) list;
        int i3 = 0;
        while (i < size) {
            i3 += jjz.I(jkqVar.e(i));
            i++;
        }
        return i3;
    }

    public static /* synthetic */ int l(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof jlh)) {
            int i2 = 0;
            while (i < size) {
                i2 += (640 - (Long.numberOfLeadingZeros(((Long) list.get(i)).longValue()) * 9)) >>> 6;
                i++;
            }
            return i2;
        }
        jlh jlhVar = (jlh) list;
        int i3 = 0;
        while (i < size) {
            i3 += (640 - (Long.numberOfLeadingZeros(jlhVar.f(i)) * 9)) >>> 6;
            i++;
        }
        return i3;
    }

    static void m(Object obj, Object obj2) {
        jkf a2 = ils.a(obj2);
        if (a2.g()) {
            return;
        }
        jkf b = ils.b(obj);
        jme jmeVar = a2.b;
        int size = jmeVar.size();
        for (int i = 0; i < size; i++) {
            jmb jmbVar = (jmb) jmeVar.a(i);
            jko jkoVar = jmbVar.c;
            Object obj3 = jmbVar.a;
            boolean z = obj3 instanceof jlb;
            if (jkoVar.a() == jms.i) {
                Object j = b.j(jkoVar);
                if (j == null) {
                    b.b.d(jkoVar, jkf.c(obj3));
                    if (z) {
                        b.d = true;
                    }
                } else {
                    if (z) {
                        obj3 = ((jlb) obj3).b();
                    }
                    if (j instanceof jll) {
                        jlk C = ((jll) j).C();
                        jko.b(C, obj3);
                        b.b.d(jkoVar, C.q());
                    } else {
                        jko.b(j, obj3);
                    }
                }
            } else {
                if (z) {
                    throw new IllegalStateException("Lazy fields must be message-valued");
                }
                b.b.d(jkoVar, jkf.c(obj3));
            }
        }
    }

    static void n(Object obj, Object obj2) {
        jmk d = jmj.d(obj);
        jmk d2 = jmj.d(obj2);
        jmk jmkVar = jmk.a;
        if (!jmkVar.equals(d2)) {
            if (jmkVar.equals(d)) {
                int i = d.b + d2.b;
                int[] copyOf = Arrays.copyOf(d.c, i);
                System.arraycopy(d2.c, 0, copyOf, d.b, d2.b);
                Object[] copyOf2 = Arrays.copyOf(d.d, i);
                System.arraycopy(d2.d, 0, copyOf2, d.b, d2.b);
                d = new jmk(i, copyOf, copyOf2, true);
            } else if (!d2.equals(jmkVar)) {
                d.b();
                int i2 = d.b + d2.b;
                d.c(i2);
                System.arraycopy(d2.c, 0, d.c, d.b, d2.b);
                System.arraycopy(d2.d, 0, d.d, d.b, d2.b);
                d.b = i2;
            }
        }
        jmj.e(obj, d);
    }

    static Object o(Object obj, int i, int i2, Object obj2) {
        if (obj2 == null) {
            obj2 = jmj.f(obj);
        }
        jmj.c(obj2, i, i2);
        return obj2;
    }

    public static void p(int i, List list, ikk ikkVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof jjh)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((jjz) ikkVar.a).f(i, ((Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            jjz jjzVar = (jjz) ikkVar.a;
            jjzVar.t(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            jjzVar.v(i3);
            while (i2 < list.size()) {
                jjzVar.d(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        jjh jjhVar = (jjh) list;
        if (!z) {
            while (i2 < jjhVar.a) {
                ((jjz) ikkVar.a).f(i, jjhVar.f(i2));
                i2++;
            }
            return;
        }
        jjz jjzVar2 = (jjz) ikkVar.a;
        jjzVar2.t(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < jjhVar.a; i6++) {
            jjhVar.f(i6);
            i5++;
        }
        jjzVar2.v(i5);
        while (i2 < jjhVar.a) {
            jjzVar2.d(jjhVar.f(i2) ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void q(int i, List list, ikk ikkVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof jka)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((jjz) ikkVar.a).U(i, ((Double) list.get(i2)).doubleValue());
                    i2++;
                }
                return;
            }
            jjz jjzVar = (jjz) ikkVar.a;
            jjzVar.t(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            jjzVar.v(i3);
            while (i2 < list.size()) {
                jjzVar.V(((Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        jka jkaVar = (jka) list;
        if (!z) {
            while (i2 < jkaVar.b) {
                ((jjz) ikkVar.a).U(i, jkaVar.e(i2));
                i2++;
            }
            return;
        }
        jjz jjzVar2 = (jjz) ikkVar.a;
        jjzVar2.t(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < jkaVar.b; i6++) {
            jkaVar.e(i6);
            i5 += 8;
        }
        jjzVar2.v(i5);
        while (i2 < jkaVar.b) {
            jjzVar2.V(jkaVar.e(i2));
            i2++;
        }
    }

    public static void r(int i, List list, ikk ikkVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof jkh)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((jjz) ikkVar.a).W(i, ((Float) list.get(i2)).floatValue());
                    i2++;
                }
                return;
            }
            jjz jjzVar = (jjz) ikkVar.a;
            jjzVar.t(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            jjzVar.v(i3);
            while (i2 < list.size()) {
                jjzVar.X(((Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        jkh jkhVar = (jkh) list;
        if (!z) {
            while (i2 < jkhVar.b) {
                ((jjz) ikkVar.a).W(i, jkhVar.e(i2));
                i2++;
            }
            return;
        }
        jjz jjzVar2 = (jjz) ikkVar.a;
        jjzVar2.t(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < jkhVar.b; i6++) {
            jkhVar.e(i6);
            i5 += 4;
        }
        jjzVar2.v(i5);
        while (i2 < jkhVar.b) {
            jjzVar2.X(jkhVar.e(i2));
            i2++;
        }
    }

    public static void s(int i, List list, ikk ikkVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof jkq)) {
            if (!z) {
                while (i2 < list.size()) {
                    Object obj = ikkVar.a;
                    int intValue = ((Integer) list.get(i2)).intValue();
                    ((jjz) obj).u(i, (intValue + intValue) ^ (intValue >> 31));
                    i2++;
                }
                return;
            }
            jjz jjzVar = (jjz) ikkVar.a;
            jjzVar.t(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue2 = ((Integer) list.get(i4)).intValue();
                i3 += (352 - (Integer.numberOfLeadingZeros((intValue2 + intValue2) ^ (intValue2 >> 31)) * 9)) >>> 6;
            }
            jjzVar.v(i3);
            while (i2 < list.size()) {
                int intValue3 = ((Integer) list.get(i2)).intValue();
                jjzVar.v((intValue3 + intValue3) ^ (intValue3 >> 31));
                i2++;
            }
            return;
        }
        jkq jkqVar = (jkq) list;
        if (!z) {
            while (i2 < jkqVar.c) {
                Object obj2 = ikkVar.a;
                int e = jkqVar.e(i2);
                ((jjz) obj2).u(i, (e + e) ^ (e >> 31));
                i2++;
            }
            return;
        }
        jjz jjzVar2 = (jjz) ikkVar.a;
        jjzVar2.t(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < jkqVar.c; i6++) {
            int e2 = jkqVar.e(i6);
            i5 += (352 - (Integer.numberOfLeadingZeros((e2 + e2) ^ (e2 >> 31)) * 9)) >>> 6;
        }
        jjzVar2.v(i5);
        while (i2 < jkqVar.c) {
            int e3 = jkqVar.e(i2);
            jjzVar2.v((e3 + e3) ^ (e3 >> 31));
            i2++;
        }
    }

    public static void t(int i, List list, ikk ikkVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof jlh)) {
            if (!z) {
                while (i2 < list.size()) {
                    Object obj = ikkVar.a;
                    long longValue = ((Long) list.get(i2)).longValue();
                    ((jjz) obj).w(i, (longValue + longValue) ^ (longValue >> 63));
                    i2++;
                }
                return;
            }
            jjz jjzVar = (jjz) ikkVar.a;
            jjzVar.t(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue2 = ((Long) list.get(i4)).longValue();
                i3 += (640 - (Long.numberOfLeadingZeros((longValue2 + longValue2) ^ (longValue2 >> 63)) * 9)) >>> 6;
            }
            jjzVar.v(i3);
            while (i2 < list.size()) {
                long longValue3 = ((Long) list.get(i2)).longValue();
                jjzVar.x((longValue3 + longValue3) ^ (longValue3 >> 63));
                i2++;
            }
            return;
        }
        jlh jlhVar = (jlh) list;
        if (!z) {
            while (i2 < jlhVar.c) {
                Object obj2 = ikkVar.a;
                long f = jlhVar.f(i2);
                ((jjz) obj2).w(i, (f + f) ^ (f >> 63));
                i2++;
            }
            return;
        }
        jjz jjzVar2 = (jjz) ikkVar.a;
        jjzVar2.t(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < jlhVar.c; i6++) {
            long f2 = jlhVar.f(i6);
            i5 += (640 - (Long.numberOfLeadingZeros((f2 + f2) ^ (f2 >> 63)) * 9)) >>> 6;
        }
        jjzVar2.v(i5);
        while (i2 < jlhVar.c) {
            long f3 = jlhVar.f(i2);
            jjzVar2.x((f3 + f3) ^ (f3 >> 63));
            i2++;
        }
    }

    public static void u(int i, List list, ikk ikkVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof jkq)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((jjz) ikkVar.a).u(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            jjz jjzVar = (jjz) ikkVar.a;
            jjzVar.t(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += (352 - (Integer.numberOfLeadingZeros(((Integer) list.get(i4)).intValue()) * 9)) >>> 6;
            }
            jjzVar.v(i3);
            while (i2 < list.size()) {
                jjzVar.v(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        jkq jkqVar = (jkq) list;
        if (!z) {
            while (i2 < jkqVar.c) {
                ((jjz) ikkVar.a).u(i, jkqVar.e(i2));
                i2++;
            }
            return;
        }
        jjz jjzVar2 = (jjz) ikkVar.a;
        jjzVar2.t(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < jkqVar.c; i6++) {
            i5 += (352 - (Integer.numberOfLeadingZeros(jkqVar.e(i6)) * 9)) >>> 6;
        }
        jjzVar2.v(i5);
        while (i2 < jkqVar.c) {
            jjzVar2.v(jkqVar.e(i2));
            i2++;
        }
    }

    public static /* synthetic */ void v(int i, List list, ikk ikkVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof jkq)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((jjz) ikkVar.a).m(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            jjz jjzVar = (jjz) ikkVar.a;
            jjzVar.t(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += jjz.I(((Integer) list.get(i4)).intValue());
            }
            jjzVar.v(i3);
            while (i2 < list.size()) {
                jjzVar.n(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        jkq jkqVar = (jkq) list;
        if (!z) {
            while (i2 < jkqVar.c) {
                ((jjz) ikkVar.a).m(i, jkqVar.e(i2));
                i2++;
            }
            return;
        }
        jjz jjzVar2 = (jjz) ikkVar.a;
        jjzVar2.t(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < jkqVar.c; i6++) {
            i5 += jjz.I(jkqVar.e(i6));
        }
        jjzVar2.v(i5);
        while (i2 < jkqVar.c) {
            jjzVar2.n(jkqVar.e(i2));
            i2++;
        }
    }

    public static /* synthetic */ void w(int i, List list, ikk ikkVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof jkq)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((jjz) ikkVar.a).i(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            jjz jjzVar = (jjz) ikkVar.a;
            jjzVar.t(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            jjzVar.v(i3);
            while (i2 < list.size()) {
                jjzVar.j(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        jkq jkqVar = (jkq) list;
        if (!z) {
            while (i2 < jkqVar.c) {
                ((jjz) ikkVar.a).i(i, jkqVar.e(i2));
                i2++;
            }
            return;
        }
        jjz jjzVar2 = (jjz) ikkVar.a;
        jjzVar2.t(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < jkqVar.c; i6++) {
            jkqVar.e(i6);
            i5 += 4;
        }
        jjzVar2.v(i5);
        while (i2 < jkqVar.c) {
            jjzVar2.j(jkqVar.e(i2));
            i2++;
        }
    }

    public static /* synthetic */ void x(int i, List list, ikk ikkVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof jlh)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((jjz) ikkVar.a).k(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            jjz jjzVar = (jjz) ikkVar.a;
            jjzVar.t(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            jjzVar.v(i3);
            while (i2 < list.size()) {
                jjzVar.l(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        jlh jlhVar = (jlh) list;
        if (!z) {
            while (i2 < jlhVar.c) {
                ((jjz) ikkVar.a).k(i, jlhVar.f(i2));
                i2++;
            }
            return;
        }
        jjz jjzVar2 = (jjz) ikkVar.a;
        jjzVar2.t(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < jlhVar.c; i6++) {
            jlhVar.f(i6);
            i5 += 8;
        }
        jjzVar2.v(i5);
        while (i2 < jlhVar.c) {
            jjzVar2.l(jlhVar.f(i2));
            i2++;
        }
    }

    public static /* synthetic */ void y(int i, List list, ikk ikkVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof jlh)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((jjz) ikkVar.a).w(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            jjz jjzVar = (jjz) ikkVar.a;
            jjzVar.t(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += (640 - (Long.numberOfLeadingZeros(((Long) list.get(i4)).longValue()) * 9)) >>> 6;
            }
            jjzVar.v(i3);
            while (i2 < list.size()) {
                jjzVar.x(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        jlh jlhVar = (jlh) list;
        if (!z) {
            while (i2 < jlhVar.c) {
                ((jjz) ikkVar.a).w(i, jlhVar.f(i2));
                i2++;
            }
            return;
        }
        jjz jjzVar2 = (jjz) ikkVar.a;
        jjzVar2.t(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < jlhVar.c; i6++) {
            i5 += (640 - (Long.numberOfLeadingZeros(jlhVar.f(i6)) * 9)) >>> 6;
        }
        jjzVar2.v(i5);
        while (i2 < jlhVar.c) {
            jjzVar2.x(jlhVar.f(i2));
            i2++;
        }
    }
}
