package f2;

import d2.InterfaceC0300c;

/* loaded from: classes.dex */
public abstract class h extends AbstractC0324a {
    public h(InterfaceC0300c interfaceC0300c) {
        super(interfaceC0300c);
        if (interfaceC0300c.getContext() != d2.i.f4951a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // d2.InterfaceC0300c
    public final d2.h getContext() {
        return d2.i.f4951a;
    }
}
