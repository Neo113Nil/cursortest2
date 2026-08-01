package X;

import android.app.Dialog;
import android.view.View;

/* renamed from: X.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0042l extends u1.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0045o f1011e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0043m f1012f;

    public C0042l(DialogInterfaceOnCancelListenerC0043m dialogInterfaceOnCancelListenerC0043m, C0045o c0045o) {
        this.f1012f = dialogInterfaceOnCancelListenerC0043m;
        this.f1011e = c0045o;
    }

    @Override // u1.l
    public final View V(int i) {
        C0045o c0045o = this.f1011e;
        if (c0045o.Y()) {
            return c0045o.V(i);
        }
        Dialog dialog = this.f1012f.f1022c0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // u1.l
    public final boolean Y() {
        return this.f1011e.Y() || this.f1012f.f1025f0;
    }
}
