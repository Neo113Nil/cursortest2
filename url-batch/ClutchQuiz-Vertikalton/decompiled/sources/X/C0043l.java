package X;

import android.app.Dialog;
import android.view.View;

/* renamed from: X.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0043l extends T.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0046o f1063a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0044m f1064b;

    public C0043l(DialogInterfaceOnCancelListenerC0044m dialogInterfaceOnCancelListenerC0044m, C0046o c0046o) {
        this.f1064b = dialogInterfaceOnCancelListenerC0044m;
        this.f1063a = c0046o;
    }

    @Override // T.d
    public final View C(int i) {
        C0046o c0046o = this.f1063a;
        if (c0046o.D()) {
            return c0046o.C(i);
        }
        Dialog dialog = this.f1064b.f1074c0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // T.d
    public final boolean D() {
        return this.f1063a.D() || this.f1064b.f1077f0;
    }
}
