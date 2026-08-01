package defpackage;

import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class o2 {
    public final vg a;
    public final SocketFactory b;
    public final SSLSocketFactory c;
    public final HostnameVerifier d;
    public final n9 e;
    public final vg f;
    public final ProxySelector g;
    public final yo h;
    public final List i;
    public final List j;

    public o2(String str, int i, vg vgVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, zv zvVar, n9 n9Var, vg vgVar2, List list, List list2, ProxySelector proxySelector) {
        str.getClass();
        vgVar.getClass();
        socketFactory.getClass();
        vgVar2.getClass();
        list.getClass();
        list2.getClass();
        proxySelector.getClass();
        this.a = vgVar;
        this.b = socketFactory;
        this.c = sSLSocketFactory;
        this.d = zvVar;
        this.e = n9Var;
        this.f = vgVar2;
        this.g = proxySelector;
        xo xoVar = new xo(0);
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            xoVar.c = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                o8.j("unexpected scheme: ".concat(str2));
                throw null;
            }
            xoVar.c = "https";
        }
        String U = op.U(vg.p(str, 0, 0, 7));
        if (U == null) {
            o8.j("unexpected host: ".concat(str));
            throw null;
        }
        xoVar.f = U;
        if (1 > i || i >= 65536) {
            o8.e(o30.e("unexpected port: ", i));
            throw null;
        }
        xoVar.b = i;
        this.h = xoVar.b();
        this.i = y70.u(list);
        this.j = y70.u(list2);
    }

    public final boolean a(o2 o2Var) {
        o2Var.getClass();
        return op.d(this.a, o2Var.a) && op.d(this.f, o2Var.f) && op.d(this.i, o2Var.i) && op.d(this.j, o2Var.j) && op.d(this.g, o2Var.g) && op.d(this.c, o2Var.c) && op.d(this.d, o2Var.d) && op.d(this.e, o2Var.e) && this.h.e == o2Var.h.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o2)) {
            return false;
        }
        o2 o2Var = (o2) obj;
        return op.d(this.h, o2Var.h) && a(o2Var);
    }

    public final int hashCode() {
        return Objects.hashCode(this.e) + ((Objects.hashCode(this.d) + ((Objects.hashCode(this.c) + ((this.g.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.f.hashCode() + ((this.a.hashCode() + ((this.h.h.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        yo yoVar = this.h;
        sb.append(yoVar.d);
        sb.append(':');
        sb.append(yoVar.e);
        sb.append(", ");
        sb.append("proxySelector=" + this.g);
        sb.append('}');
        return sb.toString();
    }
}
