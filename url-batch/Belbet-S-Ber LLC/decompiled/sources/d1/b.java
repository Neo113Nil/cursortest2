package d1;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f1279a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1280b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1281c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final long f1282e;

    public b(int i, float f5, float f6, float f7, long j2) {
        this.f1279a = i;
        this.f1280b = f5;
        this.f1281c = f6;
        this.d = f7;
        this.f1282e = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            return this.f1281c == bVar.f1281c && this.d == bVar.d && this.f1280b == bVar.f1280b && this.f1279a == bVar.f1279a && this.f1282e == bVar.f1282e;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f1282e) + ((Integer.hashCode(this.f1279a) + ((Float.hashCode(this.f1280b) + ((Float.hashCode(this.d) + (Float.hashCode(this.f1281c) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "NavigationEvent(touchX=" + this.f1281c + ", touchY=" + this.d + ", progress=" + this.f1280b + ", swipeEdge=" + this.f1279a + ", frameTimeMillis=" + this.f1282e + ')';
    }
}
