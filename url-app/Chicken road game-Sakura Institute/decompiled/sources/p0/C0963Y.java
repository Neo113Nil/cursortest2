package p0;

/* renamed from: p0.Y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0963Y {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f9026a;

    /* renamed from: b, reason: collision with root package name */
    public C0941B f9027b;

    /* renamed from: c, reason: collision with root package name */
    public final C0962X f9028c = new C0962X(this, 2);

    /* renamed from: d, reason: collision with root package name */
    public final C0962X f9029d = new C0962X(this, 0);

    /* renamed from: e, reason: collision with root package name */
    public final C0962X f9030e = new C0962X(this, 1);

    public C0963Y(b0 b0Var) {
        this.f9026a = b0Var;
    }

    public final C0941B a() {
        C0941B c0941b = this.f9027b;
        if (c0941b != null) {
            return c0941b;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }
}
