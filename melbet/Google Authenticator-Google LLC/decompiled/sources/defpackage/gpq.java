package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gpq {
    public gps a;
    private long b = -1;

    public final gpr a() {
        return new gpr(this.a, this.b);
    }

    public final void b(long j, TimeUnit timeUnit) {
        this.b = TimeUnit.MILLISECONDS.convert(j, timeUnit);
    }
}
