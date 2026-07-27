package w2;

import android.view.ViewTreeObserver;

/* renamed from: w2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC1516d implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f12131a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1517e f12132b;

    public ViewTreeObserverOnPreDrawListenerC1516d(C1517e c1517e, m mVar) {
        this.f12132b = c1517e;
        this.f12131a = mVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        C1517e c1517e = this.f12132b;
        if (c1517e.f12140h && c1517e.f12138f != null) {
            this.f12131a.getViewTreeObserver().removeOnPreDrawListener(this);
            c1517e.f12138f = null;
        }
        return c1517e.f12140h;
    }
}
