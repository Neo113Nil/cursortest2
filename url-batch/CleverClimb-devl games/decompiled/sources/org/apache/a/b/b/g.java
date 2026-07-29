package org.apache.a.b.b;

import java.net.URI;

/* compiled from: HttpPost.java */
/* loaded from: classes2.dex */
public class g extends c {
    @Override // org.apache.a.b.b.i, org.apache.a.b.b.k
    public String getMethod() {
        return "POST";
    }

    public g() {
    }

    public g(String str) {
        setURI(URI.create(str));
    }
}
