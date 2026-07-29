package org.apache.a.b.b;

import java.net.URI;

/* compiled from: HttpTrace.java */
/* loaded from: classes2.dex */
public class j extends i {
    @Override // org.apache.a.b.b.i, org.apache.a.b.b.k
    public String getMethod() {
        return "TRACE";
    }

    public j() {
    }

    public j(String str) {
        setURI(URI.create(str));
    }
}
