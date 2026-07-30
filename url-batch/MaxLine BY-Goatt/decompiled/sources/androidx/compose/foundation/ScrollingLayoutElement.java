package androidx.compose.foundation;

import defpackage.cm1;
import defpackage.in1;
import defpackage.jf2;
import defpackage.ul1;
import defpackage.wf2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ScrollingLayoutElement extends cm1 {
    public final jf2 a;
    public final boolean b;

    public ScrollingLayoutElement(jf2 jf2Var, boolean z) {
        this.a = jf2Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ScrollingLayoutElement)) {
            return false;
        }
        ScrollingLayoutElement scrollingLayoutElement = (ScrollingLayoutElement) obj;
        return Intrinsics.b(this.a, scrollingLayoutElement.a) && this.b == scrollingLayoutElement.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + in1.i(this.a.hashCode() * 31, 31, false);
    }

    @Override // defpackage.cm1
    public final ul1 i() {
        wf2 wf2Var = new wf2();
        wf2Var.A = this.a;
        wf2Var.B = this.b;
        return wf2Var;
    }

    @Override // defpackage.cm1
    public final void m(ul1 ul1Var) {
        wf2 wf2Var = (wf2) ul1Var;
        wf2Var.A = this.a;
        wf2Var.B = this.b;
    }
}
