package m;

import I.C0102j0;

/* loaded from: classes.dex */
public final class W extends R1.i implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public int f5644e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Z f5645f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f5646g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s0 f5647h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(Z z3, Object obj, s0 s0Var, P1.d dVar) {
        super(1, dVar);
        this.f5645f = z3;
        this.f5646g = obj;
        this.f5647h = s0Var;
    }

    @Override // R1.a
    public final P1.d create(P1.d dVar) {
        return new W(this.f5645f, this.f5646g, this.f5647h, dVar);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f5644e;
        s0 s0Var = this.f5647h;
        if (i3 == 0) {
            I2.l.Q(obj);
            Z z3 = this.f5645f;
            z3.l();
            z3.f5670l = Long.MIN_VALUE;
            z3.o(0.0f);
            Object value = z3.f5661c.getValue();
            Object obj2 = this.f5646g;
            boolean equals = obj2.equals(value);
            C0102j0 c0102j0 = z3.f5660b;
            float f3 = equals ? -4.0f : obj2.equals(c0102j0.getValue()) ? -5.0f : -3.0f;
            s0Var.q(obj2);
            s0Var.o(0L);
            c0102j0.setValue(obj2);
            z3.o(0.0f);
            z3.c(obj2);
            s0Var.j(f3);
            if (f3 == -3.0f) {
                this.f5644e = 1;
                if (Z.j(z3, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            I2.l.Q(obj);
        }
        s0Var.i();
        return L1.z.f2729a;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        return ((W) create((P1.d) obj)).invokeSuspend(L1.z.f2729a);
    }
}
