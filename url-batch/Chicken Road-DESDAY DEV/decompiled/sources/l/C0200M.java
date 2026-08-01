package l;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import k.ViewTreeObserverOnGlobalLayoutListenerC0152d;

/* renamed from: l.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0200M implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0152d f2830a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0201N f2831b;

    public C0200M(C0201N c0201n, ViewTreeObserverOnGlobalLayoutListenerC0152d viewTreeObserverOnGlobalLayoutListenerC0152d) {
        this.f2831b = c0201n;
        this.f2830a = viewTreeObserverOnGlobalLayoutListenerC0152d;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f2831b.f2835G.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f2830a);
        }
    }
}
