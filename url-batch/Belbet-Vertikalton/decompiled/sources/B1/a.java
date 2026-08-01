package B1;

import z1.u;
import z1.v;

/* loaded from: classes.dex */
public final class a {
    public static final v a(v vVar) {
        if ((vVar != null ? vVar.f4949g : null) == null) {
            return vVar;
        }
        u d2 = vVar.d();
        d2.f4939g = null;
        return d2.a();
    }

    public static boolean b(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }
}
