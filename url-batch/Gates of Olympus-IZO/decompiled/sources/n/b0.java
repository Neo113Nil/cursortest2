package n;

import F.C0047j0;
import b0.AbstractC0257H;
import b0.C0255F;
import b0.InterfaceC0263N;
import h1.C0438i;
import o.m0;
import o.o0;

/* loaded from: classes.dex */
public final class b0 implements S, e0, InterfaceC0263N {

    /* renamed from: e, reason: collision with root package name */
    public static final b0 f6059e = new b0(0);

    /* renamed from: f, reason: collision with root package name */
    public static final b0 f6060f = new b0(1);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6061d;

    public /* synthetic */ b0(int i3) {
        this.f6061d = i3;
    }

    @Override // b0.InterfaceC0263N
    public AbstractC0257H a(long j3, M0.j jVar, M0.b bVar) {
        switch (this.f6061d) {
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                float k3 = bVar.k(AbstractC0669y.f6185a);
                return new C0255F(new a0.d(0.0f, -k3, a0.f.d(j3), a0.f.b(j3) + k3));
            default:
                float k4 = bVar.k(AbstractC0669y.f6185a);
                return new C0255F(new a0.d(-k4, 0.0f, a0.f.d(j3) + k4, a0.f.b(j3)));
        }
    }

    @Override // n.e0
    public U.l b() {
        return U.i.f3302a;
    }

    @Override // n.e0
    public long c(long j3, int i3, C0047j0 c0047j0) {
        c0047j0.getClass();
        o0 o0Var = (o0) c0047j0.f1274f;
        return new a0.c(o0.a(o0Var, o0Var.f6599h, j3, o0Var.f6598g)).f3489a;
    }

    @Override // n.S
    public void d(t0.F f3) {
        f3.b();
    }

    @Override // n.e0
    public boolean e() {
        return false;
    }

    @Override // n.e0
    public Object f(long j3, m0 m0Var, P1.d dVar) {
        m0 m0Var2 = new m0(m0Var.f6579h, dVar);
        m0Var2.f6578g = j3;
        L1.z zVar = L1.z.f2729a;
        Object invokeSuspend = m0Var2.invokeSuspend(zVar);
        return invokeSuspend == Q1.a.f3113d ? invokeSuspend : zVar;
    }
}
