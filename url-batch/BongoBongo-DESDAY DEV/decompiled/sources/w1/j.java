package w1;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import s1.r;

/* loaded from: classes.dex */
public final class j implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final s1.o f4237a;

    /* renamed from: b, reason: collision with root package name */
    public final I.d f4238b;

    /* renamed from: c, reason: collision with root package name */
    public final n f4239c;
    public final i d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f4240e;

    /* renamed from: f, reason: collision with root package name */
    public Object f4241f;

    /* renamed from: g, reason: collision with root package name */
    public f f4242g;

    /* renamed from: h, reason: collision with root package name */
    public m f4243h;
    public e i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4244j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4245k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4246l;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f4247m;

    /* renamed from: n, reason: collision with root package name */
    public volatile e f4248n;

    /* renamed from: o, reason: collision with root package name */
    public volatile m f4249o;

    public j(s1.o oVar, I.d dVar) {
        this.f4237a = oVar;
        this.f4238b = dVar;
        this.f4239c = (n) oVar.f3662b.f3068a;
        oVar.f3664e.getClass();
        i iVar = new i(this);
        iVar.g(0, TimeUnit.MILLISECONDS);
        this.d = iVar;
        this.f4240e = new AtomicBoolean();
        this.f4246l = true;
    }

    public static final String a(j jVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(jVar.f4247m ? "canceled " : "");
        sb.append("call");
        sb.append(" to ");
        sb.append(((s1.l) jVar.f4238b.f321c).f());
        return sb.toString();
    }

    public final void b(m mVar) {
        byte[] bArr = t1.b.f3898a;
        if (this.f4243h != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.f4243h = mVar;
        mVar.f4265p.add(new h(this, this.f4241f));
    }

    public final IOException c(IOException iOException) {
        IOException interruptedIOException;
        Socket i;
        byte[] bArr = t1.b.f3898a;
        m mVar = this.f4243h;
        if (mVar != null) {
            synchronized (mVar) {
                i = i();
            }
            if (this.f4243h == null) {
                if (i != null) {
                    t1.b.c(i);
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
            h1.d.b(interruptedIOException);
        }
        return interruptedIOException;
    }

    public final Object clone() {
        return new j(this.f4237a, this.f4238b);
    }

    public final void d() {
        Socket socket;
        if (this.f4247m) {
            return;
        }
        this.f4247m = true;
        e eVar = this.f4248n;
        if (eVar != null) {
            eVar.f4223c.cancel();
        }
        m mVar = this.f4249o;
        if (mVar == null || (socket = mVar.f4254c) == null) {
            return;
        }
        t1.b.c(socket);
    }

    public final void e(boolean z2) {
        e eVar;
        synchronized (this) {
            if (!this.f4246l) {
                throw new IllegalStateException("released");
            }
        }
        if (z2 && (eVar = this.f4248n) != null) {
            eVar.f4223c.cancel();
            eVar.f4221a.g(eVar, true, true, null);
        }
        this.i = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r f() {
        ArrayList arrayList = new ArrayList();
        W0.m.p0(arrayList, this.f4237a.f3663c);
        arrayList.add(new x1.a(this.f4237a));
        arrayList.add(new x1.a(this.f4237a.f3668j));
        arrayList.add(new u1.b());
        arrayList.add(a.f4206a);
        W0.m.p0(arrayList, this.f4237a.d);
        arrayList.add(new x1.b());
        I.d dVar = this.f4238b;
        s1.o oVar = this.f4237a;
        boolean z2 = false;
        try {
            r b2 = new x1.f(this, arrayList, 0, null, dVar, oVar.f3680v, oVar.f3681w, oVar.f3682x).b(this.f4238b);
            if (this.f4247m) {
                t1.b.b(b2);
                throw new IOException("Canceled");
            }
            h(null);
            return b2;
        } catch (IOException e2) {
            try {
                IOException h2 = h(e2);
                h1.d.c(h2, "null cannot be cast to non-null type kotlin.Throwable");
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
        h1.d.e(eVar, "exchange");
        if (!eVar.equals(this.f4248n)) {
            return iOException;
        }
        synchronized (this) {
            z4 = false;
            if (z2) {
                try {
                    if (!this.f4244j) {
                    }
                    if (z2) {
                        this.f4244j = false;
                    }
                    if (z3) {
                        this.f4245k = false;
                    }
                    z6 = this.f4244j;
                    boolean z7 = z6 && !this.f4245k;
                    if (!z6 && !this.f4245k) {
                        if (!this.f4246l) {
                            z4 = true;
                        }
                    }
                    z5 = z4;
                    z4 = z7;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!z3 || !this.f4245k) {
                z5 = false;
            }
            if (z2) {
            }
            if (z3) {
            }
            z6 = this.f4244j;
            if (z6) {
            }
            if (!z6) {
                if (!this.f4246l) {
                }
            }
            z5 = z4;
            z4 = z7;
        }
        if (z4) {
            this.f4248n = null;
            m mVar = this.f4243h;
            if (mVar != null) {
                synchronized (mVar) {
                    mVar.f4262m++;
                }
            }
        }
        return z5 ? c(iOException) : iOException;
    }

    public final IOException h(IOException iOException) {
        boolean z2;
        synchronized (this) {
            z2 = false;
            if (this.f4246l) {
                this.f4246l = false;
                if (!this.f4244j) {
                    if (!this.f4245k) {
                        z2 = true;
                    }
                }
            }
        }
        return z2 ? c(iOException) : iOException;
    }

    public final Socket i() {
        m mVar = this.f4243h;
        h1.d.b(mVar);
        byte[] bArr = t1.b.f3898a;
        ArrayList arrayList = mVar.f4265p;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (h1.d.a(((Reference) it.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i);
        this.f4243h = null;
        if (arrayList.isEmpty()) {
            mVar.f4266q = System.nanoTime();
            n nVar = this.f4239c;
            nVar.getClass();
            byte[] bArr2 = t1.b.f3898a;
            boolean z2 = mVar.f4259j;
            v1.c cVar = nVar.f4268b;
            if (z2) {
                mVar.f4259j = true;
                ConcurrentLinkedQueue concurrentLinkedQueue = nVar.d;
                concurrentLinkedQueue.remove(mVar);
                if (concurrentLinkedQueue.isEmpty()) {
                    cVar.a();
                }
                Socket socket = mVar.d;
                h1.d.b(socket);
                return socket;
            }
            cVar.c(nVar.f4269c, 0L);
        }
        return null;
    }
}
