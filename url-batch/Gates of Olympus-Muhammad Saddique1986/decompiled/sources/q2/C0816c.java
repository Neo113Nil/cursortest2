package q2;

import java.util.concurrent.locks.LockSupport;

/* renamed from: q2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0816c extends AbstractC0814a {

    /* renamed from: g, reason: collision with root package name */
    public final Thread f7881g;

    /* renamed from: h, reason: collision with root package name */
    public final O f7882h;

    public C0816c(V1.i iVar, Thread thread, O o3) {
        super(iVar, true);
        this.f7881g = thread;
        this.f7882h = o3;
    }

    @Override // q2.f0
    public final void A(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.f7881g;
        if (f2.j.a(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
