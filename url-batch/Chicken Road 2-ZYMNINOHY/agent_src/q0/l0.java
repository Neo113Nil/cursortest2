package q0;

import T.C0107z;

/* loaded from: classes.dex */
public abstract class l0 extends AbstractC1370l {

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC1359a f15044k;

    public l0(AbstractC1359a abstractC1359a) {
        this.f15044k = abstractC1359a;
    }

    @Override // q0.AbstractC1370l
    public final void A(Object obj, AbstractC1359a abstractC1359a, T.T t4) {
        D(t4);
    }

    public abstract void D(T.T t4);

    public final void E() {
        B(null, this.f15044k);
    }

    public void F() {
        E();
    }

    @Override // q0.AbstractC1359a
    public final T.T h() {
        return this.f15044k.h();
    }

    @Override // q0.AbstractC1359a
    public final C0107z i() {
        return this.f15044k.i();
    }

    @Override // q0.AbstractC1359a
    public final boolean j() {
        return this.f15044k.j();
    }

    @Override // q0.AbstractC1359a
    public final void n(Y.A a3) {
        this.f15043j = a3;
        this.f15042i = W.J.o(null);
        F();
    }

    @Override // q0.AbstractC1359a
    public void w(C0107z c0107z) {
        this.f15044k.w(c0107z);
    }

    @Override // q0.AbstractC1370l
    public final C1353B x(Object obj, C1353B c1353b) {
        return C(c1353b);
    }

    @Override // q0.AbstractC1370l
    public final long y(long j4, Object obj) {
        return j4;
    }

    @Override // q0.AbstractC1370l
    public final int z(int i4, Object obj) {
        return i4;
    }

    public C1353B C(C1353B c1353b) {
        return c1353b;
    }
}
