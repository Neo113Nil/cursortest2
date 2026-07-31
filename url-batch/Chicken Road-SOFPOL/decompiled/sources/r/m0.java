package r;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class m0 extends i6.i implements p6.c {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6359h = 0;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s0 f6360j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f6361k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l1 f6362l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(s0 s0Var, Object obj, l1 l1Var, g6.c cVar) {
        super(1, cVar);
        this.f6360j = s0Var;
        this.f6361k = obj;
        this.f6362l = l1Var;
    }

    @Override // p6.c
    public final Object i(Object obj) {
        g6.c cVar = (g6.c) obj;
        switch (this.f6359h) {
            case 0:
                return new m0(this.f6362l, this.f6360j, this.f6361k, cVar).p(c6.m.f1757a);
            default:
                return new m0(this.f6360j, this.f6361k, this.f6362l, cVar).p(c6.m.f1757a);
        }
    }

    @Override // i6.a
    public final Object p(Object obj) {
        switch (this.f6359h) {
            case 0:
                int i = this.i;
                l1 l1Var = this.f6362l;
                if (i == 0) {
                    s6.a.K(obj);
                    m0.v1 v1Var = new m0.v1(this.f6360j, this.f6361k, l1Var, (g6.c) null);
                    this.i = 1;
                    Object b8 = a7.x.b(v1Var, this);
                    h6.a aVar = h6.a.f3204d;
                    if (b8 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s6.a.K(obj);
                }
                l1Var.i();
                return c6.m.f1757a;
            default:
                int i8 = this.i;
                l1 l1Var2 = this.f6362l;
                if (i8 == 0) {
                    s6.a.K(obj);
                    s0 s0Var = this.f6360j;
                    s0Var.l();
                    m0.h1 h1Var = s0Var.f6418b;
                    s0Var.f6427l = Long.MIN_VALUE;
                    s0Var.p(0.0f);
                    Object value = s0Var.f6419c.getValue();
                    Object obj2 = this.f6361k;
                    float f6 = obj2.equals(value) ? -4.0f : obj2.equals(h1Var.getValue()) ? -5.0f : -3.0f;
                    l1Var2.p(obj2);
                    l1Var2.n(0L);
                    h1Var.setValue(obj2);
                    s0Var.p(0.0f);
                    s0Var.d(obj2);
                    l1Var2.j(f6);
                    if (f6 == -3.0f) {
                        this.i = 1;
                        Object j7 = s0.j(s0Var, this);
                        h6.a aVar2 = h6.a.f3204d;
                        if (j7 == aVar2) {
                            return aVar2;
                        }
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s6.a.K(obj);
                }
                l1Var2.i();
                return c6.m.f1757a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(l1 l1Var, s0 s0Var, Object obj, g6.c cVar) {
        super(1, cVar);
        this.f6362l = l1Var;
        this.f6360j = s0Var;
        this.f6361k = obj;
    }
}
