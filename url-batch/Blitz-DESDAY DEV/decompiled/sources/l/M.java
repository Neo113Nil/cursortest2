package l;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import k.ViewTreeObserverOnGlobalLayoutListenerC0166d;

/* loaded from: classes.dex */
public final class M implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0166d f2902a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N f2903b;

    public M(N n2, ViewTreeObserverOnGlobalLayoutListenerC0166d viewTreeObserverOnGlobalLayoutListenerC0166d) {
        this.f2903b = n2;
        this.f2902a = viewTreeObserverOnGlobalLayoutListenerC0166d;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f2903b.f2908G.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f2902a);
        }
    }
}
