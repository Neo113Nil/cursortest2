package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class pm1 extends nm1 {
    public final String d;
    public final List e;
    public final int g;
    public final op h;
    public final float i;
    public final op j;
    public final float k;
    public final float l;
    public final int m;
    public final int n;
    public final float o;
    public final float p;
    public final float q;
    public final float r;

    public pm1(String str, List list, int i, op opVar, float f, op opVar2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        this.d = str;
        this.e = list;
        this.g = i;
        this.h = opVar;
        this.i = f;
        this.j = opVar2;
        this.k = f2;
        this.l = f3;
        this.m = i2;
        this.n = i3;
        this.o = f4;
        this.p = f5;
        this.q = f6;
        this.r = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pm1.class != obj.getClass()) {
            return false;
        }
        pm1 pm1Var = (pm1) obj;
        return this.d.equals(pm1Var.d) && Intrinsics.a(this.h, pm1Var.h) && this.i == pm1Var.i && Intrinsics.a(this.j, pm1Var.j) && this.k == pm1Var.k && this.l == pm1Var.l && this.m == pm1Var.m && this.n == pm1Var.n && this.o == pm1Var.o && this.p == pm1Var.p && this.q == pm1Var.q && this.r == pm1Var.r && this.g == pm1Var.g && Intrinsics.a(this.e, pm1Var.e);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + (this.d.hashCode() * 31)) * 31;
        op opVar = this.h;
        int b = qy0.b(this.i, (hashCode + (opVar != null ? opVar.hashCode() : 0)) * 31, 31);
        op opVar2 = this.j;
        return Integer.hashCode(this.g) + qy0.b(this.r, qy0.b(this.q, qy0.b(this.p, qy0.b(this.o, qy0.c(this.n, qy0.c(this.m, qy0.b(this.l, qy0.b(this.k, (b + (opVar2 != null ? opVar2.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
