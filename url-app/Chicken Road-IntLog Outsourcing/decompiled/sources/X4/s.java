package X4;

import T4.C;
import T4.C0151a;
import T4.C0154d;
import a5.B;
import a5.C0199a;
import a5.C0201c;
import a5.EnumC0200b;
import a5.F;
import a5.G;
import b2.AbstractC0279e;
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
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class s extends a5.p implements Y4.f {

    /* renamed from: b, reason: collision with root package name */
    public final W4.d f3605b;

    /* renamed from: c, reason: collision with root package name */
    public final t f3606c;

    /* renamed from: d, reason: collision with root package name */
    public final C f3607d;

    /* renamed from: e, reason: collision with root package name */
    public final Socket f3608e;

    /* renamed from: f, reason: collision with root package name */
    public final Socket f3609f;

    /* renamed from: g, reason: collision with root package name */
    public final T4.n f3610g;

    /* renamed from: h, reason: collision with root package name */
    public final T4.v f3611h;

    /* renamed from: i, reason: collision with root package name */
    public final B4.i f3612i;

    /* renamed from: j, reason: collision with root package name */
    public final int f3613j;

    /* renamed from: k, reason: collision with root package name */
    public final f f3614k;

    /* renamed from: l, reason: collision with root package name */
    public a5.t f3615l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3616m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3617n;

    /* renamed from: o, reason: collision with root package name */
    public int f3618o;

    /* renamed from: p, reason: collision with root package name */
    public int f3619p;

    /* renamed from: q, reason: collision with root package name */
    public int f3620q;

    /* renamed from: r, reason: collision with root package name */
    public int f3621r;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f3622s;

    /* renamed from: t, reason: collision with root package name */
    public long f3623t;

    public s(W4.d taskRunner, t connectionPool, C route, Socket rawSocket, Socket javaNetSocket, T4.n nVar, T4.v protocol, B4.i socket, int i2, f fVar) {
        kotlin.jvm.internal.i.e(taskRunner, "taskRunner");
        kotlin.jvm.internal.i.e(connectionPool, "connectionPool");
        kotlin.jvm.internal.i.e(route, "route");
        kotlin.jvm.internal.i.e(rawSocket, "rawSocket");
        kotlin.jvm.internal.i.e(javaNetSocket, "javaNetSocket");
        kotlin.jvm.internal.i.e(protocol, "protocol");
        kotlin.jvm.internal.i.e(socket, "socket");
        this.f3605b = taskRunner;
        this.f3606c = connectionPool;
        this.f3607d = route;
        this.f3608e = rawSocket;
        this.f3609f = javaNetSocket;
        this.f3610g = nVar;
        this.f3611h = protocol;
        this.f3612i = socket;
        this.f3613j = i2;
        this.f3614k = fVar;
        this.f3621r = 1;
        this.f3622s = new ArrayList();
        this.f3623t = Long.MAX_VALUE;
    }

    public static void c(T4.u client, C failedRoute, IOException failure) {
        kotlin.jvm.internal.i.e(client, "client");
        kotlin.jvm.internal.i.e(failedRoute, "failedRoute");
        kotlin.jvm.internal.i.e(failure, "failure");
        if (failedRoute.f2806b.type() != Proxy.Type.DIRECT) {
            C0151a c0151a = failedRoute.f2805a;
            c0151a.f2823g.connectFailed(c0151a.f2824h.g(), failedRoute.f2806b.address(), failure);
        }
        V0.j jVar = client.z;
        synchronized (jVar) {
            ((LinkedHashSet) jVar.f3212b).add(failedRoute);
        }
    }

    @Override // a5.p
    public final void a(a5.t connection, F settings) {
        kotlin.jvm.internal.i.e(connection, "connection");
        kotlin.jvm.internal.i.e(settings, "settings");
        synchronized (this) {
            try {
                int i2 = this.f3621r;
                int i3 = (settings.f3913a & 8) != 0 ? settings.f3914b[3] : Integer.MAX_VALUE;
                this.f3621r = i3;
                if (i3 < i2) {
                    t tVar = this.f3606c;
                    C0151a address = this.f3607d.f2805a;
                    tVar.getClass();
                    kotlin.jvm.internal.i.e(address, "address");
                    AbstractC0279e.o(tVar.f3627d.get(address));
                } else if (i3 > i2) {
                    t tVar2 = this.f3606c;
                    tVar2.f3628e.d(tVar2.f3629f, 0L);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a5.p
    public final void b(B b6) {
        b6.c(EnumC0200b.f3921g, null);
    }

    @Override // Y4.f
    public final void cancel() {
        U4.e.c(this.f3608e);
    }

    @Override // Y4.f
    public final void d(r call, IOException iOException) {
        kotlin.jvm.internal.i.e(call, "call");
        synchronized (this) {
            try {
                if (!(iOException instanceof G)) {
                    if (!(this.f3615l != null) || (iOException instanceof C0199a)) {
                        this.f3616m = true;
                        if (this.f3619p == 0) {
                            if (iOException != null) {
                                c(call.f3589a, this.f3607d, iOException);
                            }
                            this.f3618o++;
                        }
                    }
                } else if (((G) iOException).f3915a == EnumC0200b.f3921g) {
                    int i2 = this.f3620q + 1;
                    this.f3620q = i2;
                    if (i2 > 1) {
                        this.f3616m = true;
                        this.f3618o++;
                    }
                } else if (((G) iOException).f3915a != EnumC0200b.f3922h || !call.f3602n) {
                    this.f3616m = true;
                    this.f3618o++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b0, code lost:
    
        if (h5.c.b(r1, (java.security.cert.X509Certificate) r11) != false) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(C0151a address, List list) {
        kotlin.jvm.internal.i.e(address, "address");
        TimeZone timeZone = U4.e.f3179a;
        if (this.f3622s.size() < this.f3621r && !this.f3616m) {
            C c2 = this.f3607d;
            if (!c2.f2805a.a(address)) {
                return false;
            }
            T4.q qVar = address.f2824h;
            String str = qVar.f2926d;
            C0151a c0151a = c2.f2805a;
            if (kotlin.jvm.internal.i.a(str, c0151a.f2824h.f2926d)) {
                return true;
            }
            if (this.f3615l != null && list != null && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C c6 = (C) it.next();
                    Proxy.Type type = c6.f2806b.type();
                    Proxy.Type type2 = Proxy.Type.DIRECT;
                    if (type == type2 && c2.f2806b.type() == type2) {
                        if (kotlin.jvm.internal.i.a(c2.f2807c, c6.f2807c)) {
                            if (address.f2820d != h5.c.f5827a) {
                                return false;
                            }
                            TimeZone timeZone2 = U4.e.f3179a;
                            T4.q qVar2 = c0151a.f2824h;
                            if (qVar.f2927e == qVar2.f2927e) {
                                String str2 = qVar2.f2926d;
                                String hostname = qVar.f2926d;
                                boolean a6 = kotlin.jvm.internal.i.a(hostname, str2);
                                T4.n nVar = this.f3610g;
                                if (!a6) {
                                    if (!this.f3617n && nVar != null) {
                                        List a7 = nVar.a();
                                        if (!a7.isEmpty()) {
                                            Object obj = a7.get(0);
                                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                                        }
                                    }
                                }
                                try {
                                    C0154d c0154d = address.f2821e;
                                    kotlin.jvm.internal.i.b(c0154d);
                                    kotlin.jvm.internal.i.b(nVar);
                                    List peerCertificates = nVar.a();
                                    kotlin.jvm.internal.i.e(hostname, "hostname");
                                    kotlin.jvm.internal.i.e(peerCertificates, "peerCertificates");
                                    Iterator it2 = c0154d.f2845a.iterator();
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
        return false;
    }

    @Override // Y4.f
    public final C f() {
        return this.f3607d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0040, code lost:
    
        if (r0 >= r2.f4003p) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(boolean z) {
        long j2;
        TimeZone timeZone = U4.e.f3179a;
        long nanoTime = System.nanoTime();
        if (this.f3608e.isClosed() || this.f3609f.isClosed() || this.f3609f.isInputShutdown() || this.f3609f.isOutputShutdown()) {
            return false;
        }
        a5.t tVar = this.f3615l;
        if (tVar != null) {
            synchronized (tVar) {
                if (!tVar.f3993f) {
                    if (tVar.f4002o < tVar.f4001n) {
                    }
                    return true;
                }
                return false;
            }
        }
        synchronized (this) {
            j2 = nanoTime - this.f3623t;
        }
        if (j2 < 10000000000L || !z) {
            return true;
        }
        Socket socket = this.f3609f;
        j5.q source = (j5.q) this.f3612i.f312c;
        kotlin.jvm.internal.i.e(socket, "<this>");
        kotlin.jvm.internal.i.e(source, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                boolean z5 = !source.a();
                socket.setSoTimeout(soTimeout);
                return z5;
            } catch (Throwable th) {
                socket.setSoTimeout(soTimeout);
                throw th;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    @Override // Y4.f
    public final void h() {
        synchronized (this) {
            this.f3616m = true;
        }
        this.f3614k.getClass();
    }

    public final void i() {
        this.f3623t = System.nanoTime();
        T4.v vVar = this.f3611h;
        if (vVar == T4.v.f2989f || vVar == T4.v.f2990g) {
            this.f3609f.setSoTimeout(0);
            C0201c c0201c = C0201c.f3925a;
            a5.n nVar = new a5.n(this.f3605b);
            B4.i socket = this.f3612i;
            String peerName = this.f3607d.f2805a.f2824h.f2926d;
            kotlin.jvm.internal.i.e(socket, "socket");
            kotlin.jvm.internal.i.e(peerName, "peerName");
            nVar.f3974c = socket;
            String str = U4.e.f3180b + ' ' + peerName;
            kotlin.jvm.internal.i.e(str, "<set-?>");
            nVar.f3975d = str;
            nVar.f3976e = this;
            nVar.f3972a = this.f3613j;
            nVar.f3977f = c0201c;
            a5.t tVar = new a5.t(nVar);
            this.f3615l = tVar;
            F f3 = a5.t.f3987A;
            this.f3621r = (f3.f3913a & 8) != 0 ? f3.f3914b[3] : Integer.MAX_VALUE;
            a5.C c2 = tVar.f4011x;
            synchronized (c2) {
                try {
                    if (c2.f3907d) {
                        throw new IOException("closed");
                    }
                    Logger logger = a5.C.f3903f;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(U4.e.e(">> CONNECTION " + a5.h.f3953a.b(), new Object[0]));
                    }
                    c2.f3904a.u(a5.h.f3953a);
                    c2.f3904a.flush();
                } catch (Throwable th) {
                    throw th;
                }
            }
            a5.C c6 = tVar.f4011x;
            F settings = tVar.f4005r;
            c6.getClass();
            kotlin.jvm.internal.i.e(settings, "settings");
            synchronized (c6) {
                try {
                    if (c6.f3907d) {
                        throw new IOException("closed");
                    }
                    c6.c(0, Integer.bitCount(settings.f3913a) * 6, 4, 0);
                    for (int i2 = 0; i2 < 10; i2++) {
                        boolean z = true;
                        if (((1 << i2) & settings.f3913a) == 0) {
                            z = false;
                        }
                        if (z) {
                            j5.p pVar = c6.f3904a;
                            if (pVar.f10517c) {
                                throw new IllegalStateException("closed");
                            }
                            j5.f fVar = pVar.f10516b;
                            j5.r F2 = fVar.F(2);
                            int i3 = F2.f10523c;
                            byte b6 = (byte) ((i2 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                            byte[] bArr = F2.f10521a;
                            bArr[i3] = b6;
                            bArr[i3 + 1] = (byte) (i2 & KotlinVersion.MAX_COMPONENT_VALUE);
                            F2.f10523c = i3 + 2;
                            fVar.f10495b += 2;
                            pVar.a();
                            c6.f3904a.b(settings.f3914b[i2]);
                        }
                    }
                    c6.f3904a.flush();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (tVar.f4005r.a() != 65535) {
                tVar.f4011x.y(0, r2 - 65535);
            }
            W4.c.c(tVar.f3994g.d(), tVar.f3990c, tVar.f4012y);
        }
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        C c2 = this.f3607d;
        sb.append(c2.f2805a.f2824h.f2926d);
        sb.append(':');
        sb.append(c2.f2805a.f2824h.f2927e);
        sb.append(", proxy=");
        sb.append(c2.f2806b);
        sb.append(" hostAddress=");
        sb.append(c2.f2807c);
        sb.append(" cipherSuite=");
        T4.n nVar = this.f3610g;
        if (nVar == null || (obj = nVar.f2910b) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f3611h);
        sb.append('}');
        return sb.toString();
    }
}
