package f1;

import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class l0 extends j0 {

    /* renamed from: f, reason: collision with root package name */
    public final String f3210f;

    /* renamed from: g, reason: collision with root package name */
    public final List f3211g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3212h;

    /* renamed from: i, reason: collision with root package name */
    public final z0.p f3213i;

    /* renamed from: j, reason: collision with root package name */
    public final float f3214j;

    /* renamed from: k, reason: collision with root package name */
    public final z0.p f3215k;

    /* renamed from: l, reason: collision with root package name */
    public final float f3216l;

    /* renamed from: m, reason: collision with root package name */
    public final float f3217m;

    /* renamed from: n, reason: collision with root package name */
    public final int f3218n;

    /* renamed from: o, reason: collision with root package name */
    public final int f3219o;

    /* renamed from: p, reason: collision with root package name */
    public final float f3220p;

    /* renamed from: q, reason: collision with root package name */
    public final float f3221q;

    /* renamed from: r, reason: collision with root package name */
    public final float f3222r;

    /* renamed from: s, reason: collision with root package name */
    public final float f3223s;

    public l0(String str, List list, int i7, z0.p pVar, float f9, z0.p pVar2, float f10, float f11, int i8, int i9, float f12, float f13, float f14, float f15) {
        this.f3210f = str;
        this.f3211g = list;
        this.f3212h = i7;
        this.f3213i = pVar;
        this.f3214j = f9;
        this.f3215k = pVar2;
        this.f3216l = f10;
        this.f3217m = f11;
        this.f3218n = i8;
        this.f3219o = i9;
        this.f3220p = f12;
        this.f3221q = f13;
        this.f3222r = f14;
        this.f3223s = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l0.class == obj.getClass()) {
            l0 l0Var = (l0) obj;
            return r6.k.a(this.f3210f, l0Var.f3210f) && r6.k.a(this.f3213i, l0Var.f3213i) && this.f3214j == l0Var.f3214j && r6.k.a(this.f3215k, l0Var.f3215k) && this.f3216l == l0Var.f3216l && this.f3217m == l0Var.f3217m && this.f3218n == l0Var.f3218n && this.f3219o == l0Var.f3219o && this.f3220p == l0Var.f3220p && this.f3221q == l0Var.f3221q && this.f3222r == l0Var.f3222r && this.f3223s == l0Var.f3223s && this.f3212h == l0Var.f3212h && r6.k.a(this.f3211g, l0Var.f3211g);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f3211g.hashCode() + (this.f3210f.hashCode() * 31)) * 31;
        z0.p pVar = this.f3213i;
        int a3 = a0.m.a(this.f3214j, (hashCode + (pVar != null ? pVar.hashCode() : 0)) * 31, 31);
        z0.p pVar2 = this.f3215k;
        return Integer.hashCode(this.f3212h) + a0.m.a(this.f3223s, a0.m.a(this.f3222r, a0.m.a(this.f3221q, a0.m.a(this.f3220p, l.h.c(this.f3219o, l.h.c(this.f3218n, a0.m.a(this.f3217m, a0.m.a(this.f3216l, (a3 + (pVar2 != null ? pVar2.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
