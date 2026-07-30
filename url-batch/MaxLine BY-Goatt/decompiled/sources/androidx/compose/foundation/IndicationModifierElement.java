package androidx.compose.foundation;

import defpackage.b41;
import defpackage.c21;
import defpackage.cm1;
import defpackage.d21;
import defpackage.o90;
import defpackage.ul1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
final class IndicationModifierElement extends cm1 {
    public final b41 a;
    public final d21 b;

    public IndicationModifierElement(b41 b41Var, d21 d21Var) {
        this.a = b41Var;
        this.b = d21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicationModifierElement)) {
            return false;
        }
        IndicationModifierElement indicationModifierElement = (IndicationModifierElement) obj;
        return Intrinsics.b(this.a, indicationModifierElement.a) && Intrinsics.b(this.b, indicationModifierElement.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.cm1
    public final ul1 i() {
        o90 a = this.b.a(this.a);
        c21 c21Var = new c21();
        c21Var.C = a;
        c21Var.G0(a);
        return c21Var;
    }

    @Override // defpackage.cm1
    public final void m(ul1 ul1Var) {
        c21 c21Var = (c21) ul1Var;
        o90 a = this.b.a(this.a);
        c21Var.H0(c21Var.C);
        c21Var.C = a;
        c21Var.G0(a);
    }
}
