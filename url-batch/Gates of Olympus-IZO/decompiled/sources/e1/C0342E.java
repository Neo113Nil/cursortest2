package e1;

import k2.InterfaceC0550w;

/* renamed from: e1.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0342E extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f4608e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0351N f4609f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0342E(C0351N c0351n, P1.d dVar) {
        super(2, dVar);
        this.f4609f = c0351n;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new C0342E(this.f4609f, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C0342E) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f4608e;
        C0351N c0351n = this.f4609f;
        try {
            if (i3 == 0) {
                I2.l.Q(obj);
                if (c0351n.f4645g.l() instanceof O) {
                    return c0351n.f4645g.l();
                }
                this.f4608e = 1;
                if (c0351n.e(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    I2.l.Q(obj);
                    return (Y) obj;
                }
                I2.l.Q(obj);
            }
            this.f4608e = 2;
            obj = C0351N.b(c0351n, false, this);
            if (obj == aVar) {
                return aVar;
            }
            return (Y) obj;
        } catch (Throwable th) {
            return new Q(-1, th);
        }
    }
}
