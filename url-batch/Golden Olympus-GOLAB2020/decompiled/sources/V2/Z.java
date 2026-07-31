package V2;

import S2.c;
import a3.AbstractC1247d;
import java.math.BigInteger;

/* loaded from: classes3.dex */
public class Z extends c.a {

    /* renamed from: i, reason: collision with root package name */
    protected C1184a0 f9524i;

    public Z() {
        super(113, 9, 0, 0);
        this.f9524i = new C1184a0(this, null, null);
        this.f9246b = j(new BigInteger(1, AbstractC1247d.a("00689918DBEC7E5A0DD6DFC0AA55C7")));
        this.f9247c = j(new BigInteger(1, AbstractC1247d.a("0095E9A9EC9B297BD4BF36E059184F")));
        this.f9248d = new BigInteger(1, AbstractC1247d.a("010000000000000108789B2496AF93"));
        this.f9249e = BigInteger.valueOf(2L);
        this.f9250f = 6;
    }

    @Override // S2.c
    protected S2.c b() {
        return new Z();
    }

    @Override // S2.c
    protected S2.f f(S2.d dVar, S2.d dVar2, boolean z4) {
        return new C1184a0(this, dVar, dVar2, z4);
    }

    @Override // S2.c
    public S2.d j(BigInteger bigInteger) {
        return new W(bigInteger);
    }

    @Override // S2.c
    public int p() {
        return 113;
    }

    @Override // S2.c
    public S2.f q() {
        return this.f9524i;
    }

    @Override // S2.c
    public boolean v(int i4) {
        return i4 == 6;
    }
}
