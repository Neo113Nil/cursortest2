package V2;

import S2.c;
import a3.AbstractC1247d;
import java.math.BigInteger;

/* loaded from: classes3.dex */
public class X extends c.a {

    /* renamed from: i, reason: collision with root package name */
    protected Y f9523i;

    public X() {
        super(113, 9, 0, 0);
        this.f9523i = new Y(this, null, null);
        this.f9246b = j(new BigInteger(1, AbstractC1247d.a("003088250CA6E7C7FE649CE85820F7")));
        this.f9247c = j(new BigInteger(1, AbstractC1247d.a("00E8BEE4D3E2260744188BE0E9C723")));
        this.f9248d = new BigInteger(1, AbstractC1247d.a("0100000000000000D9CCEC8A39E56F"));
        this.f9249e = BigInteger.valueOf(2L);
        this.f9250f = 6;
    }

    @Override // S2.c
    protected S2.c b() {
        return new X();
    }

    @Override // S2.c
    protected S2.f f(S2.d dVar, S2.d dVar2, boolean z4) {
        return new Y(this, dVar, dVar2, z4);
    }

    @Override // S2.c
    public S2.d j(BigInteger bigInteger) {
        return new W(bigInteger);
    }

    @Override // S2.c
    public int p() {
        return 113;
    }

    @Override // S2.c
    public S2.f q() {
        return this.f9523i;
    }

    @Override // S2.c
    public boolean v(int i4) {
        return i4 == 6;
    }
}
