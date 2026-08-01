package C;

import android.graphics.Insets;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c f58e = new c(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f59a;

    /* renamed from: b, reason: collision with root package name */
    public final int f60b;

    /* renamed from: c, reason: collision with root package name */
    public final int f61c;
    public final int d;

    public c(int i, int i2, int i3, int i4) {
        this.f59a = i;
        this.f60b = i2;
        this.f61c = i3;
        this.d = i4;
    }

    public static c a(c cVar, c cVar2) {
        return b(Math.max(cVar.f59a, cVar2.f59a), Math.max(cVar.f60b, cVar2.f60b), Math.max(cVar.f61c, cVar2.f61c), Math.max(cVar.d, cVar2.d));
    }

    public static c b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f58e : new c(i, i2, i3, i4);
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
        return b.a(this.f59a, this.f60b, this.f61c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.d == cVar.d && this.f59a == cVar.f59a && this.f61c == cVar.f61c && this.f60b == cVar.f60b;
    }

    public final int hashCode() {
        return (((((this.f59a * 31) + this.f60b) * 31) + this.f61c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f59a + ", top=" + this.f60b + ", right=" + this.f61c + ", bottom=" + this.d + '}';
    }
}
