package X;

import android.app.Dialog;
import android.view.View;

/* renamed from: X.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0044l extends q1.d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0047o f928e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0045m f929f;

    public C0044l(DialogInterfaceOnCancelListenerC0045m dialogInterfaceOnCancelListenerC0045m, C0047o c0047o) {
        this.f929f = dialogInterfaceOnCancelListenerC0045m;
        this.f928e = c0047o;
    }

    @Override // q1.d
    public final View d0(int i) {
        C0047o c0047o = this.f928e;
        if (c0047o.e0()) {
            return c0047o.d0(i);
        }
        Dialog dialog = this.f929f.f939c0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // q1.d
    public final boolean e0() {
        return this.f928e.e0() || this.f929f.f942f0;
    }
}
