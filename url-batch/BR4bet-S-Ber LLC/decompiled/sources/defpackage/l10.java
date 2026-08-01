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

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class l10 extends bq {
    public final w30 b;
    public Socket c;
    public Socket d;
    public ep e;
    public q00 f;
    public jq g;
    public e10 h;
    public d10 i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final ArrayList p;
    public long q;

    public l10(m10 m10Var, w30 w30Var) {
        m10Var.getClass();
        w30Var.getClass();
        this.b = w30Var;
        this.o = 1;
        this.p = new ArrayList();
        this.q = Long.MAX_VALUE;
    }

    public static void d(xy xyVar, w30 w30Var, IOException iOException) {
        w30Var.getClass();
        iOException.getClass();
        if (w30Var.b.type() != Proxy.Type.DIRECT) {
            e2 e2Var = w30Var.a;
            e2Var.g.connectFailed(e2Var.h.g(), w30Var.b.address(), iOException);
        }
        pw pwVar = xyVar.D;
        synchronized (pwVar) {
            ((LinkedHashSet) pwVar.f).add(w30Var);
        }
    }

    @Override // defpackage.bq
    public final synchronized void a(jq jqVar, b50 b50Var) {
        b50Var.getClass();
        this.o = (b50Var.a & 16) != 0 ? b50Var.b[4] : Integer.MAX_VALUE;
    }

    @Override // defpackage.bq
    public final void b(qq qqVar) {
        qqVar.c(8, null);
    }

    public final void c(int i, int i2, int i3, boolean z, i10 i10Var) {
        w30 w30Var;
        if (this.f != null) {
            g9.s("already connected");
            return;
        }
        List list = this.b.a.j;
        ed edVar = new ed(list);
        e2 e2Var = this.b.a;
        if (e2Var.c == null) {
            if (!list.contains(dd.f)) {
                throw new x30(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.b.a.h.d;
            zz zzVar = zz.a;
            if (!zz.a.h(str)) {
                throw new x30(new UnknownServiceException(f60.f("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (e2Var.i.contains(q00.H2_PRIOR_KNOWLEDGE)) {
            throw new x30(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        x30 x30Var = null;
        do {
            try {
                w30 w30Var2 = this.b;
                if (w30Var2.a.c != null && w30Var2.b.type() == Proxy.Type.HTTP) {
                    f(i, i2, i3, i10Var);
                    if (this.c == null) {
                        w30Var = this.b;
                        if (w30Var.a.c == null && w30Var.b.type() == Proxy.Type.HTTP && this.c == null) {
                            throw new x30(new ProtocolException("Too many tunnel connections attempted: 21"));
                        }
                        this.q = System.nanoTime();
                        return;
                    }
                } else {
                    e(i, i2, i10Var);
                }
                g(edVar, i10Var);
                this.b.c.getClass();
                w30Var = this.b;
                if (w30Var.a.c == null) {
                }
                this.q = System.nanoTime();
                return;
            } catch (IOException e) {
                Socket socket = this.d;
                if (socket != null) {
                    cb0.c(socket);
                }
                Socket socket2 = this.c;
                if (socket2 != null) {
                    cb0.c(socket2);
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
                if (x30Var == null) {
                    x30Var = new x30(e);
                } else {
                    la0.f(x30Var.f, e);
                    x30Var.g = e;
                }
                if (!z) {
                    throw x30Var;
                }
                edVar.d = true;
                if (!edVar.c) {
                    throw x30Var;
                }
                if (e instanceof ProtocolException) {
                    throw x30Var;
                }
                if (e instanceof InterruptedIOException) {
                    throw x30Var;
                }
                if ((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) {
                    throw x30Var;
                }
                if (e instanceof SSLPeerUnverifiedException) {
                    throw x30Var;
                }
            }
        } while (e instanceof SSLException);
        throw x30Var;
    }

    public final void e(int i, int i2, i10 i10Var) {
        Socket createSocket;
        w30 w30Var = this.b;
        Proxy proxy = w30Var.b;
        e2 e2Var = w30Var.a;
        Proxy.Type type = proxy.type();
        int i3 = type == null ? -1 : j10.a[type.ordinal()];
        int i4 = 1;
        if (i3 == 1 || i3 == 2) {
            createSocket = e2Var.b.createSocket();
            createSocket.getClass();
        } else {
            createSocket = new Socket(proxy);
        }
        this.c = createSocket;
        this.b.c.getClass();
        createSocket.setSoTimeout(i2);
        try {
            zz zzVar = zz.a;
            zz.a.e(createSocket, this.b.c, i);
            try {
                Logger logger = yy.a;
                d60 d60Var = new d60(createSocket);
                InputStream inputStream = createSocket.getInputStream();
                inputStream.getClass();
                this.h = new e10(new g7(d60Var, new g7(inputStream, d60Var, i4), 0));
                d60 d60Var2 = new d60(createSocket);
                OutputStream outputStream = createSocket.getOutputStream();
                outputStream.getClass();
                this.i = new d10(new f7(d60Var2, new f7(outputStream, d60Var2)));
            } catch (NullPointerException e) {
                if (kr.b(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.b.c);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final void f(int i, int i2, int i3, i10 i10Var) {
        rg rgVar = new rg(6);
        w30 w30Var = this.b;
        uq uqVar = w30Var.a.h;
        uqVar.getClass();
        rgVar.f = uqVar;
        rgVar.t("CONNECT", null);
        e2 e2Var = w30Var.a;
        rgVar.p("Host", cb0.t(e2Var.h, true));
        rgVar.p("Proxy-Connection", "Keep-Alive");
        rgVar.p("User-Agent", "okhttp/4.12.0");
        b30 d = rgVar.d();
        ArrayList arrayList = new ArrayList(20);
        kr.h("Proxy-Authenticate");
        kr.j("OkHttp-Preemptive", "Proxy-Authenticate");
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
        arrayList.add(f70.g0("OkHttp-Preemptive").toString());
        e2Var.f.getClass();
        uq uqVar2 = d.a;
        e(i, i2, i10Var);
        String str = "CONNECT " + cb0.t(uqVar2, true) + " HTTP/1.1";
        e10 e10Var = this.h;
        e10Var.getClass();
        d10 d10Var = this.i;
        d10Var.getClass();
        yp ypVar = new yp(null, this, e10Var, d10Var);
        e10Var.f.a().g(i2);
        d10Var.f.a().g(i3);
        ypVar.i(d.c, str);
        ypVar.c();
        m30 f = ypVar.f(false);
        f.getClass();
        f.a = d;
        n30 a = f.a();
        int i5 = a.i;
        long h = cb0.h(a);
        if (h != -1) {
            wp h2 = ypVar.h(h);
            cb0.r(h2, Integer.MAX_VALUE);
            h2.close();
        }
        if (i5 == 200) {
            if (e10Var.g.g() && d10Var.g.g()) {
                return;
            }
            g9.w("TLS tunnel buffered too many bytes!");
            return;
        }
        if (i5 != 407) {
            g9.w(f60.e("Unexpected response code for CONNECT: ", i5));
        } else {
            e2Var.f.getClass();
            g9.w("Failed to authenticate with proxy");
        }
    }

    public final void g(ed edVar, i10 i10Var) {
        q00 q00Var = q00.HTTP_1_1;
        e2 e2Var = this.b.a;
        SSLSocketFactory sSLSocketFactory = e2Var.c;
        if (sSLSocketFactory == null) {
            List list = e2Var.i;
            q00 q00Var2 = q00.H2_PRIOR_KNOWLEDGE;
            boolean contains = list.contains(q00Var2);
            Socket socket = this.c;
            if (!contains) {
                this.d = socket;
                this.f = q00Var;
                return;
            } else {
                this.d = socket;
                this.f = q00Var2;
                l();
                return;
            }
        }
        SSLSocket sSLSocket = null;
        String str = null;
        try {
            sSLSocketFactory.getClass();
            Socket socket2 = this.c;
            uq uqVar = e2Var.h;
            int i = 1;
            Socket createSocket = sSLSocketFactory.createSocket(socket2, uqVar.d, uqVar.e, true);
            createSocket.getClass();
            SSLSocket sSLSocket2 = (SSLSocket) createSocket;
            try {
                dd a = edVar.a(sSLSocket2);
                if (a.b) {
                    zz zzVar = zz.a;
                    zz.a.d(sSLSocket2, e2Var.h.d, e2Var.i);
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                session.getClass();
                ep o = xf.o(session);
                HostnameVerifier hostnameVerifier = e2Var.d;
                hostnameVerifier.getClass();
                boolean verify = hostnameVerifier.verify(e2Var.h.d, session);
                int i2 = 0;
                if (!verify) {
                    List a2 = o.a();
                    if (a2.isEmpty()) {
                        throw new SSLPeerUnverifiedException("Hostname " + e2Var.h.d + " not verified (no certificates)");
                    }
                    Object obj = a2.get(0);
                    obj.getClass();
                    X509Certificate x509Certificate = (X509Certificate) obj;
                    StringBuilder sb = new StringBuilder("\n              |Hostname ");
                    sb.append(e2Var.h.d);
                    sb.append(" not verified:\n              |    certificate: ");
                    ea eaVar = ea.c;
                    sb.append(kr.Q(x509Certificate));
                    sb.append("\n              |    DN: ");
                    sb.append(x509Certificate.getSubjectDN().getName());
                    sb.append("\n              |    subjectAltNames: ");
                    List a3 = vy.a(x509Certificate, 7);
                    List a4 = vy.a(x509Certificate, 2);
                    ArrayList arrayList = new ArrayList(a4.size() + a3.size());
                    arrayList.addAll(a3);
                    arrayList.addAll(a4);
                    sb.append(arrayList);
                    sb.append("\n              ");
                    throw new SSLPeerUnverifiedException(g70.P(sb.toString()));
                }
                ea eaVar2 = e2Var.e;
                eaVar2.getClass();
                this.e = new ep(o.a, o.b, o.c, new k10(eaVar2, o, e2Var));
                e2Var.h.d.getClass();
                Iterator it = eaVar2.a.iterator();
                if (it.hasNext()) {
                    f60.h(it.next());
                    throw null;
                }
                if (a.b) {
                    zz zzVar2 = zz.a;
                    str = zz.a.f(sSLSocket2);
                }
                this.d = sSLSocket2;
                Logger logger = yy.a;
                d60 d60Var = new d60(sSLSocket2);
                InputStream inputStream = sSLSocket2.getInputStream();
                inputStream.getClass();
                this.h = new e10(new g7(d60Var, new g7(inputStream, d60Var, i), i2));
                d60 d60Var2 = new d60(sSLSocket2);
                OutputStream outputStream = sSLSocket2.getOutputStream();
                outputStream.getClass();
                this.i = new d10(new f7(d60Var2, new f7(outputStream, d60Var2)));
                if (str != null) {
                    q00Var = kr.u(str);
                }
                this.f = q00Var;
                zz zzVar3 = zz.a;
                zz.a.a(sSLSocket2);
                if (this.f == q00.HTTP_2) {
                    l();
                }
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    zz zzVar4 = zz.a;
                    zz.a.a(sSLSocket);
                }
                if (sSLSocket != null) {
                    cb0.c(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a9, code lost:
    
        if (defpackage.vy.c(r5, (java.security.cert.X509Certificate) r10) != false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(e2 e2Var, List list) {
        ep epVar;
        uq uqVar = e2Var.h;
        byte[] bArr = cb0.a;
        if (this.p.size() < this.o && !this.j) {
            w30 w30Var = this.b;
            e2 e2Var2 = w30Var.a;
            e2 e2Var3 = w30Var.a;
            if (e2Var2.a(e2Var)) {
                String str = uqVar.d;
                String str2 = uqVar.d;
                if (kr.b(str, e2Var3.h.d)) {
                    return true;
                }
                if (this.g != null && list != null && !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        w30 w30Var2 = (w30) it.next();
                        Proxy.Type type = w30Var2.b.type();
                        Proxy.Type type2 = Proxy.Type.DIRECT;
                        if (type == type2 && w30Var.b.type() == type2 && kr.b(w30Var.c, w30Var2.c)) {
                            if (e2Var.d == vy.a) {
                                byte[] bArr2 = cb0.a;
                                uq uqVar2 = e2Var3.h;
                                if (uqVar.e == uqVar2.e) {
                                    if (!kr.b(str2, uqVar2.d)) {
                                        if (!this.k && (epVar = this.e) != null) {
                                            List a = epVar.a();
                                            if (!a.isEmpty()) {
                                                Object obj = a.get(0);
                                                obj.getClass();
                                            }
                                        }
                                    }
                                    try {
                                        ea eaVar = e2Var.e;
                                        eaVar.getClass();
                                        ep epVar2 = this.e;
                                        epVar2.getClass();
                                        List a2 = epVar2.a();
                                        str2.getClass();
                                        a2.getClass();
                                        Iterator it2 = eaVar.a.iterator();
                                        if (!it2.hasNext()) {
                                            return true;
                                        }
                                        f60.h(it2.next());
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
        byte[] bArr = cb0.a;
        long nanoTime = System.nanoTime();
        Socket socket = this.c;
        socket.getClass();
        Socket socket2 = this.d;
        socket2.getClass();
        this.h.getClass();
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        jq jqVar = this.g;
        if (jqVar != null) {
            synchronized (jqVar) {
                if (jqVar.k) {
                    return false;
                }
                if (jqVar.s < jqVar.r) {
                    if (nanoTime >= jqVar.t) {
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
                return !r4.f();
            } finally {
                socket2.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final vk j(xy xyVar, n10 n10Var) {
        int i = n10Var.g;
        Socket socket = this.d;
        socket.getClass();
        e10 e10Var = this.h;
        e10Var.getClass();
        d10 d10Var = this.i;
        d10Var.getClass();
        jq jqVar = this.g;
        if (jqVar != null) {
            return new kq(xyVar, this, n10Var, jqVar);
        }
        socket.setSoTimeout(i);
        e10Var.f.a().g(i);
        d10Var.f.a().g(n10Var.h);
        return new yp(xyVar, this, e10Var, d10Var);
    }

    public final synchronized void k() {
        this.j = true;
    }

    public final void l() {
        Socket socket = this.d;
        socket.getClass();
        e10 e10Var = this.h;
        e10Var.getClass();
        d10 d10Var = this.i;
        d10Var.getClass();
        socket.setSoTimeout(0);
        l80 l80Var = l80.h;
        o1 o1Var = new o1(l80Var);
        String str = this.b.a.h.d;
        str.getClass();
        o1Var.b = socket;
        o1Var.c = cb0.g + ' ' + str;
        o1Var.d = e10Var;
        o1Var.e = d10Var;
        o1Var.f = this;
        jq jqVar = new jq(o1Var);
        this.g = jqVar;
        b50 b50Var = jq.E;
        this.o = (b50Var.a & 16) != 0 ? b50Var.b[4] : Integer.MAX_VALUE;
        rq rqVar = jqVar.B;
        synchronized (rqVar) {
            try {
                if (rqVar.i) {
                    throw new IOException("closed");
                }
                Logger logger = rq.k;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(cb0.f(">> CONNECTION " + zp.a.b(), new Object[0]));
                }
                rqVar.f.n(zp.a);
                rqVar.f.flush();
            } finally {
            }
        }
        rq rqVar2 = jqVar.B;
        b50 b50Var2 = jqVar.u;
        synchronized (rqVar2) {
            try {
                b50Var2.getClass();
                if (rqVar2.i) {
                    throw new IOException("closed");
                }
                rqVar2.h(0, Integer.bitCount(b50Var2.a) * 6, 4, 0);
                int i = 0;
                while (i < 10) {
                    boolean z = true;
                    if (((1 << i) & b50Var2.a) == 0) {
                        z = false;
                    }
                    if (z) {
                        rqVar2.f.writeShort(i != 4 ? i != 7 ? i : 4 : 3);
                        rqVar2.f.writeInt(b50Var2.b[i]);
                    }
                    i++;
                }
                rqVar2.f.flush();
            } finally {
            }
        }
        if (jqVar.u.a() != 65535) {
            jqVar.B.t(0, r9 - 65535);
        }
        l80Var.e().c(new hq(2, jqVar.C, jqVar.h), 0L);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        w30 w30Var = this.b;
        sb.append(w30Var.a.h.d);
        sb.append(':');
        sb.append(w30Var.a.h.e);
        sb.append(", proxy=");
        sb.append(w30Var.b);
        sb.append(" hostAddress=");
        sb.append(w30Var.c);
        sb.append(" cipherSuite=");
        ep epVar = this.e;
        sb.append(epVar != null ? epVar.b : "none");
        sb.append(" protocol=");
        sb.append(this.f);
        sb.append('}');
        return sb.toString();
    }
}
