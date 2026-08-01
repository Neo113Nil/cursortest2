package t1;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p1.q;
import p1.t;

/* loaded from: classes.dex */
public final class j implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final q f3759a;

    /* renamed from: b, reason: collision with root package name */
    public final H.e f3760b;

    /* renamed from: c, reason: collision with root package name */
    public final n f3761c;
    public final i d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f3762e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3763f;

    /* renamed from: g, reason: collision with root package name */
    public f f3764g;
    public m h;
    public e i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3765j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3766k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3767l;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f3768m;

    /* renamed from: n, reason: collision with root package name */
    public volatile e f3769n;

    /* renamed from: o, reason: collision with root package name */
    public volatile m f3770o;

    public j(q qVar, H.e eVar) {
        this.f3759a = qVar;
        this.f3760b = eVar;
        this.f3761c = (n) qVar.f3392b.f3336a;
        qVar.f3394e.getClass();
        i iVar = new i(this);
        iVar.g(0, TimeUnit.MILLISECONDS);
        this.d = iVar;
        this.f3762e = new AtomicBoolean();
        this.f3767l = true;
    }

    public static final String a(j jVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(jVar.f3768m ? "canceled " : "");
        sb.append("call");
        sb.append(" to ");
        sb.append(((p1.m) jVar.f3760b.f259c).f());
        return sb.toString();
    }

    public final void b(m mVar) {
        byte[] bArr = q1.b.f3491a;
        if (this.h != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.h = mVar;
        mVar.f3785p.add(new h(this, this.f3763f));
    }

    public final IOException c(IOException iOException) {
        IOException interruptedIOException;
        Socket i;
        byte[] bArr = q1.b.f3491a;
        m mVar = this.h;
        if (mVar != null) {
            synchronized (mVar) {
                i = i();
            }
            if (this.h == null) {
                if (i != null) {
                    q1.b.c(i);
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
            e1.d.b(interruptedIOException);
        }
        return interruptedIOException;
    }

    public final Object clone() {
        return new j(this.f3759a, this.f3760b);
    }

    public final void d() {
        Socket socket;
        if (this.f3768m) {
            return;
        }
        this.f3768m = true;
        e eVar = this.f3769n;
        if (eVar != null) {
            eVar.f3746c.cancel();
        }
        m mVar = this.f3770o;
        if (mVar == null || (socket = mVar.f3775c) == null) {
            return;
        }
        q1.b.c(socket);
    }

    public final void e(boolean z2) {
        e eVar;
        synchronized (this) {
            if (!this.f3767l) {
                throw new IllegalStateException("released");
            }
        }
        if (z2 && (eVar = this.f3769n) != null) {
            eVar.f3746c.cancel();
            eVar.f3744a.g(eVar, true, true, null);
        }
        this.i = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final t f() {
        ArrayList arrayList = new ArrayList();
        W0.n.n0(arrayList, this.f3759a.f3393c);
        arrayList.add(new u1.a(this.f3759a));
        arrayList.add(new u1.a(this.f3759a.f3397j));
        arrayList.add(new r1.b());
        arrayList.add(a.f3729a);
        W0.n.n0(arrayList, this.f3759a.d);
        arrayList.add(new u1.b());
        H.e eVar = this.f3760b;
        q qVar = this.f3759a;
        boolean z2 = false;
        try {
            t b2 = new u1.f(this, arrayList, 0, null, eVar, qVar.f3409v, qVar.f3410w, qVar.f3411x).b(this.f3760b);
            if (this.f3768m) {
                q1.b.b(b2);
                throw new IOException("Canceled");
            }
            h(null);
            return b2;
        } catch (IOException e2) {
            try {
                IOException h = h(e2);
                e1.d.c(h, "null cannot be cast to non-null type kotlin.Throwable");
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
        e1.d.e(eVar, "exchange");
        if (!eVar.equals(this.f3769n)) {
            return iOException;
        }
        synchronized (this) {
            z4 = false;
            if (z2) {
                try {
                    if (!this.f3765j) {
                    }
                    if (z2) {
                        this.f3765j = false;
                    }
                    if (z3) {
                        this.f3766k = false;
                    }
                    z6 = this.f3765j;
                    boolean z7 = z6 && !this.f3766k;
                    if (!z6 && !this.f3766k) {
                        if (!this.f3767l) {
                            z4 = true;
                        }
                    }
                    z5 = z4;
                    z4 = z7;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!z3 || !this.f3766k) {
                z5 = false;
            }
            if (z2) {
            }
            if (z3) {
            }
            z6 = this.f3765j;
            if (z6) {
            }
            if (!z6) {
                if (!this.f3767l) {
                }
            }
            z5 = z4;
            z4 = z7;
        }
        if (z4) {
            this.f3769n = null;
            m mVar = this.h;
            if (mVar != null) {
                synchronized (mVar) {
                    mVar.f3782m++;
                }
            }
        }
        return z5 ? c(iOException) : iOException;
    }

    public final IOException h(IOException iOException) {
        boolean z2;
        synchronized (this) {
            z2 = false;
            if (this.f3767l) {
                this.f3767l = false;
                if (!this.f3765j) {
                    if (!this.f3766k) {
                        z2 = true;
                    }
                }
            }
        }
        return z2 ? c(iOException) : iOException;
    }

    public final Socket i() {
        m mVar = this.h;
        e1.d.b(mVar);
        byte[] bArr = q1.b.f3491a;
        ArrayList arrayList = mVar.f3785p;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (e1.d.a(((Reference) it.next()).get(), this)) {
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
            mVar.f3786q = System.nanoTime();
            n nVar = this.f3761c;
            nVar.getClass();
            byte[] bArr2 = q1.b.f3491a;
            boolean z2 = mVar.f3779j;
            s1.c cVar = nVar.f3788b;
            if (z2) {
                mVar.f3779j = true;
                ConcurrentLinkedQueue concurrentLinkedQueue = nVar.d;
                concurrentLinkedQueue.remove(mVar);
                if (concurrentLinkedQueue.isEmpty()) {
                    cVar.a();
                }
                Socket socket = mVar.d;
                e1.d.b(socket);
                return socket;
            }
            cVar.c(nVar.f3789c, 0L);
        }
        return null;
    }
}
