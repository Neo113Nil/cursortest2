package g4;

import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f4388a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4389b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4390c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4391d;

    /* renamed from: e, reason: collision with root package name */
    public final List f4392e;

    /* renamed from: f, reason: collision with root package name */
    public final String f4393f;

    public t0(int i7, int i8, int i9, int i10, List list, String str) {
        r6.k.f(list, "categories");
        this.f4388a = i7;
        this.f4389b = i8;
        this.f4390c = i9;
        this.f4391d = i10;
        this.f4392e = list;
        this.f4393f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return this.f4388a == t0Var.f4388a && this.f4389b == t0Var.f4389b && this.f4390c == t0Var.f4390c && this.f4391d == t0Var.f4391d && r6.k.a(this.f4392e, t0Var.f4392e) && r6.k.a(this.f4393f, t0Var.f4393f);
    }

    public final int hashCode() {
        int hashCode = (this.f4392e.hashCode() + l.h.c(this.f4391d, l.h.c(this.f4390c, l.h.c(this.f4389b, Integer.hashCode(this.f4388a) * 31, 31), 31), 31)) * 31;
        String str = this.f4393f;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "OverviewUi(mealCount=" + this.f4388a + ", filled=" + this.f4389b + ", totalSlots=" + this.f4390c + ", pendingGrocery=" + this.f4391d + ", categories=" + this.f4392e + ", topMeal=" + this.f4393f + ")";
    }
}
