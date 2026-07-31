package k0;

import android.view.ViewTreeObserver;

/* renamed from: k0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0188e implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f2676e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0190g f2677f;

    public ViewTreeObserverOnPreDrawListenerC0188e(C0190g c0190g, o oVar) {
        this.f2677f = c0190g;
        this.f2676e = oVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        C0190g c0190g = this.f2677f;
        if (c0190g.f2685h && c0190g.f2683f != null) {
            this.f2676e.getViewTreeObserver().removeOnPreDrawListener(this);
            c0190g.f2683f = null;
        }
        return c0190g.f2685h;
    }
}
