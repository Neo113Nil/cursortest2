package m;

import k2.AbstractC0552y;

/* loaded from: classes.dex */
public final class V extends R1.i implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public int f5638e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5639f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f5640g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Z f5641h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s0 f5642i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f5643j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(Object obj, Object obj2, Z z3, s0 s0Var, float f3, P1.d dVar) {
        super(1, dVar);
        this.f5639f = obj;
        this.f5640g = obj2;
        this.f5641h = z3;
        this.f5642i = s0Var;
        this.f5643j = f3;
    }

    @Override // R1.a
    public final P1.d create(P1.d dVar) {
        return new V(this.f5639f, this.f5640g, this.f5641h, this.f5642i, this.f5643j, dVar);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f5638e;
        if (i3 == 0) {
            I2.l.Q(obj);
            U u3 = new U(this.f5639f, this.f5640g, this.f5641h, this.f5642i, this.f5643j, null);
            this.f5638e = 1;
            if (AbstractC0552y.d(u3, this) == aVar) {
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

    @Override // Y1.c
    public final Object j(Object obj) {
        return ((V) create((P1.d) obj)).invokeSuspend(L1.z.f2729a);
    }
}
