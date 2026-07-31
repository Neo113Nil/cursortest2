package W0;

import java.util.concurrent.locks.LockSupport;

/* renamed from: W0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0063c extends AbstractC0061a {

    /* renamed from: h, reason: collision with root package name */
    public final Thread f944h;

    /* renamed from: i, reason: collision with root package name */
    public final H f945i;

    public C0063c(G0.i iVar, Thread thread, H h2) {
        super(iVar, true);
        this.f944h = thread;
        this.f945i = h2;
    }

    @Override // W0.Z
    public final void p(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.f944h;
        if (P0.h.a(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
