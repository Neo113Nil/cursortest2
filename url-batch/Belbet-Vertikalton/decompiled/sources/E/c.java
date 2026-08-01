package E;

import android.graphics.Insets;

/* loaded from: classes.dex */
public final class c {
    public static final c e = new c(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f279a;

    /* renamed from: b, reason: collision with root package name */
    public final int f280b;

    /* renamed from: c, reason: collision with root package name */
    public final int f281c;

    /* renamed from: d, reason: collision with root package name */
    public final int f282d;

    public c(int i, int i2, int i3, int i4) {
        this.f279a = i;
        this.f280b = i2;
        this.f281c = i3;
        this.f282d = i4;
    }

    public static c a(c cVar, c cVar2) {
        return b(Math.max(cVar.f279a, cVar2.f279a), Math.max(cVar.f280b, cVar2.f280b), Math.max(cVar.f281c, cVar2.f281c), Math.max(cVar.f282d, cVar2.f282d));
    }

    public static c b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new c(i, i2, i3, i4);
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
        return b.a(this.f279a, this.f280b, this.f281c, this.f282d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f282d == cVar.f282d && this.f279a == cVar.f279a && this.f281c == cVar.f281c && this.f280b == cVar.f280b;
    }

    public final int hashCode() {
        return (((((this.f279a * 31) + this.f280b) * 31) + this.f281c) * 31) + this.f282d;
    }

    public final String toString() {
        return "Insets{left=" + this.f279a + ", top=" + this.f280b + ", right=" + this.f281c + ", bottom=" + this.f282d + '}';
    }
}
