package v;

import I2.l;
import L1.z;
import R1.i;
import Z1.j;
import k2.AbstractC0552y;
import k2.InterfaceC0550w;
import t0.a0;

/* renamed from: v.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1016e extends i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f8564e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1017f f8565f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a0 f8566g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ j f8567h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ E2.j f8568i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1016e(C1017f c1017f, a0 a0Var, Y1.a aVar, E2.j jVar, P1.d dVar) {
        super(2, dVar);
        this.f8565f = c1017f;
        this.f8566g = a0Var;
        this.f8567h = (j) aVar;
        this.f8568i = jVar;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [Y1.a, Z1.j] */
    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        ?? r3 = this.f8567h;
        E2.j jVar = this.f8568i;
        C1016e c1016e = new C1016e(this.f8565f, this.f8566g, r3, jVar, dVar);
        c1016e.f8564e = obj;
        return c1016e;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C1016e) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(z.f2729a);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Y1.a, Z1.j] */
    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        l.Q(obj);
        InterfaceC0550w interfaceC0550w = (InterfaceC0550w) this.f8564e;
        a0 a0Var = this.f8566g;
        ?? r22 = this.f8567h;
        C1017f c1017f = this.f8565f;
        AbstractC0552y.q(interfaceC0550w, null, null, new C1014c(c1017f, a0Var, r22, null), 3);
        return AbstractC0552y.q(interfaceC0550w, null, null, new C1015d(c1017f, this.f8568i, null), 3);
    }
}
