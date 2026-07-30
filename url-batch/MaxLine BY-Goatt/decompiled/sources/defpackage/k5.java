package defpackage;

import com.facebook.gamingservices.internal.TournamentShareDialogURIBuilder;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class k5 {
    public final qb2 a;
    public final SocketFactory b;
    public final SSLSocketFactory c;
    public final HostnameVerifier d;
    public final dt e;
    public final qb2 f;
    public final ProxySelector g;
    public final kz0 h;
    public final List i;
    public final List j;

    public k5(String str, int i, qb2 qb2Var, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, dt dtVar, qb2 qb2Var2, List list, List list2, ProxySelector proxySelector) {
        str.getClass();
        qb2Var.getClass();
        socketFactory.getClass();
        qb2Var2.getClass();
        list.getClass();
        list2.getClass();
        proxySelector.getClass();
        this.a = qb2Var;
        this.b = socketFactory;
        this.c = sSLSocketFactory;
        this.d = hostnameVerifier;
        this.e = dtVar;
        this.f = qb2Var2;
        this.g = proxySelector;
        jz0 jz0Var = new jz0();
        String str2 = sSLSocketFactory != null ? TournamentShareDialogURIBuilder.scheme : "http";
        if (str2.equalsIgnoreCase("http")) {
            jz0Var.a = "http";
        } else {
            if (!str2.equalsIgnoreCase(TournamentShareDialogURIBuilder.scheme)) {
                lh.e("unexpected scheme: ".concat(str2));
                throw null;
            }
            jz0Var.a = TournamentShareDialogURIBuilder.scheme;
        }
        String h0 = tk3.h0(u30.q(str, 0, 0, 7));
        if (h0 == null) {
            lh.e("unexpected host: ".concat(str));
            throw null;
        }
        jz0Var.d = h0;
        if (1 > i || i >= 65536) {
            lh.c(in1.k(i, "unexpected port: "));
            throw null;
        }
        jz0Var.e = i;
        this.h = jz0Var.a();
        this.i = n33.t(list);
        this.j = n33.t(list2);
    }

    public final boolean a(k5 k5Var) {
        k5Var.getClass();
        return Intrinsics.b(this.a, k5Var.a) && Intrinsics.b(this.f, k5Var.f) && Intrinsics.b(this.i, k5Var.i) && Intrinsics.b(this.j, k5Var.j) && Intrinsics.b(this.g, k5Var.g) && Intrinsics.b(this.c, k5Var.c) && Intrinsics.b(this.d, k5Var.d) && Intrinsics.b(this.e, k5Var.e) && this.h.e == k5Var.h.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k5)) {
            return false;
        }
        k5 k5Var = (k5) obj;
        return Intrinsics.b(this.h, k5Var.h) && a(k5Var);
    }

    public final int hashCode() {
        return Objects.hashCode(this.e) + ((Objects.hashCode(this.d) + ((Objects.hashCode(this.c) + ((this.g.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.f.hashCode() + ((this.a.hashCode() + in1.j(this.h.h, 527, 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        kz0 kz0Var = this.h;
        sb.append(kz0Var.d);
        sb.append(':');
        sb.append(kz0Var.e);
        sb.append(", ");
        sb.append("proxySelector=" + this.g);
        sb.append('}');
        return sb.toString();
    }
}
