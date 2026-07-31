package T2;

import S2.c;
import S2.f;
import Y2.g;
import a3.AbstractC1247d;
import java.math.BigInteger;

/* loaded from: classes3.dex */
public class a extends c.b {

    /* renamed from: i, reason: collision with root package name */
    public static final BigInteger f9319i = g.H(b.f9321a);

    /* renamed from: h, reason: collision with root package name */
    protected d f9320h;

    public a() {
        super(f9319i);
        this.f9320h = new d(this, null, null);
        this.f9246b = j(new BigInteger(1, AbstractC1247d.a("2AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA984914A144")));
        this.f9247c = j(new BigInteger(1, AbstractC1247d.a("7B425ED097B425ED097B425ED097B425ED097B425ED097B4260B5E9C7710C864")));
        this.f9248d = new BigInteger(1, AbstractC1247d.a("1000000000000000000000000000000014DEF9DEA2F79CD65812631A5CF5D3ED"));
        this.f9249e = BigInteger.valueOf(8L);
        this.f9250f = 4;
    }

    @Override // S2.c
    protected S2.c b() {
        return new a();
    }

    @Override // S2.c
    protected f f(S2.d dVar, S2.d dVar2, boolean z4) {
        return new d(this, dVar, dVar2, z4);
    }

    @Override // S2.c
    public S2.d j(BigInteger bigInteger) {
        return new c(bigInteger);
    }

    @Override // S2.c
    public int p() {
        return f9319i.bitLength();
    }

    @Override // S2.c
    public f q() {
        return this.f9320h;
    }

    @Override // S2.c
    public boolean v(int i4) {
        return i4 == 4;
    }
}
