package defpackage;

import java.nio.charset.Charset;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kff extends iws {
    public static final double a;
    private static final Logger k = Logger.getLogger(kff.class.getName());
    public final kae b;
    public final Executor c;
    public final kev d;
    public final jxr e;
    public kez f;
    public jww g;
    public kfg h;
    public final ScheduledExecutorService i;
    public jxv j = jxv.b;
    private final boolean l;
    private final boolean m;
    private boolean n;
    private boolean o;
    private final kic p;

    static {
        "gzip".getBytes(Charset.forName("US-ASCII"));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        a = 1.0E9d;
    }

    public kff(kae kaeVar, Executor executor, jww jwwVar, kic kicVar, ScheduledExecutorService scheduledExecutorService, kev kevVar) {
        jxf jxfVar = jxf.a;
        this.b = kaeVar;
        String str = kaeVar.b;
        System.identityHashCode(this);
        int i = kob.a;
        if (executor == huf.a) {
            this.c = new kld();
            this.l = true;
        } else {
            this.c = new klh(executor);
            this.l = false;
        }
        this.d = kevVar;
        this.e = jxr.k();
        kad kadVar = kaeVar.a;
        this.m = kadVar == kad.a || kadVar == kad.c;
        this.g = jwwVar;
        this.p = kicVar;
        this.i = scheduledExecutorService;
    }

    public static final void g(iwr iwrVar, kbq kbqVar, kaa kaaVar) {
        try {
            iwrVar.a(kbqVar, kaaVar);
        } catch (RuntimeException e) {
            k.logp(Level.WARNING, "io.grpc.internal.ClientCallImpl", "closeObserver", "Exception thrown by onClose() in ClientCall", (Throwable) e);
        }
    }

    private final void h(Object obj) {
        hoq.I(this.h != null, "Not started");
        hoq.I(!this.n, "call was cancelled");
        hoq.I(!this.o, "call was half-closed");
        try {
            kfg kfgVar = this.h;
            if (kfgVar instanceof kky) {
                kky kkyVar = (kky) kfgVar;
                kku kkuVar = kkyVar.r;
                if (kkuVar.a) {
                    kkuVar.f.a.j(kkyVar.f.a(obj));
                } else {
                    kkyVar.i(new kko(kkyVar, obj));
                }
            } else {
                kfgVar.j(this.b.a(obj));
            }
            if (this.m) {
                return;
            }
            this.h.e();
        } catch (Error e) {
            this.h.n(kbq.c.e("Client sendMessage() failed with Error"));
            throw e;
        } catch (RuntimeException e2) {
            this.h.n(kbq.c.d(e2).e("Failed to stream message"));
        }
    }

    @Override // defpackage.iws
    public final void a(iwr iwrVar, kaa kaaVar) {
        kfg kkyVar;
        ScheduledExecutorService scheduledExecutorService;
        jww jwwVar;
        int i = kob.a;
        hoq.I(this.h == null, "Already started");
        hoq.I(!this.n, "call was cancelled");
        iwrVar.getClass();
        kaaVar.getClass();
        jxr jxrVar = this.e;
        if (jxrVar.i()) {
            this.h = kjl.a;
            this.c.execute(new key(this, iwrVar));
            return;
        }
        kix kixVar = (kix) this.g.e(kix.a);
        if (kixVar != null) {
            Long l = kixVar.b;
            if (l != null) {
                jxs c = jxs.c(l.longValue(), TimeUnit.NANOSECONDS);
                jxs jxsVar = this.g.b;
                if (jxsVar == null || c.compareTo(jxsVar) < 0) {
                    this.g = this.g.a(c);
                }
            }
            Boolean bool = kixVar.c;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                jww jwwVar2 = this.g;
                if (booleanValue) {
                    kby g = jww.g(jwwVar2);
                    g.f = Boolean.TRUE;
                    jwwVar = new jww(g);
                } else {
                    kby g2 = jww.g(jwwVar2);
                    g2.f = Boolean.FALSE;
                    jwwVar = new jww(g2);
                }
                this.g = jwwVar;
            }
            Integer num = kixVar.d;
            if (num != null) {
                jww jwwVar3 = this.g;
                Integer num2 = jwwVar3.e;
                if (num2 != null) {
                    this.g = jwwVar3.b(Math.min(num2.intValue(), num.intValue()));
                } else {
                    this.g = jwwVar3.b(num.intValue());
                }
            }
            Integer num3 = kixVar.e;
            if (num3 != null) {
                jww jwwVar4 = this.g;
                Integer num4 = jwwVar4.f;
                if (num4 != null) {
                    this.g = jwwVar4.c(Math.min(num4.intValue(), num3.intValue()));
                } else {
                    this.g = jwwVar4.c(num3.intValue());
                }
            }
        }
        jxd jxdVar = jxc.a;
        jxv jxvVar = this.j;
        kaaVar.f(khd.g);
        kaaVar.f(khd.c);
        jzw jzwVar = khd.d;
        kaaVar.f(jzwVar);
        byte[] bArr = jxvVar.c;
        if (bArr.length != 0) {
            kaaVar.h(jzwVar, bArr);
        }
        kaaVar.f(khd.e);
        kaaVar.f(khd.f);
        jxs f = f();
        boolean z = f != null && f.equals(jxrVar.b());
        kez kezVar = new kez(this, f, z);
        this.f = kezVar;
        if (f == null || kezVar.c > 0) {
            kic kicVar = this.p;
            kae kaeVar = this.b;
            jww jwwVar5 = this.g;
            kiq kiqVar = kicVar.b;
            if (kiqVar.P) {
                kix kixVar2 = (kix) jwwVar5.e(kix.a);
                kkyVar = new kky(kicVar, kaeVar, kaaVar, jwwVar5, kixVar2 == null ? null : kixVar2.f, kixVar2 != null ? kixVar2.g : null, jxrVar);
            } else {
                jxb[] h = khd.h(jwwVar5);
                jxr a2 = jxrVar.a();
                try {
                    kkyVar = kiqVar.y.a(kaeVar, kaaVar, jwwVar5, h);
                } finally {
                    jxrVar.f(a2);
                }
            }
            this.h = kkyVar;
        } else {
            jxb[] h2 = khd.h(this.g);
            String str = true != z ? "CallOptions" : "Context";
            Long l2 = (Long) this.g.e(jxb.f);
            double d = this.f.c;
            double d2 = a;
            this.h = new kgp(kbq.e.e(String.format("ClientCall started after %s deadline was exceeded %.9f seconds ago. Name resolution delay %.9f seconds.", str, Double.valueOf(d / d2), Double.valueOf(l2 == null ? 0.0d : l2.longValue() / d2))), h2);
        }
        if (this.l) {
            this.h.f();
        }
        Integer num5 = this.g.e;
        if (num5 != null) {
            this.h.r(num5.intValue());
        }
        Integer num6 = this.g.f;
        if (num6 != null) {
            this.h.s(num6.intValue());
        }
        if (f != null) {
            this.h.p(f);
        }
        this.h.h(jxdVar);
        this.h.q(this.j);
        this.d.b();
        this.h.t(new kfe(this, iwrVar));
        kez kezVar2 = this.f;
        if (kezVar2.e) {
            return;
        }
        if (kezVar2.b && !kezVar2.a && (scheduledExecutorService = kezVar2.f.i) != null) {
            kezVar2.d = scheduledExecutorService.schedule(new khw(kezVar2), kezVar2.c, TimeUnit.NANOSECONDS);
        }
        kezVar2.f.e.d(kezVar2, huf.a);
        if (kezVar2.e) {
            kezVar2.c();
        }
    }

    @Override // defpackage.iws
    public final void c() {
        int i = kob.a;
        hoq.I(this.h != null, "Not started");
        hoq.I(!this.n, "call was cancelled");
        hoq.I(!this.o, "call already half-closed");
        this.o = true;
        this.h.o();
    }

    @Override // defpackage.iws
    public final void d(int i) {
        int i2 = kob.a;
        hoq.I(this.h != null, "Not started");
        this.h.g(i);
    }

    @Override // defpackage.iws
    public final void e(Object obj) {
        int i = kob.a;
        h(obj);
    }

    public final jxs f() {
        jxs jxsVar = this.g.b;
        jxs b = this.e.b();
        if (jxsVar != null) {
            if (b != null) {
                jxsVar.d(b);
                if (true != jxsVar.e(b)) {
                }
            }
            return jxsVar;
        }
        return b;
    }

    @Override // defpackage.iws
    public final void r(String str, Throwable th) {
        int i = kob.a;
        if (str == null && th == null) {
            CancellationException cancellationException = new CancellationException("Cancelled without a message or cause");
            k.logp(Level.WARNING, "io.grpc.internal.ClientCallImpl", "cancelInternal", "Cancelling without a message or cause is suboptimal", (Throwable) cancellationException);
            th = cancellationException;
        }
        if (this.n) {
            return;
        }
        this.n = true;
        try {
            if (this.h != null) {
                kbq kbqVar = kbq.c;
                kbq e = str != null ? kbqVar.e(str) : kbqVar.e("Call cancelled without message");
                if (th != null) {
                    e = e.d(th);
                }
                this.h.n(e);
            }
            kez kezVar = this.f;
            if (kezVar != null) {
                kezVar.c();
            }
        } finally {
        }
    }

    public final String toString() {
        gzo T = hoq.T(this);
        T.b("method", this.b);
        return T.toString();
    }
}
