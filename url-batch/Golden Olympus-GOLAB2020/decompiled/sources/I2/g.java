package I2;

import a3.AbstractC1247d;

/* loaded from: classes3.dex */
public abstract class g extends j implements b {

    /* renamed from: b, reason: collision with root package name */
    byte[] f784b;

    public g(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("string cannot be null");
        }
        this.f784b = bArr;
    }

    @Override // I2.j
    boolean d(j jVar) {
        if (jVar instanceof g) {
            return Z2.a.a(this.f784b, ((g) jVar).f784b);
        }
        return false;
    }

    @Override // I2.j
    j g() {
        return new m(this.f784b);
    }

    public byte[] h() {
        return this.f784b;
    }

    @Override // I2.j, I2.e
    public int hashCode() {
        return Z2.a.h(h());
    }

    public String toString() {
        return "#" + Z2.e.b(AbstractC1247d.b(this.f784b));
    }
}
