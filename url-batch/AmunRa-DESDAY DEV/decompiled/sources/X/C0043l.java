package X;

import android.app.Dialog;
import android.view.View;

/* renamed from: X.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0043l extends s1.l {
    public final /* synthetic */ C0046o h;
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0044m i;

    public C0043l(DialogInterfaceOnCancelListenerC0044m dialogInterfaceOnCancelListenerC0044m, C0046o c0046o) {
        this.i = dialogInterfaceOnCancelListenerC0044m;
        this.h = c0046o;
    }

    @Override // s1.l
    public final View O(int i) {
        C0046o c0046o = this.h;
        if (c0046o.R()) {
            return c0046o.O(i);
        }
        Dialog dialog = this.i.f977c0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // s1.l
    public final boolean R() {
        return this.h.R() || this.i.f980f0;
    }
}
