package d0;

import E1.AbstractC0033i;
import android.graphics.Rect;
import kotlin.jvm.internal.j;

/* renamed from: d0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0295b {

    /* renamed from: a, reason: collision with root package name */
    public final int f4909a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4910b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4911c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4912d;

    public C0295b(Rect rect) {
        int i3 = rect.left;
        int i4 = rect.top;
        int i5 = rect.right;
        int i6 = rect.bottom;
        this.f4909a = i3;
        this.f4910b = i4;
        this.f4911c = i5;
        this.f4912d = i6;
        if (i3 > i5) {
            throw new IllegalArgumentException(AbstractC0033i.g(i3, i5, "Left must be less than or equal to right, left: ", ", right: ").toString());
        }
        if (i4 > i6) {
            throw new IllegalArgumentException(AbstractC0033i.g(i4, i6, "top must be less than or equal to bottom, top: ", ", bottom: ").toString());
        }
    }

    public final Rect a() {
        return new Rect(this.f4909a, this.f4910b, this.f4911c, this.f4912d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0295b.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        j.c(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
        C0295b c0295b = (C0295b) obj;
        return this.f4909a == c0295b.f4909a && this.f4910b == c0295b.f4910b && this.f4911c == c0295b.f4911c && this.f4912d == c0295b.f4912d;
    }

    public final int hashCode() {
        return (((((this.f4909a * 31) + this.f4910b) * 31) + this.f4911c) * 31) + this.f4912d;
    }

    public final String toString() {
        return C0295b.class.getSimpleName() + " { [" + this.f4909a + ',' + this.f4910b + ',' + this.f4911c + ',' + this.f4912d + "] }";
    }
}
