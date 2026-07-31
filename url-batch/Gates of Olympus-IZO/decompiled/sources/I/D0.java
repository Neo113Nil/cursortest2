package I;

import k2.AbstractC0552y;
import k2.InterfaceC0550w;

/* loaded from: classes.dex */
public final class D0 extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f2087e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Y1.c f2088f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D0(Y1.c cVar, P1.d dVar) {
        super(2, dVar);
        this.f2088f = cVar;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new D0(this.f2088f, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((D0) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f2087e;
        if (i3 == 0) {
            I2.l.Q(obj);
            this.f2087e = 1;
            if (AbstractC0552y.e(16L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            I2.l.Q(obj);
        }
        return this.f2088f.j(new Long(System.nanoTime()));
    }
}
