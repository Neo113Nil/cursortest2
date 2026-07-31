package I2;

import G2.t;
import G2.u;

/* loaded from: classes.dex */
public final class a {
    public static final u a(u uVar) {
        if ((uVar != null ? uVar.f2300j : null) == null) {
            return uVar;
        }
        t b3 = uVar.b();
        b3.f2287g = null;
        return b3.a();
    }

    public static boolean b(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }
}
