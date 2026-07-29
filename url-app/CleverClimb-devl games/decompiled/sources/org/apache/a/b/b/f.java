package org.apache.a.b.b;

import java.net.URI;

/* compiled from: HttpOptions.java */
/* loaded from: classes2.dex */
public class f extends i {
    @Override // org.apache.a.b.b.i, org.apache.a.b.b.k
    public String getMethod() {
        return "OPTIONS";
    }

    public f() {
    }

    public f(String str) {
        setURI(URI.create(str));
    }
}
