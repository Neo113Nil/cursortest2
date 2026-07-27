package j0;

import B0.o;
import android.graphics.Rect;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f10441a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10442b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10443c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10444d;

    public b(Rect rect) {
        int i2 = rect.left;
        int i3 = rect.top;
        int i6 = rect.right;
        int i7 = rect.bottom;
        this.f10441a = i2;
        this.f10442b = i3;
        this.f10443c = i6;
        this.f10444d = i7;
        if (i2 > i6) {
            throw new IllegalArgumentException(o.h("Left must be less than or equal to right, left: ", i2, i6, ", right: ").toString());
        }
        if (i3 > i7) {
            throw new IllegalArgumentException(o.h("top must be less than or equal to bottom, top: ", i3, i7, ", bottom: ").toString());
        }
    }

    public final int a() {
        return this.f10444d - this.f10442b;
    }

    public final int b() {
        return this.f10443c - this.f10441a;
    }

    public final Rect c() {
        return new Rect(this.f10441a, this.f10442b, this.f10443c, this.f10444d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!b.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
        b bVar = (b) obj;
        return this.f10441a == bVar.f10441a && this.f10442b == bVar.f10442b && this.f10443c == bVar.f10443c && this.f10444d == bVar.f10444d;
    }

    public final int hashCode() {
        return (((((this.f10441a * 31) + this.f10442b) * 31) + this.f10443c) * 31) + this.f10444d;
    }

    public final String toString() {
        return b.class.getSimpleName() + " { [" + this.f10441a + ',' + this.f10442b + ',' + this.f10443c + ',' + this.f10444d + "] }";
    }
}
