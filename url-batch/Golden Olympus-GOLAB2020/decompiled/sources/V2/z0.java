package V2;

import S2.c;
import a3.AbstractC1247d;
import java.math.BigInteger;

/* loaded from: classes3.dex */
public class z0 extends c.a {

    /* renamed from: i, reason: collision with root package name */
    protected A0 f9584i;

    public z0() {
        super(233, 74, 0, 0);
        this.f9584i = new A0(this, null, null);
        this.f9246b = j(BigInteger.valueOf(1L));
        this.f9247c = j(new BigInteger(1, AbstractC1247d.a("0066647EDE6C332C7F8C0923BB58213B333B20E9CE4281FE115F7D8F90AD")));
        this.f9248d = new BigInteger(1, AbstractC1247d.a("01000000000000000000000000000013E974E72F8A6922031D2603CFE0D7"));
        this.f9249e = BigInteger.valueOf(2L);
        this.f9250f = 6;
    }

    @Override // S2.c
    protected S2.c b() {
        return new z0();
    }

    @Override // S2.c
    protected S2.f f(S2.d dVar, S2.d dVar2, boolean z4) {
        return new A0(this, dVar, dVar2, z4);
    }

    @Override // S2.c
    public S2.d j(BigInteger bigInteger) {
        return new C1227w0(bigInteger);
    }

    @Override // S2.c
    public int p() {
        return 233;
    }

    @Override // S2.c
    public S2.f q() {
        return this.f9584i;
    }

    @Override // S2.c
    public boolean v(int i4) {
        return i4 == 6;
    }
}
