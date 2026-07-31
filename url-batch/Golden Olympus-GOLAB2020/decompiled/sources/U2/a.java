package U2;

import S2.c;
import S2.f;
import a3.AbstractC1247d;
import java.math.BigInteger;

/* loaded from: classes3.dex */
public class a extends c.b {

    /* renamed from: i, reason: collision with root package name */
    public static final BigInteger f9368i = new BigInteger(1, AbstractC1247d.a("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFF"));

    /* renamed from: h, reason: collision with root package name */
    protected d f9369h;

    public a() {
        super(f9368i);
        this.f9369h = new d(this, null, null);
        this.f9246b = j(new BigInteger(1, AbstractC1247d.a("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFC")));
        this.f9247c = j(new BigInteger(1, AbstractC1247d.a("28E9FA9E9D9F5E344D5A9E4BCF6509A7F39789F515AB8F92DDBCBD414D940E93")));
        this.f9248d = new BigInteger(1, AbstractC1247d.a("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFF7203DF6B21C6052B53BBF40939D54123"));
        this.f9249e = BigInteger.valueOf(1L);
        this.f9250f = 2;
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
        return f9368i.bitLength();
    }

    @Override // S2.c
    public f q() {
        return this.f9369h;
    }

    @Override // S2.c
    public boolean v(int i4) {
        return i4 == 2;
    }
}
