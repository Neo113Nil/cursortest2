package r0;

import r0.r3;

/* loaded from: classes.dex */
public abstract class e implements v2 {

    /* renamed from: a, reason: collision with root package name */
    protected final r3.d f20581a = new r3.d();

    protected e() {
    }

    private int Q() {
        int D0 = D0();
        if (D0 == 1) {
            return 0;
        }
        return D0;
    }

    @Override // r0.v2
    public final boolean C() {
        return P() != -1;
    }

    @Override // r0.v2
    public final boolean E() {
        r3 I = I();
        return !I.u() && I.r(A(), this.f20581a).f20935n;
    }

    @Override // r0.v2
    public final void I0(long j7) {
        n(A(), j7);
    }

    @Override // r0.v2
    public final int K() {
        return I().t();
    }

    @Override // r0.v2
    public final boolean O() {
        r3 I = I();
        return !I.u() && I.r(A(), this.f20581a).h();
    }

    public final int P() {
        r3 I = I();
        if (I.u()) {
            return -1;
        }
        return I.p(A(), Q(), L());
    }

    public final void R(int i7) {
        n(i7, -9223372036854775807L);
    }

    public final long b() {
        r3 I = I();
        if (I.u()) {
            return -9223372036854775807L;
        }
        return I.r(A(), this.f20581a).f();
    }

    public final int c() {
        r3 I = I();
        if (I.u()) {
            return -1;
        }
        return I.i(A(), Q(), L());
    }

    @Override // r0.v2
    public final boolean q() {
        r3 I = I();
        return !I.u() && I.r(A(), this.f20581a).f20934m;
    }

    @Override // r0.v2
    public final void s() {
        int c7 = c();
        if (c7 != -1) {
            R(c7);
        }
    }

    @Override // r0.v2
    public final boolean x() {
        return c() != -1;
    }
}
