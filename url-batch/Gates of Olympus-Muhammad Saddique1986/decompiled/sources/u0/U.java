package u0;

import android.view.Choreographer;
import e2.InterfaceC0426e;
import q2.InterfaceC0835w;

/* loaded from: classes.dex */
public final class U extends X1.i implements InterfaceC0426e {
    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((U) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new U(2, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        R1.a.e(obj);
        return Choreographer.getInstance();
    }
}
