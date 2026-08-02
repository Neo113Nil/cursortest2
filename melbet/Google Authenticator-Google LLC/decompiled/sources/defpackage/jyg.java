package defpackage;

import j$.util.Objects;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jyg extends kbc {
    private static final long serialVersionUID = 0;
    public final InetSocketAddress a;
    private final SocketAddress b;
    private final Map c;
    private final String d;
    private final String e;

    public jyg(SocketAddress socketAddress, InetSocketAddress inetSocketAddress, Map map, String str, String str2) {
        hoq.K(!((InetSocketAddress) socketAddress).isUnresolved(), "The proxy address %s is not resolved", socketAddress);
        this.b = socketAddress;
        this.a = inetSocketAddress;
        this.c = map;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jyg)) {
            return false;
        }
        jyg jygVar = (jyg) obj;
        return Objects.equals(this.b, jygVar.b) && Objects.equals(this.a, jygVar.a) && Objects.equals(this.c, jygVar.c) && Objects.equals(this.d, jygVar.d) && Objects.equals(this.e, jygVar.e);
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.a, this.d, this.e, this.c);
    }

    public final String toString() {
        gzo T = hoq.T(this);
        T.b("proxyAddr", this.b);
        T.b("targetAddr", this.a);
        T.b("headers", this.c);
        T.b("username", this.d);
        T.g("hasPassword", this.e != null);
        return T.toString();
    }
}
