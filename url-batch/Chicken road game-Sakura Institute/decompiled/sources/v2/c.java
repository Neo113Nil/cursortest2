package v2;

import a0.m;
import android.graphics.Insets;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c f9101e = new c(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f9102a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9103b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9104c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9105d;

    public c(int i7, int i8, int i9, int i10) {
        this.f9102a = i7;
        this.f9103b = i8;
        this.f9104c = i9;
        this.f9105d = i10;
    }

    public static c a(c cVar, c cVar2) {
        return b(Math.max(cVar.f9102a, cVar2.f9102a), Math.max(cVar.f9103b, cVar2.f9103b), Math.max(cVar.f9104c, cVar2.f9104c), Math.max(cVar.f9105d, cVar2.f9105d));
    }

    public static c b(int i7, int i8, int i9, int i10) {
        return (i7 == 0 && i8 == 0 && i9 == 0 && i10 == 0) ? f9101e : new c(i7, i8, i9, i10);
    }

    public static c c(Insets insets) {
        int i7;
        int i8;
        int i9;
        int i10;
        i7 = insets.left;
        i8 = insets.top;
        i9 = insets.right;
        i10 = insets.bottom;
        return b(i7, i8, i9, i10);
    }

    public final Insets d() {
        return b.a(this.f9102a, this.f9103b, this.f9104c, this.f9105d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f9105d == cVar.f9105d && this.f9102a == cVar.f9102a && this.f9104c == cVar.f9104c && this.f9103b == cVar.f9103b;
    }

    public final int hashCode() {
        return (((((this.f9102a * 31) + this.f9103b) * 31) + this.f9104c) * 31) + this.f9105d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.f9102a);
        sb.append(", top=");
        sb.append(this.f9103b);
        sb.append(", right=");
        sb.append(this.f9104c);
        sb.append(", bottom=");
        return m.l(sb, this.f9105d, '}');
    }
}
