package G1;

import L1.z;
import k2.InterfaceC0550w;
import n2.InterfaceC0700f;

/* loaded from: classes.dex */
public final class p extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f1572e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r f1573f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r rVar, P1.d dVar) {
        super(2, dVar);
        this.f1573f = rVar;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new p(this.f1573f, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((p) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f1572e;
        if (i3 == 0) {
            I2.l.Q(obj);
            r rVar = this.f1573f;
            InterfaceC0700f stats = rVar.f1576b.getStats();
            o oVar = new o(0, rVar);
            this.f1572e = 1;
            if (stats.collect(oVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            I2.l.Q(obj);
        }
        return z.f2729a;
    }
}
