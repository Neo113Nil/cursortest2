package K3;

import G3.s;
import G3.v;
import G3.y;
import d3.o;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class i implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final s f1561a;

    /* renamed from: b, reason: collision with root package name */
    public final v f1562b;

    /* renamed from: c, reason: collision with root package name */
    public final l f1563c;

    /* renamed from: d, reason: collision with root package name */
    public final h f1564d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f1565e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1566f;

    /* renamed from: g, reason: collision with root package name */
    public f f1567g;

    /* renamed from: h, reason: collision with root package name */
    public k f1568h;

    /* renamed from: i, reason: collision with root package name */
    public e f1569i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1570j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1571k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1572l;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f1573m;
    public volatile e n;
    public volatile k o;

    public i(s client, v vVar) {
        kotlin.jvm.internal.i.e(client, "client");
        this.f1561a = client;
        this.f1562b = vVar;
        this.f1563c = (l) client.f978b.f15398b;
        client.f981e.getClass();
        h hVar = new h(this);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        hVar.g(0);
        this.f1564d = hVar;
        this.f1565e = new AtomicBoolean();
        this.f1572l = true;
    }

    public final void a(k kVar) {
        byte[] bArr = H3.b.f1103a;
        if (this.f1568h != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.f1568h = kVar;
        kVar.f1587p.add(new g(this, this.f1566f));
    }

    public final IOException b(IOException iOException) {
        IOException interruptedIOException;
        Socket h2;
        byte[] bArr = H3.b.f1103a;
        k kVar = this.f1568h;
        if (kVar != null) {
            synchronized (kVar) {
                h2 = h();
            }
            if (this.f1568h == null) {
                if (h2 != null) {
                    H3.b.d(h2);
                }
            } else if (h2 != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (this.f1564d.i()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException != null) {
            kotlin.jvm.internal.i.b(interruptedIOException);
        }
        return interruptedIOException;
    }

    public final y c() {
        if (!this.f1565e.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.f1564d.h();
        O3.n nVar = O3.n.f2081a;
        this.f1566f = O3.n.f2081a.g();
        try {
            G1.c cVar = this.f1561a.f977a;
            synchronized (cVar) {
                ((ArrayDeque) cVar.f838e).add(this);
            }
            return e();
        } finally {
            this.f1561a.f977a.f(this);
        }
    }

    public final Object clone() {
        return new i(this.f1561a, this.f1562b);
    }

    public final void d(boolean z) {
        e eVar;
        synchronized (this) {
            if (!this.f1572l) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (eVar = this.n) != null) {
            eVar.f1547c.cancel();
            eVar.f1545a.f(eVar, true, true, null);
        }
        this.f1569i = null;
    }

    public final y e() {
        ArrayList arrayList = new ArrayList();
        o.Z(arrayList, this.f1561a.f979c);
        arrayList.add(new L3.a(this.f1561a));
        arrayList.add(new L3.a(this.f1561a.f986j));
        this.f1561a.getClass();
        arrayList.add(new I3.b());
        arrayList.add(a.f1527a);
        o.Z(arrayList, this.f1561a.f980d);
        arrayList.add(new L3.b());
        v vVar = this.f1562b;
        s sVar = this.f1561a;
        try {
            try {
                y b4 = new L3.g(this, arrayList, 0, null, vVar, sVar.v, sVar.f996w, sVar.f997x).b(vVar);
                if (this.f1573m) {
                    H3.b.c(b4);
                    throw new IOException("Canceled");
                }
                g(null);
                return b4;
            } catch (IOException e4) {
                IOException g4 = g(e4);
                if (g4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
                }
                throw g4;
            }
        } catch (Throwable th) {
            if (0 == 0) {
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
    public final IOException f(e exchange, boolean z, boolean z4, IOException iOException) {
        boolean z5;
        boolean z6;
        boolean z7;
        kotlin.jvm.internal.i.e(exchange, "exchange");
        if (exchange.equals(this.n)) {
            synchronized (this) {
                z5 = false;
                if (z) {
                    try {
                        if (!this.f1570j) {
                        }
                        if (z) {
                            this.f1570j = false;
                        }
                        if (z4) {
                            this.f1571k = false;
                        }
                        z7 = this.f1570j;
                        boolean z8 = z7 && !this.f1571k;
                        if (!z7 && !this.f1571k) {
                            if (!this.f1572l) {
                                z5 = true;
                            }
                        }
                        z6 = z5;
                        z5 = z8;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (!z4 || !this.f1571k) {
                    z6 = false;
                }
                if (z) {
                }
                if (z4) {
                }
                z7 = this.f1570j;
                if (z7) {
                }
                if (!z7) {
                    if (!this.f1572l) {
                    }
                }
                z6 = z5;
                z5 = z8;
            }
            if (z5) {
                this.n = null;
                k kVar = this.f1568h;
                if (kVar != null) {
                    synchronized (kVar) {
                        kVar.f1586m++;
                    }
                }
            }
            if (z6) {
                return b(iOException);
            }
        }
        return iOException;
    }

    public final IOException g(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.f1572l) {
                this.f1572l = false;
                if (!this.f1570j) {
                    if (!this.f1571k) {
                        z = true;
                    }
                }
            }
        }
        return z ? b(iOException) : iOException;
    }

    public final Socket h() {
        k kVar = this.f1568h;
        kotlin.jvm.internal.i.b(kVar);
        byte[] bArr = H3.b.f1103a;
        ArrayList arrayList = kVar.f1587p;
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
            if (kotlin.jvm.internal.i.a(((Reference) obj).get(), this)) {
                break;
            }
            i4++;
        }
        if (i4 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i4);
        this.f1568h = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        kVar.f1588q = System.nanoTime();
        l lVar = this.f1563c;
        ConcurrentLinkedQueue concurrentLinkedQueue = lVar.f1592d;
        J3.c cVar = lVar.f1590b;
        byte[] bArr2 = H3.b.f1103a;
        if (!kVar.f1583j) {
            cVar.c(lVar.f1591c, 0L);
            return null;
        }
        kVar.f1583j = true;
        concurrentLinkedQueue.remove(kVar);
        if (concurrentLinkedQueue.isEmpty()) {
            cVar.a();
        }
        Socket socket = kVar.f1577d;
        kotlin.jvm.internal.i.b(socket);
        return socket;
    }
}
