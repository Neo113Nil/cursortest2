package f1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h0 extends j0 implements Iterable, s6.a {

    /* renamed from: f, reason: collision with root package name */
    public final String f3159f;

    /* renamed from: g, reason: collision with root package name */
    public final float f3160g;

    /* renamed from: h, reason: collision with root package name */
    public final float f3161h;

    /* renamed from: i, reason: collision with root package name */
    public final float f3162i;

    /* renamed from: j, reason: collision with root package name */
    public final float f3163j;

    /* renamed from: k, reason: collision with root package name */
    public final float f3164k;

    /* renamed from: l, reason: collision with root package name */
    public final float f3165l;

    /* renamed from: m, reason: collision with root package name */
    public final float f3166m;

    /* renamed from: n, reason: collision with root package name */
    public final List f3167n;

    /* renamed from: o, reason: collision with root package name */
    public final List f3168o;

    public h0(String str, float f9, float f10, float f11, float f12, float f13, float f14, float f15, List list, ArrayList arrayList) {
        this.f3159f = str;
        this.f3160g = f9;
        this.f3161h = f10;
        this.f3162i = f11;
        this.f3163j = f12;
        this.f3164k = f13;
        this.f3165l = f14;
        this.f3166m = f15;
        this.f3167n = list;
        this.f3168o = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof h0)) {
            h0 h0Var = (h0) obj;
            return r6.k.a(this.f3159f, h0Var.f3159f) && this.f3160g == h0Var.f3160g && this.f3161h == h0Var.f3161h && this.f3162i == h0Var.f3162i && this.f3163j == h0Var.f3163j && this.f3164k == h0Var.f3164k && this.f3165l == h0Var.f3165l && this.f3166m == h0Var.f3166m && r6.k.a(this.f3167n, h0Var.f3167n) && r6.k.a(this.f3168o, h0Var.f3168o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3168o.hashCode() + ((this.f3167n.hashCode() + a0.m.a(this.f3166m, a0.m.a(this.f3165l, a0.m.a(this.f3164k, a0.m.a(this.f3163j, a0.m.a(this.f3162i, a0.m.a(this.f3161h, a0.m.a(this.f3160g, this.f3159f.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new g0(this);
    }
}
