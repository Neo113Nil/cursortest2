package org.apache.a.b.b;

import java.net.URI;

/* compiled from: HttpHead.java */
/* loaded from: classes2.dex */
public class e extends i {
    @Override // org.apache.a.b.b.i, org.apache.a.b.b.k
    public String getMethod() {
        return "HEAD";
    }

    public e() {
    }

    public e(URI uri) {
        setURI(uri);
    }

    public e(String str) {
        setURI(URI.create(str));
    }
}
