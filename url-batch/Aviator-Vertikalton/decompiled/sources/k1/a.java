package k1;

import i1.x;
import i1.y;

/* loaded from: classes.dex */
public final class a {
    public static final y a(y yVar) {
        if ((yVar != null ? yVar.f2798g : null) == null) {
            return yVar;
        }
        x h = yVar.h();
        h.f2787g = null;
        return h.a();
    }

    public static boolean b(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }
}
