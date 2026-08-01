package m2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final e f6445a;

    /* renamed from: b, reason: collision with root package name */
    public final h0 f6446b;

    /* renamed from: c, reason: collision with root package name */
    public final List f6447c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6448d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6449e;

    /* renamed from: f, reason: collision with root package name */
    public final int f6450f;
    public final x2.c g;

    /* renamed from: h, reason: collision with root package name */
    public final x2.l f6451h;

    /* renamed from: i, reason: collision with root package name */
    public final p2.h f6452i;
    public final long j;

    public d0(e eVar, h0 h0Var, List list, int i3, boolean z10, int i10, x2.c cVar, x2.l lVar, p2.h hVar, long j) {
        this.f6445a = eVar;
        this.f6446b = h0Var;
        this.f6447c = list;
        this.f6448d = i3;
        this.f6449e = z10;
        this.f6450f = i10;
        this.g = cVar;
        this.f6451h = lVar;
        this.f6452i = hVar;
        this.j = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return Intrinsics.a(this.f6445a, d0Var.f6445a) && Intrinsics.a(this.f6446b, d0Var.f6446b) && Intrinsics.a(this.f6447c, d0Var.f6447c) && this.f6448d == d0Var.f6448d && this.f6449e == d0Var.f6449e && this.f6450f == d0Var.f6450f && Intrinsics.a(this.g, d0Var.g) && this.f6451h == d0Var.f6451h && Intrinsics.a(this.f6452i, d0Var.f6452i) && x2.a.b(this.j, d0Var.j);
    }

    public final int hashCode() {
        return Long.hashCode(this.j) + ((this.f6452i.hashCode() + ((this.f6451h.hashCode() + ((this.g.hashCode() + v4.a.x(this.f6450f, n0.l.d((((this.f6447c.hashCode() + v4.a.f(this.f6446b, this.f6445a.hashCode() * 31, 31)) * 31) + this.f6448d) * 31, 31, this.f6449e), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextLayoutInput(text=");
        sb2.append((Object) this.f6445a);
        sb2.append(", style=");
        sb2.append(this.f6446b);
        sb2.append(", placeholders=");
        sb2.append(this.f6447c);
        sb2.append(", maxLines=");
        sb2.append(this.f6448d);
        sb2.append(", softWrap=");
        sb2.append(this.f6449e);
        sb2.append(", overflow=");
        int i3 = this.f6450f;
        sb2.append((Object) (i3 == 1 ? "Clip" : i3 == 2 ? "Ellipsis" : i3 == 5 ? "MiddleEllipsis" : i3 == 3 ? "Visible" : i3 == 4 ? "StartEllipsis" : "Invalid"));
        sb2.append(", density=");
        sb2.append(this.g);
        sb2.append(", layoutDirection=");
        sb2.append(this.f6451h);
        sb2.append(", fontFamilyResolver=");
        sb2.append(this.f6452i);
        sb2.append(", constraints=");
        sb2.append((Object) x2.a.k(this.j));
        sb2.append(')');
        return sb2.toString();
    }
}
