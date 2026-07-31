package U;

import e2.InterfaceC0424c;
import e2.InterfaceC0426e;

/* loaded from: classes.dex */
public interface o extends q {
    @Override // U.q
    default Object a(Object obj, InterfaceC0426e interfaceC0426e) {
        return interfaceC0426e.h(obj, this);
    }

    @Override // U.q
    default boolean d(InterfaceC0424c interfaceC0424c) {
        return ((Boolean) interfaceC0424c.n(this)).booleanValue();
    }
}
