package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ib extends PopupWindow {
    public ib(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        byo u = byo.u(context, attributeSet, em.t, i, 0);
        if (u.p(2)) {
            setOverlapAnchor(u.o(2, false));
        }
        setBackgroundDrawable(u.j(0));
        u.n();
    }
}
