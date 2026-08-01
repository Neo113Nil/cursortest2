package com.google.android.gms.internal.measurement;

import com.appsflyer.attribution.RequestError;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a2 {

    /* renamed from: a, reason: collision with root package name */
    public final a1.n f2131a;

    public a2(c3 c3Var, c3 c3Var2, Object obj) {
        this.f2131a = new a1.n(c3Var, c3Var2, obj, 8);
    }

    public static void a(b1 b1Var, a1.n nVar, Object obj, Object obj2) {
        e1.b(b1Var, (c3) nVar.f41i, 1, obj);
        e1.b(b1Var, (c3) nVar.f40e, 2, obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x020b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int b(a1.n nVar, Object obj, Object obj2) {
        int b10;
        int b11;
        int a9;
        int b12;
        int a10;
        c3 c3Var = (c3) nVar.f41i;
        c3 c3Var2 = (c3) nVar.f40e;
        int i3 = e1.f2245c;
        int i10 = 8;
        int a11 = b1.a(8);
        c3 c3Var3 = c3.f2184r;
        if (c3Var == c3Var3) {
            a11 += a11;
        }
        d3 d3Var = d3.f2213d;
        switch (c3Var.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                b10 = 8;
                int i11 = b10 + a11;
                int a12 = b1.a(16);
                if (c3Var2 == c3Var3) {
                    a12 += a12;
                }
                switch (c3Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return i10 + a12 + i11;
                    case 1:
                        ((Float) obj2).getClass();
                        i10 = 4;
                        return i10 + a12 + i11;
                    case 2:
                        i10 = b1.b(((Long) obj2).longValue());
                        return i10 + a12 + i11;
                    case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                        i10 = b1.b(((Long) obj2).longValue());
                        return i10 + a12 + i11;
                    case a4.j.LONG_FIELD_NUMBER /* 4 */:
                        i10 = b1.b(((Integer) obj2).intValue());
                        return i10 + a12 + i11;
                    case a4.j.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        return i10 + a12 + i11;
                    case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        i10 = 4;
                        return i10 + a12 + i11;
                    case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        i10 = 1;
                        return i10 + a12 + i11;
                    case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof v0) {
                            b12 = ((v0) obj2).c();
                            a10 = b1.a(b12);
                        } else {
                            b12 = b3.b((String) obj2);
                            a10 = b1.a(b12);
                        }
                        i10 = a10 + b12;
                        return i10 + a12 + i11;
                    case 9:
                        i10 = ((k1) ((o0) obj2)).m();
                        return i10 + a12 + i11;
                    case 10:
                        b12 = ((k1) ((o0) obj2)).m();
                        a10 = b1.a(b12);
                        i10 = a10 + b12;
                        return i10 + a12 + i11;
                    case RequestError.STOP_TRACKING /* 11 */:
                        if (obj2 instanceof v0) {
                            b12 = ((v0) obj2).c();
                            a10 = b1.a(b12);
                        } else {
                            b12 = ((byte[]) obj2).length;
                            a10 = b1.a(b12);
                        }
                        i10 = a10 + b12;
                        return i10 + a12 + i11;
                    case 12:
                        i10 = b1.a(((Integer) obj2).intValue());
                        return i10 + a12 + i11;
                    case 13:
                        i10 = obj2 instanceof m1 ? b1.b(((m1) obj2).a()) : b1.b(((Integer) obj2).intValue());
                        return i10 + a12 + i11;
                    case 14:
                        ((Integer) obj2).getClass();
                        i10 = 4;
                        return i10 + a12 + i11;
                    case 15:
                        ((Long) obj2).getClass();
                        return i10 + a12 + i11;
                    case 16:
                        int intValue = ((Integer) obj2).intValue();
                        i10 = b1.a((intValue >> 31) ^ (intValue + intValue));
                        return i10 + a12 + i11;
                    case 17:
                        long longValue = ((Long) obj2).longValue();
                        i10 = b1.b((longValue >> 63) ^ (longValue + longValue));
                        return i10 + a12 + i11;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 1:
                ((Float) obj).getClass();
                b10 = 4;
                int i112 = b10 + a11;
                int a122 = b1.a(16);
                if (c3Var2 == c3Var3) {
                }
                switch (c3Var2.ordinal()) {
                }
            case 2:
                b10 = b1.b(((Long) obj).longValue());
                int i1122 = b10 + a11;
                int a1222 = b1.a(16);
                if (c3Var2 == c3Var3) {
                }
                switch (c3Var2.ordinal()) {
                }
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                b10 = b1.b(((Long) obj).longValue());
                int i11222 = b10 + a11;
                int a12222 = b1.a(16);
                if (c3Var2 == c3Var3) {
                }
                switch (c3Var2.ordinal()) {
                }
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                b10 = b1.b(((Integer) obj).intValue());
                int i112222 = b10 + a11;
                int a122222 = b1.a(16);
                if (c3Var2 == c3Var3) {
                }
                switch (c3Var2.ordinal()) {
                }
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                ((Long) obj).getClass();
                b10 = 8;
                int i1122222 = b10 + a11;
                int a1222222 = b1.a(16);
                if (c3Var2 == c3Var3) {
                }
                switch (c3Var2.ordinal()) {
                }
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                ((Integer) obj).getClass();
                b10 = 4;
                int i11222222 = b10 + a11;
                int a12222222 = b1.a(16);
                if (c3Var2 == c3Var3) {
                }
                switch (c3Var2.ordinal()) {
                }
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                ((Boolean) obj).getClass();
                b10 = 1;
                int i112222222 = b10 + a11;
                int a122222222 = b1.a(16);
                if (c3Var2 == c3Var3) {
                }
                switch (c3Var2.ordinal()) {
                }
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                if (obj instanceof v0) {
                    b11 = ((v0) obj).c();
                    a9 = b1.a(b11);
                } else {
                    b11 = b3.b((String) obj);
                    a9 = b1.a(b11);
                }
                b10 = b11 + a9;
                int i1122222222 = b10 + a11;
                int a1222222222 = b1.a(16);
                if (c3Var2 == c3Var3) {
                }
                switch (c3Var2.ordinal()) {
                }
            case 9:
                b10 = ((k1) ((o0) obj)).m();
                int i11222222222 = b10 + a11;
                int a12222222222 = b1.a(16);
                if (c3Var2 == c3Var3) {
                }
                switch (c3Var2.ordinal()) {
                }
            case 10:
                b11 = ((k1) ((o0) obj)).m();
                a9 = b1.a(b11);
                b10 = b11 + a9;
                int i112222222222 = b10 + a11;
                int a122222222222 = b1.a(16);
                if (c3Var2 == c3Var3) {
                }
                switch (c3Var2.ordinal()) {
                }
            case RequestError.STOP_TRACKING /* 11 */:
                if (obj instanceof v0) {
                    b11 = ((v0) obj).c();
                    a9 = b1.a(b11);
                } else {
                    b11 = ((byte[]) obj).length;
                    a9 = b1.a(b11);
                }
                b10 = b11 + a9;
                int i1122222222222 = b10 + a11;
                int a1222222222222 = b1.a(16);
                if (c3Var2 == c3Var3) {
                }
                switch (c3Var2.ordinal()) {
                }
            case 12:
                b10 = b1.a(((Integer) obj).intValue());
                int i11222222222222 = b10 + a11;
                int a12222222222222 = b1.a(16);
                if (c3Var2 == c3Var3) {
                }
                switch (c3Var2.ordinal()) {
                }
            case 13:
                b10 = obj instanceof m1 ? b1.b(((m1) obj).a()) : b1.b(((Integer) obj).intValue());
                int i112222222222222 = b10 + a11;
                int a122222222222222 = b1.a(16);
                if (c3Var2 == c3Var3) {
                }
                switch (c3Var2.ordinal()) {
                }
            case 14:
                ((Integer) obj).getClass();
                b10 = 4;
                int i1122222222222222 = b10 + a11;
                int a1222222222222222 = b1.a(16);
                if (c3Var2 == c3Var3) {
                }
                switch (c3Var2.ordinal()) {
                }
            case 15:
                ((Long) obj).getClass();
                b10 = 8;
                int i11222222222222222 = b10 + a11;
                int a12222222222222222 = b1.a(16);
                if (c3Var2 == c3Var3) {
                }
                switch (c3Var2.ordinal()) {
                }
            case 16:
                int intValue2 = ((Integer) obj).intValue();
                b10 = b1.a((intValue2 >> 31) ^ (intValue2 + intValue2));
                int i112222222222222222 = b10 + a11;
                int a122222222222222222 = b1.a(16);
                if (c3Var2 == c3Var3) {
                }
                switch (c3Var2.ordinal()) {
                }
            case 17:
                long longValue2 = ((Long) obj).longValue();
                b10 = b1.b((longValue2 >> 63) ^ (longValue2 + longValue2));
                int i1122222222222222222 = b10 + a11;
                int a1222222222222222222 = b1.a(16);
                if (c3Var2 == c3Var3) {
                }
                switch (c3Var2.ordinal()) {
                }
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public final a1.n c() {
        return this.f2131a;
    }
}
