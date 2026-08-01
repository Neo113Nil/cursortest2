package E;

import android.view.ViewTreeObserver;

/* renamed from: E.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0006g implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f153a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0007h f154b;

    public ViewTreeObserverOnPreDrawListenerC0006g(C0007h c0007h, v vVar) {
        this.f154b = c0007h;
        this.f153a = vVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        C0007h c0007h = this.f154b;
        if (c0007h.f162h && c0007h.f160f != null) {
            this.f153a.getViewTreeObserver().removeOnPreDrawListener(this);
            c0007h.f160f = null;
        }
        return c0007h.f162h;
    }
}
