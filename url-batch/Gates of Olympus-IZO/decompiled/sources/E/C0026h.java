package E;

import k2.InterfaceC0550w;
import n2.InterfaceC0700f;

/* renamed from: E.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0026h extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f656e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f657f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q.i f658g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0019a f659h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0026h(q.i iVar, C0019a c0019a, P1.d dVar) {
        super(2, dVar);
        this.f658g = iVar;
        this.f659h = c0019a;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        C0026h c0026h = new C0026h(this.f658g, this.f659h, dVar);
        c0026h.f657f = obj;
        return c0026h;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C0026h) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f656e;
        if (i3 == 0) {
            I2.l.Q(obj);
            InterfaceC0550w interfaceC0550w = (InterfaceC0550w) this.f657f;
            InterfaceC0700f a3 = this.f658g.a();
            C0025g c0025g = new C0025g(this.f659h, 0, interfaceC0550w);
            this.f656e = 1;
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
