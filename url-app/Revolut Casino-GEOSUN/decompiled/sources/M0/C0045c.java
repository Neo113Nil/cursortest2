package M0;

import java.util.concurrent.locks.LockSupport;

/* renamed from: M0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0045c extends AbstractC0043a {

    /* renamed from: h, reason: collision with root package name */
    public final Thread f655h;

    /* renamed from: i, reason: collision with root package name */
    public final H f656i;

    public C0045c(w0.i iVar, Thread thread, H h2) {
        super(iVar, true);
        this.f655h = thread;
        this.f656i = h2;
    }

    @Override // M0.Z
    public final void o(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.f655h;
        if (F0.i.a(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
