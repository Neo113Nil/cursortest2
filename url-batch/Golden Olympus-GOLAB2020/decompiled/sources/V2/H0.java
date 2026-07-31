package V2;

import S2.c;
import a3.AbstractC1247d;
import java.math.BigInteger;

/* loaded from: classes3.dex */
public class H0 extends c.a {

    /* renamed from: i, reason: collision with root package name */
    protected I0 f9493i;

    public H0() {
        super(283, 5, 7, 12);
        this.f9493i = new I0(this, null, null);
        this.f9246b = j(BigInteger.valueOf(0L));
        this.f9247c = j(BigInteger.valueOf(1L));
        this.f9248d = new BigInteger(1, AbstractC1247d.a("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE9AE2ED07577265DFF7F94451E061E163C61"));
        this.f9249e = BigInteger.valueOf(4L);
        this.f9250f = 6;
    }

    @Override // S2.c
    protected S2.c b() {
        return new H0();
    }

    @Override // S2.c
    protected S2.f f(S2.d dVar, S2.d dVar2, boolean z4) {
        return new I0(this, dVar, dVar2, z4);
    }

    @Override // S2.c
    public S2.d j(BigInteger bigInteger) {
        return new G0(bigInteger);
    }

    @Override // S2.c
    public int p() {
        return 283;
    }

    @Override // S2.c
    public S2.f q() {
        return this.f9493i;
    }

    @Override // S2.c
    public boolean v(int i4) {
        return i4 == 6;
    }
}
