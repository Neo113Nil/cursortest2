package androidx.fragment.app;

import a.AbstractC0415a;
import android.app.Dialog;
import android.view.View;

/* renamed from: androidx.fragment.app.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0480m extends AbstractC0415a {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0484q f5111n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0481n f5112u;

    public C0480m(DialogInterfaceOnCancelListenerC0481n dialogInterfaceOnCancelListenerC0481n, C0484q c0484q) {
        this.f5112u = dialogInterfaceOnCancelListenerC0481n;
        this.f5111n = c0484q;
    }

    @Override // a.AbstractC0415a
    public final View t(int i) {
        C0484q c0484q = this.f5111n;
        if (c0484q.u()) {
            return c0484q.t(i);
        }
        Dialog dialog = this.f5112u.f5120I0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // a.AbstractC0415a
    public final boolean u() {
        return this.f5111n.u() || this.f5112u.f5124M0;
    }
}
