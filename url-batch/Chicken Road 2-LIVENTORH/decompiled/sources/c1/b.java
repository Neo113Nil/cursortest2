package c1;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f757a;

    /* renamed from: b, reason: collision with root package name */
    public final float f758b;

    /* renamed from: c, reason: collision with root package name */
    public final float f759c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final long f760e;

    public b(int i, float f2, float f4, float f5, long j4) {
        this.f757a = i;
        this.f758b = f2;
        this.f759c = f4;
        this.d = f5;
        this.f760e = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            return this.f759c == bVar.f759c && this.d == bVar.d && this.f758b == bVar.f758b && this.f757a == bVar.f757a && this.f760e == bVar.f760e;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f760e) + ((Integer.hashCode(this.f757a) + ((Float.hashCode(this.f758b) + ((Float.hashCode(this.d) + (Float.hashCode(this.f759c) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "NavigationEvent(touchX=" + this.f759c + ", touchY=" + this.d + ", progress=" + this.f758b + ", swipeEdge=" + this.f757a + ", frameTimeMillis=" + this.f760e + ')';
    }
}
