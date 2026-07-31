package F;

import e2.InterfaceC0426e;
import m.C0619d;
import q.C0808d;
import q2.InterfaceC0835w;

/* loaded from: classes.dex */
public final class E extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f1134h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0619d f1135i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f1136j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f1137k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q.i f1138l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(C0619d c0619d, float f3, boolean z3, d1 d1Var, q.i iVar, V1.d dVar) {
        super(2, dVar);
        this.f1135i = c0619d;
        this.f1136j = f3;
        this.f1137k = z3;
        this.f1138l = iVar;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((E) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new E(this.f1135i, this.f1136j, this.f1137k, null, this.f1138l, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f1134h;
        if (i3 == 0) {
            R1.a.e(obj);
            C0619d c0619d = this.f1135i;
            float f3 = ((O0.e) c0619d.f6761e.getValue()).f3731d;
            float f4 = this.f1136j;
            if (!O0.e.a(f3, f4)) {
                if (this.f1137k) {
                    float f5 = ((O0.e) c0619d.f6761e.getValue()).f3731d;
                    q.i mVar = O0.e.a(f5, 0.0f) ? new q.m(0L) : O0.e.a(f5, 0.0f) ? new q.g() : O0.e.a(f5, 0.0f) ? new C0808d() : null;
                    this.f1134h = 2;
                    if (G.e.a(c0619d, f4, mVar, this.f1138l, this) == aVar) {
                        return aVar;
                    }
                } else {
                    O0.e eVar = new O0.e(f4);
                    this.f1134h = 1;
                    if (c0619d.e(this, eVar) == aVar) {
                        return aVar;
                    }
                }
            }
        } else {
            if (i3 != 1 && i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.a.e(obj);
        }
        return R1.y.f4171a;
    }
}
