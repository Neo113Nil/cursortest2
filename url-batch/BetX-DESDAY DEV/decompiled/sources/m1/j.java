package m1;

import i1.u;
import i1.w;
import i1.y;
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
public final class j implements i1.d {

    /* renamed from: a, reason: collision with root package name */
    public final u f3573a;

    /* renamed from: b, reason: collision with root package name */
    public final w f3574b;

    /* renamed from: c, reason: collision with root package name */
    public final n f3575c;

    /* renamed from: d, reason: collision with root package name */
    public final i f3576d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f3577e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3578f;

    /* renamed from: g, reason: collision with root package name */
    public f f3579g;
    public m h;
    public e i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3580j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3581k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3582l;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f3583m;

    /* renamed from: n, reason: collision with root package name */
    public volatile e f3584n;

    /* renamed from: o, reason: collision with root package name */
    public volatile m f3585o;

    public j(u uVar, w wVar) {
        this.f3573a = uVar;
        this.f3574b = wVar;
        this.f3575c = (n) uVar.f2751b.f66b;
        uVar.f2754e.getClass();
        i iVar = new i(this);
        iVar.g(0, TimeUnit.MILLISECONDS);
        this.f3576d = iVar;
        this.f3577e = new AtomicBoolean();
        this.f3582l = true;
    }

    public static final String a(j jVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(jVar.f3583m ? "canceled " : "");
        sb.append("call");
        sb.append(" to ");
        sb.append(jVar.f3574b.f2780a.f());
        return sb.toString();
    }

    public final void b(m mVar) {
        byte[] bArr = j1.b.f2971a;
        if (this.h != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.h = mVar;
        mVar.f3602p.add(new h(this, this.f3578f));
    }

    public final IOException c(IOException iOException) {
        IOException interruptedIOException;
        Socket i;
        byte[] bArr = j1.b.f2971a;
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
        if (this.f3576d.i()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException != null) {
            X0.f.b(interruptedIOException);
        }
        return interruptedIOException;
    }

    public final Object clone() {
        return new j(this.f3573a, this.f3574b);
    }

    public final void d() {
        Socket socket;
        if (this.f3583m) {
            return;
        }
        this.f3583m = true;
        e eVar = this.f3584n;
        if (eVar != null) {
            eVar.f3558c.cancel();
        }
        m mVar = this.f3585o;
        if (mVar == null || (socket = mVar.f3591c) == null) {
            return;
        }
        j1.b.c(socket);
    }

    public final void e(boolean z2) {
        e eVar;
        synchronized (this) {
            if (!this.f3582l) {
                throw new IllegalStateException("released");
            }
        }
        if (z2 && (eVar = this.f3584n) != null) {
            eVar.f3558c.cancel();
            eVar.f3556a.g(eVar, true, true, null);
        }
        this.i = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final y f() {
        ArrayList arrayList = new ArrayList();
        O0.n.d0(arrayList, this.f3573a.f2752c);
        arrayList.add(new n1.a(this.f3573a));
        arrayList.add(new n1.a(this.f3573a.f2757j));
        arrayList.add(new k1.b());
        arrayList.add(a.f3538a);
        O0.n.d0(arrayList, this.f3573a.f2753d);
        arrayList.add(new n1.b());
        w wVar = this.f3574b;
        u uVar = this.f3573a;
        boolean z2 = false;
        try {
            y b2 = new n1.f(this, arrayList, 0, null, wVar, uVar.f2769v, uVar.f2770w, uVar.f2771x).b(this.f3574b);
            if (this.f3583m) {
                j1.b.b(b2);
                throw new IOException("Canceled");
            }
            h(null);
            return b2;
        } catch (IOException e2) {
            try {
                IOException h = h(e2);
                X0.f.c(h, "null cannot be cast to non-null type kotlin.Throwable");
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
        X0.f.e(eVar, "exchange");
        if (!eVar.equals(this.f3584n)) {
            return iOException;
        }
        synchronized (this) {
            z4 = false;
            if (z2) {
                try {
                    if (!this.f3580j) {
                    }
                    if (z2) {
                        this.f3580j = false;
                    }
                    if (z3) {
                        this.f3581k = false;
                    }
                    z6 = this.f3580j;
                    boolean z7 = z6 && !this.f3581k;
                    if (!z6 && !this.f3581k) {
                        if (!this.f3582l) {
                            z4 = true;
                        }
                    }
                    z5 = z4;
                    z4 = z7;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!z3 || !this.f3581k) {
                z5 = false;
            }
            if (z2) {
            }
            if (z3) {
            }
            z6 = this.f3580j;
            if (z6) {
            }
            if (!z6) {
                if (!this.f3582l) {
                }
            }
            z5 = z4;
            z4 = z7;
        }
        if (z4) {
            this.f3584n = null;
            m mVar = this.h;
            if (mVar != null) {
                synchronized (mVar) {
                    mVar.f3599m++;
                }
            }
        }
        return z5 ? c(iOException) : iOException;
    }

    public final IOException h(IOException iOException) {
        boolean z2;
        synchronized (this) {
            z2 = false;
            if (this.f3582l) {
                this.f3582l = false;
                if (!this.f3580j) {
                    if (!this.f3581k) {
                        z2 = true;
                    }
                }
            }
        }
        return z2 ? c(iOException) : iOException;
    }

    public final Socket i() {
        m mVar = this.h;
        X0.f.b(mVar);
        byte[] bArr = j1.b.f2971a;
        ArrayList arrayList = mVar.f3602p;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (X0.f.a(((Reference) it.next()).get(), this)) {
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
            mVar.f3603q = System.nanoTime();
            n nVar = this.f3575c;
            nVar.getClass();
            byte[] bArr2 = j1.b.f2971a;
            boolean z2 = mVar.f3596j;
            l1.c cVar = nVar.f3605b;
            if (z2) {
                mVar.f3596j = true;
                ConcurrentLinkedQueue concurrentLinkedQueue = nVar.f3607d;
                concurrentLinkedQueue.remove(mVar);
                if (concurrentLinkedQueue.isEmpty()) {
                    cVar.a();
                }
                Socket socket = mVar.f3592d;
                X0.f.b(socket);
                return socket;
            }
            cVar.c(nVar.f3606c, 0L);
        }
        return null;
    }
}
