package t2;

import java.util.concurrent.locks.LockSupport;

/* renamed from: t2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1193c extends AbstractC1191a {

    /* renamed from: d, reason: collision with root package name */
    public final Thread f10402d;

    /* renamed from: e, reason: collision with root package name */
    public final J f10403e;

    public C1193c(d2.h hVar, Thread thread, J j3) {
        super(hVar, true);
        this.f10402d = thread;
        this.f10403e = j3;
    }

    @Override // t2.e0
    public final void o(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.f10402d;
        if (kotlin.jvm.internal.j.a(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
