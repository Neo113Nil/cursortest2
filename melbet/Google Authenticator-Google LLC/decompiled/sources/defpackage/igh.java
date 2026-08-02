package defpackage;

import android.content.Context;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class igh implements jrw {
    private final jsb a;
    private final jsb b;
    private final jsb c;
    private final jsb d;
    private final jsb e;
    private final jsb f;
    private final jsb g;
    private final jsb h;
    private final jsb i;
    private final jsb j;
    private final jsb k;
    private final jsb l;
    private final jsb m;
    private final jsb n;

    public igh(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6, jsb jsbVar7, jsb jsbVar8, jsb jsbVar9, jsb jsbVar10, jsb jsbVar11, jsb jsbVar12, jsb jsbVar13, jsb jsbVar14) {
        this.a = jsbVar;
        this.b = jsbVar2;
        this.c = jsbVar3;
        this.d = jsbVar4;
        this.e = jsbVar5;
        this.f = jsbVar6;
        this.g = jsbVar7;
        this.h = jsbVar8;
        this.i = jsbVar9;
        this.j = jsbVar10;
        this.k = jsbVar11;
        this.l = jsbVar12;
        this.m = jsbVar13;
        this.n = jsbVar14;
    }

    @Override // defpackage.koe, defpackage.kod
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final icn b() {
        Context context;
        dih dihVar;
        idd iddVar;
        Executor executor;
        Executor executor2;
        Executor executor3;
        hac hacVar;
        hac hacVar2;
        hac hacVar3;
        Context b = ((jrk) this.a).b();
        dih dihVar2 = (dih) this.b.b();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.c.b();
        Executor executor4 = (Executor) this.d.b();
        Executor executor5 = (Executor) this.e.b();
        idd b2 = ((icr) this.f).b();
        gzp a = ((bnu) this.g).a();
        gzp gzpVar = (gzp) ((jrx) this.h).a;
        gzp gzpVar2 = (gzp) ((jrx) this.i).a;
        gzp gzpVar3 = (gzp) ((jrx) this.j).a;
        Set set = (Set) ((jrx) this.k).a;
        gzp gzpVar4 = (gzp) ((jrx) this.l).a;
        gzl gzlVar = igg.a;
        fsd fsdVar = new fsd(3);
        icm icmVar = new icm();
        icmVar.j = fsdVar;
        icmVar.k = fsdVar;
        TimeUnit timeUnit = TimeUnit.MINUTES;
        icmVar.l = new haf(1800000L);
        icmVar.a(4194304);
        icmVar.p = Long.MAX_VALUE;
        icmVar.r = (byte) (icmVar.r | 2);
        icmVar.q = idc.a;
        icmVar.r = (byte) (icmVar.r | 4);
        icmVar.a = b;
        if (dihVar2 == null) {
            throw new NullPointerException("Null clock");
        }
        icmVar.t = dihVar2;
        if (scheduledExecutorService == null) {
            throw new NullPointerException("Null lightweightExecutor");
        }
        icmVar.c = scheduledExecutorService;
        icmVar.f = scheduledExecutorService;
        if (executor4 == null) {
            throw new NullPointerException("Null backgroundExecutor");
        }
        icmVar.d = executor4;
        if (executor5 == null) {
            throw new NullPointerException("Null blockingExecutor");
        }
        icmVar.e = executor5;
        icmVar.b = b2;
        icmVar.g = (idh) ((gzs) a).a;
        icmVar.m = (icv) gzpVar.e();
        icmVar.h = (icx) gzpVar2.e();
        icmVar.n = (idv) gzpVar3.e();
        String c = set.isEmpty() ? null : igg.a.c(new TreeSet(set));
        jsb jsbVar = this.n;
        jsb jsbVar2 = this.m;
        icmVar.i = c;
        icmVar.s = (iwp) gzpVar4.e();
        icmVar.j = new goi(jsbVar2, 3);
        icmVar.a(((Integer) ((gzp) ((jrx) jsbVar).a).d(4194304)).intValue());
        if (icmVar.r == 7 && (context = icmVar.a) != null && (dihVar = icmVar.t) != null && (iddVar = icmVar.b) != null && (executor = icmVar.c) != null && (executor2 = icmVar.d) != null && (executor3 = icmVar.e) != null && (hacVar = icmVar.j) != null && (hacVar2 = icmVar.k) != null && (hacVar3 = icmVar.l) != null) {
            icn icnVar = new icn(context, dihVar, iddVar, executor, executor2, executor3, icmVar.f, icmVar.g, icmVar.h, icmVar.i, hacVar, hacVar2, hacVar3, icmVar.m, icmVar.n, icmVar.o, icmVar.p, icmVar.q, icmVar.s);
            hoq.I(icnVar.g == null || icnVar.e != null, "If authContextManager is set, networkExecutor must be set.");
            return icnVar;
        }
        StringBuilder sb = new StringBuilder();
        if (icmVar.a == null) {
            sb.append(" context");
        }
        if (icmVar.t == null) {
            sb.append(" clock");
        }
        if (icmVar.b == null) {
            sb.append(" transport");
        }
        if (icmVar.c == null) {
            sb.append(" lightweightExecutor");
        }
        if (icmVar.d == null) {
            sb.append(" backgroundExecutor");
        }
        if (icmVar.e == null) {
            sb.append(" blockingExecutor");
        }
        if (icmVar.j == null) {
            sb.append(" recordNetworkMetricsToPrimes");
        }
        if (icmVar.k == null) {
            sb.append(" recordCachingMetricsToPrimes");
        }
        if (icmVar.l == null) {
            sb.append(" grpcIdleTimeoutMillis");
        }
        if ((icmVar.r & 1) == 0) {
            sb.append(" maxMessageSize");
        }
        if ((icmVar.r & 2) == 0) {
            sb.append(" grpcKeepAliveTimeMillis");
        }
        if ((icmVar.r & 4) == 0) {
            sb.append(" grpcKeepAliveTimeoutMillis");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
