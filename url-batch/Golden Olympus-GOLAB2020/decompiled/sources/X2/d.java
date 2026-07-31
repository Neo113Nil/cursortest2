package X2;

import java.math.BigInteger;

/* loaded from: classes3.dex */
class d implements f {

    /* renamed from: a, reason: collision with root package name */
    protected final a f9721a;

    /* renamed from: b, reason: collision with root package name */
    protected final e f9722b;

    d(a aVar, e eVar) {
        this.f9721a = aVar;
        this.f9722b = eVar;
    }

    @Override // X2.f
    public e a() {
        return this.f9722b;
    }

    @Override // X2.a
    public int b() {
        return this.f9721a.b() * this.f9722b.b();
    }

    @Override // X2.a
    public BigInteger c() {
        return this.f9721a.c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f9721a.equals(dVar.f9721a) && this.f9722b.equals(dVar.f9722b);
    }

    public int hashCode() {
        return this.f9721a.hashCode() ^ Z2.c.a(this.f9722b.hashCode(), 16);
    }
}
