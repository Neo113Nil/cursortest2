package E;

import k2.InterfaceC0550w;
import n2.InterfaceC0700f;

/* loaded from: classes.dex */
public final class y extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f709e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f710f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z f711g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, P1.d dVar) {
        super(2, dVar);
        this.f711g = zVar;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        y yVar = new y(this.f711g, dVar);
        yVar.f710f = obj;
        return yVar;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((y) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f709e;
        if (i3 == 0) {
            I2.l.Q(obj);
            InterfaceC0550w interfaceC0550w = (InterfaceC0550w) this.f710f;
            z zVar = this.f711g;
            InterfaceC0700f a3 = zVar.f712q.a();
            C0025g c0025g = new C0025g(zVar, 1, interfaceC0550w);
            this.f709e = 1;
            if (a3.collect(c0025g, this) == aVar) {
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
