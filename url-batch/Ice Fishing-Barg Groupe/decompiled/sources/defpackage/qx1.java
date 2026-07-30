package defpackage;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class qx1 {
    public final o PxuCJdSBwIXG;
    public final InetSocketAddress TSizfFm2Yiuu;
    public final Proxy lS5Rgt96tfkO;

    public qx1(o oVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        inetSocketAddress.getClass();
        this.PxuCJdSBwIXG = oVar;
        this.lS5Rgt96tfkO = proxy;
        this.TSizfFm2Yiuu = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qx1)) {
            return false;
        }
        qx1 qx1Var = (qx1) obj;
        return qx1Var.PxuCJdSBwIXG.equals(this.PxuCJdSBwIXG) && qx1Var.lS5Rgt96tfkO.equals(this.lS5Rgt96tfkO) && cs0.wdg6QnbFHrFF(qx1Var.TSizfFm2Yiuu, this.TSizfFm2Yiuu);
    }

    public final int hashCode() {
        return this.TSizfFm2Yiuu.hashCode() + ((this.lS5Rgt96tfkO.hashCode() + ((this.PxuCJdSBwIXG.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        String hostAddress;
        StringBuilder sb = new StringBuilder();
        gm0 gm0Var = this.PxuCJdSBwIXG.rtx2ld2ELZv4;
        String str = gm0Var.Y1f8riQaR6yg;
        InetSocketAddress inetSocketAddress = this.TSizfFm2Yiuu;
        InetAddress address = inetSocketAddress.getAddress();
        String lS5Rgt96tfkO = (address == null || (hostAddress = address.getHostAddress()) == null) ? null : iv2.lS5Rgt96tfkO(hostAddress);
        if (ia2.D0aTLcX6Uhyo(str, ':')) {
            sb.append("[");
            sb.append(str);
            sb.append("]");
        } else {
            sb.append(str);
        }
        if (gm0Var.e9gEMXR7LXtO != inetSocketAddress.getPort() || str.equals(lS5Rgt96tfkO)) {
            sb.append(":");
            sb.append(gm0Var.e9gEMXR7LXtO);
        }
        if (!str.equals(lS5Rgt96tfkO)) {
            if (this.lS5Rgt96tfkO.equals(Proxy.NO_PROXY)) {
                sb.append(" at ");
            } else {
                sb.append(" via proxy ");
            }
            if (lS5Rgt96tfkO == null) {
                sb.append("<unresolved>");
            } else if (ia2.D0aTLcX6Uhyo(lS5Rgt96tfkO, ':')) {
                sb.append("[");
                sb.append(lS5Rgt96tfkO);
                sb.append("]");
            } else {
                sb.append(lS5Rgt96tfkO);
            }
            sb.append(":");
            sb.append(inetSocketAddress.getPort());
        }
        return sb.toString();
    }
}
