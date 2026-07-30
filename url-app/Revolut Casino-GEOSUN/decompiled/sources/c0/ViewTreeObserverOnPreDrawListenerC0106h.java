package c0;

import android.view.ViewTreeObserver;

/* renamed from: c0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0106h implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f1699e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0107i f1700f;

    public ViewTreeObserverOnPreDrawListenerC0106h(C0107i c0107i, r rVar) {
        this.f1700f = c0107i;
        this.f1699e = rVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        C0107i c0107i = this.f1700f;
        if (c0107i.f1708h && c0107i.f1706f != null) {
            this.f1699e.getViewTreeObserver().removeOnPreDrawListener(this);
            c0107i.f1706f = null;
        }
        return c0107i.f1708h;
    }
}
