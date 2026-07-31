package V2;

import S2.c;
import a3.AbstractC1247d;
import com.ironsource.InterfaceC1490j3;
import java.math.BigInteger;

/* loaded from: classes3.dex */
public class N0 extends c.a {

    /* renamed from: i, reason: collision with root package name */
    protected O0 f9507i;

    public N0() {
        super(InterfaceC1490j3.a.b.f16794i, 87, 0, 0);
        this.f9507i = new O0(this, null, null);
        this.f9246b = j(BigInteger.valueOf(0L));
        this.f9247c = j(BigInteger.valueOf(1L));
        this.f9248d = new BigInteger(1, AbstractC1247d.a("7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE5F83B2D4EA20400EC4557D5ED3E3E7CA5B4B5C83B8E01E5FCF"));
        this.f9249e = BigInteger.valueOf(4L);
        this.f9250f = 6;
    }

    @Override // S2.c
    protected S2.c b() {
        return new N0();
    }

    @Override // S2.c
    protected S2.f f(S2.d dVar, S2.d dVar2, boolean z4) {
        return new O0(this, dVar, dVar2, z4);
    }

    @Override // S2.c
    public S2.d j(BigInteger bigInteger) {
        return new M0(bigInteger);
    }

    @Override // S2.c
    public int p() {
        return InterfaceC1490j3.a.b.f16794i;
    }

    @Override // S2.c
    public S2.f q() {
        return this.f9507i;
    }

    @Override // S2.c
    public boolean v(int i4) {
        return i4 == 6;
    }
}
