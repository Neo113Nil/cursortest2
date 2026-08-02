package X;

import android.graphics.Rect;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f1121a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1122b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1123c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1124d;

    public b(Rect rect) {
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom;
        this.f1121a = i2;
        this.f1122b = i3;
        this.f1123c = i4;
        this.f1124d = i5;
        if (i2 > i4) {
            throw new IllegalArgumentException(("Left must be less than or equal to right, left: " + i2 + ", right: " + i4).toString());
        }
        if (i3 <= i5) {
            return;
        }
        throw new IllegalArgumentException(("top must be less than or equal to bottom, top: " + i3 + ", bottom: " + i5).toString());
    }

    public final int a() {
        return this.f1124d - this.f1122b;
    }

    public final int b() {
        return this.f1123c - this.f1121a;
    }

    public final Rect c() {
        return new Rect(this.f1121a, this.f1122b, this.f1123c, this.f1124d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!b.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Q0.h.c(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
        b bVar = (b) obj;
        return this.f1121a == bVar.f1121a && this.f1122b == bVar.f1122b && this.f1123c == bVar.f1123c && this.f1124d == bVar.f1124d;
    }

    public final int hashCode() {
        return (((((this.f1121a * 31) + this.f1122b) * 31) + this.f1123c) * 31) + this.f1124d;
    }

    public final String toString() {
        return b.class.getSimpleName() + " { [" + this.f1121a + ',' + this.f1122b + ',' + this.f1123c + ',' + this.f1124d + "] }";
    }
}
