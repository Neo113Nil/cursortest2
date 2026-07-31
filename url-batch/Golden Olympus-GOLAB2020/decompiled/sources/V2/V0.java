package V2;

import S2.c;
import a3.AbstractC1247d;
import java.math.BigInteger;

/* loaded from: classes3.dex */
public class V0 extends c.a {

    /* renamed from: j, reason: collision with root package name */
    static final S0 f9519j;

    /* renamed from: k, reason: collision with root package name */
    static final S0 f9520k;

    /* renamed from: i, reason: collision with root package name */
    protected W0 f9521i;

    static {
        S0 s02 = new S0(new BigInteger(1, AbstractC1247d.a("02F40E7E2221F295DE297117B7F3D62F5C6A97FFCB8CEFF1CD6BA8CE4A9A18AD84FFABBD8EFA59332BE7AD6756A66E294AFD185A78FF12AA520E4DE739BACA0C7FFEFF7F2955727A")));
        f9519j = s02;
        f9520k = (S0) s02.m();
    }

    public V0() {
        super(571, 2, 5, 10);
        this.f9521i = new W0(this, null, null);
        this.f9246b = j(BigInteger.valueOf(1L));
        this.f9247c = f9519j;
        this.f9248d = new BigInteger(1, AbstractC1247d.a("03FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE661CE18FF55987308059B186823851EC7DD9CA1161DE93D5174D66E8382E9BB2FE84E47"));
        this.f9249e = BigInteger.valueOf(2L);
        this.f9250f = 6;
    }

    @Override // S2.c
    protected S2.c b() {
        return new V0();
    }

    @Override // S2.c
    protected S2.f f(S2.d dVar, S2.d dVar2, boolean z4) {
        return new W0(this, dVar, dVar2, z4);
    }

    @Override // S2.c
    public S2.d j(BigInteger bigInteger) {
        return new S0(bigInteger);
    }

    @Override // S2.c
    public int p() {
        return 571;
    }

    @Override // S2.c
    public S2.f q() {
        return this.f9521i;
    }

    @Override // S2.c
    public boolean v(int i4) {
        return i4 == 6;
    }
}
