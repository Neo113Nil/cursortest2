package defpackage;

import com.facebook.appevents.integrity.IntegrityManager;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class v62 extends oy0 {
    public final ac2 b;
    public Socket c;
    public Socket d;
    public dx0 e;
    public s52 f;
    public vy0 g;
    public p62 h;
    public n62 i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final ArrayList p;
    public long q;

    public v62(w62 w62Var, ac2 ac2Var) {
        w62Var.getClass();
        ac2Var.getClass();
        this.b = ac2Var;
        this.o = 1;
        this.p = new ArrayList();
        this.q = Long.MAX_VALUE;
    }

    public static void d(fu1 fu1Var, ac2 ac2Var, IOException iOException) {
        ac2Var.getClass();
        iOException.getClass();
        if (ac2Var.b.type() != Proxy.Type.DIRECT) {
            k5 k5Var = ac2Var.a;
            k5Var.g.connectFailed(k5Var.h.g(), ac2Var.b.address(), iOException);
        }
        at0 at0Var = fu1Var.K;
        synchronized (at0Var) {
            ((LinkedHashSet) at0Var.m).add(ac2Var);
        }
    }

    @Override // defpackage.oy0
    public final synchronized void a(vy0 vy0Var, tj2 tj2Var) {
        tj2Var.getClass();
        this.o = (tj2Var.a & 16) != 0 ? tj2Var.b[4] : Integer.MAX_VALUE;
    }

    @Override // defpackage.oy0
    public final void b(cz0 cz0Var) {
        cz0Var.c(8, null);
    }

    public final void c(int i, int i2, int i3, boolean z, t62 t62Var) {
        ac2 ac2Var;
        if (this.f != null) {
            lh.g("already connected");
            return;
        }
        List list = this.b.a.j;
        g10 g10Var = new g10(list);
        k5 k5Var = this.b.a;
        if (k5Var.c == null) {
            if (!list.contains(f10.f)) {
                throw new bc2(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.b.a.h.d;
            r12 r12Var = r12.a;
            if (!r12.a.h(str)) {
                throw new bc2(new UnknownServiceException(q40.m("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (k5Var.i.contains(s52.H2_PRIOR_KNOWLEDGE)) {
            throw new bc2(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        bc2 bc2Var = null;
        do {
            try {
                ac2 ac2Var2 = this.b;
                if (ac2Var2.a.c != null && ac2Var2.b.type() == Proxy.Type.HTTP) {
                    f(i, i2, i3, t62Var);
                    if (this.c == null) {
                        ac2Var = this.b;
                        if (ac2Var.a.c == null && ac2Var.b.type() == Proxy.Type.HTTP && this.c == null) {
                            throw new bc2(new ProtocolException("Too many tunnel connections attempted: 21"));
                        }
                        this.q = System.nanoTime();
                        return;
                    }
                } else {
                    e(i, i2, t62Var);
                }
                g(g10Var, t62Var);
                this.b.c.getClass();
                ac2Var = this.b;
                if (ac2Var.a.c == null) {
                }
                this.q = System.nanoTime();
                return;
            } catch (IOException e) {
                Socket socket = this.d;
                if (socket != null) {
                    n33.c(socket);
                }
                Socket socket2 = this.c;
                if (socket2 != null) {
                    n33.c(socket2);
                }
                this.d = null;
                this.c = null;
                this.h = null;
                this.i = null;
                this.e = null;
                this.f = null;
                this.g = null;
                this.o = 1;
                this.b.c.getClass();
                if (bc2Var == null) {
                    bc2Var = new bc2(e);
                } else {
                    wi0.a(bc2Var.m, e);
                    bc2Var.n = e;
                }
                if (!z) {
                    throw bc2Var;
                }
                g10Var.c = true;
                if (!g10Var.b) {
                    throw bc2Var;
                }
                if (e instanceof ProtocolException) {
                    throw bc2Var;
                }
                if (e instanceof InterruptedIOException) {
                    throw bc2Var;
                }
                if ((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) {
                    throw bc2Var;
                }
                if (e instanceof SSLPeerUnverifiedException) {
                    throw bc2Var;
                }
            }
        } while (e instanceof SSLException);
        throw bc2Var;
    }

    public final void e(int i, int i2, t62 t62Var) {
        Socket createSocket;
        ac2 ac2Var = this.b;
        Proxy proxy = ac2Var.b;
        k5 k5Var = ac2Var.a;
        Proxy.Type type = proxy.type();
        int i3 = type == null ? -1 : u62.a[type.ordinal()];
        if (i3 == 1 || i3 == 2) {
            createSocket = k5Var.b.createSocket();
            createSocket.getClass();
        } else {
            createSocket = new Socket(proxy);
        }
        this.c = createSocket;
        this.b.c.getClass();
        createSocket.setSoTimeout(i2);
        try {
            r12 r12Var = r12.a;
            r12.a.e(createSocket, this.b.c, i);
            try {
                Logger logger = gu1.a;
                jn2 jn2Var = new jn2(createSocket);
                InputStream inputStream = createSocket.getInputStream();
                inputStream.getClass();
                this.h = new p62(new qj(jn2Var, new qj(inputStream, jn2Var)));
                jn2 jn2Var2 = new jn2(createSocket);
                OutputStream outputStream = createSocket.getOutputStream();
                outputStream.getClass();
                this.i = new n62(new pj(jn2Var2, new pj(outputStream, jn2Var2)));
            } catch (NullPointerException e) {
                if (Intrinsics.b(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.b.c);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final void f(int i, int i2, int i3, t62 t62Var) {
        js0 js0Var = new js0(8);
        ac2 ac2Var = this.b;
        kz0 kz0Var = ac2Var.a.h;
        kz0Var.getClass();
        js0Var.m = kz0Var;
        js0Var.B("CONNECT", null);
        k5 k5Var = ac2Var.a;
        js0Var.y("Host", n33.s(k5Var.h, true));
        js0Var.y("Proxy-Connection", "Keep-Alive");
        js0Var.y("User-Agent", "okhttp/4.12.0");
        fy c = js0Var.c();
        ArrayList arrayList = new ArrayList(20);
        z71.h("Proxy-Authenticate");
        z71.i("OkHttp-Preemptive", "Proxy-Authenticate");
        int i4 = 0;
        while (i4 < arrayList.size()) {
            if ("Proxy-Authenticate".equalsIgnoreCase((String) arrayList.get(i4))) {
                arrayList.remove(i4);
                arrayList.remove(i4);
                i4 -= 2;
            }
            i4 += 2;
        }
        arrayList.add("Proxy-Authenticate");
        arrayList.add(up2.K("OkHttp-Preemptive").toString());
        k5Var.f.getClass();
        kz0 kz0Var2 = (kz0) c.n;
        e(i, i2, t62Var);
        String str = "CONNECT " + n33.s(kz0Var2, true) + " HTTP/1.1";
        p62 p62Var = this.h;
        p62Var.getClass();
        n62 n62Var = this.i;
        n62Var.getClass();
        ly0 ly0Var = new ly0(null, this, p62Var, n62Var);
        p62Var.m.e().g(i2);
        n62Var.m.e().g(i3);
        ly0Var.i((mx0) c.p, str);
        ly0Var.b();
        v92 f = ly0Var.f(false);
        f.getClass();
        f.a = c;
        w92 a = f.a();
        int i5 = a.p;
        long h = n33.h(a);
        if (h != -1) {
            jy0 h2 = ly0Var.h(h);
            n33.q(h2, Integer.MAX_VALUE);
            h2.close();
        }
        if (i5 == 200) {
            if (p62Var.n.m() && n62Var.n.m()) {
                return;
            }
            dm0.j("TLS tunnel buffered too many bytes!");
            return;
        }
        if (i5 != 407) {
            dm0.j(in1.k(i5, "Unexpected response code for CONNECT: "));
        } else {
            k5Var.f.getClass();
            dm0.j("Failed to authenticate with proxy");
        }
    }

    public final void g(g10 g10Var, t62 t62Var) {
        s52 s52Var = s52.HTTP_1_1;
        k5 k5Var = this.b.a;
        SSLSocketFactory sSLSocketFactory = k5Var.c;
        if (sSLSocketFactory == null) {
            List list = k5Var.i;
            s52 s52Var2 = s52.H2_PRIOR_KNOWLEDGE;
            boolean contains = list.contains(s52Var2);
            Socket socket = this.c;
            if (!contains) {
                this.d = socket;
                this.f = s52Var;
                return;
            } else {
                this.d = socket;
                this.f = s52Var2;
                l();
                return;
            }
        }
        SSLSocket sSLSocket = null;
        String str = null;
        try {
            sSLSocketFactory.getClass();
            Socket socket2 = this.c;
            kz0 kz0Var = k5Var.h;
            Socket createSocket = sSLSocketFactory.createSocket(socket2, kz0Var.d, kz0Var.e, true);
            createSocket.getClass();
            SSLSocket sSLSocket2 = (SSLSocket) createSocket;
            try {
                f10 a = g10Var.a(sSLSocket2);
                if (a.b) {
                    r12 r12Var = r12.a;
                    r12.a.d(sSLSocket2, k5Var.h.d, k5Var.i);
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                session.getClass();
                dx0 y = ap.y(session);
                HostnameVerifier hostnameVerifier = k5Var.d;
                hostnameVerifier.getClass();
                if (!hostnameVerifier.verify(k5Var.h.d, session)) {
                    List a2 = y.a();
                    if (a2.isEmpty()) {
                        throw new SSLPeerUnverifiedException("Hostname " + k5Var.h.d + " not verified (no certificates)");
                    }
                    Object obj = a2.get(0);
                    obj.getClass();
                    X509Certificate x509Certificate = (X509Certificate) obj;
                    StringBuilder sb = new StringBuilder("\n              |Hostname ");
                    sb.append(k5Var.h.d);
                    sb.append(" not verified:\n              |    certificate: ");
                    dt dtVar = dt.c;
                    sb.append(iv1.P(x509Certificate));
                    sb.append("\n              |    DN: ");
                    sb.append(x509Certificate.getSubjectDN().getName());
                    sb.append("\n              |    subjectAltNames: ");
                    sb.append(zv.E(eu1.a(x509Certificate, 7), eu1.a(x509Certificate, 2)));
                    sb.append("\n              ");
                    throw new SSLPeerUnverifiedException(np2.d(sb.toString()));
                }
                dt dtVar2 = k5Var.e;
                dtVar2.getClass();
                this.e = new dx0(y.a, y.b, y.c, new bn(dtVar2, y, k5Var, 5));
                dtVar2.a(k5Var.h.d, new u(27, this));
                if (a.b) {
                    r12 r12Var2 = r12.a;
                    str = r12.a.f(sSLSocket2);
                }
                this.d = sSLSocket2;
                Logger logger = gu1.a;
                jn2 jn2Var = new jn2(sSLSocket2);
                InputStream inputStream = sSLSocket2.getInputStream();
                inputStream.getClass();
                this.h = new p62(new qj(jn2Var, new qj(inputStream, jn2Var)));
                jn2 jn2Var2 = new jn2(sSLSocket2);
                OutputStream outputStream = sSLSocket2.getOutputStream();
                outputStream.getClass();
                this.i = new n62(new pj(jn2Var2, new pj(outputStream, jn2Var2)));
                if (str != null) {
                    s52Var = z71.t(str);
                }
                this.f = s52Var;
                r12 r12Var3 = r12.a;
                r12.a.a(sSLSocket2);
                if (this.f == s52.HTTP_2) {
                    l();
                }
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    r12 r12Var4 = r12.a;
                    r12.a.a(sSLSocket);
                }
                if (sSLSocket != null) {
                    n33.c(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a9, code lost:
    
        if (defpackage.eu1.c(r5, (java.security.cert.X509Certificate) r11) != false) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(k5 k5Var, List list) {
        dx0 dx0Var;
        byte[] bArr = n33.a;
        if (this.p.size() < this.o && !this.j) {
            ac2 ac2Var = this.b;
            k5 k5Var2 = ac2Var.a;
            k5 k5Var3 = ac2Var.a;
            boolean a = k5Var2.a(k5Var);
            kz0 kz0Var = k5Var.h;
            if (a) {
                String str = kz0Var.d;
                String str2 = kz0Var.d;
                if (Intrinsics.b(str, k5Var3.h.d)) {
                    return true;
                }
                if (this.g != null && list != null && !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        ac2 ac2Var2 = (ac2) it.next();
                        Proxy.Type type = ac2Var2.b.type();
                        Proxy.Type type2 = Proxy.Type.DIRECT;
                        if (type == type2 && ac2Var.b.type() == type2 && Intrinsics.b(ac2Var.c, ac2Var2.c)) {
                            if (k5Var.d == eu1.a) {
                                byte[] bArr2 = n33.a;
                                kz0 kz0Var2 = k5Var3.h;
                                if (kz0Var.e == kz0Var2.e) {
                                    if (!Intrinsics.b(str2, kz0Var2.d)) {
                                        if (!this.k && (dx0Var = this.e) != null) {
                                            List a2 = dx0Var.a();
                                            if (!a2.isEmpty()) {
                                                Object obj = a2.get(0);
                                                obj.getClass();
                                            }
                                        }
                                    }
                                    try {
                                        dt dtVar = k5Var.e;
                                        dtVar.getClass();
                                        dx0 dx0Var2 = this.e;
                                        dx0Var2.getClass();
                                        List a3 = dx0Var2.a();
                                        str2.getClass();
                                        a3.getClass();
                                        dtVar.a(str2, new bn(dtVar, a3, str2, 2));
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

    public final boolean i(boolean z) {
        long j;
        byte[] bArr = n33.a;
        long nanoTime = System.nanoTime();
        Socket socket = this.c;
        socket.getClass();
        Socket socket2 = this.d;
        socket2.getClass();
        this.h.getClass();
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        vy0 vy0Var = this.g;
        if (vy0Var != null) {
            synchronized (vy0Var) {
                if (vy0Var.r) {
                    return false;
                }
                if (vy0Var.z < vy0Var.y) {
                    if (nanoTime >= vy0Var.A) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j = nanoTime - this.q;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                return !r4.b();
            } finally {
                socket2.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final yi0 j(fu1 fu1Var, sa1 sa1Var) {
        int i = sa1Var.d;
        Socket socket = this.d;
        socket.getClass();
        p62 p62Var = this.h;
        p62Var.getClass();
        n62 n62Var = this.i;
        n62Var.getClass();
        vy0 vy0Var = this.g;
        if (vy0Var != null) {
            return new wy0(fu1Var, this, sa1Var, vy0Var);
        }
        socket.setSoTimeout(i);
        p62Var.m.e().g(i);
        n62Var.m.e().g(sa1Var.e);
        return new ly0(fu1Var, this, p62Var, n62Var);
    }

    public final synchronized void k() {
        this.j = true;
    }

    public final void l() {
        Socket socket = this.d;
        socket.getClass();
        p62 p62Var = this.h;
        p62Var.getClass();
        n62 n62Var = this.i;
        n62Var.getClass();
        socket.setSoTimeout(0);
        pt2 pt2Var = pt2.h;
        pt2Var.getClass();
        sf sfVar = new sf();
        sfVar.a = pt2Var;
        sfVar.f = oy0.a;
        String str = this.b.a.h.d;
        str.getClass();
        sfVar.b = socket;
        sfVar.c = n33.f + ' ' + str;
        sfVar.d = p62Var;
        sfVar.e = n62Var;
        sfVar.f = this;
        vy0 vy0Var = new vy0(sfVar);
        this.g = vy0Var;
        tj2 tj2Var = vy0.L;
        this.o = (tj2Var.a & 16) != 0 ? tj2Var.b[4] : Integer.MAX_VALUE;
        dz0 dz0Var = vy0Var.I;
        synchronized (dz0Var) {
            try {
                if (dz0Var.p) {
                    throw new IOException("closed");
                }
                Logger logger = dz0.r;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(n33.f(">> CONNECTION " + my0.a.d(), new Object[0]));
                }
                dz0Var.m.i(my0.a);
                dz0Var.m.flush();
            } finally {
            }
        }
        dz0 dz0Var2 = vy0Var.I;
        tj2 tj2Var2 = vy0Var.B;
        synchronized (dz0Var2) {
            try {
                tj2Var2.getClass();
                if (dz0Var2.p) {
                    throw new IOException("closed");
                }
                dz0Var2.m(0, Integer.bitCount(tj2Var2.a) * 6, 4, 0);
                int i = 0;
                while (i < 10) {
                    boolean z = true;
                    if (((1 << i) & tj2Var2.a) == 0) {
                        z = false;
                    }
                    if (z) {
                        dz0Var2.m.writeShort(i != 4 ? i != 7 ? i : 4 : 3);
                        dz0Var2.m.writeInt(tj2Var2.b[i]);
                    }
                    i++;
                }
                dz0Var2.m.flush();
            } finally {
            }
        }
        if (vy0Var.B.a() != 65535) {
            vy0Var.I.s(r9 - 65535, 0);
        }
        pt2Var.e().c(new ty0(vy0Var.o, vy0Var.J, 2), 0L);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        ac2 ac2Var = this.b;
        sb.append(ac2Var.a.h.d);
        sb.append(':');
        sb.append(ac2Var.a.h.e);
        sb.append(", proxy=");
        sb.append(ac2Var.b);
        sb.append(" hostAddress=");
        sb.append(ac2Var.c);
        sb.append(" cipherSuite=");
        dx0 dx0Var = this.e;
        sb.append(dx0Var != null ? dx0Var.b : IntegrityManager.INTEGRITY_TYPE_NONE);
        sb.append(" protocol=");
        sb.append(this.f);
        sb.append('}');
        return sb.toString();
    }
}
