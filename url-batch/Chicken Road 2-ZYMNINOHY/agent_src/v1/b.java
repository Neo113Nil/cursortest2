package v1;

import E.AbstractC0005f;
import android.graphics.Rect;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f15536a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15537b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15538c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15539d;

    public b(Rect rect) {
        int i4 = rect.left;
        int i5 = rect.top;
        int i6 = rect.right;
        int i7 = rect.bottom;
        this.f15536a = i4;
        this.f15537b = i5;
        this.f15538c = i6;
        this.f15539d = i7;
        if (i4 > i6) {
            throw new IllegalArgumentException(AbstractC0005f.i(i4, i6, "Left must be less than or equal to right, left: ", ", right: ").toString());
        }
        if (i5 > i7) {
            throw new IllegalArgumentException(AbstractC0005f.i(i5, i7, "top must be less than or equal to bottom, top: ", ", bottom: ").toString());
        }
    }

    public final Rect a() {
        return new Rect(this.f15536a, this.f15537b, this.f15538c, this.f15539d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!b.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        i.c(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
        b bVar = (b) obj;
        return this.f15536a == bVar.f15536a && this.f15537b == bVar.f15537b && this.f15538c == bVar.f15538c && this.f15539d == bVar.f15539d;
    }

    public final int hashCode() {
        return (((((this.f15536a * 31) + this.f15537b) * 31) + this.f15538c) * 31) + this.f15539d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(b.class.getSimpleName());
        sb.append(" { [");
        sb.append(this.f15536a);
        sb.append(',');
        sb.append(this.f15537b);
        sb.append(',');
        sb.append(this.f15538c);
        sb.append(',');
        return AbstractC0005f.o(sb, this.f15539d, "] }");
    }
}
