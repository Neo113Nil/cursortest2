package defpackage;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class w30 {
    public final e2 a;
    public final Proxy b;
    public final InetSocketAddress c;

    public w30(e2 e2Var, Proxy proxy, InetSocketAddress inetSocketAddress) {
        inetSocketAddress.getClass();
        this.a = e2Var;
        this.b = proxy;
        this.c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w30)) {
            return false;
        }
        w30 w30Var = (w30) obj;
        return w30Var.a.equals(this.a) && w30Var.b.equals(this.b) && kr.b(w30Var.c, this.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.c + '}';
    }
}
