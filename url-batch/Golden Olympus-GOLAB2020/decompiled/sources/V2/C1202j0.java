package V2;

import S2.c;
import a3.AbstractC1247d;
import java.math.BigInteger;

/* renamed from: V2.j0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1202j0 extends c.a {

    /* renamed from: i, reason: collision with root package name */
    protected C1204k0 f9547i;

    public C1202j0() {
        super(163, 3, 6, 7);
        this.f9547i = new C1204k0(this, null, null);
        S2.d j4 = j(BigInteger.valueOf(1L));
        this.f9246b = j4;
        this.f9247c = j4;
        this.f9248d = new BigInteger(1, AbstractC1247d.a("04000000000000000000020108A2E0CC0D99F8A5EF"));
        this.f9249e = BigInteger.valueOf(2L);
        this.f9250f = 6;
    }

    @Override // S2.c
    protected S2.c b() {
        return new C1202j0();
    }

    @Override // S2.c
    protected S2.f f(S2.d dVar, S2.d dVar2, boolean z4) {
        return new C1204k0(this, dVar, dVar2, z4);
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
        return this.f9547i;
    }

    @Override // S2.c
    public boolean v(int i4) {
        return i4 == 6;
    }
}
