package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class klf extends kle {
    private final AtomicIntegerFieldUpdater a;

    public klf(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.a = atomicIntegerFieldUpdater;
    }

    @Override // defpackage.kle
    public final boolean a(klh klhVar) {
        return this.a.compareAndSet(klhVar, 0, -1);
    }

    @Override // defpackage.kle
    public final void b(klh klhVar) {
        this.a.set(klhVar, 0);
    }
}
