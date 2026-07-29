package X;

import android.app.Dialog;
import android.view.View;

/* renamed from: X.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0043l extends q1.d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0046o f920e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0044m f921f;

    public C0043l(DialogInterfaceOnCancelListenerC0044m dialogInterfaceOnCancelListenerC0044m, C0046o c0046o) {
        this.f921f = dialogInterfaceOnCancelListenerC0044m;
        this.f920e = c0046o;
    }

    @Override // q1.d
    public final View c0(int i) {
        C0046o c0046o = this.f920e;
        if (c0046o.d0()) {
            return c0046o.c0(i);
        }
        Dialog dialog = this.f921f.f931c0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // q1.d
    public final boolean d0() {
        return this.f920e.d0() || this.f921f.f934f0;
    }
}
