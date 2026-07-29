package b.a.c;

import b.aa;
import b.ab;
import b.ac;
import b.ad;
import b.ae;
import b.t;
import b.u;
import b.x;
import com.aiming.mdt.utils.Constants;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.HttpRetryException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: RetryAndFollowUpInterceptor.java */
/* loaded from: classes.dex */
public final class j implements u {

    /* renamed from: a, reason: collision with root package name */
    private final x f1871a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f1872b;

    /* renamed from: c, reason: collision with root package name */
    private b.a.b.g f1873c;

    /* renamed from: d, reason: collision with root package name */
    private Object f1874d;
    private volatile boolean e;

    public j(x xVar, boolean z) {
        this.f1871a = xVar;
        this.f1872b = z;
    }

    public void a() {
        this.e = true;
        b.a.b.g gVar = this.f1873c;
        if (gVar != null) {
            gVar.e();
        }
    }

    public boolean b() {
        return this.e;
    }

    public void a(Object obj) {
        this.f1874d = obj;
    }

    @Override // b.u
    public ac intercept(u.a aVar) throws IOException {
        aa a2 = aVar.a();
        this.f1873c = new b.a.b.g(this.f1871a.o(), a(a2.a()), this.f1874d);
        ac acVar = null;
        int i = 0;
        while (!this.e) {
            try {
                try {
                    ac a3 = ((g) aVar).a(a2, this.f1873c, null, null);
                    acVar = acVar != null ? a3.g().c(acVar.g().a((ad) null).a()).a() : a3;
                    a2 = a(acVar);
                } catch (b.a.b.e e) {
                    if (!a(e.a(), false, a2)) {
                        throw e.a();
                    }
                } catch (IOException e2) {
                    if (!a(e2, !(e2 instanceof b.a.e.a), a2)) {
                        throw e2;
                    }
                }
                if (a2 == null) {
                    if (!this.f1872b) {
                        this.f1873c.c();
                    }
                    return acVar;
                }
                b.a.c.a(acVar.f());
                i++;
                if (i > 20) {
                    this.f1873c.c();
                    throw new ProtocolException("Too many follow-up requests: " + i);
                }
                if (a2.d() instanceof l) {
                    this.f1873c.c();
                    throw new HttpRetryException("Cannot retry streamed HTTP body", acVar.b());
                }
                if (!a(acVar, a2.a())) {
                    this.f1873c.c();
                    this.f1873c = new b.a.b.g(this.f1871a.o(), a(a2.a()), this.f1874d);
                } else if (this.f1873c.a() != null) {
                    throw new IllegalStateException("Closing the body of " + acVar + " didn't close its backing stream. Bad interceptor?");
                }
            } catch (Throwable th) {
                this.f1873c.a((IOException) null);
                this.f1873c.c();
                throw th;
            }
        }
        this.f1873c.c();
        throw new IOException("Canceled");
    }

    private b.a a(t tVar) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        b.g gVar;
        if (tVar.c()) {
            SSLSocketFactory j = this.f1871a.j();
            hostnameVerifier = this.f1871a.k();
            sSLSocketFactory = j;
            gVar = this.f1871a.l();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            gVar = null;
        }
        return new b.a(tVar.f(), tVar.g(), this.f1871a.h(), this.f1871a.i(), sSLSocketFactory, hostnameVerifier, gVar, this.f1871a.n(), this.f1871a.d(), this.f1871a.t(), this.f1871a.u(), this.f1871a.e());
    }

    private boolean a(IOException iOException, boolean z, aa aaVar) {
        this.f1873c.a(iOException);
        if (this.f1871a.r()) {
            return !(z && (aaVar.d() instanceof l)) && a(iOException, z) && this.f1873c.f();
        }
        return false;
    }

    private boolean a(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z : (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    private aa a(ac acVar) throws IOException {
        String a2;
        t c2;
        Proxy d2;
        if (acVar == null) {
            throw new IllegalStateException();
        }
        b.a.b.c b2 = this.f1873c.b();
        ae a3 = b2 != null ? b2.a() : null;
        int b3 = acVar.b();
        String b4 = acVar.a().b();
        switch (b3) {
            case 300:
            case 301:
            case 302:
            case 303:
                break;
            case 307:
            case 308:
                if (!b4.equals("GET") && !b4.equals("HEAD")) {
                    return null;
                }
                break;
            case 401:
                return this.f1871a.m().a(a3, acVar);
            case 407:
                if (a3 != null) {
                    d2 = a3.b();
                } else {
                    d2 = this.f1871a.d();
                }
                if (d2.type() != Proxy.Type.HTTP) {
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                return this.f1871a.n().a(a3, acVar);
            case 408:
                if (acVar.a().d() instanceof l) {
                    return null;
                }
                return acVar.a();
            default:
                return null;
        }
        if (!this.f1871a.q() || (a2 = acVar.a(Constants.KEY_LOCATION)) == null || (c2 = acVar.a().a().c(a2)) == null) {
            return null;
        }
        if (!c2.b().equals(acVar.a().a().b()) && !this.f1871a.p()) {
            return null;
        }
        aa.a e = acVar.a().e();
        if (f.c(b4)) {
            boolean d3 = f.d(b4);
            if (f.e(b4)) {
                e.a("GET", (ab) null);
            } else {
                e.a(b4, d3 ? acVar.a().d() : null);
            }
            if (!d3) {
                e.a("Transfer-Encoding");
                e.a("Content-Length");
                e.a(Constants.KEY_CONTENT_TYPE);
            }
        }
        if (!a(acVar, c2)) {
            e.a("Authorization");
        }
        return e.a(c2).a();
    }

    private boolean a(ac acVar, t tVar) {
        t a2 = acVar.a().a();
        return a2.f().equals(tVar.f()) && a2.g() == tVar.g() && a2.b().equals(tVar.b());
    }
}
