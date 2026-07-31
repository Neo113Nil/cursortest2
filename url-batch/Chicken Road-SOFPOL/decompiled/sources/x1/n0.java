package x1;

import android.view.Choreographer;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class n0 implements Choreographer.FrameCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a7.h f8514d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p6.c f8515e;

    public n0(a7.h hVar, m0.j1 j1Var, p6.c cVar) {
        this.f8514d = hVar;
        this.f8515e = cVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j7) {
        Object l3;
        try {
            l3 = this.f8515e.i(Long.valueOf(j7));
        } catch (Throwable th) {
            l3 = s6.a.l(th);
        }
        this.f8514d.k(l3);
    }
}
