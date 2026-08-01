package Z;

import android.app.Dialog;
import android.view.View;

/* renamed from: Z.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0048l extends H1.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0051o f1565b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0049m f1566c;

    public C0048l(DialogInterfaceOnCancelListenerC0049m dialogInterfaceOnCancelListenerC0049m, C0051o c0051o) {
        this.f1566c = dialogInterfaceOnCancelListenerC0049m;
        this.f1565b = c0051o;
    }

    @Override // H1.d
    public final View S(int i) {
        C0051o c0051o = this.f1565b;
        if (c0051o.T()) {
            return c0051o.S(i);
        }
        Dialog dialog = this.f1566c.f1576c0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // H1.d
    public final boolean T() {
        return this.f1565b.T() || this.f1566c.f1579f0;
    }
}
