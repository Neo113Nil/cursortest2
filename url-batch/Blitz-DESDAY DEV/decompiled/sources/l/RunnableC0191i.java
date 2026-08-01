package l;

import android.view.View;

/* renamed from: l.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0191i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final C0187g f2995a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0195k f2996b;

    public RunnableC0191i(C0195k c0195k, C0187g c0187g) {
        this.f2996b = c0195k;
        this.f2995a = c0187g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k.k kVar;
        C0195k c0195k = this.f2996b;
        k.m mVar = c0195k.f3015c;
        if (mVar != null && (kVar = mVar.f2768e) != null) {
            kVar.o(mVar);
        }
        View view = (View) c0195k.h;
        if (view != null && view.getWindowToken() != null) {
            C0187g c0187g = this.f2995a;
            if (!c0187g.b()) {
                if (c0187g.f2829e != null) {
                    c0187g.d(0, 0, false, false);
                }
            }
            c0195k.f3028s = c0187g;
        }
        c0195k.f3030u = null;
    }
}
