package defpackage;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class u5 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ p5 f;
    public final /* synthetic */ v5 g;

    public u5(v5 v5Var, p5 p5Var) {
        this.g = v5Var;
        this.f = p5Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.g.L.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f);
        }
    }
}
