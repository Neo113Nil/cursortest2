package m;

import k2.AbstractC0552y;
import k2.InterfaceC0550w;

/* loaded from: classes.dex */
public final class U extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f5631e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f5632f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f5633g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f5634h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Z f5635i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s0 f5636j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f5637k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(Object obj, Object obj2, Z z3, s0 s0Var, float f3, P1.d dVar) {
        super(2, dVar);
        this.f5633g = obj;
        this.f5634h = obj2;
        this.f5635i = z3;
        this.f5636j = s0Var;
        this.f5637k = f3;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        U u3 = new U(this.f5633g, this.f5634h, this.f5635i, this.f5636j, this.f5637k, dVar);
        u3.f5632f = obj;
        return u3;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((U) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f5631e;
        L1.z zVar = L1.z.f2729a;
        Z z3 = this.f5635i;
        if (i3 == 0) {
            I2.l.Q(obj);
            InterfaceC0550w interfaceC0550w = (InterfaceC0550w) this.f5632f;
            Object obj2 = this.f5633g;
            Object obj3 = this.f5634h;
            if (Z1.i.a(obj2, obj3)) {
                z3.f5672n = null;
                if (Z1.i.a(z3.f5661c.getValue(), obj2)) {
                    return zVar;
                }
            } else {
                Z.f(z3);
            }
            boolean a3 = Z1.i.a(obj2, obj3);
            float f3 = this.f5637k;
            if (!a3) {
                s0 s0Var = this.f5636j;
                s0Var.q(obj2);
                s0Var.o(0L);
                z3.f5660b.setValue(obj2);
                s0Var.j(f3);
            }
            z3.o(f3);
            if (z3.f5671m.f5219b != 0) {
                AbstractC0552y.q(interfaceC0550w, null, null, new T(z3, null), 3);
            } else {
                z3.f5670l = Long.MIN_VALUE;
            }
            this.f5631e = 1;
            if (Z.j(z3, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            I2.l.Q(obj);
        }
        z3.n();
        return zVar;
    }
}
