package Z;

import android.app.Dialog;
import android.view.View;

/* renamed from: Z.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0042l extends z1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0045o f1146a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0043m f1147b;

    public C0042l(DialogInterfaceOnCancelListenerC0043m dialogInterfaceOnCancelListenerC0043m, C0045o c0045o) {
        this.f1147b = dialogInterfaceOnCancelListenerC0043m;
        this.f1146a = c0045o;
    }

    @Override // z1.l
    public final View c0(int i) {
        C0045o c0045o = this.f1146a;
        if (c0045o.f0()) {
            return c0045o.c0(i);
        }
        Dialog dialog = this.f1147b.f1157c0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // z1.l
    public final boolean f0() {
        return this.f1146a.f0() || this.f1147b.f1160f0;
    }
}
