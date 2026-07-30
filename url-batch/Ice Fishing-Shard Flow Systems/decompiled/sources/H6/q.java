package H6;

import D6.C;
import D6.C0093a;
import D6.z;
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
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q implements Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public final D6.w f1070d;

    /* renamed from: e, reason: collision with root package name */
    public final z f1071e;

    /* renamed from: i, reason: collision with root package name */
    public final s f1072i;

    /* renamed from: l, reason: collision with root package name */
    public final p f1073l;

    /* renamed from: m, reason: collision with root package name */
    public final AtomicBoolean f1074m;

    /* renamed from: n, reason: collision with root package name */
    public Object f1075n;

    /* renamed from: o, reason: collision with root package name */
    public i f1076o;

    /* renamed from: p, reason: collision with root package name */
    public r f1077p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1078q;

    /* renamed from: r, reason: collision with root package name */
    public h f1079r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1080s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1081t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1082u;

    /* renamed from: v, reason: collision with root package name */
    public volatile boolean f1083v;

    /* renamed from: w, reason: collision with root package name */
    public volatile h f1084w;

    /* renamed from: x, reason: collision with root package name */
    public final CopyOnWriteArrayList f1085x;

    public q(D6.w client, z originalRequest) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        this.f1070d = client;
        this.f1071e = originalRequest;
        this.f1072i = (s) client.f597B.f152e;
        client.f601d.getClass();
        Intrinsics.checkNotNullParameter(this, "it");
        p pVar = new p(this);
        long j = client.f618v;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        pVar.g(j);
        this.f1073l = pVar;
        this.f1074m = new AtomicBoolean();
        this.f1082u = true;
        this.f1085x = new CopyOnWriteArrayList();
    }

    public static final String a(q qVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(qVar.f1083v ? "canceled " : "");
        sb.append("call");
        sb.append(" to ");
        sb.append(((D6.s) qVar.f1071e.f640c).f());
        return sb.toString();
    }

    public final IOException b(IOException iOException) {
        IOException ioe;
        Socket h7;
        TimeZone timeZone = E6.e.f712a;
        r connection = this.f1077p;
        if (connection != null) {
            synchronized (connection) {
                h7 = h();
            }
            if (this.f1077p == null) {
                if (h7 != null) {
                    E6.e.c(h7);
                }
                Intrinsics.checkNotNullParameter(this, "call");
                Intrinsics.checkNotNullParameter(connection, "connection");
                Intrinsics.checkNotNullParameter(connection, "connection");
                Intrinsics.checkNotNullParameter(this, "call");
                if (h7 != null) {
                    Intrinsics.checkNotNullParameter(connection, "connection");
                }
            } else if (h7 != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (!this.f1078q && this.f1073l.i()) {
            ioe = new InterruptedIOException("timeout");
            if (iOException != null) {
                ioe.initCause(iOException);
            }
        } else {
            ioe = iOException;
        }
        if (iOException == null) {
            Intrinsics.checkNotNullParameter(this, "call");
            return ioe;
        }
        Intrinsics.b(ioe);
        Intrinsics.checkNotNullParameter(this, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
        return ioe;
    }

    public final void c() {
        if (this.f1083v) {
            return;
        }
        this.f1083v = true;
        h hVar = this.f1084w;
        if (hVar != null) {
            ((I6.g) hVar.f1054e).cancel();
        }
        Iterator it = this.f1085x.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            ((w) it.next()).cancel();
        }
        Intrinsics.checkNotNullParameter(this, "call");
    }

    public final Object clone() {
        return new q(this.f1070d, this.f1071e);
    }

    public final void d(boolean z7) {
        h hVar;
        synchronized (this) {
            if (!this.f1082u) {
                throw new IllegalStateException("released");
            }
            Unit unit = Unit.f6114a;
        }
        if (z7 && (hVar = this.f1084w) != null) {
            ((I6.g) hVar.f1054e).cancel();
            ((q) hVar.f1052c).f(hVar, true, true, null);
        }
        this.f1079r = null;
    }

    public final C e() {
        ArrayList arrayList = new ArrayList();
        kotlin.collections.w.h(this.f1070d.f599b, arrayList);
        arrayList.add(new I6.a(this.f1070d));
        arrayList.add(new I6.a(this.f1070d.j));
        this.f1070d.getClass();
        arrayList.add(new F6.a());
        arrayList.add(b.f1013a);
        kotlin.collections.w.h(this.f1070d.f600c, arrayList);
        arrayList.add(I6.c.f1293a);
        z zVar = this.f1071e;
        D6.w wVar = this.f1070d;
        boolean z7 = false;
        try {
            try {
                C b7 = new I6.i(this, arrayList, 0, null, zVar, wVar.f619w, wVar.f620x, wVar.f621y).b(this.f1071e);
                if (this.f1083v) {
                    E6.c.a(b7);
                    throw new IOException("Canceled");
                }
                g(null);
                return b7;
            } catch (IOException e7) {
                z7 = true;
                IOException g7 = g(e7);
                Intrinsics.c(g7, "null cannot be cast to non-null type kotlin.Throwable");
                throw g7;
            }
        } catch (Throwable th) {
            if (!z7) {
                g(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:48:0x0013, B:10:0x0022, B:12:0x0026, B:13:0x0028, B:15:0x002c, B:19:0x0035, B:21:0x0039, B:25:0x0042, B:7:0x001c), top: B:47:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0026 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:48:0x0013, B:10:0x0022, B:12:0x0026, B:13:0x0028, B:15:0x002c, B:19:0x0035, B:21:0x0039, B:25:0x0042, B:7:0x001c), top: B:47:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IOException f(h exchange, boolean z7, boolean z8, IOException iOException) {
        boolean z9;
        boolean z10;
        boolean z11;
        Intrinsics.checkNotNullParameter(exchange, "exchange");
        if (Intrinsics.a(exchange, this.f1084w)) {
            synchronized (this) {
                z9 = false;
                if (z7) {
                    try {
                        if (!this.f1080s) {
                        }
                        if (z7) {
                            this.f1080s = false;
                        }
                        if (z8) {
                            this.f1081t = false;
                        }
                        z11 = this.f1080s;
                        boolean z12 = z11 && !this.f1081t;
                        if (!z11 && !this.f1081t && !this.f1082u) {
                            z9 = true;
                        }
                        z10 = z9;
                        z9 = z12;
                        Unit unit = Unit.f6114a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (!z8 || !this.f1081t) {
                    z10 = false;
                    Unit unit2 = Unit.f6114a;
                }
                if (z7) {
                }
                if (z8) {
                }
                z11 = this.f1080s;
                if (z11) {
                }
                if (!z11) {
                    z9 = true;
                }
                z10 = z9;
                z9 = z12;
                Unit unit22 = Unit.f6114a;
            }
            if (z9) {
                this.f1084w = null;
                r rVar = this.f1077p;
                if (rVar != null) {
                    synchronized (rVar) {
                        rVar.f1097n++;
                    }
                }
            }
            if (z10) {
                return b(iOException);
            }
        }
        return iOException;
    }

    public final IOException g(IOException iOException) {
        boolean z7;
        synchronized (this) {
            try {
                z7 = false;
                if (this.f1082u) {
                    this.f1082u = false;
                    if (!this.f1080s && !this.f1081t) {
                        z7 = true;
                    }
                }
                Unit unit = Unit.f6114a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z7 ? b(iOException) : iOException;
    }

    public final Socket h() {
        r connection = this.f1077p;
        Intrinsics.b(connection);
        TimeZone timeZone = E6.e.f712a;
        ArrayList arrayList = connection.f1100q;
        int size = arrayList.size();
        int i2 = 0;
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                i2 = -1;
                break;
            }
            Object obj = arrayList.get(i5);
            i5++;
            if (Intrinsics.a(((Reference) obj).get(), this)) {
                break;
            }
            i2++;
        }
        if (i2 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i2);
        this.f1077p = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        connection.f1101r = System.nanoTime();
        s sVar = this.f1072i;
        ConcurrentLinkedQueue concurrentLinkedQueue = sVar.f1106e;
        Intrinsics.checkNotNullParameter(connection, "connection");
        TimeZone timeZone2 = E6.e.f712a;
        if (!connection.f1094k) {
            sVar.f1104c.d(sVar.f1105d, 0L);
            return null;
        }
        connection.f1094k = true;
        concurrentLinkedQueue.remove(connection);
        if (concurrentLinkedQueue.isEmpty()) {
            sVar.f1104c.a();
        }
        C0093a address = connection.f1088d.f444a;
        Intrinsics.checkNotNullParameter(address, "address");
        if (sVar.f1103b.get(address) == null) {
            return connection.f1090f;
        }
        throw new ClassCastException();
    }
}
