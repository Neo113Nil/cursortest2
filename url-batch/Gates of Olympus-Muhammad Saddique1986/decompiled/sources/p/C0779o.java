package p;

import e2.InterfaceC0426e;
import q2.AbstractC0837y;
import q2.InterfaceC0835w;

/* renamed from: p.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0779o extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f7738h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0783q f7739i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n.e0 f7740j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0426e f7741k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0779o(C0783q c0783q, n.e0 e0Var, InterfaceC0426e interfaceC0426e, V1.d dVar) {
        super(2, dVar);
        this.f7739i = c0783q;
        this.f7740j = e0Var;
        this.f7741k = interfaceC0426e;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C0779o) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new C0779o(this.f7739i, this.f7740j, this.f7741k, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f7738h;
        if (i3 == 0) {
            R1.a.e(obj);
            C0783q c0783q = this.f7739i;
            n.h0 h0Var = c0783q.f7751c;
            C0781p c0781p = c0783q.f7750b;
            C0777n c0777n = new C0777n(c0783q, this.f7741k, null);
            this.f7738h = 1;
            h0Var.getClass();
            if (AbstractC0837y.e(new n.g0(this.f7740j, h0Var, c0777n, c0781p, null), this) == aVar) {
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
