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

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class yy extends fo {
    public final h10 b;
    public Socket c;
    public Socket d;
    public kn e;
    public dy f;
    public no g;
    public ry h;
    public qy i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final ArrayList p;
    public long q;

    public yy(zy zyVar, h10 h10Var) {
        zyVar.getClass();
        h10Var.getClass();
        this.b = h10Var;
        this.o = 1;
        this.p = new ArrayList();
        this.q = Long.MAX_VALUE;
    }

    public static void d(bw bwVar, h10 h10Var, IOException iOException) {
        h10Var.getClass();
        iOException.getClass();
        if (h10Var.b.type() != Proxy.Type.DIRECT) {
            o2 o2Var = h10Var.a;
            o2Var.g.connectFailed(o2Var.h.g(), h10Var.b.address(), iOException);
        }
        tx txVar = bwVar.D;
        synchronized (txVar) {
            ((LinkedHashSet) txVar.f).add(h10Var);
        }
    }

    @Override // defpackage.fo
    public final synchronized void a(no noVar, v2 v2Var) {
        v2Var.getClass();
        this.o = (v2Var.a & 16) != 0 ? ((int[]) v2Var.b)[4] : Integer.MAX_VALUE;
    }

    @Override // defpackage.fo
    public final void b(uo uoVar) {
        uoVar.c(8, null);
    }

    public final void c(int i, int i2, int i3, boolean z, vy vyVar) {
        h10 h10Var;
        if (this.f != null) {
            o8.t("already connected");
            return;
        }
        List list = this.b.a.j;
        ic icVar = new ic(list);
        o2 o2Var = this.b.a;
        if (o2Var.c == null) {
            if (!list.contains(hc.f)) {
                throw new i10(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.b.a.h.d;
            jx jxVar = jx.a;
            if (!jx.a.h(str)) {
                throw new i10(new UnknownServiceException("CLEARTEXT communication to " + str + " not permitted by network security policy"));
            }
        } else if (o2Var.i.contains(dy.H2_PRIOR_KNOWLEDGE)) {
            throw new i10(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        i10 i10Var = null;
        do {
            try {
                h10 h10Var2 = this.b;
                if (h10Var2.a.c != null && h10Var2.b.type() == Proxy.Type.HTTP) {
                    f(i, i2, i3, vyVar);
                    if (this.c == null) {
                        h10Var = this.b;
                        if (h10Var.a.c == null && h10Var.b.type() == Proxy.Type.HTTP && this.c == null) {
                            throw new i10(new ProtocolException("Too many tunnel connections attempted: 21"));
                        }
                        this.q = System.nanoTime();
                        return;
                    }
                } else {
                    e(i, i2, vyVar);
                }
                g(icVar, vyVar);
                this.b.c.getClass();
                h10Var = this.b;
                if (h10Var.a.c == null) {
                }
                this.q = System.nanoTime();
                return;
            } catch (IOException e) {
                Socket socket = this.d;
                if (socket != null) {
                    y70.c(socket);
                }
                Socket socket2 = this.c;
                if (socket2 != null) {
                    y70.c(socket2);
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
                if (i10Var == null) {
                    i10Var = new i10(e);
                } else {
                    j8.b(i10Var.f, e);
                    i10Var.g = e;
                }
                if (!z) {
                    throw i10Var;
                }
                icVar.d = true;
                if (!icVar.c) {
                    throw i10Var;
                }
                if (e instanceof ProtocolException) {
                    throw i10Var;
                }
                if (e instanceof InterruptedIOException) {
                    throw i10Var;
                }
                if ((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) {
                    throw i10Var;
                }
                if (e instanceof SSLPeerUnverifiedException) {
                    throw i10Var;
                }
            }
        } while (e instanceof SSLException);
        throw i10Var;
    }

    public final void e(int i, int i2, vy vyVar) {
        Socket createSocket;
        h10 h10Var = this.b;
        Proxy proxy = h10Var.b;
        o2 o2Var = h10Var.a;
        Proxy.Type type = proxy.type();
        int i3 = type == null ? -1 : wy.a[type.ordinal()];
        int i4 = 1;
        if (i3 == 1 || i3 == 2) {
            createSocket = o2Var.b.createSocket();
            createSocket.getClass();
        } else {
            createSocket = new Socket(proxy);
        }
        this.c = createSocket;
        this.b.c.getClass();
        createSocket.setSoTimeout(i2);
        try {
            jx jxVar = jx.a;
            jx.a.e(createSocket, this.b.c, i);
            try {
                Logger logger = cw.a;
                m30 m30Var = new m30(createSocket);
                InputStream inputStream = createSocket.getInputStream();
                inputStream.getClass();
                this.h = new ry(new k7(m30Var, new k7(inputStream, m30Var, i4), 0));
                m30 m30Var2 = new m30(createSocket);
                OutputStream outputStream = createSocket.getOutputStream();
                outputStream.getClass();
                this.i = new qy(new j7(m30Var2, new j7(outputStream, m30Var2)));
            } catch (NullPointerException e) {
                if (op.d(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.b.c);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final void f(int i, int i2, int i3, vy vyVar) {
        h8 h8Var = new h8(5);
        h10 h10Var = this.b;
        yo yoVar = h10Var.a.h;
        yoVar.getClass();
        h8Var.f = yoVar;
        h8Var.f("CONNECT", null);
        o2 o2Var = h10Var.a;
        h8Var.e("Host", y70.t(o2Var.h, true));
        h8Var.e("Proxy-Connection", "Keep-Alive");
        h8Var.e("User-Agent", "okhttp/4.12.0");
        pp a = h8Var.a();
        ArrayList arrayList = new ArrayList(20);
        l70.g("Proxy-Authenticate");
        l70.h("OkHttp-Preemptive", "Proxy-Authenticate");
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
        arrayList.add(l40.q0("OkHttp-Preemptive").toString());
        o2Var.f.getClass();
        yo yoVar2 = (yo) a.b;
        e(i, i2, vyVar);
        String str = "CONNECT " + y70.t(yoVar2, true) + " HTTP/1.1";
        ry ryVar = this.h;
        ryVar.getClass();
        qy qyVar = this.i;
        qyVar.getClass();
        bo boVar = new bo(null, this, ryVar, qyVar);
        ryVar.f.a().g(i2);
        qyVar.f.a().g(i3);
        boVar.i((nn) a.d, str);
        boVar.b();
        x00 e = boVar.e(false);
        e.getClass();
        e.a = a;
        y00 a2 = e.a();
        int i5 = a2.i;
        long h = y70.h(a2);
        if (h != -1) {
            zn h2 = boVar.h(h);
            y70.r(h2, Integer.MAX_VALUE);
            h2.close();
        }
        if (i5 == 200) {
            if (ryVar.g.n() && qyVar.g.n()) {
                return;
            }
            o8.x("TLS tunnel buffered too many bytes!");
            return;
        }
        if (i5 != 407) {
            o8.x(o30.e("Unexpected response code for CONNECT: ", i5));
        } else {
            o2Var.f.getClass();
            o8.x("Failed to authenticate with proxy");
        }
    }

    public final void g(ic icVar, vy vyVar) {
        dy dyVar = dy.HTTP_1_1;
        o2 o2Var = this.b.a;
        SSLSocketFactory sSLSocketFactory = o2Var.c;
        if (sSLSocketFactory == null) {
            List list = o2Var.i;
            dy dyVar2 = dy.H2_PRIOR_KNOWLEDGE;
            boolean contains = list.contains(dyVar2);
            Socket socket = this.c;
            if (!contains) {
                this.d = socket;
                this.f = dyVar;
                return;
            } else {
                this.d = socket;
                this.f = dyVar2;
                l();
                return;
            }
        }
        SSLSocket sSLSocket = null;
        String str = null;
        try {
            sSLSocketFactory.getClass();
            Socket socket2 = this.c;
            yo yoVar = o2Var.h;
            int i = 1;
            Socket createSocket = sSLSocketFactory.createSocket(socket2, yoVar.d, yoVar.e, true);
            createSocket.getClass();
            SSLSocket sSLSocket2 = (SSLSocket) createSocket;
            try {
                hc a = icVar.a(sSLSocket2);
                if (a.b) {
                    jx jxVar = jx.a;
                    jx.a.d(sSLSocket2, o2Var.h.d, o2Var.i);
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                session.getClass();
                kn y = vw.y(session);
                HostnameVerifier hostnameVerifier = o2Var.d;
                hostnameVerifier.getClass();
                boolean verify = hostnameVerifier.verify(o2Var.h.d, session);
                int i2 = 0;
                if (!verify) {
                    List a2 = y.a();
                    if (a2.isEmpty()) {
                        throw new SSLPeerUnverifiedException("Hostname " + o2Var.h.d + " not verified (no certificates)");
                    }
                    Object obj = a2.get(0);
                    obj.getClass();
                    X509Certificate x509Certificate = (X509Certificate) obj;
                    StringBuilder sb = new StringBuilder("\n              |Hostname ");
                    sb.append(o2Var.h.d);
                    sb.append(" not verified:\n              |    certificate: ");
                    n9 n9Var = n9.c;
                    sb.append(j8.J(x509Certificate));
                    sb.append("\n              |    DN: ");
                    sb.append(x509Certificate.getSubjectDN().getName());
                    sb.append("\n              |    subjectAltNames: ");
                    List a3 = zv.a(x509Certificate, 7);
                    List a4 = zv.a(x509Certificate, 2);
                    ArrayList arrayList = new ArrayList(a4.size() + a3.size());
                    arrayList.addAll(a3);
                    arrayList.addAll(a4);
                    sb.append(arrayList);
                    sb.append("\n              ");
                    throw new SSLPeerUnverifiedException(m40.Z(sb.toString()));
                }
                n9 n9Var2 = o2Var.e;
                n9Var2.getClass();
                this.e = new kn(y.a, y.b, y.c, new xy(n9Var2, y, o2Var));
                o2Var.h.d.getClass();
                Iterator it = n9Var2.a.iterator();
                if (it.hasNext()) {
                    o30.g(it.next());
                    throw null;
                }
                if (a.b) {
                    jx jxVar2 = jx.a;
                    str = jx.a.f(sSLSocket2);
                }
                this.d = sSLSocket2;
                Logger logger = cw.a;
                m30 m30Var = new m30(sSLSocket2);
                InputStream inputStream = sSLSocket2.getInputStream();
                inputStream.getClass();
                this.h = new ry(new k7(m30Var, new k7(inputStream, m30Var, i), i2));
                m30 m30Var2 = new m30(sSLSocket2);
                OutputStream outputStream = sSLSocket2.getOutputStream();
                outputStream.getClass();
                this.i = new qy(new j7(m30Var2, new j7(outputStream, m30Var2)));
                if (str != null) {
                    dyVar = j8.o(str);
                }
                this.f = dyVar;
                jx jxVar3 = jx.a;
                jx.a.a(sSLSocket2);
                if (this.f == dy.HTTP_2) {
                    l();
                }
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    jx jxVar4 = jx.a;
                    jx.a.a(sSLSocket);
                }
                if (sSLSocket != null) {
                    y70.c(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a9, code lost:
    
        if (defpackage.zv.c(r5, (java.security.cert.X509Certificate) r10) != false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(o2 o2Var, List list) {
        kn knVar;
        yo yoVar = o2Var.h;
        byte[] bArr = y70.a;
        if (this.p.size() < this.o && !this.j) {
            h10 h10Var = this.b;
            o2 o2Var2 = h10Var.a;
            o2 o2Var3 = h10Var.a;
            if (o2Var2.a(o2Var)) {
                String str = yoVar.d;
                String str2 = yoVar.d;
                if (op.d(str, o2Var3.h.d)) {
                    return true;
                }
                if (this.g != null && list != null && !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        h10 h10Var2 = (h10) it.next();
                        Proxy.Type type = h10Var2.b.type();
                        Proxy.Type type2 = Proxy.Type.DIRECT;
                        if (type == type2 && h10Var.b.type() == type2 && op.d(h10Var.c, h10Var2.c)) {
                            if (o2Var.d == zv.a) {
                                byte[] bArr2 = y70.a;
                                yo yoVar2 = o2Var3.h;
                                if (yoVar.e == yoVar2.e) {
                                    if (!op.d(str2, yoVar2.d)) {
                                        if (!this.k && (knVar = this.e) != null) {
                                            List a = knVar.a();
                                            if (!a.isEmpty()) {
                                                Object obj = a.get(0);
                                                obj.getClass();
                                            }
                                        }
                                    }
                                    try {
                                        n9 n9Var = o2Var.e;
                                        n9Var.getClass();
                                        kn knVar2 = this.e;
                                        knVar2.getClass();
                                        List a2 = knVar2.a();
                                        str2.getClass();
                                        a2.getClass();
                                        Iterator it2 = n9Var.a.iterator();
                                        if (!it2.hasNext()) {
                                            return true;
                                        }
                                        o30.g(it2.next());
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
        byte[] bArr = y70.a;
        long nanoTime = System.nanoTime();
        Socket socket = this.c;
        socket.getClass();
        Socket socket2 = this.d;
        socket2.getClass();
        this.h.getClass();
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        no noVar = this.g;
        if (noVar != null) {
            synchronized (noVar) {
                if (noVar.k) {
                    return false;
                }
                if (noVar.s < noVar.r) {
                    if (nanoTime >= noVar.t) {
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

    public final hi j(bw bwVar, az azVar) {
        int i = azVar.g;
        Socket socket = this.d;
        socket.getClass();
        ry ryVar = this.h;
        ryVar.getClass();
        qy qyVar = this.i;
        qyVar.getClass();
        no noVar = this.g;
        if (noVar != null) {
            return new oo(bwVar, this, azVar, noVar);
        }
        socket.setSoTimeout(i);
        ryVar.f.a().g(i);
        qyVar.f.a().g(azVar.h);
        return new bo(bwVar, this, ryVar, qyVar);
    }

    public final synchronized void k() {
        this.j = true;
    }

    public final void l() {
        Socket socket = this.d;
        socket.getClass();
        ry ryVar = this.h;
        ryVar.getClass();
        qy qyVar = this.i;
        qyVar.getClass();
        socket.setSoTimeout(0);
        m50 m50Var = m50.h;
        x4 x4Var = new x4(m50Var);
        String str = this.b.a.h.d;
        str.getClass();
        x4Var.b = socket;
        x4Var.c = y70.g + ' ' + str;
        x4Var.d = ryVar;
        x4Var.e = qyVar;
        x4Var.f = this;
        no noVar = new no(x4Var);
        this.g = noVar;
        v2 v2Var = no.E;
        this.o = (v2Var.a & 16) != 0 ? ((int[]) v2Var.b)[4] : Integer.MAX_VALUE;
        vo voVar = noVar.B;
        synchronized (voVar) {
            try {
                if (voVar.i) {
                    throw new IOException("closed");
                }
                Logger logger = vo.k;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(y70.f(">> CONNECTION " + co.a.b(), new Object[0]));
                }
                voVar.f.j(co.a);
                voVar.f.flush();
            } finally {
            }
        }
        vo voVar2 = noVar.B;
        v2 v2Var2 = noVar.u;
        synchronized (voVar2) {
            try {
                v2Var2.getClass();
                if (voVar2.i) {
                    throw new IOException("closed");
                }
                voVar2.o(0, Integer.bitCount(v2Var2.a) * 6, 4, 0);
                int i = 0;
                while (i < 10) {
                    boolean z = true;
                    if (((1 << i) & v2Var2.a) == 0) {
                        z = false;
                    }
                    if (z) {
                        voVar2.f.writeShort(i != 4 ? i != 7 ? i : 4 : 3);
                        voVar2.f.writeInt(((int[]) v2Var2.b)[i]);
                    }
                    i++;
                }
                voVar2.f.flush();
            } finally {
            }
        }
        if (noVar.u.b() != 65535) {
            noVar.B.t(0, r9 - 65535);
        }
        m50Var.e().c(new lo(2, noVar.C, noVar.h), 0L);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        h10 h10Var = this.b;
        sb.append(h10Var.a.h.d);
        sb.append(':');
        sb.append(h10Var.a.h.e);
        sb.append(", proxy=");
        sb.append(h10Var.b);
        sb.append(" hostAddress=");
        sb.append(h10Var.c);
        sb.append(" cipherSuite=");
        kn knVar = this.e;
        sb.append(knVar != null ? knVar.b : "none");
        sb.append(" protocol=");
        sb.append(this.f);
        sb.append('}');
        return sb.toString();
    }
}
