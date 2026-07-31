package e1;

import k2.InterfaceC0550w;

/* renamed from: e1.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0343F extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f4610e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ R1.i f4611f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0354c f4612g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0343F(Y1.e eVar, C0354c c0354c, P1.d dVar) {
        super(2, dVar);
        this.f4611f = (R1.i) eVar;
        this.f4612g = c0354c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [R1.i, Y1.e] */
    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new C0343F(this.f4611f, this.f4612g, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C0343F) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [R1.i, Y1.e] */
    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f4610e;
        if (i3 == 0) {
            I2.l.Q(obj);
            Object obj2 = this.f4612g.f4682b;
            this.f4610e = 1;
            obj = this.f4611f.g(obj2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            I2.l.Q(obj);
        }
        return obj;
    }
}
