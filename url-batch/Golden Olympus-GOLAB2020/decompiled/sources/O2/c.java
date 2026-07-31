package O2;

import I2.l;
import I2.o;

/* loaded from: classes3.dex */
public class c extends I2.e implements j {

    /* renamed from: b, reason: collision with root package name */
    private S2.c f8930b;

    /* renamed from: c, reason: collision with root package name */
    private byte[] f8931c;

    /* renamed from: d, reason: collision with root package name */
    private I2.f f8932d = null;

    public c(S2.c cVar, byte[] bArr) {
        this.f8930b = cVar;
        this.f8931c = bArr;
        d();
    }

    private void d() {
        if (S2.a.c(this.f8930b)) {
            this.f8932d = j.f9007w1;
        } else {
            if (!S2.a.a(this.f8930b)) {
                throw new IllegalArgumentException("This type of ECCurve is not implemented");
            }
            this.f8932d = j.f9009x1;
        }
    }

    @Override // I2.e, I2.b
    public I2.j b() {
        I2.c cVar = new I2.c();
        if (this.f8932d.equals(j.f9007w1)) {
            cVar.a(new g(this.f8930b.k()).b());
            cVar.a(new g(this.f8930b.l()).b());
        } else if (this.f8932d.equals(j.f9009x1)) {
            cVar.a(new g(this.f8930b.k()).b());
            cVar.a(new g(this.f8930b.l()).b());
        }
        if (this.f8931c != null) {
            cVar.a(new l(this.f8931c));
        }
        return new o(cVar);
    }
}
