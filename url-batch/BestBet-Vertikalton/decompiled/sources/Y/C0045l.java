package Y;

import android.app.Dialog;
import android.view.View;

/* renamed from: Y.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0045l extends H1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0048o f1416a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0046m f1417b;

    public C0045l(DialogInterfaceOnCancelListenerC0046m dialogInterfaceOnCancelListenerC0046m, C0048o c0048o) {
        this.f1417b = dialogInterfaceOnCancelListenerC0046m;
        this.f1416a = c0048o;
    }

    @Override // H1.l
    public final View V(int i) {
        C0048o c0048o = this.f1416a;
        if (c0048o.W()) {
            return c0048o.V(i);
        }
        Dialog dialog = this.f1417b.f1427c0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // H1.l
    public final boolean W() {
        return this.f1416a.W() || this.f1417b.f1430f0;
    }
}
