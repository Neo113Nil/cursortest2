package o;

import k2.AbstractC0552y;
import k2.InterfaceC0550w;

/* renamed from: o.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0739o extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f6588e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ H2.h f6589f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n.X f6590g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Y1.e f6591h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0739o(H2.h hVar, n.X x3, Y1.e eVar, P1.d dVar) {
        super(2, dVar);
        this.f6589f = hVar;
        this.f6590g = x3;
        this.f6591h = eVar;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new C0739o(this.f6589f, this.f6590g, this.f6591h, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C0739o) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f6588e;
        if (i3 == 0) {
            I2.l.Q(obj);
            H2.h hVar = this.f6589f;
            n.a0 a0Var = (n.a0) hVar.f1961c;
            C0740p c0740p = (C0740p) hVar.f1960b;
            C0738n c0738n = new C0738n(hVar, this.f6591h, null);
            this.f6588e = 1;
            a0Var.getClass();
            if (AbstractC0552y.d(new n.Z(this.f6590g, a0Var, c0738n, c0740p, null), this) == aVar) {
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
