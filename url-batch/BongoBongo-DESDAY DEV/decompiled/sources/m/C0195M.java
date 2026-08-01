package m;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import l.ViewTreeObserverOnGlobalLayoutListenerC0160d;

/* renamed from: m.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0195M implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0160d f2961a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0196N f2962b;

    public C0195M(C0196N c0196n, ViewTreeObserverOnGlobalLayoutListenerC0160d viewTreeObserverOnGlobalLayoutListenerC0160d) {
        this.f2962b = c0196n;
        this.f2961a = viewTreeObserverOnGlobalLayoutListenerC0160d;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f2962b.G.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f2961a);
        }
    }
}
