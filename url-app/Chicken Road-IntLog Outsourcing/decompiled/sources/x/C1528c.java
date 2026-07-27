package x;

import B0.o;
import android.graphics.Insets;

/* renamed from: x.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1528c {

    /* renamed from: e, reason: collision with root package name */
    public static final C1528c f12231e = new C1528c(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f12232a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12233b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12234c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12235d;

    public C1528c(int i2, int i3, int i6, int i7) {
        this.f12232a = i2;
        this.f12233b = i3;
        this.f12234c = i6;
        this.f12235d = i7;
    }

    public static C1528c a(int i2, int i3, int i6, int i7) {
        return (i2 == 0 && i3 == 0 && i6 == 0 && i7 == 0) ? f12231e : new C1528c(i2, i3, i6, i7);
    }

    public static C1528c b(Insets insets) {
        int i2;
        int i3;
        int i6;
        int i7;
        i2 = insets.left;
        i3 = insets.top;
        i6 = insets.right;
        i7 = insets.bottom;
        return a(i2, i3, i6, i7);
    }

    public final Insets c() {
        return AbstractC1527b.a(this.f12232a, this.f12233b, this.f12234c, this.f12235d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1528c.class != obj.getClass()) {
            return false;
        }
        C1528c c1528c = (C1528c) obj;
        return this.f12235d == c1528c.f12235d && this.f12232a == c1528c.f12232a && this.f12234c == c1528c.f12234c && this.f12233b == c1528c.f12233b;
    }

    public final int hashCode() {
        return (((((this.f12232a * 31) + this.f12233b) * 31) + this.f12234c) * 31) + this.f12235d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.f12232a);
        sb.append(", top=");
        sb.append(this.f12233b);
        sb.append(", right=");
        sb.append(this.f12234c);
        sb.append(", bottom=");
        return o.k(sb, this.f12235d, '}');
    }
}
