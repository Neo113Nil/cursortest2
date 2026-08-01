package q1;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import m1.q;
import m1.t;

/* loaded from: classes.dex */
public final class j implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final q f3526a;

    /* renamed from: b, reason: collision with root package name */
    public final H.e f3527b;

    /* renamed from: c, reason: collision with root package name */
    public final n f3528c;
    public final i d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f3529e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3530f;

    /* renamed from: g, reason: collision with root package name */
    public f f3531g;
    public m h;
    public e i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3532j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3533k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3534l;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f3535m;

    /* renamed from: n, reason: collision with root package name */
    public volatile e f3536n;

    /* renamed from: o, reason: collision with root package name */
    public volatile m f3537o;

    public j(q qVar, H.e eVar) {
        this.f3526a = qVar;
        this.f3527b = eVar;
        this.f3528c = (n) qVar.f3245b.f3189a;
        qVar.f3247e.getClass();
        i iVar = new i(this);
        iVar.g(0, TimeUnit.MILLISECONDS);
        this.d = iVar;
        this.f3529e = new AtomicBoolean();
        this.f3534l = true;
    }

    public static final String a(j jVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(jVar.f3535m ? "canceled " : "");
        sb.append("call");
        sb.append(" to ");
        sb.append(((m1.m) jVar.f3527b.f275c).f());
        return sb.toString();
    }

    public final void b(m mVar) {
        byte[] bArr = n1.b.f3319a;
        if (this.h != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.h = mVar;
        mVar.f3552p.add(new h(this, this.f3530f));
    }

    public final IOException c(IOException iOException) {
        IOException interruptedIOException;
        Socket i;
        byte[] bArr = n1.b.f3319a;
        m mVar = this.h;
        if (mVar != null) {
            synchronized (mVar) {
                i = i();
            }
            if (this.h == null) {
                if (i != null) {
                    n1.b.c(i);
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
            b1.d.b(interruptedIOException);
        }
        return interruptedIOException;
    }

    public final Object clone() {
        return new j(this.f3526a, this.f3527b);
    }

    public final void d() {
        Socket socket;
        if (this.f3535m) {
            return;
        }
        this.f3535m = true;
        e eVar = this.f3536n;
        if (eVar != null) {
            eVar.f3513c.cancel();
        }
        m mVar = this.f3537o;
        if (mVar == null || (socket = mVar.f3542c) == null) {
            return;
        }
        n1.b.c(socket);
    }

    public final void e(boolean z2) {
        e eVar;
        synchronized (this) {
            if (!this.f3534l) {
                throw new IllegalStateException("released");
            }
        }
        if (z2 && (eVar = this.f3536n) != null) {
            eVar.f3513c.cancel();
            eVar.f3511a.g(eVar, true, true, null);
        }
        this.i = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final t f() {
        ArrayList arrayList = new ArrayList();
        T0.n.m0(arrayList, this.f3526a.f3246c);
        arrayList.add(new r1.a(this.f3526a));
        arrayList.add(new r1.a(this.f3526a.f3250j));
        arrayList.add(new o1.b());
        arrayList.add(a.f3496a);
        T0.n.m0(arrayList, this.f3526a.d);
        arrayList.add(new r1.b());
        H.e eVar = this.f3527b;
        q qVar = this.f3526a;
        boolean z2 = false;
        try {
            t b2 = new r1.f(this, arrayList, 0, null, eVar, qVar.f3262v, qVar.f3263w, qVar.f3264x).b(this.f3527b);
            if (this.f3535m) {
                n1.b.b(b2);
                throw new IOException("Canceled");
            }
            h(null);
            return b2;
        } catch (IOException e2) {
            try {
                IOException h = h(e2);
                b1.d.c(h, "null cannot be cast to non-null type kotlin.Throwable");
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
        b1.d.e(eVar, "exchange");
        if (!eVar.equals(this.f3536n)) {
            return iOException;
        }
        synchronized (this) {
            z4 = false;
            if (z2) {
                try {
                    if (!this.f3532j) {
                    }
                    if (z2) {
                        this.f3532j = false;
                    }
                    if (z3) {
                        this.f3533k = false;
                    }
                    z6 = this.f3532j;
                    boolean z7 = z6 && !this.f3533k;
                    if (!z6 && !this.f3533k) {
                        if (!this.f3534l) {
                            z4 = true;
                        }
                    }
                    z5 = z4;
                    z4 = z7;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!z3 || !this.f3533k) {
                z5 = false;
            }
            if (z2) {
            }
            if (z3) {
            }
            z6 = this.f3532j;
            if (z6) {
            }
            if (!z6) {
                if (!this.f3534l) {
                }
            }
            z5 = z4;
            z4 = z7;
        }
        if (z4) {
            this.f3536n = null;
            m mVar = this.h;
            if (mVar != null) {
                synchronized (mVar) {
                    mVar.f3549m++;
                }
            }
        }
        return z5 ? c(iOException) : iOException;
    }

    public final IOException h(IOException iOException) {
        boolean z2;
        synchronized (this) {
            z2 = false;
            if (this.f3534l) {
                this.f3534l = false;
                if (!this.f3532j) {
                    if (!this.f3533k) {
                        z2 = true;
                    }
                }
            }
        }
        return z2 ? c(iOException) : iOException;
    }

    public final Socket i() {
        m mVar = this.h;
        b1.d.b(mVar);
        byte[] bArr = n1.b.f3319a;
        ArrayList arrayList = mVar.f3552p;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (b1.d.a(((Reference) it.next()).get(), this)) {
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
            mVar.f3553q = System.nanoTime();
            n nVar = this.f3528c;
            nVar.getClass();
            byte[] bArr2 = n1.b.f3319a;
            boolean z2 = mVar.f3546j;
            p1.c cVar = nVar.f3555b;
            if (z2) {
                mVar.f3546j = true;
                ConcurrentLinkedQueue concurrentLinkedQueue = nVar.d;
                concurrentLinkedQueue.remove(mVar);
                if (concurrentLinkedQueue.isEmpty()) {
                    cVar.a();
                }
                Socket socket = mVar.d;
                b1.d.b(socket);
                return socket;
            }
            cVar.c(nVar.f3556c, 0L);
        }
        return null;
    }
}
