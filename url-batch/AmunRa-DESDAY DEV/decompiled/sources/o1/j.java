package o1;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import k1.r;
import k1.u;

/* loaded from: classes.dex */
public final class j implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final r f3392a;

    /* renamed from: b, reason: collision with root package name */
    public final H.e f3393b;

    /* renamed from: c, reason: collision with root package name */
    public final n f3394c;
    public final i d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f3395e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3396f;

    /* renamed from: g, reason: collision with root package name */
    public f f3397g;
    public m h;
    public e i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3398j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3399k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3400l;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f3401m;

    /* renamed from: n, reason: collision with root package name */
    public volatile e f3402n;

    /* renamed from: o, reason: collision with root package name */
    public volatile m f3403o;

    public j(r rVar, H.e eVar) {
        this.f3392a = rVar;
        this.f3393b = eVar;
        this.f3394c = (n) rVar.f2860b.f64b;
        rVar.f2862e.getClass();
        i iVar = new i(this);
        iVar.g(0, TimeUnit.MILLISECONDS);
        this.d = iVar;
        this.f3395e = new AtomicBoolean();
        this.f3400l = true;
    }

    public static final String a(j jVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(jVar.f3401m ? "canceled " : "");
        sb.append("call");
        sb.append(" to ");
        sb.append(((k1.n) jVar.f3393b.f199c).f());
        return sb.toString();
    }

    public final void b(m mVar) {
        byte[] bArr = l1.b.f3252a;
        if (this.h != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.h = mVar;
        mVar.f3418p.add(new h(this, this.f3396f));
    }

    public final IOException c(IOException iOException) {
        IOException interruptedIOException;
        Socket i;
        byte[] bArr = l1.b.f3252a;
        m mVar = this.h;
        if (mVar != null) {
            synchronized (mVar) {
                i = i();
            }
            if (this.h == null) {
                if (i != null) {
                    l1.b.c(i);
                }
            } else if (i != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (this.d.i()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException != null) {
            Z0.d.b(interruptedIOException);
        }
        return interruptedIOException;
    }

    public final Object clone() {
        return new j(this.f3392a, this.f3393b);
    }

    public final void d() {
        Socket socket;
        if (this.f3401m) {
            return;
        }
        this.f3401m = true;
        e eVar = this.f3402n;
        if (eVar != null) {
            eVar.f3379c.cancel();
        }
        m mVar = this.f3403o;
        if (mVar == null || (socket = mVar.f3408c) == null) {
            return;
        }
        l1.b.c(socket);
    }

    public final void e(boolean z2) {
        e eVar;
        synchronized (this) {
            if (!this.f3400l) {
                throw new IllegalStateException("released");
            }
        }
        if (z2 && (eVar = this.f3402n) != null) {
            eVar.f3379c.cancel();
            eVar.f3377a.g(eVar, true, true, null);
        }
        this.i = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final u f() {
        ArrayList arrayList = new ArrayList();
        R0.n.n0(arrayList, this.f3392a.f2861c);
        arrayList.add(new p1.a(this.f3392a));
        arrayList.add(new p1.a(this.f3392a.f2865j));
        arrayList.add(new m1.b());
        arrayList.add(a.f3362a);
        R0.n.n0(arrayList, this.f3392a.d);
        arrayList.add(new p1.b());
        H.e eVar = this.f3393b;
        r rVar = this.f3392a;
        boolean z2 = false;
        try {
            u b2 = new p1.f(this, arrayList, 0, null, eVar, rVar.f2877v, rVar.f2878w, rVar.f2879x).b(this.f3393b);
            if (this.f3401m) {
                l1.b.b(b2);
                throw new IOException("Canceled");
            }
            h(null);
            return b2;
        } catch (IOException e2) {
            try {
                IOException h = h(e2);
                Z0.d.c(h, "null cannot be cast to non-null type kotlin.Throwable");
                throw h;
            } catch (Throwable th) {
                th = th;
                z2 = true;
                if (!z2) {
                    h(null);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (!z2) {
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
    public final IOException g(e eVar, boolean z2, boolean z3, IOException iOException) {
        boolean z4;
        boolean z5;
        boolean z6;
        Z0.d.e(eVar, "exchange");
        if (!eVar.equals(this.f3402n)) {
            return iOException;
        }
        synchronized (this) {
            z4 = false;
            if (z2) {
                try {
                    if (!this.f3398j) {
                    }
                    if (z2) {
                        this.f3398j = false;
                    }
                    if (z3) {
                        this.f3399k = false;
                    }
                    z6 = this.f3398j;
                    boolean z7 = z6 && !this.f3399k;
                    if (!z6 && !this.f3399k) {
                        if (!this.f3400l) {
                            z4 = true;
                        }
                    }
                    z5 = z4;
                    z4 = z7;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!z3 || !this.f3399k) {
                z5 = false;
            }
            if (z2) {
            }
            if (z3) {
            }
            z6 = this.f3398j;
            if (z6) {
            }
            if (!z6) {
                if (!this.f3400l) {
                }
            }
            z5 = z4;
            z4 = z7;
        }
        if (z4) {
            this.f3402n = null;
            m mVar = this.h;
            if (mVar != null) {
                synchronized (mVar) {
                    mVar.f3415m++;
                }
            }
        }
        return z5 ? c(iOException) : iOException;
    }

    public final IOException h(IOException iOException) {
        boolean z2;
        synchronized (this) {
            z2 = false;
            if (this.f3400l) {
                this.f3400l = false;
                if (!this.f3398j) {
                    if (!this.f3399k) {
                        z2 = true;
                    }
                }
            }
        }
        return z2 ? c(iOException) : iOException;
    }

    public final Socket i() {
        m mVar = this.h;
        Z0.d.b(mVar);
        byte[] bArr = l1.b.f3252a;
        ArrayList arrayList = mVar.f3418p;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (Z0.d.a(((Reference) it.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i);
        this.h = null;
        if (arrayList.isEmpty()) {
            mVar.f3419q = System.nanoTime();
            n nVar = this.f3394c;
            nVar.getClass();
            byte[] bArr2 = l1.b.f3252a;
            boolean z2 = mVar.f3412j;
            n1.c cVar = nVar.f3421b;
            if (z2) {
                mVar.f3412j = true;
                ConcurrentLinkedQueue concurrentLinkedQueue = nVar.d;
                concurrentLinkedQueue.remove(mVar);
                if (concurrentLinkedQueue.isEmpty()) {
                    cVar.a();
                }
                Socket socket = mVar.d;
                Z0.d.b(socket);
                return socket;
            }
            cVar.c(nVar.f3422c, 0L);
        }
        return null;
    }
}
