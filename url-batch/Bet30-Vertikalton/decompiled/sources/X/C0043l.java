package X;

import android.app.Dialog;
import android.view.View;

/* renamed from: X.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0043l extends q1.d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0046o f926e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0044m f927f;

    public C0043l(DialogInterfaceOnCancelListenerC0044m dialogInterfaceOnCancelListenerC0044m, C0046o c0046o) {
        this.f927f = dialogInterfaceOnCancelListenerC0044m;
        this.f926e = c0046o;
    }

    @Override // q1.d
    public final View d0(int i) {
        C0046o c0046o = this.f926e;
        if (c0046o.e0()) {
            return c0046o.d0(i);
        }
        Dialog dialog = this.f927f.f937c0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // q1.d
    public final boolean e0() {
        return this.f926e.e0() || this.f927f.f940f0;
    }
}
