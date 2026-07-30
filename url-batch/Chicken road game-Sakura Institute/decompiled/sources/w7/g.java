package w7;

import a2.q;
import a8.o;
import c0.w;
import e6.r;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import s7.p;
import s7.s;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g implements Cloneable {

    /* renamed from: f, reason: collision with root package name */
    public final p f9551f;

    /* renamed from: g, reason: collision with root package name */
    public final q f9552g;

    /* renamed from: h, reason: collision with root package name */
    public final j f9553h;

    /* renamed from: i, reason: collision with root package name */
    public final f f9554i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f9555j;

    /* renamed from: k, reason: collision with root package name */
    public Object f9556k;

    /* renamed from: l, reason: collision with root package name */
    public d f9557l;

    /* renamed from: m, reason: collision with root package name */
    public i f9558m;

    /* renamed from: n, reason: collision with root package name */
    public w f9559n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f9560o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f9561p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f9562q;

    /* renamed from: r, reason: collision with root package name */
    public volatile boolean f9563r;

    /* renamed from: s, reason: collision with root package name */
    public volatile w f9564s;

    /* renamed from: t, reason: collision with root package name */
    public volatile i f9565t;

    public g(p pVar, q qVar) {
        r6.k.f(pVar, "client");
        this.f9551f = pVar;
        this.f9552g = qVar;
        this.f9553h = (j) pVar.f8642g.f5847g;
        pVar.f8645j.getClass();
        f fVar = new f(this);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        fVar.g(0);
        this.f9554i = fVar;
        this.f9555j = new AtomicBoolean();
        this.f9562q = true;
    }

    public final void a(i iVar) {
        byte[] bArr = t7.b.f8932a;
        if (this.f9558m != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.f9558m = iVar;
        iVar.f9581p.add(new e(this, this.f9556k));
    }

    public final IOException b(IOException iOException) {
        IOException interruptedIOException;
        Socket h3;
        byte[] bArr = t7.b.f8932a;
        i iVar = this.f9558m;
        if (iVar != null) {
            synchronized (iVar) {
                h3 = h();
            }
            if (this.f9558m == null) {
                if (h3 != null) {
                    t7.b.d(h3);
                }
            } else if (h3 != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (this.f9554i.i()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException != null) {
            r6.k.c(interruptedIOException);
        }
        return interruptedIOException;
    }

    public final s c() {
        if (!this.f9555j.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.f9554i.h();
        o oVar = o.f570a;
        this.f9556k = o.f570a.g();
        try {
            g3.k kVar = this.f9551f.f8641f;
            synchronized (kVar) {
                ((ArrayDeque) kVar.f4163j).add(this);
            }
            return e();
        } finally {
            this.f9551f.f8641f.r(this);
        }
    }

    public final Object clone() {
        return new g(this.f9551f, this.f9552g);
    }

    public final void d(boolean z8) {
        w wVar;
        synchronized (this) {
            if (!this.f9562q) {
                throw new IllegalStateException("released");
            }
        }
        if (z8 && (wVar = this.f9564s) != null) {
            ((x7.d) wVar.f1516d).cancel();
            ((g) wVar.f1514b).f(wVar, true, true, null);
        }
        this.f9559n = null;
    }

    public final s e() {
        ArrayList arrayList = new ArrayList();
        r.c0(this.f9551f.f8643h, arrayList);
        arrayList.add(new x7.a(this.f9551f));
        arrayList.add(new x7.a(this.f9551f.f8650o));
        this.f9551f.getClass();
        arrayList.add(new u7.b());
        arrayList.add(a.f9529a);
        r.c0(this.f9551f.f8644i, arrayList);
        arrayList.add(new x7.b());
        q qVar = this.f9552g;
        p pVar = this.f9551f;
        boolean z8 = false;
        try {
            try {
                s b9 = new x7.f(this, arrayList, 0, null, qVar, pVar.A, pVar.B, pVar.C).b(qVar);
                if (this.f9563r) {
                    t7.b.c(b9);
                    throw new IOException("Canceled");
                }
                g(null);
                return b9;
            } catch (IOException e9) {
                z8 = true;
                IOException g9 = g(e9);
                r6.k.d(g9, "null cannot be cast to non-null type kotlin.Throwable");
                throw g9;
            }
        } catch (Throwable th) {
            if (!z8) {
                g(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:48:0x0013, B:10:0x0022, B:12:0x0026, B:13:0x0028, B:15:0x002c, B:19:0x0035, B:21:0x0039, B:7:0x001c), top: B:47:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0026 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:48:0x0013, B:10:0x0022, B:12:0x0026, B:13:0x0028, B:15:0x002c, B:19:0x0035, B:21:0x0039, B:7:0x001c), top: B:47:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IOException f(w wVar, boolean z8, boolean z9, IOException iOException) {
        boolean z10;
        boolean z11;
        boolean z12;
        r6.k.f(wVar, "exchange");
        if (wVar.equals(this.f9564s)) {
            synchronized (this) {
                z10 = false;
                if (z8) {
                    try {
                        if (!this.f9560o) {
                        }
                        if (z8) {
                            this.f9560o = false;
                        }
                        if (z9) {
                            this.f9561p = false;
                        }
                        z12 = this.f9560o;
                        boolean z13 = z12 && !this.f9561p;
                        if (!z12 && !this.f9561p) {
                            if (!this.f9562q) {
                                z10 = true;
                            }
                        }
                        z11 = z10;
                        z10 = z13;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (!z9 || !this.f9561p) {
                    z11 = false;
                }
                if (z8) {
                }
                if (z9) {
                }
                z12 = this.f9560o;
                if (z12) {
                }
                if (!z12) {
                    if (!this.f9562q) {
                    }
                }
                z11 = z10;
                z10 = z13;
            }
            if (z10) {
                this.f9564s = null;
                i iVar = this.f9558m;
                if (iVar != null) {
                    synchronized (iVar) {
                        iVar.f9578m++;
                    }
                }
            }
            if (z11) {
                return b(iOException);
            }
        }
        return iOException;
    }

    public final IOException g(IOException iOException) {
        boolean z8;
        synchronized (this) {
            z8 = false;
            if (this.f9562q) {
                this.f9562q = false;
                if (!this.f9560o) {
                    if (!this.f9561p) {
                        z8 = true;
                    }
                }
            }
        }
        return z8 ? b(iOException) : iOException;
    }

    public final Socket h() {
        i iVar = this.f9558m;
        r6.k.c(iVar);
        byte[] bArr = t7.b.f8932a;
        ArrayList arrayList = iVar.f9581p;
        int size = arrayList.size();
        int i7 = 0;
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                i7 = -1;
                break;
            }
            Object obj = arrayList.get(i8);
            i8++;
            if (r6.k.a(((Reference) obj).get(), this)) {
                break;
            }
            i7++;
        }
        if (i7 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i7);
        this.f9558m = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        iVar.f9582q = System.nanoTime();
        j jVar = this.f9553h;
        ConcurrentLinkedQueue concurrentLinkedQueue = jVar.f9586d;
        v7.c cVar = jVar.f9584b;
        byte[] bArr2 = t7.b.f8932a;
        if (!iVar.f9575j) {
            cVar.c(jVar.f9585c, 0L);
            return null;
        }
        iVar.f9575j = true;
        concurrentLinkedQueue.remove(iVar);
        if (concurrentLinkedQueue.isEmpty()) {
            cVar.a();
        }
        Socket socket = iVar.f9569d;
        r6.k.c(socket);
        return socket;
    }
}
