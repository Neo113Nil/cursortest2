package s;

import R1.y;
import e2.InterfaceC0426e;
import m.AbstractC0620e;
import m.C0628m;
import m.W;
import q2.InterfaceC0835w;

/* renamed from: s.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0950s extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f8314h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0951t f8315i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0950s(C0951t c0951t, V1.d dVar) {
        super(2, dVar);
        this.f8315i = c0951t;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C0950s) o((V1.d) obj2, (InterfaceC0835w) obj)).q(y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new C0950s(this.f8315i, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f8314h;
        if (i3 == 0) {
            R1.a.e(obj);
            C0628m c0628m = this.f8315i.f8338v;
            Float f3 = new Float(0.0f);
            W i4 = AbstractC0620e.i(400.0f, new Float(0.5f), 1);
            this.f8314h = 1;
            if (AbstractC0620e.d(c0628m, f3, i4, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.a.e(obj);
        }
        return y.f4171a;
    }
}
