package o;

import F.D0;

/* loaded from: classes.dex */
public final class Y extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f6479e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f6480f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ D f6481g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ o0 f6482h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(D d3, o0 o0Var, P1.d dVar) {
        super(2, dVar);
        this.f6481g = d3;
        this.f6482h = o0Var;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        Y y3 = new Y(this.f6481g, this.f6482h, dVar);
        y3.f6480f = obj;
        return y3;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((Y) create((l0) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f6479e;
        if (i3 == 0) {
            I2.l.Q(obj);
            D0 d02 = new D0((l0) this.f6480f, 23, this.f6482h);
            this.f6479e = 1;
            if (this.f6481g.g(d02, this) == aVar) {
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
