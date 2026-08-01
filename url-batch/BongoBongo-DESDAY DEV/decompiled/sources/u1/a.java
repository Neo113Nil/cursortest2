package u1;

import s1.q;
import s1.r;

/* loaded from: classes.dex */
public final class a {
    public static final r a(r rVar) {
        if ((rVar != null ? rVar.f3707g : null) == null) {
            return rVar;
        }
        q h2 = rVar.h();
        h2.f3696g = null;
        return h2.a();
    }

    public static boolean b(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }
}
