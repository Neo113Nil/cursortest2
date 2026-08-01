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

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class n8 implements np {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public n8(vg vgVar) {
        vgVar.getClass();
        this.b = vgVar;
    }

    public static int d(y00 y00Var, int i) {
        String m = y00.m(y00Var, "Retry-After");
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
    @Override // defpackage.np
    public final y00 a(az azVar) {
        boolean z;
        boolean z2;
        a10 a10Var;
        ?? arrayList;
        SSLSocketFactory sSLSocketFactory;
        zv zvVar;
        n9 n9Var;
        switch (this.a) {
            case 0:
                vg vgVar = (vg) this.b;
                pp ppVar = azVar.e;
                h8 a = ppVar.a();
                yo yoVar = (yo) ppVar.b;
                nn nnVar = (nn) ppVar.d;
                if (nnVar.a("Host") == null) {
                    z = false;
                    a.e("Host", y70.t(yoVar, false));
                } else {
                    z = false;
                }
                if (nnVar.a("Connection") == null) {
                    a.e("Connection", "Keep-Alive");
                }
                if (nnVar.a("Accept-Encoding") == null && nnVar.a("Range") == null) {
                    a.e("Accept-Encoding", "gzip");
                    z2 = true;
                } else {
                    z2 = z;
                }
                vgVar.getClass();
                yoVar.getClass();
                if (nnVar.a("User-Agent") == null) {
                    a.e("User-Agent", "okhttp/4.12.0");
                }
                y00 b = azVar.b(a.a());
                nn nnVar2 = b.k;
                wo.b(vgVar, yoVar, nnVar2);
                x00 n = b.n();
                n.a = ppVar;
                if (z2 && "gzip".equalsIgnoreCase(y00.m(b, "Content-Encoding")) && wo.a(b) && (a10Var = b.l) != null) {
                    dn dnVar = new dn(a10Var.o());
                    j1 c = nnVar2.c();
                    c.x("Content-Encoding");
                    c.x("Content-Length");
                    n.f = c.u().c();
                    n.g = new bz(y00.m(b, "Content-Type"), -1L, new ry(dnVar));
                }
                return n.a();
            default:
                pp ppVar2 = azVar.e;
                vy vyVar = azVar.a;
                vh vhVar = vh.f;
                y00 y00Var = null;
                int i = 0;
                pp ppVar3 = ppVar2;
                while (true) {
                    boolean z3 = true;
                    while (vyVar.n == null) {
                        synchronized (vyVar) {
                            try {
                                if (vyVar.p) {
                                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                }
                                if (vyVar.o) {
                                    throw new IllegalStateException("Check failed.");
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z3) {
                            zy zyVar = vyVar.h;
                            yo yoVar2 = (yo) ppVar3.b;
                            bw bwVar = vyVar.f;
                            if (yoVar2.i) {
                                SSLSocketFactory sSLSocketFactory2 = bwVar.t;
                                if (sSLSocketFactory2 == null) {
                                    o8.t("CLEARTEXT-only client");
                                    return null;
                                }
                                zv zvVar2 = bwVar.x;
                                n9Var = bwVar.y;
                                sSLSocketFactory = sSLSocketFactory2;
                                zvVar = zvVar2;
                            } else {
                                sSLSocketFactory = null;
                                zvVar = null;
                                n9Var = null;
                            }
                            vyVar.l = new ii(zyVar, new o2(yoVar2.d, yoVar2.e, bwVar.p, bwVar.s, sSLSocketFactory, zvVar, n9Var, bwVar.r, bwVar.w, bwVar.v, bwVar.q), vyVar);
                        }
                        try {
                            if (vyVar.r) {
                                throw new IOException("Canceled");
                            }
                            try {
                                try {
                                    y00 b2 = azVar.b(ppVar3);
                                    if (y00Var != null) {
                                        x00 n2 = b2.n();
                                        x00 n3 = y00Var.n();
                                        n3.g = null;
                                        y00 a2 = n3.a();
                                        if (a2.l != null) {
                                            throw new IllegalArgumentException("priorResponse.body != null");
                                        }
                                        n2.j = a2;
                                        b2 = n2.a();
                                    }
                                    y00Var = b2;
                                    ppVar3 = b(y00Var, vyVar.n);
                                    if (ppVar3 == null) {
                                        vyVar.e(false);
                                        return y00Var;
                                    }
                                    a10 a10Var2 = y00Var.l;
                                    if (a10Var2 != null) {
                                        y70.b(a10Var2);
                                    }
                                    i++;
                                    if (i > 20) {
                                        throw new ProtocolException("Too many follow-up requests: " + i);
                                    }
                                    vyVar.e(true);
                                } catch (IOException e) {
                                    if (!c(e, vyVar, ppVar3, !(e instanceof fc))) {
                                        Iterator it = vhVar.iterator();
                                        while (it.hasNext()) {
                                            j8.b(e, (Exception) it.next());
                                        }
                                        throw e;
                                    }
                                    arrayList = new ArrayList(vhVar.size() + 1);
                                    arrayList.addAll(vhVar);
                                    arrayList.add(e);
                                    vyVar.e(true);
                                    vhVar = arrayList;
                                    z3 = false;
                                }
                            } catch (i10 e2) {
                                boolean c2 = c(e2.g, vyVar, ppVar3, false);
                                IOException iOException = e2.f;
                                if (!c2) {
                                    iOException.getClass();
                                    Iterator it2 = vhVar.iterator();
                                    while (it2.hasNext()) {
                                        j8.b(iOException, (Exception) it2.next());
                                    }
                                    throw iOException;
                                }
                                arrayList = new ArrayList(vhVar.size() + 1);
                                arrayList.addAll(vhVar);
                                arrayList.add(iOException);
                                vyVar.e(true);
                                vhVar = arrayList;
                                z3 = false;
                            }
                        } catch (Throwable th2) {
                            vyVar.e(true);
                            throw th2;
                        }
                    }
                    o8.t("Check failed.");
                    return null;
                }
        }
    }

    public pp b(y00 y00Var, gi giVar) {
        xo xoVar;
        y00 y00Var2;
        yy yyVar;
        h10 h10Var = (giVar == null || (yyVar = giVar.e) == null) ? null : yyVar.b;
        int i = y00Var.i;
        String str = (String) y00Var.f.c;
        if (i != 307 && i != 308) {
            if (i == 401) {
                ((bw) this.b).l.getClass();
                return null;
            }
            if (i != 421) {
                if (i == 503) {
                    y00 y00Var3 = y00Var.o;
                    if ((y00Var3 == null || y00Var3.i != 503) && d(y00Var, Integer.MAX_VALUE) == 0) {
                        return y00Var.f;
                    }
                } else {
                    if (i == 407) {
                        h10Var.getClass();
                        if (h10Var.b.type() != Proxy.Type.HTTP) {
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                        ((bw) this.b).r.getClass();
                        return null;
                    }
                    if (i != 408) {
                        switch (i) {
                        }
                    } else if (((bw) this.b).k && (((y00Var2 = y00Var.o) == null || y00Var2.i != 408) && d(y00Var, 0) <= 0)) {
                        return y00Var.f;
                    }
                }
            } else if (giVar != null && !op.d(giVar.b.b.h.d, giVar.e.b.a.h.d)) {
                yy yyVar2 = giVar.e;
                synchronized (yyVar2) {
                    yyVar2.k = true;
                }
                return y00Var.f;
            }
            return null;
        }
        bw bwVar = (bw) this.b;
        if (bwVar.m) {
            String m = y00.m(y00Var, "Location");
            pp ppVar = y00Var.f;
            if (m != null) {
                yo yoVar = (yo) ppVar.b;
                yoVar.getClass();
                try {
                    xoVar = new xo(0);
                    xoVar.f(yoVar, m);
                } catch (IllegalArgumentException unused) {
                    xoVar = null;
                }
                yo b = xoVar != null ? xoVar.b() : null;
                if (b != null && (op.d(b.a, ((yo) ppVar.b).a) || bwVar.n)) {
                    h8 a = ppVar.a();
                    if (l70.I(str)) {
                        int i2 = y00Var.i;
                        boolean z = str.equals("PROPFIND") || i2 == 308 || i2 == 307;
                        if (str.equals("PROPFIND") || i2 == 308 || i2 == 307) {
                            a.f(str, null);
                        } else {
                            a.f("GET", null);
                        }
                        if (!z) {
                            ((j1) a.h).x("Transfer-Encoding");
                            ((j1) a.h).x("Content-Length");
                            ((j1) a.h).x("Content-Type");
                        }
                    }
                    if (!y70.a((yo) ppVar.b, b)) {
                        ((j1) a.h).x("Authorization");
                    }
                    a.f = b;
                    return a.a();
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
    public boolean c(IOException iOException, vy vyVar, pp ppVar, boolean z) {
        boolean z2;
        l2 l2Var;
        yy yyVar;
        if (!((bw) this.b).k || ((z && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException))) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (iOException instanceof SocketTimeoutException) {
            }
        }
        if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        ii iiVar = vyVar.l;
        iiVar.getClass();
        int i = iiVar.f;
        if (i == 0 && iiVar.g == 0 && iiVar.h == 0) {
            z2 = false;
        } else {
            if (iiVar.i == null) {
                h10 h10Var = null;
                if (i <= 1 && iiVar.g <= 1 && iiVar.h <= 0 && (yyVar = iiVar.c.m) != null) {
                    synchronized (yyVar) {
                        if (yyVar.l == 0) {
                            if (y70.a(yyVar.b.a.h, iiVar.b.h)) {
                                h10Var = yyVar.b;
                            }
                        }
                    }
                }
                if (h10Var != null) {
                    iiVar.i = h10Var;
                } else {
                    v2 v2Var = iiVar.d;
                    if ((v2Var == null || !v2Var.c()) && (l2Var = iiVar.e) != null) {
                        z2 = l2Var.g();
                    }
                }
            }
            z2 = true;
        }
        return z2;
    }

    public n8(bw bwVar) {
        this.b = bwVar;
    }
}
