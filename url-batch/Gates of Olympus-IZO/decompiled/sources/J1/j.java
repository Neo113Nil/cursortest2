package J1;

import I2.l;
import L1.z;
import k2.InterfaceC0550w;

/* loaded from: classes.dex */
public final class j extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f2610e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k f2611f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d f2612g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, d dVar, P1.d dVar2) {
        super(2, dVar2);
        this.f2611f = kVar;
        this.f2612g = dVar;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new j(this.f2611f, this.f2612g, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((j) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f2610e;
        if (i3 == 0) {
            l.Q(obj);
            k kVar = this.f2611f;
            d dVar = this.f2612g;
            this.f2610e = 1;
            if (kVar.f2613b.toggleSaved(dVar.f2595a, true, this) == aVar) {
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
