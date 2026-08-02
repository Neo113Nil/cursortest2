package defpackage;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hvf extends AbstractOwnableSynchronizer implements Runnable {
    private final hvg a;

    public hvf(hvg hvgVar) {
        this.a = hvgVar;
    }

    public final void a(Thread thread) {
        super.setExclusiveOwnerThread(thread);
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
