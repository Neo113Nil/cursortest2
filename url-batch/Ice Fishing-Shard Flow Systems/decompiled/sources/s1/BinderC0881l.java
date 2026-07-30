package s1;

import java.lang.ref.WeakReference;

/* renamed from: s1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0881l extends I1.d {

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f7671e;

    public BinderC0881l(C0883n c0883n) {
        this.f7671e = new WeakReference(c0883n);
    }

    @Override // I1.e
    public final void a(I1.h hVar) {
        C0883n c0883n = (C0883n) this.f7671e.get();
        if (c0883n == null) {
            return;
        }
        C0878i c0878i = new C0878i(this, c0883n, c0883n, hVar);
        HandlerC0884o handlerC0884o = c0883n.f7676d.f7724i;
        handlerC0884o.sendMessage(handlerC0884o.obtainMessage(1, c0878i));
    }
}
