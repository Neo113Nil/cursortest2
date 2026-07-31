package V2;

import S2.c;
import a3.AbstractC1247d;
import java.math.BigInteger;

/* loaded from: classes3.dex */
public class J0 extends c.a {

    /* renamed from: i, reason: collision with root package name */
    protected K0 f9498i;

    public J0() {
        super(283, 5, 7, 12);
        this.f9498i = new K0(this, null, null);
        this.f9246b = j(BigInteger.valueOf(1L));
        this.f9247c = j(new BigInteger(1, AbstractC1247d.a("027B680AC8B8596DA5A4AF8A19A0303FCA97FD7645309FA2A581485AF6263E313B79A2F5")));
        this.f9248d = new BigInteger(1, AbstractC1247d.a("03FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEF90399660FC938A90165B042A7CEFADB307"));
        this.f9249e = BigInteger.valueOf(2L);
        this.f9250f = 6;
    }

    @Override // S2.c
    protected S2.c b() {
        return new J0();
    }

    @Override // S2.c
    protected S2.f f(S2.d dVar, S2.d dVar2, boolean z4) {
        return new K0(this, dVar, dVar2, z4);
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
        return this.f9498i;
    }

    @Override // S2.c
    public boolean v(int i4) {
        return i4 == 6;
    }
}
