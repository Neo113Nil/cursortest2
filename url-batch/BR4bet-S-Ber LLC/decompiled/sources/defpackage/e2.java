package defpackage;

import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class e2 {
    public final ej a;
    public final SocketFactory b;
    public final SSLSocketFactory c;
    public final HostnameVerifier d;
    public final ea e;
    public final ej f;
    public final ProxySelector g;
    public final uq h;
    public final List i;
    public final List j;

    public e2(String str, int i, ej ejVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, vy vyVar, ea eaVar, ej ejVar2, List list, List list2, ProxySelector proxySelector) {
        str.getClass();
        ejVar.getClass();
        socketFactory.getClass();
        ejVar2.getClass();
        list.getClass();
        list2.getClass();
        proxySelector.getClass();
        this.a = ejVar;
        this.b = socketFactory;
        this.c = sSLSocketFactory;
        this.d = vyVar;
        this.e = eaVar;
        this.f = ejVar2;
        this.g = proxySelector;
        tq tqVar = new tq(0);
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            tqVar.c = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                g9.i("unexpected scheme: ".concat(str2));
                throw null;
            }
            tqVar.c = "https";
        }
        String e0 = la0.e0(ej.n(str, 0, 0, 7));
        if (e0 == null) {
            g9.i("unexpected host: ".concat(str));
            throw null;
        }
        tqVar.f = e0;
        if (1 > i || i >= 65536) {
            g9.d(f60.e("unexpected port: ", i));
            throw null;
        }
        tqVar.b = i;
        this.h = tqVar.b();
        this.i = cb0.u(list);
        this.j = cb0.u(list2);
    }

    public final boolean a(e2 e2Var) {
        e2Var.getClass();
        return kr.b(this.a, e2Var.a) && kr.b(this.f, e2Var.f) && kr.b(this.i, e2Var.i) && kr.b(this.j, e2Var.j) && kr.b(this.g, e2Var.g) && kr.b(this.c, e2Var.c) && kr.b(this.d, e2Var.d) && kr.b(this.e, e2Var.e) && this.h.e == e2Var.h.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e2)) {
            return false;
        }
        e2 e2Var = (e2) obj;
        return kr.b(this.h, e2Var.h) && a(e2Var);
    }

    public final int hashCode() {
        return Objects.hashCode(this.e) + ((Objects.hashCode(this.d) + ((Objects.hashCode(this.c) + ((this.g.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.f.hashCode() + ((this.a.hashCode() + ((this.h.h.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        uq uqVar = this.h;
        sb.append(uqVar.d);
        sb.append(':');
        sb.append(uqVar.e);
        sb.append(", ");
        sb.append("proxySelector=" + this.g);
        sb.append('}');
        return sb.toString();
    }
}
