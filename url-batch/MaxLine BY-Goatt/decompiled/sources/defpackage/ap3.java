package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class ap3 {
    public static final gg3 a;

    static {
        uo3 uo3Var = uo3.c;
        a = new gg3(25);
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void b(Object obj, Object obj2) {
        in3 in3Var = (in3) obj;
        jp3 jp3Var = in3Var.zzc;
        jp3 jp3Var2 = ((in3) obj2).zzc;
        jp3 jp3Var3 = jp3.f;
        if (!jp3Var3.equals(jp3Var2)) {
            if (jp3Var3.equals(jp3Var)) {
                int i = jp3Var.a + jp3Var2.a;
                int[] copyOf = Arrays.copyOf(jp3Var.b, i);
                System.arraycopy(jp3Var2.b, 0, copyOf, jp3Var.a, jp3Var2.a);
                Object[] copyOf2 = Arrays.copyOf(jp3Var.c, i);
                System.arraycopy(jp3Var2.c, 0, copyOf2, jp3Var.a, jp3Var2.a);
                jp3Var = new jp3(i, copyOf, copyOf2, true);
            } else {
                jp3Var.getClass();
                if (!jp3Var2.equals(jp3Var3)) {
                    if (!jp3Var.e) {
                        throw new UnsupportedOperationException();
                    }
                    int i2 = jp3Var.a + jp3Var2.a;
                    jp3Var.e(i2);
                    System.arraycopy(jp3Var2.b, 0, jp3Var.b, jp3Var.a, jp3Var2.a);
                    System.arraycopy(jp3Var2.c, 0, jp3Var.c, jp3Var.a, jp3Var2.a);
                    jp3Var.a = i2;
                }
            }
        }
        in3Var.zzc = jp3Var;
    }

    public static void c(int i, List list, ot2 ot2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        lm3 lm3Var = (lm3) ot2Var.n;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                lm3Var.h(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()), i);
                i2++;
            }
            return;
        }
        lm3Var.c(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        lm3Var.l(i3);
        while (i2 < list.size()) {
            lm3Var.o(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void d(int i, List list, ot2 ot2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        lm3 lm3Var = (lm3) ot2Var.n;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                lm3Var.f(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        lm3Var.c(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        lm3Var.l(i3);
        while (i2 < list.size()) {
            lm3Var.m(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void e(int i, List list, ot2 ot2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        lm3 lm3Var = (lm3) ot2Var.n;
        int i2 = 0;
        if (!(list instanceof co3)) {
            if (!z) {
                while (i2 < list.size()) {
                    lm3Var.g(((Long) list.get(i2)).longValue(), i);
                    i2++;
                }
                return;
            }
            lm3Var.c(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += lm3.a(((Long) list.get(i4)).longValue());
            }
            lm3Var.l(i3);
            while (i2 < list.size()) {
                lm3Var.n(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        co3 co3Var = (co3) list;
        if (!z) {
            while (i2 < co3Var.o) {
                lm3Var.g(co3Var.b(i2), i);
                i2++;
            }
            return;
        }
        lm3Var.c(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < co3Var.o; i6++) {
            i5 += lm3.a(co3Var.b(i6));
        }
        lm3Var.l(i5);
        while (i2 < co3Var.o) {
            lm3Var.n(co3Var.b(i2));
            i2++;
        }
    }

    public static void f(int i, List list, ot2 ot2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        lm3 lm3Var = (lm3) ot2Var.n;
        int i2 = 0;
        if (!(list instanceof co3)) {
            if (!z) {
                while (i2 < list.size()) {
                    lm3Var.g(((Long) list.get(i2)).longValue(), i);
                    i2++;
                }
                return;
            }
            lm3Var.c(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += lm3.a(((Long) list.get(i4)).longValue());
            }
            lm3Var.l(i3);
            while (i2 < list.size()) {
                lm3Var.n(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        co3 co3Var = (co3) list;
        if (!z) {
            while (i2 < co3Var.o) {
                lm3Var.g(co3Var.b(i2), i);
                i2++;
            }
            return;
        }
        lm3Var.c(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < co3Var.o; i6++) {
            i5 += lm3.a(co3Var.b(i6));
        }
        lm3Var.l(i5);
        while (i2 < co3Var.o) {
            lm3Var.n(co3Var.b(i2));
            i2++;
        }
    }

    public static void g(int i, List list, ot2 ot2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        lm3 lm3Var = (lm3) ot2Var.n;
        int i2 = 0;
        if (!(list instanceof co3)) {
            if (!z) {
                while (i2 < list.size()) {
                    long longValue = ((Long) list.get(i2)).longValue();
                    lm3Var.g((longValue >> 63) ^ (longValue + longValue), i);
                    i2++;
                }
                return;
            }
            lm3Var.c(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue2 = ((Long) list.get(i4)).longValue();
                i3 += lm3.a((longValue2 >> 63) ^ (longValue2 + longValue2));
            }
            lm3Var.l(i3);
            while (i2 < list.size()) {
                long longValue3 = ((Long) list.get(i2)).longValue();
                lm3Var.n((longValue3 >> 63) ^ (longValue3 + longValue3));
                i2++;
            }
            return;
        }
        co3 co3Var = (co3) list;
        if (!z) {
            while (i2 < co3Var.o) {
                long b = co3Var.b(i2);
                lm3Var.g((b >> 63) ^ (b + b), i);
                i2++;
            }
            return;
        }
        lm3Var.c(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < co3Var.o; i6++) {
            long b2 = co3Var.b(i6);
            i5 += lm3.a((b2 >> 63) ^ (b2 + b2));
        }
        lm3Var.l(i5);
        while (i2 < co3Var.o) {
            long b3 = co3Var.b(i2);
            lm3Var.n((b3 >> 63) ^ (b3 + b3));
            i2++;
        }
    }

    public static void h(int i, List list, ot2 ot2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        lm3 lm3Var = (lm3) ot2Var.n;
        int i2 = 0;
        if (!(list instanceof co3)) {
            if (!z) {
                while (i2 < list.size()) {
                    lm3Var.h(((Long) list.get(i2)).longValue(), i);
                    i2++;
                }
                return;
            }
            lm3Var.c(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            lm3Var.l(i3);
            while (i2 < list.size()) {
                lm3Var.o(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        co3 co3Var = (co3) list;
        if (!z) {
            while (i2 < co3Var.o) {
                lm3Var.h(co3Var.b(i2), i);
                i2++;
            }
            return;
        }
        lm3Var.c(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < co3Var.o; i6++) {
            co3Var.b(i6);
            i5 += 8;
        }
        lm3Var.l(i5);
        while (i2 < co3Var.o) {
            lm3Var.o(co3Var.b(i2));
            i2++;
        }
    }

    public static void i(int i, List list, ot2 ot2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        lm3 lm3Var = (lm3) ot2Var.n;
        int i2 = 0;
        if (!(list instanceof co3)) {
            if (!z) {
                while (i2 < list.size()) {
                    lm3Var.h(((Long) list.get(i2)).longValue(), i);
                    i2++;
                }
                return;
            }
            lm3Var.c(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            lm3Var.l(i3);
            while (i2 < list.size()) {
                lm3Var.o(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        co3 co3Var = (co3) list;
        if (!z) {
            while (i2 < co3Var.o) {
                lm3Var.h(co3Var.b(i2), i);
                i2++;
            }
            return;
        }
        lm3Var.c(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < co3Var.o; i6++) {
            co3Var.b(i6);
            i5 += 8;
        }
        lm3Var.l(i5);
        while (i2 < co3Var.o) {
            lm3Var.o(co3Var.b(i2));
            i2++;
        }
    }

    public static void j(int i, List list, ot2 ot2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        lm3 lm3Var = (lm3) ot2Var.n;
        int i2 = 0;
        if (!(list instanceof kn3)) {
            if (!z) {
                while (i2 < list.size()) {
                    lm3Var.d(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            lm3Var.c(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += lm3.a(((Integer) list.get(i4)).intValue());
            }
            lm3Var.l(i3);
            while (i2 < list.size()) {
                lm3Var.k(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        kn3 kn3Var = (kn3) list;
        if (!z) {
            while (i2 < kn3Var.o) {
                lm3Var.d(i, kn3Var.c(i2));
                i2++;
            }
            return;
        }
        lm3Var.c(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < kn3Var.o; i6++) {
            i5 += lm3.a(kn3Var.c(i6));
        }
        lm3Var.l(i5);
        while (i2 < kn3Var.o) {
            lm3Var.k(kn3Var.c(i2));
            i2++;
        }
    }

    public static void k(int i, List list, ot2 ot2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        lm3 lm3Var = (lm3) ot2Var.n;
        int i2 = 0;
        if (!(list instanceof kn3)) {
            if (!z) {
                while (i2 < list.size()) {
                    lm3Var.e(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            lm3Var.c(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += lm3.r(((Integer) list.get(i4)).intValue());
            }
            lm3Var.l(i3);
            while (i2 < list.size()) {
                lm3Var.l(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        kn3 kn3Var = (kn3) list;
        if (!z) {
            while (i2 < kn3Var.o) {
                lm3Var.e(i, kn3Var.c(i2));
                i2++;
            }
            return;
        }
        lm3Var.c(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < kn3Var.o; i6++) {
            i5 += lm3.r(kn3Var.c(i6));
        }
        lm3Var.l(i5);
        while (i2 < kn3Var.o) {
            lm3Var.l(kn3Var.c(i2));
            i2++;
        }
    }

    public static void l(int i, List list, ot2 ot2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        lm3 lm3Var = (lm3) ot2Var.n;
        int i2 = 0;
        if (!(list instanceof kn3)) {
            if (!z) {
                while (i2 < list.size()) {
                    int intValue = ((Integer) list.get(i2)).intValue();
                    lm3Var.e(i, (intValue >> 31) ^ (intValue + intValue));
                    i2++;
                }
                return;
            }
            lm3Var.c(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue2 = ((Integer) list.get(i4)).intValue();
                i3 += lm3.r((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            lm3Var.l(i3);
            while (i2 < list.size()) {
                int intValue3 = ((Integer) list.get(i2)).intValue();
                lm3Var.l((intValue3 >> 31) ^ (intValue3 + intValue3));
                i2++;
            }
            return;
        }
        kn3 kn3Var = (kn3) list;
        if (!z) {
            while (i2 < kn3Var.o) {
                int c = kn3Var.c(i2);
                lm3Var.e(i, (c >> 31) ^ (c + c));
                i2++;
            }
            return;
        }
        lm3Var.c(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < kn3Var.o; i6++) {
            int c2 = kn3Var.c(i6);
            i5 += lm3.r((c2 >> 31) ^ (c2 + c2));
        }
        lm3Var.l(i5);
        while (i2 < kn3Var.o) {
            int c3 = kn3Var.c(i2);
            lm3Var.l((c3 >> 31) ^ (c3 + c3));
            i2++;
        }
    }

    public static void m(int i, List list, ot2 ot2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        lm3 lm3Var = (lm3) ot2Var.n;
        int i2 = 0;
        if (!(list instanceof kn3)) {
            if (!z) {
                while (i2 < list.size()) {
                    lm3Var.f(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            lm3Var.c(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            lm3Var.l(i3);
            while (i2 < list.size()) {
                lm3Var.m(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        kn3 kn3Var = (kn3) list;
        if (!z) {
            while (i2 < kn3Var.o) {
                lm3Var.f(i, kn3Var.c(i2));
                i2++;
            }
            return;
        }
        lm3Var.c(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < kn3Var.o; i6++) {
            kn3Var.c(i6);
            i5 += 4;
        }
        lm3Var.l(i5);
        while (i2 < kn3Var.o) {
            lm3Var.m(kn3Var.c(i2));
            i2++;
        }
    }

    public static void n(int i, List list, ot2 ot2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        lm3 lm3Var = (lm3) ot2Var.n;
        int i2 = 0;
        if (!(list instanceof kn3)) {
            if (!z) {
                while (i2 < list.size()) {
                    lm3Var.f(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            lm3Var.c(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            lm3Var.l(i3);
            while (i2 < list.size()) {
                lm3Var.m(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        kn3 kn3Var = (kn3) list;
        if (!z) {
            while (i2 < kn3Var.o) {
                lm3Var.f(i, kn3Var.c(i2));
                i2++;
            }
            return;
        }
        lm3Var.c(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < kn3Var.o; i6++) {
            kn3Var.c(i6);
            i5 += 4;
        }
        lm3Var.l(i5);
        while (i2 < kn3Var.o) {
            lm3Var.m(kn3Var.c(i2));
            i2++;
        }
    }

    public static void o(int i, List list, ot2 ot2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        lm3 lm3Var = (lm3) ot2Var.n;
        int i2 = 0;
        if (!(list instanceof kn3)) {
            if (!z) {
                while (i2 < list.size()) {
                    lm3Var.d(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            lm3Var.c(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += lm3.a(((Integer) list.get(i4)).intValue());
            }
            lm3Var.l(i3);
            while (i2 < list.size()) {
                lm3Var.k(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        kn3 kn3Var = (kn3) list;
        if (!z) {
            while (i2 < kn3Var.o) {
                lm3Var.d(i, kn3Var.c(i2));
                i2++;
            }
            return;
        }
        lm3Var.c(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < kn3Var.o; i6++) {
            i5 += lm3.a(kn3Var.c(i6));
        }
        lm3Var.l(i5);
        while (i2 < kn3Var.o) {
            lm3Var.k(kn3Var.c(i2));
            i2++;
        }
    }

    public static void p(int i, List list, ot2 ot2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        lm3 lm3Var = (lm3) ot2Var.n;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                boolean booleanValue = ((Boolean) list.get(i2)).booleanValue();
                lm3Var.l(i << 3);
                lm3Var.j(booleanValue ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        lm3Var.c(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        lm3Var.l(i3);
        while (i2 < list.size()) {
            lm3Var.j(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static int q(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof co3)) {
            int i2 = 0;
            while (i < size) {
                i2 += lm3.a(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        co3 co3Var = (co3) list;
        int i3 = 0;
        while (i < size) {
            i3 += lm3.a(co3Var.b(i));
            i++;
        }
        return i3;
    }

    public static int r(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof co3)) {
            int i2 = 0;
            while (i < size) {
                i2 += lm3.a(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        co3 co3Var = (co3) list;
        int i3 = 0;
        while (i < size) {
            i3 += lm3.a(co3Var.b(i));
            i++;
        }
        return i3;
    }

    public static int s(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof co3)) {
            int i2 = 0;
            while (i < size) {
                long longValue = ((Long) list.get(i)).longValue();
                i2 += lm3.a((longValue >> 63) ^ (longValue + longValue));
                i++;
            }
            return i2;
        }
        co3 co3Var = (co3) list;
        int i3 = 0;
        while (i < size) {
            long b = co3Var.b(i);
            i3 += lm3.a((b >> 63) ^ (b + b));
            i++;
        }
        return i3;
    }

    public static int t(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof kn3)) {
            int i2 = 0;
            while (i < size) {
                i2 += lm3.a(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        kn3 kn3Var = (kn3) list;
        int i3 = 0;
        while (i < size) {
            i3 += lm3.a(kn3Var.c(i));
            i++;
        }
        return i3;
    }

    public static int u(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof kn3)) {
            int i2 = 0;
            while (i < size) {
                i2 += lm3.a(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        kn3 kn3Var = (kn3) list;
        int i3 = 0;
        while (i < size) {
            i3 += lm3.a(kn3Var.c(i));
            i++;
        }
        return i3;
    }

    public static int v(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof kn3)) {
            int i2 = 0;
            while (i < size) {
                i2 += lm3.r(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        kn3 kn3Var = (kn3) list;
        int i3 = 0;
        while (i < size) {
            i3 += lm3.r(kn3Var.c(i));
            i++;
        }
        return i3;
    }

    public static int w(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof kn3)) {
            int i2 = 0;
            while (i < size) {
                int intValue = ((Integer) list.get(i)).intValue();
                i2 += lm3.r((intValue >> 31) ^ (intValue + intValue));
                i++;
            }
            return i2;
        }
        kn3 kn3Var = (kn3) list;
        int i3 = 0;
        while (i < size) {
            int c = kn3Var.c(i);
            i3 += lm3.r((c >> 31) ^ (c + c));
            i++;
        }
        return i3;
    }

    public static int x(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (lm3.r(i << 3) + 4) * size;
    }

    public static int y(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (lm3.r(i << 3) + 8) * size;
    }
}
