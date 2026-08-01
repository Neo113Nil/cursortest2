package androidx.fragment.app;

import android.app.Dialog;
import android.view.View;

/* renamed from: androidx.fragment.app.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0055l extends q1.l {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0058o f1352g;
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0056m h;

    public C0055l(DialogInterfaceOnCancelListenerC0056m dialogInterfaceOnCancelListenerC0056m, C0058o c0058o) {
        this.h = dialogInterfaceOnCancelListenerC0056m;
        this.f1352g = c0058o;
    }

    @Override // q1.l
    public final View Q(int i) {
        C0058o c0058o = this.f1352g;
        if (c0058o.T()) {
            return c0058o.Q(i);
        }
        Dialog dialog = this.h.f1362c0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // q1.l
    public final boolean T() {
        return this.f1352g.T() || this.h.f1365f0;
    }
}
