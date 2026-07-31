package V2;

import S2.c;
import a3.AbstractC1247d;
import java.math.BigInteger;

/* renamed from: V2.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1183a extends c.b {

    /* renamed from: i, reason: collision with root package name */
    public static final BigInteger f9525i = new BigInteger(1, AbstractC1247d.a("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFF"));

    /* renamed from: h, reason: collision with root package name */
    protected C1189d f9526h;

    public C1183a() {
        super(f9525i);
        this.f9526h = new C1189d(this, null, null);
        this.f9246b = j(new BigInteger(1, AbstractC1247d.a("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFC")));
        this.f9247c = j(new BigInteger(1, AbstractC1247d.a("E87579C11079F43DD824993C2CEE5ED3")));
        this.f9248d = new BigInteger(1, AbstractC1247d.a("FFFFFFFE0000000075A30D1B9038A115"));
        this.f9249e = BigInteger.valueOf(1L);
        this.f9250f = 2;
    }

    @Override // S2.c
    protected S2.c b() {
        return new C1183a();
    }

    @Override // S2.c
    protected S2.f f(S2.d dVar, S2.d dVar2, boolean z4) {
        return new C1189d(this, dVar, dVar2, z4);
    }

    @Override // S2.c
    public S2.d j(BigInteger bigInteger) {
        return new C1187c(bigInteger);
    }

    @Override // S2.c
    public int p() {
        return f9525i.bitLength();
    }

    @Override // S2.c
    public S2.f q() {
        return this.f9526h;
    }

    @Override // S2.c
    public boolean v(int i4) {
        return i4 == 2;
    }
}
