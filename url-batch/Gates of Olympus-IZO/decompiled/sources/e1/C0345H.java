package e1;

import k2.C0542n;
import n2.AbstractC0682G;
import n2.InterfaceC0700f;
import n2.InterfaceC0701g;

/* renamed from: e1.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0345H extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f4618e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0351N f4619f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0345H(C0351N c0351n, P1.d dVar) {
        super(2, dVar);
        this.f4619f = c0351n;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new C0345H(this.f4619f, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C0345H) create((InterfaceC0701g) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f4618e;
        L1.z zVar = L1.z.f2729a;
        C0351N c0351n = this.f4619f;
        if (i3 == 0) {
            I2.l.Q(obj);
            A2.k kVar = c0351n.f4646h;
            this.f4618e = 1;
            Object e02 = ((C0542n) kVar.f109c).e0(this);
            if (e02 != aVar) {
                e02 = zVar;
            }
            if (e02 == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                if (i3 == 2) {
                    I2.l.Q(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            I2.l.Q(obj);
        }
        InterfaceC0700f e3 = AbstractC0682G.e(c0351n.d().f4676c, -1);
        G1.o oVar = new G1.o(5, c0351n);
        this.f4618e = 2;
        return e3.collect(oVar, this) == aVar ? aVar : zVar;
    }
}
