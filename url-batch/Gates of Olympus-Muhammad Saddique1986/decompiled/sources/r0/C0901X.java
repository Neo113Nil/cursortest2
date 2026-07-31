package r0;

/* renamed from: r0.X, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0901X {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f8142a;

    /* renamed from: b, reason: collision with root package name */
    public C0881C f8143b;

    /* renamed from: c, reason: collision with root package name */
    public final C0900W f8144c = new C0900W(this, 2);

    /* renamed from: d, reason: collision with root package name */
    public final C0900W f8145d = new C0900W(this, 0);

    /* renamed from: e, reason: collision with root package name */
    public final C0900W f8146e = new C0900W(this, 1);

    public C0901X(a0 a0Var) {
        this.f8142a = a0Var;
    }

    public final C0881C a() {
        C0881C c0881c = this.f8143b;
        if (c0881c != null) {
            return c0881c;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }
}
