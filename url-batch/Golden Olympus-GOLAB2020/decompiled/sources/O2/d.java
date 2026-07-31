package O2;

import I2.o;
import java.math.BigInteger;

/* loaded from: classes3.dex */
public class d extends I2.e implements j {

    /* renamed from: h, reason: collision with root package name */
    private static final BigInteger f8933h = BigInteger.valueOf(1);

    /* renamed from: b, reason: collision with root package name */
    private h f8934b;

    /* renamed from: c, reason: collision with root package name */
    private S2.c f8935c;

    /* renamed from: d, reason: collision with root package name */
    private f f8936d;

    /* renamed from: e, reason: collision with root package name */
    private BigInteger f8937e;

    /* renamed from: f, reason: collision with root package name */
    private BigInteger f8938f;

    /* renamed from: g, reason: collision with root package name */
    private byte[] f8939g;

    public d(S2.c cVar, f fVar, BigInteger bigInteger, BigInteger bigInteger2) {
        this(cVar, fVar, bigInteger, bigInteger2, null);
    }

    @Override // I2.e, I2.b
    public I2.j b() {
        I2.c cVar = new I2.c();
        cVar.a(new I2.d(f8933h));
        cVar.a(this.f8934b);
        cVar.a(new c(this.f8935c, this.f8939g));
        cVar.a(this.f8936d);
        cVar.a(new I2.d(this.f8937e));
        BigInteger bigInteger = this.f8938f;
        if (bigInteger != null) {
            cVar.a(new I2.d(bigInteger));
        }
        return new o(cVar);
    }

    public S2.c d() {
        return this.f8935c;
    }

    public S2.f e() {
        return this.f8936d.d();
    }

    public BigInteger f() {
        return this.f8938f;
    }

    public BigInteger g() {
        return this.f8937e;
    }

    public byte[] h() {
        return this.f8939g;
    }

    public d(S2.c cVar, f fVar, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.f8935c = cVar;
        this.f8936d = fVar;
        this.f8937e = bigInteger;
        this.f8938f = bigInteger2;
        this.f8939g = bArr;
        if (S2.a.c(cVar)) {
            this.f8934b = new h(cVar.o().c());
            return;
        }
        if (!S2.a.a(cVar)) {
            throw new IllegalArgumentException("'curve' is of an unsupported type");
        }
        int[] a4 = ((X2.f) cVar.o()).a().a();
        if (a4.length == 3) {
            this.f8934b = new h(a4[2], a4[1]);
        } else {
            if (a4.length != 5) {
                throw new IllegalArgumentException("Only trinomial and pentomial curves are supported");
            }
            this.f8934b = new h(a4[4], a4[1], a4[2], a4[3]);
        }
    }
}
