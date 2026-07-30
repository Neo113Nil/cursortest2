package O7;

import java.util.concurrent.locks.LockSupport;
import v7.InterfaceC5138i;

/* renamed from: O7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0378c extends AbstractC0376a {

    /* renamed from: w, reason: collision with root package name */
    public final Thread f2581w;

    /* renamed from: x, reason: collision with root package name */
    public final P f2582x;

    public C0378c(InterfaceC5138i interfaceC5138i, Thread thread, P p6) {
        super(interfaceC5138i, true);
        this.f2581w = thread;
        this.f2582x = p6;
    }

    @Override // O7.h0
    public final void k(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.f2581w;
        if (kotlin.jvm.internal.h.a(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
