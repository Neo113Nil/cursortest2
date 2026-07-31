package V2;

import S2.c;
import a3.AbstractC1247d;
import java.math.BigInteger;

/* renamed from: V2.r0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1217r0 extends c.a {

    /* renamed from: i, reason: collision with root package name */
    protected C1219s0 f9565i;

    public C1217r0() {
        super(193, 15, 0, 0);
        this.f9565i = new C1219s0(this, null, null);
        this.f9246b = j(new BigInteger(1, AbstractC1247d.a("0017858FEB7A98975169E171F77B4087DE098AC8A911DF7B01")));
        this.f9247c = j(new BigInteger(1, AbstractC1247d.a("00FDFB49BFE6C3A89FACADAA7A1E5BBC7CC1C2E5D831478814")));
        this.f9248d = new BigInteger(1, AbstractC1247d.a("01000000000000000000000000C7F34A778F443ACC920EBA49"));
        this.f9249e = BigInteger.valueOf(2L);
        this.f9250f = 6;
    }

    @Override // S2.c
    protected S2.c b() {
        return new C1217r0();
    }

    @Override // S2.c
    protected S2.f f(S2.d dVar, S2.d dVar2, boolean z4) {
        return new C1219s0(this, dVar, dVar2, z4);
    }

    @Override // S2.c
    public S2.d j(BigInteger bigInteger) {
        return new C1216q0(bigInteger);
    }

    @Override // S2.c
    public int p() {
        return 193;
    }

    @Override // S2.c
    public S2.f q() {
        return this.f9565i;
    }

    @Override // S2.c
    public boolean v(int i4) {
        return i4 == 6;
    }
}
