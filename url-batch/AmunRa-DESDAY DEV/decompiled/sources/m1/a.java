package m1;

import k1.t;
import k1.u;

/* loaded from: classes.dex */
public final class a {
    public static final u a(u uVar) {
        if ((uVar != null ? uVar.f2902g : null) == null) {
            return uVar;
        }
        t h = uVar.h();
        h.f2892g = null;
        return h.a();
    }

    public static boolean b(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }
}
