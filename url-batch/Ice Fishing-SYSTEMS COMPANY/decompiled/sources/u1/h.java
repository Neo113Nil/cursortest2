package u1;

import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.ads.G2;
import g1.C4523c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Supplier;
import m.Q0;
import s1.InterfaceC4992e;
import t0.AbstractC5051n;
import u.AbstractC5088e;

/* loaded from: classes.dex */
public final class h implements InterfaceC5105e, Runnable, Comparable, O1.b {

    /* renamed from: n0, reason: collision with root package name */
    public static final s1.g f41090n0 = new s1.g("glide_thread_priority_override", null, s1.g.f40421e);

    /* renamed from: A, reason: collision with root package name */
    public com.bumptech.glide.i f41091A;

    /* renamed from: B, reason: collision with root package name */
    public InterfaceC4992e f41092B;

    /* renamed from: C, reason: collision with root package name */
    public com.bumptech.glide.j f41093C;

    /* renamed from: D, reason: collision with root package name */
    public p f41094D;

    /* renamed from: E, reason: collision with root package name */
    public int f41095E;

    /* renamed from: F, reason: collision with root package name */
    public int f41096F;

    /* renamed from: G, reason: collision with root package name */
    public j f41097G;

    /* renamed from: H, reason: collision with root package name */
    public s1.h f41098H;

    /* renamed from: I, reason: collision with root package name */
    public o f41099I;
    public int J;

    /* renamed from: K, reason: collision with root package name */
    public long f41100K;

    /* renamed from: L, reason: collision with root package name */
    public Object f41101L;

    /* renamed from: M, reason: collision with root package name */
    public C4523c f41102M;

    /* renamed from: N, reason: collision with root package name */
    public Supplier f41103N;

    /* renamed from: O, reason: collision with root package name */
    public Thread f41104O;

    /* renamed from: P, reason: collision with root package name */
    public InterfaceC4992e f41105P;

    /* renamed from: Q, reason: collision with root package name */
    public InterfaceC4992e f41106Q;

    /* renamed from: R, reason: collision with root package name */
    public Object f41107R;

    /* renamed from: S, reason: collision with root package name */
    public com.bumptech.glide.load.data.d f41108S;

    /* renamed from: T, reason: collision with root package name */
    public volatile InterfaceC5106f f41109T;

    /* renamed from: U, reason: collision with root package name */
    public volatile boolean f41110U;

    /* renamed from: V, reason: collision with root package name */
    public volatile boolean f41111V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f41112W;

    /* renamed from: X, reason: collision with root package name */
    public int f41113X;
    public int Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f41114Z;

    /* renamed from: w, reason: collision with root package name */
    public final N1.h f41118w;

    /* renamed from: x, reason: collision with root package name */
    public final Y2.e f41119x;

    /* renamed from: n, reason: collision with root package name */
    public final g f41115n = new g();

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f41116u = new ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public final O1.e f41117v = new O1.e();

    /* renamed from: y, reason: collision with root package name */
    public final Q0 f41120y = new Q0(5);

    /* renamed from: z, reason: collision with root package name */
    public final G2 f41121z = new G2();

    public h(N1.h hVar, Y2.e eVar) {
        this.f41118w = hVar;
        this.f41119x = eVar;
    }

    @Override // u1.InterfaceC5105e
    public final void a(InterfaceC4992e interfaceC4992e, Object obj, com.bumptech.glide.load.data.d dVar, int i, InterfaceC4992e interfaceC4992e2) {
        this.f41105P = interfaceC4992e;
        this.f41107R = obj;
        this.f41108S = dVar;
        this.f41114Z = i;
        this.f41106Q = interfaceC4992e2;
        this.f41112W = interfaceC4992e != this.f41115n.a().get(0);
        if (Thread.currentThread() != this.f41104O) {
            l(3);
        } else {
            f();
        }
    }

    @Override // O1.b
    public final O1.e b() {
        return this.f41117v;
    }

    @Override // u1.InterfaceC5105e
    public final void c(InterfaceC4992e interfaceC4992e, Exception exc, com.bumptech.glide.load.data.d dVar, int i) {
        dVar.b();
        s sVar = new s("Fetching data failed", Collections.singletonList(exc));
        Class a9 = dVar.a();
        sVar.f41186u = interfaceC4992e;
        sVar.f41187v = i;
        sVar.f41188w = a9;
        this.f41116u.add(sVar);
        if (Thread.currentThread() != this.f41104O) {
            l(2);
        } else {
            n();
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        h hVar = (h) obj;
        int ordinal = this.f41093C.ordinal() - hVar.f41093C.ordinal();
        return ordinal == 0 ? this.J - hVar.J : ordinal;
    }

    public final x d(com.bumptech.glide.load.data.d dVar, Object obj, int i) {
        if (obj == null) {
            return null;
        }
        try {
            int i4 = N1.j.f1965b;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            x e6 = e(i, obj);
            if (Log.isLoggable("DecodeJob", 2)) {
                i("Decoded result " + e6, null, elapsedRealtimeNanos);
            }
            return e6;
        } finally {
            dVar.b();
        }
    }

    public final x e(int i, Object obj) {
        Class<?> cls = obj.getClass();
        g gVar = this.f41115n;
        v c4 = gVar.c(cls);
        s1.h hVar = this.f41098H;
        if (Build.VERSION.SDK_INT >= 26) {
            boolean z8 = i == 4 || gVar.f41089r;
            s1.g gVar2 = B1.o.i;
            Boolean bool = (Boolean) hVar.c(gVar2);
            if (bool == null || (bool.booleanValue() && !z8)) {
                hVar = new s1.h();
                s1.h hVar2 = this.f41098H;
                N1.c cVar = hVar.f40426b;
                cVar.i(hVar2.f40426b);
                cVar.put(gVar2, Boolean.valueOf(z8));
            }
        }
        s1.h hVar3 = hVar;
        com.bumptech.glide.load.data.f g9 = this.f41091A.a().g(obj);
        try {
            return c4.a(this.f41095E, this.f41096F, new G1.a(this, i, 18), g9, hVar3);
        } finally {
            g9.b();
        }
    }

    public final void f() {
        x xVar;
        boolean a9;
        Supplier supplier;
        if (Log.isLoggable("DecodeJob", 2)) {
            i("Retrieved data", "data: " + this.f41107R + ", cache key: " + this.f41105P + ", fetcher: " + this.f41108S, this.f41100K);
        }
        w wVar = null;
        if (((Map) this.f41102M.f37856u).containsKey(com.bumptech.glide.g.class) && (supplier = this.f41103N) != null && supplier.get() != null) {
            try {
                Process.setThreadPriority(Process.myTid(), ((Integer) this.f41103N.get()).intValue());
            } catch (IllegalArgumentException | SecurityException e6) {
                this.f41103N = null;
                if (Log.isLoggable("DecodeJob", 2)) {
                    Log.v("DecodeJob", "Failed to set thread priority; using default priority for any subsequent jobs.", e6);
                }
            }
        }
        try {
            xVar = d(this.f41108S, this.f41107R, this.f41114Z);
        } catch (s e9) {
            InterfaceC4992e interfaceC4992e = this.f41106Q;
            int i = this.f41114Z;
            e9.f41186u = interfaceC4992e;
            e9.f41187v = i;
            e9.f41188w = null;
            this.f41116u.add(e9);
            xVar = null;
        }
        if (xVar == null) {
            n();
            return;
        }
        int i4 = this.f41114Z;
        boolean z8 = this.f41112W;
        if (xVar instanceof t) {
            ((t) xVar).initialize();
        }
        if (((w) this.f41120y.f39327d) != null) {
            wVar = (w) w.f41194x.l();
            wVar.f41198w = false;
            wVar.f41197v = true;
            wVar.f41196u = xVar;
            xVar = wVar;
        }
        if (((Map) this.f41102M.f37856u).containsKey(com.bumptech.glide.g.class)) {
            m();
        }
        p();
        o oVar = this.f41099I;
        synchronized (oVar) {
            oVar.f41152G = xVar;
            oVar.f41153H = i4;
            oVar.f41159O = z8;
        }
        synchronized (oVar) {
            try {
                oVar.f41161u.a();
                if (oVar.f41158N) {
                    oVar.f41152G.a();
                    oVar.g();
                } else {
                    if (oVar.f41160n.f41144n.isEmpty()) {
                        throw new IllegalStateException("Received a resource without any callbacks to notify");
                    }
                    if (oVar.f41154I) {
                        throw new IllegalStateException("Already have resource");
                    }
                    C3.e eVar = oVar.f41164x;
                    x xVar2 = oVar.f41152G;
                    boolean z9 = oVar.f41150E;
                    p pVar = oVar.f41149D;
                    k kVar = oVar.f41162v;
                    eVar.getClass();
                    oVar.f41156L = new q(xVar2, z9, true, pVar, kVar);
                    oVar.f41154I = true;
                    n nVar = oVar.f41160n;
                    nVar.getClass();
                    ArrayList arrayList = new ArrayList(nVar.f41144n);
                    oVar.e(arrayList.size() + 1);
                    oVar.f41165y.d(oVar, oVar.f41149D, oVar.f41156L);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        m mVar = (m) it.next();
                        mVar.f41143b.execute(new l(oVar, mVar.f41142a, 1));
                    }
                    oVar.d();
                }
            } finally {
            }
        }
        this.f41113X = 5;
        try {
            Q0 q02 = this.f41120y;
            if (((w) q02.f39327d) != null) {
                N1.h hVar = this.f41118w;
                s1.h hVar2 = this.f41098H;
                q02.getClass();
                try {
                    hVar.a().g((InterfaceC4992e) q02.f39325b, new Q0((s1.k) q02.f39326c, (w) q02.f39327d, hVar2, 4));
                    ((w) q02.f39327d).e();
                } catch (Throwable th) {
                    ((w) q02.f39327d).e();
                    throw th;
                }
            }
            G2 g22 = this.f41121z;
            synchronized (g22) {
                g22.f25092b = true;
                a9 = g22.a();
            }
            if (a9) {
                k();
            }
        } finally {
            if (wVar != null) {
                wVar.e();
            }
        }
    }

    public final InterfaceC5106f g() {
        int d2 = AbstractC5088e.d(this.f41113X);
        g gVar = this.f41115n;
        if (d2 == 1) {
            return new y(gVar, this);
        }
        if (d2 == 2) {
            return new C5103c(gVar.a(), gVar, this);
        }
        if (d2 == 3) {
            return new C5100A(gVar, this);
        }
        if (d2 == 5) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: ".concat(AbstractC5051n.m(this.f41113X)));
    }

    public final int h(int i) {
        boolean z8;
        boolean z9;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            switch (this.f41097G.f41130a) {
                case 0:
                case 1:
                    z8 = false;
                    break;
                default:
                    z8 = true;
                    break;
            }
            if (z8) {
                return 2;
            }
            return h(2);
        }
        if (d2 != 1) {
            if (d2 == 2) {
                return 4;
            }
            if (d2 == 3 || d2 == 5) {
                return 6;
            }
            throw new IllegalArgumentException("Unrecognized stage: ".concat(AbstractC5051n.m(i)));
        }
        switch (this.f41097G.f41130a) {
            case 0:
                z9 = false;
                break;
            case 1:
            default:
                z9 = true;
                break;
        }
        if (z9) {
            return 3;
        }
        return h(3);
    }

    public final void i(String str, String str2, long j9) {
        StringBuilder c4 = AbstractC5088e.c(str, " in ");
        c4.append(N1.j.a(j9));
        c4.append(", load key: ");
        c4.append(this.f41094D);
        c4.append(str2 != null ? ", ".concat(str2) : "");
        c4.append(", thread: ");
        c4.append(Thread.currentThread().getName());
        Log.v("DecodeJob", c4.toString());
    }

    public final void j() {
        boolean a9;
        if (((Map) this.f41102M.f37856u).containsKey(com.bumptech.glide.g.class)) {
            m();
        }
        p();
        s sVar = new s("Failed to load resource", new ArrayList(this.f41116u));
        o oVar = this.f41099I;
        synchronized (oVar) {
            oVar.J = sVar;
        }
        synchronized (oVar) {
            try {
                oVar.f41161u.a();
                if (oVar.f41158N) {
                    oVar.g();
                } else {
                    if (oVar.f41160n.f41144n.isEmpty()) {
                        throw new IllegalStateException("Received an exception without any callbacks to notify");
                    }
                    if (oVar.f41155K) {
                        throw new IllegalStateException("Already failed once");
                    }
                    oVar.f41155K = true;
                    p pVar = oVar.f41149D;
                    n nVar = oVar.f41160n;
                    nVar.getClass();
                    ArrayList arrayList = new ArrayList(nVar.f41144n);
                    oVar.e(arrayList.size() + 1);
                    oVar.f41165y.d(oVar, pVar, null);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        m mVar = (m) it.next();
                        mVar.f41143b.execute(new l(oVar, mVar.f41142a, 0));
                    }
                    oVar.d();
                }
            } finally {
            }
        }
        G2 g22 = this.f41121z;
        synchronized (g22) {
            g22.f25093c = true;
            a9 = g22.a();
        }
        if (a9) {
            k();
        }
    }

    public final void k() {
        G2 g22 = this.f41121z;
        synchronized (g22) {
            g22.f25092b = false;
            g22.f25091a = false;
            g22.f25093c = false;
        }
        Q0 q02 = this.f41120y;
        q02.f39325b = null;
        q02.f39326c = null;
        q02.f39327d = null;
        g gVar = this.f41115n;
        gVar.f41075c = null;
        gVar.f41076d = null;
        gVar.f41085n = null;
        gVar.f41079g = null;
        gVar.f41082k = null;
        gVar.i = null;
        gVar.f41086o = null;
        gVar.f41081j = null;
        gVar.f41087p = null;
        gVar.f41073a.clear();
        gVar.f41083l = false;
        gVar.f41074b.clear();
        gVar.f41084m = false;
        this.f41110U = false;
        this.f41091A = null;
        this.f41092B = null;
        this.f41098H = null;
        this.f41093C = null;
        this.f41094D = null;
        this.f41099I = null;
        this.f41113X = 0;
        this.f41109T = null;
        this.f41104O = null;
        this.f41105P = null;
        this.f41107R = null;
        this.f41114Z = 0;
        this.f41108S = null;
        this.f41100K = 0L;
        this.f41111V = false;
        this.f41101L = null;
        this.f41116u.clear();
        this.f41119x.G(this);
    }

    public final void l(int i) {
        this.Y = i;
        o oVar = this.f41099I;
        (oVar.f41151F ? oVar.f41147B : oVar.f41146A).execute(this);
    }

    public final void m() {
        if (!((Map) this.f41102M.f37856u).containsKey(com.bumptech.glide.g.class)) {
            throw new IllegalStateException("OverrideGlideThreadPriority experiment is not enabled.");
        }
        Supplier supplier = this.f41103N;
        if (supplier == null || supplier.get() == null) {
            return;
        }
        try {
            Process.setThreadPriority(Process.myTid(), 9);
        } catch (IllegalArgumentException | SecurityException e6) {
            this.f41103N = null;
            if (Log.isLoggable("DecodeJob", 2)) {
                Log.v("DecodeJob", "Failed to set thread priority; using default priority for any subsequent jobs.", e6);
            }
        }
    }

    public final void n() {
        this.f41104O = Thread.currentThread();
        int i = N1.j.f1965b;
        this.f41100K = SystemClock.elapsedRealtimeNanos();
        boolean z8 = false;
        while (!this.f41111V && this.f41109T != null && !(z8 = this.f41109T.b())) {
            this.f41113X = h(this.f41113X);
            this.f41109T = g();
            if (this.f41113X == 4) {
                l(2);
                return;
            }
        }
        if ((this.f41113X == 6 || this.f41111V) && !z8) {
            j();
        }
    }

    public final void o() {
        int d2 = AbstractC5088e.d(this.Y);
        if (d2 == 0) {
            this.f41113X = h(1);
            this.f41109T = g();
            n();
        } else if (d2 == 1) {
            n();
        } else if (d2 == 2) {
            f();
        } else {
            int i = this.Y;
            throw new IllegalStateException("Unrecognized run reason: ".concat(i != 1 ? i != 2 ? i != 3 ? "null" : "DECODE_DATA" : "SWITCH_TO_SOURCE_SERVICE" : "INITIALIZE"));
        }
    }

    public final void p() {
        Throwable th;
        this.f41117v.a();
        if (!this.f41110U) {
            this.f41110U = true;
            return;
        }
        if (this.f41116u.isEmpty()) {
            th = null;
        } else {
            ArrayList arrayList = this.f41116u;
            th = (Throwable) arrayList.get(arrayList.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.bumptech.glide.load.data.d dVar = this.f41108S;
        try {
            try {
                if (this.f41111V) {
                    j();
                    if (dVar != null) {
                        dVar.b();
                        return;
                    }
                    return;
                }
                o();
                if (dVar != null) {
                    dVar.b();
                }
            } catch (Throwable th) {
                if (dVar != null) {
                    dVar.b();
                }
                throw th;
            }
        } catch (C5102b e6) {
            throw e6;
        } catch (Throwable th2) {
            if (Log.isLoggable("DecodeJob", 3)) {
                Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.f41111V + ", stage: " + AbstractC5051n.m(this.f41113X), th2);
            }
            if (this.f41113X != 5) {
                this.f41116u.add(th2);
                j();
            }
            if (!this.f41111V) {
                throw th2;
            }
            throw th2;
        }
    }
}
