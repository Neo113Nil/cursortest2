package B;

import e2.InterfaceC0426e;
import n0.C0702C;
import t0.AbstractC0993f;

/* renamed from: B.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0024z extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f468h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f469i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Y f470j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ x.Z f471k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0024z(Y y3, x.Z z3, V1.d dVar) {
        super(2, dVar);
        this.f470j = y3;
        this.f471k = z3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C0024z) o((V1.d) obj2, (C0702C) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        C0024z c0024z = new C0024z(this.f470j, this.f471k, dVar);
        c0024z.f469i = obj;
        return c0024z;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f468h;
        if (i3 == 0) {
            R1.a.e(obj);
            C0702C c0702c = (C0702C) this.f469i;
            c0702c.getClass();
            C0023y c0023y = new C0023y(this.f470j, new C0011l(AbstractC0993f.t(c0702c).f8558v), this.f471k, null);
            this.f468h = 1;
            if (n.r.g(c0702c, c0023y, this) == aVar) {
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
