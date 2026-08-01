package C;

import android.graphics.Insets;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c f55e = new c(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f56a;

    /* renamed from: b, reason: collision with root package name */
    public final int f57b;

    /* renamed from: c, reason: collision with root package name */
    public final int f58c;
    public final int d;

    public c(int i, int i2, int i3, int i4) {
        this.f56a = i;
        this.f57b = i2;
        this.f58c = i3;
        this.d = i4;
    }

    public static c a(c cVar, c cVar2) {
        return b(Math.max(cVar.f56a, cVar2.f56a), Math.max(cVar.f57b, cVar2.f57b), Math.max(cVar.f58c, cVar2.f58c), Math.max(cVar.d, cVar2.d));
    }

    public static c b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f55e : new c(i, i2, i3, i4);
    }

    public static c c(Insets insets) {
        int i;
        int i2;
        int i3;
        int i4;
        i = insets.left;
        i2 = insets.top;
        i3 = insets.right;
        i4 = insets.bottom;
        return b(i, i2, i3, i4);
    }

    public final Insets d() {
        return b.a(this.f56a, this.f57b, this.f58c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.d == cVar.d && this.f56a == cVar.f56a && this.f58c == cVar.f58c && this.f57b == cVar.f57b;
    }

    public final int hashCode() {
        return (((((this.f56a * 31) + this.f57b) * 31) + this.f58c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f56a + ", top=" + this.f57b + ", right=" + this.f58c + ", bottom=" + this.d + '}';
    }
}
