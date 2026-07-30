package androidx.compose.ui.draw;

import defpackage.cm1;
import defpackage.f6;
import defpackage.in1;
import defpackage.mo;
import defpackage.q20;
import defpackage.q40;
import defpackage.ql2;
import defpackage.ul1;
import defpackage.xy1;
import defpackage.yy1;
import defpackage.z71;
import defpackage.zm3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
final class PainterElement extends cm1 {
    public final xy1 a;
    public final f6 b;
    public final q20 c;
    public final float d;
    public final mo e;

    public PainterElement(xy1 xy1Var, f6 f6Var, q20 q20Var, float f, mo moVar) {
        this.a = xy1Var;
        this.b = f6Var;
        this.c = q20Var;
        this.d = f;
        this.e = moVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        return Intrinsics.b(this.a, painterElement.a) && Intrinsics.b(this.b, painterElement.b) && Intrinsics.b(this.c, painterElement.c) && Float.compare(this.d, painterElement.d) == 0 && Intrinsics.b(this.e, painterElement.e);
    }

    public final int hashCode() {
        int d = q40.d(this.d, (this.c.hashCode() + ((this.b.hashCode() + in1.i(this.a.hashCode() * 31, 31, true)) * 31)) * 31, 31);
        mo moVar = this.e;
        return d + (moVar == null ? 0 : moVar.hashCode());
    }

    @Override // defpackage.cm1
    public final ul1 i() {
        yy1 yy1Var = new yy1();
        yy1Var.A = this.a;
        yy1Var.B = true;
        yy1Var.C = this.b;
        yy1Var.D = this.c;
        yy1Var.E = this.d;
        yy1Var.F = this.e;
        return yy1Var;
    }

    @Override // defpackage.cm1
    public final void m(ul1 ul1Var) {
        yy1 yy1Var = (yy1) ul1Var;
        boolean z = yy1Var.B;
        xy1 xy1Var = this.a;
        boolean z2 = (z && ql2.a(yy1Var.A.h(), xy1Var.h())) ? false : true;
        yy1Var.A = xy1Var;
        yy1Var.B = true;
        yy1Var.C = this.b;
        yy1Var.D = this.c;
        yy1Var.E = this.d;
        yy1Var.F = this.e;
        if (z2) {
            zm3.C(yy1Var);
        }
        z71.F(yy1Var);
    }

    public final String toString() {
        return "PainterElement(painter=" + this.a + ", sizeToIntrinsics=true, alignment=" + this.b + ", contentScale=" + this.c + ", alpha=" + this.d + ", colorFilter=" + this.e + ')';
    }
}
