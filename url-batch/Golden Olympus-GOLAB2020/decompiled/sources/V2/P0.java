package V2;

import S2.c;
import a3.AbstractC1247d;
import com.ironsource.InterfaceC1490j3;
import java.math.BigInteger;

/* loaded from: classes3.dex */
public class P0 extends c.a {

    /* renamed from: i, reason: collision with root package name */
    protected Q0 f9510i;

    public P0() {
        super(InterfaceC1490j3.a.b.f16794i, 87, 0, 0);
        this.f9510i = new Q0(this, null, null);
        this.f9246b = j(BigInteger.valueOf(1L));
        this.f9247c = j(new BigInteger(1, AbstractC1247d.a("0021A5C2C8EE9FEB5C4B9A753B7B476B7FD6422EF1F3DD674761FA99D6AC27C8A9A197B272822F6CD57A55AA4F50AE317B13545F")));
        this.f9248d = new BigInteger(1, AbstractC1247d.a("010000000000000000000000000000000000000000000000000001E2AAD6A612F33307BE5FA47C3C9E052F838164CD37D9A21173"));
        this.f9249e = BigInteger.valueOf(2L);
        this.f9250f = 6;
    }

    @Override // S2.c
    protected S2.c b() {
        return new P0();
    }

    @Override // S2.c
    protected S2.f f(S2.d dVar, S2.d dVar2, boolean z4) {
        return new Q0(this, dVar, dVar2, z4);
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
        return this.f9510i;
    }

    @Override // S2.c
    public boolean v(int i4) {
        return i4 == 6;
    }
}
