package androidx.compose.foundation;

import defpackage.cm1;
import defpackage.fk2;
import defpackage.hr;
import defpackage.nn2;
import defpackage.pc0;
import defpackage.ul1;
import defpackage.xo;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class BorderModifierNodeElement extends cm1 {
    public final float a;
    public final nn2 b;
    public final fk2 c;

    public BorderModifierNodeElement(float f, nn2 nn2Var, fk2 fk2Var) {
        this.a = f;
        this.b = nn2Var;
        this.c = fk2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
        return pc0.a(this.a, borderModifierNodeElement.a) && this.b.equals(borderModifierNodeElement.b) && Intrinsics.b(this.c, borderModifierNodeElement.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31);
    }

    @Override // defpackage.cm1
    public final ul1 i() {
        return new xo(this.a, this.b, this.c);
    }

    @Override // defpackage.cm1
    public final void m(ul1 ul1Var) {
        xo xoVar = (xo) ul1Var;
        float f = xoVar.D;
        hr hrVar = xoVar.G;
        float f2 = this.a;
        if (!pc0.a(f, f2)) {
            xoVar.D = f2;
            hrVar.G0();
        }
        nn2 nn2Var = xoVar.E;
        nn2 nn2Var2 = this.b;
        if (!Intrinsics.b(nn2Var, nn2Var2)) {
            xoVar.E = nn2Var2;
            hrVar.G0();
        }
        fk2 fk2Var = xoVar.F;
        fk2 fk2Var2 = this.c;
        if (Intrinsics.b(fk2Var, fk2Var2)) {
            return;
        }
        xoVar.F = fk2Var2;
        hrVar.G0();
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) pc0.b(this.a)) + ", brush=" + this.b + ", shape=" + this.c + ')';
    }
}
