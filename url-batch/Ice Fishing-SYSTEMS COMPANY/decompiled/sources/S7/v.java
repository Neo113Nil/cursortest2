package S7;

import v7.InterfaceC5133d;
import v7.InterfaceC5138i;

/* loaded from: classes2.dex */
public final class v implements InterfaceC5133d, x7.d {

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC5133d f3025n;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC5138i f3026u;

    public v(InterfaceC5133d interfaceC5133d, InterfaceC5138i interfaceC5138i) {
        this.f3025n = interfaceC5133d;
        this.f3026u = interfaceC5138i;
    }

    @Override // x7.d
    public final x7.d getCallerFrame() {
        InterfaceC5133d interfaceC5133d = this.f3025n;
        if (interfaceC5133d instanceof x7.d) {
            return (x7.d) interfaceC5133d;
        }
        return null;
    }

    @Override // v7.InterfaceC5133d
    public final InterfaceC5138i getContext() {
        return this.f3026u;
    }

    @Override // v7.InterfaceC5133d
    public final void resumeWith(Object obj) {
        this.f3025n.resumeWith(obj);
    }
}
