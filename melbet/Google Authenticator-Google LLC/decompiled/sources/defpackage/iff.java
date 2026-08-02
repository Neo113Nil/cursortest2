package defpackage;

import android.content.Context;
import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap$EL;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iff extends jwx {
    public final ifv a;
    private final String b;
    private final icn c;
    private final Object d = new Object();
    private final ConcurrentHashMap e = new ConcurrentHashMap();

    public iff(String str, icn icnVar, ifv ifvVar) {
        this.b = str;
        this.c = icnVar;
        this.a = ifvVar;
    }

    private static final URI c(String str) {
        try {
            URI uri = new URI(null, str, null, null, null);
            return uri.getPort() != -1 ? uri : new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), 443, uri.getPath(), uri.getQuery(), uri.getFragment());
        } catch (URISyntaxException e) {
            throw new IllegalStateException("Malformed endpoint authority", e);
        }
    }

    @Override // defpackage.jwx
    public final String a() {
        return this.b;
    }

    @Override // defpackage.jwx
    public final iws b(kae kaeVar, jww jwwVar) {
        ifc ifcVar;
        jwwVar.getClass();
        String str = (String) jwwVar.e(ida.a);
        if (str == null) {
            str = this.b;
        }
        URI c = c(str);
        if (TextUtils.isEmpty(c.getAuthority())) {
            throw new IllegalStateException("Could not parse channel authority");
        }
        final icn icnVar = this.c;
        final ife ifeVar = new ife(c, ((Long) ((haf) icnVar.l).a).longValue(), icnVar.p, icnVar.q, (Integer) jwwVar.e(ifw.a), (Integer) jwwVar.e(ifw.b), (Integer) jwwVar.e(icw.a));
        ConcurrentHashMap concurrentHashMap = this.e;
        ifc ifcVar2 = (ifc) concurrentHashMap.get(ifeVar);
        if (ifcVar2 == null) {
            synchronized (this.d) {
                Object computeIfAbsent = ConcurrentMap$EL.computeIfAbsent(concurrentHashMap, ifeVar, new ckw(new krt() { // from class: ifd
                    @Override // defpackage.krt
                    public final Object a(Object obj) {
                        Context context;
                        URI uri;
                        Executor executor;
                        Executor executor2;
                        Executor executor3;
                        hac hacVar;
                        ifv ifvVar;
                        ((ife) obj).getClass();
                        long j = idc.a;
                        fsd fsdVar = new fsd(4);
                        idb idbVar = new idb();
                        idbVar.d(fsdVar);
                        idbVar.c(4194304);
                        idbVar.a(Long.MAX_VALUE);
                        idbVar.b(idc.a);
                        idbVar.e(ifv.a);
                        icn icnVar2 = icn.this;
                        Context context2 = icnVar2.a;
                        if (context2 == null) {
                            throw new NullPointerException("Null applicationContext");
                        }
                        ife ifeVar2 = ifeVar;
                        idbVar.a = context2;
                        idbVar.b = ifeVar2.a;
                        idbVar.j = ifeVar2.c;
                        idbVar.k = ifeVar2.d;
                        idbVar.l = ifeVar2.b;
                        idbVar.q = (byte) (idbVar.q | 1);
                        Executor executor4 = icnVar2.d;
                        if (executor4 == null) {
                            throw new NullPointerException("Null backgroundExecutor");
                        }
                        idbVar.c = executor4;
                        Executor executor5 = icnVar2.e;
                        if (executor5 == null) {
                            throw new NullPointerException("Null blockingExecutor");
                        }
                        idbVar.d = executor5;
                        Executor executor6 = icnVar2.c;
                        if (executor6 == null) {
                            throw new NullPointerException("Null lightweightExecutor");
                        }
                        iff iffVar = this;
                        idbVar.e = executor6;
                        idbVar.f = icnVar2.f;
                        idbVar.g = icnVar2.i;
                        idbVar.d(icnVar2.j);
                        idbVar.i = icnVar2.m;
                        idbVar.a(icnVar2.p);
                        idbVar.b(icnVar2.q);
                        idbVar.r = icnVar2.r;
                        idbVar.e(iffVar.a);
                        Integer num = ifeVar2.e;
                        if (num != null) {
                            idbVar.c(num.intValue());
                        } else {
                            idbVar.c(icnVar2.o);
                        }
                        idd iddVar = icnVar2.b;
                        if (idbVar.q == 15 && (context = idbVar.a) != null && (uri = idbVar.b) != null && (executor = idbVar.c) != null && (executor2 = idbVar.d) != null && (executor3 = idbVar.e) != null && (hacVar = idbVar.h) != null && (ifvVar = idbVar.p) != null) {
                            return new ifc(iddVar, new idc(context, uri, executor, executor2, executor3, idbVar.f, idbVar.g, hacVar, idbVar.i, idbVar.j, idbVar.k, idbVar.l, idbVar.m, idbVar.n, idbVar.o, idbVar.r, ifvVar));
                        }
                        StringBuilder sb = new StringBuilder();
                        if (idbVar.a == null) {
                            sb.append(" applicationContext");
                        }
                        if (idbVar.b == null) {
                            sb.append(" uri");
                        }
                        if (idbVar.c == null) {
                            sb.append(" backgroundExecutor");
                        }
                        if (idbVar.d == null) {
                            sb.append(" blockingExecutor");
                        }
                        if (idbVar.e == null) {
                            sb.append(" lightweightExecutor");
                        }
                        if (idbVar.h == null) {
                            sb.append(" recordNetworkMetricsToPrimes");
                        }
                        if ((idbVar.q & 1) == 0) {
                            sb.append(" grpcIdleTimeoutMillis");
                        }
                        if ((idbVar.q & 2) == 0) {
                            sb.append(" maxMessageSize");
                        }
                        if ((idbVar.q & 4) == 0) {
                            sb.append(" grpcKeepAliveTimeMillis");
                        }
                        if ((idbVar.q & 8) == 0) {
                            sb.append(" grpcKeepAliveTimeoutMillis");
                        }
                        if (idbVar.p == null) {
                            sb.append(" streamzWrapper");
                        }
                        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                    }
                }, 4));
                computeIfAbsent.getClass();
                ifcVar = (ifc) computeIfAbsent;
            }
            ifcVar2 = ifcVar;
        }
        return ifcVar2.b(kaeVar, jwwVar);
    }
}
