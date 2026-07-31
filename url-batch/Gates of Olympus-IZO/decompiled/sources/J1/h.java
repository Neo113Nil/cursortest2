package J1;

import I2.l;
import L1.z;
import k2.InterfaceC0550w;
import n2.InterfaceC0700f;

/* loaded from: classes.dex */
public final class h extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f2606e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k f2607f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, P1.d dVar) {
        super(2, dVar);
        this.f2607f = kVar;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new h(this.f2607f, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((h) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f2606e;
        if (i3 == 0) {
            l.Q(obj);
            k kVar = this.f2607f;
            InterfaceC0700f savedIds = kVar.f2613b.getSavedIds();
            g gVar = new g(kVar, 0);
            this.f2606e = 1;
            if (savedIds.collect(gVar, this) == aVar) {
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
