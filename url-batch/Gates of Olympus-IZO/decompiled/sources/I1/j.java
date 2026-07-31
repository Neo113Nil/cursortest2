package I1;

import G1.o;
import L1.z;
import k2.InterfaceC0550w;
import n2.InterfaceC0700f;

/* loaded from: classes.dex */
public final class j extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f2477e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m f2478f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, P1.d dVar) {
        super(2, dVar);
        this.f2478f = mVar;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new j(this.f2478f, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((j) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f2477e;
        if (i3 == 0) {
            I2.l.Q(obj);
            m mVar = this.f2478f;
            InterfaceC0700f stats = mVar.f2483b.getStats();
            o oVar = new o(2, mVar);
            this.f2477e = 1;
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
