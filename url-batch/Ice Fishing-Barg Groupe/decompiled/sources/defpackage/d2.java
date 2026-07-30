package defpackage;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class d2 {
    public static final d2 PxuCJdSBwIXG = new d2();

    public final void PxuCJdSBwIXG(View view, yn1 yn1Var) {
        Context context = view.getContext();
        PointerIcon systemIcon = yn1Var instanceof b5 ? PointerIcon.getSystemIcon(context, ((b5) yn1Var).PxuCJdSBwIXG) : PointerIcon.getSystemIcon(context, 1000);
        if (cs0.wdg6QnbFHrFF(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
