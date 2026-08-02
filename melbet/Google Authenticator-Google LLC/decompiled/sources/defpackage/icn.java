package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class icn {
    public final Context a;
    public final idd b;
    public final Executor c;
    public final Executor d;
    public final Executor e;
    public final ScheduledExecutorService f;
    public final idh g;
    public final icx h;
    public final String i;
    public final hac j;
    public final hac k;
    public final hac l;
    public final icv m;
    public final idv n;
    public final int o;
    public final long p;
    public final long q;
    public final iwp r;
    private final dih s;

    public icn(Context context, dih dihVar, idd iddVar, Executor executor, Executor executor2, Executor executor3, ScheduledExecutorService scheduledExecutorService, idh idhVar, icx icxVar, String str, hac hacVar, hac hacVar2, hac hacVar3, icv icvVar, idv idvVar, int i, long j, long j2, iwp iwpVar) {
        this.a = context;
        this.s = dihVar;
        this.b = iddVar;
        this.c = executor;
        this.d = executor2;
        this.e = executor3;
        this.f = scheduledExecutorService;
        this.g = idhVar;
        this.h = icxVar;
        this.i = str;
        this.j = hacVar;
        this.k = hacVar2;
        this.l = hacVar3;
        this.m = icvVar;
        this.n = idvVar;
        this.o = i;
        this.p = j;
        this.q = j2;
        this.r = iwpVar;
    }

    public final boolean equals(Object obj) {
        ScheduledExecutorService scheduledExecutorService;
        idh idhVar;
        icx icxVar;
        String str;
        icv icvVar;
        idv idvVar;
        iwp iwpVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof icn) {
            icn icnVar = (icn) obj;
            if (this.a.equals(icnVar.a) && this.s.equals(icnVar.s) && this.b.equals(icnVar.b) && this.c.equals(icnVar.c) && this.d.equals(icnVar.d) && this.e.equals(icnVar.e) && ((scheduledExecutorService = this.f) != null ? scheduledExecutorService.equals(icnVar.f) : icnVar.f == null) && ((idhVar = this.g) != null ? idhVar.equals(icnVar.g) : icnVar.g == null) && ((icxVar = this.h) != null ? icxVar.equals(icnVar.h) : icnVar.h == null) && ((str = this.i) != null ? str.equals(icnVar.i) : icnVar.i == null) && this.j.equals(icnVar.j) && this.k.equals(icnVar.k) && this.l.equals(icnVar.l) && ((icvVar = this.m) != null ? icvVar.equals(icnVar.m) : icnVar.m == null) && ((idvVar = this.n) != null ? idvVar.equals(icnVar.n) : icnVar.n == null) && this.o == icnVar.o && this.p == icnVar.p && this.q == icnVar.q && ((iwpVar = this.r) != null ? iwpVar.equals(icnVar.r) : icnVar.r == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.s.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
        ScheduledExecutorService scheduledExecutorService = this.f;
        int hashCode2 = ((hashCode * 1000003) ^ (scheduledExecutorService == null ? 0 : scheduledExecutorService.hashCode())) * 1000003;
        idh idhVar = this.g;
        int hashCode3 = (hashCode2 ^ (idhVar == null ? 0 : idhVar.hashCode())) * 1000003;
        icx icxVar = this.h;
        int hashCode4 = (hashCode3 ^ (icxVar == null ? 0 : icxVar.hashCode())) * 1000003;
        String str = this.i;
        int hashCode5 = (((((((hashCode4 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003;
        icv icvVar = this.m;
        int hashCode6 = (hashCode5 ^ (icvVar == null ? 0 : icvVar.hashCode())) * 1000003;
        idv idvVar = this.n;
        int hashCode7 = (((hashCode6 ^ (idvVar == null ? 0 : idvVar.hashCode())) * 1000003) ^ this.o) * 1000003;
        long j = this.p;
        int i = (hashCode7 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.q;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        iwp iwpVar = this.r;
        return i2 ^ (iwpVar != null ? iwpVar.hashCode() : 0);
    }

    public final String toString() {
        iwp iwpVar = this.r;
        idv idvVar = this.n;
        icv icvVar = this.m;
        hac hacVar = this.l;
        hac hacVar2 = this.k;
        hac hacVar3 = this.j;
        icx icxVar = this.h;
        idh idhVar = this.g;
        ScheduledExecutorService scheduledExecutorService = this.f;
        Executor executor = this.e;
        Executor executor2 = this.d;
        Executor executor3 = this.c;
        idd iddVar = this.b;
        dih dihVar = this.s;
        return "ChannelConfig{context=" + String.valueOf(this.a) + ", clock=" + String.valueOf(dihVar) + ", transport=" + String.valueOf(iddVar) + ", lightweightExecutor=" + String.valueOf(executor3) + ", backgroundExecutor=" + String.valueOf(executor2) + ", blockingExecutor=" + String.valueOf(executor) + ", lightweightScheduledExecutor=" + String.valueOf(scheduledExecutorService) + ", authContextManager=" + String.valueOf(idhVar) + ", rpcCacheProvider=" + String.valueOf(icxVar) + ", userAgentOverride=" + this.i + ", recordNetworkMetricsToPrimes=" + String.valueOf(hacVar3) + ", recordCachingMetricsToPrimes=" + String.valueOf(hacVar2) + ", grpcIdleTimeoutMillis=" + String.valueOf(hacVar) + ", grpcServiceConfig=" + String.valueOf(icvVar) + ", consistencyTokenConfig=" + String.valueOf(idvVar) + ", maxMessageSize=" + this.o + ", grpcKeepAliveTimeMillis=" + this.p + ", grpcKeepAliveTimeoutMillis=" + this.q + ", channelCredentials=" + String.valueOf(iwpVar) + "}";
    }

    public icn() {
        throw null;
    }
}
