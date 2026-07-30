package com.anythink.core.common.n.b.a.c;

import com.anythink.basead.ui.BaseATView;
import com.anythink.core.common.n.b.ad;
import com.anythink.core.common.n.b.ae;
import com.anythink.core.common.n.b.af;
import com.anythink.core.common.n.b.ag;
import com.anythink.core.common.n.b.ah;
import com.anythink.core.common.n.b.v;
import com.anythink.core.common.n.b.w;
import com.anythink.core.common.n.b.z;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;

/* loaded from: classes.dex */
public final class j implements w {

    /* renamed from: a, reason: collision with root package name */
    private static final int f15226a = 20;

    /* renamed from: b, reason: collision with root package name */
    private final z f15227b;

    public j(z zVar) {
        this.f15227b = zVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0103, code lost:
    
        if (r8.equals("HEAD") == false) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x018d  */
    @Override // com.anythink.core.common.n.b.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final af a(w.a aVar) {
        com.anythink.core.common.n.b.a.b.c a9;
        ah a10;
        ad adVar;
        String a11;
        v c4;
        ad a12 = aVar.a();
        g gVar = (g) aVar;
        com.anythink.core.common.n.b.a.b.j g9 = gVar.g();
        int i = 0;
        af afVar = null;
        while (true) {
            g9.a(a12);
            if (g9.j()) {
                throw new IOException("Canceled");
            }
            try {
                try {
                    af a13 = gVar.a(a12, g9, null);
                    if (afVar != null) {
                        a13 = a13.h().c(afVar.h().a((ag) null).a()).a();
                    }
                    afVar = a13;
                    a9 = com.anythink.core.common.n.b.a.a.f15027a.a(afVar);
                    a10 = a9 != null ? a9.a().a() : null;
                } catch (com.anythink.core.common.n.b.a.b.h e6) {
                    if (!a(e6.b(), g9, false, a12)) {
                        throw e6.a();
                    }
                } catch (IOException e9) {
                    if (!a(e9, g9, !(e9 instanceof com.anythink.core.common.n.b.a.e.a), a12)) {
                        throw e9;
                    }
                }
                if (afVar == null) {
                    throw new IllegalStateException();
                }
                int c9 = afVar.c();
                String b9 = afVar.a().b();
                if (c9 == 307 || c9 == 308) {
                    if (!b9.equals("GET")) {
                    }
                    if (this.f15227b.o() && (a11 = afVar.a("Location")) != null && (c4 = afVar.a().a().c(a11)) != null && (c4.b().equals(afVar.a().a().b()) || this.f15227b.n())) {
                        ad.a e10 = afVar.a().e();
                        if (f.c(b9)) {
                            boolean equals = b9.equals("PROPFIND");
                            if (b9.equals("PROPFIND")) {
                                e10.a(b9, equals ? afVar.a().d() : null);
                            } else {
                                e10.a("GET", (ae) null);
                            }
                            if (!equals) {
                                e10.b("Transfer-Encoding");
                                e10.b("Content-Length");
                                e10.b("Content-Type");
                            }
                        }
                        if (!com.anythink.core.common.n.b.a.c.a(afVar.a().a(), c4)) {
                            e10.b("Authorization");
                        }
                        adVar = e10.a(c4).b();
                    }
                    adVar = null;
                } else if (c9 == 401) {
                    adVar = this.f15227b.k().authenticate(a10, afVar);
                } else if (c9 == 503) {
                    if ((afVar.j() == null || afVar.j().c() != 503) && a(afVar, Integer.MAX_VALUE) == 0) {
                        adVar = afVar.a();
                    }
                    adVar = null;
                } else if (c9 != 407) {
                    if (c9 != 408) {
                        switch (c9) {
                            case 300:
                            case BaseATView.a.f9932L /* 301 */:
                            case 302:
                            case BaseATView.a.f9934N /* 303 */:
                                if (this.f15227b.o()) {
                                    ad.a e102 = afVar.a().e();
                                    if (f.c(b9)) {
                                    }
                                    if (!com.anythink.core.common.n.b.a.c.a(afVar.a().a(), c4)) {
                                    }
                                    adVar = e102.a(c4).b();
                                    break;
                                }
                                break;
                            default:
                                adVar = null;
                                break;
                        }
                    } else if (this.f15227b.p()) {
                        afVar.a().d();
                        if ((afVar.j() == null || afVar.j().c() != 408) && a(afVar, 0) <= 0) {
                            adVar = afVar.a();
                        }
                    }
                    adVar = null;
                } else {
                    if ((a10 != null ? a10.b() : this.f15227b.c()).type() != Proxy.Type.HTTP) {
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    }
                    adVar = this.f15227b.l().authenticate(a10, afVar);
                }
                if (adVar == null) {
                    if (a9 != null && a9.b()) {
                        g9.c();
                    }
                    return afVar;
                }
                adVar.d();
                com.anythink.core.common.n.b.a.c.a(afVar.g());
                if (g9.h()) {
                    a9.i();
                }
                i++;
                if (i > 20) {
                    throw new ProtocolException("Too many follow-up requests: ".concat(String.valueOf(i)));
                }
                a12 = adVar;
            } finally {
                g9.f();
            }
        }
    }

    private boolean a(IOException iOException, com.anythink.core.common.n.b.a.b.j jVar, boolean z8, ad adVar) {
        if (this.f15227b.p()) {
            return !(z8 && a(iOException, adVar)) && a(iOException, z8) && jVar.g();
        }
        return false;
    }

    private static boolean a(IOException iOException, ad adVar) {
        adVar.d();
        return iOException instanceof FileNotFoundException;
    }

    private static boolean a(IOException iOException, boolean z8) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z8 : (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x00bd, code lost:
    
        if (r1.equals("HEAD") == false) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private ad a(af afVar, ah ahVar) {
        String a9;
        v c4;
        Proxy c9;
        if (afVar != null) {
            int c10 = afVar.c();
            String b9 = afVar.a().b();
            if (c10 == 307 || c10 == 308) {
                if (!b9.equals("GET")) {
                }
                if (this.f15227b.o() && (a9 = afVar.a("Location")) != null && (c4 = afVar.a().a().c(a9)) != null && (c4.b().equals(afVar.a().a().b()) || this.f15227b.n())) {
                    ad.a e6 = afVar.a().e();
                    if (f.c(b9)) {
                        boolean equals = b9.equals("PROPFIND");
                        if (!b9.equals("PROPFIND")) {
                            e6.a("GET", (ae) null);
                        } else {
                            e6.a(b9, equals ? afVar.a().d() : null);
                        }
                        if (!equals) {
                            e6.b("Transfer-Encoding");
                            e6.b("Content-Length");
                            e6.b("Content-Type");
                        }
                    }
                    if (!com.anythink.core.common.n.b.a.c.a(afVar.a().a(), c4)) {
                        e6.b("Authorization");
                    }
                    return e6.a(c4).b();
                }
                return null;
            }
            if (c10 == 401) {
                return this.f15227b.k().authenticate(ahVar, afVar);
            }
            if (c10 != 503) {
                if (c10 == 407) {
                    if (ahVar != null) {
                        c9 = ahVar.b();
                    } else {
                        c9 = this.f15227b.c();
                    }
                    if (c9.type() == Proxy.Type.HTTP) {
                        return this.f15227b.l().authenticate(ahVar, afVar);
                    }
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                if (c10 == 408) {
                    if (this.f15227b.p()) {
                        afVar.a().d();
                        if ((afVar.j() == null || afVar.j().c() != 408) && a(afVar, 0) <= 0) {
                            return afVar.a();
                        }
                    }
                } else {
                    switch (c10) {
                        case 300:
                        case BaseATView.a.f9932L /* 301 */:
                        case 302:
                        case BaseATView.a.f9934N /* 303 */:
                            if (this.f15227b.o()) {
                                ad.a e62 = afVar.a().e();
                                if (f.c(b9)) {
                                }
                                if (!com.anythink.core.common.n.b.a.c.a(afVar.a().a(), c4)) {
                                }
                                return e62.a(c4).b();
                            }
                            break;
                        default:
                            return null;
                    }
                }
            } else if ((afVar.j() == null || afVar.j().c() != 503) && a(afVar, Integer.MAX_VALUE) == 0) {
                return afVar.a();
            }
            return null;
        }
        throw new IllegalStateException();
    }

    private static int a(af afVar, int i) {
        String a9 = afVar.a("Retry-After");
        if (a9 == null) {
            return i;
        }
        if (a9.matches("\\d+")) {
            return Integer.valueOf(a9).intValue();
        }
        return Integer.MAX_VALUE;
    }
}
