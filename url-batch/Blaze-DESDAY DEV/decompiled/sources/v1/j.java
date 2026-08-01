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
import r1.q;
import r1.t;

/* loaded from: classes.dex */
public final class j implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final q f4046a;

    /* renamed from: b, reason: collision with root package name */
    public final H.e f4047b;

    /* renamed from: c, reason: collision with root package name */
    public final n f4048c;
    public final i d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f4049e;

    /* renamed from: f, reason: collision with root package name */
    public Object f4050f;

    /* renamed from: g, reason: collision with root package name */
    public f f4051g;
    public m h;
    public e i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4052j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4053k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4054l;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f4055m;

    /* renamed from: n, reason: collision with root package name */
    public volatile e f4056n;

    /* renamed from: o, reason: collision with root package name */
    public volatile m f4057o;

    public j(q qVar, H.e eVar) {
        this.f4046a = qVar;
        this.f4047b = eVar;
        this.f4048c = (n) qVar.f3492b.f3436a;
        qVar.f3494e.getClass();
        i iVar = new i(this);
        iVar.g(0, TimeUnit.MILLISECONDS);
        this.d = iVar;
        this.f4049e = new AtomicBoolean();
        this.f4054l = true;
    }

    public static final String a(j jVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(jVar.f4055m ? "canceled " : "");
        sb.append("call");
        sb.append(" to ");
        sb.append(((r1.m) jVar.f4047b.f278c).f());
        return sb.toString();
    }

    public final void b(m mVar) {
        byte[] bArr = s1.b.f3721a;
        if (this.h != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.h = mVar;
        mVar.f4072p.add(new h(this, this.f4050f));
    }

    public final IOException c(IOException iOException) {
        IOException interruptedIOException;
        Socket i;
        byte[] bArr = s1.b.f3721a;
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
        return new j(this.f4046a, this.f4047b);
    }

    public final void d() {
        Socket socket;
        if (this.f4055m) {
            return;
        }
        this.f4055m = true;
        e eVar = this.f4056n;
        if (eVar != null) {
            eVar.f4033c.cancel();
        }
        m mVar = this.f4057o;
        if (mVar == null || (socket = mVar.f4062c) == null) {
            return;
        }
        s1.b.c(socket);
    }

    public final void e(boolean z2) {
        e eVar;
        synchronized (this) {
            if (!this.f4054l) {
                throw new IllegalStateException("released");
            }
        }
        if (z2 && (eVar = this.f4056n) != null) {
            eVar.f4033c.cancel();
            eVar.f4031a.g(eVar, true, true, null);
        }
        this.i = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final t f() {
        ArrayList arrayList = new ArrayList();
        V0.m.y0(arrayList, this.f4046a.f3493c);
        arrayList.add(new w1.a(this.f4046a));
        arrayList.add(new w1.a(this.f4046a.f3497j));
        arrayList.add(new t1.b());
        arrayList.add(a.f4016a);
        V0.m.y0(arrayList, this.f4046a.d);
        arrayList.add(new w1.b());
        H.e eVar = this.f4047b;
        q qVar = this.f4046a;
        boolean z2 = false;
        try {
            t b2 = new w1.f(this, arrayList, 0, null, eVar, qVar.f3509v, qVar.f3510w, qVar.f3511x).b(this.f4047b);
            if (this.f4055m) {
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
        if (!eVar.equals(this.f4056n)) {
            return iOException;
        }
        synchronized (this) {
            z4 = false;
            if (z2) {
                try {
                    if (!this.f4052j) {
                    }
                    if (z2) {
                        this.f4052j = false;
                    }
                    if (z3) {
                        this.f4053k = false;
                    }
                    z6 = this.f4052j;
                    boolean z7 = z6 && !this.f4053k;
                    if (!z6 && !this.f4053k) {
                        if (!this.f4054l) {
                            z4 = true;
                        }
                    }
                    z5 = z4;
                    z4 = z7;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!z3 || !this.f4053k) {
                z5 = false;
            }
            if (z2) {
            }
            if (z3) {
            }
            z6 = this.f4052j;
            if (z6) {
            }
            if (!z6) {
                if (!this.f4054l) {
                }
            }
            z5 = z4;
            z4 = z7;
        }
        if (z4) {
            this.f4056n = null;
            m mVar = this.h;
            if (mVar != null) {
                synchronized (mVar) {
                    mVar.f4069m++;
                }
            }
        }
        return z5 ? c(iOException) : iOException;
    }

    public final IOException h(IOException iOException) {
        boolean z2;
        synchronized (this) {
            z2 = false;
            if (this.f4054l) {
                this.f4054l = false;
                if (!this.f4052j) {
                    if (!this.f4053k) {
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
        byte[] bArr = s1.b.f3721a;
        ArrayList arrayList = mVar.f4072p;
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
            mVar.f4073q = System.nanoTime();
            n nVar = this.f4048c;
            nVar.getClass();
            byte[] bArr2 = s1.b.f3721a;
            boolean z2 = mVar.f4066j;
            u1.c cVar = nVar.f4075b;
            if (z2) {
                mVar.f4066j = true;
                ConcurrentLinkedQueue concurrentLinkedQueue = nVar.d;
                concurrentLinkedQueue.remove(mVar);
                if (concurrentLinkedQueue.isEmpty()) {
                    cVar.a();
                }
                Socket socket = mVar.d;
                g1.d.b(socket);
                return socket;
            }
            cVar.c(nVar.f4076c, 0L);
        }
        return null;
    }
}
