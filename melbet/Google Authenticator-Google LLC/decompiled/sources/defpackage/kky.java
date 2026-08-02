package defpackage;

import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kky implements kfg {
    static final jzw a;
    static final jzw b;
    public static final kbq c;
    public static final Random d;
    public static final boolean e;
    public boolean A;
    final /* synthetic */ kae B;
    final /* synthetic */ jww C;
    final /* synthetic */ jxr D;
    final /* synthetic */ kic E;
    public iyi F;
    public final bst G;
    private final kaa H;
    private kbq I;
    public final kae f;
    public final Executor g;
    public final Executor h;
    public final ScheduledExecutorService i;
    public final kkz j;
    public final khe k;
    public final boolean l;
    public final Object m;
    public final long n;
    public final long o;
    public final kkx p;
    public final khi q;
    public volatile kku r;
    public final AtomicBoolean s;
    public final AtomicInteger t;
    public final AtomicInteger u;
    public long v;
    public kfi w;
    public kks x;
    public kks y;
    public long z;

    static {
        jzr jzrVar = kaa.b;
        int i = jzw.d;
        a = new jzq("grpc-previous-rpc-attempts", jzrVar);
        b = new jzq("grpc-retry-pushback-ms", kaa.b);
        c = kbq.c.e("Stream thrown away because RetriableStream committed");
        d = new Random();
        Charset charset = khd.a;
        e = jxy.a("GRPC_EXPERIMENTAL_XDS_RLS_LB", true);
    }

    public kky(kic kicVar, kae kaeVar, kaa kaaVar, jww jwwVar, kkz kkzVar, khe kheVar, jxr jxrVar) {
        this.B = kaeVar;
        this.C = jwwVar;
        this.D = jxrVar;
        this.E = kicVar;
        kiq kiqVar = kicVar.b;
        bst bstVar = kiqVar.V;
        long j = kiqVar.N;
        long j2 = kiqVar.O;
        Executor d2 = kiqVar.d(jwwVar);
        ScheduledExecutorService a2 = kiqVar.i.a();
        kkx kkxVar = kicVar.a;
        this.h = new kbw(new kkj());
        this.m = new Object();
        this.q = new khi();
        this.r = new kku(new ArrayList(8), Collections.EMPTY_LIST, null, null, false, false, false, 0);
        this.s = new AtomicBoolean();
        this.t = new AtomicInteger();
        this.u = new AtomicInteger();
        this.f = kaeVar;
        this.G = bstVar;
        this.n = j;
        this.o = j2;
        this.g = d2;
        this.i = a2;
        this.H = kaaVar;
        this.j = kkzVar;
        if (kkzVar != null) {
            this.z = kkzVar.b;
        }
        this.k = kheVar;
        hoq.y(kkzVar == null || kheVar == null, "Should not provide both retryPolicy and hedgingPolicy");
        this.l = kheVar != null;
        this.p = kkxVar;
    }

    @Override // defpackage.kfg
    public final jwt a() {
        throw null;
    }

    public final kkw b(int i, boolean z, boolean z2) {
        AtomicInteger atomicInteger;
        int i2;
        do {
            atomicInteger = this.u;
            i2 = atomicInteger.get();
            if (i2 < 0) {
                return null;
            }
        } while (!atomicInteger.compareAndSet(i2, i2 + 1));
        kkw kkwVar = new kkw(i);
        kkp kkpVar = new kkp(new kkr(this, kkwVar));
        kaa kaaVar = this.H;
        kaa kaaVar2 = new kaa();
        kaaVar2.g(kaaVar);
        if (i > 0) {
            kaaVar2.h(a, String.valueOf(i));
        }
        jww h = this.C.h(kkpVar);
        jxb[] h2 = khd.h(h);
        jxr a2 = this.D.a();
        try {
            kfg a3 = this.E.b.y.a(this.B, kaaVar2, h, h2);
            this.D.f(a2);
            kkwVar.a = a3;
            return kkwVar;
        } catch (Throwable th) {
            this.D.f(a2);
            throw th;
        }
    }

    public final Runnable c(kkw kkwVar) {
        List list;
        boolean z;
        Collection collection;
        Future future;
        Future future2;
        synchronized (this.m) {
            if (this.r.f != null) {
                return null;
            }
            Collection collection2 = this.r.c;
            kku kkuVar = this.r;
            hoq.I(kkuVar.f == null, "Already committed");
            List list2 = kkuVar.b;
            if (kkuVar.c.contains(kkwVar)) {
                list = null;
                collection = Collections.singleton(kkwVar);
                z = true;
            } else {
                list = list2;
                z = false;
                collection = Collections.EMPTY_LIST;
            }
            this.r = new kku(list, collection, kkuVar.d, kkwVar, kkuVar.g, z, kkuVar.h, kkuVar.e);
            this.G.B(-this.v);
            kks kksVar = this.x;
            boolean z2 = kksVar == null;
            boolean z3 = kksVar != null ? kksVar.b : false;
            boolean z4 = !z2;
            if (z2) {
                future = null;
            } else {
                Future a2 = kksVar.a();
                this.x = null;
                future = a2;
            }
            kks kksVar2 = this.y;
            if (kksVar2 != null) {
                Future a3 = kksVar2.a();
                this.y = null;
                future2 = a3;
            } else {
                future2 = null;
            }
            return new kkk(this, collection2, kkwVar, z4, future, z3, future2);
        }
    }

    public final void d(kkw kkwVar) {
        Runnable c2 = c(kkwVar);
        if (c2 != null) {
            this.g.execute(c2);
        }
    }

    @Override // defpackage.kmn
    public final void e() {
        kku kkuVar = this.r;
        if (kkuVar.a) {
            kkuVar.f.a.e();
        } else {
            i(new kkm(1));
        }
    }

    @Override // defpackage.kmn
    public final void f() {
        i(new kkm(2));
    }

    @Override // defpackage.kmn
    public final void g(int i) {
        kku kkuVar = this.r;
        if (kkuVar.a) {
            kkuVar.f.a.g(i);
        } else {
            i(new kkn(i, 2));
        }
    }

    @Override // defpackage.kmn
    public final void h(jxe jxeVar) {
        i(new kkl(jxeVar, 1));
    }

    public final void i(kkq kkqVar) {
        Collection collection;
        synchronized (this.m) {
            if (!this.r.a) {
                this.r.b.add(kkqVar);
            }
            collection = this.r.c;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            kkqVar.a((kkw) it.next());
        }
    }

    @Override // defpackage.kmn
    public final void j(InputStream inputStream) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    @Override // defpackage.kmn
    public final boolean k() {
        Iterator it = this.r.c.iterator();
        while (it.hasNext()) {
            if (((kkw) it.next()).a.k()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        if (r1 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        r9.h.execute(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r4 != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        r10.a.t(new defpackage.kkv(r9, r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        r0 = r10.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        if (r9.r.f != r10) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        r9 = r9.I;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        r0.n(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
    
        r9 = defpackage.kky.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0081, code lost:
    
        r2 = r3.size();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0086, code lost:
    
        if (r5 >= r2) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0088, code lost:
    
        r7 = (defpackage.kkq) r3.get(r5);
        r7.a(r10);
        r4 = r4 | (r7 instanceof defpackage.kkt);
        r7 = r9.r;
        r8 = r7.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0098, code lost:
    
        if (r8 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009a, code lost:
    
        if (r8 != r10) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009c, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a0, code lost:
    
        if (r7.g == false) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(kkw kkwVar) {
        int min;
        kkh kkhVar = null;
        int i = 0;
        boolean z = false;
        ArrayList arrayList = null;
        while (true) {
            synchronized (this.m) {
                kku kkuVar = this.r;
                kkw kkwVar2 = kkuVar.f;
                if (kkwVar2 == null || kkwVar2 == kkwVar) {
                    if (!kkuVar.g) {
                        List list = kkuVar.b;
                        if (i == list.size()) {
                            this.r = kkuVar.c(kkwVar);
                            if (!k()) {
                                return;
                            } else {
                                kkhVar = new kkh(this, 3);
                            }
                        } else {
                            if (kkwVar.b) {
                                return;
                            }
                            min = Math.min(i + 128, list.size());
                            if (arrayList == null) {
                                arrayList = new ArrayList(list.subList(i, min));
                            } else {
                                arrayList.clear();
                                arrayList.addAll(list.subList(i, min));
                            }
                        }
                    }
                }
            }
            i = min;
        }
    }

    @Override // defpackage.kfg
    public final void m(khi khiVar) {
        kku kkuVar;
        synchronized (this.m) {
            khiVar.b("closed", this.q);
            kkuVar = this.r;
        }
        kkw kkwVar = kkuVar.f;
        if (kkwVar != null) {
            khi khiVar2 = new khi();
            kkwVar.a.m(khiVar2);
            khiVar.b("committed", khiVar2);
            return;
        }
        khi khiVar3 = new khi();
        for (kkw kkwVar2 : kkuVar.c) {
            khi khiVar4 = new khi();
            kkwVar2.a.m(khiVar4);
            khiVar3.a(khiVar4);
        }
        khiVar.b("open", khiVar3);
    }

    @Override // defpackage.kfg
    public final void n(kbq kbqVar) {
        kkw kkwVar;
        kkw kkwVar2 = new kkw(0);
        kkwVar2.a = new kjl();
        Runnable c2 = c(kkwVar2);
        Object obj = this.m;
        if (c2 != null) {
            synchronized (obj) {
                this.r = this.r.c(kkwVar2);
            }
            c2.run();
            v(kbqVar, kfh.a, new kaa());
            return;
        }
        synchronized (obj) {
            if (this.r.c.contains(this.r.f)) {
                kkwVar = this.r.f;
            } else {
                this.I = kbqVar;
                kkwVar = null;
            }
            kku kkuVar = this.r;
            this.r = new kku(kkuVar.b, kkuVar.c, kkuVar.d, kkuVar.f, true, kkuVar.a, kkuVar.h, kkuVar.e);
        }
        if (kkwVar != null) {
            kkwVar.a.n(kbqVar);
        }
    }

    @Override // defpackage.kfg
    public final void o() {
        i(new kkm(0));
    }

    @Override // defpackage.kfg
    public final void p(jxs jxsVar) {
        i(new kkl(jxsVar, 0));
    }

    @Override // defpackage.kfg
    public final void q(jxv jxvVar) {
        i(new kkl(jxvVar, 2));
    }

    @Override // defpackage.kfg
    public final void r(int i) {
        i(new kkn(i, 1));
    }

    @Override // defpackage.kfg
    public final void s(int i) {
        i(new kkn(i, 0));
    }

    @Override // defpackage.kfg
    public final void t(kfi kfiVar) {
        kbq kbqVar;
        kks kksVar;
        kkx kkxVar;
        this.w = kfiVar;
        kip kipVar = this.E.b.z;
        synchronized (kipVar.a) {
            kbqVar = kipVar.c;
            kksVar = null;
            if (kbqVar == null) {
                kipVar.b.add(this);
                kbqVar = null;
            }
        }
        if (kbqVar != null) {
            n(kbqVar);
            return;
        }
        synchronized (this.m) {
            this.r.b.add(new kkt(this));
        }
        kkw b2 = b(0, false, false);
        if (b2 == null) {
            return;
        }
        if (this.l) {
            Object obj = this.m;
            synchronized (obj) {
                this.r = this.r.a(b2);
                if (w(this.r) && ((kkxVar = this.p) == null || kkxVar.a())) {
                    kksVar = new kks(obj);
                    this.y = kksVar;
                }
            }
            if (kksVar != null) {
                kksVar.b(this.i.schedule(new cns(this, kksVar, 2), this.k.b, TimeUnit.NANOSECONDS));
            }
        }
        l(b2);
    }

    public final void u() {
        Future future;
        synchronized (this.m) {
            kks kksVar = this.y;
            future = null;
            if (kksVar != null) {
                Future a2 = kksVar.a();
                this.y = null;
                future = a2;
            }
            this.r = this.r.b();
        }
        if (future != null) {
            future.cancel(false);
        }
    }

    public final void v(kbq kbqVar, kfh kfhVar, kaa kaaVar) {
        this.F = new iyi(kbqVar, kfhVar, kaaVar);
        if (this.u.addAndGet(Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            this.h.execute(new fv((Object) this, kbqVar, kfhVar, kaaVar, 13));
        }
    }

    public final boolean w(kku kkuVar) {
        return kkuVar.f == null && kkuVar.e < this.k.a && !kkuVar.h;
    }
}
