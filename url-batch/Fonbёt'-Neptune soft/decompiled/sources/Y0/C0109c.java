package Y0;

import java.util.concurrent.locks.LockSupport;

/* renamed from: Y0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0109c extends AbstractC0107a {

    /* renamed from: h, reason: collision with root package name */
    public final Thread f1198h;

    /* renamed from: i, reason: collision with root package name */
    public final H f1199i;

    public C0109c(H0.i iVar, Thread thread, H h2) {
        super(iVar, true);
        this.f1198h = thread;
        this.f1199i = h2;
    }

    @Override // Y0.Z
    public final void q(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.f1198h;
        if (Q0.h.a(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
