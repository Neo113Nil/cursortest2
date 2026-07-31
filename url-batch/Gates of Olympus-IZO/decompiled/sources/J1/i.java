package J1;

import I2.l;
import L1.z;
import k2.InterfaceC0550w;
import n2.InterfaceC0700f;

/* loaded from: classes.dex */
public final class i extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f2608e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k f2609f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, P1.d dVar) {
        super(2, dVar);
        this.f2609f = kVar;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new i(this.f2609f, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((i) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f2608e;
        if (i3 == 0) {
            l.Q(obj);
            k kVar = this.f2609f;
            InterfaceC0700f stats = kVar.f2613b.getStats();
            g gVar = new g(kVar, 1);
            this.f2608e = 1;
            if (stats.collect(gVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l.Q(obj);
        }
        return z.f2729a;
    }
}
