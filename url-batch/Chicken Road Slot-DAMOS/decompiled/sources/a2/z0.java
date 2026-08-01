package a2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public c0 f187a;

    /* renamed from: b, reason: collision with root package name */
    public final y0 f188b = new y0(this, 2);

    /* renamed from: c, reason: collision with root package name */
    public final y0 f189c = new y0(this, 0);

    /* renamed from: d, reason: collision with root package name */
    public final y0 f190d = new y0(this, 1);

    public final c0 a() {
        c0 c0Var = this.f187a;
        if (c0Var != null) {
            return c0Var;
        }
        te.a1.e("SubcomposeLayoutState is not attached to SubcomposeLayout");
        return null;
    }
}
