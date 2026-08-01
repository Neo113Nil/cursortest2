package Z;

import android.app.Dialog;
import android.view.View;

/* renamed from: Z.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0045l extends A1.d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0048o f1135e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0046m f1136f;

    public C0045l(DialogInterfaceOnCancelListenerC0046m dialogInterfaceOnCancelListenerC0046m, C0048o c0048o) {
        this.f1136f = dialogInterfaceOnCancelListenerC0046m;
        this.f1135e = c0048o;
    }

    @Override // A1.d
    public final View Y(int i) {
        C0048o c0048o = this.f1135e;
        if (c0048o.Z()) {
            return c0048o.Y(i);
        }
        Dialog dialog = this.f1136f.f1146c0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // A1.d
    public final boolean Z() {
        return this.f1135e.Z() || this.f1136f.f1149f0;
    }
}
