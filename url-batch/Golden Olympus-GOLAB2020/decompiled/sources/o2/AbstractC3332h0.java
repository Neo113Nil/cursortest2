package o2;

import java.util.concurrent.locks.LockSupport;
import o2.AbstractC3330g0;

/* renamed from: o2.h0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3332h0 extends AbstractC3328f0 {
    protected abstract Thread e0();

    protected void f0(long j4, AbstractC3330g0.c cVar) {
        O.f42018j.s0(j4, cVar);
    }

    protected final void g0() {
        Thread e02 = e0();
        if (Thread.currentThread() != e02) {
            AbstractC3321c.a();
            LockSupport.unpark(e02);
        }
    }
}
