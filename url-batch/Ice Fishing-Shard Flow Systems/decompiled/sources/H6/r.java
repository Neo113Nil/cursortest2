package H6;

import D6.C0093a;
import D6.C0096d;
import D6.C0097e;
import D6.F;
import K6.A;
import K6.C0130a;
import K6.C0132c;
import K6.E;
import K6.EnumC0131b;
import K6.z;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r extends K6.n implements I6.f {

    /* renamed from: b, reason: collision with root package name */
    public final G6.d f1086b;

    /* renamed from: c, reason: collision with root package name */
    public final s f1087c;

    /* renamed from: d, reason: collision with root package name */
    public final F f1088d;

    /* renamed from: e, reason: collision with root package name */
    public final Socket f1089e;

    /* renamed from: f, reason: collision with root package name */
    public final Socket f1090f;

    /* renamed from: g, reason: collision with root package name */
    public final D6.p f1091g;

    /* renamed from: h, reason: collision with root package name */
    public final D6.x f1092h;

    /* renamed from: i, reason: collision with root package name */
    public final D0.j f1093i;
    public K6.r j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1094k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1095l;

    /* renamed from: m, reason: collision with root package name */
    public int f1096m;

    /* renamed from: n, reason: collision with root package name */
    public int f1097n;

    /* renamed from: o, reason: collision with root package name */
    public int f1098o;

    /* renamed from: p, reason: collision with root package name */
    public int f1099p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f1100q;

    /* renamed from: r, reason: collision with root package name */
    public long f1101r;

    public r(G6.d taskRunner, s connectionPool, F route, Socket rawSocket, Socket javaNetSocket, D6.p pVar, D6.x protocol, D0.j socket) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(rawSocket, "rawSocket");
        Intrinsics.checkNotNullParameter(javaNetSocket, "javaNetSocket");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(socket, "socket");
        e connectionListener = e.f1035a;
        Intrinsics.checkNotNullParameter(connectionListener, "connectionListener");
        this.f1086b = taskRunner;
        this.f1087c = connectionPool;
        this.f1088d = route;
        this.f1089e = rawSocket;
        this.f1090f = javaNetSocket;
        this.f1091g = pVar;
        this.f1092h = protocol;
        this.f1093i = socket;
        this.f1099p = 1;
        this.f1100q = new ArrayList();
        this.f1101r = Long.MAX_VALUE;
    }

    public static void c(D6.w client, F failedRoute, IOException failure) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
        Intrinsics.checkNotNullParameter(failure, "failure");
        if (failedRoute.f445b.type() != Proxy.Type.DIRECT) {
            C0093a c0093a = failedRoute.f444a;
            c0093a.f462g.connectFailed(c0093a.f463h.g(), failedRoute.f445b.address(), failure);
        }
        l2.c cVar = client.f622z;
        synchronized (cVar) {
            Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
            ((LinkedHashSet) cVar.f6269d).add(failedRoute);
        }
    }

    @Override // K6.n
    public final void a(K6.r connection, E settings) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(settings, "settings");
        synchronized (this) {
            try {
                int i2 = this.f1099p;
                int i5 = (settings.f1487a & 8) != 0 ? settings.f1488b[3] : Integer.MAX_VALUE;
                this.f1099p = i5;
                if (i5 < i2) {
                    s sVar = this.f1087c;
                    C0093a address = this.f1088d.f444a;
                    sVar.getClass();
                    Intrinsics.checkNotNullParameter(address, "address");
                    if (sVar.f1103b.get(address) != null) {
                        throw new ClassCastException();
                    }
                } else if (i5 > i2) {
                    s sVar2 = this.f1087c;
                    sVar2.f1104c.d(sVar2.f1105d, 0L);
                }
                Unit unit = Unit.f6114a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // K6.n
    public final void b(z stream) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        stream.d(EnumC0131b.f1495o, null);
    }

    @Override // I6.f
    public final void cancel() {
        E6.e.c(this.f1089e);
    }

    @Override // I6.f
    public final void d(q call, IOException iOException) {
        boolean z7;
        Intrinsics.checkNotNullParameter(call, "call");
        synchronized (this) {
            try {
                z7 = false;
                if (!(iOException instanceof K6.F)) {
                    if (!(this.j != null) || (iOException instanceof C0130a)) {
                        z7 = !this.f1094k;
                        this.f1094k = true;
                        if (this.f1097n == 0) {
                            if (iOException != null) {
                                c(call.f1070d, this.f1088d, iOException);
                            }
                            this.f1096m++;
                        }
                    }
                } else if (((K6.F) iOException).f1489d == EnumC0131b.f1495o) {
                    int i2 = this.f1098o + 1;
                    this.f1098o = i2;
                    if (i2 > 1) {
                        z7 = !this.f1094k;
                        this.f1094k = true;
                        this.f1096m++;
                    }
                } else if (((K6.F) iOException).f1489d != EnumC0131b.f1496p || !call.f1083v) {
                    z7 = !this.f1094k;
                    this.f1094k = true;
                    this.f1096m++;
                }
                Unit unit = Unit.f6114a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z7) {
            Intrinsics.checkNotNullParameter(this, "connection");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b0, code lost:
    
        if (R6.c.b(r5, (java.security.cert.X509Certificate) r11) != false) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(C0093a address, List list) {
        Intrinsics.checkNotNullParameter(address, "address");
        TimeZone timeZone = E6.e.f712a;
        int i2 = 0;
        if (this.f1100q.size() < this.f1099p && !this.f1094k) {
            F f7 = this.f1088d;
            C0093a c0093a = f7.f444a;
            C0093a c0093a2 = f7.f444a;
            boolean a7 = c0093a.a(address);
            D6.s sVar = address.f463h;
            if (a7) {
                String str = sVar.f565d;
                String hostname = sVar.f565d;
                if (Intrinsics.a(str, c0093a2.f463h.f565d)) {
                    return true;
                }
                if (this.j != null && list != null && !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        F f8 = (F) it.next();
                        Proxy.Type type = f8.f445b.type();
                        Proxy.Type type2 = Proxy.Type.DIRECT;
                        if (type == type2 && f7.f445b.type() == type2 && Intrinsics.a(f7.f446c, f8.f446c)) {
                            if (address.f459d == R6.c.f2443a) {
                                TimeZone timeZone2 = E6.e.f712a;
                                D6.s sVar2 = c0093a2.f463h;
                                if (sVar.f566e == sVar2.f566e) {
                                    boolean a8 = Intrinsics.a(hostname, sVar2.f565d);
                                    D6.p pVar = this.f1091g;
                                    if (!a8) {
                                        if (!this.f1095l && pVar != null) {
                                            List a9 = pVar.a();
                                            if (!a9.isEmpty()) {
                                                Object obj = a9.get(0);
                                                Intrinsics.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                                            }
                                        }
                                    }
                                    try {
                                        C0097e c0097e = address.f460e;
                                        Intrinsics.b(c0097e);
                                        Intrinsics.b(pVar);
                                        List peerCertificates = pVar.a();
                                        Intrinsics.checkNotNullParameter(hostname, "hostname");
                                        Intrinsics.checkNotNullParameter(peerCertificates, "peerCertificates");
                                        c0097e.a(hostname, new C0096d(c0097e, peerCertificates, hostname, i2));
                                        return true;
                                    } catch (SSLPeerUnverifiedException unused) {
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // I6.f
    public final F f() {
        return this.f1088d;
    }

    public final boolean g(boolean z7) {
        long j;
        TimeZone timeZone = E6.e.f712a;
        long nanoTime = System.nanoTime();
        if (this.f1089e.isClosed() || this.f1090f.isClosed() || this.f1090f.isInputShutdown() || this.f1090f.isOutputShutdown()) {
            return false;
        }
        K6.r rVar = this.j;
        if (rVar != null) {
            synchronized (rVar) {
                if (rVar.f1567n) {
                    return false;
                }
                if (rVar.f1575v < rVar.f1574u) {
                    if (nanoTime >= rVar.f1576w) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j = nanoTime - this.f1101r;
        }
        if (j < 10000000000L || !z7) {
            return true;
        }
        Socket socket = this.f1090f;
        T6.q source = (T6.q) this.f1093i.f331i;
        Intrinsics.checkNotNullParameter(socket, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !source.a();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    @Override // I6.f
    public final void h() {
        synchronized (this) {
            this.f1094k = true;
            Unit unit = Unit.f6114a;
        }
        Intrinsics.checkNotNullParameter(this, "connection");
    }

    public final void i() {
        this.f1101r = System.nanoTime();
        D6.x xVar = this.f1092h;
        if (xVar == D6.x.f627n || xVar == D6.x.f628o) {
            this.f1090f.setSoTimeout(0);
            C0132c flowControlListener = C0132c.f1499a;
            G6.d taskRunner = this.f1086b;
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            D6.y yVar = new D6.y();
            yVar.f634e = taskRunner;
            yVar.f636l = K6.n.f1545a;
            yVar.f637m = C0132c.f1499a;
            D0.j socket = this.f1093i;
            String peerName = this.f1088d.f444a.f463h.f565d;
            Intrinsics.checkNotNullParameter(socket, "socket");
            Intrinsics.checkNotNullParameter(peerName, "peerName");
            Intrinsics.checkNotNullParameter(socket, "<set-?>");
            yVar.f635i = socket;
            String str = E6.e.f713b + ' ' + peerName;
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            yVar.f633d = str;
            Intrinsics.checkNotNullParameter(this, "listener");
            yVar.f636l = this;
            Intrinsics.checkNotNullParameter(flowControlListener, "flowControlListener");
            yVar.f637m = flowControlListener;
            K6.r rVar = new K6.r(yVar);
            this.j = rVar;
            E e7 = K6.r.f1554H;
            this.f1099p = (e7.f1487a & 8) != 0 ? e7.f1488b[3] : Integer.MAX_VALUE;
            A a7 = rVar.f1559E;
            synchronized (a7) {
                try {
                    if (a7.f1478l) {
                        throw new IOException("closed");
                    }
                    Logger logger = A.f1474n;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(E6.e.d(">> CONNECTION " + K6.h.f1526a.b(), new Object[0]));
                    }
                    a7.f1475d.z(K6.h.f1526a);
                    a7.f1475d.flush();
                    Unit unit = Unit.f6114a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            A a8 = rVar.f1559E;
            E settings = rVar.f1578y;
            a8.getClass();
            Intrinsics.checkNotNullParameter(settings, "settings");
            synchronized (a8) {
                try {
                    if (a8.f1478l) {
                        throw new IOException("closed");
                    }
                    a8.g(0, Integer.bitCount(settings.f1487a) * 6, 4, 0);
                    for (int i2 = 0; i2 < 10; i2++) {
                        boolean z7 = true;
                        if (((1 << i2) & settings.f1487a) == 0) {
                            z7 = false;
                        }
                        if (z7) {
                            a8.f1475d.writeShort(i2);
                            a8.f1475d.writeInt(settings.f1488b[i2]);
                        }
                    }
                    a8.f1475d.flush();
                    Unit unit2 = Unit.f6114a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (rVar.f1578y.a() != 65535) {
                rVar.f1559E.B(r2 - 65535, 0);
            }
            G6.c.c(rVar.f1568o.d(), rVar.f1564i, rVar.f1560F);
        }
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        F f7 = this.f1088d;
        sb.append(f7.f444a.f463h.f565d);
        sb.append(':');
        sb.append(f7.f444a.f463h.f566e);
        sb.append(", proxy=");
        sb.append(f7.f445b);
        sb.append(" hostAddress=");
        sb.append(f7.f446c);
        sb.append(" cipherSuite=");
        D6.p pVar = this.f1091g;
        if (pVar == null || (obj = pVar.f549b) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f1092h);
        sb.append('}');
        return sb.toString();
    }
}
