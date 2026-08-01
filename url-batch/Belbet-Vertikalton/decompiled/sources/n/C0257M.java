package n;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import m.ViewTreeObserverOnGlobalLayoutListenerC0220d;

/* renamed from: n.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0257M implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0220d f3489a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0258N f3490b;

    public C0257M(C0258N c0258n, ViewTreeObserverOnGlobalLayoutListenerC0220d viewTreeObserverOnGlobalLayoutListenerC0220d) {
        this.f3490b = c0258n;
        this.f3489a = viewTreeObserverOnGlobalLayoutListenerC0220d;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f3490b.f3499G.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f3489a);
        }
    }
}
