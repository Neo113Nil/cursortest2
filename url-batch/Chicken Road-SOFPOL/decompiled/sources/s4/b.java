package s4;

import a0.q;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f6700a;

    /* renamed from: b, reason: collision with root package name */
    public final float f6701b;

    /* renamed from: c, reason: collision with root package name */
    public final float f6702c;

    /* renamed from: d, reason: collision with root package name */
    public final float f6703d;

    /* renamed from: e, reason: collision with root package name */
    public final long f6704e;

    public b(int i, float f6, float f8, float f9, long j7) {
        this.f6700a = i;
        this.f6701b = f6;
        this.f6702c = f8;
        this.f6703d = f9;
        this.f6704e = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            return this.f6702c == bVar.f6702c && this.f6703d == bVar.f6703d && this.f6701b == bVar.f6701b && this.f6700a == bVar.f6700a && this.f6704e == bVar.f6704e;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6704e) + q.b(this.f6700a, q.a(this.f6701b, q.a(this.f6703d, Float.hashCode(this.f6702c) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "NavigationEvent(touchX=" + this.f6702c + ", touchY=" + this.f6703d + ", progress=" + this.f6701b + ", swipeEdge=" + this.f6700a + ", frameTimeMillis=" + this.f6704e + ')';
    }
}
