package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kal {
    public final kbd a;
    public final kbw b;
    public final kap c;
    public final ScheduledExecutorService d;
    public final Executor e;
    private final jwy f;
    private final kag g;
    private final kat h;

    public kal(kaj kajVar) {
        Integer num = kajVar.a;
        num.getClass();
        num.intValue();
        kbd kbdVar = kajVar.b;
        kbdVar.getClass();
        this.a = kbdVar;
        kbw kbwVar = kajVar.c;
        kbwVar.getClass();
        this.b = kbwVar;
        kap kapVar = kajVar.d;
        kapVar.getClass();
        this.c = kapVar;
        this.d = kajVar.e;
        this.f = kajVar.f;
        this.e = kajVar.g;
        kag kagVar = kajVar.h;
        this.g = kagVar == null ? new kai() : kagVar;
        this.h = kajVar.i;
    }

    public final String toString() {
        gzo T = hoq.T(this);
        T.e("defaultPort", 443);
        T.b("proxyDetector", this.a);
        T.b("syncContext", this.b);
        T.b("serviceConfigParser", this.c);
        T.b("customArgs", null);
        T.b("scheduledExecutorService", this.d);
        T.b("channelLogger", this.f);
        T.b("executor", this.e);
        T.b("overrideAuthority", null);
        T.b("metricRecorder", this.g);
        T.b("nameResolverRegistry", this.h);
        return T.toString();
    }
}
