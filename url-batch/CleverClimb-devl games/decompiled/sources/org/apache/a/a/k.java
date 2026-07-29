package org.apache.a.a;

import java.io.Serializable;
import java.security.Principal;

/* compiled from: NTCredentials.java */
/* loaded from: classes2.dex */
public class k implements Serializable, h {

    /* renamed from: a, reason: collision with root package name */
    private final l f9644a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9645b;

    /* renamed from: c, reason: collision with root package name */
    private final String f9646c;

    @Override // org.apache.a.a.h
    public Principal a() {
        return this.f9644a;
    }

    public String c() {
        return this.f9644a.b();
    }

    @Override // org.apache.a.a.h
    public String b() {
        return this.f9645b;
    }

    public String d() {
        return this.f9644a.a();
    }

    public String e() {
        return this.f9646c;
    }

    public int hashCode() {
        return org.apache.a.k.f.a(org.apache.a.k.f.a(17, this.f9644a), this.f9646c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return org.apache.a.k.f.a(this.f9644a, kVar.f9644a) && org.apache.a.k.f.a(this.f9646c, kVar.f9646c);
    }

    public String toString() {
        return "[principal: " + this.f9644a + "][workstation: " + this.f9646c + "]";
    }
}
