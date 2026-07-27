package o3;

import m3.v;
import m3.w;

/* loaded from: classes.dex */
public final class a {
    public static final w a(w wVar) {
        if ((wVar != null ? wVar.f8479m : null) == null) {
            return wVar;
        }
        v b4 = wVar.b();
        b4.f8466g = null;
        return b4.a();
    }

    public static boolean b(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }
}
