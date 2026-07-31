package V2;

import S2.c;
import a3.AbstractC1247d;
import java.math.BigInteger;

/* renamed from: V2.f0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1194f0 extends c.a {

    /* renamed from: i, reason: collision with root package name */
    protected C1196g0 f9537i;

    public C1194f0() {
        super(131, 2, 3, 8);
        this.f9537i = new C1196g0(this, null, null);
        this.f9246b = j(new BigInteger(1, AbstractC1247d.a("03E5A88919D7CAFCBF415F07C2176573B2")));
        this.f9247c = j(new BigInteger(1, AbstractC1247d.a("04B8266A46C55657AC734CE38F018F2192")));
        this.f9248d = new BigInteger(1, AbstractC1247d.a("0400000000000000016954A233049BA98F"));
        this.f9249e = BigInteger.valueOf(2L);
        this.f9250f = 6;
    }

    @Override // S2.c
    protected S2.c b() {
        return new C1194f0();
    }

    @Override // S2.c
    protected S2.f f(S2.d dVar, S2.d dVar2, boolean z4) {
        return new C1196g0(this, dVar, dVar2, z4);
    }

    @Override // S2.c
    public S2.d j(BigInteger bigInteger) {
        return new C1188c0(bigInteger);
    }

    @Override // S2.c
    public int p() {
        return 131;
    }

    @Override // S2.c
    public S2.f q() {
        return this.f9537i;
    }

    @Override // S2.c
    public boolean v(int i4) {
        return i4 == 6;
    }
}
