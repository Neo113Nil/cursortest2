package c0;

import android.graphics.Insets;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c f977e = new c(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f978a;

    /* renamed from: b, reason: collision with root package name */
    public final int f979b;
    public final int c;

    /* renamed from: d, reason: collision with root package name */
    public final int f980d;

    public c(int i4, int i5, int i6, int i7) {
        this.f978a = i4;
        this.f979b = i5;
        this.c = i6;
        this.f980d = i7;
    }

    public static c a(c cVar, c cVar2) {
        return c(Math.max(cVar.f978a, cVar2.f978a), Math.max(cVar.f979b, cVar2.f979b), Math.max(cVar.c, cVar2.c), Math.max(cVar.f980d, cVar2.f980d));
    }

    public static c b(c cVar, c cVar2) {
        return c(Math.min(cVar.f978a, cVar2.f978a), Math.min(cVar.f979b, cVar2.f979b), Math.min(cVar.c, cVar2.c), Math.min(cVar.f980d, cVar2.f980d));
    }

    public static c c(int i4, int i5, int i6, int i7) {
        return (i4 == 0 && i5 == 0 && i6 == 0 && i7 == 0) ? f977e : new c(i4, i5, i6, i7);
    }

    public static c d(Insets insets) {
        int i4;
        int i5;
        int i6;
        int i7;
        i4 = insets.left;
        i5 = insets.top;
        i6 = insets.right;
        i7 = insets.bottom;
        return c(i4, i5, i6, i7);
    }

    public final Insets e() {
        return b.a(this.f978a, this.f979b, this.c, this.f980d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f980d == cVar.f980d && this.f978a == cVar.f978a && this.c == cVar.c && this.f979b == cVar.f979b;
    }

    public final int hashCode() {
        return (((((this.f978a * 31) + this.f979b) * 31) + this.c) * 31) + this.f980d;
    }

    public final String toString() {
        return "Insets{left=" + this.f978a + ", top=" + this.f979b + ", right=" + this.c + ", bottom=" + this.f980d + '}';
    }
}
