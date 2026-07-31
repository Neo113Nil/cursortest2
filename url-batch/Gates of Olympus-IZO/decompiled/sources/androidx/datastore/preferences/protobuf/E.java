package androidx.datastore.preferences.protobuf;

import java.util.List;

/* loaded from: classes.dex */
public final class E extends F {
    @Override // androidx.datastore.preferences.protobuf.F
    public final void a(long j3, Object obj) {
        ((AbstractC0191b) ((InterfaceC0212w) s0.f3925c.i(j3, obj))).f3842d = false;
    }

    @Override // androidx.datastore.preferences.protobuf.F
    public final void b(long j3, Object obj, Object obj2) {
        r0 r0Var = s0.f3925c;
        InterfaceC0212w interfaceC0212w = (InterfaceC0212w) r0Var.i(j3, obj);
        InterfaceC0212w interfaceC0212w2 = (InterfaceC0212w) r0Var.i(j3, obj2);
        int size = interfaceC0212w.size();
        int size2 = interfaceC0212w2.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC0191b) interfaceC0212w).f3842d) {
                interfaceC0212w = interfaceC0212w.f(size2 + size);
            }
            interfaceC0212w.addAll(interfaceC0212w2);
        }
        if (size > 0) {
            interfaceC0212w2 = interfaceC0212w;
        }
        s0.s(j3, obj, interfaceC0212w2);
    }

    @Override // androidx.datastore.preferences.protobuf.F
    public final List c(long j3, Object obj) {
        InterfaceC0212w interfaceC0212w = (InterfaceC0212w) s0.f3925c.i(j3, obj);
        if (((AbstractC0191b) interfaceC0212w).f3842d) {
            return interfaceC0212w;
        }
        int size = interfaceC0212w.size();
        InterfaceC0212w f3 = interfaceC0212w.f(size == 0 ? 10 : size * 2);
        s0.s(j3, obj, f3);
        return f3;
    }
}
