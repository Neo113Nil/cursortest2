package androidx.lifecycle;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import n6.C0787u;
import n6.InterfaceC0789w;

/* loaded from: classes.dex */
public final class r implements InterfaceC0254u, InterfaceC0789w {

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0250p f3915d;

    /* renamed from: e, reason: collision with root package name */
    public final CoroutineContext f3916e;

    public r(AbstractC0250p lifecycle, CoroutineContext coroutineContext) {
        n6.X x7;
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.f3915d = lifecycle;
        this.f3916e = coroutineContext;
        if (((C0258y) lifecycle).f3922d != EnumC0249o.f3906d || (x7 = (n6.X) coroutineContext.g(C0787u.f7085e)) == null) {
            return;
        }
        x7.d(null);
    }

    @Override // androidx.lifecycle.InterfaceC0254u
    public final void a(InterfaceC0256w source, EnumC0248n event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        AbstractC0250p abstractC0250p = this.f3915d;
        if (((C0258y) abstractC0250p).f3922d.compareTo(EnumC0249o.f3906d) <= 0) {
            abstractC0250p.b(this);
            n6.X x7 = (n6.X) this.f3916e.g(C0787u.f7085e);
            if (x7 != null) {
                x7.d(null);
            }
        }
    }

    @Override // n6.InterfaceC0789w
    public final CoroutineContext h() {
        return this.f3916e;
    }
}
