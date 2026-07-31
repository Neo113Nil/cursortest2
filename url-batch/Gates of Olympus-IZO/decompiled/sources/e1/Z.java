package e1;

import g1.C0396c;

/* loaded from: classes.dex */
public final class Z extends R1.i implements Y1.f {

    /* renamed from: e, reason: collision with root package name */
    public int f4678e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ C0396c f4679f;

    @Override // Y1.f
    public final Object f(Object obj, Object obj2, Object obj3) {
        ((Boolean) obj2).getClass();
        Z z3 = new Z(3, (P1.d) obj3);
        z3.f4679f = (C0396c) obj;
        return z3.invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f4678e;
        if (i3 == 0) {
            I2.l.Q(obj);
            C0396c c0396c = this.f4679f;
            this.f4678e = 1;
            c0396c.getClass();
            obj = C0396c.a(c0396c, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            I2.l.Q(obj);
        }
        return obj;
    }
}
