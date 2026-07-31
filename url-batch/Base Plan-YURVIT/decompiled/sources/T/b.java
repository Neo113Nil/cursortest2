package T;

import android.graphics.Rect;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f831a;

    /* renamed from: b, reason: collision with root package name */
    public final int f832b;

    /* renamed from: c, reason: collision with root package name */
    public final int f833c;

    /* renamed from: d, reason: collision with root package name */
    public final int f834d;

    public b(Rect rect) {
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom;
        this.f831a = i2;
        this.f832b = i3;
        this.f833c = i4;
        this.f834d = i5;
        if (i2 > i4) {
            throw new IllegalArgumentException(L.d.f("Left must be less than or equal to right, left: ", i2, ", right: ", i4).toString());
        }
        if (i3 > i5) {
            throw new IllegalArgumentException(L.d.f("top must be less than or equal to bottom, top: ", i3, ", bottom: ", i5).toString());
        }
    }

    public final Rect a() {
        return new Rect(this.f831a, this.f832b, this.f833c, this.f834d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!b.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        P0.h.c(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
        b bVar = (b) obj;
        return this.f831a == bVar.f831a && this.f832b == bVar.f832b && this.f833c == bVar.f833c && this.f834d == bVar.f834d;
    }

    public final int hashCode() {
        return (((((this.f831a * 31) + this.f832b) * 31) + this.f833c) * 31) + this.f834d;
    }

    public final String toString() {
        return b.class.getSimpleName() + " { [" + this.f831a + ',' + this.f832b + ',' + this.f833c + ',' + this.f834d + "] }";
    }
}
