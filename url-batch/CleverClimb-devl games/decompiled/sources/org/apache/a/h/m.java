package org.apache.a.h;

import java.io.Serializable;
import org.apache.a.aa;
import org.apache.a.ac;

/* compiled from: BasicRequestLine.java */
/* loaded from: classes2.dex */
public class m implements Serializable, Cloneable, ac {

    /* renamed from: a, reason: collision with root package name */
    private final aa f9962a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9963b;

    /* renamed from: c, reason: collision with root package name */
    private final String f9964c;

    public m(String str, String str2, aa aaVar) {
        if (str == null) {
            throw new IllegalArgumentException("Method must not be null.");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("URI must not be null.");
        }
        if (aaVar == null) {
            throw new IllegalArgumentException("Protocol version must not be null.");
        }
        this.f9963b = str;
        this.f9964c = str2;
        this.f9962a = aaVar;
    }

    @Override // org.apache.a.ac
    public String a() {
        return this.f9963b;
    }

    @Override // org.apache.a.ac
    public aa b() {
        return this.f9962a;
    }

    @Override // org.apache.a.ac
    public String c() {
        return this.f9964c;
    }

    public String toString() {
        return i.f9953a.a((org.apache.a.k.b) null, this).toString();
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
