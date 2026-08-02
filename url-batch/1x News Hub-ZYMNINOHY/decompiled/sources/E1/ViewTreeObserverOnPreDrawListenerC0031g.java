package E1;

import android.view.ViewTreeObserver;

/* renamed from: E1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0031g implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f344a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0032h f345b;

    public ViewTreeObserverOnPreDrawListenerC0031g(C0032h c0032h, t tVar) {
        this.f345b = c0032h;
        this.f344a = tVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        C0032h c0032h = this.f345b;
        if (c0032h.f352h && c0032h.f != null) {
            this.f344a.getViewTreeObserver().removeOnPreDrawListener(this);
            c0032h.f = null;
        }
        return c0032h.f352h;
    }
}
