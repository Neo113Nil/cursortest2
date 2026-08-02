package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class idt implements ifg {
    public final idu e;
    public kaa f;
    public kaa g;
    public ici h;
    public long i = -1;
    public List j;
    private final Executor l;
    private hvj m;
    public static final hln a = hln.l("xRPC");
    private static final jzw k = ikg.q(ice.e);
    static final jzw b = ikg.q(icf.b);
    static final byte[] c = icf.a.f();
    public static final jwv d = new jwv("ClientInterceptorCacheDirective", ici.DEFAULT_CACHE_OK_IF_VALID);

    /* JADX WARN: Type inference failed for: r0v3, types: [idu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public idt(ids idsVar) {
        int i = hel.d;
        this.j = his.a;
        this.e = idsVar.b;
        this.l = idsVar.c;
    }

    @Override // defpackage.ifg
    public final ifs a() {
        try {
            gzp gzpVar = (gzp) hnu.aR(this.m);
            if (gzpVar == null) {
                ((hlk) ((hlk) a.f()).i("com/google/frameworks/client/data/android/cache/CachingClientInterceptor", "continueRequestMessageProcessing", 205, "CachingClientInterceptor.java")).s("RpcCache returned null instead of Optional#absent()");
                return ifs.a;
            }
            if (gzpVar.f()) {
                throw null;
            }
            if (!this.h.equals(ici.CACHE_ONLY) && !this.h.equals(ici.VALID_CACHE_ONLY)) {
                return ifs.a;
            }
            kbn kbnVar = kbn.FAILED_PRECONDITION;
            List list = kbq.a;
            kbq e = kbnVar.a().e("Required value come from cache, but no cached value was found");
            kaa kaaVar = new kaa();
            kaaVar.h(b, c);
            return ifs.b(e, kaaVar);
        } catch (ExecutionException e2) {
            ((hlk) ((hlk) ((hlk) a.f()).h(e2.getCause())).i("com/google/frameworks/client/data/android/cache/CachingClientInterceptor", "continueRequestMessageProcessing", 227, "CachingClientInterceptor.java")).s("Failed to read from cache");
            return e2.getCause() instanceof ClassCastException ? ifs.b(kbq.k, new kaa()) : ifs.a;
        }
    }

    @Override // defpackage.ifg
    public final /* synthetic */ ift b() {
        return ift.a;
    }

    @Override // defpackage.ifg
    public final /* synthetic */ ift c() {
        return ift.a;
    }

    @Override // defpackage.ifg
    public final /* synthetic */ ifs d(iwq iwqVar) {
        return ifs.a;
    }

    @Override // defpackage.ifg
    public final ifs e(iwq iwqVar) {
        Object obj = iwqVar.c;
        hoq.I(((kae) obj).a.equals(kad.a), "Caching interceptor only supports unary RPCs");
        ici iciVar = (ici) ((jww) iwqVar.b).e(d);
        iciVar.getClass();
        this.h = iciVar;
        kaa kaaVar = new kaa();
        this.f = kaaVar;
        kaaVar.g((kaa) iwqVar.a);
        return ifs.b;
    }

    @Override // defpackage.ifg
    public final /* synthetic */ ift f(ikm ikmVar) {
        return ift.a;
    }

    @Override // defpackage.ifg
    public final ift g(ikm ikmVar) {
        try {
            Boolean bool = false;
            bool.getClass();
        } catch (Throwable th) {
            ((hlk) ((hlk) ((hlk) a.f()).h(th)).i("com/google/frameworks/client/data/android/cache/CachingClientInterceptor", "startOnCompleteProcessing", 375, "CachingClientInterceptor.java")).s("Failed to record RPC metrics");
        }
        return ift.a;
    }

    @Override // defpackage.ifg
    public final ift h(bry bryVar) {
        if (this.i == -1) {
            return ift.a;
        }
        this.l.execute(new iep(this, bryVar, 1));
        return ift.a;
    }

    @Override // defpackage.ifg
    public final ift i(bry bryVar) {
        jzv jzvVar;
        this.g = new kaa();
        this.g.g((kaa) bryVar.a);
        kaa kaaVar = this.g;
        jzw jzwVar = k;
        if (kaaVar.i(jzwVar)) {
            kaa kaaVar2 = this.g;
            int i = 0;
            while (true) {
                if (i >= kaaVar2.e) {
                    jzvVar = null;
                    break;
                }
                if (Arrays.equals(jzwVar.b, kaaVar2.k(i))) {
                    jzvVar = new jzv(kaaVar2, jzwVar, i);
                    break;
                }
                i++;
            }
            if (jzvVar != null) {
                hel n = hel.n(jzvVar);
                if (n.size() == 1) {
                    try {
                        ice iceVar = (ice) ((jkj) ice.a.k().e((byte[]) n.get(0), jkd.a())).q();
                        if ((iceVar.b & 1) != 0) {
                            long j = iceVar.c;
                            if (j > 0) {
                                this.i = TimeUnit.SECONDS.toMillis(j);
                                jkx jkxVar = iceVar.d;
                                heg hegVar = new heg(4);
                                Iterator it = jkxVar.iterator();
                                while (it.hasNext()) {
                                    hegVar.h(((String) it.next()).toLowerCase(Locale.ROOT));
                                }
                                this.j = hegVar.g();
                                return ift.a;
                            }
                        }
                    } catch (jld e) {
                        ((hlk) ((hlk) ((hlk) a.f()).h(e)).i("com/google/frameworks/client/data/android/cache/CachingClientInterceptor", "startResponseHeaderProcessing", 316, "CachingClientInterceptor.java")).s("Could not parse server ttl");
                    }
                } else {
                    ((hlk) ((hlk) a.f()).i("com/google/frameworks/client/data/android/cache/CachingClientInterceptor", "startResponseHeaderProcessing", 319, "CachingClientInterceptor.java")).t("Expected a single value for extension, got: %d", n.size());
                }
            }
        }
        return ift.a;
    }

    @Override // defpackage.ifg
    public final ifs j(bry bryVar) {
        hvj hvjVar = new hvj(new gnq(this, bryVar, 6));
        this.m = hvjVar;
        this.l.execute(hvjVar);
        return ifs.c(this.m);
    }
}
