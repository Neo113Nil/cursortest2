package E;

import e2.InterfaceC0426e;
import m.AbstractC0620e;
import m.AbstractC0639y;
import m.C0619d;
import m.t0;
import q2.InterfaceC0835w;

/* loaded from: classes.dex */
public final class n extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f976h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p f977i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, V1.d dVar) {
        super(2, dVar);
        this.f977i = pVar;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((n) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new n(this.f977i, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f976h;
        if (i3 == 0) {
            R1.a.e(obj);
            p pVar = this.f977i;
            Float f3 = new Float(0.0f);
            t0 j3 = AbstractC0620e.j(150, 0, AbstractC0639y.f6912d, 2);
            this.f976h = 1;
            if (C0619d.c(pVar.f985f, f3, j3, null, this, 12) == aVar) {
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
