package X;

import android.app.Dialog;
import android.view.View;

/* renamed from: X.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0043l extends x1.d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0046o f1037e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0044m f1038f;

    public C0043l(DialogInterfaceOnCancelListenerC0044m dialogInterfaceOnCancelListenerC0044m, C0046o c0046o) {
        this.f1038f = dialogInterfaceOnCancelListenerC0044m;
        this.f1037e = c0046o;
    }

    @Override // x1.d
    public final View N(int i) {
        C0046o c0046o = this.f1037e;
        if (c0046o.Q()) {
            return c0046o.N(i);
        }
        Dialog dialog = this.f1038f.f1048c0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // x1.d
    public final boolean Q() {
        return this.f1037e.Q() || this.f1038f.f1051f0;
    }
}
