package b;

import androidx.lifecycle.C0483x;
import androidx.lifecycle.EnumC0474n;
import androidx.lifecycle.InterfaceC0479t;
import androidx.lifecycle.InterfaceC0481v;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class B implements InterfaceC0479t, InterfaceC0488c {

    /* renamed from: d, reason: collision with root package name */
    public final C0483x f5508d;

    /* renamed from: e, reason: collision with root package name */
    public final v f5509e;

    /* renamed from: i, reason: collision with root package name */
    public C f5510i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ D f5511j;

    public B(D d4, C0483x lifecycle, v onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        this.f5511j = d4;
        this.f5508d = lifecycle;
        this.f5509e = onBackPressedCallback;
        lifecycle.a(this);
    }

    @Override // androidx.lifecycle.InterfaceC0479t
    public final void b(InterfaceC0481v source, EnumC0474n event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event != EnumC0474n.ON_START) {
            if (event != EnumC0474n.ON_STOP) {
                if (event == EnumC0474n.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                C c4 = this.f5510i;
                if (c4 != null) {
                    c4.cancel();
                    return;
                }
                return;
            }
        }
        D d4 = this.f5511j;
        d4.getClass();
        v onBackPressedCallback = this.f5509e;
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        d4.f5515b.addLast(onBackPressedCallback);
        C cancellable = new C(d4, onBackPressedCallback);
        Intrinsics.checkNotNullParameter(cancellable, "cancellable");
        onBackPressedCallback.f5587b.add(cancellable);
        d4.e();
        onBackPressedCallback.f5588c = new X.e(0, d4, D.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 3);
        this.f5510i = cancellable;
    }

    @Override // b.InterfaceC0488c
    public final void cancel() {
        this.f5508d.f(this);
        v vVar = this.f5509e;
        vVar.getClass();
        Intrinsics.checkNotNullParameter(this, "cancellable");
        vVar.f5587b.remove(this);
        C c4 = this.f5510i;
        if (c4 != null) {
            c4.cancel();
        }
        this.f5510i = null;
    }
}
