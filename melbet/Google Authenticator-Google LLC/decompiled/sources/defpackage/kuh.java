package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kuh {
    public static final /* synthetic */ int a = 0;
    private static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(kuh.class, "c");
    private volatile int c;
    private final ksy d;

    public kuh(boolean z, ksy ksyVar) {
        this.d = ksyVar;
        this.c = z ? 1 : 0;
    }

    public final boolean a() {
        return this.c != 0;
    }

    public final boolean b() {
        boolean compareAndSet = b.compareAndSet(this, 0, 1);
        if (!compareAndSet || this.d == kul.a) {
            return compareAndSet;
        }
        return true;
    }

    public final void c() {
        this.c = 1;
    }

    public final String toString() {
        return String.valueOf(a());
    }
}
