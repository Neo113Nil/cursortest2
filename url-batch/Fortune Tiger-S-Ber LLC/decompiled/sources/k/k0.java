package k;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class k0 implements PopupWindow.OnDismissListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j.d f2586f;
    public final /* synthetic */ l0 g;

    public k0(l0 l0Var, j.d dVar) {
        this.g = l0Var;
        this.f2586f = dVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.g.L.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f2586f);
        }
    }
}
