package r;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class u0 implements v {

    /* renamed from: a, reason: collision with root package name */
    public final float f6439a;

    /* renamed from: b, reason: collision with root package name */
    public final float f6440b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f6441c;

    public u0(float f6, float f8, Object obj) {
        this.f6439a = f6;
        this.f6440b = f8;
        this.f6441c = obj;
    }

    @Override // r.j
    public final t1 a(r1 r1Var) {
        Object obj = this.f6441c;
        return new q3.k(this.f6439a, this.f6440b, obj == null ? null : (p) r1Var.f6413a.i(obj));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u0) {
            u0 u0Var = (u0) obj;
            if (u0Var.f6439a == this.f6439a && u0Var.f6440b == this.f6440b && q6.i.a(u0Var.f6441c, this.f6441c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f6441c;
        return Float.hashCode(this.f6440b) + a0.q.a(this.f6439a, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }
}
