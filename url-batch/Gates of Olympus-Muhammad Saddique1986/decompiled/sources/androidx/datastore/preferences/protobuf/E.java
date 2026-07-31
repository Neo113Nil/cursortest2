package androidx.datastore.preferences.protobuf;

import java.util.List;

/* loaded from: classes.dex */
public final class E extends F {
    @Override // androidx.datastore.preferences.protobuf.F
    public final void a(long j3, Object obj) {
        ((AbstractC0247b) ((InterfaceC0268w) s0.f5126c.i(j3, obj))).f5043d = false;
    }

    @Override // androidx.datastore.preferences.protobuf.F
    public final void b(long j3, Object obj, Object obj2) {
        r0 r0Var = s0.f5126c;
        InterfaceC0268w interfaceC0268w = (InterfaceC0268w) r0Var.i(j3, obj);
        InterfaceC0268w interfaceC0268w2 = (InterfaceC0268w) r0Var.i(j3, obj2);
        int size = interfaceC0268w.size();
        int size2 = interfaceC0268w2.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC0247b) interfaceC0268w).f5043d) {
                interfaceC0268w = interfaceC0268w.f(size2 + size);
            }
            interfaceC0268w.addAll(interfaceC0268w2);
        }
        if (size > 0) {
            interfaceC0268w2 = interfaceC0268w;
        }
        s0.s(j3, obj, interfaceC0268w2);
    }

    @Override // androidx.datastore.preferences.protobuf.F
    public final List c(long j3, Object obj) {
        InterfaceC0268w interfaceC0268w = (InterfaceC0268w) s0.f5126c.i(j3, obj);
        if (((AbstractC0247b) interfaceC0268w).f5043d) {
            return interfaceC0268w;
        }
        int size = interfaceC0268w.size();
        InterfaceC0268w f3 = interfaceC0268w.f(size == 0 ? 10 : size * 2);
        s0.s(j3, obj, f3);
        return f3;
    }
}
