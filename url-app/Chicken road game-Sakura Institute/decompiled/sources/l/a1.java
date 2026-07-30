package l;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a1 implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f5401a;

    /* renamed from: b, reason: collision with root package name */
    public final float f5402b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f5403c;

    public a1(float f9, float f10, Object obj) {
        this.f5401a = f9;
        this.f5402b = f10;
        this.f5403c = obj;
    }

    @Override // l.k
    public final y1 a(w1 w1Var) {
        Object obj = this.f5403c;
        return new b6.c(this.f5401a, this.f5402b, obj == null ? null : (q) w1Var.f5702a.f(obj));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a1) {
            a1 a1Var = (a1) obj;
            if (a1Var.f5401a == this.f5401a && a1Var.f5402b == this.f5402b && r6.k.a(a1Var.f5403c, this.f5403c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f5403c;
        return Float.hashCode(this.f5402b) + a0.m.a(this.f5401a, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }

    public /* synthetic */ a1(Object obj) {
        this(1.0f, 1500.0f, obj);
    }
}
