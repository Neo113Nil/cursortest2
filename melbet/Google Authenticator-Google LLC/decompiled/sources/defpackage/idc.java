package defpackage;

import android.content.Context;
import java.net.URI;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class idc {
    public static final long a;
    public final Context b;
    public final URI c;
    public final Executor d;
    public final Executor e;
    public final ScheduledExecutorService f;
    public final String g;
    public final hac h;
    public final icv i;
    public final Integer j;
    public final Integer k;
    public final long l;
    public final int m;
    public final ifv n;
    private final Executor o;
    private final long p;
    private final long q;
    private final iwp r;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        a = 20000L;
    }

    public idc(Context context, URI uri, Executor executor, Executor executor2, Executor executor3, ScheduledExecutorService scheduledExecutorService, String str, hac hacVar, icv icvVar, Integer num, Integer num2, long j, int i, long j2, long j3, iwp iwpVar, ifv ifvVar) {
        this.b = context;
        this.c = uri;
        this.o = executor;
        this.d = executor2;
        this.e = executor3;
        this.f = scheduledExecutorService;
        this.g = str;
        this.h = hacVar;
        this.i = icvVar;
        this.j = num;
        this.k = num2;
        this.l = j;
        this.m = i;
        this.p = j2;
        this.q = j3;
        this.r = iwpVar;
        this.n = ifvVar;
    }

    public final boolean equals(Object obj) {
        ScheduledExecutorService scheduledExecutorService;
        String str;
        icv icvVar;
        Integer num;
        Integer num2;
        iwp iwpVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof idc) {
            idc idcVar = (idc) obj;
            if (this.b.equals(idcVar.b) && this.c.equals(idcVar.c) && this.o.equals(idcVar.o) && this.d.equals(idcVar.d) && this.e.equals(idcVar.e) && ((scheduledExecutorService = this.f) != null ? scheduledExecutorService.equals(idcVar.f) : idcVar.f == null) && ((str = this.g) != null ? str.equals(idcVar.g) : idcVar.g == null) && this.h.equals(idcVar.h) && ((icvVar = this.i) != null ? icvVar.equals(idcVar.i) : idcVar.i == null) && ((num = this.j) != null ? num.equals(idcVar.j) : idcVar.j == null) && ((num2 = this.k) != null ? num2.equals(idcVar.k) : idcVar.k == null) && this.l == idcVar.l && this.m == idcVar.m && this.p == idcVar.p && this.q == idcVar.q && ((iwpVar = this.r) != null ? iwpVar.equals(idcVar.r) : idcVar.r == null) && this.n.equals(idcVar.n)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
        ScheduledExecutorService scheduledExecutorService = this.f;
        int hashCode2 = ((hashCode * 1000003) ^ (scheduledExecutorService == null ? 0 : scheduledExecutorService.hashCode())) * 1000003;
        String str = this.g;
        int hashCode3 = (((hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.h.hashCode()) * 1000003;
        icv icvVar = this.i;
        int hashCode4 = (hashCode3 ^ (icvVar == null ? 0 : icvVar.hashCode())) * 1000003;
        Integer num = this.j;
        int hashCode5 = (hashCode4 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        Integer num2 = this.k;
        int hashCode6 = num2 == null ? 0 : num2.hashCode();
        long j = this.l;
        int i = (((((hashCode5 ^ hashCode6) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.m) * 1000003;
        long j2 = this.p;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.q;
        int i3 = (i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        iwp iwpVar = this.r;
        return this.n.hashCode() ^ ((i3 ^ (iwpVar != null ? iwpVar.hashCode() : 0)) * 1000003);
    }

    public final String toString() {
        ifv ifvVar = this.n;
        iwp iwpVar = this.r;
        icv icvVar = this.i;
        hac hacVar = this.h;
        ScheduledExecutorService scheduledExecutorService = this.f;
        Executor executor = this.e;
        Executor executor2 = this.d;
        Executor executor3 = this.o;
        URI uri = this.c;
        return "TransportConfig{applicationContext=" + String.valueOf(this.b) + ", uri=" + String.valueOf(uri) + ", backgroundExecutor=" + String.valueOf(executor3) + ", blockingExecutor=" + String.valueOf(executor2) + ", lightweightExecutor=" + String.valueOf(executor) + ", lightweightScheduledExecutorService=" + String.valueOf(scheduledExecutorService) + ", userAgentOverride=" + this.g + ", recordNetworkMetricsToPrimes=" + String.valueOf(hacVar) + ", grpcServiceConfig=" + String.valueOf(icvVar) + ", trafficStatsUid=" + this.j + ", trafficStatsTag=" + this.k + ", grpcIdleTimeoutMillis=" + this.l + ", maxMessageSize=" + this.m + ", grpcKeepAliveTimeMillis=" + this.p + ", grpcKeepAliveTimeoutMillis=" + this.q + ", channelCredentials=" + String.valueOf(iwpVar) + ", streamzWrapper=" + String.valueOf(ifvVar) + "}";
    }

    public idc() {
        throw null;
    }
}
