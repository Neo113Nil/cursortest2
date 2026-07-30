package androidx.fragment.app;

import android.app.Dialog;
import android.view.View;

/* renamed from: androidx.fragment.app.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0225p extends A {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3748d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ComponentCallbacksC0228t f3749e;

    public C0225p(DialogInterfaceOnCancelListenerC0226q dialogInterfaceOnCancelListenerC0226q, C0225p c0225p) {
        this.f3749e = dialogInterfaceOnCancelListenerC0226q;
    }

    @Override // androidx.fragment.app.A
    public final View b(int i2) {
        switch (this.f3748d) {
            case 0:
                Dialog dialog = ((DialogInterfaceOnCancelListenerC0226q) this.f3749e).f3759j0;
                if (dialog != null) {
                    return dialog.findViewById(i2);
                }
                return null;
            default:
                throw new IllegalStateException("Fragment " + this.f3749e + " does not have a view");
        }
    }

    @Override // androidx.fragment.app.A
    public final boolean c() {
        switch (this.f3748d) {
            case 0:
                return ((DialogInterfaceOnCancelListenerC0226q) this.f3749e).f3763n0;
            default:
                return false;
        }
    }

    public C0225p(ComponentCallbacksC0228t componentCallbacksC0228t) {
        this.f3749e = componentCallbacksC0228t;
    }
}
