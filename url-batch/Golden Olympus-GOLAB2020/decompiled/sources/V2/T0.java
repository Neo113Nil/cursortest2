package V2;

import S2.c;
import a3.AbstractC1247d;
import java.math.BigInteger;

/* loaded from: classes3.dex */
public class T0 extends c.a {

    /* renamed from: i, reason: collision with root package name */
    protected U0 f9518i;

    public T0() {
        super(571, 2, 5, 10);
        this.f9518i = new U0(this, null, null);
        this.f9246b = j(BigInteger.valueOf(0L));
        this.f9247c = j(BigInteger.valueOf(1L));
        this.f9248d = new BigInteger(1, AbstractC1247d.a("020000000000000000000000000000000000000000000000000000000000000000000000131850E1F19A63E4B391A8DB917F4138B630D84BE5D639381E91DEB45CFE778F637C1001"));
        this.f9249e = BigInteger.valueOf(4L);
        this.f9250f = 6;
    }

    @Override // S2.c
    protected S2.c b() {
        return new T0();
    }

    @Override // S2.c
    protected S2.f f(S2.d dVar, S2.d dVar2, boolean z4) {
        return new U0(this, dVar, dVar2, z4);
    }

    @Override // S2.c
    public S2.d j(BigInteger bigInteger) {
        return new S0(bigInteger);
    }

    @Override // S2.c
    public int p() {
        return 571;
    }

    @Override // S2.c
    public S2.f q() {
        return this.f9518i;
    }

    @Override // S2.c
    public boolean v(int i4) {
        return i4 == 6;
    }
}
