package s1;

import android.view.PointerIcon;
import android.view.View;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final h0 f8239a = new h0();

    public final void a(View view, l1.r rVar) {
        PointerIcon systemIcon = rVar instanceof l1.a ? PointerIcon.getSystemIcon(view.getContext(), ((l1.a) rVar).f5771b) : PointerIcon.getSystemIcon(view.getContext(), 1000);
        if (r6.k.a(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
