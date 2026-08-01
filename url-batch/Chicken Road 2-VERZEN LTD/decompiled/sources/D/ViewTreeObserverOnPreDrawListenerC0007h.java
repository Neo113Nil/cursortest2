package D;

import android.view.ViewTreeObserver;

/* renamed from: D.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0007h implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f75a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0008i f76b;

    public ViewTreeObserverOnPreDrawListenerC0007h(C0008i c0008i, y yVar) {
        this.f76b = c0008i;
        this.f75a = yVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        C0008i c0008i = this.f76b;
        if (c0008i.f84h && c0008i.f82f != null) {
            this.f75a.getViewTreeObserver().removeOnPreDrawListener(this);
            c0008i.f82f = null;
        }
        return c0008i.f84h;
    }
}
