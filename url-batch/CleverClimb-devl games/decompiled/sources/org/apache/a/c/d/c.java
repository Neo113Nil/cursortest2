package org.apache.a.c.d;

import javax.net.ssl.SSLException;

/* compiled from: BrowserCompatHostnameVerifier.java */
/* loaded from: classes2.dex */
public class c extends a {
    public final String toString() {
        return "BROWSER_COMPATIBLE";
    }

    @Override // org.apache.a.c.d.h
    public final void a(String str, String[] strArr, String[] strArr2) throws SSLException {
        a(str, strArr, strArr2, false);
    }
}
