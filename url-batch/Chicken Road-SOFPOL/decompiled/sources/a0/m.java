package a0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements p6.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f114d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u1.l0 f115e;

    public /* synthetic */ m(u1.l0 l0Var, int i) {
        this.f114d = i;
        this.f115e = l0Var;
    }

    @Override // p6.c
    public final Object i(Object obj) {
        u1.k0 k0Var = (u1.k0) obj;
        switch (this.f114d) {
            case 0:
                u1.k0.g(k0Var, this.f115e, 0, 0);
                break;
            case 1:
                u1.k0.g(k0Var, this.f115e, 0, 0);
                break;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                u1.k0.g(k0Var, this.f115e, 0, 0);
                break;
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                u1.k0.k(k0Var, this.f115e, 0, 0);
                break;
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                u1.k0.k(k0Var, this.f115e, 0, 0);
                break;
            default:
                u1.k0.k(k0Var, this.f115e, 0, 0);
                break;
        }
        return c6.m.f1757a;
    }
}
