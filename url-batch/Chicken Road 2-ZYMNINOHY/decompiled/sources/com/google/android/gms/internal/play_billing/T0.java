package com.google.android.gms.internal.play_billing;

import androidx.datastore.preferences.protobuf.C0179l;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class T0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C0349u0 f5912a;

    static {
        P0 p02 = P0.f5897c;
        f5912a = new C0349u0(6);
    }

    public static void a(int i4, List list, H0 h02, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0338o0 c0338o0 = (C0338o0) h02.f5850a;
        int i5 = 0;
        if (!(list instanceof C0355x0)) {
            if (!z) {
                while (i5 < list.size()) {
                    int intValue = ((Integer) list.get(i5)).intValue();
                    c0338o0.i0(i4, (intValue >> 31) ^ (intValue + intValue));
                    i5++;
                }
                return;
            }
            c0338o0.h0(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                int intValue2 = ((Integer) list.get(i7)).intValue();
                i6 += C0338o0.W((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            c0338o0.j0(i6);
            while (i5 < list.size()) {
                int intValue3 = ((Integer) list.get(i5)).intValue();
                c0338o0.j0((intValue3 >> 31) ^ (intValue3 + intValue3));
                i5++;
            }
            return;
        }
        C0355x0 c0355x0 = (C0355x0) list;
        if (!z) {
            while (i5 < c0355x0.f6032c) {
                int c4 = c0355x0.c(i5);
                c0338o0.i0(i4, (c4 >> 31) ^ (c4 + c4));
                i5++;
            }
            return;
        }
        c0338o0.h0(i4, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < c0355x0.f6032c; i9++) {
            int c5 = c0355x0.c(i9);
            i8 += C0338o0.W((c5 >> 31) ^ (c5 + c5));
        }
        c0338o0.j0(i8);
        while (i5 < c0355x0.f6032c) {
            int c6 = c0355x0.c(i5);
            c0338o0.j0((c6 >> 31) ^ (c6 + c6));
            i5++;
        }
    }

    public static void b(int i4, List list, H0 h02, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0338o0 c0338o0 = (C0338o0) h02.f5850a;
        int i5 = 0;
        if (!z) {
            while (i5 < list.size()) {
                long longValue = ((Long) list.get(i5)).longValue();
                c0338o0.k0(i4, (longValue >> 63) ^ (longValue + longValue));
                i5++;
            }
            return;
        }
        c0338o0.h0(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            long longValue2 = ((Long) list.get(i7)).longValue();
            i6 += C0338o0.X((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        c0338o0.j0(i6);
        while (i5 < list.size()) {
            long longValue3 = ((Long) list.get(i5)).longValue();
            c0338o0.l0((longValue3 >> 63) ^ (longValue3 + longValue3));
            i5++;
        }
    }

    public static void c(int i4, List list, H0 h02, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0338o0 c0338o0 = (C0338o0) h02.f5850a;
        int i5 = 0;
        if (!(list instanceof C0355x0)) {
            if (!z) {
                while (i5 < list.size()) {
                    c0338o0.i0(i4, ((Integer) list.get(i5)).intValue());
                    i5++;
                }
                return;
            }
            c0338o0.h0(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += C0338o0.W(((Integer) list.get(i7)).intValue());
            }
            c0338o0.j0(i6);
            while (i5 < list.size()) {
                c0338o0.j0(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        C0355x0 c0355x0 = (C0355x0) list;
        if (!z) {
            while (i5 < c0355x0.f6032c) {
                c0338o0.i0(i4, c0355x0.c(i5));
                i5++;
            }
            return;
        }
        c0338o0.h0(i4, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < c0355x0.f6032c; i9++) {
            i8 += C0338o0.W(c0355x0.c(i9));
        }
        c0338o0.j0(i8);
        while (i5 < c0355x0.f6032c) {
            c0338o0.j0(c0355x0.c(i5));
            i5++;
        }
    }

    public static void d(int i4, List list, H0 h02, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0338o0 c0338o0 = (C0338o0) h02.f5850a;
        int i5 = 0;
        if (!z) {
            while (i5 < list.size()) {
                c0338o0.k0(i4, ((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        c0338o0.h0(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            i6 += C0338o0.X(((Long) list.get(i7)).longValue());
        }
        c0338o0.j0(i6);
        while (i5 < list.size()) {
            c0338o0.l0(((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    public static boolean e(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int f(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0355x0)) {
            int i5 = 0;
            while (i4 < size) {
                i5 += C0338o0.X(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return i5;
        }
        C0355x0 c0355x0 = (C0355x0) list;
        int i6 = 0;
        while (i4 < size) {
            i6 += C0338o0.X(c0355x0.c(i4));
            i4++;
        }
        return i6;
    }

    public static int g(int i4, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0338o0.W(i4 << 3) + 4) * size;
    }

    public static int h(int i4, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0338o0.W(i4 << 3) + 8) * size;
    }

    public static int i(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0355x0)) {
            int i5 = 0;
            while (i4 < size) {
                i5 += C0338o0.X(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return i5;
        }
        C0355x0 c0355x0 = (C0355x0) list;
        int i6 = 0;
        while (i4 < size) {
            i6 += C0338o0.X(c0355x0.c(i4));
            i4++;
        }
        return i6;
    }

    public static int j(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += C0338o0.X(((Long) list.get(i5)).longValue());
        }
        return i4;
    }

    public static int k(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0355x0)) {
            int i5 = 0;
            while (i4 < size) {
                int intValue = ((Integer) list.get(i4)).intValue();
                i5 += C0338o0.W((intValue >> 31) ^ (intValue + intValue));
                i4++;
            }
            return i5;
        }
        C0355x0 c0355x0 = (C0355x0) list;
        int i6 = 0;
        while (i4 < size) {
            int c4 = c0355x0.c(i4);
            i6 += C0338o0.W((c4 >> 31) ^ (c4 + c4));
            i4++;
        }
        return i6;
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            long longValue = ((Long) list.get(i5)).longValue();
            i4 += C0338o0.X((longValue >> 63) ^ (longValue + longValue));
        }
        return i4;
    }

    public static int m(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0355x0)) {
            int i5 = 0;
            while (i4 < size) {
                i5 += C0338o0.W(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return i5;
        }
        C0355x0 c0355x0 = (C0355x0) list;
        int i6 = 0;
        while (i4 < size) {
            i6 += C0338o0.W(c0355x0.c(i4));
            i4++;
        }
        return i6;
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += C0338o0.X(((Long) list.get(i5)).longValue());
        }
        return i4;
    }

    public static Object o(Object obj, int i4, int i5, Object obj2, C0349u0 c0349u0) {
        Object obj3 = obj2;
        if (obj2 == null) {
            c0349u0.getClass();
            AbstractC0353w0 abstractC0353w0 = (AbstractC0353w0) obj;
            W0 w02 = abstractC0353w0.zzc;
            obj3 = w02;
            if (w02 == W0.f5922f) {
                W0 b4 = W0.b();
                abstractC0353w0.zzc = b4;
                obj3 = b4;
            }
        }
        ((W0) obj3).c(i4 << 3, Long.valueOf(i5));
        return obj3;
    }

    public static void p(Object obj, Object obj2) {
        AbstractC0353w0 abstractC0353w0 = (AbstractC0353w0) obj;
        W0 w02 = abstractC0353w0.zzc;
        W0 w03 = ((AbstractC0353w0) obj2).zzc;
        W0 w04 = W0.f5922f;
        if (!w04.equals(w03)) {
            if (w04.equals(w02)) {
                int i4 = w02.f5923a + w03.f5923a;
                int[] copyOf = Arrays.copyOf(w02.f5924b, i4);
                System.arraycopy(w03.f5924b, 0, copyOf, w02.f5923a, w03.f5923a);
                Object[] copyOf2 = Arrays.copyOf(w02.f5925c, i4);
                System.arraycopy(w03.f5925c, 0, copyOf2, w02.f5923a, w03.f5923a);
                w02 = new W0(i4, copyOf, copyOf2, true);
            } else {
                w02.getClass();
                if (!w03.equals(w04)) {
                    if (!w02.f5927e) {
                        throw new UnsupportedOperationException();
                    }
                    int i5 = w02.f5923a + w03.f5923a;
                    w02.e(i5);
                    System.arraycopy(w03.f5924b, 0, w02.f5924b, w02.f5923a, w03.f5923a);
                    System.arraycopy(w03.f5925c, 0, w02.f5925c, w02.f5923a, w03.f5923a);
                    w02.f5923a = i5;
                }
            }
        }
        abstractC0353w0.zzc = w02;
    }

    public static void q(int i4, List list, H0 h02, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0338o0 c0338o0 = (C0338o0) h02.f5850a;
        int i5 = 0;
        if (!z) {
            while (i5 < list.size()) {
                byte booleanValue = ((Boolean) list.get(i5)).booleanValue();
                c0338o0.j0(i4 << 3);
                int i6 = c0338o0.f5993d;
                try {
                    int i7 = i6 + 1;
                    try {
                        c0338o0.f5991b[i6] = booleanValue;
                        c0338o0.f5993d = i7;
                        i5++;
                    } catch (IndexOutOfBoundsException e4) {
                        e = e4;
                        i6 = i7;
                        throw new C0179l(i6, c0338o0.f5992c, 1, e);
                    }
                } catch (IndexOutOfBoundsException e5) {
                    e = e5;
                }
            }
            return;
        }
        c0338o0.h0(i4, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            ((Boolean) list.get(i9)).getClass();
            i8++;
        }
        c0338o0.j0(i8);
        while (i5 < list.size()) {
            byte booleanValue2 = ((Boolean) list.get(i5)).booleanValue();
            int i10 = c0338o0.f5993d;
            try {
                int i11 = i10 + 1;
                try {
                    c0338o0.f5991b[i10] = booleanValue2;
                    c0338o0.f5993d = i11;
                    i5++;
                } catch (IndexOutOfBoundsException e6) {
                    e = e6;
                    i10 = i11;
                    throw new C0179l(i10, c0338o0.f5992c, 1, e);
                }
            } catch (IndexOutOfBoundsException e7) {
                e = e7;
            }
        }
    }

    public static void r(int i4, List list, H0 h02, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0338o0 c0338o0 = (C0338o0) h02.f5850a;
        int i5 = 0;
        if (!z) {
            while (i5 < list.size()) {
                c0338o0.c0(i4, Double.doubleToRawLongBits(((Double) list.get(i5)).doubleValue()));
                i5++;
            }
            return;
        }
        c0338o0.h0(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Double) list.get(i7)).getClass();
            i6 += 8;
        }
        c0338o0.j0(i6);
        while (i5 < list.size()) {
            c0338o0.d0(Double.doubleToRawLongBits(((Double) list.get(i5)).doubleValue()));
            i5++;
        }
    }

    public static void s(int i4, List list, H0 h02, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0338o0 c0338o0 = (C0338o0) h02.f5850a;
        int i5 = 0;
        if (!(list instanceof C0355x0)) {
            if (!z) {
                while (i5 < list.size()) {
                    c0338o0.e0(i4, ((Integer) list.get(i5)).intValue());
                    i5++;
                }
                return;
            }
            c0338o0.h0(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += C0338o0.X(((Integer) list.get(i7)).intValue());
            }
            c0338o0.j0(i6);
            while (i5 < list.size()) {
                c0338o0.f0(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        C0355x0 c0355x0 = (C0355x0) list;
        if (!z) {
            while (i5 < c0355x0.f6032c) {
                c0338o0.e0(i4, c0355x0.c(i5));
                i5++;
            }
            return;
        }
        c0338o0.h0(i4, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < c0355x0.f6032c; i9++) {
            i8 += C0338o0.X(c0355x0.c(i9));
        }
        c0338o0.j0(i8);
        while (i5 < c0355x0.f6032c) {
            c0338o0.f0(c0355x0.c(i5));
            i5++;
        }
    }

    public static void t(int i4, List list, H0 h02, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0338o0 c0338o0 = (C0338o0) h02.f5850a;
        int i5 = 0;
        if (!(list instanceof C0355x0)) {
            if (!z) {
                while (i5 < list.size()) {
                    c0338o0.a0(i4, ((Integer) list.get(i5)).intValue());
                    i5++;
                }
                return;
            }
            c0338o0.h0(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Integer) list.get(i7)).getClass();
                i6 += 4;
            }
            c0338o0.j0(i6);
            while (i5 < list.size()) {
                c0338o0.b0(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        C0355x0 c0355x0 = (C0355x0) list;
        if (!z) {
            while (i5 < c0355x0.f6032c) {
                c0338o0.a0(i4, c0355x0.c(i5));
                i5++;
            }
            return;
        }
        c0338o0.h0(i4, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < c0355x0.f6032c; i9++) {
            c0355x0.c(i9);
            i8 += 4;
        }
        c0338o0.j0(i8);
        while (i5 < c0355x0.f6032c) {
            c0338o0.b0(c0355x0.c(i5));
            i5++;
        }
    }

    public static void u(int i4, List list, H0 h02, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0338o0 c0338o0 = (C0338o0) h02.f5850a;
        int i5 = 0;
        if (!z) {
            while (i5 < list.size()) {
                c0338o0.c0(i4, ((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        c0338o0.h0(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Long) list.get(i7)).getClass();
            i6 += 8;
        }
        c0338o0.j0(i6);
        while (i5 < list.size()) {
            c0338o0.d0(((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    public static void v(int i4, List list, H0 h02, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0338o0 c0338o0 = (C0338o0) h02.f5850a;
        int i5 = 0;
        if (!z) {
            while (i5 < list.size()) {
                c0338o0.a0(i4, Float.floatToRawIntBits(((Float) list.get(i5)).floatValue()));
                i5++;
            }
            return;
        }
        c0338o0.h0(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Float) list.get(i7)).getClass();
            i6 += 4;
        }
        c0338o0.j0(i6);
        while (i5 < list.size()) {
            c0338o0.b0(Float.floatToRawIntBits(((Float) list.get(i5)).floatValue()));
            i5++;
        }
    }

    public static void w(int i4, List list, H0 h02, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0338o0 c0338o0 = (C0338o0) h02.f5850a;
        int i5 = 0;
        if (!(list instanceof C0355x0)) {
            if (!z) {
                while (i5 < list.size()) {
                    c0338o0.e0(i4, ((Integer) list.get(i5)).intValue());
                    i5++;
                }
                return;
            }
            c0338o0.h0(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += C0338o0.X(((Integer) list.get(i7)).intValue());
            }
            c0338o0.j0(i6);
            while (i5 < list.size()) {
                c0338o0.f0(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        C0355x0 c0355x0 = (C0355x0) list;
        if (!z) {
            while (i5 < c0355x0.f6032c) {
                c0338o0.e0(i4, c0355x0.c(i5));
                i5++;
            }
            return;
        }
        c0338o0.h0(i4, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < c0355x0.f6032c; i9++) {
            i8 += C0338o0.X(c0355x0.c(i9));
        }
        c0338o0.j0(i8);
        while (i5 < c0355x0.f6032c) {
            c0338o0.f0(c0355x0.c(i5));
            i5++;
        }
    }

    public static void x(int i4, List list, H0 h02, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0338o0 c0338o0 = (C0338o0) h02.f5850a;
        int i5 = 0;
        if (!z) {
            while (i5 < list.size()) {
                c0338o0.k0(i4, ((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        c0338o0.h0(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            i6 += C0338o0.X(((Long) list.get(i7)).longValue());
        }
        c0338o0.j0(i6);
        while (i5 < list.size()) {
            c0338o0.l0(((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    public static void y(int i4, List list, H0 h02, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0338o0 c0338o0 = (C0338o0) h02.f5850a;
        int i5 = 0;
        if (!(list instanceof C0355x0)) {
            if (!z) {
                while (i5 < list.size()) {
                    c0338o0.a0(i4, ((Integer) list.get(i5)).intValue());
                    i5++;
                }
                return;
            }
            c0338o0.h0(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Integer) list.get(i7)).getClass();
                i6 += 4;
            }
            c0338o0.j0(i6);
            while (i5 < list.size()) {
                c0338o0.b0(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        C0355x0 c0355x0 = (C0355x0) list;
        if (!z) {
            while (i5 < c0355x0.f6032c) {
                c0338o0.a0(i4, c0355x0.c(i5));
                i5++;
            }
            return;
        }
        c0338o0.h0(i4, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < c0355x0.f6032c; i9++) {
            c0355x0.c(i9);
            i8 += 4;
        }
        c0338o0.j0(i8);
        while (i5 < c0355x0.f6032c) {
            c0338o0.b0(c0355x0.c(i5));
            i5++;
        }
    }

    public static void z(int i4, List list, H0 h02, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0338o0 c0338o0 = (C0338o0) h02.f5850a;
        int i5 = 0;
        if (!z) {
            while (i5 < list.size()) {
                c0338o0.c0(i4, ((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        c0338o0.h0(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Long) list.get(i7)).getClass();
            i6 += 8;
        }
        c0338o0.j0(i6);
        while (i5 < list.size()) {
            c0338o0.d0(((Long) list.get(i5)).longValue());
            i5++;
        }
    }
}
