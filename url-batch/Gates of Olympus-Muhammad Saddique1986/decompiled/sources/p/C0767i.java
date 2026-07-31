package p;

import e2.InterfaceC0426e;

/* renamed from: p.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0767i extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f7676h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f7677i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ X0 f7678j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0771k f7679k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0757d f7680l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ q2.X f7681m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0767i(X0 x02, C0771k c0771k, InterfaceC0757d interfaceC0757d, q2.X x3, V1.d dVar) {
        super(2, dVar);
        this.f7678j = x02;
        this.f7679k = c0771k;
        this.f7680l = interfaceC0757d;
        this.f7681m = x3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C0767i) o((V1.d) obj2, (C0787s0) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        C0767i c0767i = new C0767i(this.f7678j, this.f7679k, this.f7680l, this.f7681m, dVar);
        c0767i.f7677i = obj;
        return c0767i;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f7676h;
        if (i3 == 0) {
            R1.a.e(obj);
            C0787s0 c0787s0 = (C0787s0) this.f7677i;
            InterfaceC0757d interfaceC0757d = this.f7680l;
            C0771k c0771k = this.f7679k;
            float y02 = C0771k.y0(c0771k, interfaceC0757d);
            X0 x02 = this.f7678j;
            x02.f7632e = y02;
            R.h hVar = new R.h(c0771k, this.f7681m, c0787s0, 7);
            K2.i iVar = new K2.i(c0771k, x02, interfaceC0757d, 2);
            this.f7676h = 1;
            if (x02.a(hVar, iVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.a.e(obj);
        }
        return R1.y.f4171a;
    }
}
