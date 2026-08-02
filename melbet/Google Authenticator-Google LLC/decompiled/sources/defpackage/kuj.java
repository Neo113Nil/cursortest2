package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kuj {
    public static final AtomicLongFieldUpdater a = AtomicLongFieldUpdater.newUpdater(kuj.class, "b");
    public volatile long b;
    public final ksy c;

    public kuj(long j, ksy ksyVar) {
        this.c = ksyVar;
        this.b = j;
    }

    public final long a(long j) {
        return a.addAndGet(this, j);
    }

    public final long b() {
        return a.getAndIncrement(this);
    }

    public final boolean c(long j, long j2) {
        boolean compareAndSet = a.compareAndSet(this, j, j2);
        if (!compareAndSet || this.c == kul.a) {
            return compareAndSet;
        }
        return true;
    }

    public final String toString() {
        return String.valueOf(this.b);
    }
}
