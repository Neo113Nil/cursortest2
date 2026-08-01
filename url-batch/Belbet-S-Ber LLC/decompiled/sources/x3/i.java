package x3;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import t3.o;
import t3.q;
import t3.s;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class i implements Cloneable {

    /* renamed from: f, reason: collision with root package name */
    public final o f3913f;

    /* renamed from: g, reason: collision with root package name */
    public final q f3914g;
    public final m h;
    public final h i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f3915j;

    /* renamed from: k, reason: collision with root package name */
    public Object f3916k;

    /* renamed from: l, reason: collision with root package name */
    public e f3917l;

    /* renamed from: m, reason: collision with root package name */
    public l f3918m;

    /* renamed from: n, reason: collision with root package name */
    public d f3919n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3920o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3921p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3922q;

    /* renamed from: r, reason: collision with root package name */
    public volatile boolean f3923r;

    /* renamed from: s, reason: collision with root package name */
    public volatile d f3924s;

    /* renamed from: t, reason: collision with root package name */
    public volatile l f3925t;

    public i(o oVar, q qVar) {
        this.f3913f = oVar;
        this.f3914g = qVar;
        this.h = (m) oVar.f3482g.f3172a;
        oVar.f3483j.getClass();
        h hVar = new h(this);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        hVar.g(0);
        this.i = hVar;
        this.f3915j = new AtomicBoolean();
        this.f3922q = true;
    }

    public static final String a(i iVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(iVar.f3923r ? "canceled " : "");
        sb.append("call");
        sb.append(" to ");
        sb.append(iVar.f3914g.f3506a.f());
        return sb.toString();
    }

    public final void b(l lVar) {
        byte[] bArr = u3.b.f3581a;
        if (this.f3918m != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.f3918m = lVar;
        lVar.f3940p.add(new g(this, this.f3916k));
    }

    public final IOException c(IOException iOException) {
        IOException interruptedIOException;
        Socket i;
        byte[] bArr = u3.b.f3581a;
        l lVar = this.f3918m;
        if (lVar != null) {
            synchronized (lVar) {
                i = i();
            }
            if (this.f3918m == null) {
                if (i != null) {
                    u3.b.c(i);
                }
            } else if (i != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (this.i.i()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException != null) {
            i3.d.b(interruptedIOException);
        }
        return interruptedIOException;
    }

    public final Object clone() {
        return new i(this.f3913f, this.f3914g);
    }

    public final void d() {
        Socket socket;
        if (this.f3923r) {
            return;
        }
        this.f3923r = true;
        d dVar = this.f3924s;
        if (dVar != null) {
            dVar.f3901c.cancel();
        }
        l lVar = this.f3925t;
        if (lVar == null || (socket = lVar.f3930c) == null) {
            return;
        }
        u3.b.c(socket);
    }

    public final void e(boolean z4) {
        d dVar;
        synchronized (this) {
            if (!this.f3922q) {
                throw new IllegalStateException("released");
            }
        }
        if (z4 && (dVar = this.f3924s) != null) {
            dVar.f3901c.cancel();
            dVar.f3899a.g(dVar, true, true, null);
        }
        this.f3919n = null;
    }

    public final s f() {
        ArrayList arrayList = new ArrayList();
        x2.n.D(arrayList, this.f3913f.h);
        arrayList.add(new y3.a(this.f3913f));
        arrayList.add(new y3.a(this.f3913f.f3488o));
        arrayList.add(new v3.b());
        arrayList.add(a.f3890a);
        x2.n.D(arrayList, this.f3913f.i);
        arrayList.add(new y3.b());
        q qVar = this.f3914g;
        o oVar = this.f3913f;
        try {
            try {
                s b2 = new y3.f(this, arrayList, 0, null, qVar, oVar.A, oVar.B, oVar.C).b(qVar);
                if (this.f3923r) {
                    u3.b.b(b2);
                    throw new IOException("Canceled");
                }
                h(null);
                return b2;
            } catch (IOException e4) {
                IOException h = h(e4);
                i3.d.c(h, "null cannot be cast to non-null type kotlin.Throwable");
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
    public final IOException g(d dVar, boolean z4, boolean z5, IOException iOException) {
        boolean z6;
        boolean z7;
        boolean z8;
        i3.d.e(dVar, "exchange");
        if (dVar.equals(this.f3924s)) {
            synchronized (this) {
                z6 = false;
                if (z4) {
                    try {
                        if (!this.f3920o) {
                        }
                        if (z4) {
                            this.f3920o = false;
                        }
                        if (z5) {
                            this.f3921p = false;
                        }
                        z8 = this.f3920o;
                        boolean z9 = z8 && !this.f3921p;
                        if (!z8 && !this.f3921p) {
                            if (!this.f3922q) {
                                z6 = true;
                            }
                        }
                        z7 = z6;
                        z6 = z9;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (!z5 || !this.f3921p) {
                    z7 = false;
                }
                if (z4) {
                }
                if (z5) {
                }
                z8 = this.f3920o;
                if (z8) {
                }
                if (!z8) {
                    if (!this.f3922q) {
                    }
                }
                z7 = z6;
                z6 = z9;
            }
            if (z6) {
                this.f3924s = null;
                l lVar = this.f3918m;
                if (lVar != null) {
                    synchronized (lVar) {
                        lVar.f3937m++;
                    }
                }
            }
            if (z7) {
                return c(iOException);
            }
        }
        return iOException;
    }

    public final IOException h(IOException iOException) {
        boolean z4;
        synchronized (this) {
            z4 = false;
            if (this.f3922q) {
                this.f3922q = false;
                if (!this.f3920o) {
                    if (!this.f3921p) {
                        z4 = true;
                    }
                }
            }
        }
        return z4 ? c(iOException) : iOException;
    }

    public final Socket i() {
        l lVar = this.f3918m;
        i3.d.b(lVar);
        byte[] bArr = u3.b.f3581a;
        ArrayList arrayList = lVar.f3940p;
        int size = arrayList.size();
        int i = 0;
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i = -1;
                break;
            }
            Object obj = arrayList.get(i4);
            i4++;
            if (i3.d.a(((Reference) obj).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i);
        this.f3918m = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        lVar.f3941q = System.nanoTime();
        m mVar = this.h;
        ConcurrentLinkedQueue concurrentLinkedQueue = mVar.d;
        w3.b bVar = mVar.f3943b;
        byte[] bArr2 = u3.b.f3581a;
        if (!lVar.f3934j) {
            bVar.c(mVar.f3944c, 0L);
            return null;
        }
        lVar.f3934j = true;
        concurrentLinkedQueue.remove(lVar);
        if (concurrentLinkedQueue.isEmpty()) {
            bVar.a();
        }
        Socket socket = lVar.d;
        i3.d.b(socket);
        return socket;
    }
}
