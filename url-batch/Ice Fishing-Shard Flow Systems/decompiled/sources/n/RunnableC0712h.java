package n;

import android.view.View;

/* renamed from: n.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0712h implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final C0708f f6783d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0716j f6784e;

    public RunnableC0712h(C0716j c0716j, C0708f c0708f) {
        this.f6784e = c0716j;
        this.f6783d = c0708f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m.k kVar;
        C0716j c0716j = this.f6784e;
        m.m mVar = c0716j.f6800i;
        if (mVar != null && (kVar = mVar.f6414e) != null) {
            kVar.j(mVar);
        }
        View view = (View) c0716j.f6805p;
        if (view != null && view.getWindowToken() != null) {
            C0708f c0708f = this.f6783d;
            if (!c0708f.b()) {
                if (c0708f.f6480e != null) {
                    c0708f.d(0, 0, false, false);
                }
            }
            c0716j.f6793A = c0708f;
        }
        c0716j.f6795C = null;
    }
}
