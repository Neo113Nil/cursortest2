package defpackage;

import j$.time.Instant;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class idg implements ifg {
    public static final jzw b;
    public static final jzw c;
    private static final jzw j;
    private static final jzw k;
    public idf d;
    public idh e;
    public Set f;
    public iel g;
    public iyi h;
    private Executor l;
    private final her m;
    private hvi n;
    private boolean o = false;
    private boolean p = false;
    private static final hkh i = hkh.l("com/google/frameworks/client/data/android/auth/AuthContextInterceptor");
    public static final jwv a = new jwv("com.google.frameworks.client.data.android.auth.AuthContextInterceptor", false);

    static {
        jzr jzrVar = kaa.b;
        int i2 = jzw.d;
        b = new jzq("AuthContextInterceptor-RETRIABLE_OAUTH_ERROR", jzrVar);
        c = new jzq("AuthContextInterceptor-RETRIED_WITH_FORCED_REAUTH", kaa.b);
        j = new jzq("Authorization", kaa.b);
        k = new jzq("X-Auth-Time", kaa.b);
    }

    public idg(her herVar) {
        this.m = herVar;
    }

    private static final boolean k(kbn kbnVar) {
        return kbnVar.equals(kbn.UNAUTHENTICATED) || kbnVar.equals(kbn.PERMISSION_DENIED);
    }

    @Override // defpackage.ifg
    public final /* synthetic */ ifs a() {
        return ifs.a;
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
    public final ifs d(iwq iwqVar) {
        try {
            this.h = (iyi) hnu.aR(this.n);
            Object obj = iwqVar.a;
            jzw jzwVar = j;
            hoq.I(!((kaa) obj).i(jzwVar), "Already attached auth token");
            ((kaa) obj).h(jzwVar, a.ah((String) this.h.a, "Bearer "));
            ((kaa) obj).h(k, Long.toString(((Instant) this.h.c).toEpochMilli()));
            return ifs.a;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (!(cause instanceof idi)) {
                return ifs.b(kbq.c(cause), new kaa());
            }
            if (cause.getCause() instanceof IOException) {
                String message = cause.getCause().getMessage();
                if (this.g.e()) {
                    if (message != null) {
                        Throwable cause2 = cause.getCause();
                        if (ciz.NETWORK_ERROR.b(cause2.getMessage())) {
                            ((hkf) ((hkf) ((hkf) i.f()).h(cause2)).i("com/google/frameworks/client/data/android/auth/AuthContextInterceptor", "logGmsIoException", (char) 292, "AuthContextInterceptor.java")).s("IOException from AuthContextManager - NetworkError");
                        } else if (ciz.SERVICE_UNAVAILABLE.b(cause2.getMessage())) {
                            ((hkf) ((hkf) ((hkf) i.f()).h(cause2)).i("com/google/frameworks/client/data/android/auth/AuthContextInterceptor", "logGmsIoException", (char) 296, "AuthContextInterceptor.java")).s("IOException from AuthContextManager - ServiceUnavailable");
                        } else if (ciz.INTNERNAL_ERROR.b(cause2.getMessage())) {
                            ((hkf) ((hkf) ((hkf) i.f()).h(cause2)).i("com/google/frameworks/client/data/android/auth/AuthContextInterceptor", "logGmsIoException", (char) 300, "AuthContextInterceptor.java")).s("IOException from AuthContextManager - InternalError");
                        } else if (ciz.AUTH_SECURITY_ERROR.b(cause2.getMessage())) {
                            ((hkf) ((hkf) ((hkf) i.f()).h(cause2)).i("com/google/frameworks/client/data/android/auth/AuthContextInterceptor", "logGmsIoException", (char) 304, "AuthContextInterceptor.java")).s("IOException from AuthContextManager - AuthSecurityError");
                        } else {
                            ((hkf) ((hkf) ((hkf) i.f()).h(cause2)).i("com/google/frameworks/client/data/android/auth/AuthContextInterceptor", "logGmsIoException", (char) 307, "AuthContextInterceptor.java")).s("IOException from AuthContextManager - Unknown message");
                        }
                    } else {
                        ((hkf) ((hkf) ((hkf) i.f()).h(cause)).i("com/google/frameworks/client/data/android/auth/AuthContextInterceptor", "continueRequestHeaderProcessing", (char) 225, "AuthContextInterceptor.java")).s("IOException from AuthContextManager - no message");
                    }
                }
                if (this.g.d()) {
                    kbn kbnVar = kbn.UNAVAILABLE;
                    List list = kbq.a;
                    return ifs.b(kbnVar.a().d(cause.getCause()), new kaa());
                }
            }
            kbn kbnVar2 = kbn.UNAUTHENTICATED;
            List list2 = kbq.a;
            return ifs.b(kbnVar2.a().d(cause.getCause()), new kaa());
        }
    }

    @Override // defpackage.ifg
    public final ifs e(iwq iwqVar) {
        jww jwwVar = (jww) iwqVar.b;
        this.p = ((Boolean) jwwVar.e(a)).booleanValue();
        idf idfVar = (idf) jwwVar.e(idf.a);
        idfVar.getClass();
        this.d = idfVar;
        iel ielVar = (iel) jwwVar.e(iem.a);
        ielVar.getClass();
        this.g = ielVar;
        jwv jwvVar = ico.a;
        this.l = ((icn) jwwVar.e(jwvVar)).e;
        String str = this.d.c;
        her herVar = this.m;
        boolean containsKey = herVar.containsKey(str);
        idf idfVar2 = this.d;
        if (containsKey) {
            Object obj = ((ikm) herVar.get(idfVar2.c)).b;
            throw null;
        }
        String str2 = idfVar2.c;
        boolean z = false;
        if (!str2.equals("incognito") && !str2.equals("pseudonymous")) {
            z = true;
        }
        hoq.I(z, "Used non-google account without enabling API Key fallback");
        idh idhVar = ((icn) jwwVar.e(jwvVar)).g;
        this.e = idhVar;
        idf idfVar3 = this.d;
        this.o = true;
        this.f = ((icy) jwwVar.e(icy.a)).c();
        gty aC = hoq.aC(276, "AuthContextInterceptor#tokenFuture");
        try {
            hvj hvjVar = new hvj(gvx.i(new fuh(this, iwqVar, idhVar, idfVar3, 2)));
            aC.b(hvjVar);
            this.l.execute(hvjVar);
            this.n = hvjVar;
            ifs c2 = ifs.c(hvjVar);
            aC.close();
            return c2;
        } finally {
        }
    }

    @Override // defpackage.ifg
    public final ift f(ikm ikmVar) {
        if (k(((kbq) ikmVar.b).o) && this.o) {
            ((kaa) ikmVar.a).h(b, "");
        }
        if (this.p) {
            ((kaa) ikmVar.a).h(c, "");
        }
        return ift.a;
    }

    @Override // defpackage.ifg
    public final ift g(ikm ikmVar) {
        if (!this.g.g() || !k(((kbq) ikmVar.b).o) || !this.o) {
            return f(ikmVar);
        }
        gty aC = hoq.aC(277, "AuthContextInterceptor#retryTokenFuture");
        try {
            hvj hvjVar = new hvj(gvx.i(new gqe(this, 4)));
            aC.b(hvjVar);
            aC.close();
            this.l.execute(hvjVar);
            return new ift(3, hvjVar);
        } catch (Throwable th) {
            try {
                aC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ifg
    public final /* synthetic */ ift h(bry bryVar) {
        return ift.a;
    }

    @Override // defpackage.ifg
    public final /* synthetic */ ift i(bry bryVar) {
        return ift.a;
    }

    @Override // defpackage.ifg
    public final /* synthetic */ ifs j(bry bryVar) {
        return ifs.a;
    }
}
