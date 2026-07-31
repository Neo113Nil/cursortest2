package V2;

import S2.c;
import a3.AbstractC1247d;
import java.math.BigInteger;

/* loaded from: classes3.dex */
public class M extends c.b {

    /* renamed from: i, reason: collision with root package name */
    public static final BigInteger f9501i = new BigInteger(1, AbstractC1247d.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFF"));

    /* renamed from: h, reason: collision with root package name */
    protected P f9502h;

    public M() {
        super(f9501i);
        this.f9502h = new P(this, null, null);
        this.f9246b = j(new BigInteger(1, AbstractC1247d.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFC")));
        this.f9247c = j(new BigInteger(1, AbstractC1247d.a("B3312FA7E23EE7E4988E056BE3F82D19181D9C6EFE8141120314088F5013875AC656398D8A2ED19D2A85C8EDD3EC2AEF")));
        this.f9248d = new BigInteger(1, AbstractC1247d.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC7634D81F4372DDF581A0DB248B0A77AECEC196ACCC52973"));
        this.f9249e = BigInteger.valueOf(1L);
        this.f9250f = 2;
    }

    @Override // S2.c
    protected S2.c b() {
        return new M();
    }

    @Override // S2.c
    protected S2.f f(S2.d dVar, S2.d dVar2, boolean z4) {
        return new P(this, dVar, dVar2, z4);
    }

    @Override // S2.c
    public S2.d j(BigInteger bigInteger) {
        return new O(bigInteger);
    }

    @Override // S2.c
    public int p() {
        return f9501i.bitLength();
    }

    @Override // S2.c
    public S2.f q() {
        return this.f9502h;
    }

    @Override // S2.c
    public boolean v(int i4) {
        return i4 == 2;
    }
}
