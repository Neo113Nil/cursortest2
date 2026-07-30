package p1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final y0 f7097a;

    /* renamed from: b, reason: collision with root package name */
    public b0 f7098b;

    /* renamed from: c, reason: collision with root package name */
    public final u0 f7099c = new u0(this, 2);

    /* renamed from: d, reason: collision with root package name */
    public final u0 f7100d = new u0(this, 0);

    /* renamed from: e, reason: collision with root package name */
    public final u0 f7101e = new u0(this, 1);

    public v0(y0 y0Var) {
        this.f7097a = y0Var;
    }

    public final b0 a() {
        b0 b0Var = this.f7098b;
        if (b0Var != null) {
            return b0Var;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }
}
