package defpackage;

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

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class q70 extends ut {
    public final ya0 b;
    public Socket c;
    public Socket d;
    public vs e;
    public u60 f;
    public du g;
    public j70 h;
    public i70 i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final ArrayList p;
    public long q;

    public q70(r70 r70Var, ya0 ya0Var) {
        r70Var.getClass();
        ya0Var.getClass();
        this.b = ya0Var;
        this.o = 1;
        this.p = new ArrayList();
        this.q = Long.MAX_VALUE;
    }

    public static void d(o40 o40Var, ya0 ya0Var, IOException iOException) {
        ya0Var.getClass();
        iOException.getClass();
        if (ya0Var.b.type() != Proxy.Type.DIRECT) {
            n2 n2Var = ya0Var.a;
            n2Var.g.connectFailed(n2Var.h.g(), ya0Var.b.address(), iOException);
        }
        kz kzVar = o40Var.D;
        synchronized (kzVar) {
            ((LinkedHashSet) kzVar.f).add(ya0Var);
        }
    }

    @Override // defpackage.ut
    public final synchronized void a(du duVar, cd0 cd0Var) {
        cd0Var.getClass();
        this.o = (cd0Var.a & 16) != 0 ? cd0Var.b[4] : Integer.MAX_VALUE;
    }

    @Override // defpackage.ut
    public final void b(ku kuVar) {
        kuVar.c(kn.REFUSED_STREAM, null);
    }

    public final void c(int i, int i2, int i3, boolean z, n70 n70Var) {
        ya0 ya0Var;
        if (this.f != null) {
            s9.u("already connected");
            return;
        }
        List list = this.b.a.j;
        oe oeVar = new oe(list);
        n2 n2Var = this.b.a;
        if (n2Var.c == null) {
            if (!list.contains(ne.f)) {
                throw new za0(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.b.a.h.d;
            q50 q50Var = q50.a;
            if (!q50.a.h(str)) {
                throw new za0(new UnknownServiceException(r7.c("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (n2Var.i.contains(u60.H2_PRIOR_KNOWLEDGE)) {
            throw new za0(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        za0 za0Var = null;
        do {
            try {
                ya0 ya0Var2 = this.b;
                if (ya0Var2.a.c != null && ya0Var2.b.type() == Proxy.Type.HTTP) {
                    f(i, i2, i3, n70Var);
                    if (this.c == null) {
                        ya0Var = this.b;
                        if (ya0Var.a.c == null && ya0Var.b.type() == Proxy.Type.HTTP && this.c == null) {
                            throw new za0(new ProtocolException("Too many tunnel connections attempted: 21"));
                        }
                        this.q = System.nanoTime();
                        return;
                    }
                } else {
                    e(i, i2, n70Var);
                }
                g(oeVar, n70Var);
                this.b.c.getClass();
                ya0Var = this.b;
                if (ya0Var.a.c == null) {
                }
                this.q = System.nanoTime();
                return;
            } catch (IOException e) {
                Socket socket = this.d;
                if (socket != null) {
                    zk0.c(socket);
                }
                Socket socket2 = this.c;
                if (socket2 != null) {
                    zk0.c(socket2);
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
                if (za0Var == null) {
                    za0Var = new za0(e);
                } else {
                    bi.f(za0Var.f, e);
                    za0Var.g = e;
                }
                if (!z) {
                    throw za0Var;
                }
                oeVar.d = true;
                if (!oeVar.c) {
                    throw za0Var;
                }
                if (e instanceof ProtocolException) {
                    throw za0Var;
                }
                if (e instanceof InterruptedIOException) {
                    throw za0Var;
                }
                if ((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) {
                    throw za0Var;
                }
                if (e instanceof SSLPeerUnverifiedException) {
                    throw za0Var;
                }
            }
        } while (e instanceof SSLException);
        throw za0Var;
    }

    public final void e(int i, int i2, n70 n70Var) {
        Socket createSocket;
        ya0 ya0Var = this.b;
        Proxy proxy = ya0Var.b;
        n2 n2Var = ya0Var.a;
        Proxy.Type type = proxy.type();
        int i3 = type == null ? -1 : o70.a[type.ordinal()];
        int i4 = 1;
        if (i3 == 1 || i3 == 2) {
            createSocket = n2Var.b.createSocket();
            createSocket.getClass();
        } else {
            createSocket = new Socket(proxy);
        }
        this.c = createSocket;
        this.b.c.getClass();
        createSocket.setSoTimeout(i2);
        try {
            q50 q50Var = q50.a;
            q50.a.e(createSocket, this.b.c, i);
            try {
                Logger logger = p40.a;
                ge0 ge0Var = new ge0(createSocket);
                InputStream inputStream = createSocket.getInputStream();
                inputStream.getClass();
                this.h = new j70(new p7(ge0Var, new p7(inputStream, ge0Var, i4), 0));
                ge0 ge0Var2 = new ge0(createSocket);
                OutputStream outputStream = createSocket.getOutputStream();
                outputStream.getClass();
                this.i = new i70(new o7(ge0Var2, new o7(outputStream, ge0Var2)));
            } catch (NullPointerException e) {
                if (mv.c(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.b.c);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final void f(int i, int i2, int i3, n70 n70Var) {
        wi wiVar = new wi(5);
        ya0 ya0Var = this.b;
        ou ouVar = ya0Var.a.h;
        ouVar.getClass();
        wiVar.f = ouVar;
        wiVar.m("CONNECT", null);
        n2 n2Var = ya0Var.a;
        wiVar.k("Host", zk0.t(n2Var.h, true));
        wiVar.k("Proxy-Connection", "Keep-Alive");
        wiVar.k("User-Agent", "okhttp/4.12.0");
        j90 c = wiVar.c();
        ArrayList arrayList = new ArrayList(20);
        u60.HTTP_1_1.getClass();
        gk0.e("Proxy-Authenticate");
        gk0.f("OkHttp-Preemptive", "Proxy-Authenticate");
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
        arrayList.add(mf0.E("OkHttp-Preemptive").toString());
        n2Var.f.getClass();
        ou ouVar2 = (ou) c.b;
        e(i, i2, n70Var);
        String str = "CONNECT " + zk0.t(ouVar2, true) + " HTTP/1.1";
        j70 j70Var = this.h;
        j70Var.getClass();
        i70 i70Var = this.i;
        i70Var.getClass();
        rt rtVar = new rt(null, this, j70Var, i70Var);
        j70Var.f.a().g(i2);
        i70Var.f.a().g(i3);
        rtVar.i((bt) c.d, str);
        rtVar.c();
        u90 f = rtVar.f(false);
        f.getClass();
        f.a = c;
        v90 a = f.a();
        int i5 = a.i;
        long h = zk0.h(a);
        if (h != -1) {
            pt h2 = rtVar.h(h);
            zk0.r(h2, Integer.MAX_VALUE);
            h2.close();
        }
        if (i5 == 200) {
            if (j70Var.g.n() && i70Var.g.n()) {
                return;
            }
            s9.w("TLS tunnel buffered too many bytes!");
            return;
        }
        if (i5 != 407) {
            s9.w(r7.b("Unexpected response code for CONNECT: ", i5));
        } else {
            n2Var.f.getClass();
            s9.w("Failed to authenticate with proxy");
        }
    }

    public final void g(oe oeVar, n70 n70Var) {
        u60 u60Var;
        n2 n2Var = this.b.a;
        SSLSocketFactory sSLSocketFactory = n2Var.c;
        if (sSLSocketFactory == null) {
            List list = n2Var.i;
            u60 u60Var2 = u60.H2_PRIOR_KNOWLEDGE;
            boolean contains = list.contains(u60Var2);
            Socket socket = this.c;
            if (!contains) {
                this.d = socket;
                this.f = u60.HTTP_1_1;
                return;
            } else {
                this.d = socket;
                this.f = u60Var2;
                l();
                return;
            }
        }
        SSLSocket sSLSocket = null;
        String str = null;
        try {
            sSLSocketFactory.getClass();
            Socket socket2 = this.c;
            ou ouVar = n2Var.h;
            int i = 1;
            Socket createSocket = sSLSocketFactory.createSocket(socket2, ouVar.d, ouVar.e, true);
            createSocket.getClass();
            SSLSocket sSLSocket2 = (SSLSocket) createSocket;
            try {
                ne a = oeVar.a(sSLSocket2);
                if (a.b) {
                    q50 q50Var = q50.a;
                    q50.a.d(sSLSocket2, n2Var.h.d, n2Var.i);
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                session.getClass();
                vs s = d50.s(session);
                HostnameVerifier hostnameVerifier = n2Var.d;
                hostnameVerifier.getClass();
                boolean verify = hostnameVerifier.verify(n2Var.h.d, session);
                int i2 = 0;
                if (!verify) {
                    List a2 = s.a();
                    if (a2.isEmpty()) {
                        throw new SSLPeerUnverifiedException("Hostname " + n2Var.h.d + " not verified (no certificates)");
                    }
                    Object obj = a2.get(0);
                    obj.getClass();
                    X509Certificate x509Certificate = (X509Certificate) obj;
                    StringBuilder sb = new StringBuilder("\n              |Hostname ");
                    sb.append(n2Var.h.d);
                    sb.append(" not verified:\n              |    certificate: ");
                    xa xaVar = xa.c;
                    sb.append(bi.S(x509Certificate));
                    sb.append("\n              |    DN: ");
                    sb.append(x509Certificate.getSubjectDN().getName());
                    sb.append("\n              |    subjectAltNames: ");
                    List a3 = m40.a(x509Certificate, 7);
                    List a4 = m40.a(x509Certificate, 2);
                    ArrayList arrayList = new ArrayList(a4.size() + a3.size());
                    arrayList.addAll(a3);
                    arrayList.addAll(a4);
                    sb.append(arrayList);
                    sb.append("\n              ");
                    throw new SSLPeerUnverifiedException(nf0.n(sb.toString()));
                }
                xa xaVar2 = n2Var.e;
                xaVar2.getClass();
                this.e = new vs(s.a, s.b, s.c, new p70(xaVar2, s, n2Var));
                n2Var.h.d.getClass();
                Iterator it = xaVar2.a.iterator();
                if (it.hasNext()) {
                    r7.g(it.next());
                    throw null;
                }
                if (a.b) {
                    q50 q50Var2 = q50.a;
                    str = q50.a.f(sSLSocket2);
                }
                this.d = sSLSocket2;
                Logger logger = p40.a;
                ge0 ge0Var = new ge0(sSLSocket2);
                InputStream inputStream = sSLSocket2.getInputStream();
                inputStream.getClass();
                this.h = new j70(new p7(ge0Var, new p7(inputStream, ge0Var, i), i2));
                ge0 ge0Var2 = new ge0(sSLSocket2);
                OutputStream outputStream = sSLSocket2.getOutputStream();
                outputStream.getClass();
                this.i = new i70(new o7(ge0Var2, new o7(outputStream, ge0Var2)));
                if (str != null) {
                    u60.Companion.getClass();
                    u60Var = t60.a(str);
                } else {
                    u60Var = u60.HTTP_1_1;
                }
                this.f = u60Var;
                q50 q50Var3 = q50.a;
                q50.a.a(sSLSocket2);
                if (this.f == u60.HTTP_2) {
                    l();
                }
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    q50 q50Var4 = q50.a;
                    q50.a.a(sSLSocket);
                }
                if (sSLSocket != null) {
                    zk0.c(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a9, code lost:
    
        if (defpackage.m40.c(r5, (java.security.cert.X509Certificate) r10) != false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(n2 n2Var, List list) {
        vs vsVar;
        ou ouVar = n2Var.h;
        byte[] bArr = zk0.a;
        if (this.p.size() < this.o && !this.j) {
            ya0 ya0Var = this.b;
            n2 n2Var2 = ya0Var.a;
            n2 n2Var3 = ya0Var.a;
            if (n2Var2.a(n2Var)) {
                String str = ouVar.d;
                String str2 = ouVar.d;
                if (mv.c(str, n2Var3.h.d)) {
                    return true;
                }
                if (this.g != null && list != null && !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        ya0 ya0Var2 = (ya0) it.next();
                        Proxy.Type type = ya0Var2.b.type();
                        Proxy.Type type2 = Proxy.Type.DIRECT;
                        if (type == type2 && ya0Var.b.type() == type2 && mv.c(ya0Var.c, ya0Var2.c)) {
                            if (n2Var.d == m40.a) {
                                byte[] bArr2 = zk0.a;
                                ou ouVar2 = n2Var3.h;
                                if (ouVar.e == ouVar2.e) {
                                    if (!mv.c(str2, ouVar2.d)) {
                                        if (!this.k && (vsVar = this.e) != null) {
                                            List a = vsVar.a();
                                            if (!a.isEmpty()) {
                                                Object obj = a.get(0);
                                                obj.getClass();
                                            }
                                        }
                                    }
                                    try {
                                        xa xaVar = n2Var.e;
                                        xaVar.getClass();
                                        vs vsVar2 = this.e;
                                        vsVar2.getClass();
                                        List a2 = vsVar2.a();
                                        str2.getClass();
                                        a2.getClass();
                                        Iterator it2 = xaVar.a.iterator();
                                        if (!it2.hasNext()) {
                                            return true;
                                        }
                                        r7.g(it2.next());
                                        throw null;
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
        byte[] bArr = zk0.a;
        long nanoTime = System.nanoTime();
        Socket socket = this.c;
        socket.getClass();
        Socket socket2 = this.d;
        socket2.getClass();
        this.h.getClass();
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        du duVar = this.g;
        if (duVar != null) {
            synchronized (duVar) {
                if (duVar.k) {
                    return false;
                }
                if (duVar.s < duVar.r) {
                    if (nanoTime >= duVar.t) {
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
                return !r4.i();
            } finally {
                socket2.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final sn j(o40 o40Var, s70 s70Var) {
        int i = s70Var.g;
        Socket socket = this.d;
        socket.getClass();
        j70 j70Var = this.h;
        j70Var.getClass();
        i70 i70Var = this.i;
        i70Var.getClass();
        du duVar = this.g;
        if (duVar != null) {
            return new eu(o40Var, this, s70Var, duVar);
        }
        socket.setSoTimeout(i);
        j70Var.f.a().g(i);
        i70Var.f.a().g(s70Var.h);
        return new rt(o40Var, this, j70Var, i70Var);
    }

    public final synchronized void k() {
        this.j = true;
    }

    public final void l() {
        Socket socket = this.d;
        socket.getClass();
        j70 j70Var = this.h;
        j70Var.getClass();
        i70 i70Var = this.i;
        i70Var.getClass();
        socket.setSoTimeout(0);
        kh0 kh0Var = kh0.h;
        z4 z4Var = new z4(kh0Var);
        String str = this.b.a.h.d;
        str.getClass();
        z4Var.b = socket;
        z4Var.c = zk0.g + ' ' + str;
        z4Var.d = j70Var;
        z4Var.e = i70Var;
        z4Var.f = this;
        du duVar = new du(z4Var);
        this.g = duVar;
        cd0 cd0Var = du.E;
        this.o = (cd0Var.a & 16) != 0 ? cd0Var.b[4] : Integer.MAX_VALUE;
        lu luVar = duVar.B;
        synchronized (luVar) {
            try {
                if (luVar.i) {
                    throw new IOException("closed");
                }
                Logger logger = lu.k;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(zk0.f(">> CONNECTION " + st.a.b(), new Object[0]));
                }
                luVar.f.K(st.a);
                luVar.f.flush();
            } finally {
            }
        }
        lu luVar2 = duVar.B;
        cd0 cd0Var2 = duVar.u;
        synchronized (luVar2) {
            try {
                cd0Var2.getClass();
                if (luVar2.i) {
                    throw new IOException("closed");
                }
                luVar2.r(0, Integer.bitCount(cd0Var2.a) * 6, 4, 0);
                int i = 0;
                while (i < 10) {
                    boolean z = true;
                    if (((1 << i) & cd0Var2.a) == 0) {
                        z = false;
                    }
                    if (z) {
                        luVar2.f.writeShort(i != 4 ? i != 7 ? i : 4 : 3);
                        luVar2.f.writeInt(cd0Var2.b[i]);
                    }
                    i++;
                }
                luVar2.f.flush();
            } finally {
            }
        }
        if (duVar.u.a() != 65535) {
            duVar.B.Q(0, r9 - 65535);
        }
        kh0Var.e().c(new au(2, duVar.C, duVar.h), 0L);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        ya0 ya0Var = this.b;
        sb.append(ya0Var.a.h.d);
        sb.append(':');
        sb.append(ya0Var.a.h.e);
        sb.append(", proxy=");
        sb.append(ya0Var.b);
        sb.append(" hostAddress=");
        sb.append(ya0Var.c);
        sb.append(" cipherSuite=");
        vs vsVar = this.e;
        sb.append(vsVar != null ? vsVar.b : "none");
        sb.append(" protocol=");
        sb.append(this.f);
        sb.append('}');
        return sb.toString();
    }
}
