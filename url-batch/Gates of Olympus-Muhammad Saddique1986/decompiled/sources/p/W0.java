package p;

import a0.C0238c;
import b0.C0338g;
import b0.C0344m;
import d0.InterfaceC0403d;
import e2.InterfaceC0424c;
import h2.AbstractC0508a;
import m.C0629n;

/* loaded from: classes.dex */
public final class W0 extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7623e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f7624f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f7625g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f7626h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W0(float f3, C0338g c0338g, C0344m c0344m) {
        super(1);
        this.f7624f = f3;
        this.f7625g = c0338g;
        this.f7626h = c0344m;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        long R2;
        switch (this.f7623e) {
            case 0:
                long longValue = ((Number) obj).longValue();
                X0 x02 = (X0) this.f7625g;
                if (x02.f7629b == Long.MIN_VALUE) {
                    x02.f7629b = longValue;
                }
                float f3 = x02.f7632e;
                C0629n c0629n = new C0629n(f3);
                float f4 = this.f7624f;
                C0629n c0629n2 = X0.f7627f;
                if (f4 == 0.0f) {
                    R2 = x02.f7628a.g(new C0629n(f3), c0629n2, x02.f7630c);
                } else {
                    R2 = AbstractC0508a.R((longValue - x02.f7629b) / f4);
                }
                long j3 = R2;
                float f5 = ((C0629n) x02.f7628a.f(j3, c0629n, c0629n2, x02.f7630c)).f6855a;
                x02.f7630c = (C0629n) x02.f7628a.d(j3, c0629n, c0629n2, x02.f7630c);
                x02.f7629b = longValue;
                float f6 = x02.f7632e - f5;
                x02.f7632e = f5;
                ((InterfaceC0424c) this.f7626h).n(Float.valueOf(f6));
                return R1.y.f4171a;
            default:
                t0.G g3 = (t0.G) obj;
                g3.b();
                float f7 = this.f7624f;
                C0338g c0338g = (C0338g) this.f7625g;
                C0344m c0344m = (C0344m) this.f7626h;
                G1.m mVar = g3.f8573d.f5649e;
                long n3 = mVar.n();
                mVar.h().f();
                try {
                    B.Y y3 = (B.Y) mVar.f2116b;
                    y3.r(f7, 0.0f);
                    b0.r h3 = ((G1.m) y3.f334d).h();
                    h3.s(C0238c.d(0L), C0238c.e(0L));
                    h3.t();
                    h3.s(-C0238c.d(0L), -C0238c.e(0L));
                    InterfaceC0403d.x(g3, c0338g, c0344m);
                    A.k.q(mVar, n3);
                    return R1.y.f4171a;
                } catch (Throwable th) {
                    A.k.q(mVar, n3);
                    throw th;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W0(X0 x02, float f3, InterfaceC0424c interfaceC0424c) {
        super(1);
        this.f7625g = x02;
        this.f7624f = f3;
        this.f7626h = interfaceC0424c;
    }
}
