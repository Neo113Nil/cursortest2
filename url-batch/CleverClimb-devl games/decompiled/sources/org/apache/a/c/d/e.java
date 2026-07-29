package org.apache.a.c.d;

import javax.net.ssl.SSLException;

/* compiled from: StrictHostnameVerifier.java */
/* loaded from: classes2.dex */
public class e extends a {
    public final String toString() {
        return "STRICT";
    }

    @Override // org.apache.a.c.d.h
    public final void a(String str, String[] strArr, String[] strArr2) throws SSLException {
        a(str, strArr, strArr2, true);
    }
}
