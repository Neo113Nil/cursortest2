package defpackage;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class m5 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ h5 f;
    public final /* synthetic */ n5 g;

    public m5(n5 n5Var, h5 h5Var) {
        this.g = n5Var;
        this.f = h5Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.g.L.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f);
        }
    }
}
