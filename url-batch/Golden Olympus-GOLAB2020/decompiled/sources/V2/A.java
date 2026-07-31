package V2;

import S2.c;
import a3.AbstractC1247d;
import java.math.BigInteger;

/* loaded from: classes3.dex */
public class A extends c.b {

    /* renamed from: i, reason: collision with root package name */
    public static final BigInteger f9475i = new BigInteger(1, AbstractC1247d.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF000000000000000000000001"));

    /* renamed from: h, reason: collision with root package name */
    protected D f9476h;

    public A() {
        super(f9475i);
        this.f9476h = new D(this, null, null);
        this.f9246b = j(new BigInteger(1, AbstractC1247d.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFE")));
        this.f9247c = j(new BigInteger(1, AbstractC1247d.a("B4050A850C04B3ABF54132565044B0B7D7BFD8BA270B39432355FFB4")));
        this.f9248d = new BigInteger(1, AbstractC1247d.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFF16A2E0B8F03E13DD29455C5C2A3D"));
        this.f9249e = BigInteger.valueOf(1L);
        this.f9250f = 2;
    }

    @Override // S2.c
    protected S2.c b() {
        return new A();
    }

    @Override // S2.c
    protected S2.f f(S2.d dVar, S2.d dVar2, boolean z4) {
        return new D(this, dVar, dVar2, z4);
    }

    @Override // S2.c
    public S2.d j(BigInteger bigInteger) {
        return new C(bigInteger);
    }

    @Override // S2.c
    public int p() {
        return f9475i.bitLength();
    }

    @Override // S2.c
    public S2.f q() {
        return this.f9476h;
    }

    @Override // S2.c
    public boolean v(int i4) {
        return i4 == 2;
    }
}
