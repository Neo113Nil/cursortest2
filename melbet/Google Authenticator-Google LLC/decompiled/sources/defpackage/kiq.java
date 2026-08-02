package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kiq extends jzo implements jyo {
    public static final iws U;
    static final Logger a = Logger.getLogger(kiq.class.getName());
    static final kbq b;
    static final kbq c;
    public static final kiz d;
    public static final jym e;
    public static final jzd f;
    public final AtomicBoolean A;
    public boolean B;
    public volatile boolean C;
    public final keu D;
    public final kev E;
    public final kex F;
    public final jwy G;
    public final jyl H;
    public final kin I;
    public kiz J;
    public final kiz K;
    public boolean L;
    public final boolean M;
    public final long N;
    public final long O;
    public final boolean P;
    final khh Q;
    public final kic R;
    public final kag S;
    public int T;
    public final bst V;
    private final kmw W;
    private final kar X;
    private final kal Y;
    private final jzm Z;
    private final kjm aa;
    private final kig ab;
    private final kig ac;
    private final long ad;
    private final jwx ae;
    private final CountDownLatch af;
    private final kja ag;
    private final kki ah;
    private final kmf ai;
    public final jyp g;
    public final String h;
    public final kfl i;
    public final kio j;
    public final Executor k;
    public final kmr l;
    final kbw m;
    public final jxv n;
    public final kfs o;
    public final List p;
    public final String q;
    public kaq r;
    public boolean s;
    public kii t;
    public boolean u;
    public final Set v;
    public Collection w;
    public final Object x;
    public final kge y;
    public final kip z;

    static {
        kbq.l.e("Channel shutdownNow invoked");
        b = kbq.l.e("Channel shutdown invoked");
        c = kbq.l.e("Subchannel shutdown invoked");
        d = new kiz(null, new HashMap(), new HashMap(), null, null, null);
        e = new khy();
        f = new kjn();
        U = new kib();
    }

    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public kiq(kiu kiuVar, kfl kflVar, kmw kmwVar, kar karVar, kjm kjmVar, hac hacVar, List list, kmr kmrVar) {
        kbw kbwVar = new kbw(new kia(this));
        this.m = kbwVar;
        this.o = new kfs();
        this.v = new HashSet(16, 0.75f);
        this.x = new Object();
        this.z = new kip(this);
        this.A = new AtomicBoolean(false);
        this.af = new CountDownLatch(1);
        this.T = 1;
        this.J = d;
        this.L = false;
        this.V = new bst((char[]) null, (byte[]) null);
        iwy iwyVar = jxs.b;
        kif kifVar = new kif(this);
        this.ag = kifVar;
        this.Q = new kih(this);
        kic kicVar = new kic(this);
        this.R = kicVar;
        kmf kmfVar = kiuVar.G;
        kmfVar.getClass();
        this.ai = kmfVar;
        String str = kiuVar.l;
        str.getClass();
        this.h = str;
        jyp b2 = jyp.b("Channel", str);
        this.g = b2;
        kmrVar.getClass();
        this.l = kmrVar;
        kjm kjmVar2 = kiuVar.g;
        kjmVar2.getClass();
        this.aa = kjmVar2;
        ?? a2 = kjmVar2.a();
        a2.getClass();
        this.k = a2;
        kjm kjmVar3 = kiuVar.h;
        kjmVar3.getClass();
        kig kigVar = new kig(kjmVar3);
        this.ac = kigVar;
        ket ketVar = new ket(kflVar, kigVar);
        this.i = ketVar;
        kio kioVar = new kio(ketVar.a());
        this.j = kioVar;
        kex kexVar = new kex(b2, kmrVar.a(), "Channel for '" + str + "'");
        this.F = kexVar;
        kew kewVar = new kew(kexVar, kmrVar);
        this.G = kewVar;
        kbd kbdVar = khd.l;
        boolean z = kiuVar.v;
        this.P = z;
        keq keqVar = new keq(jzn.b(), kiuVar.n);
        this.Z = keqVar;
        this.W = kmwVar;
        this.X = karVar;
        kap kapVar = new kap(z, kiuVar.r, kiuVar.s, keqVar);
        kjk kjkVar = new kjk(kiuVar.E, kaf.a());
        this.S = kjkVar;
        kaj kajVar = new kaj();
        kajVar.a = 443;
        kbdVar.getClass();
        kajVar.b = kbdVar;
        kajVar.c = kbwVar;
        kajVar.e = kioVar;
        kajVar.d = kapVar;
        kajVar.f = kewVar;
        kajVar.g = kigVar;
        kajVar.h = kjkVar;
        kajVar.i = kiuVar.j;
        kmfVar.getClass();
        kal kalVar = new kal(kajVar);
        this.Y = kalVar;
        this.r = k(kmwVar, karVar, kalVar);
        this.ab = new kig(kjmVar);
        kge kgeVar = new kge(a2, kbwVar);
        this.y = kgeVar;
        kgeVar.f = kifVar;
        kgeVar.c = new iaq(kifVar, 18, null);
        kgeVar.d = new iaq(kifVar, 19, null);
        kgeVar.e = new iaq(kifVar, 20, null);
        Map map = kiuVar.x;
        if (map != null) {
            kam a3 = kapVar.a(map);
            kbq kbqVar = a3.a;
            hoq.K(kbqVar == null, "Default config is invalid: %s", kbqVar);
            kiz kizVar = (kiz) a3.b;
            this.K = kizVar;
            kicVar.a = kizVar.a;
        } else {
            this.K = null;
        }
        boolean z2 = kiuVar.y;
        this.M = z2;
        kin kinVar = new kin(this, this.r.a());
        this.I = kinVar;
        this.ae = iwu.a(kinVar, list);
        this.p = new ArrayList(kiuVar.k);
        hacVar.getClass();
        long j = kiuVar.q;
        if (j == -1) {
            this.ad = -1L;
        } else {
            hoq.B(j >= kiu.c, "invalid idleTimeoutMillis %s", j);
            this.ad = kiuVar.q;
        }
        this.ah = new kki(new kgf(this, 12), kbwVar, ketVar.a(), new hab());
        jxv jxvVar = kiuVar.o;
        jxvVar.getClass();
        this.n = jxvVar;
        kiuVar.p.getClass();
        this.q = kiuVar.m;
        this.O = kiuVar.t;
        this.N = kiuVar.u;
        khz khzVar = new khz(kmrVar);
        this.D = khzVar;
        this.E = khzVar.a();
        jyl jylVar = kiuVar.w;
        jylVar.getClass();
        this.H = jylVar;
        jyl.b(jylVar.c, this);
        if (z2) {
            return;
        }
        if (this.K != null) {
            kewVar.a(2, "Service config look-up disabled, using default service config");
        }
        this.L = true;
    }

    static kaq k(kmw kmwVar, kar karVar, kal kalVar) {
        kaq a2 = kmwVar.a(karVar, kalVar);
        if (a2 == null) {
            throw new IllegalArgumentException("cannot create a NameResolver for ".concat(String.valueOf(String.valueOf(kmwVar))));
        }
        ScheduledExecutorService scheduledExecutorService = kalVar.d;
        if (scheduledExecutorService != null) {
            return new klc(a2, new ker(scheduledExecutorService, kalVar.b));
        }
        throw new IllegalStateException("ScheduledExecutorService not set in Builder");
    }

    @Override // defpackage.jwx
    public final String a() {
        return this.ae.a();
    }

    @Override // defpackage.jwx
    public final iws b(kae kaeVar, jww jwwVar) {
        return this.ae.b(kaeVar, jwwVar);
    }

    @Override // defpackage.jyv
    public final jyp c() {
        return this.g;
    }

    public final Executor d(jww jwwVar) {
        Executor executor = jwwVar.c;
        return executor == null ? this.k : executor;
    }

    public final void e(boolean z) {
        ScheduledFuture scheduledFuture;
        kki kkiVar = this.ah;
        kkiVar.e = false;
        if (!z || (scheduledFuture = kkiVar.f) == null) {
            return;
        }
        scheduledFuture.cancel(false);
        kkiVar.f = null;
    }

    final void f() {
        this.m.c();
        if (this.A.get() || this.u) {
            return;
        }
        if (this.Q.a.isEmpty()) {
            h();
        } else {
            e(false);
        }
        if (this.t == null) {
            this.G.a(2, "Exiting idle mode");
            kii kiiVar = new kii(this);
            kiiVar.a = new kep((keq) this.Z, kiiVar);
            this.t = kiiVar;
            this.o.a(jxi.a);
            this.r.d(new kij(this, kiiVar, this.r));
            this.s = true;
        }
    }

    public final void g() {
        if (!this.C && this.A.get() && this.v.isEmpty()) {
            this.G.a(2, "Terminated");
            jyl.c(this.H.c, this);
            this.aa.b(this.k);
            this.ab.b();
            this.ac.b();
            this.i.close();
            this.C = true;
            this.af.countDown();
        }
    }

    public final void h() {
        long j = this.ad;
        if (j == -1) {
            return;
        }
        kki kkiVar = this.ah;
        long nanos = TimeUnit.MILLISECONDS.toNanos(j);
        long a2 = kkiVar.a() + nanos;
        kkiVar.e = true;
        if (a2 - kkiVar.d < 0 || kkiVar.f == null) {
            ScheduledFuture scheduledFuture = kkiVar.f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            kkiVar.f = kkiVar.a.schedule(new kkh(kkiVar, 0), nanos, TimeUnit.NANOSECONDS);
        }
        kkiVar.d = a2;
    }

    public final void i(boolean z) {
        this.m.c();
        if (z) {
            hoq.I(this.s, "nameResolver is not started");
            hoq.I(this.t != null, "lbHelper is null");
        }
        kaq kaqVar = this.r;
        if (kaqVar != null) {
            kaqVar.c();
            this.s = false;
            if (z) {
                this.r = k(this.W, this.X, this.Y);
            } else {
                this.r = null;
            }
        }
        kii kiiVar = this.t;
        if (kiiVar != null) {
            kiiVar.a.d();
            this.t = null;
        }
    }

    public final void j(jzi jziVar) {
        this.y.d(jziVar);
    }

    public final String toString() {
        gzo T = hoq.T(this);
        T.f("logId", this.g.a);
        T.b("target", this.h);
        return T.toString();
    }
}
