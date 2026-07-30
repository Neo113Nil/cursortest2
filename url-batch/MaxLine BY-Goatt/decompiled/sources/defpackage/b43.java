package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class b43 extends z33 {
    public final String m;
    public final List n;
    public final int o;
    public final cq p;
    public final float q;
    public final cq r;
    public final float s;
    public final float t;
    public final int u;
    public final int v;
    public final float w;
    public final float x;
    public final float y;
    public final float z;

    public b43(String str, List list, int i, cq cqVar, float f, cq cqVar2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        this.m = str;
        this.n = list;
        this.o = i;
        this.p = cqVar;
        this.q = f;
        this.r = cqVar2;
        this.s = f2;
        this.t = f3;
        this.u = i2;
        this.v = i3;
        this.w = f4;
        this.x = f5;
        this.y = f6;
        this.z = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b43.class != obj.getClass()) {
            return false;
        }
        b43 b43Var = (b43) obj;
        return this.m.equals(b43Var.m) && Intrinsics.b(this.p, b43Var.p) && this.q == b43Var.q && Intrinsics.b(this.r, b43Var.r) && this.s == b43Var.s && this.t == b43Var.t && this.u == b43Var.u && this.v == b43Var.v && this.w == b43Var.w && this.x == b43Var.x && this.y == b43Var.y && this.z == b43Var.z && this.o == b43Var.o && Intrinsics.b(this.n, b43Var.n);
    }

    public final int hashCode() {
        int hashCode = (this.n.hashCode() + (this.m.hashCode() * 31)) * 31;
        cq cqVar = this.p;
        int d = q40.d(this.q, (hashCode + (cqVar != null ? cqVar.hashCode() : 0)) * 31, 31);
        cq cqVar2 = this.r;
        return Integer.hashCode(this.o) + q40.d(this.z, q40.d(this.y, q40.d(this.x, q40.d(this.w, q40.e(this.v, q40.e(this.u, q40.d(this.t, q40.d(this.s, (d + (cqVar2 != null ? cqVar2.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
