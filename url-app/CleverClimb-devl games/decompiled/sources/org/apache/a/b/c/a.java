package org.apache.a.b.c;

import org.apache.a.i.d;

/* compiled from: HttpClientParams.java */
/* loaded from: classes2.dex */
public class a {
    public static boolean a(d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        return dVar.a("http.protocol.handle-redirects", true);
    }

    public static boolean b(d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        return dVar.a("http.protocol.handle-authentication", true);
    }

    public static String c(d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        String str = (String) dVar.a("http.protocol.cookie-policy");
        return str == null ? "best-match" : str;
    }
}
