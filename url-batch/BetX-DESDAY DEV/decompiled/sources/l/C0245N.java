package l;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import k.ViewTreeObserverOnGlobalLayoutListenerC0193d;

/* renamed from: l.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0245N implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0193d f3272a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0246O f3273b;

    public C0245N(C0246O c0246o, ViewTreeObserverOnGlobalLayoutListenerC0193d viewTreeObserverOnGlobalLayoutListenerC0193d) {
        this.f3273b = c0246o;
        this.f3272a = viewTreeObserverOnGlobalLayoutListenerC0193d;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f3273b.f3284G.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f3272a);
        }
    }
}
