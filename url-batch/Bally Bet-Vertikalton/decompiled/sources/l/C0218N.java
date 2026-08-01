package l;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import k.ViewTreeObserverOnGlobalLayoutListenerC0149d;

/* renamed from: l.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0218N implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0149d f2885a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0219O f2886b;

    public C0218N(C0219O c0219o, ViewTreeObserverOnGlobalLayoutListenerC0149d viewTreeObserverOnGlobalLayoutListenerC0149d) {
        this.f2886b = c0219o;
        this.f2885a = viewTreeObserverOnGlobalLayoutListenerC0149d;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f2886b.f2896G.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f2885a);
        }
    }
}
