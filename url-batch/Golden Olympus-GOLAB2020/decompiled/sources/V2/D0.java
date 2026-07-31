package V2;

import S2.c;
import a3.AbstractC1247d;
import java.math.BigInteger;

/* loaded from: classes3.dex */
public class D0 extends c.a {

    /* renamed from: i, reason: collision with root package name */
    protected E0 f9483i;

    public D0() {
        super(239, 158, 0, 0);
        this.f9483i = new E0(this, null, null);
        this.f9246b = j(BigInteger.valueOf(0L));
        this.f9247c = j(BigInteger.valueOf(1L));
        this.f9248d = new BigInteger(1, AbstractC1247d.a("2000000000000000000000000000005A79FEC67CB6E91F1C1DA800E478A5"));
        this.f9249e = BigInteger.valueOf(4L);
        this.f9250f = 6;
    }

    @Override // S2.c
    protected S2.c b() {
        return new D0();
    }

    @Override // S2.c
    protected S2.f f(S2.d dVar, S2.d dVar2, boolean z4) {
        return new E0(this, dVar, dVar2, z4);
    }

    @Override // S2.c
    public S2.d j(BigInteger bigInteger) {
        return new C0(bigInteger);
    }

    @Override // S2.c
    public int p() {
        return 239;
    }

    @Override // S2.c
    public S2.f q() {
        return this.f9483i;
    }

    @Override // S2.c
    public boolean v(int i4) {
        return i4 == 6;
    }
}
