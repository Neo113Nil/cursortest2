package I;

import k2.AbstractC0552y;
import n2.InterfaceC0678C;

/* loaded from: classes.dex */
public final class U0 extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f2207e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f2208f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ P1.i f2209g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0678C f2210h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U0(P1.i iVar, InterfaceC0678C interfaceC0678C, P1.d dVar) {
        super(2, dVar);
        this.f2209g = iVar;
        this.f2210h = interfaceC0678C;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        U0 u02 = new U0(this.f2209g, this.f2210h, dVar);
        u02.f2208f = obj;
        return u02;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((U0) create((C0112o0) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f2207e;
        if (i3 == 0) {
            I2.l.Q(obj);
            C0112o0 c0112o0 = (C0112o0) this.f2208f;
            P1.j jVar = P1.j.f3073d;
            P1.i iVar = this.f2209g;
            boolean a3 = Z1.i.a(iVar, jVar);
            InterfaceC0678C interfaceC0678C = this.f2210h;
            if (a3) {
                S0 s02 = new S0(c0112o0, 0);
                this.f2207e = 1;
                if (interfaceC0678C.collect(s02, this) == aVar) {
                    return aVar;
                }
            } else {
                T0 t02 = new T0(interfaceC0678C, c0112o0, null);
                this.f2207e = 2;
                if (AbstractC0552y.y(iVar, t02, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i3 != 1 && i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            I2.l.Q(obj);
        }
        return L1.z.f2729a;
    }
}
