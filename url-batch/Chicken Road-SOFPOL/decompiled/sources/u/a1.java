package u;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a1 implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e1 f6929a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c1 f6930b;

    public a1(e1 e1Var, c1 c1Var) {
        this.f6929a = e1Var;
        this.f6930b = c1Var;
    }

    @Override // u.l0
    public final float a(float f6) {
        e1 e1Var = this.f6929a;
        boolean booleanValue = ((Boolean) e1Var.f6969h.b()).booleanValue();
        if (Math.abs(f6) != 0.0f && !booleanValue) {
            throw new t.k0("The fling animation was cancelled", 2);
        }
        return e1Var.d(e1Var.g(this.f6930b.a(2, e1Var.e(e1Var.h(f6)))));
    }
}
