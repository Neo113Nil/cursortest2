package V2;

import S2.c;
import a3.AbstractC1247d;
import java.math.BigInteger;

/* renamed from: V2.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1203k extends c.b {

    /* renamed from: i, reason: collision with root package name */
    public static final BigInteger f9548i = new BigInteger(1, AbstractC1247d.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC73"));

    /* renamed from: h, reason: collision with root package name */
    protected C1209n f9549h;

    public C1203k() {
        super(f9548i);
        this.f9549h = new C1209n(this, null, null);
        this.f9246b = j(new BigInteger(1, AbstractC1247d.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC70")));
        this.f9247c = j(new BigInteger(1, AbstractC1247d.a("B4E134D3FB59EB8BAB57274904664D5AF50388BA")));
        this.f9248d = new BigInteger(1, AbstractC1247d.a("0100000000000000000000351EE786A818F3A1A16B"));
        this.f9249e = BigInteger.valueOf(1L);
        this.f9250f = 2;
    }

    @Override // S2.c
    protected S2.c b() {
        return new C1203k();
    }

    @Override // S2.c
    protected S2.f f(S2.d dVar, S2.d dVar2, boolean z4) {
        return new C1209n(this, dVar, dVar2, z4);
    }

    @Override // S2.c
    public S2.d j(BigInteger bigInteger) {
        return new C1207m(bigInteger);
    }

    @Override // S2.c
    public int p() {
        return f9548i.bitLength();
    }

    @Override // S2.c
    public S2.f q() {
        return this.f9549h;
    }

    @Override // S2.c
    public boolean v(int i4) {
        return i4 == 2;
    }
}
