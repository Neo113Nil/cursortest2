package defpackage;

import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class y1 {
    public final dh a;
    public final SocketFactory b;
    public final SSLSocketFactory c;
    public final HostnameVerifier d;
    public final r9 e;
    public final dh f;
    public final ProxySelector g;
    public final jo h;
    public final List i;
    public final List j;

    public y1(String str, int i, dh dhVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, r9 r9Var, dh dhVar2, List list, List list2, ProxySelector proxySelector) {
        str.getClass();
        dhVar.getClass();
        socketFactory.getClass();
        dhVar2.getClass();
        list.getClass();
        list2.getClass();
        proxySelector.getClass();
        this.a = dhVar;
        this.b = socketFactory;
        this.c = sSLSocketFactory;
        this.d = hostnameVerifier;
        this.e = r9Var;
        this.f = dhVar2;
        this.g = proxySelector;
        io ioVar = new io(0);
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            ioVar.c = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                t8.k("unexpected scheme: ".concat(str2));
                throw null;
            }
            ioVar.c = "https";
        }
        String S = e70.S(dh.p(str, 0, 0, 7));
        if (S == null) {
            t8.k("unexpected host: ".concat(str));
            throw null;
        }
        ioVar.f = S;
        if (1 > i || i >= 65536) {
            t8.e(d30.e("unexpected port: ", i));
            throw null;
        }
        ioVar.b = i;
        this.h = ioVar.b();
        this.i = r70.u(list);
        this.j = r70.u(list2);
    }

    public final boolean a(y1 y1Var) {
        y1Var.getClass();
        return zo.b(this.a, y1Var.a) && zo.b(this.f, y1Var.f) && zo.b(this.i, y1Var.i) && zo.b(this.j, y1Var.j) && zo.b(this.g, y1Var.g) && zo.b(this.c, y1Var.c) && zo.b(this.d, y1Var.d) && zo.b(this.e, y1Var.e) && this.h.e == y1Var.h.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj;
        return zo.b(this.h, y1Var.h) && a(y1Var);
    }

    public final int hashCode() {
        return Objects.hashCode(this.e) + ((Objects.hashCode(this.d) + ((Objects.hashCode(this.c) + ((this.g.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.f.hashCode() + ((this.a.hashCode() + ((this.h.h.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        jo joVar = this.h;
        sb.append(joVar.d);
        sb.append(':');
        sb.append(joVar.e);
        sb.append(", ");
        sb.append("proxySelector=" + this.g);
        sb.append('}');
        return sb.toString();
    }
}
