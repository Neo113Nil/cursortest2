package D3;

import android.view.ViewTreeObserver;

/* renamed from: D3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0119g implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t f423f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0121i f424g;

    public ViewTreeObserverOnPreDrawListenerC0119g(C0121i c0121i, t tVar) {
        this.f424g = c0121i;
        this.f423f = tVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        C0121i c0121i = this.f424g;
        if (c0121i.f432h && c0121i.f430f != null) {
            this.f423f.getViewTreeObserver().removeOnPreDrawListener(this);
            c0121i.f430f = null;
        }
        return c0121i.f432h;
    }
}
