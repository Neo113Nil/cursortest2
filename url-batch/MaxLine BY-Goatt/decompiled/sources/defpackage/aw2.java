package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class aw2 {
    public final yd a;
    public final pw2 b;
    public final List c;
    public final int d;
    public final boolean e;
    public final int f;
    public final ca0 g;
    public final u81 h;
    public final hp0 i;
    public final long j;

    public aw2(yd ydVar, pw2 pw2Var, List list, int i, boolean z, int i2, ca0 ca0Var, u81 u81Var, hp0 hp0Var, long j) {
        this.a = ydVar;
        this.b = pw2Var;
        this.c = list;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = ca0Var;
        this.h = u81Var;
        this.i = hp0Var;
        this.j = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aw2)) {
            return false;
        }
        aw2 aw2Var = (aw2) obj;
        return Intrinsics.b(this.a, aw2Var.a) && Intrinsics.b(this.b, aw2Var.b) && Intrinsics.b(this.c, aw2Var.c) && this.d == aw2Var.d && this.e == aw2Var.e && this.f == aw2Var.f && Intrinsics.b(this.g, aw2Var.g) && this.h == aw2Var.h && Intrinsics.b(this.i, aw2Var.i) && u10.b(this.j, aw2Var.j);
    }

    public final int hashCode() {
        return Long.hashCode(this.j) + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + q40.e(this.f, in1.i((((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31) + this.d) * 31, 31, this.e), 31)) * 31)) * 31)) * 31);
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
        sb.append((Object) u10.l(this.j));
        sb.append(')');
        return sb.toString();
    }
}
