package l;

import I.C0112o0;
import I.InterfaceC0088c0;
import I.V0;
import m.s0;
import n2.C0677B;

/* loaded from: classes.dex */
public final class r extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f5499e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f5500f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s0 f5501g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0088c0 f5502h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s0 s0Var, InterfaceC0088c0 interfaceC0088c0, P1.d dVar) {
        super(2, dVar);
        this.f5501g = s0Var;
        this.f5502h = interfaceC0088c0;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        r rVar = new r(this.f5501g, this.f5502h, dVar);
        rVar.f5500f = obj;
        return rVar;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((r) create((C0112o0) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f5499e;
        if (i3 == 0) {
            I2.l.Q(obj);
            C0112o0 c0112o0 = (C0112o0) this.f5500f;
            s0 s0Var = this.f5501g;
            C0677B c0677b = new C0677B(new V0(new p(s0Var, 0), null));
            q qVar = new q(c0112o0, s0Var, this.f5502h, 0);
            this.f5499e = 1;
            if (c0677b.collect(qVar, this) == aVar) {
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
