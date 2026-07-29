package org.apache.a.i;

import org.apache.a.aa;
import org.apache.a.u;

/* compiled from: HttpProtocolParams.java */
/* loaded from: classes2.dex */
public final class e {
    public static String a(d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        String str = (String) dVar.a("http.protocol.element-charset");
        return str == null ? "US-ASCII" : str;
    }

    public static void a(d dVar, String str) {
        if (dVar == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        dVar.a("http.protocol.content-charset", str);
    }

    public static aa b(d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        Object a2 = dVar.a("http.protocol.version");
        if (a2 == null) {
            return u.f10004c;
        }
        return (aa) a2;
    }

    public static void a(d dVar, aa aaVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        dVar.a("http.protocol.version", aaVar);
    }

    public static String c(d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        return (String) dVar.a("http.useragent");
    }

    public static void b(d dVar, String str) {
        if (dVar == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        dVar.a("http.useragent", str);
    }

    public static boolean d(d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        return dVar.a("http.protocol.expect-continue", false);
    }

    public static void a(d dVar, boolean z) {
        if (dVar == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        dVar.b("http.protocol.expect-continue", z);
    }
}
