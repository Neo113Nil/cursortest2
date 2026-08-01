package D1;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import z1.s;

/* loaded from: classes.dex */
public final class j implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final z1.p f178a;

    /* renamed from: b, reason: collision with root package name */
    public final H.e f179b;

    /* renamed from: c, reason: collision with root package name */
    public final n f180c;
    public final i d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f181e;

    /* renamed from: f, reason: collision with root package name */
    public Object f182f;

    /* renamed from: g, reason: collision with root package name */
    public f f183g;
    public m h;
    public e i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f184j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f185k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f186l;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f187m;

    /* renamed from: n, reason: collision with root package name */
    public volatile e f188n;

    /* renamed from: o, reason: collision with root package name */
    public volatile m f189o;

    public j(z1.p pVar, H.e eVar) {
        this.f178a = pVar;
        this.f179b = eVar;
        this.f180c = (n) pVar.f4722b.f3187a;
        pVar.f4724e.getClass();
        i iVar = new i(this);
        iVar.g(0, TimeUnit.MILLISECONDS);
        this.d = iVar;
        this.f181e = new AtomicBoolean();
        this.f186l = true;
    }

    public static final String a(j jVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(jVar.f187m ? "canceled " : "");
        sb.append("call");
        sb.append(" to ");
        sb.append(((z1.l) jVar.f179b.f483c).f());
        return sb.toString();
    }

    public final void b(m mVar) {
        byte[] bArr = A1.c.f13a;
        if (this.h != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.h = mVar;
        mVar.f204p.add(new h(this, this.f182f));
    }

    public final IOException c(IOException iOException) {
        IOException interruptedIOException;
        Socket i;
        byte[] bArr = A1.c.f13a;
        m mVar = this.h;
        if (mVar != null) {
            synchronized (mVar) {
                i = i();
            }
            if (this.h == null) {
                if (i != null) {
                    A1.c.c(i);
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
            k1.e.b(interruptedIOException);
        }
        return interruptedIOException;
    }

    public final Object clone() {
        return new j(this.f178a, this.f179b);
    }

    public final void d() {
        Socket socket;
        if (this.f187m) {
            return;
        }
        this.f187m = true;
        e eVar = this.f188n;
        if (eVar != null) {
            eVar.f165c.cancel();
        }
        m mVar = this.f189o;
        if (mVar == null || (socket = mVar.f194c) == null) {
            return;
        }
        A1.c.c(socket);
    }

    public final void e(boolean z2) {
        e eVar;
        synchronized (this) {
            if (!this.f186l) {
                throw new IllegalStateException("released");
            }
        }
        if (z2 && (eVar = this.f188n) != null) {
            eVar.f165c.cancel();
            eVar.f163a.g(eVar, true, true, null);
        }
        this.i = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final s f() {
        ArrayList arrayList = new ArrayList();
        Y0.p.A0(arrayList, this.f178a.f4723c);
        arrayList.add(new E1.a(this.f178a));
        arrayList.add(new E1.a(this.f178a.f4727j));
        arrayList.add(new B1.b());
        arrayList.add(a.f148a);
        Y0.p.A0(arrayList, this.f178a.d);
        arrayList.add(new E1.b());
        H.e eVar = this.f179b;
        z1.p pVar = this.f178a;
        boolean z2 = false;
        try {
            s b2 = new E1.g(this, arrayList, 0, null, eVar, pVar.f4739v, pVar.f4740w, pVar.f4741x).b(this.f179b);
            if (this.f187m) {
                A1.c.b(b2);
                throw new IOException("Canceled");
            }
            h(null);
            return b2;
        } catch (IOException e2) {
            try {
                IOException h = h(e2);
                k1.e.c(h, "null cannot be cast to non-null type kotlin.Throwable");
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
        k1.e.e(eVar, "exchange");
        if (!eVar.equals(this.f188n)) {
            return iOException;
        }
        synchronized (this) {
            z4 = false;
            if (z2) {
                try {
                    if (!this.f184j) {
                    }
                    if (z2) {
                        this.f184j = false;
                    }
                    if (z3) {
                        this.f185k = false;
                    }
                    z6 = this.f184j;
                    boolean z7 = z6 && !this.f185k;
                    if (!z6 && !this.f185k) {
                        if (!this.f186l) {
                            z4 = true;
                        }
                    }
                    z5 = z4;
                    z4 = z7;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!z3 || !this.f185k) {
                z5 = false;
            }
            if (z2) {
            }
            if (z3) {
            }
            z6 = this.f184j;
            if (z6) {
            }
            if (!z6) {
                if (!this.f186l) {
                }
            }
            z5 = z4;
            z4 = z7;
        }
        if (z4) {
            this.f188n = null;
            m mVar = this.h;
            if (mVar != null) {
                synchronized (mVar) {
                    mVar.f201m++;
                }
            }
        }
        return z5 ? c(iOException) : iOException;
    }

    public final IOException h(IOException iOException) {
        boolean z2;
        synchronized (this) {
            z2 = false;
            if (this.f186l) {
                this.f186l = false;
                if (!this.f184j) {
                    if (!this.f185k) {
                        z2 = true;
                    }
                }
            }
        }
        return z2 ? c(iOException) : iOException;
    }

    public final Socket i() {
        m mVar = this.h;
        k1.e.b(mVar);
        byte[] bArr = A1.c.f13a;
        ArrayList arrayList = mVar.f204p;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (k1.e.a(((Reference) it.next()).get(), this)) {
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
            mVar.f205q = System.nanoTime();
            n nVar = this.f180c;
            nVar.getClass();
            byte[] bArr2 = A1.c.f13a;
            boolean z2 = mVar.f198j;
            C1.c cVar = nVar.f207b;
            if (z2) {
                mVar.f198j = true;
                ConcurrentLinkedQueue concurrentLinkedQueue = nVar.d;
                concurrentLinkedQueue.remove(mVar);
                if (concurrentLinkedQueue.isEmpty()) {
                    cVar.a();
                }
                Socket socket = mVar.d;
                k1.e.b(socket);
                return socket;
            }
            cVar.c(nVar.f208c, 0L);
        }
        return null;
    }
}
