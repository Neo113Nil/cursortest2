package u1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final y0 f7293a;

    /* renamed from: b, reason: collision with root package name */
    public a0 f7294b;

    /* renamed from: c, reason: collision with root package name */
    public final v0 f7295c = new v0(this, 2);

    /* renamed from: d, reason: collision with root package name */
    public final v0 f7296d = new v0(this, 0);

    /* renamed from: e, reason: collision with root package name */
    public final v0 f7297e = new v0(this, 1);

    public w0(y0 y0Var) {
        this.f7293a = y0Var;
    }

    public final a0 a() {
        a0 a0Var = this.f7294b;
        if (a0Var != null) {
            return a0Var;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }
}
