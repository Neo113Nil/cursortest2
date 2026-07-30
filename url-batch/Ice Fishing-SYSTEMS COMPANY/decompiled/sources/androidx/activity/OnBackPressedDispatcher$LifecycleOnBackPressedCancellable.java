package androidx.activity;

import androidx.lifecycle.AbstractC0508p;
import androidx.lifecycle.EnumC0506n;
import androidx.lifecycle.InterfaceC0511t;
import androidx.lifecycle.InterfaceC0513v;

/* loaded from: classes.dex */
final class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements InterfaceC0511t, InterfaceC0461c {

    /* renamed from: n, reason: collision with root package name */
    public final AbstractC0508p f4548n;

    /* renamed from: u, reason: collision with root package name */
    public final androidx.fragment.app.E f4549u;

    /* renamed from: v, reason: collision with root package name */
    public E f4550v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ G f4551w;

    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(G g9, AbstractC0508p abstractC0508p, androidx.fragment.app.E onBackPressedCallback) {
        kotlin.jvm.internal.h.e(onBackPressedCallback, "onBackPressedCallback");
        this.f4551w = g9;
        this.f4548n = abstractC0508p;
        this.f4549u = onBackPressedCallback;
        abstractC0508p.a(this);
    }

    @Override // androidx.lifecycle.InterfaceC0511t
    public final void a(InterfaceC0513v interfaceC0513v, EnumC0506n enumC0506n) {
        if (enumC0506n != EnumC0506n.ON_START) {
            if (enumC0506n != EnumC0506n.ON_STOP) {
                if (enumC0506n == EnumC0506n.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                E e6 = this.f4550v;
                if (e6 != null) {
                    e6.cancel();
                    return;
                }
                return;
            }
        }
        G g9 = this.f4551w;
        g9.getClass();
        androidx.fragment.app.E onBackPressedCallback = this.f4549u;
        kotlin.jvm.internal.h.e(onBackPressedCallback, "onBackPressedCallback");
        g9.f4539b.addLast(onBackPressedCallback);
        E e9 = new E(g9, onBackPressedCallback);
        onBackPressedCallback.f4933b.add(e9);
        g9.e();
        onBackPressedCallback.f4934c = new F(0, g9, G.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 1);
        this.f4550v = e9;
    }

    @Override // androidx.activity.InterfaceC0461c
    public final void cancel() {
        this.f4548n.b(this);
        this.f4549u.f4933b.remove(this);
        E e6 = this.f4550v;
        if (e6 != null) {
            e6.cancel();
        }
        this.f4550v = null;
    }
}
