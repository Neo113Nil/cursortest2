package o;

import F.C0060q;
import F.D0;
import k2.AbstractC0552y;

/* renamed from: o.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0749z extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f6672e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f6673f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g0 f6674g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0749z(g0 g0Var, P1.d dVar) {
        super(2, dVar);
        this.f6674g = g0Var;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        C0749z c0749z = new C0749z(this.f6674g, dVar);
        c0749z.f6673f = obj;
        return c0749z;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C0749z) create((n0.v) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f6672e;
        if (i3 == 0) {
            I2.l.Q(obj);
            n0.v vVar = (n0.v) this.f6673f;
            o0.c cVar = new o0.c();
            g0 g0Var = this.f6674g;
            C0747x c0747x = new C0747x(g0Var, vVar, new J0.b(g0Var, 2, cVar), new D0(cVar, 22, g0Var), new C0748y(g0Var, 0), new C0748y(g0Var, 1), new C0060q(cVar, 4, g0Var), null);
            this.f6672e = 1;
            if (AbstractC0552y.d(c0747x, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            I2.l.Q(obj);
        }
        return L1.z.f2729a;
    }
}
