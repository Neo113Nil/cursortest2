package defpackage;

import androidx.compose.material3.a;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class mx2 extends ul1 implements a91 {
    public b41 A;
    public boolean B;
    public boolean C;
    public jc D;
    public jc E;
    public float F;
    public float G;

    @Override // defpackage.a91
    public final pj1 j(qj1 qj1Var, jj1 jj1Var, long j) {
        float f;
        pj1 G;
        int i = 0;
        int i2 = 1;
        boolean z = (jj1Var.e(u10.h(j)) == 0 || jj1Var.Y(u10.g(j)) == 0) ? false : true;
        if (this.C) {
            f = 28.0f;
        } else if (z || this.B) {
            float f2 = a.a;
            f = 24.0f;
        } else {
            float f3 = a.a;
            f = 16.0f;
        }
        float D = qj1Var.D(f);
        jc jcVar = this.E;
        int floatValue = (int) (jcVar != null ? ((Number) jcVar.d()).floatValue() : D);
        if (!((floatValue >= 0) & (floatValue >= 0))) {
            j21.a("width and height must be >= 0");
        }
        n12 c = jj1Var.c(v10.h(floatValue, floatValue, floatValue, floatValue));
        float f4 = a.a;
        float D2 = qj1Var.D((32.0f - qj1Var.r0(D)) / 2.0f);
        float f5 = a.a;
        float D3 = qj1Var.D(28.0f - 4.0f);
        boolean z2 = this.C;
        if (z2 && this.B) {
            D2 = D3 - qj1Var.D(2.0f);
        } else if (z2 && !this.B) {
            D2 = qj1Var.D(2.0f);
        } else if (this.B) {
            D2 = D3;
        }
        jc jcVar2 = this.E;
        o30 o30Var = null;
        Float f6 = jcVar2 != null ? (Float) jcVar2.e.getValue() : null;
        if (f6 == null || f6.floatValue() != D) {
            z71.H(u0(), null, new lx2(this, D, o30Var, i), 3);
        }
        jc jcVar3 = this.D;
        Float f7 = jcVar3 != null ? (Float) jcVar3.e.getValue() : null;
        if (f7 == null || f7.floatValue() != D2) {
            z71.H(u0(), null, new lx2(this, D2, o30Var, i2), 3);
        }
        if (Float.isNaN(this.G) && Float.isNaN(this.F)) {
            this.G = D;
            this.F = D2;
        }
        G = qj1Var.G(floatValue, floatValue, mi1.c(), new b9(c, this, D2));
        return G;
    }

    @Override // defpackage.ul1
    public final boolean v0() {
        return false;
    }

    @Override // defpackage.ul1
    public final void y0() {
        z71.H(u0(), null, new fj(12, (o30) null, this), 3);
    }
}
