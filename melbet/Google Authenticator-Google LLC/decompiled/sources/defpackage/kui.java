package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kui {
    public static final AtomicIntegerFieldUpdater a = AtomicIntegerFieldUpdater.newUpdater(kui.class, "b");
    public volatile int b;
    public final ksy c;

    public kui(int i, ksy ksyVar) {
        this.c = ksyVar;
        this.b = i;
    }

    public final int a() {
        return a.decrementAndGet(this);
    }

    public final int b() {
        return a.getAndIncrement(this);
    }

    public final int c() {
        return a.incrementAndGet(this);
    }

    public final boolean d(int i, int i2) {
        boolean compareAndSet = a.compareAndSet(this, i, i2);
        if (!compareAndSet || this.c == kul.a) {
            return compareAndSet;
        }
        return true;
    }

    public final String toString() {
        return String.valueOf(this.b);
    }
}
