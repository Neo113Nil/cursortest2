package V2;

import S2.c;
import a3.AbstractC1247d;
import java.math.BigInteger;

/* loaded from: classes3.dex */
public class I extends c.b {

    /* renamed from: i, reason: collision with root package name */
    public static final BigInteger f9494i = new BigInteger(1, AbstractC1247d.a("FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFF"));

    /* renamed from: h, reason: collision with root package name */
    protected L f9495h;

    public I() {
        super(f9494i);
        this.f9495h = new L(this, null, null);
        this.f9246b = j(new BigInteger(1, AbstractC1247d.a("FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFC")));
        this.f9247c = j(new BigInteger(1, AbstractC1247d.a("5AC635D8AA3A93E7B3EBBD55769886BC651D06B0CC53B0F63BCE3C3E27D2604B")));
        this.f9248d = new BigInteger(1, AbstractC1247d.a("FFFFFFFF00000000FFFFFFFFFFFFFFFFBCE6FAADA7179E84F3B9CAC2FC632551"));
        this.f9249e = BigInteger.valueOf(1L);
        this.f9250f = 2;
    }

    @Override // S2.c
    protected S2.c b() {
        return new I();
    }

    @Override // S2.c
    protected S2.f f(S2.d dVar, S2.d dVar2, boolean z4) {
        return new L(this, dVar, dVar2, z4);
    }

    @Override // S2.c
    public S2.d j(BigInteger bigInteger) {
        return new K(bigInteger);
    }

    @Override // S2.c
    public int p() {
        return f9494i.bitLength();
    }

    @Override // S2.c
    public S2.f q() {
        return this.f9495h;
    }

    @Override // S2.c
    public boolean v(int i4) {
        return i4 == 2;
    }
}
