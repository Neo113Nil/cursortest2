package l;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import k.ViewTreeObserverOnGlobalLayoutListenerC0158d;

/* renamed from: l.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0193L implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0158d f2879a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0194M f2880b;

    public C0193L(C0194M c0194m, ViewTreeObserverOnGlobalLayoutListenerC0158d viewTreeObserverOnGlobalLayoutListenerC0158d) {
        this.f2880b = c0194m;
        this.f2879a = viewTreeObserverOnGlobalLayoutListenerC0158d;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f2880b.f2890G.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f2879a);
        }
    }
}
