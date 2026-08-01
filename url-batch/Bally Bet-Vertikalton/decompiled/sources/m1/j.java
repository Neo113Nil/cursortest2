package m1;

import i1.t;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class j implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final i1.o f3212a;

    /* renamed from: b, reason: collision with root package name */
    public final H.e f3213b;

    /* renamed from: c, reason: collision with root package name */
    public final n f3214c;
    public final i d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f3215e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3216f;

    /* renamed from: g, reason: collision with root package name */
    public f f3217g;
    public m h;
    public e i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3218j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3219k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3220l;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f3221m;

    /* renamed from: n, reason: collision with root package name */
    public volatile e f3222n;

    /* renamed from: o, reason: collision with root package name */
    public volatile m f3223o;

    public j(i1.o oVar, H.e eVar) {
        this.f3212a = oVar;
        this.f3213b = eVar;
        this.f3214c = (n) oVar.f2464b.f59b;
        oVar.f2466e.getClass();
        i iVar = new i(this);
        iVar.g(0, TimeUnit.MILLISECONDS);
        this.d = iVar;
        this.f3215e = new AtomicBoolean();
        this.f3220l = true;
    }

    public static final String a(j jVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(jVar.f3221m ? "canceled " : "");
        sb.append("call");
        sb.append(" to ");
        sb.append(((i1.m) jVar.f3213b.f213c).f());
        return sb.toString();
    }

    public final void b(m mVar) {
        byte[] bArr = j1.b.f2587a;
        if (this.h != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.h = mVar;
        mVar.f3238p.add(new h(this, this.f3216f));
    }

    public final IOException c(IOException iOException) {
        IOException interruptedIOException;
        Socket i;
        byte[] bArr = j1.b.f2587a;
        m mVar = this.h;
        if (mVar != null) {
            synchronized (mVar) {
                i = i();
            }
            if (this.h == null) {
                if (i != null) {
                    j1.b.c(i);
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
            X0.d.b(interruptedIOException);
        }
        return interruptedIOException;
    }

    public final Object clone() {
        return new j(this.f3212a, this.f3213b);
    }

    public final void d() {
        Socket socket;
        if (this.f3221m) {
            return;
        }
        this.f3221m = true;
        e eVar = this.f3222n;
        if (eVar != null) {
            eVar.f3199c.cancel();
        }
        m mVar = this.f3223o;
        if (mVar == null || (socket = mVar.f3228c) == null) {
            return;
        }
        j1.b.c(socket);
    }

    public final void e(boolean z2) {
        e eVar;
        synchronized (this) {
            if (!this.f3220l) {
                throw new IllegalStateException("released");
            }
        }
        if (z2 && (eVar = this.f3222n) != null) {
            eVar.f3199c.cancel();
            eVar.f3197a.g(eVar, true, true, null);
        }
        this.i = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final t f() {
        ArrayList arrayList = new ArrayList();
        Q0.n.x0(arrayList, this.f3212a.f2465c);
        arrayList.add(new n1.a(this.f3212a));
        arrayList.add(new n1.a(this.f3212a.f2469j));
        arrayList.add(new k1.b());
        arrayList.add(a.f3182a);
        Q0.n.x0(arrayList, this.f3212a.d);
        arrayList.add(new n1.b());
        H.e eVar = this.f3213b;
        i1.o oVar = this.f3212a;
        boolean z2 = false;
        try {
            t b2 = new n1.f(this, arrayList, 0, null, eVar, oVar.f2481v, oVar.f2482w, oVar.f2483x).b(this.f3213b);
            if (this.f3221m) {
                j1.b.b(b2);
                throw new IOException("Canceled");
            }
            h(null);
            return b2;
        } catch (IOException e2) {
            try {
                IOException h = h(e2);
                X0.d.c(h, "null cannot be cast to non-null type kotlin.Throwable");
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
        X0.d.e(eVar, "exchange");
        if (!eVar.equals(this.f3222n)) {
            return iOException;
        }
        synchronized (this) {
            z4 = false;
            if (z2) {
                try {
                    if (!this.f3218j) {
                    }
                    if (z2) {
                        this.f3218j = false;
                    }
                    if (z3) {
                        this.f3219k = false;
                    }
                    z6 = this.f3218j;
                    boolean z7 = z6 && !this.f3219k;
                    if (!z6 && !this.f3219k) {
                        if (!this.f3220l) {
                            z4 = true;
                        }
                    }
                    z5 = z4;
                    z4 = z7;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!z3 || !this.f3219k) {
                z5 = false;
            }
            if (z2) {
            }
            if (z3) {
            }
            z6 = this.f3218j;
            if (z6) {
            }
            if (!z6) {
                if (!this.f3220l) {
                }
            }
            z5 = z4;
            z4 = z7;
        }
        if (z4) {
            this.f3222n = null;
            m mVar = this.h;
            if (mVar != null) {
                synchronized (mVar) {
                    mVar.f3235m++;
                }
            }
        }
        return z5 ? c(iOException) : iOException;
    }

    public final IOException h(IOException iOException) {
        boolean z2;
        synchronized (this) {
            z2 = false;
            if (this.f3220l) {
                this.f3220l = false;
                if (!this.f3218j) {
                    if (!this.f3219k) {
                        z2 = true;
                    }
                }
            }
        }
        return z2 ? c(iOException) : iOException;
    }

    public final Socket i() {
        m mVar = this.h;
        X0.d.b(mVar);
        byte[] bArr = j1.b.f2587a;
        ArrayList arrayList = mVar.f3238p;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (X0.d.a(((Reference) it.next()).get(), this)) {
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
            mVar.f3239q = System.nanoTime();
            n nVar = this.f3214c;
            nVar.getClass();
            byte[] bArr2 = j1.b.f2587a;
            boolean z2 = mVar.f3232j;
            l1.c cVar = nVar.f3241b;
            if (z2) {
                mVar.f3232j = true;
                ConcurrentLinkedQueue concurrentLinkedQueue = nVar.d;
                concurrentLinkedQueue.remove(mVar);
                if (concurrentLinkedQueue.isEmpty()) {
                    cVar.a();
                }
                Socket socket = mVar.d;
                X0.d.b(socket);
                return socket;
            }
            cVar.c(nVar.f3242c, 0L);
        }
        return null;
    }
}
