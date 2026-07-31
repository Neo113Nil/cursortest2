package V2;

import S2.c;
import a3.AbstractC1247d;
import java.math.BigInteger;

/* renamed from: V2.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1195g extends c.b {

    /* renamed from: i, reason: collision with root package name */
    public static final BigInteger f9538i = new BigInteger(1, AbstractC1247d.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF7FFFFFFF"));

    /* renamed from: h, reason: collision with root package name */
    protected C1201j f9539h;

    public C1195g() {
        super(f9538i);
        this.f9539h = new C1201j(this, null, null);
        this.f9246b = j(new BigInteger(1, AbstractC1247d.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF7FFFFFFC")));
        this.f9247c = j(new BigInteger(1, AbstractC1247d.a("1C97BEFC54BD7A8B65ACF89F81D4D4ADC565FA45")));
        this.f9248d = new BigInteger(1, AbstractC1247d.a("0100000000000000000001F4C8F927AED3CA752257"));
        this.f9249e = BigInteger.valueOf(1L);
        this.f9250f = 2;
    }

    @Override // S2.c
    protected S2.c b() {
        return new C1195g();
    }

    @Override // S2.c
    protected S2.f f(S2.d dVar, S2.d dVar2, boolean z4) {
        return new C1201j(this, dVar, dVar2, z4);
    }

    @Override // S2.c
    public S2.d j(BigInteger bigInteger) {
        return new C1199i(bigInteger);
    }

    @Override // S2.c
    public int p() {
        return f9538i.bitLength();
    }

    @Override // S2.c
    public S2.f q() {
        return this.f9539h;
    }

    @Override // S2.c
    public boolean v(int i4) {
        return i4 == 2;
    }
}
