package org.apache.a.h;

import org.apache.a.w;

/* compiled from: BasicHeaderElement.java */
/* loaded from: classes2.dex */
public class c implements Cloneable, org.apache.a.e {

    /* renamed from: a, reason: collision with root package name */
    private final String f9936a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9937b;

    /* renamed from: c, reason: collision with root package name */
    private final w[] f9938c;

    public c(String str, String str2, w[] wVarArr) {
        if (str == null) {
            throw new IllegalArgumentException("Name may not be null");
        }
        this.f9936a = str;
        this.f9937b = str2;
        if (wVarArr != null) {
            this.f9938c = wVarArr;
        } else {
            this.f9938c = new w[0];
        }
    }

    @Override // org.apache.a.e
    public String a() {
        return this.f9936a;
    }

    @Override // org.apache.a.e
    public String b() {
        return this.f9937b;
    }

    @Override // org.apache.a.e
    public w[] c() {
        return (w[]) this.f9938c.clone();
    }

    @Override // org.apache.a.e
    public w a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Name may not be null");
        }
        for (int i = 0; i < this.f9938c.length; i++) {
            w wVar = this.f9938c[i];
            if (wVar.a().equalsIgnoreCase(str)) {
                return wVar;
            }
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof org.apache.a.e)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f9936a.equals(cVar.f9936a) && org.apache.a.k.f.a(this.f9937b, cVar.f9937b) && org.apache.a.k.f.a((Object[]) this.f9938c, (Object[]) cVar.f9938c);
    }

    public int hashCode() {
        int a2 = org.apache.a.k.f.a(org.apache.a.k.f.a(17, this.f9936a), this.f9937b);
        for (int i = 0; i < this.f9938c.length; i++) {
            a2 = org.apache.a.k.f.a(a2, this.f9938c[i]);
        }
        return a2;
    }

    public String toString() {
        org.apache.a.k.b bVar = new org.apache.a.k.b(64);
        bVar.a(this.f9936a);
        if (this.f9937b != null) {
            bVar.a("=");
            bVar.a(this.f9937b);
        }
        for (int i = 0; i < this.f9938c.length; i++) {
            bVar.a("; ");
            bVar.a(this.f9938c[i]);
        }
        return bVar.toString();
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
