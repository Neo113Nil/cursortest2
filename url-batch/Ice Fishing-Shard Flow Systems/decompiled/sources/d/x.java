package d;

import androidx.fragment.app.H;
import androidx.lifecycle.AbstractC0250p;
import androidx.lifecycle.EnumC0248n;
import androidx.lifecycle.InterfaceC0254u;
import androidx.lifecycle.InterfaceC0256w;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class x implements InterfaceC0254u, c {

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0250p f4609d;

    /* renamed from: e, reason: collision with root package name */
    public final H f4610e;

    /* renamed from: i, reason: collision with root package name */
    public y f4611i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0349A f4612l;

    public x(C0349A c0349a, AbstractC0250p lifecycle, H onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        this.f4612l = c0349a;
        this.f4609d = lifecycle;
        this.f4610e = onBackPressedCallback;
        lifecycle.a(this);
    }

    @Override // androidx.lifecycle.InterfaceC0254u
    public final void a(InterfaceC0256w source, EnumC0248n event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event != EnumC0248n.ON_START) {
            if (event != EnumC0248n.ON_STOP) {
                if (event == EnumC0248n.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                y yVar = this.f4611i;
                if (yVar != null) {
                    yVar.cancel();
                    return;
                }
                return;
            }
        }
        H onBackPressedCallback = this.f4610e;
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        C0349A c0349a = this.f4612l;
        c0349a.f4560b.addLast(onBackPressedCallback);
        y cancellable = new y(c0349a, onBackPressedCallback);
        onBackPressedCallback.getClass();
        Intrinsics.checkNotNullParameter(cancellable, "cancellable");
        onBackPressedCallback.f3585b.add(cancellable);
        c0349a.d();
        onBackPressedCallback.f3586c = new z(0, c0349a, C0349A.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 1);
        this.f4611i = cancellable;
    }

    @Override // d.c
    public final void cancel() {
        this.f4609d.b(this);
        H h7 = this.f4610e;
        h7.getClass();
        Intrinsics.checkNotNullParameter(this, "cancellable");
        h7.f3585b.remove(this);
        y yVar = this.f4611i;
        if (yVar != null) {
            yVar.cancel();
        }
        this.f4611i = null;
    }
}
