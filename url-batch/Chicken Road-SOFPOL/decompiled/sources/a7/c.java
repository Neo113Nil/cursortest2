package a7;

import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: g, reason: collision with root package name */
    public final Thread f245g;

    /* renamed from: h, reason: collision with root package name */
    public final m0 f246h;

    public c(g6.h hVar, Thread thread, m0 m0Var) {
        super(hVar, true);
        this.f245g = thread;
        this.f246h = m0Var;
    }

    @Override // a7.a1
    public final void y(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.f245g;
        if (q6.i.a(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
