package n;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import m.ViewTreeObserverOnGlobalLayoutListenerC0679d;

/* loaded from: classes.dex */
public final class N implements PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0679d f6676d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ O f6677e;

    public N(O o7, ViewTreeObserverOnGlobalLayoutListenerC0679d viewTreeObserverOnGlobalLayoutListenerC0679d) {
        this.f6677e = o7;
        this.f6676d = viewTreeObserverOnGlobalLayoutListenerC0679d;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f6677e.f6686N.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f6676d);
        }
    }
}
