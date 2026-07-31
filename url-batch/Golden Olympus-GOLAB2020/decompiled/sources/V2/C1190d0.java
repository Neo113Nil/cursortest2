package V2;

import S2.c;
import a3.AbstractC1247d;
import java.math.BigInteger;

/* renamed from: V2.d0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1190d0 extends c.a {

    /* renamed from: i, reason: collision with root package name */
    protected C1192e0 f9534i;

    public C1190d0() {
        super(131, 2, 3, 8);
        this.f9534i = new C1192e0(this, null, null);
        this.f9246b = j(new BigInteger(1, AbstractC1247d.a("07A11B09A76B562144418FF3FF8C2570B8")));
        this.f9247c = j(new BigInteger(1, AbstractC1247d.a("0217C05610884B63B9C6C7291678F9D341")));
        this.f9248d = new BigInteger(1, AbstractC1247d.a("0400000000000000023123953A9464B54D"));
        this.f9249e = BigInteger.valueOf(2L);
        this.f9250f = 6;
    }

    @Override // S2.c
    protected S2.c b() {
        return new C1190d0();
    }

    @Override // S2.c
    protected S2.f f(S2.d dVar, S2.d dVar2, boolean z4) {
        return new C1192e0(this, dVar, dVar2, z4);
    }

    @Override // S2.c
    public S2.d j(BigInteger bigInteger) {
        return new C1188c0(bigInteger);
    }

    @Override // S2.c
    public int p() {
        return 131;
    }

    @Override // S2.c
    public S2.f q() {
        return this.f9534i;
    }

    @Override // S2.c
    public boolean v(int i4) {
        return i4 == 6;
    }
}
