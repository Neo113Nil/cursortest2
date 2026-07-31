package m;

import k2.AbstractC0552y;

/* loaded from: classes.dex */
public final class Q extends R1.i implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public int f5620e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s0 f5621f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Z f5622g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f5623h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0615z f5624i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(P1.d dVar, Object obj, InterfaceC0615z interfaceC0615z, Z z3, s0 s0Var) {
        super(1, dVar);
        this.f5621f = s0Var;
        this.f5622g = z3;
        this.f5623h = obj;
        this.f5624i = interfaceC0615z;
    }

    @Override // R1.a
    public final P1.d create(P1.d dVar) {
        return new Q(dVar, this.f5623h, this.f5624i, this.f5622g, this.f5621f);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f5620e;
        if (i3 == 0) {
            I2.l.Q(obj);
            Object obj2 = this.f5623h;
            s0 s0Var = this.f5621f;
            P p = new P(null, obj2, this.f5624i, this.f5622g, s0Var);
            this.f5620e = 1;
            if (AbstractC0552y.d(p, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            I2.l.Q(obj);
        }
        this.f5621f.i();
        return L1.z.f2729a;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        return ((Q) create((P1.d) obj)).invokeSuspend(L1.z.f2729a);
    }
}
