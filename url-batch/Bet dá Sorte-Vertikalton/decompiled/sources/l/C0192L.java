package l;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import k.ViewTreeObserverOnGlobalLayoutListenerC0148d;

/* renamed from: l.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0192L implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0148d f2864a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0193M f2865b;

    public C0192L(C0193M c0193m, ViewTreeObserverOnGlobalLayoutListenerC0148d viewTreeObserverOnGlobalLayoutListenerC0148d) {
        this.f2865b = c0193m;
        this.f2864a = viewTreeObserverOnGlobalLayoutListenerC0148d;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f2865b.f2875G.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f2864a);
        }
    }
}
