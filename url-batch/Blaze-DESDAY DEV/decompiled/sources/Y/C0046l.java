package Y;

import android.app.Dialog;
import android.view.View;

/* renamed from: Y.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0046l extends z1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0049o f1084a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0047m f1085b;

    public C0046l(DialogInterfaceOnCancelListenerC0047m dialogInterfaceOnCancelListenerC0047m, C0049o c0049o) {
        this.f1085b = dialogInterfaceOnCancelListenerC0047m;
        this.f1084a = c0049o;
    }

    @Override // z1.d
    public final View b0(int i) {
        C0049o c0049o = this.f1084a;
        if (c0049o.e0()) {
            return c0049o.b0(i);
        }
        Dialog dialog = this.f1085b.f1095c0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // z1.d
    public final boolean e0() {
        return this.f1084a.e0() || this.f1085b.f1098f0;
    }
}
