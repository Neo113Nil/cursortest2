package u0;

import android.view.PointerIcon;
import android.view.View;
import n0.C0703a;
import n0.InterfaceC0717o;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public static final J f9201a = new J();

    public final void a(View view, InterfaceC0717o interfaceC0717o) {
        PointerIcon systemIcon = interfaceC0717o instanceof C0703a ? PointerIcon.getSystemIcon(view.getContext(), ((C0703a) interfaceC0717o).f7269b) : PointerIcon.getSystemIcon(view.getContext(), 1000);
        if (f2.j.a(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
