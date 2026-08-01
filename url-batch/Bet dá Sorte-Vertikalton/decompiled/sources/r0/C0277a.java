package r0;

/* renamed from: r0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0277a {

    /* renamed from: a, reason: collision with root package name */
    public float f3566a;

    /* renamed from: b, reason: collision with root package name */
    public float f3567b;

    /* renamed from: c, reason: collision with root package name */
    public float f3568c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f3569e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0277a)) {
            return false;
        }
        C0277a c0277a = (C0277a) obj;
        return Float.compare(this.f3566a, c0277a.f3566a) == 0 && Float.compare(this.f3567b, c0277a.f3567b) == 0 && Float.compare(this.f3568c, c0277a.f3568c) == 0 && Float.compare(this.d, c0277a.d) == 0 && Float.compare(this.f3569e, c0277a.f3569e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3569e) + ((Float.hashCode(this.d) + ((Float.hashCode(this.f3568c) + ((Float.hashCode(this.f3567b) + (Float.hashCode(this.f3566a) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Bubble(x=" + this.f3566a + ", y=" + this.f3567b + ", radius=" + this.f3568c + ", speed=" + this.d + ", alpha=" + this.f3569e + ")";
    }
}
