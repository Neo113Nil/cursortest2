package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class klb extends ixd {
    final /* synthetic */ klc a;
    private final ixd b;

    public klb(klc klcVar, ixd ixdVar) {
        this.a = klcVar;
        this.b = ixdVar;
    }

    @Override // defpackage.ixd
    public final kbq a(kao kaoVar) {
        kbq a = this.b.a(kaoVar);
        boolean g = a.g();
        klc klcVar = this.a;
        if (g) {
            klcVar.c.a();
            return a;
        }
        kkh kkhVar = new kkh(klcVar, 6);
        ker kerVar = (ker) klcVar.c;
        kbw kbwVar = kerVar.c;
        kbwVar.c();
        if (kerVar.d == null) {
            kerVar.d = new kgo();
        }
        kuq kuqVar = kerVar.e;
        if (kuqVar != null && kuqVar.d()) {
            return a;
        }
        long a2 = kerVar.d.a();
        kerVar.e = kbwVar.d(kkhVar, a2, TimeUnit.NANOSECONDS, kerVar.b);
        ker.a.logp(Level.FINE, "io.grpc.internal.BackoffPolicyRetryScheduler", "schedule", "Scheduling DNS resolution backoff for {0}ns", Long.valueOf(a2));
        return a;
    }
}
