package org.apache.a.b.b;

import java.net.URI;

/* compiled from: HttpGet.java */
/* loaded from: classes2.dex */
public class d extends i {
    @Override // org.apache.a.b.b.i, org.apache.a.b.b.k
    public String getMethod() {
        return "GET";
    }

    public d() {
    }

    public d(URI uri) {
        setURI(uri);
    }

    public d(String str) {
        setURI(URI.create(str));
    }
}
