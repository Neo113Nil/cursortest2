package V2;

import S2.c;
import a3.AbstractC1247d;
import java.math.BigInteger;

/* renamed from: V2.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1218s extends c.b {

    /* renamed from: i, reason: collision with root package name */
    public static final BigInteger f9566i = new BigInteger(1, AbstractC1247d.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFF"));

    /* renamed from: h, reason: collision with root package name */
    protected C1224v f9567h;

    public C1218s() {
        super(f9566i);
        this.f9567h = new C1224v(this, null, null);
        this.f9246b = j(new BigInteger(1, AbstractC1247d.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFC")));
        this.f9247c = j(new BigInteger(1, AbstractC1247d.a("64210519E59C80E70FA7E9AB72243049FEB8DEECC146B9B1")));
        this.f9248d = new BigInteger(1, AbstractC1247d.a("FFFFFFFFFFFFFFFFFFFFFFFF99DEF836146BC9B1B4D22831"));
        this.f9249e = BigInteger.valueOf(1L);
        this.f9250f = 2;
    }

    @Override // S2.c
    protected S2.c b() {
        return new C1218s();
    }

    @Override // S2.c
    protected S2.f f(S2.d dVar, S2.d dVar2, boolean z4) {
        return new C1224v(this, dVar, dVar2, z4);
    }

    @Override // S2.c
    public S2.d j(BigInteger bigInteger) {
        return new C1222u(bigInteger);
    }

    @Override // S2.c
    public int p() {
        return f9566i.bitLength();
    }

    @Override // S2.c
    public S2.f q() {
        return this.f9567h;
    }

    @Override // S2.c
    public boolean v(int i4) {
        return i4 == 2;
    }
}
