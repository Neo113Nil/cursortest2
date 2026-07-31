package o;

import m.AbstractC0595e;

/* loaded from: classes.dex */
public final class V extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f6468e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f6469f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o0 f6470g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f6471h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Z1.q f6472i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(o0 o0Var, long j3, Z1.q qVar, P1.d dVar) {
        super(2, dVar);
        this.f6470g = o0Var;
        this.f6471h = j3;
        this.f6472i = qVar;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        V v3 = new V(this.f6470g, this.f6471h, this.f6472i, dVar);
        v3.f6469f = obj;
        return v3;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((V) create((l0) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f6468e;
        if (i3 == 0) {
            I2.l.Q(obj);
            l0 l0Var = (l0) this.f6469f;
            o0 o0Var = this.f6470g;
            float f3 = o0Var.f(this.f6471h);
            U u3 = new U(this.f6472i, o0Var, l0Var, 0);
            this.f6468e = 1;
            if (AbstractC0595e.c(0.0f, f3, null, u3, this, 12) == aVar) {
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
