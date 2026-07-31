package O2;

import I2.m;

/* loaded from: classes3.dex */
public class g extends I2.e {

    /* renamed from: c, reason: collision with root package name */
    private static i f8944c = new i();

    /* renamed from: b, reason: collision with root package name */
    protected S2.d f8945b;

    public g(S2.d dVar) {
        this.f8945b = dVar;
    }

    @Override // I2.e, I2.b
    public I2.j b() {
        return new m(f8944c.b(this.f8945b.r(), f8944c.a(this.f8945b)));
    }
}
