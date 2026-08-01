package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class s8 implements yo {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public s8(dh dhVar) {
        dhVar.getClass();
        this.b = dhVar;
    }

    public static int d(i00 i00Var, int i) {
        String m = i00.m(i00Var, "Retry-After");
        if (m == null) {
            return i;
        }
        Pattern compile = Pattern.compile("\\d+");
        compile.getClass();
        if (!compile.matcher(m).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(m);
        valueOf.getClass();
        return valueOf.intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v25, types: [java.util.ArrayList] */
    @Override // defpackage.yo
    public final i00 a(ly lyVar) {
        boolean z;
        boolean z2;
        k00 k00Var;
        ?? arrayList;
        SSLSocketFactory sSLSocketFactory;
        sv svVar;
        r9 r9Var;
        switch (this.a) {
            case 0:
                dh dhVar = (dh) this.b;
                xz xzVar = lyVar.e;
                we a = xzVar.a();
                jo joVar = xzVar.a;
                ym ymVar = xzVar.c;
                if (ymVar.a("Host") == null) {
                    z = false;
                    a.p("Host", r70.t(joVar, false));
                } else {
                    z = false;
                }
                if (ymVar.a("Connection") == null) {
                    a.p("Connection", "Keep-Alive");
                }
                if (ymVar.a("Accept-Encoding") == null && ymVar.a("Range") == null) {
                    a.p("Accept-Encoding", "gzip");
                    z2 = true;
                } else {
                    z2 = z;
                }
                dhVar.getClass();
                joVar.getClass();
                if (ymVar.a("User-Agent") == null) {
                    a.p("User-Agent", "okhttp/4.12.0");
                }
                i00 b = lyVar.b(a.d());
                ym ymVar2 = b.k;
                ho.b(dhVar, joVar, ymVar2);
                h00 n = b.n();
                n.a = xzVar;
                if (z2 && "gzip".equalsIgnoreCase(i00.m(b, "Content-Encoding")) && ho.a(b) && (k00Var = b.l) != null) {
                    qm qmVar = new qm(k00Var.o());
                    k0 c = ymVar2.c();
                    c.I("Content-Encoding");
                    c.I("Content-Length");
                    n.f = c.B().c();
                    n.g = new my(i00.m(b, "Content-Type"), -1L, new cy(qmVar));
                }
                return n.a();
            default:
                xz xzVar2 = lyVar.e;
                gy gyVar = lyVar.a;
                di diVar = di.f;
                i00 i00Var = null;
                int i = 0;
                xz xzVar3 = xzVar2;
                while (true) {
                    boolean z3 = true;
                    while (gyVar.n == null) {
                        synchronized (gyVar) {
                            try {
                                if (gyVar.p) {
                                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                }
                                if (gyVar.o) {
                                    throw new IllegalStateException("Check failed.");
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z3) {
                            ky kyVar = gyVar.h;
                            jo joVar2 = xzVar3.a;
                            uv uvVar = gyVar.f;
                            if (joVar2.i) {
                                SSLSocketFactory sSLSocketFactory2 = uvVar.t;
                                if (sSLSocketFactory2 == null) {
                                    t8.t("CLEARTEXT-only client");
                                    return null;
                                }
                                sv svVar2 = uvVar.x;
                                r9Var = uvVar.y;
                                sSLSocketFactory = sSLSocketFactory2;
                                svVar = svVar2;
                            } else {
                                sSLSocketFactory = null;
                                svVar = null;
                                r9Var = null;
                            }
                            gyVar.l = new pi(kyVar, new y1(joVar2.d, joVar2.e, uvVar.p, uvVar.s, sSLSocketFactory, svVar, r9Var, uvVar.r, uvVar.w, uvVar.v, uvVar.q), gyVar);
                        }
                        try {
                            if (gyVar.r) {
                                throw new IOException("Canceled");
                            }
                            try {
                                i00 b2 = lyVar.b(xzVar3);
                                if (i00Var != null) {
                                    h00 n2 = b2.n();
                                    h00 n3 = i00Var.n();
                                    n3.g = null;
                                    i00 a2 = n3.a();
                                    if (a2.l != null) {
                                        throw new IllegalArgumentException("priorResponse.body != null");
                                    }
                                    n2.j = a2;
                                    b2 = n2.a();
                                }
                                i00Var = b2;
                                xzVar3 = b(i00Var, gyVar.n);
                                if (xzVar3 == null) {
                                    gyVar.e(false);
                                    return i00Var;
                                }
                                k00 k00Var2 = i00Var.l;
                                if (k00Var2 != null) {
                                    r70.b(k00Var2);
                                }
                                i++;
                                if (i > 20) {
                                    throw new ProtocolException("Too many follow-up requests: " + i);
                                }
                                gyVar.e(true);
                            } catch (IOException e) {
                                if (!c(e, gyVar, xzVar3, !(e instanceof bc))) {
                                    Iterator it = diVar.iterator();
                                    while (it.hasNext()) {
                                        zo.a(e, (Exception) it.next());
                                    }
                                    throw e;
                                }
                                arrayList = new ArrayList(diVar.size() + 1);
                                arrayList.addAll(diVar);
                                arrayList.add(e);
                                gyVar.e(true);
                                diVar = arrayList;
                                z3 = false;
                            } catch (s00 e2) {
                                boolean c2 = c(e2.g, gyVar, xzVar3, false);
                                IOException iOException = e2.f;
                                if (!c2) {
                                    iOException.getClass();
                                    Iterator it2 = diVar.iterator();
                                    while (it2.hasNext()) {
                                        zo.a(iOException, (Exception) it2.next());
                                    }
                                    throw iOException;
                                }
                                arrayList = new ArrayList(diVar.size() + 1);
                                arrayList.addAll(diVar);
                                arrayList.add(iOException);
                                gyVar.e(true);
                                diVar = arrayList;
                                z3 = false;
                            }
                        } catch (Throwable th2) {
                            gyVar.e(true);
                            throw th2;
                        }
                    }
                    t8.t("Check failed.");
                    return null;
                }
        }
    }

    public xz b(i00 i00Var, ni niVar) {
        io ioVar;
        i00 i00Var2;
        jy jyVar;
        r00 r00Var = (niVar == null || (jyVar = niVar.e) == null) ? null : jyVar.b;
        int i = i00Var.i;
        String str = i00Var.f.b;
        if (i != 307 && i != 308) {
            if (i == 401) {
                ((uv) this.b).l.getClass();
                return null;
            }
            if (i != 421) {
                if (i == 503) {
                    i00 i00Var3 = i00Var.o;
                    if ((i00Var3 == null || i00Var3.i != 503) && d(i00Var, Integer.MAX_VALUE) == 0) {
                        return i00Var.f;
                    }
                } else {
                    if (i == 407) {
                        r00Var.getClass();
                        if (r00Var.b.type() != Proxy.Type.HTTP) {
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                        ((uv) this.b).r.getClass();
                        return null;
                    }
                    if (i != 408) {
                        switch (i) {
                        }
                    } else if (((uv) this.b).k && (((i00Var2 = i00Var.o) == null || i00Var2.i != 408) && d(i00Var, 0) <= 0)) {
                        return i00Var.f;
                    }
                }
            } else if (niVar != null && !zo.b(niVar.b.b.h.d, niVar.e.b.a.h.d)) {
                jy jyVar2 = niVar.e;
                synchronized (jyVar2) {
                    jyVar2.k = true;
                }
                return i00Var.f;
            }
            return null;
        }
        uv uvVar = (uv) this.b;
        if (uvVar.m) {
            String m = i00.m(i00Var, "Location");
            xz xzVar = i00Var.f;
            if (m != null) {
                jo joVar = xzVar.a;
                joVar.getClass();
                try {
                    ioVar = new io(0);
                    ioVar.f(joVar, m);
                } catch (IllegalArgumentException unused) {
                    ioVar = null;
                }
                jo b = ioVar != null ? ioVar.b() : null;
                if (b != null && (zo.b(b.a, xzVar.a.a) || uvVar.n)) {
                    we a = xzVar.a();
                    if (zo.G(str)) {
                        int i2 = i00Var.i;
                        boolean z = str.equals("PROPFIND") || i2 == 308 || i2 == 307;
                        if (str.equals("PROPFIND") || i2 == 308 || i2 == 307) {
                            a.t(str, null);
                        } else {
                            a.t("GET", null);
                        }
                        if (!z) {
                            ((k0) a.h).I("Transfer-Encoding");
                            ((k0) a.h).I("Content-Length");
                            ((k0) a.h).I("Content-Type");
                        }
                    }
                    if (!r70.a(xzVar.a, b)) {
                        ((k0) a.h).I("Authorization");
                    }
                    a.f = b;
                    return a.d();
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001f, code lost:
    
        if (r6 == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean c(IOException iOException, gy gyVar, xz xzVar, boolean z) {
        boolean z2;
        x1 x1Var;
        jy jyVar;
        if (!((uv) this.b).k || ((z && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException))) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (iOException instanceof SocketTimeoutException) {
            }
        }
        if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        pi piVar = gyVar.l;
        piVar.getClass();
        int i = piVar.f;
        if (i == 0 && piVar.g == 0 && piVar.h == 0) {
            z2 = false;
        } else {
            if (piVar.i == null) {
                r00 r00Var = null;
                if (i <= 1 && piVar.g <= 1 && piVar.h <= 0 && (jyVar = piVar.c.m) != null) {
                    synchronized (jyVar) {
                        if (jyVar.l == 0) {
                            if (r70.a(jyVar.b.a.h, piVar.b.h)) {
                                r00Var = jyVar.b;
                            }
                        }
                    }
                }
                if (r00Var != null) {
                    piVar.i = r00Var;
                } else {
                    or orVar = piVar.d;
                    if ((orVar == null || !orVar.h()) && (x1Var = piVar.e) != null) {
                        z2 = x1Var.j();
                    }
                }
            }
            z2 = true;
        }
        return z2;
    }

    public s8(uv uvVar) {
        this.b = uvVar;
    }
}
