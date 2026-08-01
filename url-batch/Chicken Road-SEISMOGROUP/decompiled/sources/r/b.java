package r;

import android.graphics.Rect;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f1233a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1234b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1235c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1236d;

    public b(Rect rect) {
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom;
        this.f1233a = i2;
        this.f1234b = i3;
        this.f1235c = i4;
        this.f1236d = i5;
        if (i2 > i4) {
            throw new IllegalArgumentException(("Left must be less than or equal to right, left: " + i2 + ", right: " + i4).toString());
        }
        if (i3 <= i5) {
            return;
        }
        throw new IllegalArgumentException(("top must be less than or equal to bottom, top: " + i3 + ", bottom: " + i5).toString());
    }

    public final int a() {
        return this.f1236d - this.f1234b;
    }

    public final int b() {
        return this.f1235c - this.f1233a;
    }

    public final Rect c() {
        return new Rect(this.f1233a, this.f1234b, this.f1235c, this.f1236d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!b.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        e0.h.c(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
        b bVar = (b) obj;
        return this.f1233a == bVar.f1233a && this.f1234b == bVar.f1234b && this.f1235c == bVar.f1235c && this.f1236d == bVar.f1236d;
    }

    public final int hashCode() {
        return (((((this.f1233a * 31) + this.f1234b) * 31) + this.f1235c) * 31) + this.f1236d;
    }

    public final String toString() {
        return b.class.getSimpleName() + " { [" + this.f1233a + ',' + this.f1234b + ',' + this.f1235c + ',' + this.f1236d + "] }";
    }
}
