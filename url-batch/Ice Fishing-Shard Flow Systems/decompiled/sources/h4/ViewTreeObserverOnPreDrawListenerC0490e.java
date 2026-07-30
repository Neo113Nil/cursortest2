package h4;

import android.view.ViewTreeObserver;

/* renamed from: h4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0490e implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f5196d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0492g f5197e;

    public ViewTreeObserverOnPreDrawListenerC0490e(C0492g c0492g, p pVar) {
        this.f5197e = c0492g;
        this.f5196d = pVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        C0492g c0492g = this.f5197e;
        if (c0492g.f5205h && c0492g.f5203f != null) {
            this.f5196d.getViewTreeObserver().removeOnPreDrawListener(this);
            c0492g.f5203f = null;
        }
        return c0492g.f5205h;
    }
}
