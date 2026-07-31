package V2;

import S2.c;
import a3.AbstractC1247d;
import java.math.BigInteger;

/* renamed from: V2.t0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1221t0 extends c.a {

    /* renamed from: i, reason: collision with root package name */
    protected C1223u0 f9571i;

    public C1221t0() {
        super(193, 15, 0, 0);
        this.f9571i = new C1223u0(this, null, null);
        this.f9246b = j(new BigInteger(1, AbstractC1247d.a("0163F35A5137C2CE3EA6ED8667190B0BC43ECD69977702709B")));
        this.f9247c = j(new BigInteger(1, AbstractC1247d.a("00C9BB9E8927D4D64C377E2AB2856A5B16E3EFB7F61D4316AE")));
        this.f9248d = new BigInteger(1, AbstractC1247d.a("010000000000000000000000015AAB561B005413CCD4EE99D5"));
        this.f9249e = BigInteger.valueOf(2L);
        this.f9250f = 6;
    }

    @Override // S2.c
    protected S2.c b() {
        return new C1221t0();
    }

    @Override // S2.c
    protected S2.f f(S2.d dVar, S2.d dVar2, boolean z4) {
        return new C1223u0(this, dVar, dVar2, z4);
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
        return this.f9571i;
    }

    @Override // S2.c
    public boolean v(int i4) {
        return i4 == 6;
    }
}
