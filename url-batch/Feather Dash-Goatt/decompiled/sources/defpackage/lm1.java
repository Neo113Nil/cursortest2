package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class lm1 extends nm1 implements Iterable, yb0 {
    public final String d;
    public final float e;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public final float l;
    public final List m;
    public final List n;

    public lm1(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, ArrayList arrayList) {
        this.d = str;
        this.e = f;
        this.g = f2;
        this.h = f3;
        this.i = f4;
        this.j = f5;
        this.k = f6;
        this.l = f7;
        this.m = list;
        this.n = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof lm1)) {
            lm1 lm1Var = (lm1) obj;
            return Intrinsics.a(this.d, lm1Var.d) && this.e == lm1Var.e && this.g == lm1Var.g && this.h == lm1Var.h && this.i == lm1Var.i && this.j == lm1Var.j && this.k == lm1Var.k && this.l == lm1Var.l && Intrinsics.a(this.m, lm1Var.m) && Intrinsics.a(this.n, lm1Var.n);
        }
        return false;
    }

    public final int hashCode() {
        return this.n.hashCode() + ((this.m.hashCode() + qy0.b(this.l, qy0.b(this.k, qy0.b(this.j, qy0.b(this.i, qy0.b(this.h, qy0.b(this.g, qy0.b(this.e, this.d.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new z(this);
    }
}
