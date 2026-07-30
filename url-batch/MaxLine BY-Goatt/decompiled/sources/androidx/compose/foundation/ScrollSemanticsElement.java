package androidx.compose.foundation;

import defpackage.cm1;
import defpackage.hf2;
import defpackage.in1;
import defpackage.jf2;
import defpackage.ul1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
final class ScrollSemanticsElement extends cm1 {
    public final jf2 a;
    public final boolean b;

    public ScrollSemanticsElement(jf2 jf2Var, boolean z) {
        this.a = jf2Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollSemanticsElement)) {
            return false;
        }
        ScrollSemanticsElement scrollSemanticsElement = (ScrollSemanticsElement) obj;
        return Intrinsics.b(this.a, scrollSemanticsElement.a) && this.b == scrollSemanticsElement.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + in1.i(in1.i(this.a.hashCode() * 31, 961, false), 31, true);
    }

    @Override // defpackage.cm1
    public final ul1 i() {
        hf2 hf2Var = new hf2();
        hf2Var.A = this.a;
        hf2Var.B = this.b;
        return hf2Var;
    }

    @Override // defpackage.cm1
    public final void m(ul1 ul1Var) {
        hf2 hf2Var = (hf2) ul1Var;
        hf2Var.A = this.a;
        hf2Var.B = this.b;
    }

    public final String toString() {
        return "ScrollSemanticsElement(state=" + this.a + ", reverseScrolling=false, flingBehavior=null, isScrollable=true, isVertical=" + this.b + ')';
    }
}
