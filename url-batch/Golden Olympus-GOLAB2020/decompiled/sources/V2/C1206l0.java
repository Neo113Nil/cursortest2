package V2;

import S2.c;
import a3.AbstractC1247d;
import java.math.BigInteger;

/* renamed from: V2.l0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1206l0 extends c.a {

    /* renamed from: i, reason: collision with root package name */
    protected C1208m0 f9553i;

    public C1206l0() {
        super(163, 3, 6, 7);
        this.f9553i = new C1208m0(this, null, null);
        this.f9246b = j(new BigInteger(1, AbstractC1247d.a("07B6882CAAEFA84F9554FF8428BD88E246D2782AE2")));
        this.f9247c = j(new BigInteger(1, AbstractC1247d.a("0713612DCDDCB40AAB946BDA29CA91F73AF958AFD9")));
        this.f9248d = new BigInteger(1, AbstractC1247d.a("03FFFFFFFFFFFFFFFFFFFF48AAB689C29CA710279B"));
        this.f9249e = BigInteger.valueOf(2L);
        this.f9250f = 6;
    }

    @Override // S2.c
    protected S2.c b() {
        return new C1206l0();
    }

    @Override // S2.c
    protected S2.f f(S2.d dVar, S2.d dVar2, boolean z4) {
        return new C1208m0(this, dVar, dVar2, z4);
    }

    @Override // S2.c
    public S2.d j(BigInteger bigInteger) {
        return new C1200i0(bigInteger);
    }

    @Override // S2.c
    public int p() {
        return 163;
    }

    @Override // S2.c
    public S2.f q() {
        return this.f9553i;
    }

    @Override // S2.c
    public boolean v(int i4) {
        return i4 == 6;
    }
}
