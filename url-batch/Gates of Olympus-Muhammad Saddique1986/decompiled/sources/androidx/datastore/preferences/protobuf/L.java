package androidx.datastore.preferences.protobuf;

import java.util.Map;
import r.AbstractC0856c;

/* loaded from: classes.dex */
public final class L {
    /* JADX WARN: Removed duplicated region for block: B:14:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0135 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(Object obj, int i3, Object obj2) {
        int H3;
        int a3;
        int F3;
        y0 y0Var;
        int H4;
        int a4;
        int F4;
        K k3 = (K) obj;
        J j3 = (J) obj2;
        int i4 = 0;
        if (!k3.isEmpty()) {
            for (Map.Entry entry : k3.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                j3.getClass();
                int D = C0258l.D(i3);
                I i5 = j3.f5002a;
                int i6 = C0263q.f5113c;
                int D3 = C0258l.D(1);
                x0 x0Var = A0.f4977g;
                w0 w0Var = i5.f4999a;
                if (w0Var == x0Var) {
                    D3 *= 2;
                }
                switch (w0Var.ordinal()) {
                    case 0:
                        ((Double) key).getClass();
                        H3 = 8;
                        int i7 = H3 + D3;
                        int D4 = C0258l.D(2);
                        y0Var = i5.f5000b;
                        if (y0Var == x0Var) {
                            D4 *= 2;
                        }
                        switch (y0Var.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                H4 = 8;
                                int i8 = H4 + D4 + i7;
                                i4 = A.k.b(i8, i8, D, i4);
                            case 1:
                                ((Float) value).getClass();
                                H4 = 4;
                                int i82 = H4 + D4 + i7;
                                i4 = A.k.b(i82, i82, D, i4);
                            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                                H4 = C0258l.H(((Long) value).longValue());
                                int i822 = H4 + D4 + i7;
                                i4 = A.k.b(i822, i822, D, i4);
                            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                                H4 = C0258l.H(((Long) value).longValue());
                                int i8222 = H4 + D4 + i7;
                                i4 = A.k.b(i8222, i8222, D, i4);
                            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                                H4 = C0258l.v(((Integer) value).intValue());
                                int i82222 = H4 + D4 + i7;
                                i4 = A.k.b(i82222, i82222, D, i4);
                            case 5:
                                ((Long) value).getClass();
                                H4 = 8;
                                int i822222 = H4 + D4 + i7;
                                i4 = A.k.b(i822222, i822222, D, i4);
                            case 6:
                                ((Integer) value).getClass();
                                H4 = 4;
                                int i8222222 = H4 + D4 + i7;
                                i4 = A.k.b(i8222222, i8222222, D, i4);
                            case k1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                                ((Boolean) value).getClass();
                                H4 = 1;
                                int i82222222 = H4 + D4 + i7;
                                i4 = A.k.b(i82222222, i82222222, D, i4);
                            case k1.i.BYTES_FIELD_NUMBER /* 8 */:
                                H4 = value instanceof C0253g ? C0258l.n((C0253g) value) : C0258l.C((String) value);
                                int i822222222 = H4 + D4 + i7;
                                i4 = A.k.b(i822222222, i822222222, D, i4);
                            case AbstractC0856c.f8037c /* 9 */:
                                H4 = ((AbstractC0267v) ((AbstractC0245a) value)).a(null);
                                int i8222222222 = H4 + D4 + i7;
                                i4 = A.k.b(i8222222222, i8222222222, D, i4);
                            case AbstractC0856c.f8039e /* 10 */:
                                a4 = ((AbstractC0267v) ((AbstractC0245a) value)).a(null);
                                F4 = C0258l.F(a4);
                                H4 = F4 + a4;
                                int i82222222222 = H4 + D4 + i7;
                                i4 = A.k.b(i82222222222, i82222222222, D, i4);
                            case 11:
                                if (value instanceof C0253g) {
                                    H4 = C0258l.n((C0253g) value);
                                    int i822222222222 = H4 + D4 + i7;
                                    i4 = A.k.b(i822222222222, i822222222222, D, i4);
                                } else {
                                    a4 = ((byte[]) value).length;
                                    F4 = C0258l.F(a4);
                                    H4 = F4 + a4;
                                    int i8222222222222 = H4 + D4 + i7;
                                    i4 = A.k.b(i8222222222222, i8222222222222, D, i4);
                                }
                            case 12:
                                H4 = C0258l.F(((Integer) value).intValue());
                                int i82222222222222 = H4 + D4 + i7;
                                i4 = A.k.b(i82222222222222, i82222222222222, D, i4);
                            case 13:
                                H4 = C0258l.v(((Integer) value).intValue());
                                int i822222222222222 = H4 + D4 + i7;
                                i4 = A.k.b(i822222222222222, i822222222222222, D, i4);
                            case 14:
                                ((Integer) value).getClass();
                                H4 = 4;
                                int i8222222222222222 = H4 + D4 + i7;
                                i4 = A.k.b(i8222222222222222, i8222222222222222, D, i4);
                            case AbstractC0856c.f8041g /* 15 */:
                                ((Long) value).getClass();
                                H4 = 8;
                                int i82222222222222222 = H4 + D4 + i7;
                                i4 = A.k.b(i82222222222222222, i82222222222222222, D, i4);
                            case 16:
                                int intValue = ((Integer) value).intValue();
                                H4 = C0258l.F((intValue >> 31) ^ (intValue << 1));
                                int i822222222222222222 = H4 + D4 + i7;
                                i4 = A.k.b(i822222222222222222, i822222222222222222, D, i4);
                            case 17:
                                long longValue = ((Long) value).longValue();
                                H4 = C0258l.H((longValue >> 63) ^ (longValue << 1));
                                int i8222222222222222222 = H4 + D4 + i7;
                                i4 = A.k.b(i8222222222222222222, i8222222222222222222, D, i4);
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                    case 1:
                        ((Float) key).getClass();
                        H3 = 4;
                        int i72 = H3 + D3;
                        int D42 = C0258l.D(2);
                        y0Var = i5.f5000b;
                        if (y0Var == x0Var) {
                        }
                        switch (y0Var.ordinal()) {
                        }
                    case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                        H3 = C0258l.H(((Long) key).longValue());
                        int i722 = H3 + D3;
                        int D422 = C0258l.D(2);
                        y0Var = i5.f5000b;
                        if (y0Var == x0Var) {
                        }
                        switch (y0Var.ordinal()) {
                        }
                    case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                        H3 = C0258l.H(((Long) key).longValue());
                        int i7222 = H3 + D3;
                        int D4222 = C0258l.D(2);
                        y0Var = i5.f5000b;
                        if (y0Var == x0Var) {
                        }
                        switch (y0Var.ordinal()) {
                        }
                    case k1.i.LONG_FIELD_NUMBER /* 4 */:
                        H3 = C0258l.v(((Integer) key).intValue());
                        int i72222 = H3 + D3;
                        int D42222 = C0258l.D(2);
                        y0Var = i5.f5000b;
                        if (y0Var == x0Var) {
                        }
                        switch (y0Var.ordinal()) {
                        }
                    case 5:
                        ((Long) key).getClass();
                        H3 = 8;
                        int i722222 = H3 + D3;
                        int D422222 = C0258l.D(2);
                        y0Var = i5.f5000b;
                        if (y0Var == x0Var) {
                        }
                        switch (y0Var.ordinal()) {
                        }
                    case 6:
                        ((Integer) key).getClass();
                        H3 = 4;
                        int i7222222 = H3 + D3;
                        int D4222222 = C0258l.D(2);
                        y0Var = i5.f5000b;
                        if (y0Var == x0Var) {
                        }
                        switch (y0Var.ordinal()) {
                        }
                    case k1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) key).getClass();
                        H3 = 1;
                        int i72222222 = H3 + D3;
                        int D42222222 = C0258l.D(2);
                        y0Var = i5.f5000b;
                        if (y0Var == x0Var) {
                        }
                        switch (y0Var.ordinal()) {
                        }
                    case k1.i.BYTES_FIELD_NUMBER /* 8 */:
                        H3 = key instanceof C0253g ? C0258l.n((C0253g) key) : C0258l.C((String) key);
                        int i722222222 = H3 + D3;
                        int D422222222 = C0258l.D(2);
                        y0Var = i5.f5000b;
                        if (y0Var == x0Var) {
                        }
                        switch (y0Var.ordinal()) {
                        }
                    case AbstractC0856c.f8037c /* 9 */:
                        H3 = ((AbstractC0267v) ((AbstractC0245a) key)).a(null);
                        int i7222222222 = H3 + D3;
                        int D4222222222 = C0258l.D(2);
                        y0Var = i5.f5000b;
                        if (y0Var == x0Var) {
                        }
                        switch (y0Var.ordinal()) {
                        }
                    case AbstractC0856c.f8039e /* 10 */:
                        a3 = ((AbstractC0267v) ((AbstractC0245a) key)).a(null);
                        F3 = C0258l.F(a3);
                        H3 = a3 + F3;
                        int i72222222222 = H3 + D3;
                        int D42222222222 = C0258l.D(2);
                        y0Var = i5.f5000b;
                        if (y0Var == x0Var) {
                        }
                        switch (y0Var.ordinal()) {
                        }
                    case 11:
                        if (key instanceof C0253g) {
                            H3 = C0258l.n((C0253g) key);
                            int i722222222222 = H3 + D3;
                            int D422222222222 = C0258l.D(2);
                            y0Var = i5.f5000b;
                            if (y0Var == x0Var) {
                            }
                            switch (y0Var.ordinal()) {
                            }
                        } else {
                            a3 = ((byte[]) key).length;
                            F3 = C0258l.F(a3);
                            H3 = a3 + F3;
                            int i7222222222222 = H3 + D3;
                            int D4222222222222 = C0258l.D(2);
                            y0Var = i5.f5000b;
                            if (y0Var == x0Var) {
                            }
                            switch (y0Var.ordinal()) {
                            }
                        }
                    case 12:
                        H3 = C0258l.F(((Integer) key).intValue());
                        int i72222222222222 = H3 + D3;
                        int D42222222222222 = C0258l.D(2);
                        y0Var = i5.f5000b;
                        if (y0Var == x0Var) {
                        }
                        switch (y0Var.ordinal()) {
                        }
                    case 13:
                        H3 = C0258l.v(((Integer) key).intValue());
                        int i722222222222222 = H3 + D3;
                        int D422222222222222 = C0258l.D(2);
                        y0Var = i5.f5000b;
                        if (y0Var == x0Var) {
                        }
                        switch (y0Var.ordinal()) {
                        }
                    case 14:
                        ((Integer) key).getClass();
                        H3 = 4;
                        int i7222222222222222 = H3 + D3;
                        int D4222222222222222 = C0258l.D(2);
                        y0Var = i5.f5000b;
                        if (y0Var == x0Var) {
                        }
                        switch (y0Var.ordinal()) {
                        }
                    case AbstractC0856c.f8041g /* 15 */:
                        ((Long) key).getClass();
                        H3 = 8;
                        int i72222222222222222 = H3 + D3;
                        int D42222222222222222 = C0258l.D(2);
                        y0Var = i5.f5000b;
                        if (y0Var == x0Var) {
                        }
                        switch (y0Var.ordinal()) {
                        }
                    case 16:
                        int intValue2 = ((Integer) key).intValue();
                        H3 = C0258l.F((intValue2 >> 31) ^ (intValue2 << 1));
                        int i722222222222222222 = H3 + D3;
                        int D422222222222222222 = C0258l.D(2);
                        y0Var = i5.f5000b;
                        if (y0Var == x0Var) {
                        }
                        switch (y0Var.ordinal()) {
                        }
                    case 17:
                        long longValue2 = ((Long) key).longValue();
                        H3 = C0258l.H((longValue2 << 1) ^ (longValue2 >> 63));
                        int i7222222222222222222 = H3 + D3;
                        int D4222222222222222222 = C0258l.D(2);
                        y0Var = i5.f5000b;
                        if (y0Var == x0Var) {
                        }
                        switch (y0Var.ordinal()) {
                        }
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            }
        }
        return i4;
    }

    public static K b(Object obj, Object obj2) {
        K k3 = (K) obj;
        K k4 = (K) obj2;
        if (!k4.isEmpty()) {
            if (!k3.f5004d) {
                k3 = k3.b();
            }
            k3.a();
            if (!k4.isEmpty()) {
                k3.putAll(k4);
            }
        }
        return k3;
    }

    public static void c(Object obj) {
        ((K) obj).f5004d = false;
    }
}
