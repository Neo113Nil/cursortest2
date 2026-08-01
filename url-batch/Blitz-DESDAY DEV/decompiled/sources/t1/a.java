package t1;

import r1.q;
import r1.r;

/* loaded from: classes.dex */
public final class a {
    public static final r a(r rVar) {
        if ((rVar != null ? rVar.f3550g : null) == null) {
            return rVar;
        }
        q h = rVar.h();
        h.f3540g = null;
        return h.a();
    }

    public static boolean b(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }
}
