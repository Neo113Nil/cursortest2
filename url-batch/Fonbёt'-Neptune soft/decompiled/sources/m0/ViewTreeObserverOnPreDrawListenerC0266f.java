package m0;

import android.view.ViewTreeObserver;

/* renamed from: m0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0266f implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f3149e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0267g f3150f;

    public ViewTreeObserverOnPreDrawListenerC0266f(C0267g c0267g, q qVar) {
        this.f3150f = c0267g;
        this.f3149e = qVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        C0267g c0267g = this.f3150f;
        if (c0267g.f3157g && c0267g.f3155e != null) {
            this.f3149e.getViewTreeObserver().removeOnPreDrawListener(this);
            c0267g.f3155e = null;
        }
        return c0267g.f3157g;
    }
}
