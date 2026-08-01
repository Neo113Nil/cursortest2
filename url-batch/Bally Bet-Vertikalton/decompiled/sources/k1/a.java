package k1;

import i1.s;
import i1.t;

/* loaded from: classes.dex */
public final class a {
    public static final t a(t tVar) {
        if ((tVar != null ? tVar.f2511g : null) == null) {
            return tVar;
        }
        s f2 = tVar.f();
        f2.f2501g = null;
        return f2.a();
    }

    public static boolean b(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }
}
