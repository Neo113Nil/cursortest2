package V2;

import S2.c;
import a3.AbstractC1247d;
import java.math.BigInteger;

/* loaded from: classes3.dex */
public class E extends c.b {

    /* renamed from: i, reason: collision with root package name */
    public static final BigInteger f9484i = new BigInteger(1, AbstractC1247d.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFC2F"));

    /* renamed from: h, reason: collision with root package name */
    protected H f9485h;

    public E() {
        super(f9484i);
        this.f9485h = new H(this, null, null);
        this.f9246b = j(S2.b.f9239a);
        this.f9247c = j(BigInteger.valueOf(7L));
        this.f9248d = new BigInteger(1, AbstractC1247d.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEBAAEDCE6AF48A03BBFD25E8CD0364141"));
        this.f9249e = BigInteger.valueOf(1L);
        this.f9250f = 2;
    }

    @Override // S2.c
    protected S2.c b() {
        return new E();
    }

    @Override // S2.c
    protected S2.f f(S2.d dVar, S2.d dVar2, boolean z4) {
        return new H(this, dVar, dVar2, z4);
    }

    @Override // S2.c
    public S2.d j(BigInteger bigInteger) {
        return new G(bigInteger);
    }

    @Override // S2.c
    public int p() {
        return f9484i.bitLength();
    }

    @Override // S2.c
    public S2.f q() {
        return this.f9485h;
    }

    @Override // S2.c
    public boolean v(int i4) {
        return i4 == 2;
    }
}
