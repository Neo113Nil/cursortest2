package x;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public float f8229a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8230b = true;

    /* renamed from: c, reason: collision with root package name */
    public t f8231c = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return Float.compare(this.f8229a, j0Var.f8229a) == 0 && this.f8230b == j0Var.f8230b && q6.i.a(this.f8231c, j0Var.f8231c);
    }

    public final int hashCode() {
        int d8 = a0.q.d(Float.hashCode(this.f8229a) * 31, 31, this.f8230b);
        t tVar = this.f8231c;
        return (d8 + (tVar == null ? 0 : tVar.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.f8229a + ", fill=" + this.f8230b + ", crossAxisAlignment=" + this.f8231c + ", flowLayoutData=null)";
    }
}
