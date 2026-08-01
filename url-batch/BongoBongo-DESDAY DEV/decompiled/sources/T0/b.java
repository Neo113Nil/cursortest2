package T0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f833a;

    /* renamed from: b, reason: collision with root package name */
    public final int f834b;

    /* renamed from: c, reason: collision with root package name */
    public final int f835c;
    public final boolean d;

    public b(int i, int i2, int i3, boolean z2) {
        this.f833a = i;
        this.f834b = i2;
        this.f835c = i3;
        this.d = z2;
    }

    public final b a() {
        int i = this.f833a;
        int i2 = this.f834b;
        int i3 = i > i2 ? i2 : i;
        if (i2 >= i) {
            i = i2;
        }
        int i4 = this.f835c;
        if (i4 < 1) {
            i4 = 1;
        }
        return new b(i3, i, i4, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f833a == bVar.f833a && this.f834b == bVar.f834b && this.f835c == bVar.f835c && this.d == bVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((Integer.hashCode(this.f835c) + ((Integer.hashCode(this.f834b) + (Integer.hashCode(this.f833a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RandomConfig(min=" + this.f833a + ", max=" + this.f834b + ", count=" + this.f835c + ", unique=" + this.d + ")";
    }
}
