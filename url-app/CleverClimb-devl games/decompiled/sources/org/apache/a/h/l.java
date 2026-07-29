package org.apache.a.h;

import java.io.Serializable;
import org.apache.a.w;

/* compiled from: BasicNameValuePair.java */
/* loaded from: classes2.dex */
public class l implements Serializable, Cloneable, w {

    /* renamed from: a, reason: collision with root package name */
    private final String f9960a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9961b;

    public l(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Name may not be null");
        }
        this.f9960a = str;
        this.f9961b = str2;
    }

    @Override // org.apache.a.w
    public String a() {
        return this.f9960a;
    }

    @Override // org.apache.a.w
    public String b() {
        return this.f9961b;
    }

    public String toString() {
        if (this.f9961b == null) {
            return this.f9960a;
        }
        org.apache.a.k.b bVar = new org.apache.a.k.b(this.f9960a.length() + 1 + this.f9961b.length());
        bVar.a(this.f9960a);
        bVar.a("=");
        bVar.a(this.f9961b);
        return bVar.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f9960a.equals(lVar.f9960a) && org.apache.a.k.f.a(this.f9961b, lVar.f9961b);
    }

    public int hashCode() {
        return org.apache.a.k.f.a(org.apache.a.k.f.a(17, this.f9960a), this.f9961b);
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
