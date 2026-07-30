package androidx.lifecycle;

import O7.AbstractC0399y;
import O7.InterfaceC0397w;
import v7.InterfaceC5138i;

/* loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl implements InterfaceC0511t, InterfaceC0397w {

    /* renamed from: n, reason: collision with root package name */
    public final AbstractC0508p f5237n;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC5138i f5238u;

    public LifecycleCoroutineScopeImpl(AbstractC0508p abstractC0508p, InterfaceC5138i coroutineContext) {
        kotlin.jvm.internal.h.e(coroutineContext, "coroutineContext");
        this.f5237n = abstractC0508p;
        this.f5238u = coroutineContext;
        if (((C0515x) abstractC0508p).f5290d == EnumC0507o.f5276n) {
            AbstractC0399y.d(coroutineContext, null);
        }
    }

    @Override // androidx.lifecycle.InterfaceC0511t
    public final void a(InterfaceC0513v interfaceC0513v, EnumC0506n enumC0506n) {
        AbstractC0508p abstractC0508p = this.f5237n;
        if (((C0515x) abstractC0508p).f5290d.compareTo(EnumC0507o.f5276n) <= 0) {
            abstractC0508p.b(this);
            AbstractC0399y.d(this.f5238u, null);
        }
    }

    @Override // O7.InterfaceC0397w
    public final InterfaceC5138i z() {
        return this.f5238u;
    }
}
