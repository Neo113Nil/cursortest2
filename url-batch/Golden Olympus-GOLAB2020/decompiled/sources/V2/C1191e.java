package V2;

import S2.c;
import a3.AbstractC1247d;
import java.math.BigInteger;

/* renamed from: V2.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1191e extends c.b {

    /* renamed from: i, reason: collision with root package name */
    public static final BigInteger f9535i = C1203k.f9548i;

    /* renamed from: h, reason: collision with root package name */
    protected C1193f f9536h;

    public C1191e() {
        super(f9535i);
        this.f9536h = new C1193f(this, null, null);
        this.f9246b = j(S2.b.f9239a);
        this.f9247c = j(BigInteger.valueOf(7L));
        this.f9248d = new BigInteger(1, AbstractC1247d.a("0100000000000000000001B8FA16DFAB9ACA16B6B3"));
        this.f9249e = BigInteger.valueOf(1L);
        this.f9250f = 2;
    }

    @Override // S2.c
    protected S2.c b() {
        return new C1191e();
    }

    @Override // S2.c
    protected S2.f f(S2.d dVar, S2.d dVar2, boolean z4) {
        return new C1193f(this, dVar, dVar2, z4);
    }

    @Override // S2.c
    public S2.d j(BigInteger bigInteger) {
        return new C1207m(bigInteger);
    }

    @Override // S2.c
    public int p() {
        return f9535i.bitLength();
    }

    @Override // S2.c
    public S2.f q() {
        return this.f9536h;
    }

    @Override // S2.c
    public boolean v(int i4) {
        return i4 == 2;
    }
}
