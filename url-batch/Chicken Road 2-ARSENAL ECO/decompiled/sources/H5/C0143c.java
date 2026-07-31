package H5;

import java.util.concurrent.locks.LockSupport;
import o5.InterfaceC0569i;

/* renamed from: H5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0143c extends AbstractC0141a {

    /* renamed from: i, reason: collision with root package name */
    public final Thread f1057i;

    /* renamed from: j, reason: collision with root package name */
    public final P f1058j;

    public C0143c(InterfaceC0569i interfaceC0569i, Thread thread, P p4) {
        super(interfaceC0569i, true);
        this.f1057i = thread;
        this.f1058j = p4;
    }

    @Override // H5.g0
    public final void k(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.f1057i;
        if (kotlin.jvm.internal.i.a(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
