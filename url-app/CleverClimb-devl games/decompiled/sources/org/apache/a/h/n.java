package org.apache.a.h;

import java.io.Serializable;
import org.apache.a.aa;
import org.apache.a.ad;

/* compiled from: BasicStatusLine.java */
/* loaded from: classes2.dex */
public class n implements Serializable, Cloneable, ad {

    /* renamed from: a, reason: collision with root package name */
    private final aa f9965a;

    /* renamed from: b, reason: collision with root package name */
    private final int f9966b;

    /* renamed from: c, reason: collision with root package name */
    private final String f9967c;

    public n(aa aaVar, int i, String str) {
        if (aaVar == null) {
            throw new IllegalArgumentException("Protocol version may not be null.");
        }
        if (i < 0) {
            throw new IllegalArgumentException("Status code may not be negative.");
        }
        this.f9965a = aaVar;
        this.f9966b = i;
        this.f9967c = str;
    }

    @Override // org.apache.a.ad
    public int b() {
        return this.f9966b;
    }

    @Override // org.apache.a.ad
    public aa a() {
        return this.f9965a;
    }

    @Override // org.apache.a.ad
    public String c() {
        return this.f9967c;
    }

    public String toString() {
        return i.f9953a.a((org.apache.a.k.b) null, this).toString();
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
