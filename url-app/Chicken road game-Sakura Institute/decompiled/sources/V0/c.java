package V0;

import A.AbstractC0017m;
import android.graphics.Insets;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c f4142e = new c(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f4143a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4144b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4145c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4146d;

    public c(int i2, int i4, int i5, int i6) {
        this.f4143a = i2;
        this.f4144b = i4;
        this.f4145c = i5;
        this.f4146d = i6;
    }

    public static c a(c cVar, c cVar2) {
        return b(Math.max(cVar.f4143a, cVar2.f4143a), Math.max(cVar.f4144b, cVar2.f4144b), Math.max(cVar.f4145c, cVar2.f4145c), Math.max(cVar.f4146d, cVar2.f4146d));
    }

    public static c b(int i2, int i4, int i5, int i6) {
        return (i2 == 0 && i4 == 0 && i5 == 0 && i6 == 0) ? f4142e : new c(i2, i4, i5, i6);
    }

    public static c c(Insets insets) {
        int i2;
        int i4;
        int i5;
        int i6;
        i2 = insets.left;
        i4 = insets.top;
        i5 = insets.right;
        i6 = insets.bottom;
        return b(i2, i4, i5, i6);
    }

    public final Insets d() {
        return b.a(this.f4143a, this.f4144b, this.f4145c, this.f4146d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f4146d == cVar.f4146d && this.f4143a == cVar.f4143a && this.f4145c == cVar.f4145c && this.f4144b == cVar.f4144b;
    }

    public final int hashCode() {
        return (((((this.f4143a * 31) + this.f4144b) * 31) + this.f4145c) * 31) + this.f4146d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.f4143a);
        sb.append(", top=");
        sb.append(this.f4144b);
        sb.append(", right=");
        sb.append(this.f4145c);
        sb.append(", bottom=");
        return AbstractC0017m.l(sb, this.f4146d, '}');
    }
}
