package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class epp {
    private static final epo g = new epm();
    public final jpt a;
    public final Executor b;
    public final AtomicBoolean c = new AtomicBoolean(false);
    public volatile epo d = g;
    public ScheduledFuture e;
    public ScheduledFuture f;

    public epp(ekv ekvVar, hvm hvmVar, Executor executor, jpt jptVar) {
        this.a = jptVar;
        this.b = executor;
        ekvVar.a(new epn(this, hvmVar));
    }

    public final void a() {
        ScheduledFuture scheduledFuture = this.e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.e = null;
        }
        ScheduledFuture scheduledFuture2 = this.f;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
            this.f = null;
        }
    }
}
