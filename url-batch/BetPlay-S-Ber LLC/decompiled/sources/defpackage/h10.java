package defpackage;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class h10 {
    public final o2 a;
    public final Proxy b;
    public final InetSocketAddress c;

    public h10(o2 o2Var, Proxy proxy, InetSocketAddress inetSocketAddress) {
        inetSocketAddress.getClass();
        this.a = o2Var;
        this.b = proxy;
        this.c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h10)) {
            return false;
        }
        h10 h10Var = (h10) obj;
        return h10Var.a.equals(this.a) && h10Var.b.equals(this.b) && op.d(h10Var.c, this.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.c + '}';
    }
}
