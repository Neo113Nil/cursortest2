package org.apache.a.b.b;

import java.net.URI;

/* compiled from: HttpPut.java */
/* loaded from: classes2.dex */
public class h extends c {
    @Override // org.apache.a.b.b.i, org.apache.a.b.b.k
    public String getMethod() {
        return "PUT";
    }

    public h() {
    }

    public h(String str) {
        setURI(URI.create(str));
    }
}
