package org.apache.a.a;

import java.io.Serializable;
import java.security.Principal;

/* compiled from: NTUserPrincipal.java */
/* loaded from: classes2.dex */
public class l implements Serializable, Principal {

    /* renamed from: a, reason: collision with root package name */
    private final String f9647a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9648b;

    /* renamed from: c, reason: collision with root package name */
    private final String f9649c;

    @Override // java.security.Principal
    public String getName() {
        return this.f9649c;
    }

    public String a() {
        return this.f9648b;
    }

    public String b() {
        return this.f9647a;
    }

    @Override // java.security.Principal
    public int hashCode() {
        return org.apache.a.k.f.a(org.apache.a.k.f.a(17, this.f9647a), this.f9648b);
    }

    @Override // java.security.Principal
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return org.apache.a.k.f.a(this.f9647a, lVar.f9647a) && org.apache.a.k.f.a(this.f9648b, lVar.f9648b);
    }

    @Override // java.security.Principal
    public String toString() {
        return this.f9649c;
    }
}
