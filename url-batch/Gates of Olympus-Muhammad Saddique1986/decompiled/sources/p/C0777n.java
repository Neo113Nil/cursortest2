package p;

import e2.InterfaceC0426e;

/* renamed from: p.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0777n extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f7734h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f7735i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0783q f7736j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0426e f7737k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0777n(C0783q c0783q, InterfaceC0426e interfaceC0426e, V1.d dVar) {
        super(2, dVar);
        this.f7736j = c0783q;
        this.f7737k = interfaceC0426e;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C0777n) o((V1.d) obj2, (U) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        C0777n c0777n = new C0777n(this.f7736j, this.f7737k, dVar);
        c0777n.f7735i = obj;
        return c0777n;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f7734h;
        C0783q c0783q = this.f7736j;
        try {
            if (i3 == 0) {
                R1.a.e(obj);
                U u3 = (U) this.f7735i;
                c0783q.f7752d.setValue(Boolean.TRUE);
                InterfaceC0426e interfaceC0426e = this.f7737k;
                this.f7734h = 1;
                if (interfaceC0426e.h(u3, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                R1.a.e(obj);
            }
            c0783q.f7752d.setValue(Boolean.FALSE);
            return R1.y.f4171a;
        } catch (Throwable th) {
            c0783q.f7752d.setValue(Boolean.FALSE);
            throw th;
        }
    }
}
