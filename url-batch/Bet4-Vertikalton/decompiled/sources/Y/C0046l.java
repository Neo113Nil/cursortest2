package Y;

import android.app.Dialog;
import android.view.View;

/* renamed from: Y.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0046l extends w1.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0049o f1057e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0047m f1058f;

    public C0046l(DialogInterfaceOnCancelListenerC0047m dialogInterfaceOnCancelListenerC0047m, C0049o c0049o) {
        this.f1058f = dialogInterfaceOnCancelListenerC0047m;
        this.f1057e = c0049o;
    }

    @Override // w1.l
    public final View I(int i) {
        C0049o c0049o = this.f1057e;
        if (c0049o.J()) {
            return c0049o.I(i);
        }
        Dialog dialog = this.f1058f.f1068c0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // w1.l
    public final boolean J() {
        return this.f1057e.J() || this.f1058f.f1071f0;
    }
}
