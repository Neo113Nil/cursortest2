package androidx.datastore.preferences.protobuf;

import java.util.List;

/* loaded from: classes.dex */
public final class E extends F {
    @Override // androidx.datastore.preferences.protobuf.F
    public final void a(long j4, Object obj) {
        ((AbstractC0436b) ((InterfaceC0457w) s0.f5400c.i(j4, obj))).f5317d = false;
    }

    @Override // androidx.datastore.preferences.protobuf.F
    public final void b(long j4, Object obj, Object obj2) {
        r0 r0Var = s0.f5400c;
        InterfaceC0457w interfaceC0457w = (InterfaceC0457w) r0Var.i(j4, obj);
        InterfaceC0457w interfaceC0457w2 = (InterfaceC0457w) r0Var.i(j4, obj2);
        int size = interfaceC0457w.size();
        int size2 = interfaceC0457w2.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC0436b) interfaceC0457w).f5317d) {
                interfaceC0457w = interfaceC0457w.q(size2 + size);
            }
            interfaceC0457w.addAll(interfaceC0457w2);
        }
        if (size > 0) {
            interfaceC0457w2 = interfaceC0457w;
        }
        s0.s(j4, obj, interfaceC0457w2);
    }

    @Override // androidx.datastore.preferences.protobuf.F
    public final List c(long j4, Object obj) {
        InterfaceC0457w interfaceC0457w = (InterfaceC0457w) s0.f5400c.i(j4, obj);
        if (((AbstractC0436b) interfaceC0457w).f5317d) {
            return interfaceC0457w;
        }
        int size = interfaceC0457w.size();
        InterfaceC0457w q2 = interfaceC0457w.q(size == 0 ? 10 : size * 2);
        s0.s(j4, obj, q2);
        return q2;
    }
}
