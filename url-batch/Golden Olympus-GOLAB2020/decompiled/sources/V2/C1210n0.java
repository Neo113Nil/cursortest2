package V2;

import S2.c;
import a3.AbstractC1247d;
import java.math.BigInteger;

/* renamed from: V2.n0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1210n0 extends c.a {

    /* renamed from: i, reason: collision with root package name */
    protected C1212o0 f9556i;

    public C1210n0() {
        super(163, 3, 6, 7);
        this.f9556i = new C1212o0(this, null, null);
        this.f9246b = j(BigInteger.valueOf(1L));
        this.f9247c = j(new BigInteger(1, AbstractC1247d.a("020A601907B8C953CA1481EB10512F78744A3205FD")));
        this.f9248d = new BigInteger(1, AbstractC1247d.a("040000000000000000000292FE77E70C12A4234C33"));
        this.f9249e = BigInteger.valueOf(2L);
        this.f9250f = 6;
    }

    @Override // S2.c
    protected S2.c b() {
        return new C1210n0();
    }

    @Override // S2.c
    protected S2.f f(S2.d dVar, S2.d dVar2, boolean z4) {
        return new C1212o0(this, dVar, dVar2, z4);
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
        return this.f9556i;
    }

    @Override // S2.c
    public boolean v(int i4) {
        return i4 == 6;
    }
}
