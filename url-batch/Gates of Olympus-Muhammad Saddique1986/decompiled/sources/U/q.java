package U;

import e2.InterfaceC0424c;
import e2.InterfaceC0426e;

/* loaded from: classes.dex */
public interface q {
    Object a(Object obj, InterfaceC0426e interfaceC0426e);

    boolean d(InterfaceC0424c interfaceC0424c);

    default q i(q qVar) {
        return qVar == n.f4488a ? this : new k(this, qVar);
    }
}
