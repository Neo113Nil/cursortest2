package l;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import k.ViewTreeObserverOnGlobalLayoutListenerC0157d;

/* renamed from: l.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0193M implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0157d f2849a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0194N f2850b;

    public C0193M(C0194N c0194n, ViewTreeObserverOnGlobalLayoutListenerC0157d viewTreeObserverOnGlobalLayoutListenerC0157d) {
        this.f2850b = c0194n;
        this.f2849a = viewTreeObserverOnGlobalLayoutListenerC0157d;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f2850b.f2860G.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f2849a);
        }
    }
}
