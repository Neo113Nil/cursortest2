package l;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import k.ViewTreeObserverOnGlobalLayoutListenerC0155d;

/* renamed from: l.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0189L implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0155d f2822a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0190M f2823b;

    public C0189L(C0190M c0190m, ViewTreeObserverOnGlobalLayoutListenerC0155d viewTreeObserverOnGlobalLayoutListenerC0155d) {
        this.f2823b = c0190m;
        this.f2822a = viewTreeObserverOnGlobalLayoutListenerC0155d;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f2823b.f2827G.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f2822a);
        }
    }
}
