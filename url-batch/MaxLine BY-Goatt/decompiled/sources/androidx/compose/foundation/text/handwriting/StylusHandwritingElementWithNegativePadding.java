package androidx.compose.foundation.text.handwriting;

import defpackage.cm1;
import defpackage.ul1;
import defpackage.zp2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
final class StylusHandwritingElementWithNegativePadding extends cm1 {
    public final Function0 a;

    public StylusHandwritingElementWithNegativePadding(Function0 function0) {
        this.a = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StylusHandwritingElementWithNegativePadding) && Intrinsics.b(this.a, ((StylusHandwritingElementWithNegativePadding) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.cm1
    public final ul1 i() {
        return new zp2(this.a);
    }

    @Override // defpackage.cm1
    public final void m(ul1 ul1Var) {
        ((zp2) ul1Var).C = this.a;
    }

    public final String toString() {
        return "StylusHandwritingElementWithNegativePadding(onHandwritingSlopExceeded=" + this.a + ')';
    }
}
