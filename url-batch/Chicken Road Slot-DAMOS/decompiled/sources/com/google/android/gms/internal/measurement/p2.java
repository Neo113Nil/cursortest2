package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class p2 {

    /* renamed from: a, reason: collision with root package name */
    public static final h1 f2660a;

    static {
        int i3 = q0.f2690a;
        f2660a = new h1(1);
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void b(Object obj, Object obj2) {
        k1 k1Var = (k1) obj;
        u2 u2Var = k1Var.zzc;
        u2 u2Var2 = ((k1) obj2).zzc;
        u2 u2Var3 = u2.f2837f;
        if (!u2Var3.equals(u2Var2)) {
            if (u2Var3.equals(u2Var)) {
                int i3 = u2Var.f2838a + u2Var2.f2838a;
                int[] copyOf = Arrays.copyOf(u2Var.f2839b, i3);
                System.arraycopy(u2Var2.f2839b, 0, copyOf, u2Var.f2838a, u2Var2.f2838a);
                Object[] copyOf2 = Arrays.copyOf(u2Var.f2840c, i3);
                System.arraycopy(u2Var2.f2840c, 0, copyOf2, u2Var.f2838a, u2Var2.f2838a);
                u2Var = new u2(i3, copyOf, copyOf2, true);
            } else {
                u2Var.getClass();
                if (!u2Var2.equals(u2Var3)) {
                    if (!u2Var.f2842e) {
                        a2.r.a();
                        return;
                    }
                    int i10 = u2Var.f2838a + u2Var2.f2838a;
                    u2Var.e(i10);
                    System.arraycopy(u2Var2.f2839b, 0, u2Var.f2839b, u2Var.f2838a, u2Var2.f2838a);
                    System.arraycopy(u2Var2.f2840c, 0, u2Var.f2840c, u2Var.f2838a, u2Var2.f2838a);
                    u2Var.f2838a = i10;
                }
            }
        }
        k1Var.zzc = u2Var;
    }

    public static Object c(Object obj, int i3, t1 t1Var, l0 l0Var, Object obj2, h1 h1Var) {
        if (l0Var == null) {
            return obj2;
        }
        if (t1Var == null) {
            Iterator it = t1Var.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (!l0Var.a(intValue)) {
                    if (obj2 == null) {
                        h1Var.getClass();
                        obj2 = h1.g(obj);
                    }
                    h1Var.getClass();
                    ((u2) obj2).d(i3 << 3, Long.valueOf(intValue));
                    it.remove();
                }
            }
            return obj2;
        }
        int size = t1Var.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Integer num = (Integer) t1Var.get(i11);
            int intValue2 = num.intValue();
            if (l0Var.a(intValue2)) {
                if (i11 != i10) {
                    t1Var.set(i10, num);
                }
                i10++;
            } else {
                if (obj2 == null) {
                    h1Var.getClass();
                    obj2 = h1.g(obj);
                }
                h1Var.getClass();
                ((u2) obj2).d(i3 << 3, Long.valueOf(intValue2));
            }
        }
        if (i10 != size) {
            t1Var.subList(i10, size).clear();
        }
        return obj2;
    }

    public static void d(int i3, List list, v5 v5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b1 b1Var = (b1) v5Var.f2870e;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                b1Var.i(i3, Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                i10++;
            }
            return;
        }
        b1Var.d(i3, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Double) list.get(i12)).getClass();
            i11 += 8;
        }
        b1Var.r(i11);
        while (i10 < list.size()) {
            b1Var.u(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
            i10++;
        }
    }

    public static void e(int i3, List list, v5 v5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b1 b1Var = (b1) v5Var.f2870e;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                b1Var.g(i3, Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                i10++;
            }
            return;
        }
        b1Var.d(i3, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Float) list.get(i12)).getClass();
            i11 += 4;
        }
        b1Var.r(i11);
        while (i10 < list.size()) {
            b1Var.s(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
            i10++;
        }
    }

    public static void f(int i3, List list, v5 v5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b1 b1Var = (b1) v5Var.f2870e;
        int i10 = 0;
        if (!(list instanceof z1)) {
            if (!z10) {
                while (i10 < list.size()) {
                    b1Var.h(i3, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            b1Var.d(i3, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += b1.b(((Long) list.get(i12)).longValue());
            }
            b1Var.r(i11);
            while (i10 < list.size()) {
                b1Var.t(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        z1 z1Var = (z1) list;
        if (!z10) {
            while (i10 < z1Var.f3032i) {
                b1Var.h(i3, z1Var.c(i10));
                i10++;
            }
            return;
        }
        b1Var.d(i3, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < z1Var.f3032i; i14++) {
            i13 += b1.b(z1Var.c(i14));
        }
        b1Var.r(i13);
        while (i10 < z1Var.f3032i) {
            b1Var.t(z1Var.c(i10));
            i10++;
        }
    }

    public static void g(int i3, List list, v5 v5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b1 b1Var = (b1) v5Var.f2870e;
        int i10 = 0;
        if (!(list instanceof z1)) {
            if (!z10) {
                while (i10 < list.size()) {
                    b1Var.h(i3, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            b1Var.d(i3, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += b1.b(((Long) list.get(i12)).longValue());
            }
            b1Var.r(i11);
            while (i10 < list.size()) {
                b1Var.t(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        z1 z1Var = (z1) list;
        if (!z10) {
            while (i10 < z1Var.f3032i) {
                b1Var.h(i3, z1Var.c(i10));
                i10++;
            }
            return;
        }
        b1Var.d(i3, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < z1Var.f3032i; i14++) {
            i13 += b1.b(z1Var.c(i14));
        }
        b1Var.r(i13);
        while (i10 < z1Var.f3032i) {
            b1Var.t(z1Var.c(i10));
            i10++;
        }
    }

    public static void h(int i3, List list, v5 v5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b1 b1Var = (b1) v5Var.f2870e;
        int i10 = 0;
        if (!(list instanceof z1)) {
            if (!z10) {
                while (i10 < list.size()) {
                    long longValue = ((Long) list.get(i10)).longValue();
                    b1Var.h(i3, (longValue >> 63) ^ (longValue + longValue));
                    i10++;
                }
                return;
            }
            b1Var.d(i3, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                long longValue2 = ((Long) list.get(i12)).longValue();
                i11 += b1.b((longValue2 >> 63) ^ (longValue2 + longValue2));
            }
            b1Var.r(i11);
            while (i10 < list.size()) {
                long longValue3 = ((Long) list.get(i10)).longValue();
                b1Var.t((longValue3 >> 63) ^ (longValue3 + longValue3));
                i10++;
            }
            return;
        }
        z1 z1Var = (z1) list;
        if (!z10) {
            while (i10 < z1Var.f3032i) {
                long c10 = z1Var.c(i10);
                b1Var.h(i3, (c10 >> 63) ^ (c10 + c10));
                i10++;
            }
            return;
        }
        b1Var.d(i3, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < z1Var.f3032i; i14++) {
            long c11 = z1Var.c(i14);
            i13 += b1.b((c11 >> 63) ^ (c11 + c11));
        }
        b1Var.r(i13);
        while (i10 < z1Var.f3032i) {
            long c12 = z1Var.c(i10);
            b1Var.t((c12 >> 63) ^ (c12 + c12));
            i10++;
        }
    }

    public static void i(int i3, List list, v5 v5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b1 b1Var = (b1) v5Var.f2870e;
        int i10 = 0;
        if (!(list instanceof z1)) {
            if (!z10) {
                while (i10 < list.size()) {
                    b1Var.i(i3, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            b1Var.d(i3, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Long) list.get(i12)).getClass();
                i11 += 8;
            }
            b1Var.r(i11);
            while (i10 < list.size()) {
                b1Var.u(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        z1 z1Var = (z1) list;
        if (!z10) {
            while (i10 < z1Var.f3032i) {
                b1Var.i(i3, z1Var.c(i10));
                i10++;
            }
            return;
        }
        b1Var.d(i3, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < z1Var.f3032i; i14++) {
            z1Var.c(i14);
            i13 += 8;
        }
        b1Var.r(i13);
        while (i10 < z1Var.f3032i) {
            b1Var.u(z1Var.c(i10));
            i10++;
        }
    }

    public static void j(int i3, List list, v5 v5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b1 b1Var = (b1) v5Var.f2870e;
        int i10 = 0;
        if (!(list instanceof z1)) {
            if (!z10) {
                while (i10 < list.size()) {
                    b1Var.i(i3, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            b1Var.d(i3, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Long) list.get(i12)).getClass();
                i11 += 8;
            }
            b1Var.r(i11);
            while (i10 < list.size()) {
                b1Var.u(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        z1 z1Var = (z1) list;
        if (!z10) {
            while (i10 < z1Var.f3032i) {
                b1Var.i(i3, z1Var.c(i10));
                i10++;
            }
            return;
        }
        b1Var.d(i3, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < z1Var.f3032i; i14++) {
            z1Var.c(i14);
            i13 += 8;
        }
        b1Var.r(i13);
        while (i10 < z1Var.f3032i) {
            b1Var.u(z1Var.c(i10));
            i10++;
        }
    }

    public static void k(int i3, List list, v5 v5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b1 b1Var = (b1) v5Var.f2870e;
        int i10 = 0;
        if (!(list instanceof l1)) {
            if (!z10) {
                while (i10 < list.size()) {
                    b1Var.e(i3, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            b1Var.d(i3, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += b1.b(((Integer) list.get(i12)).intValue());
            }
            b1Var.r(i11);
            while (i10 < list.size()) {
                b1Var.q(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        l1 l1Var = (l1) list;
        if (!z10) {
            while (i10 < l1Var.f2492i) {
                b1Var.e(i3, l1Var.e(i10));
                i10++;
            }
            return;
        }
        b1Var.d(i3, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < l1Var.f2492i; i14++) {
            i13 += b1.b(l1Var.e(i14));
        }
        b1Var.r(i13);
        while (i10 < l1Var.f2492i) {
            b1Var.q(l1Var.e(i10));
            i10++;
        }
    }

    public static void l(int i3, List list, v5 v5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b1 b1Var = (b1) v5Var.f2870e;
        int i10 = 0;
        if (!(list instanceof l1)) {
            if (!z10) {
                while (i10 < list.size()) {
                    b1Var.f(i3, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            b1Var.d(i3, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += b1.a(((Integer) list.get(i12)).intValue());
            }
            b1Var.r(i11);
            while (i10 < list.size()) {
                b1Var.r(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        l1 l1Var = (l1) list;
        if (!z10) {
            while (i10 < l1Var.f2492i) {
                b1Var.f(i3, l1Var.e(i10));
                i10++;
            }
            return;
        }
        b1Var.d(i3, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < l1Var.f2492i; i14++) {
            i13 += b1.a(l1Var.e(i14));
        }
        b1Var.r(i13);
        while (i10 < l1Var.f2492i) {
            b1Var.r(l1Var.e(i10));
            i10++;
        }
    }

    public static void m(int i3, List list, v5 v5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b1 b1Var = (b1) v5Var.f2870e;
        int i10 = 0;
        if (!(list instanceof l1)) {
            if (!z10) {
                while (i10 < list.size()) {
                    int intValue = ((Integer) list.get(i10)).intValue();
                    b1Var.f(i3, (intValue >> 31) ^ (intValue + intValue));
                    i10++;
                }
                return;
            }
            b1Var.d(i3, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                int intValue2 = ((Integer) list.get(i12)).intValue();
                i11 += b1.a((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            b1Var.r(i11);
            while (i10 < list.size()) {
                int intValue3 = ((Integer) list.get(i10)).intValue();
                b1Var.r((intValue3 >> 31) ^ (intValue3 + intValue3));
                i10++;
            }
            return;
        }
        l1 l1Var = (l1) list;
        if (!z10) {
            while (i10 < l1Var.f2492i) {
                int e2 = l1Var.e(i10);
                b1Var.f(i3, (e2 >> 31) ^ (e2 + e2));
                i10++;
            }
            return;
        }
        b1Var.d(i3, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < l1Var.f2492i; i14++) {
            int e9 = l1Var.e(i14);
            i13 += b1.a((e9 >> 31) ^ (e9 + e9));
        }
        b1Var.r(i13);
        while (i10 < l1Var.f2492i) {
            int e10 = l1Var.e(i10);
            b1Var.r((e10 >> 31) ^ (e10 + e10));
            i10++;
        }
    }

    public static void n(int i3, List list, v5 v5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b1 b1Var = (b1) v5Var.f2870e;
        int i10 = 0;
        if (!(list instanceof l1)) {
            if (!z10) {
                while (i10 < list.size()) {
                    b1Var.g(i3, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            b1Var.d(i3, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Integer) list.get(i12)).getClass();
                i11 += 4;
            }
            b1Var.r(i11);
            while (i10 < list.size()) {
                b1Var.s(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        l1 l1Var = (l1) list;
        if (!z10) {
            while (i10 < l1Var.f2492i) {
                b1Var.g(i3, l1Var.e(i10));
                i10++;
            }
            return;
        }
        b1Var.d(i3, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < l1Var.f2492i; i14++) {
            l1Var.e(i14);
            i13 += 4;
        }
        b1Var.r(i13);
        while (i10 < l1Var.f2492i) {
            b1Var.s(l1Var.e(i10));
            i10++;
        }
    }

    public static void o(int i3, List list, v5 v5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b1 b1Var = (b1) v5Var.f2870e;
        int i10 = 0;
        if (!(list instanceof l1)) {
            if (!z10) {
                while (i10 < list.size()) {
                    b1Var.g(i3, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            b1Var.d(i3, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Integer) list.get(i12)).getClass();
                i11 += 4;
            }
            b1Var.r(i11);
            while (i10 < list.size()) {
                b1Var.s(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        l1 l1Var = (l1) list;
        if (!z10) {
            while (i10 < l1Var.f2492i) {
                b1Var.g(i3, l1Var.e(i10));
                i10++;
            }
            return;
        }
        b1Var.d(i3, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < l1Var.f2492i; i14++) {
            l1Var.e(i14);
            i13 += 4;
        }
        b1Var.r(i13);
        while (i10 < l1Var.f2492i) {
            b1Var.s(l1Var.e(i10));
            i10++;
        }
    }

    public static void p(int i3, List list, v5 v5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b1 b1Var = (b1) v5Var.f2870e;
        int i10 = 0;
        if (!(list instanceof l1)) {
            if (!z10) {
                while (i10 < list.size()) {
                    b1Var.e(i3, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            b1Var.d(i3, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += b1.b(((Integer) list.get(i12)).intValue());
            }
            b1Var.r(i11);
            while (i10 < list.size()) {
                b1Var.q(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        l1 l1Var = (l1) list;
        if (!z10) {
            while (i10 < l1Var.f2492i) {
                b1Var.e(i3, l1Var.e(i10));
                i10++;
            }
            return;
        }
        b1Var.d(i3, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < l1Var.f2492i; i14++) {
            i13 += b1.b(l1Var.e(i14));
        }
        b1Var.r(i13);
        while (i10 < l1Var.f2492i) {
            b1Var.q(l1Var.e(i10));
            i10++;
        }
    }

    public static void q(int i3, List list, v5 v5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b1 b1Var = (b1) v5Var.f2870e;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                b1Var.j(i3, ((Boolean) list.get(i10)).booleanValue());
                i10++;
            }
            return;
        }
        b1Var.d(i3, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Boolean) list.get(i12)).getClass();
            i11++;
        }
        b1Var.r(i11);
        while (i10 < list.size()) {
            b1Var.p(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : (byte) 0);
            i10++;
        }
    }

    public static int r(List list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof z1)) {
            int i10 = 0;
            while (i3 < size) {
                i10 += b1.b(((Long) list.get(i3)).longValue());
                i3++;
            }
            return i10;
        }
        z1 z1Var = (z1) list;
        int i11 = 0;
        while (i3 < size) {
            i11 += b1.b(z1Var.c(i3));
            i3++;
        }
        return i11;
    }

    public static int s(List list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof z1)) {
            int i10 = 0;
            while (i3 < size) {
                i10 += b1.b(((Long) list.get(i3)).longValue());
                i3++;
            }
            return i10;
        }
        z1 z1Var = (z1) list;
        int i11 = 0;
        while (i3 < size) {
            i11 += b1.b(z1Var.c(i3));
            i3++;
        }
        return i11;
    }

    public static int t(List list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof z1)) {
            int i10 = 0;
            while (i3 < size) {
                long longValue = ((Long) list.get(i3)).longValue();
                i10 += b1.b((longValue >> 63) ^ (longValue + longValue));
                i3++;
            }
            return i10;
        }
        z1 z1Var = (z1) list;
        int i11 = 0;
        while (i3 < size) {
            long c10 = z1Var.c(i3);
            i11 += b1.b((c10 >> 63) ^ (c10 + c10));
            i3++;
        }
        return i11;
    }

    public static int u(List list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof l1)) {
            int i10 = 0;
            while (i3 < size) {
                i10 += b1.b(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return i10;
        }
        l1 l1Var = (l1) list;
        int i11 = 0;
        while (i3 < size) {
            i11 += b1.b(l1Var.e(i3));
            i3++;
        }
        return i11;
    }

    public static int v(List list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof l1)) {
            int i10 = 0;
            while (i3 < size) {
                i10 += b1.b(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return i10;
        }
        l1 l1Var = (l1) list;
        int i11 = 0;
        while (i3 < size) {
            i11 += b1.b(l1Var.e(i3));
            i3++;
        }
        return i11;
    }

    public static int w(List list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof l1)) {
            int i10 = 0;
            while (i3 < size) {
                i10 += b1.a(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return i10;
        }
        l1 l1Var = (l1) list;
        int i11 = 0;
        while (i3 < size) {
            i11 += b1.a(l1Var.e(i3));
            i3++;
        }
        return i11;
    }

    public static int x(List list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof l1)) {
            int i10 = 0;
            while (i3 < size) {
                int intValue = ((Integer) list.get(i3)).intValue();
                i10 += b1.a((intValue >> 31) ^ (intValue + intValue));
                i3++;
            }
            return i10;
        }
        l1 l1Var = (l1) list;
        int i11 = 0;
        while (i3 < size) {
            int e2 = l1Var.e(i3);
            i11 += b1.a((e2 >> 31) ^ (e2 + e2));
            i3++;
        }
        return i11;
    }

    public static int y(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (b1.a(i3 << 3) + 4) * size;
    }

    public static int z(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (b1.a(i3 << 3) + 8) * size;
    }
}
