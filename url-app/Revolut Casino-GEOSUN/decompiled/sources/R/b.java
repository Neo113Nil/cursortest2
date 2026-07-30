package R;

import android.graphics.Rect;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f869a;

    /* renamed from: b, reason: collision with root package name */
    public final int f870b;

    /* renamed from: c, reason: collision with root package name */
    public final int f871c;

    /* renamed from: d, reason: collision with root package name */
    public final int f872d;

    public b(Rect rect) {
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom;
        this.f869a = i2;
        this.f870b = i3;
        this.f871c = i4;
        this.f872d = i5;
        if (i2 > i4) {
            throw new IllegalArgumentException(("Left must be less than or equal to right, left: " + i2 + ", right: " + i4).toString());
        }
        if (i3 <= i5) {
            return;
        }
        throw new IllegalArgumentException(("top must be less than or equal to bottom, top: " + i3 + ", bottom: " + i5).toString());
    }

    public final int a() {
        return this.f872d - this.f870b;
    }

    public final int b() {
        return this.f871c - this.f869a;
    }

    public final Rect c() {
        return new Rect(this.f869a, this.f870b, this.f871c, this.f872d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!b.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        F0.i.c(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
        b bVar = (b) obj;
        return this.f869a == bVar.f869a && this.f870b == bVar.f870b && this.f871c == bVar.f871c && this.f872d == bVar.f872d;
    }

    public final int hashCode() {
        return (((((this.f869a * 31) + this.f870b) * 31) + this.f871c) * 31) + this.f872d;
    }

    public final String toString() {
        return b.class.getSimpleName() + " { [" + this.f869a + ',' + this.f870b + ',' + this.f871c + ',' + this.f872d + "] }";
    }
}
