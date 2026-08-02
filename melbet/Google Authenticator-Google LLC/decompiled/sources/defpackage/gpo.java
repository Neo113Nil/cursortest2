package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gpo {
    public boolean a;
    private long b;
    private final long c;
    private final List d;

    public gpo() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        this.c = 180000L;
        this.d = new ArrayList();
        this.a = false;
    }

    public final gpp a() {
        hoq.I(this.b != 0, "You must specify a minimum sync interval for all syncs.");
        hen henVar = new hen(4);
        for (gpr gprVar : this.d) {
            henVar.g(gprVar.a, gprVar);
        }
        return new gpp(this.b, this.c, henVar.d(true), this.a);
    }

    public final void b(gpr gprVar) {
        this.d.add(gprVar);
    }

    public final void c(long j, TimeUnit timeUnit) {
        this.b = TimeUnit.MILLISECONDS.convert(j, timeUnit);
    }
}
