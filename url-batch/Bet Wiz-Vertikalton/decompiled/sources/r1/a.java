package r1;

import p1.s;
import p1.t;

/* loaded from: classes.dex */
public final class a {
    public static final t a(t tVar) {
        if ((tVar != null ? tVar.f3434g : null) == null) {
            return tVar;
        }
        s h = tVar.h();
        h.f3424g = null;
        return h.a();
    }

    public static boolean b(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }
}
