package defpackage;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class t5 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ o5 f;
    public final /* synthetic */ u5 g;

    public t5(u5 u5Var, o5 o5Var) {
        this.g = u5Var;
        this.f = o5Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.g.L.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f);
        }
    }
}
