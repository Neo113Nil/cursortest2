package I;

import k2.InterfaceC0550w;
import n2.InterfaceC0678C;

/* loaded from: classes.dex */
public final class T0 extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f2201e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0678C f2202f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0112o0 f2203g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T0(InterfaceC0678C interfaceC0678C, C0112o0 c0112o0, P1.d dVar) {
        super(2, dVar);
        this.f2202f = interfaceC0678C;
        this.f2203g = c0112o0;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new T0(this.f2202f, this.f2203g, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((T0) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f2201e;
        if (i3 == 0) {
            I2.l.Q(obj);
            S0 s02 = new S0(this.f2203g, 1);
            this.f2201e = 1;
            if (this.f2202f.collect(s02, this) == aVar) {
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
