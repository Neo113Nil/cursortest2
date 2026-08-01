package X;

import android.app.Dialog;
import android.view.View;

/* renamed from: X.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0043l extends u1.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0046o f997e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0044m f998f;

    public C0043l(DialogInterfaceOnCancelListenerC0044m dialogInterfaceOnCancelListenerC0044m, C0046o c0046o) {
        this.f998f = dialogInterfaceOnCancelListenerC0044m;
        this.f997e = c0046o;
    }

    @Override // u1.l
    public final View L(int i) {
        C0046o c0046o = this.f997e;
        if (c0046o.O()) {
            return c0046o.L(i);
        }
        Dialog dialog = this.f998f.f1008c0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // u1.l
    public final boolean O() {
        return this.f997e.O() || this.f998f.f1011f0;
    }
}
