package V2;

import S2.c;
import a3.AbstractC1247d;
import java.math.BigInteger;

/* loaded from: classes3.dex */
public class x0 extends c.a {

    /* renamed from: i, reason: collision with root package name */
    protected y0 f9580i;

    public x0() {
        super(233, 74, 0, 0);
        this.f9580i = new y0(this, null, null);
        this.f9246b = j(BigInteger.valueOf(0L));
        this.f9247c = j(BigInteger.valueOf(1L));
        this.f9248d = new BigInteger(1, AbstractC1247d.a("8000000000000000000000000000069D5BB915BCD46EFB1AD5F173ABDF"));
        this.f9249e = BigInteger.valueOf(4L);
        this.f9250f = 6;
    }

    @Override // S2.c
    protected S2.c b() {
        return new x0();
    }

    @Override // S2.c
    protected S2.f f(S2.d dVar, S2.d dVar2, boolean z4) {
        return new y0(this, dVar, dVar2, z4);
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
        return this.f9580i;
    }

    @Override // S2.c
    public boolean v(int i4) {
        return i4 == 6;
    }
}
