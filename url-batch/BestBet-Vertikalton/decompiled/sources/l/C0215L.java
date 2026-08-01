package l;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import k.ViewTreeObserverOnGlobalLayoutListenerC0180d;

/* renamed from: l.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0215L implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0180d f3302a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0216M f3303b;

    public C0215L(C0216M c0216m, ViewTreeObserverOnGlobalLayoutListenerC0180d viewTreeObserverOnGlobalLayoutListenerC0180d) {
        this.f3303b = c0216m;
        this.f3302a = viewTreeObserverOnGlobalLayoutListenerC0180d;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f3303b.f3313G.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f3302a);
        }
    }
}
