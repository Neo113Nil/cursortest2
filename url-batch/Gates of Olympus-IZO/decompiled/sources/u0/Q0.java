package u0;

import k2.InterfaceC0550w;
import n2.InterfaceC0690O;

/* loaded from: classes.dex */
public final class Q0 extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f8224e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0690O f8225f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0987n0 f8226g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q0(InterfaceC0690O interfaceC0690O, C0987n0 c0987n0, P1.d dVar) {
        super(2, dVar);
        this.f8225f = interfaceC0690O;
        this.f8226g = c0987n0;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new Q0(this.f8225f, this.f8226g, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        ((Q0) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
        return Q1.a.f3113d;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f8224e;
        if (i3 == 0) {
            I2.l.Q(obj);
            G1.o oVar = new G1.o(7, this.f8226g);
            this.f8224e = 1;
            if (this.f8225f.collect(oVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            I2.l.Q(obj);
        }
        throw new L1.f();
    }
}
