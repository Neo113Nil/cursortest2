package l;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import k.ViewTreeObserverOnGlobalLayoutListenerC0148d;

/* renamed from: l.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0217N implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0148d f2902a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0218O f2903b;

    public C0217N(C0218O c0218o, ViewTreeObserverOnGlobalLayoutListenerC0148d viewTreeObserverOnGlobalLayoutListenerC0148d) {
        this.f2903b = c0218o;
        this.f2902a = viewTreeObserverOnGlobalLayoutListenerC0148d;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f2903b.f2913G.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f2902a);
        }
    }
}
