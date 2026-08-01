package v1;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import r1.r;

/* loaded from: classes.dex */
public final class j implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final r1.o f3876a;

    /* renamed from: b, reason: collision with root package name */
    public final J.d f3877b;

    /* renamed from: c, reason: collision with root package name */
    public final n f3878c;
    public final i d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f3879e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3880f;

    /* renamed from: g, reason: collision with root package name */
    public f f3881g;
    public m h;
    public e i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3882j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3883k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3884l;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f3885m;

    /* renamed from: n, reason: collision with root package name */
    public volatile e f3886n;

    /* renamed from: o, reason: collision with root package name */
    public volatile m f3887o;

    public j(r1.o oVar, J.d dVar) {
        this.f3876a = oVar;
        this.f3877b = dVar;
        this.f3878c = (n) oVar.f3508b.f2962a;
        oVar.f3510e.getClass();
        i iVar = new i(this);
        iVar.g(0, TimeUnit.MILLISECONDS);
        this.d = iVar;
        this.f3879e = new AtomicBoolean();
        this.f3884l = true;
    }

    public static final String a(j jVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(jVar.f3885m ? "canceled " : "");
        sb.append("call");
        sb.append(" to ");
        sb.append(((r1.l) jVar.f3877b.f359c).f());
        return sb.toString();
    }

    public final void b(m mVar) {
        byte[] bArr = s1.b.f3607a;
        if (this.h != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.h = mVar;
        mVar.f3902p.add(new h(this, this.f3880f));
    }

    public final IOException c(IOException iOException) {
        IOException interruptedIOException;
        Socket i;
        byte[] bArr = s1.b.f3607a;
        m mVar = this.h;
        if (mVar != null) {
            synchronized (mVar) {
                i = i();
            }
            if (this.h == null) {
                if (i != null) {
                    s1.b.c(i);
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
            g1.d.b(interruptedIOException);
        }
        return interruptedIOException;
    }

    public final Object clone() {
        return new j(this.f3876a, this.f3877b);
    }

    public final void d() {
        Socket socket;
        if (this.f3885m) {
            return;
        }
        this.f3885m = true;
        e eVar = this.f3886n;
        if (eVar != null) {
            eVar.f3863c.cancel();
        }
        m mVar = this.f3887o;
        if (mVar == null || (socket = mVar.f3892c) == null) {
            return;
        }
        s1.b.c(socket);
    }

    public final void e(boolean z2) {
        e eVar;
        synchronized (this) {
            if (!this.f3884l) {
                throw new IllegalStateException("released");
            }
        }
        if (z2 && (eVar = this.f3886n) != null) {
            eVar.f3863c.cancel();
            eVar.f3861a.g(eVar, true, true, null);
        }
        this.i = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r f() {
        ArrayList arrayList = new ArrayList();
        X0.p.A0(arrayList, this.f3876a.f3509c);
        arrayList.add(new w1.a(this.f3876a));
        arrayList.add(new w1.a(this.f3876a.f3513j));
        arrayList.add(new t1.b());
        arrayList.add(a.f3846a);
        X0.p.A0(arrayList, this.f3876a.d);
        arrayList.add(new w1.b());
        J.d dVar = this.f3877b;
        r1.o oVar = this.f3876a;
        boolean z2 = false;
        try {
            r b2 = new w1.f(this, arrayList, 0, null, dVar, oVar.f3525v, oVar.f3526w, oVar.f3527x).b(this.f3877b);
            if (this.f3885m) {
                s1.b.b(b2);
                throw new IOException("Canceled");
            }
            h(null);
            return b2;
        } catch (IOException e2) {
            try {
                IOException h = h(e2);
                g1.d.c(h, "null cannot be cast to non-null type kotlin.Throwable");
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
        g1.d.e(eVar, "exchange");
        if (!eVar.equals(this.f3886n)) {
            return iOException;
        }
        synchronized (this) {
            z4 = false;
            if (z2) {
                try {
                    if (!this.f3882j) {
                    }
                    if (z2) {
                        this.f3882j = false;
                    }
                    if (z3) {
                        this.f3883k = false;
                    }
                    z6 = this.f3882j;
                    boolean z7 = z6 && !this.f3883k;
                    if (!z6 && !this.f3883k) {
                        if (!this.f3884l) {
                            z4 = true;
                        }
                    }
                    z5 = z4;
                    z4 = z7;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!z3 || !this.f3883k) {
                z5 = false;
            }
            if (z2) {
            }
            if (z3) {
            }
            z6 = this.f3882j;
            if (z6) {
            }
            if (!z6) {
                if (!this.f3884l) {
                }
            }
            z5 = z4;
            z4 = z7;
        }
        if (z4) {
            this.f3886n = null;
            m mVar = this.h;
            if (mVar != null) {
                synchronized (mVar) {
                    mVar.f3899m++;
                }
            }
        }
        return z5 ? c(iOException) : iOException;
    }

    public final IOException h(IOException iOException) {
        boolean z2;
        synchronized (this) {
            z2 = false;
            if (this.f3884l) {
                this.f3884l = false;
                if (!this.f3882j) {
                    if (!this.f3883k) {
                        z2 = true;
                    }
                }
            }
        }
        return z2 ? c(iOException) : iOException;
    }

    public final Socket i() {
        m mVar = this.h;
        g1.d.b(mVar);
        byte[] bArr = s1.b.f3607a;
        ArrayList arrayList = mVar.f3902p;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (g1.d.a(((Reference) it.next()).get(), this)) {
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
            mVar.f3903q = System.nanoTime();
            n nVar = this.f3878c;
            nVar.getClass();
            byte[] bArr2 = s1.b.f3607a;
            boolean z2 = mVar.f3896j;
            u1.c cVar = nVar.f3905b;
            if (z2) {
                mVar.f3896j = true;
                ConcurrentLinkedQueue concurrentLinkedQueue = nVar.d;
                concurrentLinkedQueue.remove(mVar);
                if (concurrentLinkedQueue.isEmpty()) {
                    cVar.a();
                }
                Socket socket = mVar.d;
                g1.d.b(socket);
                return socket;
            }
            cVar.c(nVar.f3906c, 0L);
        }
        return null;
    }
}
