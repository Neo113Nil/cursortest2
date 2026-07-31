package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class c0 {
    private static final c0 G = new c0(new bf4());
    public static final my3<c0> H = new my3() { // from class: com.google.android.gms.internal.ads.zc4
    };
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    private int F;

    /* renamed from: a, reason: collision with root package name */
    public final String f3649a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3650b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3651c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3652d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3653e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3654f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3655g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3656h;

    /* renamed from: i, reason: collision with root package name */
    public final String f3657i;

    /* renamed from: j, reason: collision with root package name */
    public final c91 f3658j;

    /* renamed from: k, reason: collision with root package name */
    public final String f3659k;

    /* renamed from: l, reason: collision with root package name */
    public final String f3660l;

    /* renamed from: m, reason: collision with root package name */
    public final int f3661m;

    /* renamed from: n, reason: collision with root package name */
    public final List<byte[]> f3662n;

    /* renamed from: o, reason: collision with root package name */
    public final u74 f3663o;

    /* renamed from: p, reason: collision with root package name */
    public final long f3664p;

    /* renamed from: q, reason: collision with root package name */
    public final int f3665q;

    /* renamed from: r, reason: collision with root package name */
    public final int f3666r;

    /* renamed from: s, reason: collision with root package name */
    public final float f3667s;

    /* renamed from: t, reason: collision with root package name */
    public final int f3668t;

    /* renamed from: u, reason: collision with root package name */
    public final float f3669u;

    /* renamed from: v, reason: collision with root package name */
    public final byte[] f3670v;

    /* renamed from: w, reason: collision with root package name */
    public final int f3671w;

    /* renamed from: x, reason: collision with root package name */
    public final p14 f3672x;

    /* renamed from: y, reason: collision with root package name */
    public final int f3673y;

    /* renamed from: z, reason: collision with root package name */
    public final int f3674z;

    private c0(bf4 bf4Var) {
        String str;
        String str2;
        String str3;
        int i7;
        int i8;
        int i9;
        String str4;
        c91 c91Var;
        String str5;
        String str6;
        int i10;
        List list;
        u74 u74Var;
        long j7;
        int i11;
        int i12;
        float f7;
        int i13;
        float f8;
        byte[] bArr;
        int i14;
        p14 p14Var;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        str = bf4Var.f3391a;
        this.f3649a = str;
        str2 = bf4Var.f3392b;
        this.f3650b = str2;
        str3 = bf4Var.f3393c;
        this.f3651c = n13.k(str3);
        i7 = bf4Var.f3394d;
        this.f3652d = i7;
        this.f3653e = 0;
        i8 = bf4Var.f3395e;
        this.f3654f = i8;
        i9 = bf4Var.f3396f;
        this.f3655g = i9;
        this.f3656h = i9 != -1 ? i9 : i8;
        str4 = bf4Var.f3397g;
        this.f3657i = str4;
        c91Var = bf4Var.f3398h;
        this.f3658j = c91Var;
        str5 = bf4Var.f3399i;
        this.f3659k = str5;
        str6 = bf4Var.f3400j;
        this.f3660l = str6;
        i10 = bf4Var.f3401k;
        this.f3661m = i10;
        list = bf4Var.f3402l;
        this.f3662n = list == null ? Collections.emptyList() : bf4Var.f3402l;
        u74Var = bf4Var.f3403m;
        this.f3663o = u74Var;
        j7 = bf4Var.f3404n;
        this.f3664p = j7;
        i11 = bf4Var.f3405o;
        this.f3665q = i11;
        i12 = bf4Var.f3406p;
        this.f3666r = i12;
        f7 = bf4Var.f3407q;
        this.f3667s = f7;
        i13 = bf4Var.f3408r;
        this.f3668t = i13 == -1 ? 0 : bf4Var.f3408r;
        f8 = bf4Var.f3409s;
        this.f3669u = f8 == -1.0f ? 1.0f : bf4Var.f3409s;
        bArr = bf4Var.f3410t;
        this.f3670v = bArr;
        i14 = bf4Var.f3411u;
        this.f3671w = i14;
        p14Var = bf4Var.f3412v;
        this.f3672x = p14Var;
        i15 = bf4Var.f3413w;
        this.f3673y = i15;
        i16 = bf4Var.f3414x;
        this.f3674z = i16;
        i17 = bf4Var.f3415y;
        this.A = i17;
        i18 = bf4Var.f3416z;
        this.B = i18 == -1 ? 0 : bf4Var.f3416z;
        i19 = bf4Var.A;
        this.C = i19 != -1 ? bf4Var.A : 0;
        i20 = bf4Var.B;
        this.D = i20;
        i21 = bf4Var.C;
        this.E = (i21 != 0 || u74Var == null) ? bf4Var.C : 1;
    }

    public final int a() {
        int i7;
        int i8 = this.f3665q;
        if (i8 == -1 || (i7 = this.f3666r) == -1) {
            return -1;
        }
        return i8 * i7;
    }

    public final bf4 b() {
        return new bf4(this, null);
    }

    public final c0 c(int i7) {
        bf4 bf4Var = new bf4(this, null);
        bf4Var.a(i7);
        return new c0(bf4Var);
    }

    public final boolean d(c0 c0Var) {
        if (this.f3662n.size() != c0Var.f3662n.size()) {
            return false;
        }
        for (int i7 = 0; i7 < this.f3662n.size(); i7++) {
            if (!Arrays.equals(this.f3662n.get(i7), c0Var.f3662n.get(i7))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i7;
        if (this == obj) {
            return true;
        }
        if (obj != null && c0.class == obj.getClass()) {
            c0 c0Var = (c0) obj;
            int i8 = this.F;
            if ((i8 == 0 || (i7 = c0Var.F) == 0 || i8 == i7) && this.f3652d == c0Var.f3652d && this.f3654f == c0Var.f3654f && this.f3655g == c0Var.f3655g && this.f3661m == c0Var.f3661m && this.f3664p == c0Var.f3664p && this.f3665q == c0Var.f3665q && this.f3666r == c0Var.f3666r && this.f3668t == c0Var.f3668t && this.f3671w == c0Var.f3671w && this.f3673y == c0Var.f3673y && this.f3674z == c0Var.f3674z && this.A == c0Var.A && this.B == c0Var.B && this.C == c0Var.C && this.D == c0Var.D && this.E == c0Var.E && Float.compare(this.f3667s, c0Var.f3667s) == 0 && Float.compare(this.f3669u, c0Var.f3669u) == 0 && n13.p(this.f3649a, c0Var.f3649a) && n13.p(this.f3650b, c0Var.f3650b) && n13.p(this.f3657i, c0Var.f3657i) && n13.p(this.f3659k, c0Var.f3659k) && n13.p(this.f3660l, c0Var.f3660l) && n13.p(this.f3651c, c0Var.f3651c) && Arrays.equals(this.f3670v, c0Var.f3670v) && n13.p(this.f3658j, c0Var.f3658j) && n13.p(this.f3672x, c0Var.f3672x) && n13.p(this.f3663o, c0Var.f3663o) && d(c0Var)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.F;
        if (i7 != 0) {
            return i7;
        }
        String str = this.f3649a;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        String str2 = this.f3650b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f3651c;
        int hashCode3 = (((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f3652d) * 961) + this.f3654f) * 31) + this.f3655g) * 31;
        String str4 = this.f3657i;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        c91 c91Var = this.f3658j;
        int hashCode5 = (hashCode4 + (c91Var == null ? 0 : c91Var.hashCode())) * 31;
        String str5 = this.f3659k;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f3660l;
        int hashCode7 = ((((((((((((((((((((((((((((((hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f3661m) * 31) + ((int) this.f3664p)) * 31) + this.f3665q) * 31) + this.f3666r) * 31) + Float.floatToIntBits(this.f3667s)) * 31) + this.f3668t) * 31) + Float.floatToIntBits(this.f3669u)) * 31) + this.f3671w) * 31) + this.f3673y) * 31) + this.f3674z) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31) + this.D) * 31) + this.E;
        this.F = hashCode7;
        return hashCode7;
    }

    public final String toString() {
        String str = this.f3649a;
        String str2 = this.f3650b;
        String str3 = this.f3659k;
        String str4 = this.f3660l;
        String str5 = this.f3657i;
        int i7 = this.f3656h;
        String str6 = this.f3651c;
        int i8 = this.f3665q;
        int i9 = this.f3666r;
        float f7 = this.f3667s;
        int i10 = this.f3673y;
        int i11 = this.f3674z;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        int length4 = String.valueOf(str4).length();
        StringBuilder sb = new StringBuilder(length + 104 + length2 + length3 + length4 + String.valueOf(str5).length() + String.valueOf(str6).length());
        sb.append("Format(");
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(str4);
        sb.append(", ");
        sb.append(str5);
        sb.append(", ");
        sb.append(i7);
        sb.append(", ");
        sb.append(str6);
        sb.append(", [");
        sb.append(i8);
        sb.append(", ");
        sb.append(i9);
        sb.append(", ");
        sb.append(f7);
        sb.append("], [");
        sb.append(i10);
        sb.append(", ");
        sb.append(i11);
        sb.append("])");
        return sb.toString();
    }
}
