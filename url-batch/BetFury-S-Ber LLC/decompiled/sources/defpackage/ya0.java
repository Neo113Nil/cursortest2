package defpackage;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ya0 {
    public final n2 a;
    public final Proxy b;
    public final InetSocketAddress c;

    public ya0(n2 n2Var, Proxy proxy, InetSocketAddress inetSocketAddress) {
        inetSocketAddress.getClass();
        this.a = n2Var;
        this.b = proxy;
        this.c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ya0)) {
            return false;
        }
        ya0 ya0Var = (ya0) obj;
        return ya0Var.a.equals(this.a) && ya0Var.b.equals(this.b) && mv.c(ya0Var.c, this.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.c + '}';
    }
}
