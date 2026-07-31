package r;

/* renamed from: r.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0853O {

    /* renamed from: a, reason: collision with root package name */
    public float f7984a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7985b = true;

    /* renamed from: c, reason: collision with root package name */
    public C0876x f7986c = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0853O)) {
            return false;
        }
        C0853O c0853o = (C0853O) obj;
        return Float.compare(this.f7984a, c0853o.f7984a) == 0 && this.f7985b == c0853o.f7985b && f2.j.a(this.f7986c, c0853o.f7986c) && f2.j.a(null, null);
    }

    public final int hashCode() {
        int e3 = A.k.e(Float.hashCode(this.f7984a) * 31, 31, this.f7985b);
        C0876x c0876x = this.f7986c;
        return (e3 + (c0876x == null ? 0 : c0876x.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.f7984a + ", fill=" + this.f7985b + ", crossAxisAlignment=" + this.f7986c + ", flowLayoutData=null)";
    }
}
