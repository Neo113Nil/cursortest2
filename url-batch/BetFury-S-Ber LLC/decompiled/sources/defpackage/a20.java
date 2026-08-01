package defpackage;

import android.widget.PopupWindow;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class a20 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ b20 f;

    public a20(b20 b20Var) {
        this.f = b20Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f.c();
    }
}
