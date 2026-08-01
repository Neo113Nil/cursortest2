package defpackage;

import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class n2 {
    public final sl a;
    public final SocketFactory b;
    public final SSLSocketFactory c;
    public final HostnameVerifier d;
    public final xa e;
    public final sl f;
    public final ProxySelector g;
    public final ou h;
    public final List i;
    public final List j;

    public n2(String str, int i, sl slVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, xa xaVar, sl slVar2, List list, List list2, ProxySelector proxySelector) {
        str.getClass();
        slVar.getClass();
        socketFactory.getClass();
        slVar2.getClass();
        list.getClass();
        list2.getClass();
        proxySelector.getClass();
        this.a = slVar;
        this.b = socketFactory;
        this.c = sSLSocketFactory;
        this.d = hostnameVerifier;
        this.e = xaVar;
        this.f = slVar2;
        this.g = proxySelector;
        nu nuVar = new nu(0);
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            nuVar.c = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                s9.k("unexpected scheme: ".concat(str2));
                throw null;
            }
            nuVar.c = "https";
        }
        String c0 = bi.c0(sl.n(str, 0, 0, 7));
        if (c0 == null) {
            s9.k("unexpected host: ".concat(str));
            throw null;
        }
        nuVar.f = c0;
        if (1 > i || i >= 65536) {
            s9.e(r7.b("unexpected port: ", i));
            throw null;
        }
        nuVar.b = i;
        this.h = nuVar.b();
        this.i = zk0.u(list);
        this.j = zk0.u(list2);
    }

    public final boolean a(n2 n2Var) {
        n2Var.getClass();
        return mv.c(this.a, n2Var.a) && mv.c(this.f, n2Var.f) && mv.c(this.i, n2Var.i) && mv.c(this.j, n2Var.j) && mv.c(this.g, n2Var.g) && mv.c(this.c, n2Var.c) && mv.c(this.d, n2Var.d) && mv.c(this.e, n2Var.e) && this.h.e == n2Var.h.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n2)) {
            return false;
        }
        n2 n2Var = (n2) obj;
        return mv.c(this.h, n2Var.h) && a(n2Var);
    }

    public final int hashCode() {
        return Objects.hashCode(this.e) + ((Objects.hashCode(this.d) + ((Objects.hashCode(this.c) + ((this.g.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.f.hashCode() + ((this.a.hashCode() + ((this.h.h.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        ou ouVar = this.h;
        sb.append(ouVar.d);
        sb.append(':');
        sb.append(ouVar.e);
        sb.append(", ");
        sb.append("proxySelector=" + this.g);
        sb.append('}');
        return sb.toString();
    }
}
