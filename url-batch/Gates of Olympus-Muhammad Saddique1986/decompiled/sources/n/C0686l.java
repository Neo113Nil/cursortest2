package n;

import e2.InterfaceC0426e;
import n0.C0702C;

/* renamed from: n.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0686l extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f7161h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f7162i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0687m f7163j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0686l(C0687m c0687m, V1.d dVar) {
        super(2, dVar);
        this.f7163j = c0687m;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C0686l) o((V1.d) obj2, (C0702C) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        C0686l c0686l = new C0686l(this.f7163j, dVar);
        c0686l.f7162i = obj;
        return c0686l;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f7161h;
        if (i3 == 0) {
            R1.a.e(obj);
            C0702C c0702c = (C0702C) this.f7162i;
            C0685k c0685k = new C0685k(this.f7163j, null);
            this.f7161h = 1;
            if (r.g(c0702c, c0685k, this) == aVar) {
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
