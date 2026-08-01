package s4;

import n0.l;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f8413a;

    /* renamed from: b, reason: collision with root package name */
    public final float f8414b;

    /* renamed from: c, reason: collision with root package name */
    public final float f8415c;

    /* renamed from: d, reason: collision with root package name */
    public final float f8416d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8417e;

    public b(int i3, float f3, float f10, float f11, long j) {
        this.f8413a = i3;
        this.f8414b = f3;
        this.f8415c = f10;
        this.f8416d = f11;
        this.f8417e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            return this.f8415c == bVar.f8415c && this.f8416d == bVar.f8416d && this.f8414b == bVar.f8414b && this.f8413a == bVar.f8413a && this.f8417e == bVar.f8417e;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f8417e) + v4.a.x(this.f8413a, l.b(this.f8414b, l.b(this.f8416d, Float.hashCode(this.f8415c) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "NavigationEvent(touchX=" + this.f8415c + ", touchY=" + this.f8416d + ", progress=" + this.f8414b + ", swipeEdge=" + this.f8413a + ", frameTimeMillis=" + this.f8417e + ')';
    }
}
