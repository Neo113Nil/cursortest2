package C2;

import A2.x;
import A2.y;

/* loaded from: classes.dex */
public final class a {
    public static final y a(y yVar) {
        if ((yVar != null ? yVar.f217j : null) == null) {
            return yVar;
        }
        x b2 = yVar.b();
        b2.f204g = null;
        return b2.a();
    }

    public static boolean b(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }
}
