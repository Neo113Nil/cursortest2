package q0;

import T.C0096n;
import T.C0097o;

/* renamed from: q0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1361c implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f14981a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f14982b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1362d f14983c;

    public C1361c(C1362d c1362d, b0 b0Var) {
        this.f14983c = c1362d;
        this.f14981a = b0Var;
    }

    @Override // q0.b0
    public final void a() {
        this.f14981a.a();
    }

    @Override // q0.b0
    public final boolean isReady() {
        return !this.f14983c.a() && this.f14981a.isReady();
    }

    @Override // q0.b0
    public final int k(long j4) {
        if (this.f14983c.a()) {
            return -3;
        }
        return this.f14981a.k(j4);
    }

    @Override // q0.b0
    public final int n(l2.e eVar, Z.f fVar, int i4) {
        C1362d c1362d = this.f14983c;
        if (c1362d.a()) {
            return -3;
        }
        if (this.f14982b) {
            fVar.f3496b = 4;
            return -4;
        }
        long u4 = c1362d.u();
        int n = this.f14981a.n(eVar, fVar, i4);
        if (n != -5) {
            long j4 = c1362d.f14990g;
            if (j4 == Long.MIN_VALUE || ((n != -4 || fVar.f3783g < j4) && !(n == -3 && u4 == Long.MIN_VALUE && !fVar.f3782f))) {
                return n;
            }
            fVar.h();
            fVar.f3496b = 4;
            this.f14982b = true;
            return -4;
        }
        C0097o c0097o = (C0097o) eVar.f14271c;
        c0097o.getClass();
        int i5 = c0097o.f2850J;
        int i6 = c0097o.f2849I;
        if (i6 == 0 && i5 == 0) {
            return -5;
        }
        if (c1362d.f14989f != 0) {
            i6 = 0;
        }
        if (c1362d.f14990g != Long.MIN_VALUE) {
            i5 = 0;
        }
        C0096n a3 = c0097o.a();
        a3.f2813H = i6;
        a3.f2814I = i5;
        eVar.f14271c = new C0097o(a3);
        return -5;
    }
}
