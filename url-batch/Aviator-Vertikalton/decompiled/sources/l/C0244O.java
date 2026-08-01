package l;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import k.ViewTreeObserverOnGlobalLayoutListenerC0191d;

/* renamed from: l.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0244O implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0191d f3272a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0245P f3273b;

    public C0244O(C0245P c0245p, ViewTreeObserverOnGlobalLayoutListenerC0191d viewTreeObserverOnGlobalLayoutListenerC0191d) {
        this.f3273b = c0245p;
        this.f3272a = viewTreeObserverOnGlobalLayoutListenerC0191d;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f3273b.f3284G.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f3272a);
        }
    }
}
