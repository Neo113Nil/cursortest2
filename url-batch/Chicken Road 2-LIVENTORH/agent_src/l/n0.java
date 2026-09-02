package l;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class n0 implements PopupWindow.OnDismissListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k.d f2400f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o0 f2401g;

    public n0(o0 o0Var, k.d dVar) {
        this.f2401g = o0Var;
        this.f2400f = dVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f2401g.L.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f2400f);
        }
    }
}
