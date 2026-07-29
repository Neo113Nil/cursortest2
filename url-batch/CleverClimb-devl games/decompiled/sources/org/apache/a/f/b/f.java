package org.apache.a.f.b;

/* compiled from: ClientParamsStack.java */
/* loaded from: classes2.dex */
public class f extends org.apache.a.i.a {

    /* renamed from: a, reason: collision with root package name */
    protected final org.apache.a.i.d f9769a;

    /* renamed from: b, reason: collision with root package name */
    protected final org.apache.a.i.d f9770b;

    /* renamed from: c, reason: collision with root package name */
    protected final org.apache.a.i.d f9771c;

    /* renamed from: d, reason: collision with root package name */
    protected final org.apache.a.i.d f9772d;

    public f(org.apache.a.i.d dVar, org.apache.a.i.d dVar2, org.apache.a.i.d dVar3, org.apache.a.i.d dVar4) {
        this.f9769a = dVar;
        this.f9770b = dVar2;
        this.f9771c = dVar3;
        this.f9772d = dVar4;
    }

    @Override // org.apache.a.i.d
    public Object a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Parameter name must not be null.");
        }
        Object a2 = this.f9772d != null ? this.f9772d.a(str) : null;
        if (a2 == null && this.f9771c != null) {
            a2 = this.f9771c.a(str);
        }
        if (a2 == null && this.f9770b != null) {
            a2 = this.f9770b.a(str);
        }
        return (a2 != null || this.f9769a == null) ? a2 : this.f9769a.a(str);
    }

    @Override // org.apache.a.i.d
    public org.apache.a.i.d a(String str, Object obj) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Setting parameters in a stack is not supported.");
    }
}
