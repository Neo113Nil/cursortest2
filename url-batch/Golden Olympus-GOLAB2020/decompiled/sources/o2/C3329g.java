package o2;

import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: o2.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3329g extends AbstractC3317a {

    /* renamed from: e, reason: collision with root package name */
    private final Thread f42070e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC3328f0 f42071f;

    public C3329g(CoroutineContext coroutineContext, Thread thread, AbstractC3328f0 abstractC3328f0) {
        super(coroutineContext, true, true);
        this.f42070e = thread;
        this.f42071f = abstractC3328f0;
    }

    @Override // o2.D0
    protected void C(Object obj) {
        if (Intrinsics.areEqual(Thread.currentThread(), this.f42070e)) {
            return;
        }
        Thread thread = this.f42070e;
        AbstractC3321c.a();
        LockSupport.unpark(thread);
    }

    public final Object S0() {
        AbstractC3321c.a();
        try {
            AbstractC3328f0 abstractC3328f0 = this.f42071f;
            if (abstractC3328f0 != null) {
                AbstractC3328f0.Y(abstractC3328f0, false, 1, null);
            }
            while (!Thread.interrupted()) {
                try {
                    AbstractC3328f0 abstractC3328f02 = this.f42071f;
                    long b02 = abstractC3328f02 != null ? abstractC3328f02.b0() : Long.MAX_VALUE;
                    if (isCompleted()) {
                        AbstractC3328f0 abstractC3328f03 = this.f42071f;
                        if (abstractC3328f03 != null) {
                            AbstractC3328f0.p(abstractC3328f03, false, 1, null);
                        }
                        AbstractC3321c.a();
                        Object h4 = E0.h(c0());
                        C3308B c3308b = h4 instanceof C3308B ? (C3308B) h4 : null;
                        if (c3308b == null) {
                            return h4;
                        }
                        throw c3308b.f41962a;
                    }
                    AbstractC3321c.a();
                    LockSupport.parkNanos(this, b02);
                } catch (Throwable th) {
                    AbstractC3328f0 abstractC3328f04 = this.f42071f;
                    if (abstractC3328f04 != null) {
                        AbstractC3328f0.p(abstractC3328f04, false, 1, null);
                    }
                    throw th;
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            F(interruptedException);
            throw interruptedException;
        } catch (Throwable th2) {
            AbstractC3321c.a();
            throw th2;
        }
    }

    @Override // o2.D0
    protected boolean j0() {
        return true;
    }
}
