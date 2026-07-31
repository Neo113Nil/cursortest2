package b6;

import X5.C0217a;
import X5.z;
import e6.A;
import e6.C0355a;
import e6.C0357c;
import e6.D;
import e6.E;
import e6.EnumC0356b;
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

/* loaded from: classes.dex */
public final class r extends e6.n implements c6.e {

    /* renamed from: b, reason: collision with root package name */
    public final a6.e f3696b;

    /* renamed from: c, reason: collision with root package name */
    public final s f3697c;

    /* renamed from: d, reason: collision with root package name */
    public final z f3698d;

    /* renamed from: e, reason: collision with root package name */
    public final Socket f3699e;

    /* renamed from: f, reason: collision with root package name */
    public final Socket f3700f;

    /* renamed from: g, reason: collision with root package name */
    public final X5.m f3701g;

    /* renamed from: h, reason: collision with root package name */
    public final X5.t f3702h;

    /* renamed from: i, reason: collision with root package name */
    public final B0.c f3703i;

    /* renamed from: j, reason: collision with root package name */
    public final f f3704j;

    /* renamed from: k, reason: collision with root package name */
    public e6.r f3705k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3706l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3707m;

    /* renamed from: n, reason: collision with root package name */
    public int f3708n;

    /* renamed from: o, reason: collision with root package name */
    public int f3709o;

    /* renamed from: p, reason: collision with root package name */
    public int f3710p;

    /* renamed from: q, reason: collision with root package name */
    public int f3711q;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f3712r;

    /* renamed from: s, reason: collision with root package name */
    public long f3713s;

    public r(a6.e taskRunner, s connectionPool, z route, Socket rawSocket, Socket javaNetSocket, X5.m mVar, X5.t protocol, B0.c socket, f fVar) {
        kotlin.jvm.internal.i.e(taskRunner, "taskRunner");
        kotlin.jvm.internal.i.e(connectionPool, "connectionPool");
        kotlin.jvm.internal.i.e(route, "route");
        kotlin.jvm.internal.i.e(rawSocket, "rawSocket");
        kotlin.jvm.internal.i.e(javaNetSocket, "javaNetSocket");
        kotlin.jvm.internal.i.e(protocol, "protocol");
        kotlin.jvm.internal.i.e(socket, "socket");
        this.f3696b = taskRunner;
        this.f3697c = connectionPool;
        this.f3698d = route;
        this.f3699e = rawSocket;
        this.f3700f = javaNetSocket;
        this.f3701g = mVar;
        this.f3702h = protocol;
        this.f3703i = socket;
        this.f3704j = fVar;
        this.f3711q = 1;
        this.f3712r = new ArrayList();
        this.f3713s = Long.MAX_VALUE;
    }

    public static void d(X5.s client, z failedRoute, IOException failure) {
        kotlin.jvm.internal.i.e(client, "client");
        kotlin.jvm.internal.i.e(failedRoute, "failedRoute");
        kotlin.jvm.internal.i.e(failure, "failure");
        if (failedRoute.f3080b.type() != Proxy.Type.DIRECT) {
            C0217a c0217a = failedRoute.f3079a;
            c0217a.f2884g.connectFailed(c0217a.f2885h.g(), failedRoute.f3080b.address(), failure);
        }
        a6.d dVar = client.f3035z;
        synchronized (dVar) {
            ((LinkedHashSet) dVar.f3172f).add(failedRoute);
        }
    }

    @Override // e6.n
    public final void a(e6.r rVar, D settings) {
        kotlin.jvm.internal.i.e(settings, "settings");
        synchronized (this) {
            try {
                int i7 = this.f3711q;
                int i8 = (settings.f4034a & 8) != 0 ? settings.f4035b[3] : Integer.MAX_VALUE;
                this.f3711q = i8;
                if (i8 < i7) {
                    s sVar = this.f3697c;
                    C0217a address = this.f3698d.f3079a;
                    sVar.getClass();
                    kotlin.jvm.internal.i.e(address, "address");
                    if (sVar.f3716c.get(address) != null) {
                        throw new ClassCastException();
                    }
                } else if (i8 > i7) {
                    s sVar2 = this.f3697c;
                    sVar2.f3717d.d(sVar2.f3718e, 0L);
                }
            } finally {
            }
        }
    }

    @Override // c6.e
    public final void b(q qVar, IOException iOException) {
        synchronized (this) {
            try {
                if (!(iOException instanceof E)) {
                    if (!(this.f3705k != null) || (iOException instanceof C0355a)) {
                        this.f3706l = true;
                        if (this.f3709o == 0) {
                            if (iOException != null) {
                                d(qVar.f3680f, this.f3698d, iOException);
                            }
                            this.f3708n++;
                        }
                    }
                } else if (((E) iOException).f4036f == EnumC0356b.f4042l) {
                    int i7 = this.f3710p + 1;
                    this.f3710p = i7;
                    if (i7 > 1) {
                        this.f3706l = true;
                        this.f3708n++;
                    }
                } else if (((E) iOException).f4036f != EnumC0356b.f4043m || !qVar.f3693s) {
                    this.f3706l = true;
                    this.f3708n++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // e6.n
    public final void c(e6.z zVar) {
        zVar.e(EnumC0356b.f4042l, null);
    }

    @Override // c6.e
    public final void cancel() {
        Y5.e.c(this.f3699e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b2, code lost:
    
        if (l6.c.b(r6, (java.security.cert.X509Certificate) r12) != false) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(C0217a address, List list) {
        kotlin.jvm.internal.i.e(address, "address");
        X5.o oVar = address.f2885h;
        TimeZone timeZone = Y5.e.f3102a;
        if (this.f3712r.size() < this.f3711q && !this.f3706l) {
            z zVar = this.f3698d;
            C0217a c0217a = zVar.f3079a;
            C0217a c0217a2 = zVar.f3079a;
            if (c0217a.a(address)) {
                String str = oVar.f2977d;
                String hostname = oVar.f2977d;
                if (kotlin.jvm.internal.i.a(str, c0217a2.f2885h.f2977d)) {
                    return true;
                }
                if (this.f3705k != null && list != null && !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        z zVar2 = (z) it.next();
                        Proxy.Type type = zVar2.f3080b.type();
                        Proxy.Type type2 = Proxy.Type.DIRECT;
                        if (type == type2 && zVar.f3080b.type() == type2 && kotlin.jvm.internal.i.a(zVar.f3081c, zVar2.f3081c)) {
                            if (address.f2881d == l6.c.f5310a) {
                                TimeZone timeZone2 = Y5.e.f3102a;
                                X5.o oVar2 = c0217a2.f2885h;
                                if (oVar.f2978e == oVar2.f2978e) {
                                    boolean a7 = kotlin.jvm.internal.i.a(hostname, oVar2.f2977d);
                                    X5.m mVar = this.f3701g;
                                    if (!a7) {
                                        if (!this.f3707m && mVar != null) {
                                            List a8 = mVar.a();
                                            if (!a8.isEmpty()) {
                                                Object obj = a8.get(0);
                                                kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                                            }
                                        }
                                    }
                                    try {
                                        X5.d dVar = address.f2882e;
                                        kotlin.jvm.internal.i.b(dVar);
                                        kotlin.jvm.internal.i.b(mVar);
                                        List peerCertificates = mVar.a();
                                        kotlin.jvm.internal.i.e(hostname, "hostname");
                                        kotlin.jvm.internal.i.e(peerCertificates, "peerCertificates");
                                        Iterator it2 = dVar.f2906a.iterator();
                                        if (!it2.hasNext()) {
                                            return true;
                                        }
                                        it2.next().getClass();
                                        throw new ClassCastException();
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

    @Override // c6.e
    public final z f() {
        return this.f3698d;
    }

    public final boolean g(boolean z5) {
        long j4;
        TimeZone timeZone = Y5.e.f3102a;
        long nanoTime = System.nanoTime();
        if (this.f3699e.isClosed() || this.f3700f.isClosed() || this.f3700f.isInputShutdown() || this.f3700f.isOutputShutdown()) {
            return false;
        }
        e6.r rVar = this.f3705k;
        if (rVar != null) {
            synchronized (rVar) {
                if (rVar.f4109k) {
                    return false;
                }
                if (rVar.f4117s < rVar.f4116r) {
                    if (nanoTime >= rVar.f4118t) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j4 = nanoTime - this.f3713s;
        }
        if (j4 < 10000000000L || !z5) {
            return true;
        }
        Socket socket = this.f3700f;
        n6.q source = (n6.q) this.f3703i.f73i;
        kotlin.jvm.internal.i.e(socket, "<this>");
        kotlin.jvm.internal.i.e(source, "source");
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

    @Override // c6.e
    public final void h() {
        synchronized (this) {
            this.f3706l = true;
        }
        this.f3704j.getClass();
    }

    public final void i() {
        this.f3713s = System.nanoTime();
        X5.t tVar = this.f3702h;
        if (tVar == X5.t.f3040k || tVar == X5.t.f3041l) {
            this.f3700f.setSoTimeout(0);
            C0357c c0357c = C0357c.f4046a;
            A.e eVar = new A.e(this.f3696b);
            B0.c socket = this.f3703i;
            String peerName = this.f3698d.f3079a.f2885h.f2977d;
            kotlin.jvm.internal.i.e(socket, "socket");
            kotlin.jvm.internal.i.e(peerName, "peerName");
            eVar.f9i = socket;
            String str = Y5.e.f3103b + ' ' + peerName;
            kotlin.jvm.internal.i.e(str, "<set-?>");
            eVar.f7g = str;
            eVar.f10j = this;
            eVar.f11k = c0357c;
            e6.r rVar = new e6.r(eVar);
            this.f3705k = rVar;
            D d7 = e6.r.f4099E;
            this.f3711q = (d7.f4034a & 8) != 0 ? d7.f4035b[3] : Integer.MAX_VALUE;
            A a7 = rVar.f4101B;
            synchronized (a7) {
                try {
                    if (a7.f4028i) {
                        throw new IOException("closed");
                    }
                    Logger logger = A.f4024k;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(Y5.e.d(">> CONNECTION " + e6.h.f4073a.b(), new Object[0]));
                    }
                    a7.f4025f.u(e6.h.f4073a);
                    a7.f4025f.flush();
                } catch (Throwable th) {
                    throw th;
                }
            }
            A a8 = rVar.f4101B;
            D settings = rVar.f4120v;
            a8.getClass();
            kotlin.jvm.internal.i.e(settings, "settings");
            synchronized (a8) {
                try {
                    if (a8.f4028i) {
                        throw new IOException("closed");
                    }
                    a8.e(0, Integer.bitCount(settings.f4034a) * 6, 4, 0);
                    for (int i7 = 0; i7 < 10; i7++) {
                        boolean z5 = true;
                        if (((1 << i7) & settings.f4034a) == 0) {
                            z5 = false;
                        }
                        if (z5) {
                            a8.f4025f.writeShort(i7);
                            a8.f4025f.writeInt(settings.f4035b[i7]);
                        }
                    }
                    a8.f4025f.flush();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (rVar.f4120v.a() != 65535) {
                rVar.f4101B.v(r2 - 65535, 0);
            }
            a6.c.c(rVar.f4110l.d(), rVar.f4106h, rVar.f4102C);
        }
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        z zVar = this.f3698d;
        sb.append(zVar.f3079a.f2885h.f2977d);
        sb.append(':');
        sb.append(zVar.f3079a.f2885h.f2978e);
        sb.append(", proxy=");
        sb.append(zVar.f3080b);
        sb.append(" hostAddress=");
        sb.append(zVar.f3081c);
        sb.append(" cipherSuite=");
        X5.m mVar = this.f3701g;
        if (mVar == null || (obj = mVar.f2969b) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f3702h);
        sb.append('}');
        return sb.toString();
    }
}
