package l;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import k.ViewTreeObserverOnGlobalLayoutListenerC0151d;

/* renamed from: l.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0199M implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0151d f2885a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0200N f2886b;

    public C0199M(C0200N c0200n, ViewTreeObserverOnGlobalLayoutListenerC0151d viewTreeObserverOnGlobalLayoutListenerC0151d) {
        this.f2886b = c0200n;
        this.f2885a = viewTreeObserverOnGlobalLayoutListenerC0151d;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f2886b.f2896G.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f2885a);
        }
    }
}
