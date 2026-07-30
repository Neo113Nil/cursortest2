package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class gh1 {
    public final y7 a;
    public final th1 b;
    public final List c;
    public final int d;
    public final boolean e;
    public final int f;
    public final nr g;
    public final vc0 h;
    public final v10 i;
    public final long j;

    public gh1(y7 y7Var, th1 th1Var, List list, int i, boolean z, int i2, nr nrVar, vc0 vc0Var, v10 v10Var, long j) {
        this.a = y7Var;
        this.b = th1Var;
        this.c = list;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = nrVar;
        this.h = vc0Var;
        this.i = v10Var;
        this.j = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gh1)) {
            return false;
        }
        gh1 gh1Var = (gh1) obj;
        return Intrinsics.a(this.a, gh1Var.a) && Intrinsics.a(this.b, gh1Var.b) && Intrinsics.a(this.c, gh1Var.c) && this.d == gh1Var.d && this.e == gh1Var.e && this.f == gh1Var.f && Intrinsics.a(this.g, gh1Var.g) && this.h == gh1Var.h && Intrinsics.a(this.i, gh1Var.i) && mm.b(this.j, gh1Var.j);
    }

    public final int hashCode() {
        return Long.hashCode(this.j) + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + qy0.c(this.f, qy0.d((((this.c.hashCode() + qy0.f(this.b, this.a.hashCode() * 31, 31)) * 31) + this.d) * 31, 31, this.e), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextLayoutInput(text=");
        sb.append((Object) this.a);
        sb.append(", style=");
        sb.append(this.b);
        sb.append(", placeholders=");
        sb.append(this.c);
        sb.append(", maxLines=");
        sb.append(this.d);
        sb.append(", softWrap=");
        sb.append(this.e);
        sb.append(", overflow=");
        int i = this.f;
        sb.append((Object) (i == 1 ? "Clip" : i == 2 ? "Ellipsis" : i == 5 ? "MiddleEllipsis" : i == 3 ? "Visible" : i == 4 ? "StartEllipsis" : "Invalid"));
        sb.append(", density=");
        sb.append(this.g);
        sb.append(", layoutDirection=");
        sb.append(this.h);
        sb.append(", fontFamilyResolver=");
        sb.append(this.i);
        sb.append(", constraints=");
        sb.append((Object) mm.k(this.j));
        sb.append(')');
        return sb.toString();
    }
}
