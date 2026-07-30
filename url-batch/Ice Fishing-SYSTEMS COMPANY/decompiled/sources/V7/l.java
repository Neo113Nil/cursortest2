package V7;

import O7.AbstractC0395u;
import v7.InterfaceC5138i;

/* loaded from: classes2.dex */
public final class l extends AbstractC0395u {

    /* renamed from: v, reason: collision with root package name */
    public static final l f3367v = new l();

    public final AbstractC0395u A(int i) {
        T7.a.a(i);
        if (i >= k.f3362d) {
            return this;
        }
        T7.a.a(i);
        return new T7.i(this, i);
    }

    @Override // O7.AbstractC0395u
    public final void p(InterfaceC5138i interfaceC5138i, Runnable runnable) {
        e eVar = e.f3353w;
        eVar.f3355v.g(runnable, k.f3366h, false);
    }

    @Override // O7.AbstractC0395u
    public final void q(InterfaceC5138i interfaceC5138i, Runnable runnable) {
        e eVar = e.f3353w;
        eVar.f3355v.g(runnable, k.f3366h, true);
    }
}
