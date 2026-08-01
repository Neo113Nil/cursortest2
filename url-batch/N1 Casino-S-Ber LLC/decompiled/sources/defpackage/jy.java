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

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class jy extends pn {
    public final r00 b;
    public Socket c;
    public Socket d;
    public sm e;
    public nx f;
    public xn g;
    public cy h;
    public ay i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final ArrayList p;
    public long q;

    public jy(ky kyVar, r00 r00Var) {
        kyVar.getClass();
        r00Var.getClass();
        this.b = r00Var;
        this.o = 1;
        this.p = new ArrayList();
        this.q = Long.MAX_VALUE;
    }

    public static void d(uv uvVar, r00 r00Var, IOException iOException) {
        r00Var.getClass();
        iOException.getClass();
        if (r00Var.b.type() != Proxy.Type.DIRECT) {
            y1 y1Var = r00Var.a;
            y1Var.g.connectFailed(y1Var.h.g(), r00Var.b.address(), iOException);
        }
        mr mrVar = uvVar.D;
        synchronized (mrVar) {
            ((LinkedHashSet) mrVar.f).add(r00Var);
        }
    }

    @Override // defpackage.pn
    public final synchronized void a(xn xnVar, or orVar) {
        orVar.getClass();
        this.o = (orVar.f & 16) != 0 ? ((int[]) orVar.g)[4] : Integer.MAX_VALUE;
    }

    @Override // defpackage.pn
    public final void b(fo foVar) {
        foVar.c(8, null);
    }

    public final void c(int i, int i2, int i3, boolean z, gy gyVar) {
        r00 r00Var;
        if (this.f != null) {
            t8.t("already connected");
            return;
        }
        List list = this.b.a.j;
        ec ecVar = new ec(list);
        y1 y1Var = this.b.a;
        if (y1Var.c == null) {
            if (!list.contains(dc.f)) {
                throw new s00(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.b.a.h.d;
            ww wwVar = ww.a;
            if (!ww.a.h(str)) {
                throw new s00(new UnknownServiceException("CLEARTEXT communication to " + str + " not permitted by network security policy"));
            }
        } else if (y1Var.i.contains(nx.H2_PRIOR_KNOWLEDGE)) {
            throw new s00(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        s00 s00Var = null;
        do {
            try {
                r00 r00Var2 = this.b;
                if (r00Var2.a.c != null && r00Var2.b.type() == Proxy.Type.HTTP) {
                    f(i, i2, i3, gyVar);
                    if (this.c == null) {
                        r00Var = this.b;
                        if (r00Var.a.c == null && r00Var.b.type() == Proxy.Type.HTTP && this.c == null) {
                            throw new s00(new ProtocolException("Too many tunnel connections attempted: 21"));
                        }
                        this.q = System.nanoTime();
                        return;
                    }
                } else {
                    e(i, i2, gyVar);
                }
                g(ecVar, gyVar);
                this.b.c.getClass();
                r00Var = this.b;
                if (r00Var.a.c == null) {
                }
                this.q = System.nanoTime();
                return;
            } catch (IOException e) {
                Socket socket = this.d;
                if (socket != null) {
                    r70.c(socket);
                }
                Socket socket2 = this.c;
                if (socket2 != null) {
                    r70.c(socket2);
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
                if (s00Var == null) {
                    s00Var = new s00(e);
                } else {
                    zo.a(s00Var.f, e);
                    s00Var.g = e;
                }
                if (!z) {
                    throw s00Var;
                }
                ecVar.d = true;
                if (!ecVar.c) {
                    throw s00Var;
                }
                if (e instanceof ProtocolException) {
                    throw s00Var;
                }
                if (e instanceof InterruptedIOException) {
                    throw s00Var;
                }
                if ((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) {
                    throw s00Var;
                }
                if (e instanceof SSLPeerUnverifiedException) {
                    throw s00Var;
                }
            }
        } while (e instanceof SSLException);
        throw s00Var;
    }

    public final void e(int i, int i2, gy gyVar) {
        Socket createSocket;
        r00 r00Var = this.b;
        Proxy proxy = r00Var.b;
        y1 y1Var = r00Var.a;
        Proxy.Type type = proxy.type();
        int i3 = type == null ? -1 : hy.a[type.ordinal()];
        int i4 = 1;
        if (i3 == 1 || i3 == 2) {
            createSocket = y1Var.b.createSocket();
            createSocket.getClass();
        } else {
            createSocket = new Socket(proxy);
        }
        this.c = createSocket;
        this.b.c.getClass();
        createSocket.setSoTimeout(i2);
        try {
            ww wwVar = ww.a;
            ww.a.e(createSocket, this.b.c, i);
            try {
                Logger logger = vv.a;
                b30 b30Var = new b30(createSocket);
                InputStream inputStream = createSocket.getInputStream();
                inputStream.getClass();
                this.h = new cy(new w6(b30Var, new w6(inputStream, b30Var, i4), 0));
                b30 b30Var2 = new b30(createSocket);
                OutputStream outputStream = createSocket.getOutputStream();
                outputStream.getClass();
                this.i = new ay(new v6(b30Var2, new v6(outputStream, b30Var2)));
            } catch (NullPointerException e) {
                if (zo.b(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.b.c);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final void f(int i, int i2, int i3, gy gyVar) {
        we weVar = new we(6);
        r00 r00Var = this.b;
        jo joVar = r00Var.a.h;
        joVar.getClass();
        weVar.f = joVar;
        weVar.t("CONNECT", null);
        y1 y1Var = r00Var.a;
        weVar.p("Host", r70.t(y1Var.h, true));
        weVar.p("Proxy-Connection", "Keep-Alive");
        weVar.p("User-Agent", "okhttp/4.12.0");
        xz d = weVar.d();
        ArrayList arrayList = new ArrayList(20);
        zo.f("Proxy-Authenticate");
        zo.i("OkHttp-Preemptive", "Proxy-Authenticate");
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
        arrayList.add(c40.y0("OkHttp-Preemptive").toString());
        y1Var.f.getClass();
        jo joVar2 = d.a;
        e(i, i2, gyVar);
        String str = "CONNECT " + r70.t(joVar2, true) + " HTTP/1.1";
        cy cyVar = this.h;
        cyVar.getClass();
        ay ayVar = this.i;
        ayVar.getClass();
        mn mnVar = new mn(null, this, cyVar, ayVar);
        cyVar.f.a().g(i2);
        ayVar.f.a().g(i3);
        mnVar.i(d.c, str);
        mnVar.c();
        h00 f = mnVar.f(false);
        f.getClass();
        f.a = d;
        i00 a = f.a();
        int i5 = a.i;
        long h = r70.h(a);
        if (h != -1) {
            kn h2 = mnVar.h(h);
            r70.r(h2, Integer.MAX_VALUE);
            h2.close();
        }
        if (i5 == 200) {
            if (cyVar.g.n() && ayVar.g.n()) {
                return;
            }
            t8.y("TLS tunnel buffered too many bytes!");
            return;
        }
        if (i5 != 407) {
            t8.y(d30.e("Unexpected response code for CONNECT: ", i5));
        } else {
            y1Var.f.getClass();
            t8.y("Failed to authenticate with proxy");
        }
    }

    public final void g(ec ecVar, gy gyVar) {
        nx nxVar = nx.HTTP_1_1;
        y1 y1Var = this.b.a;
        SSLSocketFactory sSLSocketFactory = y1Var.c;
        if (sSLSocketFactory == null) {
            List list = y1Var.i;
            nx nxVar2 = nx.H2_PRIOR_KNOWLEDGE;
            boolean contains = list.contains(nxVar2);
            Socket socket = this.c;
            if (!contains) {
                this.d = socket;
                this.f = nxVar;
                return;
            } else {
                this.d = socket;
                this.f = nxVar2;
                l();
                return;
            }
        }
        SSLSocket sSLSocket = null;
        String str = null;
        try {
            sSLSocketFactory.getClass();
            Socket socket2 = this.c;
            jo joVar = y1Var.h;
            int i = 1;
            Socket createSocket = sSLSocketFactory.createSocket(socket2, joVar.d, joVar.e, true);
            createSocket.getClass();
            SSLSocket sSLSocket2 = (SSLSocket) createSocket;
            try {
                dc a = ecVar.a(sSLSocket2);
                if (a.b) {
                    ww wwVar = ww.a;
                    ww.a.d(sSLSocket2, y1Var.h.d, y1Var.i);
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                session.getClass();
                sm v = o8.v(session);
                HostnameVerifier hostnameVerifier = y1Var.d;
                hostnameVerifier.getClass();
                boolean verify = hostnameVerifier.verify(y1Var.h.d, session);
                int i2 = 0;
                if (!verify) {
                    List a2 = v.a();
                    if (a2.isEmpty()) {
                        throw new SSLPeerUnverifiedException("Hostname " + y1Var.h.d + " not verified (no certificates)");
                    }
                    Object obj = a2.get(0);
                    obj.getClass();
                    X509Certificate x509Certificate = (X509Certificate) obj;
                    StringBuilder sb = new StringBuilder("\n              |Hostname ");
                    sb.append(y1Var.h.d);
                    sb.append(" not verified:\n              |    certificate: ");
                    r9 r9Var = r9.c;
                    sb.append(zo.H(x509Certificate));
                    sb.append("\n              |    DN: ");
                    sb.append(x509Certificate.getSubjectDN().getName());
                    sb.append("\n              |    subjectAltNames: ");
                    List a3 = sv.a(x509Certificate, 7);
                    List a4 = sv.a(x509Certificate, 2);
                    ArrayList arrayList = new ArrayList(a4.size() + a3.size());
                    arrayList.addAll(a3);
                    arrayList.addAll(a4);
                    sb.append(arrayList);
                    sb.append("\n              ");
                    throw new SSLPeerUnverifiedException(d40.h0(sb.toString()));
                }
                r9 r9Var2 = y1Var.e;
                r9Var2.getClass();
                this.e = new sm(v.a, v.b, v.c, new iy(r9Var2, v, y1Var));
                y1Var.h.d.getClass();
                Iterator it = r9Var2.a.iterator();
                if (it.hasNext()) {
                    d30.f(it.next());
                    throw null;
                }
                if (a.b) {
                    ww wwVar2 = ww.a;
                    str = ww.a.f(sSLSocket2);
                }
                this.d = sSLSocket2;
                Logger logger = vv.a;
                b30 b30Var = new b30(sSLSocket2);
                InputStream inputStream = sSLSocket2.getInputStream();
                inputStream.getClass();
                this.h = new cy(new w6(b30Var, new w6(inputStream, b30Var, i), i2));
                b30 b30Var2 = new b30(sSLSocket2);
                OutputStream outputStream = sSLSocket2.getOutputStream();
                outputStream.getClass();
                this.i = new ay(new v6(b30Var2, new v6(outputStream, b30Var2)));
                if (str != null) {
                    nxVar = e70.w(str);
                }
                this.f = nxVar;
                ww wwVar3 = ww.a;
                ww.a.a(sSLSocket2);
                if (this.f == nx.HTTP_2) {
                    l();
                }
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    ww wwVar4 = ww.a;
                    ww.a.a(sSLSocket);
                }
                if (sSLSocket != null) {
                    r70.c(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a9, code lost:
    
        if (defpackage.sv.c(r5, (java.security.cert.X509Certificate) r10) != false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(y1 y1Var, List list) {
        sm smVar;
        jo joVar = y1Var.h;
        byte[] bArr = r70.a;
        if (this.p.size() < this.o && !this.j) {
            r00 r00Var = this.b;
            y1 y1Var2 = r00Var.a;
            y1 y1Var3 = r00Var.a;
            if (y1Var2.a(y1Var)) {
                String str = joVar.d;
                String str2 = joVar.d;
                if (zo.b(str, y1Var3.h.d)) {
                    return true;
                }
                if (this.g != null && list != null && !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        r00 r00Var2 = (r00) it.next();
                        Proxy.Type type = r00Var2.b.type();
                        Proxy.Type type2 = Proxy.Type.DIRECT;
                        if (type == type2 && r00Var.b.type() == type2 && zo.b(r00Var.c, r00Var2.c)) {
                            if (y1Var.d == sv.a) {
                                byte[] bArr2 = r70.a;
                                jo joVar2 = y1Var3.h;
                                if (joVar.e == joVar2.e) {
                                    if (!zo.b(str2, joVar2.d)) {
                                        if (!this.k && (smVar = this.e) != null) {
                                            List a = smVar.a();
                                            if (!a.isEmpty()) {
                                                Object obj = a.get(0);
                                                obj.getClass();
                                            }
                                        }
                                    }
                                    try {
                                        r9 r9Var = y1Var.e;
                                        r9Var.getClass();
                                        sm smVar2 = this.e;
                                        smVar2.getClass();
                                        List a2 = smVar2.a();
                                        str2.getClass();
                                        a2.getClass();
                                        Iterator it2 = r9Var.a.iterator();
                                        if (!it2.hasNext()) {
                                            return true;
                                        }
                                        d30.f(it2.next());
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
        byte[] bArr = r70.a;
        long nanoTime = System.nanoTime();
        Socket socket = this.c;
        socket.getClass();
        Socket socket2 = this.d;
        socket2.getClass();
        this.h.getClass();
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        xn xnVar = this.g;
        if (xnVar != null) {
            synchronized (xnVar) {
                if (xnVar.k) {
                    return false;
                }
                if (xnVar.s < xnVar.r) {
                    if (nanoTime >= xnVar.t) {
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
                return !r4.m();
            } finally {
                socket2.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final oi j(uv uvVar, ly lyVar) {
        int i = lyVar.g;
        Socket socket = this.d;
        socket.getClass();
        cy cyVar = this.h;
        cyVar.getClass();
        ay ayVar = this.i;
        ayVar.getClass();
        xn xnVar = this.g;
        if (xnVar != null) {
            return new yn(uvVar, this, lyVar, xnVar);
        }
        socket.setSoTimeout(i);
        cyVar.f.a().g(i);
        ayVar.f.a().g(lyVar.h);
        return new mn(uvVar, this, cyVar, ayVar);
    }

    public final synchronized void k() {
        this.j = true;
    }

    public final void l() {
        Socket socket = this.d;
        socket.getClass();
        cy cyVar = this.h;
        cyVar.getClass();
        ay ayVar = this.i;
        ayVar.getClass();
        socket.setSoTimeout(0);
        f50 f50Var = f50.h;
        n1 n1Var = new n1(f50Var);
        String str = this.b.a.h.d;
        str.getClass();
        n1Var.b = socket;
        n1Var.c = r70.g + ' ' + str;
        n1Var.d = cyVar;
        n1Var.e = ayVar;
        n1Var.f = this;
        xn xnVar = new xn(n1Var);
        this.g = xnVar;
        or orVar = xn.E;
        this.o = (orVar.f & 16) != 0 ? ((int[]) orVar.g)[4] : Integer.MAX_VALUE;
        go goVar = xnVar.B;
        synchronized (goVar) {
            try {
                if (goVar.i) {
                    throw new IOException("closed");
                }
                Logger logger = go.k;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(r70.f(">> CONNECTION " + nn.a.b(), new Object[0]));
                }
                goVar.f.j(nn.a);
                goVar.f.flush();
            } finally {
            }
        }
        go goVar2 = xnVar.B;
        or orVar2 = xnVar.u;
        synchronized (goVar2) {
            try {
                orVar2.getClass();
                if (goVar2.i) {
                    throw new IOException("closed");
                }
                goVar2.o(0, Integer.bitCount(orVar2.f) * 6, 4, 0);
                int i = 0;
                while (i < 10) {
                    boolean z = true;
                    if (((1 << i) & orVar2.f) == 0) {
                        z = false;
                    }
                    if (z) {
                        goVar2.f.writeShort(i != 4 ? i != 7 ? i : 4 : 3);
                        goVar2.f.writeInt(((int[]) orVar2.g)[i]);
                    }
                    i++;
                }
                goVar2.f.flush();
            } finally {
            }
        }
        if (xnVar.u.f() != 65535) {
            xnVar.B.t(0, r9 - 65535);
        }
        f50Var.e().c(new vn(2, xnVar.C, xnVar.h), 0L);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        r00 r00Var = this.b;
        sb.append(r00Var.a.h.d);
        sb.append(':');
        sb.append(r00Var.a.h.e);
        sb.append(", proxy=");
        sb.append(r00Var.b);
        sb.append(" hostAddress=");
        sb.append(r00Var.c);
        sb.append(" cipherSuite=");
        sm smVar = this.e;
        sb.append(smVar != null ? smVar.b : "none");
        sb.append(" protocol=");
        sb.append(this.f);
        sb.append('}');
        return sb.toString();
    }
}
