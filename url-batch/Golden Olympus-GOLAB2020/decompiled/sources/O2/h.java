package O2;

import I2.o;
import java.math.BigInteger;

/* loaded from: classes3.dex */
public class h extends I2.e implements j {

    /* renamed from: b, reason: collision with root package name */
    private I2.f f8946b;

    /* renamed from: c, reason: collision with root package name */
    private I2.j f8947c;

    public h(BigInteger bigInteger) {
        this.f8946b = j.f9007w1;
        this.f8947c = new I2.d(bigInteger);
    }

    @Override // I2.e, I2.b
    public I2.j b() {
        I2.c cVar = new I2.c();
        cVar.a(this.f8946b);
        cVar.a(this.f8947c);
        return new o(cVar);
    }

    public h(int i4, int i5) {
        this(i4, i5, 0, 0);
    }

    public h(int i4, int i5, int i6, int i7) {
        this.f8946b = j.f9009x1;
        I2.c cVar = new I2.c();
        cVar.a(new I2.d(i4));
        if (i6 == 0) {
            if (i7 == 0) {
                cVar.a(j.f9013z1);
                cVar.a(new I2.d(i5));
            } else {
                throw new IllegalArgumentException("inconsistent k values");
            }
        } else if (i6 > i5 && i7 > i6) {
            cVar.a(j.f8948A1);
            I2.c cVar2 = new I2.c();
            cVar2.a(new I2.d(i5));
            cVar2.a(new I2.d(i6));
            cVar2.a(new I2.d(i7));
            cVar.a(new o(cVar2));
        } else {
            throw new IllegalArgumentException("inconsistent k values");
        }
        this.f8947c = new o(cVar);
    }
}
