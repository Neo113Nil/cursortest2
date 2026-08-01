package l;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import k.ViewTreeObserverOnGlobalLayoutListenerC0148d;

/* renamed from: l.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0217N implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0148d f2897a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0218O f2898b;

    public C0217N(C0218O c0218o, ViewTreeObserverOnGlobalLayoutListenerC0148d viewTreeObserverOnGlobalLayoutListenerC0148d) {
        this.f2898b = c0218o;
        this.f2897a = viewTreeObserverOnGlobalLayoutListenerC0148d;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f2898b.f2908G.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f2897a);
        }
    }
}
