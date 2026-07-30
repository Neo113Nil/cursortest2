package androidx.compose.foundation.gestures;

import defpackage.bn1;
import defpackage.cg2;
import defpackage.cm1;
import defpackage.gs1;
import defpackage.h20;
import defpackage.in1;
import defpackage.js0;
import defpackage.om0;
import defpackage.px1;
import defpackage.tf2;
import defpackage.uf2;
import defpackage.ul1;
import defpackage.vr2;
import defpackage.wp;
import defpackage.ww1;
import defpackage.yh2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
final class ScrollableElement extends cm1 {
    public final uf2 a;
    public final ww1 b;
    public final px1 c;
    public final boolean d;
    public final boolean e;
    public final om0 f;
    public final bn1 g;
    public final wp h;

    public ScrollableElement(wp wpVar, om0 om0Var, bn1 bn1Var, ww1 ww1Var, px1 px1Var, uf2 uf2Var, boolean z, boolean z2) {
        this.a = uf2Var;
        this.b = ww1Var;
        this.c = px1Var;
        this.d = z;
        this.e = z2;
        this.f = om0Var;
        this.g = bn1Var;
        this.h = wpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollableElement)) {
            return false;
        }
        ScrollableElement scrollableElement = (ScrollableElement) obj;
        return Intrinsics.b(this.a, scrollableElement.a) && this.b == scrollableElement.b && Intrinsics.b(this.c, scrollableElement.c) && this.d == scrollableElement.d && this.e == scrollableElement.e && Intrinsics.b(this.f, scrollableElement.f) && Intrinsics.b(this.g, scrollableElement.g) && Intrinsics.b(this.h, scrollableElement.h);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        px1 px1Var = this.c;
        int i = in1.i(in1.i((hashCode + (px1Var != null ? px1Var.hashCode() : 0)) * 31, 31, this.d), 31, this.e);
        om0 om0Var = this.f;
        int hashCode2 = (i + (om0Var != null ? om0Var.hashCode() : 0)) * 31;
        bn1 bn1Var = this.g;
        int hashCode3 = (hashCode2 + (bn1Var != null ? bn1Var.hashCode() : 0)) * 31;
        wp wpVar = this.h;
        return hashCode3 + (wpVar != null ? wpVar.hashCode() : 0);
    }

    @Override // defpackage.cm1
    public final ul1 i() {
        return new tf2(this.h, this.f, this.g, this.b, this.c, this.a, this.d, this.e);
    }

    @Override // defpackage.cm1
    public final void m(ul1 ul1Var) {
        boolean z;
        vr2 vr2Var;
        tf2 tf2Var = (tf2) ul1Var;
        cg2 cg2Var = tf2Var.P;
        boolean z2 = tf2Var.E;
        boolean z3 = this.d;
        boolean z4 = true;
        boolean z5 = false;
        if (z2 != z3) {
            tf2Var.Q.m = z3;
            tf2Var.N.A = z3;
            z = true;
        } else {
            z = false;
        }
        om0 om0Var = this.f;
        om0 om0Var2 = om0Var == null ? tf2Var.O : om0Var;
        js0 js0Var = tf2Var.M;
        uf2 uf2Var = cg2Var.a;
        uf2 uf2Var2 = this.a;
        if (!Intrinsics.b(uf2Var, uf2Var2)) {
            cg2Var.a = uf2Var2;
            z5 = true;
        }
        px1 px1Var = this.c;
        cg2Var.b = px1Var;
        ww1 ww1Var = cg2Var.d;
        ww1 ww1Var2 = this.b;
        if (ww1Var != ww1Var2) {
            cg2Var.d = ww1Var2;
            z5 = true;
        }
        boolean z6 = cg2Var.e;
        boolean z7 = this.e;
        if (z6 != z7) {
            cg2Var.e = z7;
            z5 = true;
        }
        cg2Var.c = om0Var2;
        cg2Var.f = js0Var;
        h20 h20Var = tf2Var.R;
        h20Var.A = ww1Var2;
        h20Var.C = z7;
        h20Var.D = this.h;
        tf2Var.K = px1Var;
        tf2Var.L = om0Var;
        gs1 gs1Var = gs1.E;
        ww1 ww1Var3 = cg2Var.d;
        ww1 ww1Var4 = ww1.m;
        if (ww1Var3 != ww1Var4) {
            ww1Var4 = ww1.n;
        }
        tf2Var.D = gs1Var;
        if (tf2Var.E != z3) {
            tf2Var.E = z3;
            if (!z3) {
                tf2Var.M0();
                vr2 vr2Var2 = tf2Var.J;
                if (vr2Var2 != null) {
                    tf2Var.H0(vr2Var2);
                }
                tf2Var.J = null;
            }
            z5 = true;
        }
        bn1 bn1Var = tf2Var.F;
        bn1 bn1Var2 = this.g;
        if (!Intrinsics.b(bn1Var, bn1Var2)) {
            tf2Var.M0();
            tf2Var.F = bn1Var2;
        }
        if (tf2Var.C != ww1Var4) {
            tf2Var.C = ww1Var4;
        } else {
            z4 = z5;
        }
        if (z4 && (vr2Var = tf2Var.J) != null) {
            vr2Var.I0();
        }
        if (z) {
            tf2Var.T = null;
            tf2Var.U = null;
            yh2.l(tf2Var);
        }
    }
}
