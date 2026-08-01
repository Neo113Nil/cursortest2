package l;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import k.ViewTreeObserverOnGlobalLayoutListenerC0149d;

/* renamed from: l.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0198N implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0149d f2980a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0199O f2981b;

    public C0198N(C0199O c0199o, ViewTreeObserverOnGlobalLayoutListenerC0149d viewTreeObserverOnGlobalLayoutListenerC0149d) {
        this.f2981b = c0199o;
        this.f2980a = viewTreeObserverOnGlobalLayoutListenerC0149d;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f2981b.f2991G.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f2980a);
        }
    }
}
