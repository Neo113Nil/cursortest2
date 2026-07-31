package u0;

import k2.InterfaceC0550w;

/* loaded from: classes.dex */
public final class W0 extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f8263e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Z0 f8264f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W0(Z0 z02, P1.d dVar) {
        super(2, dVar);
        this.f8264f = z02;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new W0(this.f8264f, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((W0) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f8263e;
        L1.z zVar = L1.z.f2729a;
        if (i3 == 0) {
            I2.l.Q(obj);
            C0997t c0997t = this.f8264f.f8273d;
            this.f8263e = 1;
            Object d3 = c0997t.p.d(this);
            if (d3 != aVar) {
                d3 = zVar;
            }
            if (d3 == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            I2.l.Q(obj);
        }
        return zVar;
    }
}
