package B1;

import z1.r;
import z1.s;

/* loaded from: classes.dex */
public final class a {
    public static final s a(s sVar) {
        if ((sVar != null ? sVar.f4764g : null) == null) {
            return sVar;
        }
        r d = sVar.d();
        d.f4754g = null;
        return d.a();
    }

    public static boolean b(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }
}
