package u1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b0 extends k0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7186e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f7187f;

    public /* synthetic */ b0(int i, Object obj) {
        this.f7186e = i;
        this.f7187f = obj;
    }

    @Override // r2.c
    public final float b() {
        switch (this.f7186e) {
            case 0:
                return ((w1.n0) this.f7187f).b();
            default:
                return ((x1.t) this.f7187f).getDensity().b();
        }
    }

    @Override // u1.k0
    public float d(m mVar) {
        float intBitsToFloat;
        int P;
        switch (this.f7186e) {
            case 0:
                p6.e eVar = mVar.f7235a;
                if (eVar != null) {
                    return ((Number) eVar.g(this, Float.valueOf(Float.NaN))).floatValue();
                }
                w1.n0 n0Var = (w1.n0) this.f7187f;
                if (n0Var.f7730n) {
                    return Float.NaN;
                }
                w1.n0 n0Var2 = n0Var;
                while (true) {
                    l.n nVar = n0Var2.f7732p;
                    if (!Float.isNaN((nVar == null || (P = d6.l.P((m[]) nVar.f4349b, mVar)) < 0) ? Float.NaN : ((float[]) nVar.f4350c)[P])) {
                        n0Var2.Z(n0Var.l0(), mVar);
                        p j02 = n0Var2.j0();
                        p j03 = n0Var.j0();
                        switch (mVar.f7236b) {
                            case 0:
                                intBitsToFloat = Float.intBitsToFloat((int) (j03.F(j02, (Float.floatToRawIntBits(r3) & 4294967295L) | (Float.floatToRawIntBits(((int) (j02.G() >> 32)) / 2.0f) << 32)) & 4294967295L));
                                break;
                            default:
                                intBitsToFloat = Float.intBitsToFloat((int) (j03.F(j02, (Float.floatToRawIntBits(r3) << 32) | (Float.floatToRawIntBits(((int) (j02.G() & 4294967295L)) / 2.0f) & 4294967295L)) >> 32));
                                break;
                        }
                        return intBitsToFloat;
                    }
                    w1.n0 n02 = n0Var2.n0();
                    if (n02 == null) {
                        n0Var2.Z(n0Var.l0(), mVar);
                        return Float.NaN;
                    }
                    n0Var2 = n02;
                }
                break;
            default:
                return super.d(mVar);
        }
    }

    @Override // u1.k0
    public final r2.l e() {
        switch (this.f7186e) {
            case 0:
                return ((w1.n0) this.f7187f).getLayoutDirection();
            default:
                return ((x1.t) this.f7187f).getLayoutDirection();
        }
    }

    @Override // u1.k0
    public final int f() {
        switch (this.f7186e) {
            case 0:
                return ((w1.n0) this.f7187f).S();
            default:
                return ((x1.t) this.f7187f).getRoot().G.f7700p.f7230d;
        }
    }

    @Override // r2.c
    public final float i() {
        switch (this.f7186e) {
            case 0:
                return ((w1.n0) this.f7187f).i();
            default:
                return ((x1.t) this.f7187f).getDensity().i();
        }
    }
}
