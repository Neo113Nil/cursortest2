package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class bo0 implements cc2 {
    public final xh a;
    public final zh b;
    public final float c;
    public final ap d;
    public final float e;
    public final zn0 f;
    public final xt0 g = d9.p;
    public final xt0 h = d9.q;
    public final xt0 i = d9.r;

    public bo0(xh xhVar, zh zhVar, float f, ap apVar, float f2, zn0 zn0Var) {
        this.a = xhVar;
        this.b = zhVar;
        this.c = f;
        this.d = apVar;
        this.e = f2;
        this.f = zn0Var;
    }

    @Override // defpackage.cc2
    public final void c(int i, int[] iArr, int[] iArr2, qj1 qj1Var) {
        this.a.f(qj1Var, i, iArr, qj1Var.getLayoutDirection(), iArr2);
    }

    @Override // defpackage.cc2
    public final long d(int i, int i2, int i3, boolean z) {
        fc2 fc2Var = ec2.a;
        return !z ? v10.a(i, i2, 0, i3) : zm3.w(i, i2, 0, i3);
    }

    @Override // defpackage.cc2
    public final int e(n12 n12Var) {
        return n12Var.d0();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bo0)) {
            return false;
        }
        bo0 bo0Var = (bo0) obj;
        return this.a.equals(bo0Var.a) && this.b.equals(bo0Var.b) && pc0.a(this.c, bo0Var.c) && Intrinsics.b(this.d, bo0Var.d) && pc0.a(this.e, bo0Var.e) && Intrinsics.b(this.f, bo0Var.f);
    }

    @Override // defpackage.cc2
    public final int h(n12 n12Var) {
        return n12Var.e0();
    }

    public final int hashCode() {
        return this.f.hashCode() + q40.e(Integer.MAX_VALUE, q40.e(Integer.MAX_VALUE, q40.d(this.e, (this.d.hashCode() + q40.d(this.c, (this.b.hashCode() + ((this.a.hashCode() + (Boolean.hashCode(true) * 31)) * 31)) * 31, 31)) * 31, 31), 31), 31);
    }

    @Override // defpackage.cc2
    public final pj1 j(n12[] n12VarArr, qj1 qj1Var, int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5) {
        pj1 G;
        G = qj1Var.G(i, i2, mi1.c(), new ao0(iArr2, i3, i4, i5, n12VarArr, this, i2, qj1Var, iArr));
        return G;
    }

    public final String toString() {
        return "FlowMeasurePolicy(isHorizontal=true, horizontalArrangement=" + this.a + ", verticalArrangement=" + this.b + ", mainAxisSpacing=" + ((Object) pc0.b(this.c)) + ", crossAxisAlignment=" + this.d + ", crossAxisArrangementSpacing=" + ((Object) pc0.b(this.e)) + ", maxItemsInMainAxis=2147483647, maxLines=2147483647, overflow=" + this.f + ')';
    }
}
