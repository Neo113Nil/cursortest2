package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class jp implements d41 {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public jp(qb2 qb2Var) {
        qb2Var.getClass();
        this.b = qb2Var;
    }

    public static int d(w92 w92Var, int i) {
        String b = w92.b(w92Var, "Retry-After");
        if (b == null) {
            return i;
        }
        if (!new Regex("\\d+").a(b)) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(b);
        valueOf.getClass();
        return valueOf.intValue();
    }

    @Override // defpackage.d41
    public final w92 a(sa1 sa1Var) {
        boolean z;
        boolean z2;
        t01 t01Var;
        SSLSocketFactory sSLSocketFactory;
        eu1 eu1Var;
        dt dtVar;
        switch (this.a) {
            case 0:
                qb2 qb2Var = (qb2) this.b;
                fy fyVar = (fy) sa1Var.i;
                js0 m = fyVar.m();
                kz0 kz0Var = (kz0) fyVar.n;
                mx0 mx0Var = (mx0) fyVar.p;
                if (mx0Var.a("Host") == null) {
                    z = false;
                    m.y("Host", n33.s(kz0Var, false));
                } else {
                    z = false;
                }
                if (mx0Var.a("Connection") == null) {
                    m.y("Connection", "Keep-Alive");
                }
                if (mx0Var.a("Accept-Encoding") == null && mx0Var.a("Range") == null) {
                    m.y("Accept-Encoding", "gzip");
                    z2 = true;
                } else {
                    z2 = z;
                }
                qb2Var.getClass();
                kz0Var.getClass();
                ah0.m.getClass();
                if (mx0Var.a("User-Agent") == null) {
                    m.y("User-Agent", "okhttp/4.12.0");
                }
                w92 f = sa1Var.f(m.c());
                mx0 mx0Var2 = f.r;
                ez0.b(qb2Var, kz0Var, mx0Var2);
                v92 f2 = f.f();
                f2.a = fyVar;
                if (z2 && "gzip".equalsIgnoreCase(w92.b(f, "Content-Encoding")) && ez0.a(f) && (t01Var = f.s) != null) {
                    ww0 ww0Var = new ww0(t01Var.n());
                    lx0 c = mx0Var2.c();
                    c.n("Content-Encoding");
                    c.n("Content-Length");
                    f2.f = c.c().c();
                    f2.g = new g72(w92.b(f, "Content-Type"), -1L, new p62(ww0Var));
                }
                return f2.a();
            default:
                fy fyVar2 = (fy) sa1Var.i;
                t62 t62Var = (t62) sa1Var.g;
                List list = ah0.m;
                w92 w92Var = null;
                int i = 0;
                fy fyVar3 = fyVar2;
                while (true) {
                    boolean z3 = true;
                    while (true) {
                        fyVar3.getClass();
                        if (t62Var.u != null) {
                            lh.g("Check failed.");
                            return null;
                        }
                        synchronized (t62Var) {
                            if (t62Var.w) {
                                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                            }
                            if (t62Var.v) {
                                throw new IllegalStateException("Check failed.");
                            }
                            Unit unit = Unit.a;
                        }
                        if (z3) {
                            w62 w62Var = t62Var.o;
                            kz0 kz0Var2 = (kz0) fyVar3.n;
                            fu1 fu1Var = t62Var.m;
                            if (kz0Var2.i) {
                                SSLSocketFactory sSLSocketFactory2 = fu1Var.A;
                                if (sSLSocketFactory2 == null) {
                                    lh.g("CLEARTEXT-only client");
                                    return null;
                                }
                                eu1 eu1Var2 = fu1Var.E;
                                dtVar = fu1Var.F;
                                sSLSocketFactory = sSLSocketFactory2;
                                eu1Var = eu1Var2;
                            } else {
                                sSLSocketFactory = null;
                                eu1Var = null;
                                dtVar = null;
                            }
                            t62Var.s = new zi0(w62Var, new k5(kz0Var2.d, kz0Var2.e, fu1Var.w, fu1Var.z, sSLSocketFactory, eu1Var, dtVar, fu1Var.y, fu1Var.D, fu1Var.C, fu1Var.x), t62Var);
                        }
                        try {
                            if (t62Var.y) {
                                throw new IOException("Canceled");
                            }
                            try {
                                w92 f3 = sa1Var.f(fyVar3);
                                if (w92Var != null) {
                                    v92 f4 = f3.f();
                                    v92 f5 = w92Var.f();
                                    f5.g = null;
                                    w92 a = f5.a();
                                    if (a.s != null) {
                                        throw new IllegalArgumentException("priorResponse.body != null");
                                    }
                                    f4.j = a;
                                    f3 = f4.a();
                                }
                                w92Var = f3;
                                fyVar3 = b(w92Var, t62Var.u);
                                if (fyVar3 == null) {
                                    t62Var.e(false);
                                    return w92Var;
                                }
                                t01 t01Var2 = w92Var.s;
                                if (t01Var2 != null) {
                                    n33.b(t01Var2);
                                }
                                i++;
                                if (i > 20) {
                                    throw new ProtocolException("Too many follow-up requests: " + i);
                                }
                                t62Var.e(true);
                            } catch (bc2 e) {
                                boolean c2 = c(e.n, t62Var, fyVar3, false);
                                IOException iOException = e.m;
                                if (!c2) {
                                    iOException.getClass();
                                    list.getClass();
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        wi0.a(iOException, (Exception) it.next());
                                    }
                                    throw iOException;
                                }
                                list = zv.F(list, iOException);
                                t62Var.e(true);
                            } catch (IOException e2) {
                                if (!c(e2, t62Var, fyVar3, !(e2 instanceof d10))) {
                                    list.getClass();
                                    Iterator it2 = list.iterator();
                                    while (it2.hasNext()) {
                                        wi0.a(e2, (Exception) it2.next());
                                    }
                                    throw e2;
                                }
                                list = zv.F(list, e2);
                                t62Var.e(true);
                            }
                        } catch (Throwable th) {
                            t62Var.e(true);
                            throw th;
                        }
                        z3 = false;
                    }
                }
        }
    }

    public fy b(w92 w92Var, du duVar) {
        jz0 jz0Var;
        w92 w92Var2;
        v62 v62Var;
        ac2 ac2Var = (duVar == null || (v62Var = (v62) duVar.e) == null) ? null : v62Var.b;
        int i = w92Var.p;
        String str = (String) w92Var.m.o;
        if (i != 307 && i != 308) {
            if (i == 401) {
                ((fu1) this.b).s.getClass();
                return null;
            }
            if (i != 421) {
                if (i == 503) {
                    w92 w92Var3 = w92Var.v;
                    if ((w92Var3 == null || w92Var3.p != 503) && d(w92Var, Integer.MAX_VALUE) == 0) {
                        return w92Var.m;
                    }
                } else {
                    if (i == 407) {
                        ac2Var.getClass();
                        if (ac2Var.b.type() != Proxy.Type.HTTP) {
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                        ((fu1) this.b).y.getClass();
                        return null;
                    }
                    if (i != 408) {
                        switch (i) {
                        }
                    } else if (((fu1) this.b).r && (((w92Var2 = w92Var.v) == null || w92Var2.p != 408) && d(w92Var, 0) <= 0)) {
                        return w92Var.m;
                    }
                }
            } else if (duVar != null && !Intrinsics.b(((zi0) duVar.c).b.h.d, ((v62) duVar.e).b.a.h.d)) {
                v62 v62Var2 = (v62) duVar.e;
                synchronized (v62Var2) {
                    v62Var2.k = true;
                }
                return w92Var.m;
            }
            return null;
        }
        fu1 fu1Var = (fu1) this.b;
        if (fu1Var.t) {
            String b = w92.b(w92Var, "Location");
            fy fyVar = w92Var.m;
            if (b != null) {
                kz0 kz0Var = (kz0) fyVar.n;
                kz0Var.getClass();
                try {
                    jz0Var = new jz0();
                    jz0Var.c(kz0Var, b);
                } catch (IllegalArgumentException unused) {
                    jz0Var = null;
                }
                kz0 a = jz0Var != null ? jz0Var.a() : null;
                if (a != null && (Intrinsics.b(a.a, ((kz0) fyVar.n).a) || fu1Var.u)) {
                    js0 m = fyVar.m();
                    if (ll3.O(str)) {
                        int i2 = w92Var.p;
                        boolean z = str.equals("PROPFIND") || i2 == 308 || i2 == 307;
                        if (str.equals("PROPFIND") || i2 == 308 || i2 == 307) {
                            m.B(str, null);
                        } else {
                            m.B("GET", null);
                        }
                        if (!z) {
                            ((lx0) m.o).n("Transfer-Encoding");
                            ((lx0) m.o).n("Content-Length");
                            ((lx0) m.o).n("Content-Type");
                        }
                    }
                    if (!n33.a((kz0) fyVar.n, a)) {
                        ((lx0) m.o).n("Authorization");
                    }
                    m.m = a;
                    return m.c();
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
    public boolean c(IOException iOException, t62 t62Var, fy fyVar, boolean z) {
        boolean z2;
        te teVar;
        v62 v62Var;
        if (!((fu1) this.b).r || ((z && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException))) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (iOException instanceof SocketTimeoutException) {
            }
        }
        if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        zi0 zi0Var = t62Var.s;
        zi0Var.getClass();
        int i = zi0Var.f;
        if (i == 0 && zi0Var.g == 0 && zi0Var.h == 0) {
            z2 = false;
        } else {
            if (zi0Var.i == null) {
                ac2 ac2Var = null;
                if (i <= 1 && zi0Var.g <= 1 && zi0Var.h <= 0 && (v62Var = zi0Var.c.t) != null) {
                    synchronized (v62Var) {
                        if (v62Var.l == 0) {
                            if (n33.a(v62Var.b.a.h, zi0Var.b.h)) {
                                ac2Var = v62Var.b;
                            }
                        }
                    }
                }
                if (ac2Var != null) {
                    zi0Var.i = ac2Var;
                } else {
                    r5 r5Var = zi0Var.d;
                    if ((r5Var == null || !r5Var.g()) && (teVar = zi0Var.e) != null) {
                        z2 = teVar.d();
                    }
                }
            }
            z2 = true;
        }
        return z2;
    }

    public jp(fu1 fu1Var) {
        this.b = fu1Var;
    }
}
