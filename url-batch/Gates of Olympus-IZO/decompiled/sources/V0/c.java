package V0;

import H2.AbstractC0080b;
import android.graphics.Insets;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c f3348e = new c(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f3349a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3350b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3351c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3352d;

    public c(int i3, int i4, int i5, int i6) {
        this.f3349a = i3;
        this.f3350b = i4;
        this.f3351c = i5;
        this.f3352d = i6;
    }

    public static c a(c cVar, c cVar2) {
        return b(Math.max(cVar.f3349a, cVar2.f3349a), Math.max(cVar.f3350b, cVar2.f3350b), Math.max(cVar.f3351c, cVar2.f3351c), Math.max(cVar.f3352d, cVar2.f3352d));
    }

    public static c b(int i3, int i4, int i5, int i6) {
        return (i3 == 0 && i4 == 0 && i5 == 0 && i6 == 0) ? f3348e : new c(i3, i4, i5, i6);
    }

    public static c c(Insets insets) {
        int i3;
        int i4;
        int i5;
        int i6;
        i3 = insets.left;
        i4 = insets.top;
        i5 = insets.right;
        i6 = insets.bottom;
        return b(i3, i4, i5, i6);
    }

    public final Insets d() {
        return b.a(this.f3349a, this.f3350b, this.f3351c, this.f3352d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f3352d == cVar.f3352d && this.f3349a == cVar.f3349a && this.f3351c == cVar.f3351c && this.f3350b == cVar.f3350b;
    }

    public final int hashCode() {
        return (((((this.f3349a * 31) + this.f3350b) * 31) + this.f3351c) * 31) + this.f3352d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.f3349a);
        sb.append(", top=");
        sb.append(this.f3350b);
        sb.append(", right=");
        sb.append(this.f3351c);
        sb.append(", bottom=");
        return AbstractC0080b.k(sb, this.f3352d, '}');
    }
}
