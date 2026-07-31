package V2;

import S2.c;
import a3.AbstractC1247d;
import java.math.BigInteger;

/* renamed from: V2.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1211o extends c.b {

    /* renamed from: i, reason: collision with root package name */
    public static final BigInteger f9557i = new BigInteger(1, AbstractC1247d.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFEE37"));

    /* renamed from: h, reason: collision with root package name */
    protected r f9558h;

    public C1211o() {
        super(f9557i);
        this.f9558h = new r(this, null, null);
        this.f9246b = j(S2.b.f9239a);
        this.f9247c = j(BigInteger.valueOf(3L));
        this.f9248d = new BigInteger(1, AbstractC1247d.a("FFFFFFFFFFFFFFFFFFFFFFFE26F2FC170F69466A74DEFD8D"));
        this.f9249e = BigInteger.valueOf(1L);
        this.f9250f = 2;
    }

    @Override // S2.c
    protected S2.c b() {
        return new C1211o();
    }

    @Override // S2.c
    protected S2.f f(S2.d dVar, S2.d dVar2, boolean z4) {
        return new r(this, dVar, dVar2, z4);
    }

    @Override // S2.c
    public S2.d j(BigInteger bigInteger) {
        return new C1215q(bigInteger);
    }

    @Override // S2.c
    public int p() {
        return f9557i.bitLength();
    }

    @Override // S2.c
    public S2.f q() {
        return this.f9558h;
    }

    @Override // S2.c
    public boolean v(int i4) {
        return i4 == 2;
    }
}
