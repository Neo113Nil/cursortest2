package a0;

import T.C0085c;

/* loaded from: classes.dex */
public final class k0 extends q0.r {

    /* renamed from: c, reason: collision with root package name */
    public final T.S f4174c;

    public k0(T.T t4) {
        super(t4);
        this.f4174c = new T.S();
    }

    @Override // q0.r, T.T
    public final T.Q f(int i4, T.Q q4, boolean z) {
        T.T t4 = this.f15061b;
        T.Q f4 = t4.f(i4, q4, z);
        if (t4.m(f4.f2683c, this.f4174c, 0L).a()) {
            f4.h(q4.f2681a, q4.f2682b, q4.f2683c, q4.f2684d, q4.f2685e, C0085c.f2767c, true);
            return f4;
        }
        f4.f2686f = true;
        return f4;
    }
}
