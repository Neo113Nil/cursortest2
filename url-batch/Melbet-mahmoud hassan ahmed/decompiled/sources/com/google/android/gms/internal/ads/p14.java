package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class p14 {

    /* renamed from: f, reason: collision with root package name */
    public static final my3<p14> f9994f = new my3() { // from class: com.google.android.gms.internal.ads.o04
    };

    /* renamed from: a, reason: collision with root package name */
    public final int f9995a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9996b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9997c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f9998d;

    /* renamed from: e, reason: collision with root package name */
    private int f9999e;

    public p14(int i7, int i8, int i9, byte[] bArr) {
        this.f9995a = i7;
        this.f9996b = i8;
        this.f9997c = i9;
        this.f9998d = bArr;
    }

    public static int a(int i7) {
        if (i7 == 1) {
            return 1;
        }
        if (i7 != 9) {
            return (i7 == 4 || i7 == 5 || i7 == 6 || i7 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int b(int i7) {
        if (i7 == 1) {
            return 3;
        }
        if (i7 == 16) {
            return 6;
        }
        if (i7 != 18) {
            return (i7 == 6 || i7 == 7) ? 3 : -1;
        }
        return 7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p14.class == obj.getClass()) {
            p14 p14Var = (p14) obj;
            if (this.f9995a == p14Var.f9995a && this.f9996b == p14Var.f9996b && this.f9997c == p14Var.f9997c && Arrays.equals(this.f9998d, p14Var.f9998d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.f9999e;
        if (i7 != 0) {
            return i7;
        }
        int hashCode = ((((((this.f9995a + 527) * 31) + this.f9996b) * 31) + this.f9997c) * 31) + Arrays.hashCode(this.f9998d);
        this.f9999e = hashCode;
        return hashCode;
    }

    public final String toString() {
        int i7 = this.f9995a;
        int i8 = this.f9996b;
        int i9 = this.f9997c;
        boolean z6 = this.f9998d != null;
        StringBuilder sb = new StringBuilder(55);
        sb.append("ColorInfo(");
        sb.append(i7);
        sb.append(", ");
        sb.append(i8);
        sb.append(", ");
        sb.append(i9);
        sb.append(", ");
        sb.append(z6);
        sb.append(")");
        return sb.toString();
    }
}
