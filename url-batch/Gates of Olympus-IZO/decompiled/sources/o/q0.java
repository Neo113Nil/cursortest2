package o;

import k2.InterfaceC0550w;

/* loaded from: classes.dex */
public final class q0 extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f6609e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ M f6610f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(M m3, P1.d dVar) {
        super(2, dVar);
        this.f6610f = m3;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new q0(this.f6610f, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((q0) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f6609e;
        if (i3 == 0) {
            I2.l.Q(obj);
            this.f6609e = 1;
            if (this.f6610f.b(this) == aVar) {
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
