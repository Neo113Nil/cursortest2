package q3;

import A0.q;
import C.F;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m3.r;
import m3.w;
import u3.n;
import z2.C1400D;

/* loaded from: classes.dex */
public final class g implements Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public final r f9388d;

    /* renamed from: e, reason: collision with root package name */
    public final q f9389e;

    /* renamed from: i, reason: collision with root package name */
    public final j f9390i;

    /* renamed from: j, reason: collision with root package name */
    public final f f9391j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicBoolean f9392k;

    /* renamed from: l, reason: collision with root package name */
    public Object f9393l;

    /* renamed from: m, reason: collision with root package name */
    public d f9394m;

    /* renamed from: n, reason: collision with root package name */
    public i f9395n;

    /* renamed from: o, reason: collision with root package name */
    public F f9396o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f9397p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f9398q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f9399r;

    /* renamed from: s, reason: collision with root package name */
    public volatile boolean f9400s;

    /* renamed from: t, reason: collision with root package name */
    public volatile F f9401t;

    /* renamed from: u, reason: collision with root package name */
    public volatile i f9402u;

    public g(r client, q originalRequest) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        this.f9388d = client;
        this.f9389e = originalRequest;
        this.f9390i = (j) client.f8433e.f6561e;
        client.f8436k.getClass();
        m3.j this_asFactory = m3.j.f8386d;
        Intrinsics.checkNotNullParameter(this_asFactory, "$this_asFactory");
        Intrinsics.checkNotNullParameter(this, "it");
        f fVar = new f(this);
        fVar.g(0, TimeUnit.MILLISECONDS);
        this.f9391j = fVar;
        this.f9392k = new AtomicBoolean();
        this.f9399r = true;
    }

    public final void a(i connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        byte[] bArr = n3.b.f8558a;
        if (this.f9395n != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.f9395n = connection;
        connection.f9418p.add(new e(this, this.f9393l));
    }

    public final IOException b(IOException iOException) {
        IOException ioe;
        Socket h4;
        byte[] bArr = n3.b.f8558a;
        i connection = this.f9395n;
        if (connection != null) {
            synchronized (connection) {
                h4 = h();
            }
            if (this.f9395n == null) {
                if (h4 != null) {
                    n3.b.d(h4);
                }
                Intrinsics.checkNotNullParameter(this, "call");
                Intrinsics.checkNotNullParameter(connection, "connection");
            } else if (h4 != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (this.f9391j.i()) {
            ioe = new InterruptedIOException("timeout");
            if (iOException != null) {
                ioe.initCause(iOException);
            }
        } else {
            ioe = iOException;
        }
        if (iOException != null) {
            Intrinsics.c(ioe);
            Intrinsics.checkNotNullParameter(this, "call");
            Intrinsics.checkNotNullParameter(ioe, "ioe");
        } else {
            Intrinsics.checkNotNullParameter(this, "call");
        }
        return ioe;
    }

    public final w c() {
        if (!this.f9392k.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.f9391j.h();
        n nVar = n.f10964a;
        this.f9393l = n.f10964a.g();
        Intrinsics.checkNotNullParameter(this, "call");
        try {
            Y0.b bVar = this.f9388d.f8432d;
            synchronized (bVar) {
                Intrinsics.checkNotNullParameter(this, "call");
                ((ArrayDeque) bVar.f4389e).add(this);
            }
            return e();
        } finally {
            this.f9388d.f8432d.r(this);
        }
    }

    public final Object clone() {
        return new g(this.f9388d, this.f9389e);
    }

    public final void d(boolean z4) {
        F f4;
        synchronized (this) {
            if (!this.f9399r) {
                throw new IllegalStateException("released");
            }
            Unit unit = Unit.f7487a;
        }
        if (z4 && (f4 = this.f9401t) != null) {
            ((r3.d) f4.f1054d).cancel();
            ((g) f4.f1052b).f(f4, true, true, null);
        }
        this.f9396o = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final w e() {
        ArrayList arrayList = new ArrayList();
        C1400D.j(this.f9388d.f8434i, arrayList);
        arrayList.add(new r3.a(this.f9388d));
        arrayList.add(new r3.a(this.f9388d.f8441p));
        this.f9388d.getClass();
        arrayList.add(new o3.b());
        arrayList.add(a.f9363a);
        C1400D.j(this.f9388d.f8435j, arrayList);
        arrayList.add(new r3.b());
        q qVar = this.f9389e;
        r rVar = this.f9388d;
        boolean z4 = false;
        try {
            w b4 = new r3.f(this, arrayList, 0, null, qVar, rVar.B, rVar.f8429C, rVar.f8430D).b(this.f9389e);
            if (this.f9400s) {
                n3.b.c(b4);
                throw new IOException("Canceled");
            }
            g(null);
            return b4;
        } catch (IOException e4) {
            try {
                IOException g4 = g(e4);
                Intrinsics.d(g4, "null cannot be cast to non-null type kotlin.Throwable");
                throw g4;
            } catch (Throwable th) {
                th = th;
                z4 = true;
                if (!z4) {
                    g(null);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (!z4) {
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:51:0x0013, B:12:0x0022, B:14:0x0026, B:15:0x0028, B:17:0x002c, B:21:0x0035, B:23:0x0039, B:27:0x0042, B:9:0x001c), top: B:50:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0026 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:51:0x0013, B:12:0x0022, B:14:0x0026, B:15:0x0028, B:17:0x002c, B:21:0x0035, B:23:0x0039, B:27:0x0042, B:9:0x001c), top: B:50:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IOException f(F exchange, boolean z4, boolean z5, IOException iOException) {
        boolean z6;
        boolean z7;
        boolean z8;
        Intrinsics.checkNotNullParameter(exchange, "exchange");
        if (!Intrinsics.a(exchange, this.f9401t)) {
            return iOException;
        }
        synchronized (this) {
            z6 = false;
            if (z4) {
                try {
                    if (!this.f9397p) {
                    }
                    if (z4) {
                        this.f9397p = false;
                    }
                    if (z5) {
                        this.f9398q = false;
                    }
                    z8 = this.f9397p;
                    boolean z9 = z8 && !this.f9398q;
                    if (!z8 && !this.f9398q && !this.f9399r) {
                        z6 = true;
                    }
                    z7 = z6;
                    z6 = z9;
                    Unit unit = Unit.f7487a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!z5 || !this.f9398q) {
                z7 = false;
                Unit unit2 = Unit.f7487a;
            }
            if (z4) {
            }
            if (z5) {
            }
            z8 = this.f9397p;
            if (z8) {
            }
            if (!z8) {
                z6 = true;
            }
            z7 = z6;
            z6 = z9;
            Unit unit22 = Unit.f7487a;
        }
        if (z6) {
            this.f9401t = null;
            i iVar = this.f9395n;
            if (iVar != null) {
                synchronized (iVar) {
                    iVar.f9415m++;
                }
            }
        }
        return z7 ? b(iOException) : iOException;
    }

    public final IOException g(IOException iOException) {
        boolean z4;
        synchronized (this) {
            try {
                z4 = false;
                if (this.f9399r) {
                    this.f9399r = false;
                    if (!this.f9397p && !this.f9398q) {
                        z4 = true;
                    }
                }
                Unit unit = Unit.f7487a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z4 ? b(iOException) : iOException;
    }

    public final Socket h() {
        i connection = this.f9395n;
        Intrinsics.c(connection);
        byte[] bArr = n3.b.f8558a;
        ArrayList arrayList = connection.f9418p;
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (Intrinsics.a(((Reference) it.next()).get(), this)) {
                break;
            }
            i2++;
        }
        if (i2 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i2);
        this.f9395n = null;
        if (arrayList.isEmpty()) {
            connection.f9419q = System.nanoTime();
            j jVar = this.f9390i;
            jVar.getClass();
            Intrinsics.checkNotNullParameter(connection, "connection");
            byte[] bArr2 = n3.b.f8558a;
            boolean z4 = connection.f9412j;
            p3.c cVar = jVar.f9421b;
            if (z4) {
                connection.f9412j = true;
                ConcurrentLinkedQueue concurrentLinkedQueue = jVar.f9423d;
                concurrentLinkedQueue.remove(connection);
                if (concurrentLinkedQueue.isEmpty()) {
                    cVar.a();
                }
                Socket socket = connection.f9406d;
                Intrinsics.c(socket);
                return socket;
            }
            cVar.c(jVar.f9422c, 0L);
        }
        return null;
    }
}
