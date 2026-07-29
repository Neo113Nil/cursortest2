package org.apache.a.a.a;

import org.apache.a.i.d;

/* compiled from: AuthParams.java */
/* loaded from: classes2.dex */
public final class a {
    public static String a(d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        String str = (String) dVar.a("http.auth.credential-charset");
        return str == null ? "US-ASCII" : str;
    }
}
