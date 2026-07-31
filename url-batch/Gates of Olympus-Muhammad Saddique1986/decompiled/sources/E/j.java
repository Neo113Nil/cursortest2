package E;

import e2.InterfaceC0426e;
import m.AbstractC0620e;
import m.AbstractC0639y;
import m.C0619d;
import m.t0;
import q2.InterfaceC0835w;

/* loaded from: classes.dex */
public final class j extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f968h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p f969i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p pVar, V1.d dVar) {
        super(2, dVar);
        this.f969i = pVar;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((j) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new j(this.f969i, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f968h;
        if (i3 == 0) {
            R1.a.e(obj);
            C0619d c0619d = this.f969i.f985f;
            Float f3 = new Float(1.0f);
            t0 j3 = AbstractC0620e.j(75, 0, AbstractC0639y.f6912d, 2);
            this.f968h = 1;
            if (C0619d.c(c0619d, f3, j3, null, this, 12) == aVar) {
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
