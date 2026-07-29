package org.apache.a.f.d;

/* compiled from: BasicExpiresHandler.java */
/* loaded from: classes2.dex */
public class g extends a {

    /* renamed from: a, reason: collision with root package name */
    private final String[] f9867a;

    public g(String[] strArr) {
        if (strArr == null) {
            throw new IllegalArgumentException("Array of date patterns may not be null");
        }
        this.f9867a = strArr;
    }

    @Override // org.apache.a.d.c
    public void a(org.apache.a.d.l lVar, String str) throws org.apache.a.d.k {
        if (lVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        }
        if (str == null) {
            throw new org.apache.a.d.k("Missing value for expires attribute");
        }
        try {
            lVar.b(q.a(str, this.f9867a));
        } catch (p unused) {
            throw new org.apache.a.d.k("Unable to parse expires attribute: " + str);
        }
    }
}
