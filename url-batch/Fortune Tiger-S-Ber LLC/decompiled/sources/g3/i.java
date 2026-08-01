package g3;

import c3.q;
import c3.s;
import c3.u;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class i implements Cloneable {

    /* renamed from: f, reason: collision with root package name */
    public final q f1943f;
    public final s g;
    public final m h;

    /* renamed from: i, reason: collision with root package name */
    public final h f1944i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f1945j;

    /* renamed from: k, reason: collision with root package name */
    public Object f1946k;

    /* renamed from: l, reason: collision with root package name */
    public e f1947l;

    /* renamed from: m, reason: collision with root package name */
    public l f1948m;

    /* renamed from: n, reason: collision with root package name */
    public d f1949n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1950o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1951p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1952q;

    /* renamed from: r, reason: collision with root package name */
    public volatile boolean f1953r;

    /* renamed from: s, reason: collision with root package name */
    public volatile d f1954s;

    /* renamed from: t, reason: collision with root package name */
    public volatile l f1955t;

    public i(q qVar, s sVar) {
        this.f1943f = qVar;
        this.g = sVar;
        this.h = (m) qVar.g.g;
        qVar.f1104j.getClass();
        h hVar = new h(this);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        hVar.g(0);
        this.f1944i = hVar;
        this.f1945j = new AtomicBoolean();
        this.f1952q = true;
    }

    public static final String a(i iVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(iVar.f1953r ? "canceled " : "");
        sb.append("call");
        sb.append(" to ");
        sb.append(iVar.g.f1127a.f());
        return sb.toString();
    }

    public final void b(l lVar) {
        byte[] bArr = d3.c.f1490a;
        if (this.f1948m != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.f1948m = lVar;
        lVar.f1969p.add(new g(this, this.f1946k));
    }

    public final IOException c(IOException iOException) {
        IOException interruptedIOException;
        Socket i4;
        byte[] bArr = d3.c.f1490a;
        l lVar = this.f1948m;
        if (lVar != null) {
            synchronized (lVar) {
                i4 = i();
            }
            if (this.f1948m == null) {
                if (i4 != null) {
                    d3.c.c(i4);
                }
            } else if (i4 != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (this.f1944i.i()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException != null) {
            u2.c.b(interruptedIOException);
        }
        return interruptedIOException;
    }

    public final Object clone() {
        return new i(this.f1943f, this.g);
    }

    public final void d() {
        Socket socket;
        if (this.f1953r) {
            return;
        }
        this.f1953r = true;
        d dVar = this.f1954s;
        if (dVar != null) {
            dVar.c.cancel();
        }
        l lVar = this.f1955t;
        if (lVar == null || (socket = lVar.c) == null) {
            return;
        }
        d3.c.c(socket);
    }

    public final void e(boolean z3) {
        d dVar;
        synchronized (this) {
            if (!this.f1952q) {
                throw new IllegalStateException("released");
            }
        }
        if (z3 && (dVar = this.f1954s) != null) {
            dVar.c.cancel();
            dVar.f1930a.g(dVar, true, true, null);
        }
        this.f1949n = null;
    }

    public final u f() {
        ArrayList arrayList = new ArrayList();
        n2.m.F(arrayList, this.f1943f.h);
        arrayList.add(new h3.a(this.f1943f));
        arrayList.add(new h3.a(this.f1943f.f1109o));
        arrayList.add(new e3.b());
        arrayList.add(a.f1921a);
        n2.m.F(arrayList, this.f1943f.f1103i);
        arrayList.add(new h3.b());
        s sVar = this.g;
        q qVar = this.f1943f;
        try {
            try {
                u b2 = new h3.g(this, arrayList, 0, null, sVar, qVar.A, qVar.B, qVar.C).b(sVar);
                if (this.f1953r) {
                    d3.c.b(b2);
                    throw new IOException("Canceled");
                }
                h(null);
                return b2;
            } catch (IOException e4) {
                IOException h = h(e4);
                u2.c.c(h, "null cannot be cast to non-null type kotlin.Throwable");
                throw h;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                h(null);
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
    public final IOException g(d dVar, boolean z3, boolean z4, IOException iOException) {
        boolean z5;
        boolean z6;
        boolean z7;
        u2.c.e(dVar, "exchange");
        if (dVar.equals(this.f1954s)) {
            synchronized (this) {
                z5 = false;
                if (z3) {
                    try {
                        if (!this.f1950o) {
                        }
                        if (z3) {
                            this.f1950o = false;
                        }
                        if (z4) {
                            this.f1951p = false;
                        }
                        z7 = this.f1950o;
                        boolean z8 = z7 && !this.f1951p;
                        if (!z7 && !this.f1951p) {
                            if (!this.f1952q) {
                                z5 = true;
                            }
                        }
                        z6 = z5;
                        z5 = z8;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (!z4 || !this.f1951p) {
                    z6 = false;
                }
                if (z3) {
                }
                if (z4) {
                }
                z7 = this.f1950o;
                if (z7) {
                }
                if (!z7) {
                    if (!this.f1952q) {
                    }
                }
                z6 = z5;
                z5 = z8;
            }
            if (z5) {
                this.f1954s = null;
                l lVar = this.f1948m;
                if (lVar != null) {
                    synchronized (lVar) {
                        lVar.f1966m++;
                    }
                }
            }
            if (z6) {
                return c(iOException);
            }
        }
        return iOException;
    }

    public final IOException h(IOException iOException) {
        boolean z3;
        synchronized (this) {
            z3 = false;
            if (this.f1952q) {
                this.f1952q = false;
                if (!this.f1950o) {
                    if (!this.f1951p) {
                        z3 = true;
                    }
                }
            }
        }
        return z3 ? c(iOException) : iOException;
    }

    public final Socket i() {
        l lVar = this.f1948m;
        u2.c.b(lVar);
        byte[] bArr = d3.c.f1490a;
        ArrayList arrayList = lVar.f1969p;
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                i4 = -1;
                break;
            }
            Object obj = arrayList.get(i5);
            i5++;
            if (u2.c.a(((Reference) obj).get(), this)) {
                break;
            }
            i4++;
        }
        if (i4 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i4);
        this.f1948m = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        lVar.f1970q = System.nanoTime();
        m mVar = this.h;
        ConcurrentLinkedQueue concurrentLinkedQueue = mVar.f1973d;
        f3.c cVar = mVar.f1972b;
        byte[] bArr2 = d3.c.f1490a;
        if (!lVar.f1963j) {
            cVar.c(mVar.c, 0L);
            return null;
        }
        lVar.f1963j = true;
        concurrentLinkedQueue.remove(lVar);
        if (concurrentLinkedQueue.isEmpty()) {
            cVar.a();
        }
        Socket socket = lVar.f1959d;
        u2.c.b(socket);
        return socket;
    }
}
