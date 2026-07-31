package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public final td4 f3678a;

    /* renamed from: d, reason: collision with root package name */
    public r1 f3681d;

    /* renamed from: e, reason: collision with root package name */
    public y0 f3682e;

    /* renamed from: f, reason: collision with root package name */
    public int f3683f;

    /* renamed from: g, reason: collision with root package name */
    public int f3684g;

    /* renamed from: h, reason: collision with root package name */
    public int f3685h;

    /* renamed from: i, reason: collision with root package name */
    public int f3686i;

    /* renamed from: l, reason: collision with root package name */
    private boolean f3689l;

    /* renamed from: b, reason: collision with root package name */
    public final q1 f3679b = new q1();

    /* renamed from: c, reason: collision with root package name */
    public final dr2 f3680c = new dr2();

    /* renamed from: j, reason: collision with root package name */
    private final dr2 f3687j = new dr2(1);

    /* renamed from: k, reason: collision with root package name */
    private final dr2 f3688k = new dr2();

    public c1(td4 td4Var, r1 r1Var, y0 y0Var) {
        this.f3678a = td4Var;
        this.f3681d = r1Var;
        this.f3682e = y0Var;
        h(r1Var, y0Var);
    }

    public final int a() {
        int i7 = !this.f3689l ? this.f3681d.f10963g[this.f3683f] : this.f3679b.f10525k[this.f3683f] ? 1 : 0;
        return f() != null ? i7 | 1073741824 : i7;
    }

    public final int b() {
        return !this.f3689l ? this.f3681d.f10960d[this.f3683f] : this.f3679b.f10522h[this.f3683f];
    }

    public final int c(int i7, int i8) {
        dr2 dr2Var;
        p1 f7 = f();
        if (f7 == null) {
            return 0;
        }
        int i9 = f7.f9986d;
        if (i9 != 0) {
            dr2Var = this.f3679b.f10529o;
        } else {
            byte[] bArr = (byte[]) n13.c(f7.f9987e);
            dr2 dr2Var2 = this.f3688k;
            int length = bArr.length;
            dr2Var2.d(bArr, length);
            dr2Var = this.f3688k;
            i9 = length;
        }
        boolean c7 = this.f3679b.c(this.f3683f);
        boolean z6 = c7 || i8 != 0;
        this.f3687j.h()[0] = (byte) ((true != z6 ? 0 : 128) | i9);
        this.f3687j.f(0);
        this.f3678a.f(this.f3687j, 1, 1);
        this.f3678a.f(dr2Var, i9, 1);
        if (!z6) {
            return i9 + 1;
        }
        if (!c7) {
            this.f3680c.c(8);
            byte[] h7 = this.f3680c.h();
            h7[0] = 0;
            h7[1] = 1;
            h7[2] = 0;
            h7[3] = (byte) i8;
            h7[4] = (byte) ((i7 >> 24) & 255);
            h7[5] = (byte) ((i7 >> 16) & 255);
            h7[6] = (byte) ((i7 >> 8) & 255);
            h7[7] = (byte) (i7 & 255);
            this.f3678a.f(this.f3680c, 8, 1);
            return i9 + 9;
        }
        dr2 dr2Var3 = this.f3679b.f10529o;
        int w6 = dr2Var3.w();
        dr2Var3.g(-2);
        int i10 = (w6 * 6) + 2;
        if (i8 != 0) {
            this.f3680c.c(i10);
            byte[] h8 = this.f3680c.h();
            dr2Var3.b(h8, 0, i10);
            int i11 = (((h8[2] & 255) << 8) | (h8[3] & 255)) + i8;
            h8[2] = (byte) ((i11 >> 8) & 255);
            h8[3] = (byte) (i11 & 255);
            dr2Var3 = this.f3680c;
        }
        this.f3678a.f(dr2Var3, i10, 1);
        return i9 + 1 + i10;
    }

    public final long d() {
        return !this.f3689l ? this.f3681d.f10959c[this.f3683f] : this.f3679b.f10520f[this.f3685h];
    }

    public final long e() {
        return !this.f3689l ? this.f3681d.f10962f[this.f3683f] : this.f3679b.a(this.f3683f);
    }

    public final p1 f() {
        if (!this.f3689l) {
            return null;
        }
        q1 q1Var = this.f3679b;
        y0 y0Var = q1Var.f10515a;
        int i7 = n13.f8865a;
        int i8 = y0Var.f14472a;
        p1 p1Var = q1Var.f10528n;
        if (p1Var == null) {
            p1Var = this.f3681d.f10957a.a(i8);
        }
        if (p1Var == null || !p1Var.f9983a) {
            return null;
        }
        return p1Var;
    }

    public final void h(r1 r1Var, y0 y0Var) {
        this.f3681d = r1Var;
        this.f3682e = y0Var;
        this.f3678a.b(r1Var.f10957a.f9430f);
        i();
    }

    public final void i() {
        q1 q1Var = this.f3679b;
        q1Var.f10518d = 0;
        q1Var.f10531q = 0L;
        q1Var.f10532r = false;
        q1Var.f10526l = false;
        q1Var.f10530p = false;
        q1Var.f10528n = null;
        this.f3683f = 0;
        this.f3685h = 0;
        this.f3684g = 0;
        this.f3686i = 0;
        this.f3689l = false;
    }

    public final boolean k() {
        this.f3683f++;
        if (!this.f3689l) {
            return false;
        }
        int i7 = this.f3684g + 1;
        this.f3684g = i7;
        int[] iArr = this.f3679b.f10521g;
        int i8 = this.f3685h;
        if (i7 != iArr[i8]) {
            return true;
        }
        this.f3685h = i8 + 1;
        this.f3684g = 0;
        return false;
    }
}
