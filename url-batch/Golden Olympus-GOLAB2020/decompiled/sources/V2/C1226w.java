package V2;

import S2.c;
import a3.AbstractC1247d;
import java.math.BigInteger;

/* renamed from: V2.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1226w extends c.b {

    /* renamed from: i, reason: collision with root package name */
    public static final BigInteger f9574i = new BigInteger(1, AbstractC1247d.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFE56D"));

    /* renamed from: h, reason: collision with root package name */
    protected C1230z f9575h;

    public C1226w() {
        super(f9574i);
        this.f9575h = new C1230z(this, null, null);
        this.f9246b = j(S2.b.f9239a);
        this.f9247c = j(BigInteger.valueOf(5L));
        this.f9248d = new BigInteger(1, AbstractC1247d.a("010000000000000000000000000001DCE8D2EC6184CAF0A971769FB1F7"));
        this.f9249e = BigInteger.valueOf(1L);
        this.f9250f = 2;
    }

    @Override // S2.c
    protected S2.c b() {
        return new C1226w();
    }

    @Override // S2.c
    protected S2.f f(S2.d dVar, S2.d dVar2, boolean z4) {
        return new C1230z(this, dVar, dVar2, z4);
    }

    @Override // S2.c
    public S2.d j(BigInteger bigInteger) {
        return new C1229y(bigInteger);
    }

    @Override // S2.c
    public int p() {
        return f9574i.bitLength();
    }

    @Override // S2.c
    public S2.f q() {
        return this.f9575h;
    }

    @Override // S2.c
    public boolean v(int i4) {
        return i4 == 2;
    }
}
