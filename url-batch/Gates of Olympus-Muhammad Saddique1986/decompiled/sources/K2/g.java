package K2;

import C0.q;
import E.F;
import G2.r;
import G2.u;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class g implements Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public final r f3287d;

    /* renamed from: e, reason: collision with root package name */
    public final q f3288e;

    /* renamed from: f, reason: collision with root package name */
    public final k f3289f;

    /* renamed from: g, reason: collision with root package name */
    public final f f3290g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f3291h;

    /* renamed from: i, reason: collision with root package name */
    public Object f3292i;

    /* renamed from: j, reason: collision with root package name */
    public d f3293j;

    /* renamed from: k, reason: collision with root package name */
    public j f3294k;

    /* renamed from: l, reason: collision with root package name */
    public F f3295l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3296m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3297n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3298o;

    /* renamed from: p, reason: collision with root package name */
    public volatile boolean f3299p;

    /* renamed from: q, reason: collision with root package name */
    public volatile F f3300q;

    /* renamed from: r, reason: collision with root package name */
    public volatile j f3301r;

    public g(r rVar, q qVar) {
        f2.j.f(rVar, "client");
        this.f3287d = rVar;
        this.f3288e = qVar;
        this.f3289f = (k) rVar.f2251e.f334d;
        rVar.f2254h.getClass();
        f fVar = new f(this);
        fVar.g(0, TimeUnit.MILLISECONDS);
        this.f3290g = fVar;
        this.f3291h = new AtomicBoolean();
        this.f3298o = true;
    }

    public final void a(j jVar) {
        byte[] bArr = H2.b.f2632a;
        if (this.f3294k != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.f3294k = jVar;
        jVar.f3321p.add(new e(this, this.f3292i));
    }

    public final IOException b(IOException iOException) {
        IOException interruptedIOException;
        Socket h3;
        byte[] bArr = H2.b.f2632a;
        j jVar = this.f3294k;
        if (jVar != null) {
            synchronized (jVar) {
                h3 = h();
            }
            if (this.f3294k == null) {
                if (h3 != null) {
                    H2.b.d(h3);
                }
            } else if (h3 != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (this.f3290g.i()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException != null) {
            f2.j.c(interruptedIOException);
        }
        return interruptedIOException;
    }

    public final u c() {
        if (!this.f3291h.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.f3290g.h();
        O2.n nVar = O2.n.f3910a;
        this.f3292i = O2.n.f3910a.g();
        try {
            G1.g gVar = this.f3287d.f2250d;
            synchronized (gVar) {
                ((ArrayDeque) gVar.f2096h).add(this);
            }
            return e();
        } finally {
            this.f3287d.f2250d.e(this);
        }
    }

    public final Object clone() {
        return new g(this.f3287d, this.f3288e);
    }

    public final void d(boolean z3) {
        F f3;
        synchronized (this) {
            if (!this.f3298o) {
                throw new IllegalStateException("released");
            }
        }
        if (z3 && (f3 = this.f3300q) != null) {
            ((L2.e) f3.f925d).cancel();
            ((g) f3.f923b).f(f3, true, true, null);
        }
        this.f3295l = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final u e() {
        ArrayList arrayList = new ArrayList();
        S1.r.G0(this.f3287d.f2252f, arrayList);
        arrayList.add(new L2.a(this.f3287d));
        arrayList.add(new L2.a(this.f3287d.f2259m));
        this.f3287d.getClass();
        arrayList.add(new I2.b());
        arrayList.add(a.f3262a);
        S1.r.G0(this.f3287d.f2253g, arrayList);
        arrayList.add(new L2.b());
        q qVar = this.f3288e;
        r rVar = this.f3287d;
        boolean z3 = false;
        try {
            u b3 = new L2.g(this, arrayList, 0, null, qVar, rVar.f2271y, rVar.f2272z, rVar.f2248A).b(this.f3288e);
            if (this.f3299p) {
                H2.b.c(b3);
                throw new IOException("Canceled");
            }
            g(null);
            return b3;
        } catch (IOException e3) {
            try {
                IOException g3 = g(e3);
                f2.j.d(g3, "null cannot be cast to non-null type kotlin.Throwable");
                throw g3;
            } catch (Throwable th) {
                th = th;
                z3 = true;
                if (!z3) {
                    g(null);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (!z3) {
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:50:0x0013, B:12:0x0022, B:14:0x0026, B:15:0x0028, B:17:0x002c, B:21:0x0035, B:23:0x0039, B:9:0x001c), top: B:49:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0026 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:50:0x0013, B:12:0x0022, B:14:0x0026, B:15:0x0028, B:17:0x002c, B:21:0x0035, B:23:0x0039, B:9:0x001c), top: B:49:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IOException f(F f3, boolean z3, boolean z4, IOException iOException) {
        boolean z5;
        boolean z6;
        boolean z7;
        f2.j.f(f3, "exchange");
        if (!f3.equals(this.f3300q)) {
            return iOException;
        }
        synchronized (this) {
            z5 = false;
            if (z3) {
                try {
                    if (!this.f3296m) {
                    }
                    if (z3) {
                        this.f3296m = false;
                    }
                    if (z4) {
                        this.f3297n = false;
                    }
                    z7 = this.f3296m;
                    boolean z8 = z7 && !this.f3297n;
                    if (!z7 && !this.f3297n) {
                        if (!this.f3298o) {
                            z5 = true;
                        }
                    }
                    z6 = z5;
                    z5 = z8;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!z4 || !this.f3297n) {
                z6 = false;
            }
            if (z3) {
            }
            if (z4) {
            }
            z7 = this.f3296m;
            if (z7) {
            }
            if (!z7) {
                if (!this.f3298o) {
                }
            }
            z6 = z5;
            z5 = z8;
        }
        if (z5) {
            this.f3300q = null;
            j jVar = this.f3294k;
            if (jVar != null) {
                synchronized (jVar) {
                    jVar.f3318m++;
                }
            }
        }
        return z6 ? b(iOException) : iOException;
    }

    public final IOException g(IOException iOException) {
        boolean z3;
        synchronized (this) {
            z3 = false;
            if (this.f3298o) {
                this.f3298o = false;
                if (!this.f3296m) {
                    if (!this.f3297n) {
                        z3 = true;
                    }
                }
            }
        }
        return z3 ? b(iOException) : iOException;
    }

    public final Socket h() {
        j jVar = this.f3294k;
        f2.j.c(jVar);
        byte[] bArr = H2.b.f2632a;
        ArrayList arrayList = jVar.f3321p;
        Iterator it = arrayList.iterator();
        int i3 = 0;
        while (true) {
            if (!it.hasNext()) {
                i3 = -1;
                break;
            }
            if (f2.j.a(((Reference) it.next()).get(), this)) {
                break;
            }
            i3++;
        }
        if (i3 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i3);
        this.f3294k = null;
        if (arrayList.isEmpty()) {
            jVar.f3322q = System.nanoTime();
            k kVar = this.f3289f;
            kVar.getClass();
            byte[] bArr2 = H2.b.f2632a;
            boolean z3 = jVar.f3315j;
            J2.c cVar = kVar.f3324b;
            if (z3) {
                jVar.f3315j = true;
                ConcurrentLinkedQueue concurrentLinkedQueue = kVar.f3326d;
                concurrentLinkedQueue.remove(jVar);
                if (concurrentLinkedQueue.isEmpty()) {
                    cVar.a();
                }
                Socket socket = jVar.f3309d;
                f2.j.c(socket);
                return socket;
            }
            cVar.c(kVar.f3325c, 0L);
        }
        return null;
    }
}
