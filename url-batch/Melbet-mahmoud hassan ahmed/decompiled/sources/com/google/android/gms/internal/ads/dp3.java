package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
final class dp3 implements wr3 {

    /* renamed from: a, reason: collision with root package name */
    private final cp3 f4272a;

    /* renamed from: b, reason: collision with root package name */
    private int f4273b;

    /* renamed from: c, reason: collision with root package name */
    private int f4274c;

    /* renamed from: d, reason: collision with root package name */
    private int f4275d = 0;

    private dp3(cp3 cp3Var) {
        kq3.f(cp3Var, "input");
        this.f4272a = cp3Var;
        cp3Var.f3915c = this;
    }

    private final <T> T M(es3<T> es3Var, mp3 mp3Var) {
        int i7 = this.f4274c;
        this.f4274c = ((this.f4273b >>> 3) << 3) | 4;
        try {
            T b7 = es3Var.b();
            es3Var.e(b7, this, mp3Var);
            es3Var.d(b7);
            if (this.f4273b == this.f4274c) {
                return b7;
            }
            throw mq3.g();
        } finally {
            this.f4274c = i7;
        }
    }

    private final <T> T N(es3<T> es3Var, mp3 mp3Var) {
        int r7 = this.f4272a.r();
        cp3 cp3Var = this.f4272a;
        if (cp3Var.f3913a >= cp3Var.f3914b) {
            throw new mq3("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int k7 = cp3Var.k(r7);
        T b7 = es3Var.b();
        this.f4272a.f3913a++;
        es3Var.e(b7, this, mp3Var);
        es3Var.d(b7);
        this.f4272a.A(0);
        r5.f3913a--;
        this.f4272a.a(k7);
        return b7;
    }

    private final void O(int i7) {
        if (this.f4272a.j() != i7) {
            throw mq3.j();
        }
    }

    private final void Q(int i7) {
        if ((this.f4273b & 7) != i7) {
            throw mq3.a();
        }
    }

    private static final void R(int i7) {
        if ((i7 & 3) != 0) {
            throw mq3.g();
        }
    }

    private static final void S(int i7) {
        if ((i7 & 7) != 0) {
            throw mq3.g();
        }
    }

    public static dp3 T(cp3 cp3Var) {
        dp3 dp3Var = cp3Var.f3915c;
        return dp3Var != null ? dp3Var : new dp3(cp3Var);
    }

    @Override // com.google.android.gms.internal.ads.wr3
    public final void A(List<uo3> list) {
        int q7;
        if ((this.f4273b & 7) != 2) {
            throw mq3.a();
        }
        do {
            list.add(l());
            if (this.f4272a.b()) {
                return;
            } else {
                q7 = this.f4272a.q();
            }
        } while (q7 == this.f4273b);
        this.f4275d = q7;
    }

    @Override // com.google.android.gms.internal.ads.wr3
    public final void B(List<Integer> list) {
        int q7;
        int q8;
        if (!(list instanceof bq3)) {
            int i7 = this.f4273b & 7;
            if (i7 == 0) {
                do {
                    list.add(Integer.valueOf(this.f4272a.n()));
                    if (this.f4272a.b()) {
                        return;
                    } else {
                        q7 = this.f4272a.q();
                    }
                } while (q7 == this.f4273b);
                this.f4275d = q7;
                return;
            }
            if (i7 != 2) {
                throw mq3.a();
            }
            int j7 = this.f4272a.j() + this.f4272a.r();
            do {
                list.add(Integer.valueOf(this.f4272a.n()));
            } while (this.f4272a.j() < j7);
            O(j7);
            return;
        }
        bq3 bq3Var = (bq3) list;
        int i8 = this.f4273b & 7;
        if (i8 == 0) {
            do {
                bq3Var.O(this.f4272a.n());
                if (this.f4272a.b()) {
                    return;
                } else {
                    q8 = this.f4272a.q();
                }
            } while (q8 == this.f4273b);
            this.f4275d = q8;
            return;
        }
        if (i8 != 2) {
            throw mq3.a();
        }
        int j8 = this.f4272a.j() + this.f4272a.r();
        do {
            bq3Var.O(this.f4272a.n());
        } while (this.f4272a.j() < j8);
        O(j8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.wr3
    public final <T> void C(List<T> list, es3<T> es3Var, mp3 mp3Var) {
        int q7;
        int i7 = this.f4273b;
        if ((i7 & 7) != 3) {
            throw mq3.a();
        }
        do {
            list.add(M(es3Var, mp3Var));
            if (this.f4272a.b() || this.f4275d != 0) {
                return;
            } else {
                q7 = this.f4272a.q();
            }
        } while (q7 == i7);
        this.f4275d = q7;
    }

    @Override // com.google.android.gms.internal.ads.wr3
    public final <T> T D(es3<T> es3Var, mp3 mp3Var) {
        Q(2);
        return (T) N(es3Var, mp3Var);
    }

    @Override // com.google.android.gms.internal.ads.wr3
    public final void E(List<Integer> list) {
        int q7;
        int q8;
        if (!(list instanceof bq3)) {
            int i7 = this.f4273b & 7;
            if (i7 == 0) {
                do {
                    list.add(Integer.valueOf(this.f4272a.r()));
                    if (this.f4272a.b()) {
                        return;
                    } else {
                        q7 = this.f4272a.q();
                    }
                } while (q7 == this.f4273b);
                this.f4275d = q7;
                return;
            }
            if (i7 != 2) {
                throw mq3.a();
            }
            int j7 = this.f4272a.j() + this.f4272a.r();
            do {
                list.add(Integer.valueOf(this.f4272a.r()));
            } while (this.f4272a.j() < j7);
            O(j7);
            return;
        }
        bq3 bq3Var = (bq3) list;
        int i8 = this.f4273b & 7;
        if (i8 == 0) {
            do {
                bq3Var.O(this.f4272a.r());
                if (this.f4272a.b()) {
                    return;
                } else {
                    q8 = this.f4272a.q();
                }
            } while (q8 == this.f4273b);
            this.f4275d = q8;
            return;
        }
        if (i8 != 2) {
            throw mq3.a();
        }
        int j8 = this.f4272a.j() + this.f4272a.r();
        do {
            bq3Var.O(this.f4272a.r());
        } while (this.f4272a.j() < j8);
        O(j8);
    }

    @Override // com.google.android.gms.internal.ads.wr3
    public final void F(List<Long> list) {
        int q7;
        int q8;
        if (!(list instanceof zq3)) {
            int i7 = this.f4273b & 7;
            if (i7 == 1) {
                do {
                    list.add(Long.valueOf(this.f4272a.u()));
                    if (this.f4272a.b()) {
                        return;
                    } else {
                        q7 = this.f4272a.q();
                    }
                } while (q7 == this.f4273b);
                this.f4275d = q7;
                return;
            }
            if (i7 != 2) {
                throw mq3.a();
            }
            int r7 = this.f4272a.r();
            S(r7);
            int j7 = this.f4272a.j() + r7;
            do {
                list.add(Long.valueOf(this.f4272a.u()));
            } while (this.f4272a.j() < j7);
            return;
        }
        zq3 zq3Var = (zq3) list;
        int i8 = this.f4273b & 7;
        if (i8 == 1) {
            do {
                zq3Var.l(this.f4272a.u());
                if (this.f4272a.b()) {
                    return;
                } else {
                    q8 = this.f4272a.q();
                }
            } while (q8 == this.f4273b);
            this.f4275d = q8;
            return;
        }
        if (i8 != 2) {
            throw mq3.a();
        }
        int r8 = this.f4272a.r();
        S(r8);
        int j8 = this.f4272a.j() + r8;
        do {
            zq3Var.l(this.f4272a.u());
        } while (this.f4272a.j() < j8);
    }

    @Override // com.google.android.gms.internal.ads.wr3
    public final void G(List<Boolean> list) {
        int q7;
        int q8;
        if (!(list instanceof go3)) {
            int i7 = this.f4273b & 7;
            if (i7 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f4272a.c()));
                    if (this.f4272a.b()) {
                        return;
                    } else {
                        q7 = this.f4272a.q();
                    }
                } while (q7 == this.f4273b);
                this.f4275d = q7;
                return;
            }
            if (i7 != 2) {
                throw mq3.a();
            }
            int j7 = this.f4272a.j() + this.f4272a.r();
            do {
                list.add(Boolean.valueOf(this.f4272a.c()));
            } while (this.f4272a.j() < j7);
            O(j7);
            return;
        }
        go3 go3Var = (go3) list;
        int i8 = this.f4273b & 7;
        if (i8 == 0) {
            do {
                go3Var.j(this.f4272a.c());
                if (this.f4272a.b()) {
                    return;
                } else {
                    q8 = this.f4272a.q();
                }
            } while (q8 == this.f4273b);
            this.f4275d = q8;
            return;
        }
        if (i8 != 2) {
            throw mq3.a();
        }
        int j8 = this.f4272a.j() + this.f4272a.r();
        do {
            go3Var.j(this.f4272a.c());
        } while (this.f4272a.j() < j8);
        O(j8);
    }

    @Override // com.google.android.gms.internal.ads.wr3
    public final void H(List<Integer> list) {
        int q7;
        int q8;
        if (!(list instanceof bq3)) {
            int i7 = this.f4273b & 7;
            if (i7 == 2) {
                int r7 = this.f4272a.r();
                R(r7);
                int j7 = this.f4272a.j() + r7;
                do {
                    list.add(Integer.valueOf(this.f4272a.o()));
                } while (this.f4272a.j() < j7);
                return;
            }
            if (i7 != 5) {
                throw mq3.a();
            }
            do {
                list.add(Integer.valueOf(this.f4272a.o()));
                if (this.f4272a.b()) {
                    return;
                } else {
                    q7 = this.f4272a.q();
                }
            } while (q7 == this.f4273b);
            this.f4275d = q7;
            return;
        }
        bq3 bq3Var = (bq3) list;
        int i8 = this.f4273b & 7;
        if (i8 == 2) {
            int r8 = this.f4272a.r();
            R(r8);
            int j8 = this.f4272a.j() + r8;
            do {
                bq3Var.O(this.f4272a.o());
            } while (this.f4272a.j() < j8);
            return;
        }
        if (i8 != 5) {
            throw mq3.a();
        }
        do {
            bq3Var.O(this.f4272a.o());
            if (this.f4272a.b()) {
                return;
            } else {
                q8 = this.f4272a.q();
            }
        } while (q8 == this.f4273b);
        this.f4275d = q8;
    }

    @Override // com.google.android.gms.internal.ads.wr3
    public final <T> T I(es3<T> es3Var, mp3 mp3Var) {
        Q(3);
        return (T) M(es3Var, mp3Var);
    }

    @Override // com.google.android.gms.internal.ads.wr3
    public final void J(List<Integer> list) {
        int q7;
        int q8;
        if (!(list instanceof bq3)) {
            int i7 = this.f4273b & 7;
            if (i7 == 2) {
                int r7 = this.f4272a.r();
                R(r7);
                int j7 = this.f4272a.j() + r7;
                do {
                    list.add(Integer.valueOf(this.f4272a.m()));
                } while (this.f4272a.j() < j7);
                return;
            }
            if (i7 != 5) {
                throw mq3.a();
            }
            do {
                list.add(Integer.valueOf(this.f4272a.m()));
                if (this.f4272a.b()) {
                    return;
                } else {
                    q7 = this.f4272a.q();
                }
            } while (q7 == this.f4273b);
            this.f4275d = q7;
            return;
        }
        bq3 bq3Var = (bq3) list;
        int i8 = this.f4273b & 7;
        if (i8 == 2) {
            int r8 = this.f4272a.r();
            R(r8);
            int j8 = this.f4272a.j() + r8;
            do {
                bq3Var.O(this.f4272a.m());
            } while (this.f4272a.j() < j8);
            return;
        }
        if (i8 != 5) {
            throw mq3.a();
        }
        do {
            bq3Var.O(this.f4272a.m());
            if (this.f4272a.b()) {
                return;
            } else {
                q8 = this.f4272a.q();
            }
        } while (q8 == this.f4273b);
        this.f4275d = q8;
    }

    @Override // com.google.android.gms.internal.ads.wr3
    public final void K(List<Float> list) {
        int q7;
        int q8;
        if (!(list instanceof up3)) {
            int i7 = this.f4273b & 7;
            if (i7 == 2) {
                int r7 = this.f4272a.r();
                R(r7);
                int j7 = this.f4272a.j() + r7;
                do {
                    list.add(Float.valueOf(this.f4272a.i()));
                } while (this.f4272a.j() < j7);
                return;
            }
            if (i7 != 5) {
                throw mq3.a();
            }
            do {
                list.add(Float.valueOf(this.f4272a.i()));
                if (this.f4272a.b()) {
                    return;
                } else {
                    q7 = this.f4272a.q();
                }
            } while (q7 == this.f4273b);
            this.f4275d = q7;
            return;
        }
        up3 up3Var = (up3) list;
        int i8 = this.f4273b & 7;
        if (i8 == 2) {
            int r8 = this.f4272a.r();
            R(r8);
            int j8 = this.f4272a.j() + r8;
            do {
                up3Var.j(this.f4272a.i());
            } while (this.f4272a.j() < j8);
            return;
        }
        if (i8 != 5) {
            throw mq3.a();
        }
        do {
            up3Var.j(this.f4272a.i());
            if (this.f4272a.b()) {
                return;
            } else {
                q8 = this.f4272a.q();
            }
        } while (q8 == this.f4273b);
        this.f4275d = q8;
    }

    public final void L(List<String> list, boolean z6) {
        int q7;
        int q8;
        if ((this.f4273b & 7) != 2) {
            throw mq3.a();
        }
        if (!(list instanceof sq3) || z6) {
            do {
                list.add(z6 ? y() : q());
                if (this.f4272a.b()) {
                    return;
                } else {
                    q7 = this.f4272a.q();
                }
            } while (q7 == this.f4273b);
            this.f4275d = q7;
            return;
        }
        sq3 sq3Var = (sq3) list;
        do {
            sq3Var.h(l());
            if (this.f4272a.b()) {
                return;
            } else {
                q8 = this.f4272a.q();
            }
        } while (q8 == this.f4273b);
        this.f4275d = q8;
    }

    @Override // com.google.android.gms.internal.ads.wr3
    public final boolean P() {
        Q(0);
        return this.f4272a.c();
    }

    @Override // com.google.android.gms.internal.ads.wr3
    public final float a() {
        Q(5);
        return this.f4272a.i();
    }

    @Override // com.google.android.gms.internal.ads.wr3
    public final int b() {
        Q(0);
        return this.f4272a.l();
    }

    @Override // com.google.android.gms.internal.ads.wr3
    public final int c() {
        int i7 = this.f4275d;
        if (i7 != 0) {
            this.f4273b = i7;
            this.f4275d = 0;
        } else {
            i7 = this.f4272a.q();
            this.f4273b = i7;
        }
        if (i7 == 0 || i7 == this.f4274c) {
            return Integer.MAX_VALUE;
        }
        return i7 >>> 3;
    }

    @Override // com.google.android.gms.internal.ads.wr3
    public final int d() {
        Q(5);
        return this.f4272a.m();
    }

    @Override // com.google.android.gms.internal.ads.wr3
    public final int e() {
        Q(0);
        return this.f4272a.n();
    }

    @Override // com.google.android.gms.internal.ads.wr3
    public final int f() {
        Q(5);
        return this.f4272a.o();
    }

    @Override // com.google.android.gms.internal.ads.wr3
    public final int g() {
        return this.f4273b;
    }

    @Override // com.google.android.gms.internal.ads.wr3
    public final int h() {
        Q(0);
        return this.f4272a.p();
    }

    @Override // com.google.android.gms.internal.ads.wr3
    public final int i() {
        Q(0);
        return this.f4272a.r();
    }

    @Override // com.google.android.gms.internal.ads.wr3
    public final long j() {
        Q(1);
        return this.f4272a.s();
    }

    @Override // com.google.android.gms.internal.ads.wr3
    public final long k() {
        Q(0);
        return this.f4272a.t();
    }

    @Override // com.google.android.gms.internal.ads.wr3
    public final uo3 l() {
        Q(2);
        return this.f4272a.x();
    }

    @Override // com.google.android.gms.internal.ads.wr3
    public final long m() {
        Q(0);
        return this.f4272a.v();
    }

    @Override // com.google.android.gms.internal.ads.wr3
    public final long n() {
        Q(0);
        return this.f4272a.w();
    }

    @Override // com.google.android.gms.internal.ads.wr3
    public final long o() {
        Q(1);
        return this.f4272a.u();
    }

    @Override // com.google.android.gms.internal.ads.wr3
    public final void p(List<Long> list) {
        int q7;
        int q8;
        if (!(list instanceof zq3)) {
            int i7 = this.f4273b & 7;
            if (i7 == 0) {
                do {
                    list.add(Long.valueOf(this.f4272a.v()));
                    if (this.f4272a.b()) {
                        return;
                    } else {
                        q7 = this.f4272a.q();
                    }
                } while (q7 == this.f4273b);
                this.f4275d = q7;
                return;
            }
            if (i7 != 2) {
                throw mq3.a();
            }
            int j7 = this.f4272a.j() + this.f4272a.r();
            do {
                list.add(Long.valueOf(this.f4272a.v()));
            } while (this.f4272a.j() < j7);
            O(j7);
            return;
        }
        zq3 zq3Var = (zq3) list;
        int i8 = this.f4273b & 7;
        if (i8 == 0) {
            do {
                zq3Var.l(this.f4272a.v());
                if (this.f4272a.b()) {
                    return;
                } else {
                    q8 = this.f4272a.q();
                }
            } while (q8 == this.f4273b);
            this.f4275d = q8;
            return;
        }
        if (i8 != 2) {
            throw mq3.a();
        }
        int j8 = this.f4272a.j() + this.f4272a.r();
        do {
            zq3Var.l(this.f4272a.v());
        } while (this.f4272a.j() < j8);
        O(j8);
    }

    @Override // com.google.android.gms.internal.ads.wr3
    public final String q() {
        Q(2);
        return this.f4272a.y();
    }

    @Override // com.google.android.gms.internal.ads.wr3
    public final void r(List<Integer> list) {
        int q7;
        int q8;
        if (!(list instanceof bq3)) {
            int i7 = this.f4273b & 7;
            if (i7 == 0) {
                do {
                    list.add(Integer.valueOf(this.f4272a.l()));
                    if (this.f4272a.b()) {
                        return;
                    } else {
                        q7 = this.f4272a.q();
                    }
                } while (q7 == this.f4273b);
                this.f4275d = q7;
                return;
            }
            if (i7 != 2) {
                throw mq3.a();
            }
            int j7 = this.f4272a.j() + this.f4272a.r();
            do {
                list.add(Integer.valueOf(this.f4272a.l()));
            } while (this.f4272a.j() < j7);
            O(j7);
            return;
        }
        bq3 bq3Var = (bq3) list;
        int i8 = this.f4273b & 7;
        if (i8 == 0) {
            do {
                bq3Var.O(this.f4272a.l());
                if (this.f4272a.b()) {
                    return;
                } else {
                    q8 = this.f4272a.q();
                }
            } while (q8 == this.f4273b);
            this.f4275d = q8;
            return;
        }
        if (i8 != 2) {
            throw mq3.a();
        }
        int j8 = this.f4272a.j() + this.f4272a.r();
        do {
            bq3Var.O(this.f4272a.l());
        } while (this.f4272a.j() < j8);
        O(j8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.wr3
    public final <T> void s(List<T> list, es3<T> es3Var, mp3 mp3Var) {
        int q7;
        int i7 = this.f4273b;
        if ((i7 & 7) != 2) {
            throw mq3.a();
        }
        do {
            list.add(N(es3Var, mp3Var));
            if (this.f4272a.b() || this.f4275d != 0) {
                return;
            } else {
                q7 = this.f4272a.q();
            }
        } while (q7 == i7);
        this.f4275d = q7;
    }

    @Override // com.google.android.gms.internal.ads.wr3
    public final void t(List<Long> list) {
        int q7;
        int q8;
        if (!(list instanceof zq3)) {
            int i7 = this.f4273b & 7;
            if (i7 == 0) {
                do {
                    list.add(Long.valueOf(this.f4272a.t()));
                    if (this.f4272a.b()) {
                        return;
                    } else {
                        q7 = this.f4272a.q();
                    }
                } while (q7 == this.f4273b);
                this.f4275d = q7;
                return;
            }
            if (i7 != 2) {
                throw mq3.a();
            }
            int j7 = this.f4272a.j() + this.f4272a.r();
            do {
                list.add(Long.valueOf(this.f4272a.t()));
            } while (this.f4272a.j() < j7);
            O(j7);
            return;
        }
        zq3 zq3Var = (zq3) list;
        int i8 = this.f4273b & 7;
        if (i8 == 0) {
            do {
                zq3Var.l(this.f4272a.t());
                if (this.f4272a.b()) {
                    return;
                } else {
                    q8 = this.f4272a.q();
                }
            } while (q8 == this.f4273b);
            this.f4275d = q8;
            return;
        }
        if (i8 != 2) {
            throw mq3.a();
        }
        int j8 = this.f4272a.j() + this.f4272a.r();
        do {
            zq3Var.l(this.f4272a.t());
        } while (this.f4272a.j() < j8);
        O(j8);
    }

    @Override // com.google.android.gms.internal.ads.wr3
    public final boolean u() {
        int i7;
        if (this.f4272a.b() || (i7 = this.f4273b) == this.f4274c) {
            return false;
        }
        return this.f4272a.d(i7);
    }

    @Override // com.google.android.gms.internal.ads.wr3
    public final void v(List<Long> list) {
        int q7;
        int q8;
        if (!(list instanceof zq3)) {
            int i7 = this.f4273b & 7;
            if (i7 == 1) {
                do {
                    list.add(Long.valueOf(this.f4272a.s()));
                    if (this.f4272a.b()) {
                        return;
                    } else {
                        q7 = this.f4272a.q();
                    }
                } while (q7 == this.f4273b);
                this.f4275d = q7;
                return;
            }
            if (i7 != 2) {
                throw mq3.a();
            }
            int r7 = this.f4272a.r();
            S(r7);
            int j7 = this.f4272a.j() + r7;
            do {
                list.add(Long.valueOf(this.f4272a.s()));
            } while (this.f4272a.j() < j7);
            return;
        }
        zq3 zq3Var = (zq3) list;
        int i8 = this.f4273b & 7;
        if (i8 == 1) {
            do {
                zq3Var.l(this.f4272a.s());
                if (this.f4272a.b()) {
                    return;
                } else {
                    q8 = this.f4272a.q();
                }
            } while (q8 == this.f4273b);
            this.f4275d = q8;
            return;
        }
        if (i8 != 2) {
            throw mq3.a();
        }
        int r8 = this.f4272a.r();
        S(r8);
        int j8 = this.f4272a.j() + r8;
        do {
            zq3Var.l(this.f4272a.s());
        } while (this.f4272a.j() < j8);
    }

    @Override // com.google.android.gms.internal.ads.wr3
    public final void w(List<Long> list) {
        int q7;
        int q8;
        if (!(list instanceof zq3)) {
            int i7 = this.f4273b & 7;
            if (i7 == 0) {
                do {
                    list.add(Long.valueOf(this.f4272a.w()));
                    if (this.f4272a.b()) {
                        return;
                    } else {
                        q7 = this.f4272a.q();
                    }
                } while (q7 == this.f4273b);
                this.f4275d = q7;
                return;
            }
            if (i7 != 2) {
                throw mq3.a();
            }
            int j7 = this.f4272a.j() + this.f4272a.r();
            do {
                list.add(Long.valueOf(this.f4272a.w()));
            } while (this.f4272a.j() < j7);
            O(j7);
            return;
        }
        zq3 zq3Var = (zq3) list;
        int i8 = this.f4273b & 7;
        if (i8 == 0) {
            do {
                zq3Var.l(this.f4272a.w());
                if (this.f4272a.b()) {
                    return;
                } else {
                    q8 = this.f4272a.q();
                }
            } while (q8 == this.f4273b);
            this.f4275d = q8;
            return;
        }
        if (i8 != 2) {
            throw mq3.a();
        }
        int j8 = this.f4272a.j() + this.f4272a.r();
        do {
            zq3Var.l(this.f4272a.w());
        } while (this.f4272a.j() < j8);
        O(j8);
    }

    @Override // com.google.android.gms.internal.ads.wr3
    public final void x(List<Double> list) {
        int q7;
        int q8;
        if (!(list instanceof jp3)) {
            int i7 = this.f4273b & 7;
            if (i7 == 1) {
                do {
                    list.add(Double.valueOf(this.f4272a.h()));
                    if (this.f4272a.b()) {
                        return;
                    } else {
                        q7 = this.f4272a.q();
                    }
                } while (q7 == this.f4273b);
                this.f4275d = q7;
                return;
            }
            if (i7 != 2) {
                throw mq3.a();
            }
            int r7 = this.f4272a.r();
            S(r7);
            int j7 = this.f4272a.j() + r7;
            do {
                list.add(Double.valueOf(this.f4272a.h()));
            } while (this.f4272a.j() < j7);
            return;
        }
        jp3 jp3Var = (jp3) list;
        int i8 = this.f4273b & 7;
        if (i8 == 1) {
            do {
                jp3Var.j(this.f4272a.h());
                if (this.f4272a.b()) {
                    return;
                } else {
                    q8 = this.f4272a.q();
                }
            } while (q8 == this.f4273b);
            this.f4275d = q8;
            return;
        }
        if (i8 != 2) {
            throw mq3.a();
        }
        int r8 = this.f4272a.r();
        S(r8);
        int j8 = this.f4272a.j() + r8;
        do {
            jp3Var.j(this.f4272a.h());
        } while (this.f4272a.j() < j8);
    }

    @Override // com.google.android.gms.internal.ads.wr3
    public final String y() {
        Q(2);
        return this.f4272a.z();
    }

    @Override // com.google.android.gms.internal.ads.wr3
    public final void z(List<Integer> list) {
        int q7;
        int q8;
        if (!(list instanceof bq3)) {
            int i7 = this.f4273b & 7;
            if (i7 == 0) {
                do {
                    list.add(Integer.valueOf(this.f4272a.p()));
                    if (this.f4272a.b()) {
                        return;
                    } else {
                        q7 = this.f4272a.q();
                    }
                } while (q7 == this.f4273b);
                this.f4275d = q7;
                return;
            }
            if (i7 != 2) {
                throw mq3.a();
            }
            int j7 = this.f4272a.j() + this.f4272a.r();
            do {
                list.add(Integer.valueOf(this.f4272a.p()));
            } while (this.f4272a.j() < j7);
            O(j7);
            return;
        }
        bq3 bq3Var = (bq3) list;
        int i8 = this.f4273b & 7;
        if (i8 == 0) {
            do {
                bq3Var.O(this.f4272a.p());
                if (this.f4272a.b()) {
                    return;
                } else {
                    q8 = this.f4272a.q();
                }
            } while (q8 == this.f4273b);
            this.f4275d = q8;
            return;
        }
        if (i8 != 2) {
            throw mq3.a();
        }
        int j8 = this.f4272a.j() + this.f4272a.r();
        do {
            bq3Var.O(this.f4272a.p());
        } while (this.f4272a.j() < j8);
        O(j8);
    }

    @Override // com.google.android.gms.internal.ads.wr3
    public final double zza() {
        Q(1);
        return this.f4272a.h();
    }
}
