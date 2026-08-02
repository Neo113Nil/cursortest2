package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cua {
    long a = -1;
    long b = -1;

    public final long a() {
        oy.al(this.b != -1);
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        return (b() - this.b) / 1000000;
    }

    public final long b() {
        if (this.a == -1) {
            return System.nanoTime();
        }
        this.a = -1L;
        return 0L;
    }

    public final void c() {
        this.b = b();
    }
}
