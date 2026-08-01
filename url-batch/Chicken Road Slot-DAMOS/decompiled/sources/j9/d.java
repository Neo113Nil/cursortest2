package j9;

import n0.l;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f5121a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5122b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5123c;

    /* renamed from: d, reason: collision with root package name */
    public final float f5124d;

    /* renamed from: e, reason: collision with root package name */
    public final float f5125e;

    public d(float f3, float f10, int i3, int i10, int i11) {
        this.f5121a = i3;
        this.f5122b = i10;
        this.f5123c = i11;
        this.f5124d = f3;
        this.f5125e = f10;
    }

    public static d a(d dVar, float f3) {
        return new d(f3, dVar.f5125e, dVar.f5121a, dVar.f5122b, dVar.f5123c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f5121a == dVar.f5121a && this.f5122b == dVar.f5122b && this.f5123c == dVar.f5123c && Float.compare(this.f5124d, dVar.f5124d) == 0 && Float.compare(this.f5125e, dVar.f5125e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5125e) + l.b(this.f5124d, v4.a.x(this.f5123c, v4.a.x(this.f5122b, Integer.hashCode(this.f5121a) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "WheelGuard(id=" + this.f5121a + ", imageRes=" + this.f5122b + ", lane=" + this.f5123c + ", y=" + this.f5124d + ", speed=" + this.f5125e + ")";
    }
}
