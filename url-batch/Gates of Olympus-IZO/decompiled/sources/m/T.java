package m;

import k2.InterfaceC0550w;

/* loaded from: classes.dex */
public final class T extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f5629e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Z f5630f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(Z z3, P1.d dVar) {
        super(2, dVar);
        this.f5630f = z3;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new T(this.f5630f, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((T) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f5629e;
        if (i3 == 0) {
            I2.l.Q(obj);
            this.f5629e = 1;
            if (Z.h(this.f5630f, this) == aVar) {
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
