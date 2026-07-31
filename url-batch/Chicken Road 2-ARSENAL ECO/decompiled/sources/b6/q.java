package b6;

import X5.C0217a;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import l5.AbstractC0506j;

/* loaded from: classes.dex */
public final class q implements Cloneable {

    /* renamed from: f, reason: collision with root package name */
    public final X5.s f3680f;

    /* renamed from: g, reason: collision with root package name */
    public final D0.h f3681g;

    /* renamed from: h, reason: collision with root package name */
    public final s f3682h;

    /* renamed from: i, reason: collision with root package name */
    public final p f3683i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f3684j;

    /* renamed from: k, reason: collision with root package name */
    public Object f3685k;

    /* renamed from: l, reason: collision with root package name */
    public i f3686l;

    /* renamed from: m, reason: collision with root package name */
    public r f3687m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3688n;

    /* renamed from: o, reason: collision with root package name */
    public U.a f3689o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3690p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3691q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3692r;

    /* renamed from: s, reason: collision with root package name */
    public volatile boolean f3693s;

    /* renamed from: t, reason: collision with root package name */
    public volatile U.a f3694t;

    /* renamed from: u, reason: collision with root package name */
    public final CopyOnWriteArrayList f3695u;

    public q(X5.s client, D0.h hVar) {
        kotlin.jvm.internal.i.e(client, "client");
        this.f3680f = client;
        this.f3681g = hVar;
        this.f3682h = (s) client.f3010B.f2734g;
        client.f3014d.getClass();
        p pVar = new p(this);
        long j4 = client.f3032v;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        pVar.g(j4);
        this.f3683i = pVar;
        this.f3684j = new AtomicBoolean();
        this.f3692r = true;
        this.f3695u = new CopyOnWriteArrayList();
    }

    public static final String a(q qVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(qVar.f3693s ? "canceled " : "");
        sb.append("call");
        sb.append(" to ");
        sb.append(((X5.o) qVar.f3681g.f331c).f());
        return sb.toString();
    }

    public final IOException b(IOException iOException) {
        IOException iOException2;
        Socket h7;
        TimeZone timeZone = Y5.e.f3102a;
        r rVar = this.f3687m;
        if (rVar != null) {
            synchronized (rVar) {
                h7 = h();
            }
            if (this.f3687m == null) {
                if (h7 != null) {
                    Y5.e.c(h7);
                }
            } else if (h7 != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (!this.f3688n && this.f3683i.i()) {
            iOException2 = new InterruptedIOException("timeout");
            if (iOException != null) {
                iOException2.initCause(iOException);
            }
        } else {
            iOException2 = iOException;
        }
        if (iOException != null) {
            kotlin.jvm.internal.i.b(iOException2);
        }
        return iOException2;
    }

    public final void c() {
        if (this.f3693s) {
            return;
        }
        this.f3693s = true;
        U.a aVar = this.f3694t;
        if (aVar != null) {
            ((c6.f) aVar.f2485e).cancel();
        }
        Iterator it = this.f3695u.iterator();
        kotlin.jvm.internal.i.d(it, "iterator(...)");
        while (it.hasNext()) {
            ((w) it.next()).cancel();
        }
    }

    public final Object clone() {
        return new q(this.f3680f, this.f3681g);
    }

    public final void d(boolean z5) {
        U.a aVar;
        synchronized (this) {
            if (!this.f3692r) {
                throw new IllegalStateException("released");
            }
        }
        if (z5 && (aVar = this.f3694t) != null) {
            ((c6.f) aVar.f2485e).cancel();
            ((q) aVar.f2483c).f(aVar, true, true, null);
        }
        this.f3689o = null;
    }

    public final X5.w e() {
        ArrayList arrayList = new ArrayList();
        AbstractC0506j.D(this.f3680f.f3012b, arrayList);
        arrayList.add(new c6.a(this.f3680f));
        arrayList.add(new c6.a(this.f3680f.f3020j));
        this.f3680f.getClass();
        arrayList.add(new Z5.a());
        arrayList.add(b.f3624a);
        AbstractC0506j.D(this.f3680f.f3013c, arrayList);
        arrayList.add(c6.c.f3824a);
        D0.h hVar = this.f3681g;
        X5.s sVar = this.f3680f;
        try {
            try {
                X5.w b7 = new c6.h(this, arrayList, 0, null, hVar, sVar.f3033w, sVar.f3034x, sVar.y).b(hVar);
                if (this.f3693s) {
                    Y5.c.a(b7);
                    throw new IOException("Canceled");
                }
                g(null);
                return b7;
            } catch (IOException e4) {
                IOException g7 = g(e4);
                kotlin.jvm.internal.i.c(g7, "null cannot be cast to non-null type kotlin.Throwable");
                throw g7;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                g(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:47:0x0013, B:10:0x0022, B:12:0x0026, B:13:0x0028, B:15:0x002c, B:19:0x0035, B:21:0x0039, B:7:0x001c), top: B:46:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0026 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:47:0x0013, B:10:0x0022, B:12:0x0026, B:13:0x0028, B:15:0x002c, B:19:0x0035, B:21:0x0039, B:7:0x001c), top: B:46:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IOException f(U.a exchange, boolean z5, boolean z6, IOException iOException) {
        boolean z7;
        boolean z8;
        boolean z9;
        kotlin.jvm.internal.i.e(exchange, "exchange");
        if (exchange.equals(this.f3694t)) {
            synchronized (this) {
                z7 = false;
                if (z5) {
                    try {
                        if (!this.f3690p) {
                        }
                        if (z5) {
                            this.f3690p = false;
                        }
                        if (z6) {
                            this.f3691q = false;
                        }
                        z9 = this.f3690p;
                        boolean z10 = z9 && !this.f3691q;
                        if (!z9 && !this.f3691q) {
                            if (!this.f3692r) {
                                z7 = true;
                            }
                        }
                        z8 = z7;
                        z7 = z10;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (!z6 || !this.f3691q) {
                    z8 = false;
                }
                if (z5) {
                }
                if (z6) {
                }
                z9 = this.f3690p;
                if (z9) {
                }
                if (!z9) {
                    if (!this.f3692r) {
                    }
                }
                z8 = z7;
                z7 = z10;
            }
            if (z7) {
                this.f3694t = null;
                r rVar = this.f3687m;
                if (rVar != null) {
                    synchronized (rVar) {
                        rVar.f3709o++;
                    }
                }
            }
            if (z8) {
                return b(iOException);
            }
        }
        return iOException;
    }

    public final IOException g(IOException iOException) {
        boolean z5;
        synchronized (this) {
            z5 = false;
            if (this.f3692r) {
                this.f3692r = false;
                if (!this.f3690p) {
                    if (!this.f3691q) {
                        z5 = true;
                    }
                }
            }
        }
        return z5 ? b(iOException) : iOException;
    }

    public final Socket h() {
        r rVar = this.f3687m;
        kotlin.jvm.internal.i.b(rVar);
        TimeZone timeZone = Y5.e.f3102a;
        ArrayList arrayList = rVar.f3712r;
        int size = arrayList.size();
        int i7 = 0;
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                i7 = -1;
                break;
            }
            Object obj = arrayList.get(i8);
            i8++;
            if (kotlin.jvm.internal.i.a(((Reference) obj).get(), this)) {
                break;
            }
            i7++;
        }
        if (i7 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i7);
        this.f3687m = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        rVar.f3713s = System.nanoTime();
        s sVar = this.f3682h;
        ConcurrentLinkedQueue concurrentLinkedQueue = sVar.f3719f;
        TimeZone timeZone2 = Y5.e.f3102a;
        if (!rVar.f3706l) {
            sVar.f3717d.d(sVar.f3718e, 0L);
            return null;
        }
        rVar.f3706l = true;
        concurrentLinkedQueue.remove(rVar);
        if (concurrentLinkedQueue.isEmpty()) {
            sVar.f3717d.a();
        }
        C0217a address = rVar.f3698d.f3079a;
        kotlin.jvm.internal.i.e(address, "address");
        if (sVar.f3716c.get(address) == null) {
            return rVar.f3700f;
        }
        throw new ClassCastException();
    }
}
