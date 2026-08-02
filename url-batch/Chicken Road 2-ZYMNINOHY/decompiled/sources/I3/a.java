package I3;

import G3.x;
import G3.y;

/* loaded from: classes.dex */
public final class a {
    public static final y a(y yVar) {
        if ((yVar == null ? null : yVar.f1039g) == null) {
            return yVar;
        }
        x b4 = yVar.b();
        b4.f1026g = null;
        return b4.a();
    }

    public static boolean b(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }
}
