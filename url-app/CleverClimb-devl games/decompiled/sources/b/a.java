package b;

import b.t;
import com.mopub.common.Constants;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: Address.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    final t f1803a;

    /* renamed from: b, reason: collision with root package name */
    final o f1804b;

    /* renamed from: c, reason: collision with root package name */
    final SocketFactory f1805c;

    /* renamed from: d, reason: collision with root package name */
    final b f1806d;
    final List<y> e;
    final List<k> f;
    final ProxySelector g;
    final Proxy h;
    final SSLSocketFactory i;
    final HostnameVerifier j;
    final g k;

    public a(String str, int i, o oVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, g gVar, b bVar, Proxy proxy, List<y> list, List<k> list2, ProxySelector proxySelector) {
        this.f1803a = new t.a().a(sSLSocketFactory != null ? Constants.HTTPS : Constants.HTTP).d(str).a(i).c();
        if (oVar == null) {
            throw new NullPointerException("dns == null");
        }
        this.f1804b = oVar;
        if (socketFactory == null) {
            throw new NullPointerException("socketFactory == null");
        }
        this.f1805c = socketFactory;
        if (bVar == null) {
            throw new NullPointerException("proxyAuthenticator == null");
        }
        this.f1806d = bVar;
        if (list == null) {
            throw new NullPointerException("protocols == null");
        }
        this.e = b.a.c.a(list);
        if (list2 == null) {
            throw new NullPointerException("connectionSpecs == null");
        }
        this.f = b.a.c.a(list2);
        if (proxySelector == null) {
            throw new NullPointerException("proxySelector == null");
        }
        this.g = proxySelector;
        this.h = proxy;
        this.i = sSLSocketFactory;
        this.j = hostnameVerifier;
        this.k = gVar;
    }

    public t a() {
        return this.f1803a;
    }

    public o b() {
        return this.f1804b;
    }

    public SocketFactory c() {
        return this.f1805c;
    }

    public b d() {
        return this.f1806d;
    }

    public List<y> e() {
        return this.e;
    }

    public List<k> f() {
        return this.f;
    }

    public ProxySelector g() {
        return this.g;
    }

    public Proxy h() {
        return this.h;
    }

    public SSLSocketFactory i() {
        return this.i;
    }

    public HostnameVerifier j() {
        return this.j;
    }

    public g k() {
        return this.k;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f1803a.equals(aVar.f1803a) && a(aVar)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f1803a.hashCode()) * 31) + this.f1804b.hashCode()) * 31) + this.f1806d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + (this.h != null ? this.h.hashCode() : 0)) * 31) + (this.i != null ? this.i.hashCode() : 0)) * 31) + (this.j != null ? this.j.hashCode() : 0)) * 31) + (this.k != null ? this.k.hashCode() : 0);
    }

    boolean a(a aVar) {
        return this.f1804b.equals(aVar.f1804b) && this.f1806d.equals(aVar.f1806d) && this.e.equals(aVar.e) && this.f.equals(aVar.f) && this.g.equals(aVar.g) && b.a.c.a(this.h, aVar.h) && b.a.c.a(this.i, aVar.i) && b.a.c.a(this.j, aVar.j) && b.a.c.a(this.k, aVar.k) && a().g() == aVar.a().g();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Address{");
        sb.append(this.f1803a.f());
        sb.append(":");
        sb.append(this.f1803a.g());
        if (this.h != null) {
            sb.append(", proxy=");
            sb.append(this.h);
        } else {
            sb.append(", proxySelector=");
            sb.append(this.g);
        }
        sb.append("}");
        return sb.toString();
    }
}
