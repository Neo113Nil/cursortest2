package s1;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import o1.s;

/* loaded from: classes.dex */
public final class j implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final o1.p f3720a;

    /* renamed from: b, reason: collision with root package name */
    public final H.e f3721b;

    /* renamed from: c, reason: collision with root package name */
    public final n f3722c;
    public final i d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f3723e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3724f;

    /* renamed from: g, reason: collision with root package name */
    public f f3725g;
    public m h;
    public e i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3726j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3727k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3728l;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f3729m;

    /* renamed from: n, reason: collision with root package name */
    public volatile e f3730n;

    /* renamed from: o, reason: collision with root package name */
    public volatile m f3731o;

    public j(o1.p pVar, H.e eVar) {
        this.f3720a = pVar;
        this.f3721b = eVar;
        this.f3722c = (n) pVar.f3346b.f2878a;
        pVar.f3348e.getClass();
        i iVar = new i(this);
        iVar.g(0, TimeUnit.MILLISECONDS);
        this.d = iVar;
        this.f3723e = new AtomicBoolean();
        this.f3728l = true;
    }

    public static final String a(j jVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(jVar.f3729m ? "canceled " : "");
        sb.append("call");
        sb.append(" to ");
        sb.append(((o1.l) jVar.f3721b.f261c).f());
        return sb.toString();
    }

    public final void b(m mVar) {
        byte[] bArr = p1.b.f3455a;
        if (this.h != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.h = mVar;
        mVar.f3746p.add(new h(this, this.f3724f));
    }

    public final IOException c(IOException iOException) {
        IOException interruptedIOException;
        Socket i;
        byte[] bArr = p1.b.f3455a;
        m mVar = this.h;
        if (mVar != null) {
            synchronized (mVar) {
                i = i();
            }
            if (this.h == null) {
                if (i != null) {
                    p1.b.c(i);
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
            d1.d.b(interruptedIOException);
        }
        return interruptedIOException;
    }

    public final Object clone() {
        return new j(this.f3720a, this.f3721b);
    }

    public final void d() {
        Socket socket;
        if (this.f3729m) {
            return;
        }
        this.f3729m = true;
        e eVar = this.f3730n;
        if (eVar != null) {
            eVar.f3707c.cancel();
        }
        m mVar = this.f3731o;
        if (mVar == null || (socket = mVar.f3736c) == null) {
            return;
        }
        p1.b.c(socket);
    }

    public final void e(boolean z2) {
        e eVar;
        synchronized (this) {
            if (!this.f3728l) {
                throw new IllegalStateException("released");
            }
        }
        if (z2 && (eVar = this.f3730n) != null) {
            eVar.f3707c.cancel();
            eVar.f3705a.g(eVar, true, true, null);
        }
        this.i = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final s f() {
        ArrayList arrayList = new ArrayList();
        S0.m.A0(arrayList, this.f3720a.f3347c);
        arrayList.add(new t1.a(this.f3720a));
        arrayList.add(new t1.a(this.f3720a.f3351j));
        arrayList.add(new q1.b());
        arrayList.add(a.f3690a);
        S0.m.A0(arrayList, this.f3720a.d);
        arrayList.add(new t1.b());
        H.e eVar = this.f3721b;
        o1.p pVar = this.f3720a;
        boolean z2 = false;
        try {
            s b2 = new t1.f(this, arrayList, 0, null, eVar, pVar.f3363v, pVar.f3364w, pVar.f3365x).b(this.f3721b);
            if (this.f3729m) {
                p1.b.b(b2);
                throw new IOException("Canceled");
            }
            h(null);
            return b2;
        } catch (IOException e2) {
            try {
                IOException h = h(e2);
                d1.d.c(h, "null cannot be cast to non-null type kotlin.Throwable");
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
        d1.d.e(eVar, "exchange");
        if (!eVar.equals(this.f3730n)) {
            return iOException;
        }
        synchronized (this) {
            z4 = false;
            if (z2) {
                try {
                    if (!this.f3726j) {
                    }
                    if (z2) {
                        this.f3726j = false;
                    }
                    if (z3) {
                        this.f3727k = false;
                    }
                    z6 = this.f3726j;
                    boolean z7 = z6 && !this.f3727k;
                    if (!z6 && !this.f3727k) {
                        if (!this.f3728l) {
                            z4 = true;
                        }
                    }
                    z5 = z4;
                    z4 = z7;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!z3 || !this.f3727k) {
                z5 = false;
            }
            if (z2) {
            }
            if (z3) {
            }
            z6 = this.f3726j;
            if (z6) {
            }
            if (!z6) {
                if (!this.f3728l) {
                }
            }
            z5 = z4;
            z4 = z7;
        }
        if (z4) {
            this.f3730n = null;
            m mVar = this.h;
            if (mVar != null) {
                synchronized (mVar) {
                    mVar.f3743m++;
                }
            }
        }
        return z5 ? c(iOException) : iOException;
    }

    public final IOException h(IOException iOException) {
        boolean z2;
        synchronized (this) {
            z2 = false;
            if (this.f3728l) {
                this.f3728l = false;
                if (!this.f3726j) {
                    if (!this.f3727k) {
                        z2 = true;
                    }
                }
            }
        }
        return z2 ? c(iOException) : iOException;
    }

    public final Socket i() {
        m mVar = this.h;
        d1.d.b(mVar);
        byte[] bArr = p1.b.f3455a;
        ArrayList arrayList = mVar.f3746p;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (d1.d.a(((Reference) it.next()).get(), this)) {
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
            mVar.f3747q = System.nanoTime();
            n nVar = this.f3722c;
            nVar.getClass();
            byte[] bArr2 = p1.b.f3455a;
            boolean z2 = mVar.f3740j;
            r1.c cVar = nVar.f3749b;
            if (z2) {
                mVar.f3740j = true;
                ConcurrentLinkedQueue concurrentLinkedQueue = nVar.d;
                concurrentLinkedQueue.remove(mVar);
                if (concurrentLinkedQueue.isEmpty()) {
                    cVar.a();
                }
                Socket socket = mVar.d;
                d1.d.b(socket);
                return socket;
            }
            cVar.c(nVar.f3750c, 0L);
        }
        return null;
    }
}
