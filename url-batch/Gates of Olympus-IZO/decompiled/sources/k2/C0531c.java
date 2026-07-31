package k2;

import java.util.concurrent.locks.LockSupport;

/* renamed from: k2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0531c extends AbstractC0529a {

    /* renamed from: g, reason: collision with root package name */
    public final Thread f5342g;

    /* renamed from: h, reason: collision with root package name */
    public final O f5343h;

    public C0531c(P1.i iVar, Thread thread, O o3) {
        super(iVar, true);
        this.f5342g = thread;
        this.f5343h = o3;
    }

    @Override // k2.f0
    public final void l(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.f5342g;
        if (Z1.i.a(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
