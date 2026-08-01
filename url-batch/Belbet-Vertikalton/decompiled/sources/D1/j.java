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
import z1.v;

/* loaded from: classes.dex */
public final class j implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final s f235a;

    /* renamed from: b, reason: collision with root package name */
    public final J.d f236b;

    /* renamed from: c, reason: collision with root package name */
    public final n f237c;

    /* renamed from: d, reason: collision with root package name */
    public final i f238d;
    public final AtomicBoolean e;

    /* renamed from: f, reason: collision with root package name */
    public Object f239f;

    /* renamed from: g, reason: collision with root package name */
    public f f240g;

    /* renamed from: h, reason: collision with root package name */
    public m f241h;
    public e i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f242k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f243l;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f244m;

    /* renamed from: n, reason: collision with root package name */
    public volatile e f245n;

    /* renamed from: o, reason: collision with root package name */
    public volatile m f246o;

    public j(s sVar, J.d dVar) {
        this.f235a = sVar;
        this.f236b = dVar;
        this.f237c = (n) sVar.f4906b.f3677b;
        sVar.e.getClass();
        i iVar = new i(this);
        iVar.g(0, TimeUnit.MILLISECONDS);
        this.f238d = iVar;
        this.e = new AtomicBoolean();
        this.f243l = true;
    }

    public static final String a(j jVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(jVar.f244m ? "canceled " : "");
        sb.append("call");
        sb.append(" to ");
        sb.append(((z1.o) jVar.f236b.f626c).f());
        return sb.toString();
    }

    public final void b(m mVar) {
        byte[] bArr = A1.c.f19a;
        if (this.f241h != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.f241h = mVar;
        mVar.f262p.add(new h(this, this.f239f));
    }

    public final IOException c(IOException iOException) {
        IOException interruptedIOException;
        Socket i;
        byte[] bArr = A1.c.f19a;
        m mVar = this.f241h;
        if (mVar != null) {
            synchronized (mVar) {
                i = i();
            }
            if (this.f241h == null) {
                if (i != null) {
                    A1.c.c(i);
                }
            } else if (i != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (this.f238d.i()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException != null) {
            j1.h.b(interruptedIOException);
        }
        return interruptedIOException;
    }

    public final Object clone() {
        return new j(this.f235a, this.f236b);
    }

    public final void d() {
        Socket socket;
        if (this.f244m) {
            return;
        }
        this.f244m = true;
        e eVar = this.f245n;
        if (eVar != null) {
            eVar.f221c.cancel();
        }
        m mVar = this.f246o;
        if (mVar == null || (socket = mVar.f252c) == null) {
            return;
        }
        A1.c.c(socket);
    }

    public final void e(boolean z2) {
        e eVar;
        synchronized (this) {
            if (!this.f243l) {
                throw new IllegalStateException("released");
            }
        }
        if (z2 && (eVar = this.f245n) != null) {
            eVar.f221c.cancel();
            eVar.f219a.g(eVar, true, true, null);
        }
        this.i = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final v f() {
        ArrayList arrayList = new ArrayList();
        X0.q.n0(arrayList, this.f235a.f4907c);
        arrayList.add(new E1.a(this.f235a));
        arrayList.add(new E1.a(this.f235a.j));
        arrayList.add(new B1.b());
        arrayList.add(a.f203a);
        X0.q.n0(arrayList, this.f235a.f4908d);
        arrayList.add(new E1.b());
        J.d dVar = this.f236b;
        s sVar = this.f235a;
        boolean z2 = false;
        try {
            v b2 = new E1.g(this, arrayList, 0, null, dVar, sVar.f4923v, sVar.f4924w, sVar.f4925x).b(this.f236b);
            if (this.f244m) {
                A1.c.b(b2);
                throw new IOException("Canceled");
            }
            h(null);
            return b2;
        } catch (IOException e) {
            try {
                IOException h2 = h(e);
                j1.h.c(h2, "null cannot be cast to non-null type kotlin.Throwable");
                throw h2;
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
        j1.h.e(eVar, "exchange");
        if (!eVar.equals(this.f245n)) {
            return iOException;
        }
        synchronized (this) {
            z4 = false;
            if (z2) {
                try {
                    if (!this.j) {
                    }
                    if (z2) {
                        this.j = false;
                    }
                    if (z3) {
                        this.f242k = false;
                    }
                    z6 = this.j;
                    boolean z7 = z6 && !this.f242k;
                    if (!z6 && !this.f242k) {
                        if (!this.f243l) {
                            z4 = true;
                        }
                    }
                    z5 = z4;
                    z4 = z7;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!z3 || !this.f242k) {
                z5 = false;
            }
            if (z2) {
            }
            if (z3) {
            }
            z6 = this.j;
            if (z6) {
            }
            if (!z6) {
                if (!this.f243l) {
                }
            }
            z5 = z4;
            z4 = z7;
        }
        if (z4) {
            this.f245n = null;
            m mVar = this.f241h;
            if (mVar != null) {
                synchronized (mVar) {
                    mVar.f259m++;
                }
            }
        }
        return z5 ? c(iOException) : iOException;
    }

    public final IOException h(IOException iOException) {
        boolean z2;
        synchronized (this) {
            z2 = false;
            if (this.f243l) {
                this.f243l = false;
                if (!this.j) {
                    if (!this.f242k) {
                        z2 = true;
                    }
                }
            }
        }
        return z2 ? c(iOException) : iOException;
    }

    public final Socket i() {
        m mVar = this.f241h;
        j1.h.b(mVar);
        byte[] bArr = A1.c.f19a;
        ArrayList arrayList = mVar.f262p;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (j1.h.a(((Reference) it.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i);
        this.f241h = null;
        if (arrayList.isEmpty()) {
            mVar.f263q = System.nanoTime();
            n nVar = this.f237c;
            nVar.getClass();
            byte[] bArr2 = A1.c.f19a;
            boolean z2 = mVar.j;
            C1.c cVar = nVar.f265b;
            if (z2) {
                mVar.j = true;
                ConcurrentLinkedQueue concurrentLinkedQueue = nVar.f267d;
                concurrentLinkedQueue.remove(mVar);
                if (concurrentLinkedQueue.isEmpty()) {
                    cVar.a();
                }
                Socket socket = mVar.f253d;
                j1.h.b(socket);
                return socket;
            }
            cVar.c(nVar.f266c, 0L);
        }
        return null;
    }
}
