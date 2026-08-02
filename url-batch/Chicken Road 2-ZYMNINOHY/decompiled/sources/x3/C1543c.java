package x3;

import f3.InterfaceC0430h;
import java.util.concurrent.locks.LockSupport;

/* renamed from: x3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1543c extends AbstractC1541a {

    /* renamed from: d, reason: collision with root package name */
    public final Thread f16022d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC1534I f16023e;

    public C1543c(InterfaceC0430h interfaceC0430h, Thread thread, AbstractC1534I abstractC1534I) {
        super(interfaceC0430h, true);
        this.f16022d = thread;
        this.f16023e = abstractC1534I;
    }

    @Override // x3.d0
    public final void l(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.f16022d;
        if (kotlin.jvm.internal.i.a(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
