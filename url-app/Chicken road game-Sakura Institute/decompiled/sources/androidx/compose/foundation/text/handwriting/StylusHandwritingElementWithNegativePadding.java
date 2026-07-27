package androidx.compose.foundation.text.handwriting;

import S.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import r0.T;
import x.C1297c;

@Metadata
/* loaded from: classes.dex */
final class StylusHandwritingElementWithNegativePadding extends T {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f5124a;

    public StylusHandwritingElementWithNegativePadding(Function0 function0) {
        this.f5124a = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StylusHandwritingElementWithNegativePadding) && Intrinsics.a(this.f5124a, ((StylusHandwritingElementWithNegativePadding) obj).f5124a);
    }

    public final int hashCode() {
        return this.f5124a.hashCode();
    }

    @Override // r0.T
    public final n l() {
        return new C1297c(this.f5124a);
    }

    @Override // r0.T
    public final void m(n nVar) {
        ((C1297c) nVar).f11398v = this.f5124a;
    }

    public final String toString() {
        return "StylusHandwritingElementWithNegativePadding(onHandwritingSlopExceeded=" + this.f5124a + ')';
    }
}
