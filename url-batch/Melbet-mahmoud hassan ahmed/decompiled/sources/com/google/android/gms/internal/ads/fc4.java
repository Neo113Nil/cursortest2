package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public class fc4 {

    /* renamed from: a, reason: collision with root package name */
    protected final zb4 f5082a;

    /* renamed from: b, reason: collision with root package name */
    protected final ec4 f5083b;

    /* renamed from: c, reason: collision with root package name */
    protected bc4 f5084c;

    /* renamed from: d, reason: collision with root package name */
    private final int f5085d;

    protected fc4(cc4 cc4Var, ec4 ec4Var, long j7, long j8, long j9, long j10, long j11, long j12, int i7) {
        this.f5083b = ec4Var;
        this.f5085d = i7;
        this.f5082a = new zb4(cc4Var, j7, 0L, j9, j10, j11, j12);
    }

    protected static final int f(pc4 pc4Var, long j7, md4 md4Var) {
        if (j7 == pc4Var.b()) {
            return 0;
        }
        md4Var.f8503a = j7;
        return 1;
    }

    protected static final boolean g(pc4 pc4Var, long j7) {
        long b7 = j7 - pc4Var.b();
        if (b7 < 0 || b7 > 262144) {
            return false;
        }
        ((jc4) pc4Var).p((int) b7, false);
        return true;
    }

    public final int a(pc4 pc4Var, md4 md4Var) {
        long j7;
        long j8;
        long j9;
        long j10;
        int i7;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        while (true) {
            bc4 bc4Var = this.f5084c;
            wu1.b(bc4Var);
            j7 = bc4Var.f3354f;
            j8 = bc4Var.f3355g;
            j9 = bc4Var.f3356h;
            if (j8 - j7 <= this.f5085d) {
                c(false, j7);
                return f(pc4Var, j7, md4Var);
            }
            if (!g(pc4Var, j9)) {
                return f(pc4Var, j9, md4Var);
            }
            pc4Var.i();
            ec4 ec4Var = this.f5083b;
            j10 = bc4Var.f3350b;
            dc4 b7 = ec4Var.b(pc4Var, j10);
            i7 = b7.f4167a;
            if (i7 == -3) {
                c(false, j9);
                return f(pc4Var, j9, md4Var);
            }
            if (i7 == -2) {
                j16 = b7.f4168b;
                j17 = b7.f4169c;
                bc4.h(bc4Var, j16, j17);
            } else {
                if (i7 != -1) {
                    j11 = b7.f4169c;
                    g(pc4Var, j11);
                    j12 = b7.f4169c;
                    c(true, j12);
                    j13 = b7.f4169c;
                    return f(pc4Var, j13, md4Var);
                }
                j14 = b7.f4168b;
                j15 = b7.f4169c;
                bc4.g(bc4Var, j14, j15);
            }
        }
    }

    public final pd4 b() {
        return this.f5082a;
    }

    protected final void c(boolean z6, long j7) {
        this.f5084c = null;
        this.f5083b.a();
    }

    public final void d(long j7) {
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        bc4 bc4Var = this.f5084c;
        if (bc4Var != null) {
            j12 = bc4Var.f3349a;
            if (j12 == j7) {
                return;
            }
        }
        long j13 = this.f5082a.j(j7);
        j8 = this.f5082a.f15068c;
        j9 = this.f5082a.f15069d;
        j10 = this.f5082a.f15070e;
        j11 = this.f5082a.f15071f;
        this.f5084c = new bc4(j7, j13, 0L, j8, j9, j10, j11);
    }

    public final boolean e() {
        return this.f5084c != null;
    }
}
