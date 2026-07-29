package org.apache.a.f.a;

/* compiled from: NegotiateSchemeFactory.java */
/* loaded from: classes2.dex */
public class l implements org.apache.a.a.b {

    /* renamed from: a, reason: collision with root package name */
    private final n f9757a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f9758b;

    public l(n nVar, boolean z) {
        this.f9757a = nVar;
        this.f9758b = z;
    }

    public l() {
        this(null, false);
    }

    @Override // org.apache.a.a.b
    public org.apache.a.a.a a(org.apache.a.i.d dVar) {
        return new k(this.f9757a, this.f9758b);
    }
}
