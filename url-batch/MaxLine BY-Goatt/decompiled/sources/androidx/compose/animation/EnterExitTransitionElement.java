package androidx.compose.animation;

import defpackage.ai0;
import defpackage.cm1;
import defpackage.fz2;
import defpackage.id;
import defpackage.uh0;
import defpackage.uj0;
import defpackage.ul1;
import defpackage.v10;
import defpackage.yh0;
import defpackage.zh0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
final class EnterExitTransitionElement extends cm1 {
    public final fz2 a;
    public final ai0 b;
    public final uj0 c;
    public final Function0 d;
    public final uh0 e;

    public EnterExitTransitionElement(fz2 fz2Var, ai0 ai0Var, uj0 uj0Var, Function0 function0, uh0 uh0Var) {
        this.a = fz2Var;
        this.b = ai0Var;
        this.c = uj0Var;
        this.d = function0;
        this.e = uh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EnterExitTransitionElement) {
            EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) obj;
            if (this.a == enterExitTransitionElement.a && this.b.equals(enterExitTransitionElement.b) && Intrinsics.b(this.c, enterExitTransitionElement.c) && Intrinsics.b(this.d, enterExitTransitionElement.d) && Intrinsics.b(this.e, enterExitTransitionElement.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.a.hashCode() + ((this.b.a.hashCode() + (this.a.hashCode() * 923521)) * 31)) * 31)) * 31);
    }

    @Override // defpackage.cm1
    public final ul1 i() {
        zh0 zh0Var = new zh0();
        zh0Var.A = this.a;
        zh0Var.B = this.c;
        zh0Var.C = this.d;
        zh0Var.D = this.e;
        zh0Var.E = id.a;
        v10.b(0, 0, 15);
        new yh0(zh0Var, 0);
        new yh0(zh0Var, 1);
        return zh0Var;
    }

    @Override // defpackage.cm1
    public final void m(ul1 ul1Var) {
        zh0 zh0Var = (zh0) ul1Var;
        zh0Var.A = this.a;
        zh0Var.B = this.c;
        zh0Var.C = this.d;
        zh0Var.D = this.e;
    }

    public final String toString() {
        return "EnterExitTransitionElement(transition=" + this.a + ", sizeAnimation=null, offsetAnimation=null, slideAnimation=null, enter=" + this.b + ", exit=" + this.c + ", isEnabled=" + this.d + ", graphicsLayerBlock=" + this.e + ')';
    }
}
