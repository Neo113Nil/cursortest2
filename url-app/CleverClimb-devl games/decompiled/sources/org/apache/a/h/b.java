package org.apache.a.h;

import java.io.Serializable;
import org.apache.a.y;

/* compiled from: BasicHeader.java */
/* loaded from: classes2.dex */
public class b implements Serializable, Cloneable, org.apache.a.d {

    /* renamed from: a, reason: collision with root package name */
    private final String f9934a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9935b;

    public b(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Name may not be null");
        }
        this.f9934a = str;
        this.f9935b = str2;
    }

    @Override // org.apache.a.d
    public String c() {
        return this.f9934a;
    }

    @Override // org.apache.a.d
    public String d() {
        return this.f9935b;
    }

    public String toString() {
        return i.f9953a.a((org.apache.a.k.b) null, this).toString();
    }

    @Override // org.apache.a.d
    public org.apache.a.e[] e() throws y {
        if (this.f9935b != null) {
            return f.a(this.f9935b, (r) null);
        }
        return new org.apache.a.e[0];
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
