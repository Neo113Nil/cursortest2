package x;

import e2.InterfaceC0426e;
import n0.C0702C;
import q2.AbstractC0837y;

/* renamed from: x.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1184B extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f9934h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f9935i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Z f9936j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ B.a0 f9937k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1184B(Z z3, B.a0 a0Var, V1.d dVar) {
        super(2, dVar);
        this.f9936j = z3;
        this.f9937k = a0Var;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C1184B) o((V1.d) obj2, (C0702C) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        C1184B c1184b = new C1184B(this.f9936j, this.f9937k, dVar);
        c1184b.f9935i = obj;
        return c1184b;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f9934h;
        if (i3 == 0) {
            R1.a.e(obj);
            C1183A c1183a = new C1183A((C0702C) this.f9935i, this.f9936j, this.f9937k, null);
            this.f9934h = 1;
            if (AbstractC0837y.e(c1183a, this) == aVar) {
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
