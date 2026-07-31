package E2;

import A2.u;
import A2.w;
import A2.y;
import E.G;
import M1.r;
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
public final class h implements Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public final u f802d;

    /* renamed from: e, reason: collision with root package name */
    public final w f803e;

    /* renamed from: f, reason: collision with root package name */
    public final l f804f;

    /* renamed from: g, reason: collision with root package name */
    public final g f805g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f806h;

    /* renamed from: i, reason: collision with root package name */
    public Object f807i;

    /* renamed from: j, reason: collision with root package name */
    public e f808j;

    /* renamed from: k, reason: collision with root package name */
    public k f809k;

    /* renamed from: l, reason: collision with root package name */
    public G f810l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f811m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f812n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f813o;
    public volatile boolean p;

    /* renamed from: q, reason: collision with root package name */
    public volatile G f814q;

    /* renamed from: r, reason: collision with root package name */
    public volatile k f815r;

    public h(u uVar, w wVar) {
        Z1.i.f(uVar, "client");
        this.f802d = uVar;
        this.f803e = wVar;
        this.f804f = (l) uVar.f163e.f83b;
        uVar.f166h.getClass();
        g gVar = new g(this);
        gVar.g(0, TimeUnit.MILLISECONDS);
        this.f805g = gVar;
        this.f806h = new AtomicBoolean();
        this.f813o = true;
    }

    public final void a(k kVar) {
        byte[] bArr = B2.c.f415a;
        if (this.f809k != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.f809k = kVar;
        kVar.p.add(new f(this, this.f807i));
    }

    public final IOException b(IOException iOException) {
        IOException interruptedIOException;
        Socket h3;
        byte[] bArr = B2.c.f415a;
        k kVar = this.f809k;
        if (kVar != null) {
            synchronized (kVar) {
                h3 = h();
            }
            if (this.f809k == null) {
                if (h3 != null) {
                    B2.c.d(h3);
                }
            } else if (h3 != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (this.f805g.i()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException != null) {
            Z1.i.c(interruptedIOException);
        }
        return interruptedIOException;
    }

    public final y c() {
        if (!this.f806h.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.f805g.h();
        I2.n nVar = I2.n.f2519a;
        this.f807i = I2.n.f2519a.g();
        try {
            A2.k kVar = this.f802d.f162d;
            synchronized (kVar) {
                ((ArrayDeque) kVar.f111e).add(this);
            }
            return e();
        } finally {
            this.f802d.f162d.h(this);
        }
    }

    public final Object clone() {
        return new h(this.f802d, this.f803e);
    }

    public final void d(boolean z3) {
        G g3;
        synchronized (this) {
            if (!this.f813o) {
                throw new IllegalStateException("released");
            }
        }
        if (z3 && (g3 = this.f814q) != null) {
            ((F2.e) g3.f624d).cancel();
            ((h) g3.f622b).f(g3, true, true, null);
        }
        this.f810l = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final y e() {
        ArrayList arrayList = new ArrayList();
        r.i0(this.f802d.f164f, arrayList);
        arrayList.add(new F2.a(this.f802d));
        arrayList.add(new F2.a(this.f802d.f171m));
        this.f802d.getClass();
        arrayList.add(new C2.b());
        arrayList.add(a.f773a);
        r.i0(this.f802d.f165g, arrayList);
        arrayList.add(new F2.b());
        w wVar = this.f803e;
        u uVar = this.f802d;
        boolean z3 = false;
        try {
            y b2 = new F2.g(this, arrayList, 0, null, wVar, uVar.f182y, uVar.f183z, uVar.f161A).b(this.f803e);
            if (this.p) {
                B2.c.c(b2);
                throw new IOException("Canceled");
            }
            g(null);
            return b2;
        } catch (IOException e3) {
            try {
                IOException g3 = g(e3);
                Z1.i.d(g3, "null cannot be cast to non-null type kotlin.Throwable");
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
    public final IOException f(G g3, boolean z3, boolean z4, IOException iOException) {
        boolean z5;
        boolean z6;
        boolean z7;
        Z1.i.f(g3, "exchange");
        if (!g3.equals(this.f814q)) {
            return iOException;
        }
        synchronized (this) {
            z5 = false;
            if (z3) {
                try {
                    if (!this.f811m) {
                    }
                    if (z3) {
                        this.f811m = false;
                    }
                    if (z4) {
                        this.f812n = false;
                    }
                    z7 = this.f811m;
                    boolean z8 = z7 && !this.f812n;
                    if (!z7 && !this.f812n) {
                        if (!this.f813o) {
                            z5 = true;
                        }
                    }
                    z6 = z5;
                    z5 = z8;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!z4 || !this.f812n) {
                z6 = false;
            }
            if (z3) {
            }
            if (z4) {
            }
            z7 = this.f811m;
            if (z7) {
            }
            if (!z7) {
                if (!this.f813o) {
                }
            }
            z6 = z5;
            z5 = z8;
        }
        if (z5) {
            this.f814q = null;
            k kVar = this.f809k;
            if (kVar != null) {
                synchronized (kVar) {
                    kVar.f832m++;
                }
            }
        }
        return z6 ? b(iOException) : iOException;
    }

    public final IOException g(IOException iOException) {
        boolean z3;
        synchronized (this) {
            z3 = false;
            if (this.f813o) {
                this.f813o = false;
                if (!this.f811m) {
                    if (!this.f812n) {
                        z3 = true;
                    }
                }
            }
        }
        return z3 ? b(iOException) : iOException;
    }

    public final Socket h() {
        k kVar = this.f809k;
        Z1.i.c(kVar);
        byte[] bArr = B2.c.f415a;
        ArrayList arrayList = kVar.p;
        Iterator it = arrayList.iterator();
        int i3 = 0;
        while (true) {
            if (!it.hasNext()) {
                i3 = -1;
                break;
            }
            if (Z1.i.a(((Reference) it.next()).get(), this)) {
                break;
            }
            i3++;
        }
        if (i3 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i3);
        this.f809k = null;
        if (arrayList.isEmpty()) {
            kVar.f835q = System.nanoTime();
            l lVar = this.f804f;
            lVar.getClass();
            byte[] bArr2 = B2.c.f415a;
            boolean z3 = kVar.f829j;
            D2.c cVar = lVar.f837b;
            if (z3) {
                kVar.f829j = true;
                ConcurrentLinkedQueue concurrentLinkedQueue = lVar.f839d;
                concurrentLinkedQueue.remove(kVar);
                if (concurrentLinkedQueue.isEmpty()) {
                    cVar.a();
                }
                Socket socket = kVar.f823d;
                Z1.i.c(socket);
                return socket;
            }
            cVar.c(lVar.f838c, 0L);
        }
        return null;
    }
}
