package androidx.compose.foundation.layout;

import defpackage.cm1;
import defpackage.lh;
import defpackage.pc0;
import defpackage.q40;
import defpackage.ul1;
import defpackage.xx1;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
final class PaddingElement extends cm1 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final Function1 e;

    public PaddingElement(float f, float f2, float f3, float f4, Function1 function1) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = function1;
        if ((f >= 0.0f || pc0.a(f, Float.NaN)) && ((f2 >= 0.0f || pc0.a(f2, Float.NaN)) && ((f3 >= 0.0f || pc0.a(f3, Float.NaN)) && (f4 >= 0.0f || pc0.a(f4, Float.NaN))))) {
            return;
        }
        lh.e("Padding must be non-negative");
        throw null;
    }

    public final boolean equals(Object obj) {
        PaddingElement paddingElement = obj instanceof PaddingElement ? (PaddingElement) obj : null;
        return paddingElement != null && pc0.a(this.a, paddingElement.a) && pc0.a(this.b, paddingElement.b) && pc0.a(this.c, paddingElement.c) && pc0.a(this.d, paddingElement.d);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + q40.d(this.d, q40.d(this.c, q40.d(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }

    @Override // defpackage.cm1
    public final ul1 i() {
        xx1 xx1Var = new xx1();
        xx1Var.A = this.a;
        xx1Var.B = this.b;
        xx1Var.C = this.c;
        xx1Var.D = this.d;
        xx1Var.E = true;
        return xx1Var;
    }

    @Override // defpackage.cm1
    public final void m(ul1 ul1Var) {
        xx1 xx1Var = (xx1) ul1Var;
        xx1Var.A = this.a;
        xx1Var.B = this.b;
        xx1Var.C = this.c;
        xx1Var.D = this.d;
        xx1Var.E = true;
    }
}
