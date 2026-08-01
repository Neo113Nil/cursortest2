package q1;

import o1.r;
import o1.s;

/* loaded from: classes.dex */
public final class a {
    public static final s a(s sVar) {
        if ((sVar != null ? sVar.f3388g : null) == null) {
            return sVar;
        }
        r h = sVar.h();
        h.f3378g = null;
        return h.a();
    }

    public static boolean b(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }
}
