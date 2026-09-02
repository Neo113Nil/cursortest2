package s;

import android.graphics.Rect;

/* renamed from: s.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0094b {

    /* renamed from: a, reason: collision with root package name */
    public final int f1236a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1237b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1238c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1239d;

    public C0094b(Rect rect) {
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom;
        this.f1236a = i2;
        this.f1237b = i3;
        this.f1238c = i4;
        this.f1239d = i5;
        if (i2 > i4) {
            throw new IllegalArgumentException(("Left must be less than or equal to right, left: " + i2 + ", right: " + i4).toString());
        }
        if (i3 <= i5) {
            return;
        }
        throw new IllegalArgumentException(("top must be less than or equal to bottom, top: " + i3 + ", bottom: " + i5).toString());
    }

    public final int a() {
        return this.f1239d - this.f1237b;
    }

    public final int b() {
        return this.f1238c - this.f1236a;
    }

    public final Rect c() {
        return new Rect(this.f1236a, this.f1237b, this.f1238c, this.f1239d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0094b.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        e0.h.c(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
        C0094b c0094b = (C0094b) obj;
        return this.f1236a == c0094b.f1236a && this.f1237b == c0094b.f1237b && this.f1238c == c0094b.f1238c && this.f1239d == c0094b.f1239d;
    }

    public final int hashCode() {
        return (((((this.f1236a * 31) + this.f1237b) * 31) + this.f1238c) * 31) + this.f1239d;
    }

    public final String toString() {
        return C0094b.class.getSimpleName() + " { [" + this.f1236a + ',' + this.f1237b + ',' + this.f1238c + ',' + this.f1239d + "] }";
    }
}
